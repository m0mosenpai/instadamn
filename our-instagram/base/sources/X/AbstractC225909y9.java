package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.9y9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225909y9 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Activity activity, Fragment fragment, UserSession userSession, AbstractC86353t7 abstractC86353t7, String str, boolean z) {
        C14360o3.A0B(userSession, 3);
        C189478aR A00 = F86.A00(C3DN.A00.A00(activity));
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0X = abstractC86353t7;
        c189448aO.A11 = AbstractC167007dF.A1W(A00);
        if (fragment instanceof C51D) {
            c189448aO.A0T = (C51D) fragment;
        }
        if (str != null) {
            c189448aO.A0d = str;
        }
        if (A00 != null) {
            if (str != null) {
                A00.A03.A0T(0);
            }
            if (z) {
                int[] iArr = C189448aO.A1X;
                c189448aO.A04(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            c189448aO.A03 = 0.7f;
            c189448aO.A04 = 1.0f;
            c189448aO.A0a = true;
            A00.A0F(fragment, c189448aO);
            return;
        }
        c189448aO.A00().A02(activity, fragment);
    }
}
