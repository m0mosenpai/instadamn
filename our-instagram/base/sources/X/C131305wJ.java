package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.5wJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131305wJ {
    public final C41761wQ A00;
    public final UserSession A01;
    public final C14090nZ A02;
    public final C1341764d A03;
    public final C12N A04;

    public C131305wJ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new C41761wQ(null);
        C12L c12l = C12L.A00;
        this.A04 = c12l;
        this.A02 = c12l.AOT(458382369, 3);
        this.A03 = (C1341764d) userSession.A01(C1341764d.class, C64c.A00);
    }

    public final void A01(List list) {
        if (A03()) {
            Comparator comparator = String.CASE_INSENSITIVE_ORDER;
            C14360o3.A08(comparator);
            this.A00.A02(AbstractC132055xg.A00(this.A01).A02(AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", AbstractC001800i.A0g(list, comparator), null)), PKI.A00);
            this.A03.A00(110, false);
        }
    }

    public final boolean A03() {
        UserSession userSession = this.A01;
        if (AbstractC47132Ef.A00(userSession).A03() && C18U.A06(C06090Tz.A05, userSession, 36316486813553064L)) {
            return true;
        }
        return false;
    }

    public final boolean A04() {
        UserSession userSession = this.A01;
        if (AbstractC47132Ef.A00(userSession).A03() && C18U.A06(C06090Tz.A05, userSession, 36316486813356455L)) {
            return true;
        }
        return false;
    }

    public final void A00(InterfaceC71950XCc interfaceC71950XCc, boolean z) {
        if (A04()) {
            this.A00.A02(AbstractC132055xg.A00(this.A01).A01(2, 2, z), new C71178WpP(interfaceC71950XCc));
        }
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A01;
        User A01 = c08730cb.A01(userSession);
        A01.A03.EZS(Boolean.valueOf(z));
        A01.A0c(userSession);
    }

    public final void A02(boolean z) {
        String str;
        if (A03()) {
            this.A00.A02(AbstractC132055xg.A00(this.A01).A01(2, 3, z), new C24229Aov());
        }
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A01;
        User A01 = c08730cb.A01(userSession);
        A01.A03.EZR(Boolean.valueOf(z));
        A01.A0c(userSession);
        C1341764d c1341764d = this.A03;
        if (c1341764d.A01(113) && A03() && (str = (String) c1341764d.A01.get(114)) != null && str.length() != 0) {
            this.A00.A02(AbstractC132055xg.A00(userSession).A02(str), PKJ.A00);
        }
    }

    public final boolean A05() {
        if (A03() && C14360o3.A0K(this.A03.A00.get(110), true)) {
            return true;
        }
        return false;
    }
}
