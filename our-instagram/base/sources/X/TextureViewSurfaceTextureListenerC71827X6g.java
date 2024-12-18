package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* renamed from: X.X6g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class TextureViewSurfaceTextureListenerC71827X6g extends EglRenderer implements TextureView.SurfaceTextureListener {
    public int A00;
    public int A01;
    public int A02;
    public RendererCommon.RendererEvents A03;
    public boolean A04;
    public boolean A05;
    public final Object A06;

    @Override // org.webrtc.EglRenderer
    public final void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        A00(context, null, iArr, glDrawer);
    }

    @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        C14360o3.A0B(videoFrame, 0);
        synchronized (this.A06) {
            if (!this.A05) {
                if (!this.A04) {
                    this.A04 = true;
                    RendererCommon.RendererEvents rendererEvents = this.A03;
                    if (rendererEvents != null) {
                        rendererEvents.onFirstFrameRendered();
                    }
                }
                if (this.A02 != videoFrame.getRotatedWidth() || this.A01 != videoFrame.getRotatedHeight() || this.A00 != videoFrame.rotation) {
                    RendererCommon.RendererEvents rendererEvents2 = this.A03;
                    if (rendererEvents2 != null) {
                        rendererEvents2.onFrameResolutionChanged(videoFrame.buffer.getWidth(), videoFrame.buffer.getHeight(), videoFrame.rotation);
                    }
                    this.A02 = videoFrame.getRotatedWidth();
                    this.A01 = videoFrame.getRotatedHeight();
                    this.A00 = videoFrame.rotation;
                }
            }
        }
        super.onFrame(videoFrame);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
        createEglSurface(surfaceTexture);
    }

    public TextureViewSurfaceTextureListenerC71827X6g() {
        super("TextureViewRenderer");
        this.A06 = new Object();
    }

    @Override // org.webrtc.EglRenderer
    public final void disableFpsReduction() {
        synchronized (this.A06) {
            this.A05 = false;
        }
        super.disableFpsReduction();
    }

    @Override // org.webrtc.EglRenderer
    public final void pauseVideo() {
        synchronized (this.A06) {
            this.A05 = true;
        }
        setFpsReduction(0.0f);
    }

    @Override // org.webrtc.EglRenderer
    public final void setFpsReduction(float f) {
        synchronized (this.A06) {
            this.A05 = AbstractC167007dF.A1N((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        }
        super.setFpsReduction(f);
    }

    public final void A00(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.A03 = rendererEvents;
        synchronized (this.A06) {
            this.A04 = false;
            this.A02 = 0;
            this.A01 = 0;
            this.A00 = 0;
        }
        super.init(context, iArr, glDrawer);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new RunnableC71373Wsi(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
