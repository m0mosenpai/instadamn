package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.NyJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54238NyJ {
    public static final void A00(Activity activity, UserSession userSession, EnumC53164NfJ enumC53164NfJ, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C189478aR A00 = AbstractC31177DnL.A0X(userSession, false).A00();
        C52107N4f c52107N4f = new C52107N4f();
        c52107N4f.A00 = interfaceC16820sZ;
        c52107N4f.setArguments(AbstractC167017dG.A0T("nux_variant", enumC53164NfJ.name(), AbstractC166987dD.A1L("creation_session_id", str)));
        A00.A02(activity, c52107N4f);
    }
}
