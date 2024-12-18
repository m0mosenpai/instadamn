package X;

import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.rtc.RSVideoFrame;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: X.PVw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57125PVw implements VideoSink {
    public final /* synthetic */ C221239pm A00;

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        C14360o3.A0B(videoFrame, 0);
        CameraApi cameraApi = this.A00.A00;
        if (cameraApi != null) {
            cameraApi.handleFrame(new RSVideoFrame(videoFrame));
        }
    }

    public C57125PVw(C221239pm c221239pm) {
        this.A00 = c221239pm;
    }
}
