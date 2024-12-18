package X;

import android.animation.Animator;
import android.os.Handler;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.FhL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35286FhL implements Animator.AnimatorListener {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ IgTextView A04;
    public final /* synthetic */ IgTextView A05;
    public final /* synthetic */ CRY A06;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C35286FhL(Handler handler, View view, View view2, UserSession userSession, IgTextView igTextView, IgTextView igTextView2, CRY cry) {
        this.A00 = handler;
        this.A02 = view;
        this.A05 = igTextView;
        this.A01 = view2;
        this.A04 = igTextView2;
        this.A03 = userSession;
        this.A06 = cry;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler = this.A00;
        View view = this.A02;
        IgTextView igTextView = this.A05;
        View view2 = this.A01;
        IgTextView igTextView2 = this.A04;
        UserSession userSession = this.A03;
        handler.postDelayed(new RunnableC36982GQz(view, view2, userSession, igTextView, igTextView2, this.A06), C18U.A01(C06090Tz.A05, userSession, 36602093550441032L));
    }
}
