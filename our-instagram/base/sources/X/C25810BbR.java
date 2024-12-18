package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.BbR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25810BbR extends C193578hc {
    public C28224CcU A00;
    public CQN A01;
    public final InterfaceC74953Yl A02;
    public final UserSession A03;
    public final CUp A04;
    public final C28374Cfc A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final C05A A09;
    public final C0UO A0A;

    public static final void A01(C25810BbR c25810BbR, int i, boolean z) {
        C38687GzS c38687GzS;
        Object value;
        C26080Bg9 A01;
        String A0p = AbstractC25230BEn.A0p(c25810BbR.A02);
        if (A0p.length() != 0) {
            C28224CcU A02 = ((C27270C1s) c25810BbR.A07.getValue()).A02();
            if (A02 != null && (c38687GzS = A02.A01) != null) {
                C05A c05a = c25810BbR.A09;
                do {
                    value = c05a.getValue();
                    A01 = C26080Bg9.A01((C26080Bg9) value, null, null, C6Q.A04, null, 47, false);
                } while (!c05a.AIi(value, A01));
                c25810BbR.A01 = new CQN(AbstractC25226BEj.A1L(new MC1(c38687GzS, c25810BbR, A0p, null, i, z), AbstractC141776au.A00(c25810BbR)), z);
                return;
            }
            A02(c25810BbR, C27237Bzw.A00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25810BbR(Application application, UserSession userSession, C28374Cfc c28374Cfc, String str) {
        super(application);
        Object value;
        C26080Bg9 A01;
        String str2;
        C8CT c8ct = new C8CT(userSession, application);
        C8CW c8cw = new C8CW(userSession);
        C8CX c8cx = new C8CX(application, userSession);
        AbstractC167027dH.A13(application, userSession, c28374Cfc);
        this.A03 = userSession;
        this.A05 = c28374Cfc;
        this.A06 = DH0.A00(c8ct, new C8CY(c8ct.A00), 33);
        this.A07 = DH0.A00(c8cw, new C8CY(c8cw.A00), 34);
        C17050sx A00 = DH0.A00(c8cx, new C8CY(c8cx.A00), 35);
        this.A08 = A00;
        EnumC193878i8 enumC193878i8 = AbstractC27759CMa.A00;
        CUp cUp = new CUp(userSession, (C27270C1s) this.A07.getValue(), (C27269C1r) A00.getValue(), c28374Cfc, enumC193878i8, null, false);
        this.A04 = cUp;
        C008002u A1H = AbstractC25225BEi.A1H(new C26080Bg9((InterfaceC30813Dgo) C29231Cua.A00, CYI.A00(userSession), (C28224CcU) null, C6Q.A02, (C5Hb) C5HZ.A01, false));
        this.A09 = A1H;
        this.A0A = A1H;
        String str3 = "";
        this.A02 = AbstractC25230BEn.A0U(AbstractC25227BEk.A0S(str == null ? "" : str));
        C27270C1s c27270C1s = (C27270C1s) this.A07.getValue();
        c27270C1s.A00 = enumC193878i8;
        C28224CcU c28224CcU = C27270C1s.A00(c27270C1s).A01;
        if (c28224CcU != null) {
            c27270C1s.A05(c28224CcU);
        }
        cUp.A01();
        C141796aw A002 = AbstractC141776au.A00(this);
        PYv pYv = new PYv(this, null, 41);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        AbstractC23641Du.A03(num, anonymousClass191, pYv, A002);
        AbstractC23641Du.A03(num, anonymousClass191, new PYv(this, null, 42), AbstractC141776au.A00(this));
        C27269C1r c27269C1r = (C27269C1r) this.A08.getValue();
        AbstractC18560vj.A03(AbstractC141776au.A00(this), C10Q.A03(new C57181PaA(this, (InterfaceC23621Ds) null, 5), AbstractC208910l.A01(C16930sl.A00, c27269C1r.A03, C10Q.A03(new C57182PaB(18, null), c27269C1r.A05, c27269C1r.A06), C10I.A01), ((C27269C1r) this.A08.getValue()).A07));
        AbstractC23641Du.A03(num, anonymousClass191, new PYv(this, null, 43), AbstractC141776au.A00(this));
        if (str != null && str.length() > 0) {
            InterfaceC74953Yl interfaceC74953Yl = this.A02;
            C5C3 A0G = AbstractC25233BEq.A0G(interfaceC74953Yl, str);
            C14360o3.A0B(A0G, 0);
            interfaceC74953Yl.Egh(A0G);
            this.A05.A07(null, num, AbstractC25230BEn.A0p(interfaceC74953Yl));
            A01(this, 2, false);
            return;
        }
        if (!((C27270C1s) this.A07.getValue()).A06()) {
            return;
        }
        C27270C1s c27270C1s2 = (C27270C1s) this.A07.getValue();
        C28224CcU c28224CcU2 = C27270C1s.A00(c27270C1s2).A01;
        c28224CcU2 = c28224CcU2 == null ? c27270C1s2.A02() : c28224CcU2;
        if (c28224CcU2 != null && (str2 = c28224CcU2.A05) != null) {
            str3 = str2;
        }
        C5C3 A0G2 = AbstractC25233BEq.A0G(this.A02, str3);
        C14360o3.A0B(A0G2, 0);
        this.A02.Egh(A0G2);
        do {
            value = A1H.getValue();
            A01 = C26080Bg9.A01((C26080Bg9) value, null, null, C6Q.A03, null, 47, false);
        } while (!A1H.AIi(value, A01));
    }

    public static final CRU A00(C25810BbR c25810BbR) {
        C28224CcU c28224CcU = (C28224CcU) ((C26080Bg9) c25810BbR.A0A.getValue()).A02;
        if (c28224CcU != null) {
            return c28224CcU.A03;
        }
        return null;
    }

    public static final void A02(C25810BbR c25810BbR, CPB cpb) {
        String A0p;
        Object value;
        C26080Bg9 c26080Bg9;
        C6Q c6q;
        C28224CcU c28224CcU;
        C0UO c0uo = c25810BbR.A0A;
        boolean A1X = AbstractC25228BEl.A1X(((C26080Bg9) c0uo.getValue()).A01);
        Application A0D = c25810BbR.A0D();
        C14360o3.A0B(cpb, 1);
        if (!(cpb instanceof C27231Bzq) || (A0p = ((C27231Bzq) cpb).A01) == null) {
            A0p = AbstractC166997dE.A0p(A0D, 2131965935);
        }
        CYI.A01(A0D, A0p, null);
        C05A c05a = c25810BbR.A09;
        do {
            value = c05a.getValue();
            c26080Bg9 = (C26080Bg9) value;
            if (A1X) {
                c6q = C6Q.A03;
            } else {
                c6q = C6Q.A02;
            }
            c28224CcU = c25810BbR.A00;
            if (c28224CcU == null) {
                c28224CcU = (C28224CcU) ((C26080Bg9) c0uo.getValue()).A02;
            }
        } while (!c05a.AIi(value, C26080Bg9.A01(c26080Bg9, null, c28224CcU, c6q, null, 46, false)));
    }
}
