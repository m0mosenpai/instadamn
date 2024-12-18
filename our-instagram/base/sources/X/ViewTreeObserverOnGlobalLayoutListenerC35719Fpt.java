package X;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.lang.ref.WeakReference;

/* renamed from: X.Fpt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC35719Fpt implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ IgTextView A04;
    public final /* synthetic */ IgTextView A05;
    public final /* synthetic */ CRY A06;
    public final /* synthetic */ String A07;

    public ViewTreeObserverOnGlobalLayoutListenerC35719Fpt(View view, View view2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IgTextView igTextView, IgTextView igTextView2, CRY cry, String str) {
        this.A00 = view;
        this.A05 = igTextView;
        this.A04 = igTextView2;
        this.A01 = view2;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A07 = str;
        this.A06 = cry;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WeakReference weakReference;
        View view = this.A00;
        if (view.getViewTreeObserver().isAlive()) {
            AbstractC166997dE.A1K(view, this);
            Handler A0J = AbstractC167007dF.A0J();
            WeakReference A16 = AbstractC25225BEi.A16(view);
            IgTextView igTextView = this.A05;
            WeakReference weakReference2 = null;
            if (igTextView != null) {
                weakReference = AbstractC25225BEi.A16(igTextView);
            } else {
                weakReference = null;
            }
            IgTextView igTextView2 = this.A04;
            if (igTextView2 != null) {
                weakReference2 = AbstractC25225BEi.A16(igTextView2);
            }
            WeakReference A162 = AbstractC25225BEi.A16(this.A01);
            UserSession userSession = this.A03;
            A0J.postDelayed(new GR9(A0J, this.A02, userSession, this.A06, this.A07, A16, A162, weakReference, weakReference2), C18U.A01(C06090Tz.A05, userSession, 36602093550572106L));
        }
    }
}
