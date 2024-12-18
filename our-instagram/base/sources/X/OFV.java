package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OFV {
    public final C55702OoU A00;
    public final C73653Rr A01;
    public final C55700OoS A02;
    public final InterfaceC73623Ro A03;
    public final C3SB A04;
    public final C73663Rs A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC19630xq A0A;
    public final C1CM A0B;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.OoS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.3SB, java.lang.Object] */
    public OFV(UserSession userSession, Context context) {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A07 = C57545PgJ.A00(userSession, enumC09460dv, 22);
        this.A08 = C57545PgJ.A00(this, enumC09460dv, 23);
        C1CM c1cm = new C1CM(context);
        this.A0B = c1cm;
        this.A06 = AbstractC09440dt.A00(enumC09460dv, C57300PcM.A00);
        this.A03 = new C55701OoT((C4QF) this.A08.getValue());
        this.A00 = new C55702OoU(c1cm);
        this.A01 = new C73653Rr((C0JM) AbstractC166987dD.A17(this.A06));
        this.A02 = new Object();
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(C1AV.A25, C73663Rs.class);
        this.A0A = A04;
        this.A05 = new C73663Rs((C0JM) AbstractC166987dD.A17(this.A06), A04);
        this.A04 = new Object();
        this.A09 = C57545PgJ.A00(this, enumC09460dv, 24);
    }
}
