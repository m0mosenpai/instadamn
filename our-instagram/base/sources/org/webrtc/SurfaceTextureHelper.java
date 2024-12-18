package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC25230BEn;
import X.AbstractC65702TsY;
import X.AbstractC72046XLm;
import X.AnonymousClass001;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;

/* loaded from: classes12.dex */
public class SurfaceTextureHelper {
    public static final String TAG = "SurfaceTextureHelper";
    public final EglBase eglBase;
    public final FrameRefMonitor frameRefMonitor;
    public int frameRotation;
    public final Handler handler;
    public boolean hasPendingTexture;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    public VideoSink listener;
    public final int oesTextureId;
    public VideoSink pendingListener;
    public final Runnable setListenerRunnable;
    public final SurfaceTexture surfaceTexture;
    public int textureHeight;
    public final TextureBufferImpl.RefCountMonitor textureRefCountMonitor;
    public int textureWidth;
    public final TimestampAligner timestampAligner;
    public final YuvConverter yuvConverter;

    /* loaded from: classes12.dex */
    public interface FrameRefMonitor {
        void onDestroyBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onNewBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onReleaseBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onRetainBuffer(VideoFrame.TextureBuffer textureBuffer);
    }

    /* renamed from: lambda$dispose$5$org-webrtc-SurfaceTextureHelper, reason: not valid java name */
    public /* synthetic */ void m128lambda$dispose$5$orgwebrtcSurfaceTextureHelper() {
        this.isQuitting = true;
        if (!this.isTextureInUse) {
            release();
        }
    }

    /* renamed from: lambda$new$0$org-webrtc-SurfaceTextureHelper, reason: not valid java name */
    public /* synthetic */ void m129lambda$new$0$orgwebrtcSurfaceTextureHelper(SurfaceTexture surfaceTexture) {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    /* renamed from: lambda$returnTextureFrame$4$org-webrtc-SurfaceTextureHelper, reason: not valid java name */
    public /* synthetic */ void m130lambda$returnTextureFrame$4$orgwebrtcSurfaceTextureHelper() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    /* renamed from: lambda$stopListening$1$org-webrtc-SurfaceTextureHelper, reason: not valid java name */
    public /* synthetic */ void m133lambda$stopListening$1$orgwebrtcSurfaceTextureHelper() {
        this.listener = null;
        this.pendingListener = null;
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false, new YuvConverter(), null);
    }

    private void release() {
        if (AbstractC72046XLm.A0b(this.handler) == Thread.currentThread()) {
            if (!this.isTextureInUse && this.isQuitting) {
                this.yuvConverter.release();
                GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
                this.surfaceTexture.release();
                this.eglBase.release();
                this.handler.getLooper().quit();
                TimestampAligner timestampAligner = this.timestampAligner;
                if (timestampAligner != null) {
                    timestampAligner.dispose();
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Unexpected release.");
        }
        throw AbstractC166987dD.A14("Wrong thread.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.m130lambda$returnTextureFrame$4$orgwebrtcSurfaceTextureHelper();
            }
        });
    }

