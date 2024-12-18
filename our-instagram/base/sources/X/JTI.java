package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class JTI {
    public static final JTJ A00(UserSession userSession, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        JTK jtk;
        if (z && !C2E9.A07(userSession)) {
            jtk = new JTK(C05F.A0Y);
            jtk.A07 = z3;
            int i2 = 2131976215;
            if (z2) {
                i2 = 2131973233;
            }
            jtk.A00 = i2;
        } else {
            jtk = new JTK(C05F.A01);
            jtk.A07 = z3;
        }
        int i3 = 2131973053;
        if (z5) {
            i3 = 2131953229;
        }
        jtk.A05 = z4;
        if (z4) {
            jtk.A01 = i3;
        }
        jtk.A06 = z6;
        jtk.A08 = z7;
        jtk.A02 = i;
        jtk.A09 = z8;
        return new JTJ(jtk);
    }
}
