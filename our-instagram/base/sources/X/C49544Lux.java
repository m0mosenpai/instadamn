package X;

import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.Lux, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49544Lux implements MQE {
    public final UserSession A00;

    @Override // X.MQE
    public final String getName() {
        return "ArmadilloExpressMediaScrutinyStep";
    }

    public C49544Lux(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.MQE
    public final Object F8t(OXD oxd, InterfaceC23621Ds interfaceC23621Ds) {
        C89563yw A0r = JQ0.A0r(interfaceC23621Ds);
        UserSession userSession = this.A00;
        if (!C18U.A06(C06090Tz.A05, userSession, 36318861937351367L)) {
            A0r.resumeWith(NRK.A00);
        } else {
            C47Z c47z = oxd.A0C;
            String str = c47z.A1N.A0F;
            if (str != null) {
                android.net.Uri A0I = AbstractC167007dF.A0I(str);
                android.net.Uri fromFile = android.net.Uri.fromFile((File) C1Q3.A01.getValue());
                Integer A00 = LIM.A00(c47z.A1G);
                C14360o3.A0A(A0I);
                C14360o3.A0A(fromFile);
                String str2 = c47z.A3p;
                JVY jvy = new JVY(18, this, oxd, A0r);
                AbstractC167027dH.A13(A00, A0I, fromFile);
                LCH.A01(new MIO(jvy, fromFile, A00, A0I, str2, 11), userSession);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return A0r.A00();
    }
}
