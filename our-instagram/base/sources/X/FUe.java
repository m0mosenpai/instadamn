package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class FUe {
    public static final C1ON A00(UserSession userSession, String str, List list, Map map) {
        String str2;
        boolean isLockedChatEnabled = LockedChatKillSwitch.isLockedChatEnabled(userSession, false);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("direct_v2/search_secondary/");
        A0M.A9s("query", str);
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0c();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0A.A0u(AbstractC166987dD.A1B(it));
            }
            A0A.A0Z();
            A0A.close();
            str2 = stringWriter.toString();
        } catch (IOException e) {
            C0w9.A06("DirectSearchSecondaryApi", AbstractC111324zv.A00(155), e);
            str2 = null;
        }
        A0M.A9s("result_types", str2);
        A0M.A9s("offsets", A01(map));
        A0M.A9s("hide_locked_threads", A01(AbstractC167007dF.A0n("message_content", String.valueOf(isLockedChatEnabled))));
        return AbstractC25227BEk.A0e(A0M, C32210EDj.class, C34790FUs.class);
    }

    public static final String A01(Map map) {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                String A17 = AbstractC31172DnG.A17(A1K);
                Object value = A1K.getValue();
                A0S.A0r(A17);
                A0S.A0J(value);
            }
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException e) {
            C0w9.A06("DirectSearchSecondaryApi", AbstractC111324zv.A00(155), e);
            return null;
        }
    }
}
