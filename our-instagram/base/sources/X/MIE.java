package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class MIE extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIE(UserSession userSession, C47616L1b c47616L1b, int i, int i2, long j) {
        super(1);
        this.A00 = i2;
        this.A04 = c47616L1b;
        this.A02 = j;
        this.A01 = i;
        this.A03 = userSession;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            C47616L1b c47616L1b = (C47616L1b) this.A04;
            long j = this.A02;
            int i = this.A01;
            UserSession userSession = (UserSession) this.A03;
            return C43597JQd.A02(C43597JQd.A01(c47616L1b.A00, new MIE(userSession, c47616L1b, i, 0, j), 54), new C65021Tc7(j, c47616L1b, userSession, 6), 54).A0K(new C43597JQd((Long) obj, 55));
        }
        C5Fn A00 = AbstractC137146It.A00("setIGE2EEEligibility");
        C47616L1b c47616L1b2 = (C47616L1b) this.A04;
        long j2 = this.A02;
        return C42221xC.A07(new C48460LcD((C133255zr) obj, (UserSession) this.A03, c47616L1b2, this.A01, j2), A00);
    }
}
