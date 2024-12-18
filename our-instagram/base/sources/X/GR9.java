package X;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class GR9 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ CRY A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ WeakReference A05;
    public final /* synthetic */ WeakReference A06;
    public final /* synthetic */ WeakReference A07;
    public final /* synthetic */ WeakReference A08;

    public GR9(Handler handler, InterfaceC11380iw interfaceC11380iw, UserSession userSession, CRY cry, String str, WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3, WeakReference weakReference4) {
        this.A07 = weakReference;
        this.A05 = weakReference2;
        this.A08 = weakReference3;
        this.A06 = weakReference4;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A04 = str;
        this.A00 = handler;
        this.A03 = cry;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        IgTextView igTextView;
        IgTextView igTextView2;
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator scaleX2;
        ViewPropertyAnimator scaleY2;
        View view2 = (View) this.A07.get();
        if (view2 != null && (view = (View) this.A05.get()) != null) {
            WeakReference weakReference = this.A08;
            ViewPropertyAnimator viewPropertyAnimator2 = null;
            if (weakReference != null) {
                igTextView = (IgTextView) weakReference.get();
            } else {
                igTextView = null;
            }
            WeakReference weakReference2 = this.A06;
            if (weakReference2 != null) {
                igTextView2 = (IgTextView) weakReference2.get();
            } else {
                igTextView2 = null;
            }
            Rect rect = new Rect();
            view2.getGlobalVisibleRect(rect);
            int i = rect.bottom - rect.top;
            int measuredHeight = view2.getMeasuredHeight();
            if (1 <= i && i <= measuredHeight) {
                UserSession userSession = this.A02;
                AbstractC84973ql.A00(userSession).A03(this.A01.getModuleName(), this.A04);
                view.setVisibility(0);
                if (igTextView2 != null) {
                    igTextView2.setVisibility(0);
                }
                view.setAlpha(0.0f);
                if (igTextView2 != null) {
                    igTextView2.setAlpha(0.0f);
                }
                ViewPropertyAnimator duration = view2.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(C85363rR.A01(userSession));
                C14360o3.A07(duration);
                if (igTextView != null && (animate2 = igTextView.animate()) != null && (alpha2 = animate2.alpha(0.0f)) != null && (scaleX2 = alpha2.scaleX(0.0f)) != null && (scaleY2 = scaleX2.scaleY(0.0f)) != null) {
                    viewPropertyAnimator = scaleY2.setDuration(C85363rR.A01(userSession));
                } else {
                    viewPropertyAnimator = null;
                }
                ViewPropertyAnimator listener = view.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(C85363rR.A00(userSession)).setListener(new C35286FhL(this.A00, view2, view, userSession, igTextView, igTextView2, this.A03));
                C14360o3.A07(listener);
                if (igTextView2 != null && (animate = igTextView2.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (scaleX = alpha.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null) {
                    viewPropertyAnimator2 = scaleY.setDuration(C85363rR.A00(userSession));
                }
                duration.start();
                listener.start();
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.start();
                }
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.start();
                }
            }
        }
    }
}
