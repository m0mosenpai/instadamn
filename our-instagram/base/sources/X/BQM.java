package X;

import android.animation.Animator;
import android.view.animation.OvershootInterpolator;

/* loaded from: classes5.dex */
public final class BQM implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public BQM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InterfaceC16820sZ interfaceC16820sZ;
        switch (this.A00) {
            case 0:
            case 5:
                AbstractC25232BEp.A1O(this.A01);
                return;
            case 1:
                ((C25317BIm) this.A01).A00 = 0.0f;
                return;
            case 2:
            case 6:
            default:
                C77123cy c77123cy = (C77123cy) this.A01;
                Boolean A0b = AbstractC166997dE.A0b();
                C2XV.A00();
                c77123cy.A00 = A0b;
                return;
            case 3:
                BVJ bvj = (BVJ) this.A01;
                OvershootInterpolator overshootInterpolator = BVJ.A0w;
                if (bvj.A02 == null) {
                    return;
                }
                interfaceC16820sZ = bvj.A09;
                break;
            case 4:
                ((C2XI) this.A01).A00(AbstractC166997dE.A0b());
                return;
            case 7:
                C26590Bon c26590Bon = (C26590Bon) this.A01;
                OvershootInterpolator overshootInterpolator2 = C26590Bon.A0h;
                if (c26590Bon.A02 == null) {
                    return;
                }
                interfaceC16820sZ = c26590Bon.A08;
                break;
        }
        if (interfaceC16820sZ == null) {
            return;
        }
        interfaceC16820sZ.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
