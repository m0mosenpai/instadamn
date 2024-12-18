package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OFt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54742OFt {
    public final C55701OoT A00;
    public final C55702OoU A01;
    public final C73653Rr A02;
    public final C55700OoS A03;
    public final C3SB A04;
    public final C73663Rs A05;
    public final C73613Rn A06;
    public final C4QF A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC19630xq A0J;
    public final C1CM A0K;

    /* JADX WARN: Type inference failed for: r0v19, types: [X.OoS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.3SB, java.lang.Object] */
    public C54742OFt(UserSession userSession, Context context) {
        C4QF c4qf = (C4QF) C4QD.A00(userSession).A02.getValue();
        this.A07 = c4qf;
        C1CM c1cm = new C1CM(context);
        this.A0K = c1cm;
        this.A0A = AbstractC09440dt.A01(C57297PcJ.A00);
        this.A0F = C57545PgJ.A01(this, 7);
        this.A08 = C57545PgJ.A01(userSession, 1);
        this.A06 = new C73613Rn((InterfaceC73603Rm) this.A0F.getValue(), ((C3RT) this.A08.getValue()).CDV());
        this.A0E = C57545PgJ.A01(userSession, 6);
        this.A00 = new C55701OoT(c4qf);
        this.A01 = new C55702OoU(c1cm);
        this.A02 = new C73653Rr((C0JM) AbstractC166987dD.A17(this.A0A));
        this.A03 = new Object();
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(C1AV.A25, C73663Rs.class);
        this.A0J = A04;
        this.A05 = new C73663Rs((C0JM) AbstractC166987dD.A17(this.A0A), A04);
        this.A04 = new Object();
        this.A0I = C57545PgJ.A01(this, 8);
        this.A0B = C57545PgJ.A01(userSession, 3);
        this.A0G = AbstractC09440dt.A01(new C57254Pbc(14, userSession, this));
        this.A0H = AbstractC09440dt.A01(new C57254Pbc(15, userSession, this));
        this.A0D = C57545PgJ.A01(this, 5);
        this.A09 = C57545PgJ.A01(this, 2);
        this.A0C = C57545PgJ.A01(this, 4);
    }
}
