package org.webrtc;

import X.AbstractC25230BEn;
import X.AbstractC58318PtA;
import X.MSV;
import android.media.MediaCodec;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import com.facebook.common.dextricks.Constants;
import com.facebook.proxygen.LigerSamplePolicy;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;

/* loaded from: classes12.dex */
public class HardwareVideoEncoder implements VideoEncoder {
    public static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    public static final String KEY_BITRATE_MODE = "bitrate-mode";
    public static final int MAX_ENCODER_Q_SIZE = 2;
    public static final int MAX_VIDEO_FRAMERATE = 30;
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final int REQUIRED_RESOLUTION_ALIGNMENT = 16;
    public static final String TAG = "HardwareVideoEncoder";
    public static final int VIDEO_AVC_LEVEL_3 = 256;
    public static final int VIDEO_AVC_LEVEL_41 = 4096;
    public static final int VIDEO_AVC_PROFILE_HIGH = 8;
    public static final int VIDEO_ControlRateConstant = 2;
    public int adjustedBitrate;
    public boolean automaticResizeOn;
    public final BitrateAdjuster bitrateAdjuster;
    public VideoEncoder.Callback callback;
    public MediaCodecWrapper codec;
    public final String codecName;
    public final VideoCodecMimeType codecType;
    public ByteBuffer configBuffer;
    public boolean eglMakeCurrentOnEncodeEnabled;
    public final ThreadUtils.ThreadChecker encodeThreadChecker;
    public final long forcedKeyFrameNs;
    public int height;
    public final int keyFrameIntervalSec;
    public long lastKeyFrameNs;
    public final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    public ByteBuffer[] outputBuffers;
    public final BusyCount outputBuffersBusyCount;
    public Thread outputThread;
    public final ThreadUtils.ThreadChecker outputThreadChecker;
    public final Map params;
    public boolean rescalingEnabled;
    public volatile boolean running;
    public final EglBase14.Context sharedContext;
    public volatile Exception shutdownException;
    public final Integer surfaceColorFormat;
    public EglBase14 textureEglBase;
    public Surface textureInputSurface;
    public boolean useSurfaceMode;
    public int width;
    public final Integer yuvColorFormat;
    public final YuvFormat yuvFormat;
    public final GlRectDrawer textureDrawer = new GlRectDrawer();
    public final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    public final BlockingDeque outputBuilders = new LinkedBlockingDeque();

    /* renamed from: org.webrtc.HardwareVideoEncoder$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class AnonymousClass1 extends Thread {
        public AnonymousClass1(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                boolean z = HardwareVideoEncoder.this.running;
                HardwareVideoEncoder hardwareVideoEncoder = HardwareVideoEncoder.this;
                if (z) {
                    hardwareVideoEncoder.deliverEncodedImage();
                } else {
                    hardwareVideoEncoder.releaseCodecOnOutputThread();
                    return;
                }
            }
        }
    }

    /* loaded from: classes12.dex */
    public class BusyCount {
        public int count;
        public final Object countLock;

        public void decrement() {
            synchronized (this.countLock) {
                int i = this.count - 1;
                this.count = i;
                if (i == 0) {
                    this.countLock.notifyAll();
                }
            }
        }

        public void increment() {
            synchronized (this.countLock) {
                this.count++;
            }
        }

        public void waitForZero() {
            boolean z;
            synchronized (this.countLock) {
                z = false;
                while (this.count > 0) {
                    try {
                        this.countLock.wait();
                    } catch (InterruptedException e) {
                        Logging.e(HardwareVideoEncoder.TAG, "Interrupted while waiting on busy count", e);
                        z = true;
                    }
                }
            }
            if (z) {
                AbstractC58318PtA.A18();
            }
        }

        public /* synthetic */ BusyCount(AnonymousClass1 anonymousClass1) {
            this();
        }

        public BusyCount() {
            this.countLock = AbstractC58318PtA.A0b();
        }
    }

    /* loaded from: classes11.dex */
    public enum YuvFormat {
        I420 { // from class: org.webrtc.HardwareVideoEncoder.YuvFormat.1
            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        NV12 { // from class: org.webrtc.HardwareVideoEncoder.YuvFormat.2
            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };

        public abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer);

        public static YuvFormat valueOf(int i) {
            if (i != 19) {
                if (i != 21 && i != 2141391872 && i != 2141391876) {
                    throw AbstractC25230BEn.A0n("Unsupported colorFormat: ", i);
                }
                return NV12;
            }
            return I420;
        }

