package X;

import android.animation.TimeInterpolator;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes9.dex */
public final class POF implements Runnable {
    public final /* synthetic */ PCP A00;

    public POF(PCP pcp) {
        this.A00 = pcp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TransitionSet interpolator = new AutoTransition().setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
        PCP pcp = this.A00;
        InterfaceC09390do interfaceC09390do = pcp.A09;
        TransitionManager.beginDelayedTransition(MSW.A0B(interfaceC09390do), interpolator);
        ((C110964z8) pcp.A0H.getValue()).A0G((ConstraintLayout) interfaceC09390do.getValue());
    }
}
