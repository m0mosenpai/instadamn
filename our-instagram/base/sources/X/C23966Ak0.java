package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ak0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23966Ak0 implements BDT {
    public Integer A00;
    public final UserSession A01;
    public final C23383AYh A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public final Integer A01() {
        Integer num = this.A00;
        if (num == C05F.A00) {
            if (((OKP) this.A04.getValue()).A01(this.A02).length() == 0) {
                num = C05F.A01;
            } else {
                num = C05F.A0C;
            }
            this.A00 = num;
        }
        return num;
    }

    public C23966Ak0(UserSession userSession, C23383AYh c23383AYh) {
        AbstractC167017dG.A1P(userSession, c23383AYh);
        this.A01 = userSession;
        this.A02 = c23383AYh;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C57241PbP(this, 29));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C57241PbP(this, 28));
        this.A00 = C05F.A00;
    }

    private final void A00() {
        Integer A01 = A01();
        Integer num = C05F.A0C;
        if (A01 != num) {
            if (!AbstractC2046994d.A00(this.A01).A01(AbstractC166987dD.A1J(this.A02)).A02) {
                num = C05F.A01;
            }
            this.A00 = num;
        }
    }

    @Override // X.BDT
    public final void ChG() {
        A00();
    }

    @Override // X.BDT
    public final boolean Cpl() {
        return AbstractC167007dF.A1X(A01(), C05F.A0C);
    }

    @Override // X.BDT
    public final C3SN EJG(List list) {
        A00();
        if (A01() == C05F.A0C) {
            return ((InterfaceC73523Rd) this.A03.getValue()).E5A(null, list);
        }
        throw new Exception("pyTorch predictor was not ready");
    }
}
