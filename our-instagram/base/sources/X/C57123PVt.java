package X;

import android.os.Handler;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;

/* renamed from: X.PVt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57123PVt implements CapturerObserver {
    public VideoFrame A00;
    public final Handler A01;
    public final Runnable A02;
    public final /* synthetic */ C55074OaU A03;

    @Override // org.webrtc.CapturerObserver
    public final void onCapturerStopped() {
        this.A00 = null;
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public C57123PVt(C55074OaU c55074OaU) {
        Handler handler;
        this.A03 = c55074OaU;
        SurfaceTextureHelper surfaceTextureHelper = c55074OaU.A04;
        if (surfaceTextureHelper != null) {
            handler = surfaceTextureHelper.handler;
        } else {
            handler = null;
        }
        this.A01 = handler;
        this.A02 = new POK(this);
    }

    @Override // org.webrtc.CapturerObserver
    public final void onCapturerStarted(boolean z) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.postDelayed(this.A02, 66L);
        }
    }

    @Override // org.webrtc.CapturerObserver
    public final void onFrameCaptured(VideoFrame videoFrame) {
        if (videoFrame != null) {
            this.A00 = videoFrame;
            ScreenShareApi screenShareApi = this.A03.A00;
            if (screenShareApi != null) {
                screenShareApi.handleFrame(new RSVideoFrame(videoFrame), false);
            }
            videoFrame.release();
        }
    }
}
