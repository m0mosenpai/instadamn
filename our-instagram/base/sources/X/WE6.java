package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* loaded from: classes11.dex */
public abstract class WE6 {
    public static final HashMap A00(User user) {
        C44I AqZ;
        String Bhk;
        HashMap A02 = AbstractC06930Yk.A02(AbstractC25229BEm.A1b(MSV.A00(265), user.getId(), new C09530e4("source_name", "CHARITY_PROFILE")));
        C44K AnF = user.A03.AnF();
        if (AnF != null && (AqZ = AnF.AqZ()) != null && (Bhk = AqZ.Bhk()) != null) {
            A02.put("fundraiser_id", Bhk);
        }
        return A02;
    }

    public static final boolean A03(User user) {
        C44I AqZ;
        C44K AnF = user.A03.AnF();
        if (AnF != null && (AqZ = AnF.AqZ()) != null) {
            return AbstractC31177DnL.A1b(AqZ.AlC());
        }
        return false;
    }

    public static final HashMap A01(User user) {
        return AbstractC06930Yk.A02(AbstractC25229BEm.A1b("source_name", "CHARITY_PROFILE", new C09530e4("charity_igid", user.getId())));
    }

    public static final boolean A02(UserSession userSession) {
        if (AbstractC166997dE.A1Z(AbstractC31178DnM.A0T(userSession).A03.CPq(), true) && C18U.A06(C06090Tz.A05, userSession, 36313849703434511L)) {
            return true;
        }
        return false;
    }
}
