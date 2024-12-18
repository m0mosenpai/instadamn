package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FZq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34904FZq {
    public static final InterfaceC08100bW A00 = new C42106IlG(3);

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(Activity activity, Fragment fragment, UserSession userSession, User user, String str) {
        C14360o3.A0B(userSession, 0);
        if (user != null && C4A4.A01(userSession) && AbstractC43959Jc8.A00(userSession) && user.A1P()) {
            String id = user.getId();
            C50674MYs c50674MYs = new C50674MYs(activity, userSession);
            c50674MYs.A03(new ViewOnClickListenerC35619FoA(activity, fragment, userSession, user, str, 2), 2131959860);
            c50674MYs.A03(new ViewOnClickListenerC35674Fp9(userSession, fragment, id, str, 6), 2131969369);
            new C31727DwY(c50674MYs).A07(fragment.requireContext());
            return;
        }
        C36881nl A01 = C36881nl.A01(activity, (InterfaceC11380iw) fragment, userSession, str);
        A01.A0B = new C122145g6(AbstractC31175DnJ.A0g(user));
        A01.A0n = true;
        A01.A01 = fragment;
        A01.A06();
    }
}
