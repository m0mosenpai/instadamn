package X;

import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes9.dex */
public final class POG implements Runnable {
    public final /* synthetic */ PCP A00;

    public POG(PCP pcp) {
        this.A00 = pcp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AutoTransition autoTransition = new AutoTransition();
        PCP pcp = this.A00;
        TransitionSet addListener = autoTransition.addListener((Transition.TransitionListener) pcp.A04);
        InterfaceC09390do interfaceC09390do = pcp.A09;
        TransitionManager.beginDelayedTransition(MSW.A0B(interfaceC09390do), addListener);
        ((C110964z8) pcp.A0L.getValue()).A0G((ConstraintLayout) interfaceC09390do.getValue());
    }
}
