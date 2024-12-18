package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;

/* renamed from: X.Fec, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35135Fec {
    public static final C35135Fec A00 = new Object();

    public final void A01(Activity activity, GXC gxc, UserSession userSession, User user, String str, String str2) {
        C14360o3.A0B(activity, 1);
        C189478aR A0N = AbstractC31175DnJ.A0N(userSession);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("get_app_user", user);
        A0b.putString("get_app_entrypoint", str);
        A0b.putString("injected_actor_ids", str2);
        C32261EIv c32261EIv = new C32261EIv();
        c32261EIv.setArguments(A0b);
        c32261EIv.A00 = gxc;
        A0N.A02(activity, c32261EIv);
    }

    public static final void A00(Activity activity, UserSession userSession) {
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A04(A0b, userSession);
        C6XJ A0L = AbstractC31171DnF.A0L(activity, A0b, userSession, ModalActivity.class, AbstractC43591JPw.A00(70));
        if (C98J.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36318857637730909L)) {
            A0L.A0J = C6XJ.A0Q;
        }
        A0L.A0C(activity);
    }
}
