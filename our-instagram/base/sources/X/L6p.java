package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes8.dex */
public final class L6p {
    public final Map A00;
    public final java.util.Set A01;

    public final InterfaceC50460MPo A00(LF7 lf7, C2EY c2ey) {
        Object obj;
        if (lf7.A0S && !this.A01.contains(c2ey)) {
            return new C48722Lgq(c2ey);
        }
        if (c2ey == C2EY.A0s) {
            Map map = AbstractC47159Ksu.A00;
            Object value = lf7.A0F.getValue();
            if (value == null || !AbstractC47159Ksu.A00.containsKey(value)) {
                obj = AbstractC06930Yk.A01(C2EY.A19, this.A00);
                return (InterfaceC50460MPo) obj;
            }
        }
        obj = this.A00.get(c2ey);
        if (obj == null) {
            obj = new C48722Lgq(c2ey);
        }
        return (InterfaceC50460MPo) obj;
    }

    public L6p(UserSession userSession) {
        C2EY c2ey = C2EY.A1i;
        C09530e4 A1L = AbstractC166987dD.A1L(c2ey, new Object());
        C09530e4 A1L2 = AbstractC166987dD.A1L(C2EY.A0G, new Object());
        C09530e4 A1L3 = AbstractC166987dD.A1L(C2EY.A0K, new Object());
        C09530e4 A1L4 = AbstractC166987dD.A1L(C2EY.A1C, new C48721Lgp(userSession));
        C09530e4 A1L5 = AbstractC166987dD.A1L(C2EY.A1m, new Object());
        C09530e4 A1L6 = AbstractC166987dD.A1L(C2EY.A1d, new Object());
        C09530e4 A1L7 = AbstractC166987dD.A1L(C2EY.A1l, new Object());
        C2EY c2ey2 = C2EY.A19;
        C09530e4 A1L8 = AbstractC166987dD.A1L(c2ey2, new Object());
        C2EY c2ey3 = C2EY.A0s;
        this.A00 = AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, AbstractC166987dD.A1L(c2ey3, new C48723Lgr(userSession)));
        this.A01 = AbstractC16830sb.A07(c2ey, c2ey2, c2ey3);
    }
}
