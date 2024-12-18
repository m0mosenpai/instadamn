package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Eip, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33090Eip extends C4A7 {
    public final C92694De A00;
    public final UserSession A01;
    public final C23031Ai A02;
    public final Integer A03;
    public final String A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33090Eip(UserSession userSession, Integer num, String str) {
        super("Direct", C4A8.A00(994363717));
        boolean z;
        C008002u A1H;
        int A06 = AbstractC167007dF.A06(1, userSession, str);
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = num;
        C32811EcF c32811EcF = C32811EcF.A00;
        C008002u A00 = C10E.A00(c32811EcF);
        this.A05 = A00;
        this.A07 = AbstractC208910l.A02(A00);
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        this.A02 = A002;
        int A0H = AbstractC166987dD.A0H(AbstractC31171DnF.A0Y(A002, A002.A6l, C23031Ai.A8c, 477));
        if (A0H != 1) {
            if (A0H != A06) {
                A1H = C10E.A00(c32811EcF);
                this.A06 = A1H;
                this.A08 = AbstractC208910l.A02(A1H);
                this.A00 = AbstractC166177bl.A00(C92674Dc.A00);
            }
            z = false;
        } else {
            z = true;
        }
        A1H = AbstractC25225BEi.A1H(new C32807EcB(z));
        this.A06 = A1H;
        this.A08 = AbstractC208910l.A02(A1H);
        this.A00 = AbstractC166177bl.A00(C92674Dc.A00);
    }

    public final Object A00(InterfaceC23621Ds interfaceC23621Ds) {
        this.A06.Egh(new C32807EcB(true));
        this.A02.A0Z(1);
        C92694De c92694De = this.A00;
        C50537MSq c50537MSq = new C50537MSq(this, null, 7);
        C0eB c0eB = C0eB.A00;
        Object A00 = c92694De.A00(c0eB, interfaceC23621Ds, c50537MSq);
        if (A00 != C1JX.A02) {
            return c0eB;
        }
        return A00;
    }
}
