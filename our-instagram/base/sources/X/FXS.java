package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FXS {
    public static final C1ON A00(UserSession userSession) {
        C25621Ms A0D = AbstractC31179DnN.A0D(userSession);
        A0D.A0B("video_call/retrieve_user_call_settings/");
        return AbstractC25227BEk.A0e(A0D, C32139EAm.class, FSW.class);
    }

    public static final void A01(UserSession userSession, List list) {
        AbstractC167017dG.A1N(userSession, list);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC167017dG.A1V(A0q, it);
        }
        C51756Mtf c51756Mtf = new C51756Mtf((List) A0q, 19);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("video_call/remove_users_from_allowlist/");
        C1GJ.A03(AbstractC31178DnM.A0K(A0c, "users_to_remove", c51756Mtf.toString()));
    }
}
