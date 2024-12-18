package X;

import android.transition.Transition;
import android.transition.TransitionSet;

/* loaded from: classes4.dex */
public final class APr implements Transition.TransitionListener {
    public final /* synthetic */ TransitionSet A00;
    public final /* synthetic */ C194648jP A01;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    public APr(TransitionSet transitionSet, C194648jP c194648jP) {
        this.A00 = transitionSet;
        this.A01 = c194648jP;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.A00.removeListener((Transition.TransitionListener) this);
        C86S c86s = this.A01.A0F;
        C25024B5f.A02(c86s, AbstractC141776au.A00(c86s), 6);
    }
}
