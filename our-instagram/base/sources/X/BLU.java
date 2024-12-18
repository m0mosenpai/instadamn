package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BLU implements InterfaceC31045Dkj {
    public InterfaceC16660sJ A00;
    public final UserSession A01;
    public final C99694dm A02;

    public BLU(UserSession userSession, C99694dm c99694dm) {
        C14360o3.A0B(c99694dm, 2);
        this.A01 = userSession;
        this.A02 = c99694dm;
    }

    @Override // X.InterfaceC31045Dkj
    public final void DIY(BL4 bl4) {
        C14360o3.A0B(bl4, 0);
        AbstractC99684dl.A00(this.A01).A09(bl4.A00, C05F.A08, bl4.A01);
    }

    @Override // X.InterfaceC31045Dkj
    public final void Dpf(BL4 bl4) {
        C14360o3.A0B(bl4, 0);
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        if (interfaceC16660sJ != null) {
            C99694dm c99694dm = this.A02;
            Integer num = C05F.A08;
            String str = bl4.A00;
            c99694dm.A08(str, num, bl4.A01);
            interfaceC16660sJ.invoke(str);
        }
    }

    @Override // X.InterfaceC31045Dkj
    public final void EXT(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