    private void tryDeliverTextureFrame() {
        if (AbstractC72046XLm.A0b(this.handler) == Thread.currentThread()) {
            if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
                if (this.textureWidth != 0 && this.textureHeight != 0) {
                    this.isTextureInUse = true;
                    this.hasPendingTexture = false;
                    updateTexImage();
                    float[] fArr = new float[16];
                    this.surfaceTexture.getTransformMatrix(fArr);
                    long timestamp = this.surfaceTexture.getTimestamp();
                    TimestampAligner timestampAligner = this.timestampAligner;
                    if (timestampAligner != null) {
                        timestamp = timestampAligner.translateTimestamp(timestamp);
                    }
                    TextureBufferImpl textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, this.textureRefCountMonitor);
                    FrameRefMonitor frameRefMonitor = this.frameRefMonitor;
                    if (frameRefMonitor != null) {
                        frameRefMonitor.onNewBuffer(textureBufferImpl);
                    }
                    VideoFrame videoFrame = new VideoFrame(textureBufferImpl, this.frameRotation, timestamp);
                    this.listener.onFrame(videoFrame);
                    videoFrame.release();
                    return;
                }
                boolean z = Logging.loggingEnabled;
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("Wrong thread.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public void dispose() {
        boolean z = Logging.loggingEnabled;
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.m128lambda$dispose$5$orgwebrtcSurfaceTextureHelper();
            }
        });
    }

    /* renamed from: lambda$setTextureSizeWithRotation$2$org-webrtc-SurfaceTextureHelper, reason: not valid java name */
    public /* synthetic */ void m132x68a0ce98(int i, int i2, int i3) {
        this.textureWidth = i;
        this.textureHeight = i2;
        this.frameRotation = i3;
        tryDeliverTextureFrame();
    }

    public void setFrameRotation(final int i) {
        this.handler.post(new Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.frameRotation = i;
            }
        });
    }

    public void setTextureSize(int i, int i2) {
        setTextureSizeWithRotation(i, i2, this.frameRotation);
    }

    public void setTextureSizeWithRotation(final int i, final int i2, final int i3) {
        if (i > 0) {
            if (i2 > 0) {
                this.surfaceTexture.setDefaultBufferSize(i, i2);
                this.handler.post(new Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceTextureHelper.this.m132x68a0ce98(i, i2, i3);
                    }
                });
                return;
            }
            throw AbstractC25230BEn.A0n("Texture height must be positive, but was ", i2);
        }
        throw AbstractC25230BEn.A0n("Texture width must be positive, but was ", i);
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
            return;
        }
        throw AbstractC166987dD.A14("SurfaceTextureHelper listener has already been set.");
    }

    public void stopListening() {
        boolean z = Logging.loggingEnabled;
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.m133lambda$stopListening$1$orgwebrtcSurfaceTextureHelper();
            }
        });
    }

    public SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, YuvConverter yuvConverter, FrameRefMonitor frameRefMonitor) {
        TimestampAligner timestampAligner;
        this.textureRefCountMonitor = new TextureBufferImpl.RefCountMonitor() { // from class: org.webrtc.SurfaceTextureHelper.2
            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                SurfaceTextureHelper.this.returnTextureFrame();
                FrameRefMonitor frameRefMonitor2 = SurfaceTextureHelper.this.frameRefMonitor;
                if (frameRefMonitor2 != null) {
                    frameRefMonitor2.onDestroyBuffer(textureBufferImpl);
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(TextureBufferImpl textureBufferImpl) {
                FrameRefMonitor frameRefMonitor2 = SurfaceTextureHelper.this.frameRefMonitor;
                if (frameRefMonitor2 != null) {
                    frameRefMonitor2.onReleaseBuffer(textureBufferImpl);
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(TextureBufferImpl textureBufferImpl) {
                FrameRefMonitor frameRefMonitor2 = SurfaceTextureHelper.this.frameRefMonitor;
                if (frameRefMonitor2 != null) {
                    frameRefMonitor2.onRetainBuffer(textureBufferImpl);
                }
            }
        };
        this.setListenerRunnable = new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                boolean z2 = Logging.loggingEnabled;
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                surfaceTextureHelper.pendingListener = null;
                if (surfaceTextureHelper.hasPendingTexture) {
                    surfaceTextureHelper.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        if (AbstractC72046XLm.A0b(handler) == Thread.currentThread()) {
            this.handler = handler;
            if (z) {
                timestampAligner = new TimestampAligner();
            } else {
                timestampAligner = null;
            }
            this.timestampAligner = timestampAligner;
            this.yuvConverter = yuvConverter;
            this.frameRefMonitor = frameRefMonitor;
            EglBase create = EglBase.CC.create(context, EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = create;
            try {
                create.createDummyPbufferSurface();
                create.makeCurrent();
                int generateTexture = GlUtil.generateTexture(36197);
                this.oesTextureId = generateTexture;
                SurfaceTexture surfaceTexture = new SurfaceTexture(generateTexture);
                this.surfaceTexture = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.webrtc.SurfaceTextureHelper$$ExternalSyntheticLambda4
                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                        SurfaceTextureHelper.this.m129lambda$new$0$orgwebrtcSurfaceTextureHelper(surfaceTexture2);
                    }
                }, handler);
                return;
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        }
        throw AbstractC166987dD.A14("SurfaceTextureHelper must be created on the handler thread");
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    /* renamed from: lambda$setFrameRotation$3$org-webrtc-SurfaceTextureHelper, reason: not valid java name */
    public /* synthetic */ void m131lambda$setFrameRotation$3$orgwebrtcSurfaceTextureHelper(int i) {
        this.frameRotation = i;
    }

    public static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z) {
        return create(str, context, z, new YuvConverter(), null);
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context, final boolean z, final YuvConverter yuvConverter, final FrameRefMonitor frameRefMonitor) {
        final Handler handler = new Handler(AbstractC65702TsY.A0G(str));
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: org.webrtc.SurfaceTextureHelper.1
            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(EglBase.Context.this, handler, z, yuvConverter, frameRefMonitor);
                } catch (RuntimeException e) {
                    Logging.e(SurfaceTextureHelper.TAG, AnonymousClass001.A0R(str, " create failure"), e);
                    return null;
                }
            }
        });
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z, YuvConverter yuvConverter) {
        return create(str, context, z, yuvConverter, null);
    }
}
