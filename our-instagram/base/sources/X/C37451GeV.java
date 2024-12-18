package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GeV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37451GeV extends AbstractC42537IsG {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Ck5(C11520jB c11520jB, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        InterfaceC02590Ai A01;
        Long A0j;
        C38321qM c38321qM = (C38321qM) c1ni;
        if (!c38321qM.CdW() && this.A03) {
            UserSession userSession = this.A00;
            HashMap A00 = A00();
            AbstractC167017dG.A1N(userSession, interfaceC60442pS);
            A01 = AbstractC166987dD.A0f(AbstractC37302Gc3.A0H(interfaceC60442pS, new C12210kP(userSession)), "instagram_organic_impression_second_channel");
            if (A01.isSampled()) {
                AbstractC37303Gc4.A0f(A01, c38321qM);
                A01.A9M("two_measurement_debugging_fields", A00);
            } else {
                return;
            }
        } else {
            if (!c38321qM.CdW() || !this.A01) {
                return;
            }
            UserSession userSession2 = this.A00;
            HashMap A002 = A00();
            AbstractC167017dG.A1N(userSession2, interfaceC60442pS);
            A01 = AbstractC42537IsG.A01(interfaceC60442pS, new C12210kP(userSession2));
            if (!A01.isSampled()) {
                return;
            }
            AbstractC37303Gc4.A0f(A01, c38321qM);
            AbstractC37300Gc1.A0o(A01, AbstractC41071vF.A0F(userSession2, c38321qM));
            AbstractC37300Gc1.A0g(A01, AbstractC25233BEq.A0n(AbstractC41071vF.A07(userSession2, c38321qM)));
            A01.A9M("two_measurement_debugging_fields", A002);
            String A0H = AbstractC41071vF.A0H(userSession2, c38321qM.getId());
            if (A0H != null && (A0j = AbstractC166997dE.A0j(A0H)) != null) {
                A01.A9K("host_profile_id", A0j);
            }
        }
        A01.Cht();
    }

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Cls(C11520jB c11520jB, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        InterfaceC02590Ai A02;
        Long A0j;
        C38321qM c38321qM = (C38321qM) c1ni;
        if (!c38321qM.CdW() && this.A04) {
            UserSession userSession = this.A00;
            HashMap A00 = A00();
            AbstractC167017dG.A1N(userSession, interfaceC60442pS);
            A02 = AbstractC166987dD.A0f(AbstractC37302Gc3.A0H(interfaceC60442pS, new C12210kP(userSession)), "instagram_organic_sub_impression_second_channel");
            if (A02.isSampled()) {
                AbstractC37303Gc4.A0f(A02, c38321qM);
                A02.A9M("two_measurement_debugging_fields", A00);
            } else {
                return;
            }
        } else {
            if (!c38321qM.CdW() || !this.A02) {
                return;
            }
            UserSession userSession2 = this.A00;
            AbstractC167017dG.A1N(userSession2, interfaceC60442pS);
            A02 = AbstractC42537IsG.A02(interfaceC60442pS, new C12210kP(userSession2));
            if (!A02.isSampled()) {
                return;
            }
            AbstractC37303Gc4.A0f(A02, c38321qM);
            AbstractC37300Gc1.A0o(A02, AbstractC41071vF.A0F(userSession2, c38321qM));
            AbstractC37300Gc1.A0g(A02, AbstractC25233BEq.A0n(AbstractC41071vF.A07(userSession2, c38321qM)));
            String A0H = AbstractC41071vF.A0H(userSession2, c38321qM.getId());
            if (A0H != null && (A0j = AbstractC166997dE.A0j(A0H)) != null) {
                A02.A9K("host_profile_id", A0j);
            }
        }
        A02.Cht();
    }

    public C37451GeV(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = userSession;
        this.A03 = z;
        this.A01 = z3;
        this.A04 = z2;
        this.A02 = z4;
    }

    private HashMap A00() {
        double d;
        HashMap A1G = AbstractC166987dD.A1G();
        C70013Cl A00 = C70013Cl.A00(this.A00);
        A1G.put("last_action", A00.A01());
        A1G.put(AbstractC111324zv.A00(4811), A00.A02());
        synchronized (A00) {
            d = A00.A00;
        }
        A1G.put(AbstractC111324zv.A00(5252), String.valueOf(d));
        A1G.put("nav_chain", AbstractC25225BEi.A14());
        return A1G;
    }
}
