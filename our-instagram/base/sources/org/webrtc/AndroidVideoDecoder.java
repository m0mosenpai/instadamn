package org.webrtc;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25230BEn;
import X.AbstractC37300Gc1;
import X.AbstractC50522MSa;
import X.AbstractC58318PtA;
import X.AnonymousClass001;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;

/* loaded from: classes12.dex */
public class AndroidVideoDecoder implements VideoSink, VideoDecoder {
    public static final String DECODE_TIME_FIX_ENABLED = "fb-decode-time-fix-enabled";
    public static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    public static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final String MEDIA_FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    public static final String MEDIA_FORMAT_KEY_CROP_LEFT = "crop-left";
    public static final String MEDIA_FORMAT_KEY_CROP_RIGHT = "crop-right";
    public static final String MEDIA_FORMAT_KEY_CROP_TOP = "crop-top";
    public static final String MEDIA_FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    public static final String MEDIA_FORMAT_KEY_STRIDE = "stride";
    public static final String TAG = "AndroidVideoDecoder";
    public boolean adaptivePlaybackEnabled;
    public VideoDecoder.Callback callback;
    public MediaCodecWrapper codec;
    public final String codecName;
    public final VideoCodecMimeType codecType;
    public int colorFormat;
    public int configuredHeight;
    public int configuredWidth;
    public boolean decodeTimeFixEnabled;
    public ThreadUtils.ThreadChecker decoderThreadChecker;
    public final Object dimensionLock;
    public final Map extendedSettings;
    public final BlockingDeque frameInfos;
    public boolean hasDecodedFirstFrame;
    public int height;
    public boolean keyFrameRequired;
    public boolean maximumOperatingRate;
    public final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    public Thread outputThread;
    public ThreadUtils.ThreadChecker outputThreadChecker;
    public DecodedTextureMetadata renderedTextureMetadata;
    public final Object renderedTextureMetadataLock;
    public volatile boolean running;
    public final EglBase.Context sharedContext;
    public volatile Exception shutdownException;
    public int sliceHeight;
    public int stride;
    public Surface surface;
    public SurfaceTextureHelper surfaceTextureHelper;
    public int width;

    /* renamed from: org.webrtc.AndroidVideoDecoder$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class AnonymousClass1 extends Thread {
        public AnonymousClass1(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
            while (true) {
                boolean z = AndroidVideoDecoder.this.running;
                AndroidVideoDecoder androidVideoDecoder = AndroidVideoDecoder.this;
                if (z) {
                    androidVideoDecoder.deliverDecodedFrame();
                } else {
                    androidVideoDecoder.releaseCodecOnOutputThread();
                    return;
                }
            }
        }
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, int i, EglBase.Context context) {
        this(mediaCodecWrapperFactory, str, videoCodecMimeType, i, context, false, null);
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new NV12Buffer(i3, i4, i, i2, byteBuffer, null).toI420();
    }

    private void deliverByteFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        int i5;
        int i6;
        VideoFrame.Buffer copyNV12ToI420Buffer;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
            i5 = this.stride;
            i6 = this.sliceHeight;
        }
        int i7 = bufferInfo.size;
        if (i7 < ((i3 * i4) * 3) / 2) {
            boolean z = Logging.loggingEnabled;
            return;
        }
        if (i7 < ((i5 * i4) * 3) / 2 && i6 == i4 && i5 > i3) {
            i5 = (i7 * 2) / (i4 * 3);
        }
        ByteBuffer byteBuffer = this.codec.getOutputBuffers()[i];
        AbstractC50522MSa.A0v(bufferInfo, byteBuffer);
        ByteBuffer slice = byteBuffer.slice();
        if (this.colorFormat == 19) {
            copyNV12ToI420Buffer = copyI420Buffer(slice, i5, i6, i3, i4);
        } else {
            copyNV12ToI420Buffer = copyNV12ToI420Buffer(slice, i5, i6, i3, i4);
        }
        this.codec.releaseOutputBuffer(i, false);
        VideoFrame videoFrame = new VideoFrame(copyNV12ToI420Buffer, i2, bufferInfo.presentationTimeUs * 1000);
        if (this.running) {
            this.callback.onDecodedFrame(videoFrame, null, null);
        } else {
            boolean z2 = Logging.loggingEnabled;
        }
        videoFrame.release();
    }

    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        YuvHelper.nativeCopyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    /* loaded from: classes12.dex */
    public class DecodedTextureMetadata {
        public final Integer decodeTimeMs;
        public final long presentationTimestampUs;

