package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes11.dex */
public final class U80 extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public U80(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                C102884kP c102884kP = (C102884kP) this.A02;
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
                C6FG c6fg = (C6FG) this.A01;
                C6FP.A03(c6fg, c102884kP, new C6FW(AbstractC16960so.A1Q(c102884kP, c6fg)), interfaceC103384lE);
                return;
            case 1:
                AbstractC43593JPy.A1Q(this.A01);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (1 - this.A00 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        View view = (View) this.A01;
        View view2 = (View) this.A02;
        C14360o3.A0A(view2);
        view.setVisibility(0);
        AbstractC56932jR.A06(view2, 500L);
        view2.setAccessibilityLiveRegion(2);
    }
}
