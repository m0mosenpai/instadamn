package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes9.dex */
public final class MaY extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public MaY(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A04 = obj2;
        this.A05 = obj5;
        this.A03 = obj;
        this.A01 = obj3;
        this.A02 = obj4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            ((C15100pQ) this.A01).A00 = 0;
            ((C37556GgC) this.A04).A0D();
            C37661Ghu.A04((C120985dq) this.A02, (InterfaceC31077DlK) this.A03, (C37661Ghu) this.A05, false, false);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC51368MmT abstractC51368MmT;
        if (this.A00 != 0) {
            ((C37556GgC) this.A04).A0D();
            C15100pQ c15100pQ = (C15100pQ) this.A01;
            int i = c15100pQ.A00 - 1;
            c15100pQ.A00 = i;
            C37661Ghu c37661Ghu = (C37661Ghu) this.A05;
            if (i > 0) {
                ValueAnimator valueAnimator = c37661Ghu.A09;
                valueAnimator.setStartDelay(2000L);
                valueAnimator.start();
                return;
            }
            C37661Ghu.A04((C120985dq) this.A02, (InterfaceC31077DlK) this.A03, c37661Ghu, false, false);
            return;
        }
        C3OO c3oo = (C3OO) this.A04;
        ((ViewPropertyAnimator) this.A03).setListener(null);
        MVN mvn = (MVN) this.A01;
        View A06 = AbstractC31171DnF.A06(c3oo);
        if (mvn.A07) {
            A06.setElevation(0.0f);
        }
        mvn.A01(A06, true);
        if ((c3oo instanceof AbstractC51368MmT) && (abstractC51368MmT = (AbstractC51368MmT) c3oo) != null) {
            abstractC51368MmT.A01(C05F.A01);
        }
        C51178MjM c51178MjM = (C51178MjM) this.A05;
        c51178MjM.A0C(c3oo);
        c51178MjM.A01.remove(this.A02);
        if (c51178MjM.A0L()) {
            return;
        }
        c51178MjM.A0A();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (1 - this.A00 != 0) {
            super.onAnimationRepeat(animator);
        } else {
            ((C37661Ghu) this.A05).A00 *= -1.0f;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.A00 != 0) {
            C37661Ghu c37661Ghu = (C37661Ghu) this.A05;
            c37661Ghu.A00 = 1.0f;
            C37661Ghu.A04((C120985dq) this.A02, (InterfaceC31077DlK) this.A03, c37661Ghu, true, true);
        }
    }
}
