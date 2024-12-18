package X;

import android.app.Activity;
import android.view.View;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Awk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24703Awk implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C149186nS A01;

    public RunnableC24703Awk(View view, C149186nS c149186nS) {
        this.A01 = c149186nS;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C149186nS c149186nS = this.A01;
        Activity activity = c149186nS.A03;
        C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(2131953279));
        A0f.A0G = true;
        A0f.A03(this.A00);
        A0f.A01();
        A0f.A00 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        A0f.A04 = c149186nS;
        C5SW A00 = A0f.A00();
        c149186nS.A00 = A00;
        A00.A06();
    }
}
