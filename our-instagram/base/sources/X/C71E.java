package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.material.appbar.HeaderScrollingViewBehavior;
import com.instagram.common.session.UserSession;
import com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior;

/* renamed from: X.71E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C71E {
    public final Activity A00;
    public final UserSession A01;
    public final InterfaceC56392iX A02;
    public final C155666yv A03;
    public final InterfaceC09390do A04;

    public C71E(Activity activity, ViewStub viewStub, UserSession userSession, C155666yv c155666yv, final RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(activity, 2);
        C14360o3.A0B(c155666yv, 3);
        C14360o3.A0B(viewStub, 4);
        C14360o3.A0B(refreshableAppBarLayoutBehavior, 5);
        this.A01 = userSession;
        this.A00 = activity;
        this.A03 = c155666yv;
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        A01.EZv(new InterfaceC69513Al() { // from class: X.71F
            @Override // X.InterfaceC69513Al
            public final /* bridge */ /* synthetic */ void DLu(View view) {
                C14360o3.A0B(view, 0);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                ((C56292iI) layoutParams).A00(new HeaderScrollingViewBehavior());
                RefreshableAppBarLayoutBehavior.this.A0I.add(view);
            }
        });
        this.A02 = A01;
        this.A04 = C1XM.A00(new C9EY(this, 45));
    }
}