        public DecodedTextureMetadata(long j, Integer num) {
            this.presentationTimestampUs = j;
            this.decodeTimeMs = num;
        }
    }

    /* loaded from: classes12.dex */
    public class FrameInfo {
        public final long decodeStartTimeMs;
        public final long presentationTimeUs;
        public final int rotation;

        public FrameInfo(long j, int i, long j2) {
            this.decodeStartTimeMs = j;
            this.rotation = i;
            this.presentationTimeUs = j2;
        }
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int i5;
        if (i % 2 == 0) {
            int i6 = (i3 + 1) / 2;
            int i7 = i2 % 2;
            if (i7 == 0) {
                i5 = (i4 + 1) / 2;
            } else {
                i5 = i4 / 2;
            }
            int i8 = i / 2;
            int i9 = i * i2;
            int i10 = i8 * i5;
            int i11 = i9 + i10;
            int i12 = i9 + ((i8 * i2) / 2);
            int i13 = i10 + i12;
            JavaI420Buffer allocate = JavaI420Buffer.allocate(i3, i4);
            byteBuffer.limit(i * i4);
            byteBuffer.position(0);
            YuvHelper.nativeCopyPlane(byteBuffer.slice(), i, allocate.getDataY(), allocate.getStrideY(), i3, i4);
            byteBuffer.limit(i11);
            byteBuffer.position(i9);
            int i14 = i5;
            YuvHelper.nativeCopyPlane(byteBuffer.slice(), i8, allocate.getDataU(), allocate.getStrideU(), i6, i14);
            if (i7 == 1) {
                int i15 = i9 + ((i5 - 1) * i8);
                byteBuffer.limit(i15 + i6);
                byteBuffer.position(i15);
                ByteBuffer dataU = allocate.getDataU();
                dataU.position(allocate.getStrideU() * i5);
                dataU.put(byteBuffer.slice());
            }
            byteBuffer.limit(i13);
            byteBuffer.position(i12);
            YuvHelper.nativeCopyPlane(byteBuffer.slice(), i8, allocate.getDataV(), allocate.getStrideV(), i6, i14);
            if (i7 == 1) {
                int i16 = i12 + (i8 * (i5 - 1));
                byteBuffer.limit(i6 + i16);
                byteBuffer.position(i16);
                ByteBuffer dataV = allocate.getDataV();
                dataV.position(allocate.getStrideV() * i5);
                dataV.put(byteBuffer.slice());
            }
            return allocate;
        }
        throw new AssertionError(AnonymousClass001.A0O("Stride is not divisible by two: ", i));
    }

    private Thread createOutputThread() {
        return new AnonymousClass1("AndroidVideoDecoder.outputThread");
    }

