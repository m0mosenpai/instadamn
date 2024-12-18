package X;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.LLq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47998LLq implements Animator.AnimatorListener {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C7L9 A02;
    public final /* synthetic */ C83693oE A03;
    public final /* synthetic */ C14510oO A04;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C47998LLq(RecyclerView recyclerView, UserSession userSession, C7L9 c7l9, C83693oE c83693oE, C14510oO c14510oO) {
        this.A04 = c14510oO;
        this.A02 = c7l9;
        this.A00 = recyclerView;
        this.A01 = userSession;
        this.A03 = c83693oE;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        String str;
        C14510oO c14510oO = this.A04;
        if (c14510oO.A00) {
            C7L9 c7l9 = this.A02;
            c7l9.A00 = 0.0f;
            c7l9.A05 = null;
            this.A00.invalidate();
            C2056398n A00 = AbstractC2056298m.A00(this.A01);
            C83693oE c83693oE = this.A03;
            if (c83693oE == null || (str = c83693oE.A00) == null) {
                str = "";
            }
            AbstractC31177DnL.A1M(A00.A00.ARD(), AbstractC111324zv.A00(4029), str, true);
            return;
        }
        animator.setStartDelay(200L);
        animator.start();
        c14510oO.A00 = true;
    }
}
