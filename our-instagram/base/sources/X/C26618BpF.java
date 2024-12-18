package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.BpF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26618BpF extends AbstractC77583di {
    public final C41H A00;
    public final CUS A01;
    public final C79293ga A02;
    public final List A03;
    public final InterfaceC16660sJ A04;
    public final InterfaceC16620sF A05;
    public final C51722Yv A06;
    public final UserSession A07;

    public C26618BpF(C51722Yv c51722Yv, UserSession userSession, C41H c41h, CUS cus, C79293ga c79293ga, List list, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(userSession, 1);
        AbstractC25234BEr.A1R(list, c41h, c79293ga, cus, interfaceC16620sF);
        AbstractC167007dF.A1I(interfaceC16660sJ, 7, c51722Yv);
        this.A07 = userSession;
        this.A03 = list;
        this.A00 = c41h;
        this.A02 = c79293ga;
        this.A01 = cus;
        this.A05 = interfaceC16620sF;
        this.A04 = interfaceC16660sJ;
        this.A06 = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        Object A00 = AbstractC77183d4.A00(c77993eR, new J7K(c77993eR, 47), new Object[]{this.A00.A0H});
        boolean A06 = C18U.A06(C06090Tz.A05, this.A07, 36329302995779836L);
        Object A002 = AbstractC77183d4.A00(c77993eR, new J7K(this, 48), new Object[]{this.A05, this.A04});
        long A0D = AbstractC25229BEm.A0D();
        return AbstractC25225BEi.A0g(this.A06, new C2YW(A0D, A0D), AbstractC25229BEm.A0c(c77993eR, AbstractC25227BEk.A0d(new C28964CqF(A06), 2, true), DCG.A00, new C50364MLq(27, A002, A00, this)));
    }
}
