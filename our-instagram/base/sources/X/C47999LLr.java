package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.LLr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47999LLr implements Animator.AnimatorListener {
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ RecyclerView A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C7L9 A03;
    public final /* synthetic */ C83693oE A04;
    public final /* synthetic */ C14510oO A05;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C47999LLr(ValueAnimator valueAnimator, RecyclerView recyclerView, UserSession userSession, C7L9 c7l9, C83693oE c83693oE, C14510oO c14510oO) {
        this.A00 = valueAnimator;
        this.A05 = c14510oO;
        this.A03 = c7l9;
        this.A01 = recyclerView;
        this.A02 = userSession;
        this.A04 = c83693oE;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        ValueAnimator valueAnimator = this.A00;
        C14360o3.A0A(valueAnimator);
        C14510oO c14510oO = this.A05;
        valueAnimator.addListener(new C47998LLq(this.A01, this.A02, this.A03, this.A04, c14510oO));
    }
}
