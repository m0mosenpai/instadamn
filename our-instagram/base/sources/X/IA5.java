package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes7.dex */
public abstract class IA5 {
    public static C38947HCw A00(UserSession userSession, InterfaceC43588JPt interfaceC43588JPt, UpcomingEvent upcomingEvent, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(userSession, 0);
        C38947HCw c38947HCw = new C38947HCw();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A04(A0b, userSession);
        A0b.putParcelable("upcoming_event", upcomingEvent);
        A0b.putBoolean("coming_from_sticker", z);
        A0b.putString("prior_module", str2);
        A0b.putString("media_pk", str);
        A0b.putString("source_of_action", str3);
        A0b.putBoolean("disable_offsite_link", z2);
        A0b.putBoolean("disable_snackbar", z3);
        c38947HCw.setArguments(A0b);
        if (interfaceC43588JPt != null) {
            c38947HCw.A02 = interfaceC43588JPt;
        }
        return c38947HCw;
    }
}