        /* synthetic */ YuvFormat(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Override // org.webrtc.VideoEncoder
    public /* synthetic */ VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return new VideoEncoder.ResolutionBitrateLimits[0];
    }

    private boolean canUseSurface() {
        if (this.sharedContext != null && this.surfaceColorFormat != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        if (r0 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.webrtc.VideoCodecStatus initEncodeInternal() {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.initEncodeInternal():org.webrtc.VideoCodecStatus");
    }

    private VideoCodecStatus maybeCloseOutputThread() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread != null) {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT)) {
                boolean z = Logging.loggingEnabled;
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            }
            this.outputThread = null;
            return videoCodecStatus;
        }
        videoCodecStatus = VideoCodecStatus.OK;
        this.outputThread = null;
        return videoCodecStatus;
    }

    private VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release == VideoCodecStatus.OK) {
            this.width = i;
            this.height = i2;
            this.useSurfaceMode = z;
            return initEncodeInternal();
        }
        return release;
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(MSV.A00(1708), this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "updateBitrate failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    public void configureMediaCodecInput() {
        if (this.useSurfaceMode) {
            this.textureEglBase = EglBase.CC.createEgl14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
            Surface createInputSurface = this.codec.createInputSurface();
            this.textureInputSurface = createInputSurface;
            this.textureEglBase.createSurface(createInputSurface);
            if (!this.eglMakeCurrentOnEncodeEnabled) {
                this.textureEglBase.makeCurrent();
            }
        }
    }

    public Thread createOutputThread() {
        return new AnonymousClass1("hwVidEncOut");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[Catch: IllegalStateException -> 0x00a2, TryCatch #0 {IllegalStateException -> 0x00a2, blocks: (B:3:0x0007, B:7:0x001a, B:11:0x0028, B:13:0x0035, B:15:0x0043, B:17:0x0054, B:18:0x0057, B:20:0x005e, B:22:0x0069, B:24:0x0095, B:26:0x008a, B:27:0x008c, B:29:0x0090, B:31:0x009f, B:33:0x009b, B:34:0x006d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: IllegalStateException -> 0x00a2, TryCatch #0 {IllegalStateException -> 0x00a2, blocks: (B:3:0x0007, B:7:0x001a, B:11:0x0028, B:13:0x0035, B:15:0x0043, B:17:0x0054, B:18:0x0057, B:20:0x005e, B:22:0x0069, B:24:0x0095, B:26:0x008a, B:27:0x008c, B:29:0x0090, B:31:0x009f, B:33:0x009b, B:34:0x006d), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void deliverEncodedImage() {
        /*
            r8 = this;
            java.lang.String r3 = "HardwareVideoEncoder"
            org.webrtc.ThreadUtils$ThreadChecker r0 = r8.outputThreadChecker
            r0.checkIsOnValidThread()
            android.media.MediaCodec$BufferInfo r5 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.IllegalStateException -> La2
            r5.<init>()     // Catch: java.lang.IllegalStateException -> La2
            org.webrtc.MediaCodecWrapper r2 = r8.codec     // Catch: java.lang.IllegalStateException -> La2
            r0 = 100000(0x186a0, double:4.94066E-319)
            int r4 = r2.dequeueOutputBuffer(r5, r0)     // Catch: java.lang.IllegalStateException -> La2
            if (r4 >= 0) goto L28
            r0 = -3
            if (r4 != r0) goto La8
            org.webrtc.HardwareVideoEncoder$BusyCount r0 = r8.outputBuffersBusyCount     // Catch: java.lang.IllegalStateException -> La2
            r0.waitForZero()     // Catch: java.lang.IllegalStateException -> La2
            org.webrtc.MediaCodecWrapper r0 = r8.codec     // Catch: java.lang.IllegalStateException -> La2
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch: java.lang.IllegalStateException -> La2
            r8.outputBuffers = r0     // Catch: java.lang.IllegalStateException -> La2
            return
        L28:
            java.nio.ByteBuffer[] r0 = r8.outputBuffers     // Catch: java.lang.IllegalStateException -> La2
            r6 = r0[r4]     // Catch: java.lang.IllegalStateException -> La2
            X.AbstractC50522MSa.A0v(r5, r6)     // Catch: java.lang.IllegalStateException -> La2
            int r0 = r5.flags     // Catch: java.lang.IllegalStateException -> La2
            r0 = r0 & 2
            if (r0 == 0) goto L43
            int r1 = r5.size     // Catch: java.lang.IllegalStateException -> La2
            boolean r0 = org.webrtc.Logging.loggingEnabled     // Catch: java.lang.IllegalStateException -> La2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch: java.lang.IllegalStateException -> La2
            r8.configBuffer = r0     // Catch: java.lang.IllegalStateException -> La2
            r0.put(r6)     // Catch: java.lang.IllegalStateException -> La2
            return
        L43:
            org.webrtc.BitrateAdjuster r1 = r8.bitrateAdjuster     // Catch: java.lang.IllegalStateException -> La2
            int r0 = r5.size     // Catch: java.lang.IllegalStateException -> La2
            r1.reportEncodedFrame(r0)     // Catch: java.lang.IllegalStateException -> La2
            int r1 = r8.adjustedBitrate     // Catch: java.lang.IllegalStateException -> La2
            org.webrtc.BitrateAdjuster r0 = r8.bitrateAdjuster     // Catch: java.lang.IllegalStateException -> La2
            int r0 = r0.getAdjustedBitrateBps()     // Catch: java.lang.IllegalStateException -> La2
            if (r1 == r0) goto L57
            r8.updateBitrate()     // Catch: java.lang.IllegalStateException -> La2
        L57:
            int r0 = r5.flags     // Catch: java.lang.IllegalStateException -> La2
            r7 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L94
            r8.hashCode()     // Catch: java.lang.IllegalStateException -> La2
            boolean r0 = org.webrtc.Logging.loggingEnabled     // Catch: java.lang.IllegalStateException -> La2
            org.webrtc.VideoCodecMimeType r1 = r8.codecType     // Catch: java.lang.IllegalStateException -> La2
            org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.H264     // Catch: java.lang.IllegalStateException -> La2
            if (r1 == r0) goto L6d
            org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.H265     // Catch: java.lang.IllegalStateException -> La2
            if (r1 != r0) goto L95
        L6d:
            int r1 = r5.size     // Catch: java.lang.IllegalStateException -> La2
            java.nio.ByteBuffer r0 = r8.configBuffer     // Catch: java.lang.IllegalStateException -> La2
            int r0 = r0.capacity()     // Catch: java.lang.IllegalStateException -> La2
            int r1 = r1 + r0
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch: java.lang.IllegalStateException -> La2
            java.nio.ByteBuffer r0 = r8.configBuffer     // Catch: java.lang.IllegalStateException -> La2
            r0.rewind()     // Catch: java.lang.IllegalStateException -> La2
            java.nio.ByteBuffer r0 = r8.configBuffer     // Catch: java.lang.IllegalStateException -> La2
            r2.put(r0)     // Catch: java.lang.IllegalStateException -> La2
            r2.put(r6)     // Catch: java.lang.IllegalStateException -> La2
            r2.rewind()     // Catch: java.lang.IllegalStateException -> La2
        L8a:
            org.webrtc.EncodedImage$FrameType r1 = org.webrtc.EncodedImage.FrameType.VideoFrameKey     // Catch: java.lang.IllegalStateException -> La2
        L8c:
            boolean r0 = r8.running     // Catch: java.lang.IllegalStateException -> La2
            if (r0 == 0) goto L9f
            r8.sendEncodedFrame(r1, r2, r4, r5)     // Catch: java.lang.IllegalStateException -> La2
            goto L9e
        L94:
            r7 = 0
        L95:
            java.nio.ByteBuffer r2 = r6.slice()     // Catch: java.lang.IllegalStateException -> La2
            if (r7 != 0) goto L8a
            org.webrtc.EncodedImage$FrameType r1 = org.webrtc.EncodedImage.FrameType.VideoFrameDelta     // Catch: java.lang.IllegalStateException -> La2
            goto L8c
        L9e:
            return
        L9f:
            boolean r0 = org.webrtc.Logging.loggingEnabled     // Catch: java.lang.IllegalStateException -> La2
            return
        La2:
            r1 = move-exception
            java.lang.String r0 = "deliverOutput failed"
            org.webrtc.Logging.e(r3, r0, r1)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.deliverEncodedImage():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (r3 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009a, code lost:
    
        if (r3 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Type inference failed for: r2v1, types: [org.webrtc.EncodedImage$Builder, java.lang.Object] */
    @Override // org.webrtc.VideoEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.webrtc.VideoCodecStatus encode(org.webrtc.VideoFrame r15, org.webrtc.VideoEncoder.EncodeInfo r16) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.encode(org.webrtc.VideoFrame, org.webrtc.VideoEncoder$EncodeInfo):org.webrtc.VideoCodecStatus");
    }

    public VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, VideoFrame.Buffer buffer, int i) {
        String str;
        this.encodeThreadChecker.checkIsOnValidThread();
        long j = (videoFrame.timestampNs + 500) / 1000;
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (dequeueInputBuffer == -1) {
                boolean z = Logging.loggingEnabled;
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffers()[dequeueInputBuffer], buffer);
            } catch (IllegalStateException e) {
                e = e;
                str = "getInputBuffers failed";
            }
            try {
                this.codec.queueInputBuffer(dequeueInputBuffer, 0, i, j, 0);
                return VideoCodecStatus.OK;
            } catch (IllegalStateException e2) {
                e = e2;
                str = "queueInputBuffer failed";
                Logging.e(TAG, str, e);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e3) {
            e = e3;
            str = "dequeueInputBuffer failed";
        }
    }

    public VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            if (this.eglMakeCurrentOnEncodeEnabled) {
                this.textureEglBase.makeCurrent();
            }
            GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.buffer, 0, videoFrame.timestampNs), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(videoFrame.timestampNs);
            return VideoCodecStatus.OK;
        } catch (RuntimeException e) {
            Logging.e(TAG, "encodeTexture failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer);
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(16, false);
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        int i;
        int i2;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                i = 29;
                i2 = 95;
            } else if (videoCodecMimeType == VideoCodecMimeType.H264) {
                i = 24;
                i2 = 37;
            }
            return new VideoEncoder.ScalingSettings(i, i2);
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        int i;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        this.width = settings.width;
        this.height = settings.height;
        this.useSurfaceMode = canUseSurface();
        int i2 = settings.startBitrate;
        if (i2 != 0 && (i = settings.maxFramerate) != 0) {
            this.bitrateAdjuster.setTargets(i2 * 1000, i);
        }
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        hashCode();
        boolean z = Logging.loggingEnabled;
        return initEncodeInternal();
    }

    public boolean isRoiInfoSupported() {
        if (this.codecName.startsWith(MediaCodecUtils.QCOM_PREFIX) && this.codecType == VideoCodecMimeType.H265) {
            return true;
        }
        return false;
    }

    /* renamed from: lambda$sendEncodedFrame$0$org-webrtc-HardwareVideoEncoder, reason: not valid java name */
    public /* synthetic */ void m123lambda$sendEncodedFrame$0$orgwebrtcHardwareVideoEncoder(int i) {
        try {
            this.codec.releaseOutputBuffer(i, false);
        } catch (Exception e) {
            Logging.e(TAG, "releaseOutputBuffer failed", e);
        }
        this.outputBuffersBusyCount.decrement();
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus release() {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus maybeCloseOutputThread = maybeCloseOutputThread();
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputBuffers = null;
        this.encodeThreadChecker.thread = null;
        return maybeCloseOutputThread;
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        hashCode();
        boolean z = Logging.loggingEnabled;
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.e(TAG, "Media encoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.e(TAG, "Media encoder release failed", e2);
            this.shutdownException = e2;
        }
        this.configBuffer = null;
        hashCode();
    }

    public void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(MSV.A00(1547), 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "requestKeyFrame failed", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, org.webrtc.VideoEncoder$CodecSpecificInfo] */
    public void sendEncodedFrame(EncodedImage.FrameType frameType, ByteBuffer byteBuffer, final int i, MediaCodec.BufferInfo bufferInfo) {
        this.outputBuffersBusyCount.increment();
        EncodedImage.Builder builder = (EncodedImage.Builder) this.outputBuilders.poll();
        builder.setBuffer(byteBuffer, new Runnable() { // from class: org.webrtc.HardwareVideoEncoder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                HardwareVideoEncoder.this.m123lambda$sendEncodedFrame$0$orgwebrtcHardwareVideoEncoder(i);
            }
        });
        builder.frameType = frameType;
        EncodedImage createEncodedImage = builder.createEncodedImage();
        this.callback.onEncodedFrame(createEncodedImage, new Object());
        createEncodedImage.release();
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i > 30) {
            i = 30;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), i);
        return VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return VideoCodecStatus.OK;
    }

    public boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j2 = this.forcedKeyFrameNs;
        if (j2 > 0 && j > this.lastKeyFrameNs + j2) {
            return true;
        }
        return false;
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, Integer num, Integer num2, Map map, int i, int i2, BitrateAdjuster bitrateAdjuster, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.outputBuffersBusyCount = new BusyCount();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.params = map;
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i2);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        threadChecker.thread = null;
    }

    @Override // org.webrtc.VideoEncoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoEncoder
    public /* synthetic */ boolean isHardwareEncoder() {
        return true;
    }

    @Override // org.webrtc.VideoEncoder
    public /* synthetic */ long createNative(long j) {
        return 0L;
    }
}
