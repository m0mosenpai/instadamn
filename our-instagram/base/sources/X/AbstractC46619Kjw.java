package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kjw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46619Kjw {
    public static final void A00(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, C53O c53o, UserSession userSession, String str, String str2, int i) {
        boolean A1R = AbstractC167007dF.A1R(0, userSession, activity);
        if (!activity.isFinishing()) {
            LJ8 lj8 = LJ8.A0C;
            if (lj8 == null) {
                lj8 = new LJ8(userSession);
                LJ8.A0C = lj8;
            }
            if (lj8.A04(str, str2)) {
                lj8.A03(activity, str, str2);
            }
            C193328hC A0H = AbstractC31171DnF.A0H(activity);
            A0H.A0k(AbstractC33776Ew2.A00(activity, userSession));
            A0H.A0A(2131956936);
            A0H.A09(i);
            A0H.A0J(new DialogInterfaceOnClickListenerC35371Fim(activity, onClickListener, c53o, userSession, str, str2, 0), 2131956934);
            A0H.A0I(null, 2131956935);
            A0H.A0t(A1R);
            A0H.A0s(A1R);
            A0H.A0g(onDismissListener);
            AbstractC166987dD.A1W(A0H);
        }
    }
}
