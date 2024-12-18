package X;

import android.animation.Animator;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AMz implements Animator.AnimatorListener {
    public final /* synthetic */ UserSession A00;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public AMz(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        UserSession userSession = this.A00;
        AbstractC167017dG.A0g(AbstractC166987dD.A0x(userSession), AbstractC111324zv.A00(2075)).apply();
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
        A0w.E7G(AbstractC111324zv.A00(2076), currentTimeMillis);
        A0w.apply();
    }
}
