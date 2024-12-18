package X;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.view.Surface;
import org.webrtc.CapturerObserver;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: classes12.dex */
public final class YJy implements VideoSink, VideoCapturer {
    public VirtualDisplay A00;
    public MediaProjection A01;
    public CapturerObserver A02;
    public SurfaceTextureHelper A03;
    public boolean A04;
    public int A05;
    public int A06;
    public long A07;
    public MediaProjectionManager A08;
    public Handler A09;
    public final MediaProjection.Callback A0A;
    public final Intent A0B;

    @Override // org.webrtc.VideoCapturer
    public final synchronized void changeCaptureFormat(int i, int i2, int i3) {
        if (!this.A04) {
            this.A06 = i;
            this.A05 = i2;
            if (this.A00 != null) {
                ThreadUtils.invokeAtFrontUninterruptibly(this.A09, new RunnableC73498YGc(this));
            }
        } else {
            throw AbstractC166987dD.A18("capturer is disposed.");
        }
    }

    @Override // org.webrtc.VideoCapturer
    public final synchronized void dispose() {
        this.A04 = true;
    }

    @Override // org.webrtc.VideoCapturer
    public final synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        if (!this.A04) {
            if (capturerObserver != null) {
                this.A02 = capturerObserver;
                if (surfaceTextureHelper != null) {
                    this.A03 = surfaceTextureHelper;
                    this.A09 = surfaceTextureHelper.handler;
                    this.A08 = (MediaProjectionManager) context.getSystemService("media_projection");
                } else {
                    throw AbstractC166987dD.A18("surfaceTextureHelper not set.");
                }
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public final boolean isScreencast() {
        return true;
    }

    @Override // org.webrtc.VideoCapturer
    public final synchronized void startCapture(int i, int i2, int i3) {
        if (!this.A04) {
            this.A06 = i;
            this.A05 = i2;
            MediaProjection mediaProjection = this.A08.getMediaProjection(-1, this.A0B);
            this.A01 = mediaProjection;
            mediaProjection.registerCallback(this.A0A, this.A09);
            A00(this);
            this.A02.onCapturerStarted(true);
            this.A03.startListening(this);
        } else {
            throw AbstractC166987dD.A18("capturer is disposed.");
        }
    }

    @Override // org.webrtc.VideoCapturer
    public final synchronized void stopCapture() {
        if (!this.A04) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.A09, new RunnableC73497YGb(this));
        } else {
            throw AbstractC166987dD.A18("capturer is disposed.");
        }
    }

    public static void A00(YJy yJy) {
        yJy.A03.setTextureSize(yJy.A06, yJy.A05);
        yJy.A00 = yJy.A01.createVirtualDisplay("WebRTC_ScreenCapture", yJy.A06, yJy.A05, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, 3, new Surface(yJy.A03.surfaceTexture), null, null);
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        this.A07++;
        this.A02.onFrameCaptured(videoFrame);
    }

    public YJy(Intent intent, MediaProjection.Callback callback) {
        this.A0B = intent;
        this.A0A = callback;
    }
}
