package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hxc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40494Hxc {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        C06090Tz A0j = AbstractC25225BEi.A0j(A0S, 0);
        if (C18U.A06(A0j, A0S, 36319742399356549L)) {
            boolean A01 = C6DZ.A01(c6fw.A03(0));
            C23031Ai A00 = AbstractC23021Ah.A00(A0S);
            if (A01) {
                A00.A06.Egi(A00, C3YY.ACTIVE.toString(), C23031Ai.A8c[369]);
                if (C18U.A06(A0j, A0S, 36319742399749769L)) {
                    C1PH A002 = C1PH.A00(A0S);
                    C1PB c1pb = C1PB.A00;
                    if (A002.A02.containsKey(c1pb)) {
                        A002.A06(c1pb).A04();
                        return null;
                    }
                    return null;
                }
                return null;
            }
            A00.A06.Egi(A00, C3YY.INACTIVE.toString(), C23031Ai.A8c[369]);
            return null;
        }
        return null;
    }
}
