package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.9ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226299ym {
    public static final void A00(Activity activity, Fragment fragment, UserSession userSession) {
        C50674MYs c50674MYs = new C50674MYs(activity, userSession);
        c50674MYs.A03(new ViewOnClickListenerC48066LPr(27, activity, fragment), 2131973236);
        c50674MYs.A03(new ViewOnClickListenerC35683FpI(25, activity, fragment), 2131969329);
        c50674MYs.A01(ASZ.A00, 2131954754);
        new C31727DwY(c50674MYs).A05(activity);
    }
}
