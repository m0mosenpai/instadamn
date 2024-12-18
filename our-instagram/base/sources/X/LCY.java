package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;

/* loaded from: classes8.dex */
public abstract class LCY {
    public static final C49240Lpv A00(UserSession userSession, CommonMediaTransport commonMediaTransport, C4G2 c4g2, InterfaceC37261GbE interfaceC37261GbE) {
        AbstractC167027dH.A13(interfaceC37261GbE, commonMediaTransport, c4g2);
        C47Z A03 = C25A.A00(userSession).A03(c4g2.A07);
        if (A03 != null) {
            String A02 = c4g2.A02();
            if (A02 != null) {
                return new C49240Lpv(userSession, interfaceC37261GbE, A03, AbstractC167007dF.A0n(A02, commonMediaTransport));
            }
            throw AbstractC43594JPz.A0o(c4g2, "No local path for voice media ", AbstractC166987dD.A1C());
        }
        throw AbstractC31175DnJ.A0V("Cannot find pending media for key ", c4g2.A07);
    }

    public static final C49240Lpv A01(UserSession userSession, CommonMediaTransport commonMediaTransport, InterfaceC37261GbE interfaceC37261GbE, C7Q4 c7q4) {
        AbstractC167017dG.A1P(interfaceC37261GbE, commonMediaTransport);
        C47Z A03 = C25A.A00(userSession).A03(c7q4.A06);
        if (A03 != null) {
            return new C49240Lpv(userSession, interfaceC37261GbE, A03, AbstractC167007dF.A0n(c7q4.A02(), commonMediaTransport));
        }
        throw AbstractC31175DnJ.A0V("Cannot find pending media for key ", c7q4.A06);
    }
}
