package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AN8 implements Animator.AnimatorListener {
    public final /* synthetic */ C148176ln A00;
    public final /* synthetic */ boolean A01;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public AN8(C148176ln c148176ln, boolean z) {
        this.A01 = z;
        this.A00 = c148176ln;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.A01) {
            C148176ln c148176ln = this.A00;
            UserSession userSession = c148176ln.A0F;
            if (C18U.A06(C06090Tz.A05, userSession, 36320949284447248L)) {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                if (AbstractC31172DnG.A01(A00.A01, AbstractC111324zv.A00(1281)) < 1) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(c148176ln.A0U);
                    animatorSet.addListener(new ANB(8, c148176ln, A00));
                    animatorSet.start();
                }
            }
        }
    }
}
