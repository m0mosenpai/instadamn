package X;

import android.view.animation.Animation;
import java.util.HashSet;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes8.dex */
public final class LR6 implements Animation.AnimationListener {
    public final /* synthetic */ C158907Bc A00;
    public final /* synthetic */ String A01;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public LR6(C158907Bc c158907Bc, String str) {
        this.A00 = c158907Bc;
        this.A01 = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C158907Bc c158907Bc = this.A00;
        c158907Bc.A00 = false;
        C23031Ai CE0 = c158907Bc.A01.CE0();
        if (CE0 != null) {
            InterfaceC19630xq interfaceC19630xq = CE0.A01;
            String A00 = AbstractC111324zv.A00(CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS);
            HashSet hashSet = new HashSet(interfaceC19630xq.C2v(A00));
            hashSet.add(this.A01);
            AbstractC43594JPz.A1M(interfaceC19630xq, A00, hashSet);
        }
    }
}
