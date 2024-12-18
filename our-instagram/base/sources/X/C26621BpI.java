package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.BpI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26621BpI extends AbstractC77583di {
    public final UserSession A00;
    public final InterfaceC101004gG A01;
    public final C42644Iu1 A02;
    public final InterfaceC60442pS A03;
    public final C75113Zb A04;
    public final int A05;
    public final int A06;
    public final C51722Yv A07;
    public final C38321qM A08;
    public final C57332k8 A09;
    public final List A0A;
    public final boolean A0B;

    public C26621BpI(C51722Yv c51722Yv, UserSession userSession, InterfaceC101004gG interfaceC101004gG, C42644Iu1 c42644Iu1, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C57332k8 c57332k8, List list, int i, int i2, boolean z) {
        AbstractC25229BEm.A1K(c38321qM, 3, interfaceC101004gG);
        this.A07 = c51722Yv;
        this.A00 = userSession;
        this.A08 = c38321qM;
        this.A06 = i;
        this.A05 = i2;
        this.A0A = list;
        this.A0B = z;
        this.A04 = c75113Zb;
        this.A03 = interfaceC60442pS;
        this.A01 = interfaceC101004gG;
        this.A09 = c57332k8;
        this.A02 = c42644Iu1;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, X.2YT] */
    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        C101024gI c101024gI = new C101024gI(this.A00, this.A01, this.A09);
        C38321qM c38321qM = this.A08;
        C75113Zb c75113Zb = this.A04;
        List list = this.A0A;
        C101044gK A00 = c101024gI.A00(AbstractC25227BEk.A0A(c77993eR), c38321qM, this.A03, c75113Zb, null, null, list, c38321qM.A3U(), c38321qM.A3T(), c38321qM.A3V(), this.A06, this.A05, false, false, this.A0B, false);
        C5H8 BHc = AbstractC25225BEi.A0x(list, AbstractC25229BEm.A09(list)).A0C.BHc();
        return AbstractC25225BEi.A0g(this.A07, new Object(), AbstractC25229BEm.A0c(c77993eR, AbstractC25230BEn.A0i(new C28963CqE(this), 4), DCB.A00, new C50372MLz(45, c77993eR, this, A00, BHc)));
    }
}
