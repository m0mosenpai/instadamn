package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G4S implements InterfaceC165727az {
    public final UserSession A00;

    public G4S(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC165727az
    public final void Cqf(Activity activity, User user, String str, boolean z) {
        C14360o3.A0B(activity, 0);
        if (user != null) {
            UserSession userSession = this.A00;
            if (C18U.A06(C06090Tz.A05, userSession, 36318204800669718L)) {
                C4A7 c4a7 = (C4A7) userSession.A01(C27265C1i.class, new C37017GSy(userSession, 19));
                OD2 od2 = new OD2(activity, this, user, str, z);
                AbstractC166987dD.A1Z(new C50122MBw(user, od2, c4a7, null, 44), c4a7.A01);
                return;
            }
            C11T.A02(new RunnableC36964GQh(activity, this, user, str, z));
        }
    }
}
