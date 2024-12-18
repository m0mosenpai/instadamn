package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.io.StringWriter;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class IRZ {
    public static final C1ON A00(UserSession userSession, String str, String str2, java.util.Set set) {
        AbstractC25233BEq.A0v(0, userSession, set, str2);
        String A02 = new C71473Il(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A02(set);
        C14360o3.A07(A02);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("usertags/review/");
        A0c.A9s(str, A02);
        AbstractC31173DnH.A1N(A0c);
        AbstractC37300Gc1.A0y(A0c, str2);
        return AbstractC31176DnK.A0P(A0c);
    }

    public static final C1ON A01(UserSession userSession, String str, java.util.Set set) {
        AbstractC167027dH.A12(userSession, set, str);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("usertags/remove/");
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A06 = AbstractC37301Gc2.A06(A0O);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A06.A0u(AbstractC166987dD.A1B(it));
        }
        A06.A0Z();
        A06.close();
        A0c.A9s("media_to_untag", AbstractC166987dD.A19(A0O));
        AbstractC31173DnH.A1N(A0c);
        return AbstractC31172DnG.A0T(A0c, "container_module", str);
    }
}
