package X;

import android.app.Activity;
import android.view.View;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Awl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24704Awl implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C149196nT A01;

    public RunnableC24704Awl(View view, C149196nT c149196nT) {
        this.A01 = c149196nT;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C149196nT c149196nT = this.A01;
        Activity activity = c149196nT.A03;
        C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(2131963585));
        A0f.A0G = true;
        A0f.A03(this.A00);
        A0f.A01();
        A0f.A00 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        A0f.A04 = c149196nT;
        C5SW A00 = A0f.A00();
        c149196nT.A00 = A00;
        A00.A07(c149196nT.A04);
    }
}