    private void deliverTextureFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        MediaCodecWrapper mediaCodecWrapper;
        boolean z;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                mediaCodecWrapper = this.codec;
                z = false;
            } else {
                this.surfaceTextureHelper.setTextureSize(i3, i4);
                this.surfaceTextureHelper.setFrameRotation(i2);
                this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
                mediaCodecWrapper = this.codec;
                z = true;
            }
            mediaCodecWrapper.releaseOutputBuffer(i, z);
        }
    }

    private VideoCodecStatus initDecodeInternal(int i, int i2) {
        this.decoderThreadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        if (this.outputThread == null) {
            this.width = i;
            this.height = i2;
            this.stride = i;
            this.sliceHeight = i2;
            this.hasDecodedFirstFrame = false;
            this.keyFrameRequired = true;
            try {
                this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
                try {
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                    if (this.sharedContext == null) {
                        createVideoFormat.setInteger("color-format", this.colorFormat);
                    }
                    Map map = this.extendedSettings;
                    if (map != null) {
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(it);
                            A1K.getKey();
                            A1K.getValue();
                            createVideoFormat.setInteger((String) A1K.getKey(), ((Integer) A1K.getValue()).intValue());
                        }
                    }
                    if (this.maximumOperatingRate) {
                        createVideoFormat.setInteger("priority", 0);
                        createVideoFormat.setInteger(AbstractC111324zv.A00(492), 32767);
                    }
                    this.codec.configure(createVideoFormat, this.surface, null, 0);
                    this.codec.start();
                    this.configuredWidth = i;
                    this.configuredHeight = i2;
                    this.running = true;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1("AndroidVideoDecoder.outputThread");
                    this.outputThread = anonymousClass1;
                    anonymousClass1.start();
                    return VideoCodecStatus.OK;
                } catch (Exception e) {
                    Logging.e(TAG, "initDecode failed", e);
                    release();
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return VideoCodecStatus.FALLBACK_SOFTWARE;
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        int i;
        this.outputThreadChecker.checkIsOnValidThread();
        mediaFormat.toString();
        boolean z = Logging.loggingEnabled;
        if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_LEFT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_RIGHT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_BOTTOM) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_TOP)) {
            integer = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_RIGHT) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_LEFT);
            integer2 = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_BOTTOM) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_TOP);
        } else {
            integer = mediaFormat.getInteger(IgReactMediaPickerNativeModule.WIDTH);
            integer2 = mediaFormat.getInteger(IgReactMediaPickerNativeModule.HEIGHT);
        }
        synchronized (this.dimensionLock) {
            if (!this.hasDecodedFirstFrame || (((i = this.width) == integer && this.height == integer2) || (this.adaptivePlaybackEnabled && this.configuredWidth >= integer && this.configuredHeight >= integer2))) {
                this.width = integer;
                this.height = integer2;
                if (this.surfaceTextureHelper == null && mediaFormat.containsKey("color-format")) {
                    int integer3 = mediaFormat.getInteger("color-format");
                    this.colorFormat = integer3;
                    if (!isSupportedColorFormat(integer3)) {
                        stopOnOutputThread(AbstractC166987dD.A14(AnonymousClass001.A0O("Unsupported color format: ", integer3)));
                        return;
                    }
                }
                synchronized (this.dimensionLock) {
                    if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_STRIDE)) {
                        this.stride = mediaFormat.getInteger(MEDIA_FORMAT_KEY_STRIDE);
                    }
                    if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_SLICE_HEIGHT)) {
                        this.sliceHeight = mediaFormat.getInteger(MEDIA_FORMAT_KEY_SLICE_HEIGHT);
                    }
                    int i2 = this.stride;
                    int i3 = this.sliceHeight;
                    this.stride = Math.max(this.width, i2);
                    this.sliceHeight = Math.max(this.height, i3);
                }
                return;
            }
            stopOnOutputThread(AbstractC166987dD.A18(new String(AnonymousClass001.A10("Unexpected size change. Configured ", "*", ". New ", "*", i, this.height, integer, integer2))));
        }
    }

    private VideoCodecStatus reinitDecode(int i, int i2) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus releaseInternal = releaseInternal();
        if (releaseInternal == VideoCodecStatus.OK) {
            return initDecodeInternal(i, i2);
        }
        return releaseInternal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.e(TAG, "Media decoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.e(TAG, "Media decoder release failed", e2);
            this.shutdownException = e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VideoCodecStatus releaseInternal() {
        if (this.outputThread == null) {
            boolean z = Logging.loggingEnabled;
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT)) {
                Logging.e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            }
            if (this.shutdownException != null) {
                Logging.e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                return VideoCodecStatus.ERROR;
            }
            this.codec = null;
            this.outputThread = null;
            return VideoCodecStatus.OK;
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int remaining;
        int i;
        int i2;
        String str;
        String str2;
        this.decoderThreadChecker.checkIsOnValidThread();
        if (this.codec != null && this.callback != null && this.running) {
            ByteBuffer byteBuffer = encodedImage.buffer;
            if (byteBuffer != null && (remaining = byteBuffer.remaining()) != 0) {
                synchronized (this.dimensionLock) {
                    i = this.width;
                    i2 = this.height;
                }
                int i3 = encodedImage.encodedWidth;
                int i4 = encodedImage.encodedHeight;
                if (i3 * i4 > 0 && (i3 != i || i4 != i2)) {
                    if (this.adaptivePlaybackEnabled && i3 <= this.configuredWidth && i4 <= this.configuredHeight) {
                        this.keyFrameRequired = true;
                        boolean z = Logging.loggingEnabled;
                    } else {
                        VideoCodecStatus reinitDecode = reinitDecode(i3, i4);
                        if (reinitDecode != VideoCodecStatus.OK) {
                            boolean z2 = Logging.loggingEnabled;
                            return reinitDecode;
                        }
                    }
                }
                if (this.keyFrameRequired && encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
                    boolean z3 = Logging.loggingEnabled;
                    return VideoCodecStatus.NO_OUTPUT;
                }
                try {
                    int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
                    if (dequeueInputBuffer >= 0) {
                        try {
                            ByteBuffer byteBuffer2 = this.codec.getInputBuffers()[dequeueInputBuffer];
                            if (byteBuffer2.capacity() >= remaining) {
                                byteBuffer2.put(encodedImage.buffer);
                                long micros = TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs);
                                this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation, micros));
                                try {
                                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, micros, 0);
                                    if (this.keyFrameRequired) {
                                        this.keyFrameRequired = false;
                                    }
                                    return VideoCodecStatus.OK;
                                } catch (IllegalStateException e) {
                                    Logging.e(TAG, "queueInputBuffer failed", e);
                                    this.frameInfos.pollLast();
                                    return VideoCodecStatus.ERROR;
                                }
                            }
                        } catch (IllegalStateException e2) {
                            e = e2;
                            str = TAG;
                            str2 = "getInputBuffers failed";
                            Logging.e(str, str2, e);
                            return VideoCodecStatus.ERROR;
                        }
                    }
                    boolean z4 = Logging.loggingEnabled;
                    return VideoCodecStatus.ERROR;
                } catch (IllegalStateException e3) {
                    e = e3;
                    str = TAG;
                    str2 = "dequeueInputBuffer failed";
                }
            } else {
                boolean z5 = Logging.loggingEnabled;
                return VideoCodecStatus.ERR_PARAMETER;
            }
        } else {
            boolean z6 = Logging.loggingEnabled;
            return VideoCodecStatus.UNINITIALIZED;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r2 = java.lang.Integer.valueOf((int) (android.os.SystemClock.elapsedRealtime() - r8.decodeStartTimeMs));
        r1 = r8.rotation;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r9.hasDecodedFirstFrame = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r9.surfaceTextureHelper == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        deliverTextureFrame(r5, r6, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        deliverByteFrame(r5, r6, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r8 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void deliverDecodedFrame() {
        /*
            r9 = this;
            java.lang.String r4 = "AndroidVideoDecoder"
            org.webrtc.ThreadUtils$ThreadChecker r0 = r9.outputThreadChecker
            r0.checkIsOnValidThread()
            android.media.MediaCodec$BufferInfo r6 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.IllegalStateException -> L67
            r6.<init>()     // Catch: java.lang.IllegalStateException -> L67
            org.webrtc.MediaCodecWrapper r2 = r9.codec     // Catch: java.lang.IllegalStateException -> L67
            r0 = 100000(0x186a0, double:4.94066E-319)
            int r5 = r2.dequeueOutputBuffer(r6, r0)     // Catch: java.lang.IllegalStateException -> L67
            r0 = -2
            if (r5 != r0) goto L22
            org.webrtc.MediaCodecWrapper r0 = r9.codec     // Catch: java.lang.IllegalStateException -> L67
            android.media.MediaFormat r0 = r0.getOutputFormat()     // Catch: java.lang.IllegalStateException -> L67
            r9.reformat(r0)     // Catch: java.lang.IllegalStateException -> L67
            return
        L22:
            if (r5 >= 0) goto L27
            boolean r0 = org.webrtc.Logging.loggingEnabled     // Catch: java.lang.IllegalStateException -> L67
            return
        L27:
            java.util.concurrent.BlockingDeque r0 = r9.frameInfos     // Catch: java.lang.IllegalStateException -> L67
            java.lang.Object r8 = r0.poll()     // Catch: java.lang.IllegalStateException -> L67
            org.webrtc.AndroidVideoDecoder$FrameInfo r8 = (org.webrtc.AndroidVideoDecoder.FrameInfo) r8     // Catch: java.lang.IllegalStateException -> L67
            boolean r0 = r9.decodeTimeFixEnabled     // Catch: java.lang.IllegalStateException -> L67
            if (r0 == 0) goto L46
        L33:
            if (r8 == 0) goto L46
            long r2 = r8.presentationTimeUs     // Catch: java.lang.IllegalStateException -> L67
            long r0 = r6.presentationTimeUs     // Catch: java.lang.IllegalStateException -> L67
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L4a
            java.util.concurrent.BlockingDeque r0 = r9.frameInfos     // Catch: java.lang.IllegalStateException -> L67
            java.lang.Object r8 = r0.poll()     // Catch: java.lang.IllegalStateException -> L67
            org.webrtc.AndroidVideoDecoder$FrameInfo r8 = (org.webrtc.AndroidVideoDecoder.FrameInfo) r8     // Catch: java.lang.IllegalStateException -> L67
            goto L33
        L46:
            r2 = 0
            r1 = 0
            if (r8 == 0) goto L58
        L4a:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.IllegalStateException -> L67
            long r0 = r8.decodeStartTimeMs     // Catch: java.lang.IllegalStateException -> L67
            long r2 = r2 - r0
            int r0 = (int) r2     // Catch: java.lang.IllegalStateException -> L67
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.IllegalStateException -> L67
            int r1 = r8.rotation     // Catch: java.lang.IllegalStateException -> L67
        L58:
            r0 = 1
            r9.hasDecodedFirstFrame = r0     // Catch: java.lang.IllegalStateException -> L67
            org.webrtc.SurfaceTextureHelper r0 = r9.surfaceTextureHelper     // Catch: java.lang.IllegalStateException -> L67
            if (r0 == 0) goto L63
            r9.deliverTextureFrame(r5, r6, r1, r2)     // Catch: java.lang.IllegalStateException -> L67
            return
        L63:
            r9.deliverByteFrame(r5, r6, r1, r2)     // Catch: java.lang.IllegalStateException -> L67
            return
        L67:
            r1 = move-exception
            java.lang.String r0 = "deliverDecodedFrame failed"
            org.webrtc.Logging.e(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.deliverDecodedFrame():void");
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        boolean z = Logging.loggingEnabled;
        this.callback = callback;
        if (this.sharedContext != null) {
            SurfaceTextureHelper createSurfaceTextureHelper = createSurfaceTextureHelper();
            this.surfaceTextureHelper = createSurfaceTextureHelper;
            this.surface = new Surface(createSurfaceTextureHelper.surfaceTexture);
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata != null) {
                j = decodedTextureMetadata.presentationTimestampUs * 1000;
                num = decodedTextureMetadata.decodeTimeMs;
                this.renderedTextureMetadata = null;
            } else {
                throw AbstractC166987dD.A14("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
        }
        VideoFrame videoFrame2 = new VideoFrame(videoFrame.buffer, videoFrame.rotation, j);
        if (this.running) {
            this.callback.onDecodedFrame(videoFrame2, num, null);
        } else {
            boolean z = Logging.loggingEnabled;
        }
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        boolean z = Logging.loggingEnabled;
        VideoCodecStatus releaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return releaseInternal;
    }

    public void releaseSurface() {
        this.surface.release();
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i, int i2) {
        return JavaI420Buffer.allocate(i, i2);
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoDecoder
    public /* synthetic */ long createNative(long j) {
        return 0L;
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, int i, EglBase.Context context, boolean z, Map map) {
        this.dimensionLock = AbstractC58318PtA.A0b();
        this.renderedTextureMetadataLock = AbstractC58318PtA.A0b();
        if (isSupportedColorFormat(i)) {
            boolean z2 = Logging.loggingEnabled;
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
            this.codecName = str;
            this.codecType = videoCodecMimeType;
            this.colorFormat = i;
            this.sharedContext = context;
            this.frameInfos = new LinkedBlockingDeque();
            this.extendedSettings = map;
            boolean z3 = false;
            this.decodeTimeFixEnabled = false;
            if (map != null) {
                Number A0Q = AbstractC37300Gc1.A0Q(DECODE_TIME_FIX_ENABLED, map);
                if (A0Q != null) {
                    this.decodeTimeFixEnabled = AbstractC167007dF.A1P(A0Q.intValue(), 1);
                }
                Number A0Q2 = AbstractC37300Gc1.A0Q(MediaCodecUtils.ADAPTIVE_PLAYBACK_ENABLED, map);
                if (AbstractC166987dD.A0H(map.getOrDefault(MediaCodecUtils.MAXIMUM_OPERATING_RATE, 0)) == 1) {
                    this.maximumOperatingRate = true;
                }
                if (A0Q2 != null) {
                    if (z && A0Q2.intValue() == 1 && context != null) {
                        z3 = true;
                    }
                    this.adaptivePlaybackEnabled = z3;
                    return;
                }
                return;
            }
            return;
        }
        throw AbstractC25230BEn.A0n("Unsupported color format: ", i);
    }
}
