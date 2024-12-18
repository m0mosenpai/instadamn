package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.KsM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47127KsM {
    public static final void A00(Activity activity, UserSession userSession, C47Z c47z, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, int i) {
        AbstractC54099Nvx.A00(c47z);
        C40121td A01 = C40121td.A0G.A01(activity, userSession);
        if (c47z.A11()) {
            A01.A0D(c47z);
        } else {
            A01.A0C(c47z);
        }
        A01.A09(c47z);
        c47z.A0W(new C49541Luu(userSession, c47z, str, str2, str3, interfaceC16820sZ, i));
    }
}
