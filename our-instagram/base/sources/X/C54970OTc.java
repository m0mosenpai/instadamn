package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.OTc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54970OTc {
    public boolean A00;
    public final UserSession A01;
    public final Activity A02;

    public C54970OTc(Activity activity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = activity;
    }

    public static final void A00(View view, C54970OTc c54970OTc, C33I c33i, EnumC58132lV enumC58132lV, String str) {
        C5SU c5su = new C5SU(c54970OTc.A02, new C149686oL(str));
        c5su.A03(view);
        c5su.A06(enumC58132lV);
        c5su.A04 = c33i;
        view.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserverOnScrollChangedListenerC35723Fpx(1, view, c5su.A00()));
    }
}
