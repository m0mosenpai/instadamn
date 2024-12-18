package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F7E {
    public static final boolean A00(Context context, UserSession userSession, String str, boolean z) {
        C14360o3.A0B(context, 0);
        if (z) {
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            int i = 2131958814;
            if (C18U.A05(C06090Tz.A05, userSession)) {
                i = 2131958813;
            }
            A0I.A0A(i);
            AbstractC31177DnL.A0v(context, A0I, str, 2131958817);
            AbstractC31176DnK.A1W(A0I);
            return true;
        }
        return false;
    }
}
