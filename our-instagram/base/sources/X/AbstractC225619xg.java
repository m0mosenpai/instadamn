package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.9xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225619xg {
    public static final void A00(Activity activity, View view, UserSession userSession) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        C5SU A0U = AbstractC167007dF.A0U(activity, 2131953539);
        A0U.A03(view);
        A0U.A01();
        A0U.A07(C5SV.A07);
        A0U.A0B = A1V;
        A0U.A00 = 5000;
        A0U.A0A = A1V;
        A0U.A00().A07(userSession);
    }
}
