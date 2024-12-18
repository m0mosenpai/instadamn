package X;

import com.facebook.forker.Process;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CJ8 {
    public static final boolean A00(UserSession userSession, EnumC71153Hb enumC71153Hb) {
        List A0m;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36312874754311616L) && (A0m = AbstractC167007dF.A0m(C18U.A04(c06090Tz, userSession, 36879041629847787L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0)) != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A0m);
            Iterator it = A0m.iterator();
            while (it.hasNext()) {
                A0q.add(AbstractC25228BEl.A1A(AbstractC166987dD.A1B(it)));
            }
            if (AbstractC001800i.A0u(A0q, enumC71153Hb.A00)) {
                return true;
            }
        }
        switch (enumC71153Hb.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 14:
            case Process.SIGTERM /* 15 */:
                return true;
            default:
                return false;
        }
    }
}
