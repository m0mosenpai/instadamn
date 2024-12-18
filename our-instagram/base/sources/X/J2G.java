package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class J2G implements InterfaceC43457JHv {
    public final /* synthetic */ C5EE A00;

    public J2G(C5EE c5ee) {
        this.A00 = c5ee;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3n() {
        InterfaceC60442pS interfaceC60442pS;
        String str;
        C38641Gyi A00;
        User A14;
        C5EE c5ee = this.A00;
        UserSession userSession = c5ee.A02;
        String str2 = null;
        if (userSession == null || (interfaceC60442pS = c5ee.A03) == null) {
            return null;
        }
        C38321qM A02 = C1DW.A00(userSession).A02(c5ee.A01.Bet().A03);
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "IMPRESSION");
        if (A02 != null && (A14 = AbstractC25226BEj.A14(A02)) != null) {
            str2 = A14.getId();
        }
        c82713mZ.A4c = str2;
        if (A02 != null) {
            boolean A002 = Hx1.A00(A02, interfaceC60442pS);
            c82713mZ.A0N(A02.BRp());
            c82713mZ.A1f = Boolean.valueOf(!A002);
            if (A002 && (A00 = Hx7.A00(A02)) != null) {
                c82713mZ.A4T = A00.A00;
                c82713mZ.A7Q = A00.A05;
                c82713mZ.A78 = A00.A04;
            }
        }
        c82713mZ.A09(c5ee.A00);
        c82713mZ.A4y = interfaceC60442pS.getModuleName();
        if (A02 == null || (str = A02.getId()) == null) {
            str = c5ee.A01.Bet().A03;
        }
        c82713mZ.A61 = str;
        c82713mZ.A4F = AbstractC37302Gc3.A0V(c5ee.A01.Bet().A04);
        return new C82753md(c82713mZ);
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3o() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3p() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 BrL() {
        InterfaceC60442pS interfaceC60442pS;
        C38321qM A02;
        C38641Gyi A00;
        C5EE c5ee = this.A00;
        UserSession userSession = c5ee.A02;
        if (userSession == null || (interfaceC60442pS = c5ee.A03) == null || (A02 = C1DW.A00(userSession).A02(c5ee.A01.Bet().A03)) == null || !Hx1.A00(A02, interfaceC60442pS) || (A00 = Hx7.A00(A02)) == null) {
            return null;
        }
        return new J2P(null, A00.A05, null, null, AbstractC25232BEp.A1F(AbstractC111324zv.A00(5394), A00.A04, AbstractC166987dD.A1L("ad_id", A00.A00), AbstractC166987dD.A1L("media_id", A00.A03)), false);
    }
}
