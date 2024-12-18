package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;

/* renamed from: X.HMb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39173HMb extends C1WE {
    @Override // X.C1WE
    public final void A06(C116155Nu c116155Nu, UserSession userSession, String str) {
        C1ET c1et;
        AbstractC167007dF.A1K(c116155Nu, userSession);
        String str2 = c116155Nu.A0g;
        if (str2 == null) {
            str2 = "";
        }
        String queryParameter = AbstractC25227BEk.A0B(str2).getQueryParameter(AbstractC111324zv.A00(1077));
        if (queryParameter != null) {
            java.util.Set A0k = AbstractC001800i.A0k(AbstractC167007dF.A0m(queryParameter, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0));
            C82043lQ c82043lQ = new C82043lQ(userSession, C3G5.A0G, new HY8(userSession, this), "notification_prefetch", null, A0k);
            if (AbstractC82073lT.A05(userSession)) {
                c1et = new C1ET(C05F.A00);
            } else {
                c1et = new C1ET(null);
            }
            c82043lQ.A07(c1et);
        }
    }

    @Override // X.C1WE
    public final boolean A09(C116155Nu c116155Nu, UserSession userSession, String str) {
        return true;
    }

    @Override // X.C1WE
    public final String A0C() {
        return "igstory";
    }

    @Override // X.C1WE
    public final void A0D(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, L85 l85, String str) {
        C14360o3.A0B(l85, 3);
        l85.A00(true);
    }
}
