package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.GQz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36982GQz implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ IgTextView A03;
    public final /* synthetic */ IgTextView A04;
    public final /* synthetic */ CRY A05;

    public RunnableC36982GQz(View view, View view2, UserSession userSession, IgTextView igTextView, IgTextView igTextView2, CRY cry) {
        this.A01 = view;
        this.A02 = userSession;
        this.A04 = igTextView;
        this.A00 = view2;
        this.A03 = igTextView2;
        this.A05 = cry;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator scaleX2;
        ViewPropertyAnimator scaleY2;
        ViewPropertyAnimator scaleY3 = this.A01.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
        UserSession userSession = this.A02;
        ViewPropertyAnimator duration = scaleY3.setDuration(C85363rR.A00(userSession));
        C14360o3.A07(duration);
        IgTextView igTextView = this.A04;
        ViewPropertyAnimator viewPropertyAnimator2 = null;
        if (igTextView != null && (animate2 = igTextView.animate()) != null && (alpha2 = animate2.alpha(1.0f)) != null && (scaleX2 = alpha2.scaleX(1.0f)) != null && (scaleY2 = scaleX2.scaleY(1.0f)) != null) {
            viewPropertyAnimator = scaleY2.setDuration(C85363rR.A00(userSession));
        } else {
            viewPropertyAnimator = null;
        }
        duration.start();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.start();
        }
        View view = this.A00;
        ViewPropertyAnimator duration2 = view.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(C85363rR.A01(userSession));
        IgTextView igTextView2 = this.A03;
        ViewPropertyAnimator listener = duration2.setListener(new C28514Ci8(3, igTextView2, this.A05, view));
        C14360o3.A07(listener);
        if (igTextView2 != null && (animate = igTextView2.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (scaleX = alpha.scaleX(0.0f)) != null && (scaleY = scaleX.scaleY(0.0f)) != null) {
            viewPropertyAnimator2 = scaleY.setDuration(C85363rR.A01(userSession));
        }
        listener.start();
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.start();
        }
    }
}
