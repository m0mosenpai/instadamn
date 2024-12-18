package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Pj5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57716Pj5 extends C0YY implements InterfaceC16660sJ {
    public static final C57716Pj5 A00 = new C57716Pj5();

    public C57716Pj5() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractC52972be abstractC52972be = (AbstractC52972be) obj;
        C14360o3.A0B(abstractC52972be, 0);
        UserSession userSession = (UserSession) abstractC52972be.A00(C55575OmD.A00);
        if (userSession != null) {
            C147236jz c147236jz = (C147236jz) abstractC52972be.A00(C55572OmA.A00);
            if (c147236jz != null) {
                C54703OEf c54703OEf = (C54703OEf) abstractC52972be.A00(C55574OmC.A00);
                if (c54703OEf != null) {
                    C40980IDb c40980IDb = new C40980IDb(userSession);
                    return new C38325GtK(C12L.A00, userSession, c147236jz, c54703OEf.A01, c54703OEf.A02, c40980IDb);
                }
                throw AbstractC166987dD.A14("No use case provider found");
            }
            throw AbstractC166987dD.A14("No viewer parameters found");
        }
        throw AbstractC166987dD.A14(AbstractC58317Pt9.A00(192));
    }
}
