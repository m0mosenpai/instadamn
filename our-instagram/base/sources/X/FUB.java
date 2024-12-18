package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FUB {
    public static final int A00(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        if (((int) AbstractC13880nE.A01(context, AbstractC13890nF.A01(context))) >= 384 && C18U.A06(C06090Tz.A05, userSession, 36329479089504624L)) {
            return 4;
        }
        return 3;
    }

    public static final void A01(Context context, ViewGroup.MarginLayoutParams marginLayoutParams, UserSession userSession, int i, int i2) {
        C14360o3.A0B(marginLayoutParams, 2);
        int A0C = AbstractC166987dD.A0C(context, i);
        int A00 = A00(context, userSession);
        if (A00 != 4) {
            int i3 = i2 % A00;
            if (i3 == 2) {
                marginLayoutParams.setMarginEnd(A0C);
            } else {
                if (i3 != 0) {
                    return;
                }
                marginLayoutParams.setMarginStart(A0C);
            }
        }
    }
}
