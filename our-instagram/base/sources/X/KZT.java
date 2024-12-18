package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class KZT extends C4A7 {
    public final AbstractC59962oe A00;
    public final C006802i A01;
    public final C41761wQ A02;
    public final UserSession A03;
    public final C47032Dr A04;
    public final MQ1 A05;
    public final C4I3 A06;
    public final C05A A07;
    public final C0UO A08;
    public final MSH A09;
    public final C48747LhF A0A;

    public KZT(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        this();
        int i;
        this.A03 = userSession;
        this.A00 = abstractC59962oe;
        C008002u A1H = AbstractC25225BEi.A1H(new C51760Mtj(C05F.A00));
        this.A07 = A1H;
        this.A08 = AbstractC208910l.A02(A1H);
        this.A01 = AbstractC43592JPx.A0N();
        C47032Dr c47032Dr = C47032Dr.A00;
        this.A04 = c47032Dr;
        C4I3 c4i3 = C4I3.A03;
        this.A06 = c4i3;
        C48747LhF c48747LhF = new C48747LhF();
        this.A0A = c48747LhF;
        C48741Lh9 c48741Lh9 = new C48741Lh9(this);
        this.A09 = c48741Lh9;
        boolean A03 = AbstractC47132Ef.A00(userSession).A03();
        C49261LqH A00 = AbstractC46897Koe.A00(abstractC59962oe, userSession, c48741Lh9, c48747LhF);
        MQ1 mq1 = A00;
        if (A03) {
            if (AbstractC137186Ix.A00(userSession)) {
                i = c47032Dr.A00;
            } else {
                i = -1;
            }
            C43632JRq c43632JRq = new C43632JRq(userSession, new C49209LpQ(), 0, i, false);
            JRX jrx = new JRX(c43632JRq.A05.A01.A0K(C43619JRc.A00), C41951wl.A00(userSession).A01(), AbstractC31180DnO.A0J(userSession, C4HC.A00), AbstractC142856cl.A00, userSession, new C44043JdU(abstractC59962oe.requireContext(), userSession, c48741Lh9, AbstractC43930Jbf.A00(userSession, AbstractC209129Mu.A00(userSession)), new C43950Jbz(null), C41951wl.A00(userSession)), c47032Dr, c4i3, false, false, false);
            C43631JRo c43631JRo = A00.A00;
            C43787JYa c43787JYa = A00.A01;
            mq1 = new C49260LqG(new JSI(c43787JYa.Eq6(), userSession, c43631JRo, c43632JRq), new JYZ(userSession, c43787JYa, jrx));
        }
        MQ1 mq12 = mq1;
        this.A05 = mq12;
        C41761wQ c41761wQ = new C41761wQ(null);
        this.A02 = c41761wQ;
        mq12.BOD().start();
        MSJ C7c = mq12.C7c();
        C7c.start();
        JQn.A00(C43597JQd.A00(C7c.FDh().A0H(new C43923JbY(this, 3)), this, 61), c41761wQ, this, 56);
    }

    public static final void A00(KZT kzt, Integer num) {
        C05A c05a = kzt.A07;
        C51760Mtj c51760Mtj = (C51760Mtj) c05a.getValue();
        c05a.Egh(C51760Mtj.A03((Integer) c51760Mtj.A01, num, (List) c51760Mtj.A02));
    }

    public KZT() {
        super("DIRECT_THREAD_DELETION", C4A8.A00(1684807233));
    }
}
