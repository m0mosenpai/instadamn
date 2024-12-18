package X;

import android.os.Handler;
import org.webrtc.VideoFrame;

/* loaded from: classes9.dex */
public final class POK implements Runnable {
    public final /* synthetic */ C57123PVt A00;

    public POK(C57123PVt c57123PVt) {
        this.A00 = c57123PVt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C57123PVt c57123PVt = this.A00;
        VideoFrame videoFrame = c57123PVt.A00;
        if (videoFrame != null) {
            c57123PVt.onFrameCaptured(new VideoFrame(videoFrame.buffer, videoFrame.rotation, 0L));
        }
        Handler handler = c57123PVt.A01;
        if (handler != null) {
            handler.postDelayed(this, 66L);
        }
    }
}
