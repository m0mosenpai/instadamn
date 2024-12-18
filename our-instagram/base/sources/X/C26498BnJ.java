package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.BnJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26498BnJ extends AbstractC51572Yf {
    public final InterfaceC16660sJ A00;
    public final InterfaceC16620sF A01;
    public final C51722Yv A02;
    public final UserSession A03;
    public final C41H A04;
    public final CUS A05;
    public final C79293ga A06;
    public final Integer A07;
    public final List A08;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        InterfaceC16660sJ A01 = AbstractC85303rL.A01(c76223bS, new DRQ(this, 27));
        InterfaceC16620sF A02 = AbstractC85303rL.A02(c76223bS, new C30495Dbe(this, 39));
        int intValue = this.A07.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                UserSession userSession = this.A03;
                List list = this.A08;
                C41H c41h = this.A04;
                C79293ga c79293ga = this.A06;
                return new C26618BpF(this.A02, userSession, c41h, this.A05, c79293ga, list, A01, A02);
            }
            throw B4Z.A00();
        }
        List list2 = this.A08;
        return new C26469Bmq(this.A02, this.A04, this.A05, this.A06, list2, A01, A02);
    }

    public C26498BnJ(C51722Yv c51722Yv, UserSession userSession, C41H c41h, CUS cus, C79293ga c79293ga, Integer num, List list, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        AbstractC167017dG.A1R(userSession, list);
        C14360o3.A0B(cus, 6);
        this.A07 = num;
        this.A03 = userSession;
        this.A08 = list;
        this.A04 = c41h;
        this.A06 = c79293ga;
        this.A05 = cus;
        this.A01 = interfaceC16620sF;
        this.A00 = interfaceC16660sJ;
        this.A02 = c51722Yv;
    }
}
