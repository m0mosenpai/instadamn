package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;

/* loaded from: classes9.dex */
public final class P6P implements MQE {
    public final UserSession A00;

    @Override // X.MQE
    public final String getName() {
        return "ArmadilloExpressRemovePIIStep";
    }

    public P6P(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.MQE
    public final Object F8t(OXD oxd, InterfaceC23621Ds interfaceC23621Ds) {
        IGFOAMessagingSendToSentLogger A00;
        C89563yw A0r = JQ0.A0r(interfaceC23621Ds);
        UserSession userSession = this.A00;
        if (!C18U.A06(C06090Tz.A05, userSession, 36318861937416904L)) {
            A0r.resumeWith(NRK.A00);
        } else {
            C14360o3.A07(C120005by.A00(oxd.A0B));
            C47Z c47z = oxd.A0C;
            String str = c47z.A3p;
            if (str != null) {
                C120005by.A03(str, null, 15, 1163, 0);
            }
            Integer num = c47z.A2G;
            if (num != null && (A00 = C163307Sp.A00(userSession, num.intValue())) != null) {
                A00.onLogPIIRemovalStart();
            }
            String str2 = c47z.A3V;
            if (str2 != null) {
                android.net.Uri A0I = AbstractC167007dF.A0I(str2);
                android.net.Uri A0I2 = AbstractC167007dF.A0I(AbstractC916948n.A0A(oxd.A0A, ".mp4", System.nanoTime(), true));
                C14360o3.A0A(A0I);
                C14360o3.A0A(A0I2);
                LL8.A01(A0I, A0I2, userSession, oxd, A0r);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return A0r.A00();
    }
}
