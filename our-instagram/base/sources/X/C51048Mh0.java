package X;

import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Mh0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51048Mh0 extends AbstractC52922bZ {
    public boolean A00;
    public boolean A01;
    public final BP5 A02;
    public final C147236jz A03;
    public final OB0 A04;
    public final OCK A05;
    public final OKW A06;
    public final C54569O8v A07;
    public final C54705OEh A08;
    public final OUT A09;
    public final C54479O5h A0A;
    public final OIA A0B;
    public final C19L A0C;
    public final InterfaceC06180Ui A0D;
    public final C05A A0E;
    public final InterfaceC15070pN A0F;
    public final C0UO A0G;

    public C51048Mh0(BP5 bp5, C147236jz c147236jz, OB0 ob0, OCK ock, OKW okw, C54569O8v c54569O8v, C54705OEh c54705OEh, OUT out, C54479O5h c54479O5h, OIA oia) {
        int A06 = AbstractC167007dF.A06(1, ob0, ock);
        AbstractC167007dF.A1G(okw, 3, c54569O8v);
        this.A04 = ob0;
        this.A05 = ock;
        this.A06 = okw;
        this.A0A = c54479O5h;
        this.A07 = c54569O8v;
        this.A09 = out;
        this.A0B = oia;
        this.A03 = c147236jz;
        this.A08 = c54705OEh;
        this.A02 = bp5;
        C56749PGr c56749PGr = C56749PGr.A00;
        Integer num = C05F.A00;
        C008002u A1H = AbstractC25225BEi.A1H(new C51943MxQ(c56749PGr, num, false));
        this.A0E = A1H;
        this.A0G = AbstractC208910l.A02(A1H);
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A0D = A00;
        this.A0F = new C06160Ug(null, A00);
        C141796aw A002 = AbstractC141776au.A00(this);
        PZE pze = new PZE(this, null, 1);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A03(num, anonymousClass191, pze, A002);
        AbstractC23641Du.A03(num, anonymousClass191, new PZE(this, null, A06), AbstractC141776au.A00(this));
        AbstractC23641Du.A03(num, anonymousClass191, new PZE(this, null, 3), AbstractC141776au.A00(this));
        this.A0C = AnonymousClass194.A02(AbstractC141776au.A00(this).A00);
    }

    public static final C51932MxF A00(C51048Mh0 c51048Mh0) {
        InterfaceC57873Pld interfaceC57873Pld = (InterfaceC57873Pld) c51048Mh0.A04.A02.getValue();
        if (interfaceC57873Pld instanceof C51932MxF) {
            return (C51932MxF) interfaceC57873Pld;
        }
        return null;
    }

    public static final String A01(C51048Mh0 c51048Mh0) {
        C51932MxF c51932MxF;
        C41181vS c41181vS;
        C38321qM c38321qM;
        InterfaceC57873Pld interfaceC57873Pld = (InterfaceC57873Pld) c51048Mh0.A04.A02.getValue();
        if (!(interfaceC57873Pld instanceof C51932MxF) || (c51932MxF = (C51932MxF) interfaceC57873Pld) == null || (c41181vS = c51932MxF.A01) == null || (c38321qM = c41181vS.A0b) == null) {
            return null;
        }
        return c38321qM.getId();
    }

    public static final void A02(C51048Mh0 c51048Mh0) {
        String str;
        Integer num;
        User user;
        C51942MxP c51942MxP;
        C51932MxF A00;
        User A002;
        C51932MxF A003;
        C38321qM c38321qM;
        String A01;
        OIA oia = c51048Mh0.A0B;
        String str2 = "";
        if (!oia.A00() || (A01 = A01(c51048Mh0)) == null || (str = AbstractC166987dD.A1A(A01, c51048Mh0.A09.A04.A00)) == null) {
            str = "";
        }
        C05A c05a = c51048Mh0.A0E;
        InterfaceC57873Pld interfaceC57873Pld = (InterfaceC57873Pld) c51048Mh0.A04.A02.getValue();
        if (!(interfaceC57873Pld instanceof C51932MxF)) {
            num = C05F.A00;
        } else {
            if (C55166OdU.A02(c51048Mh0.A09, c51048Mh0.A0A, AbstractC54229NyA.A00((C51932MxF) interfaceC57873Pld))) {
                num = C05F.A0C;
            } else if (C18U.A06(C06090Tz.A05, oia.A00, 36320691586343732L)) {
                num = C05F.A0N;
            } else {
                num = C05F.A01;
            }
        }
        C51932MxF A004 = A00(c51048Mh0);
        if (A004 != null) {
            user = AbstractC54229NyA.A00(A004);
        } else {
            user = null;
        }
        boolean z = true;
        c05a.Egh(new C51942MxP(C55166OdU.A00(c51048Mh0.A03, c51048Mh0.A0A, user, null, false, false), C56751PGt.A00, num, str, !AbstractC001900j.A0T(str)));
        OKW okw = c51048Mh0.A06;
        if (str.length() != 0) {
            z = false;
        }
        okw.A00(z);
        okw.A01(false);
        C141796aw A005 = AbstractC141776au.A00(c51048Mh0);
        PZE pze = new PZE(c51048Mh0, null, 5);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, pze, A005);
        Object value = c51048Mh0.A0G.getValue();
        String str3 = null;
        if ((value instanceof C51942MxP) && (c51942MxP = (C51942MxP) value) != null && (A00 = A00(c51048Mh0)) != null && (A002 = AbstractC54229NyA.A00(A00)) != null) {
            C150866ql c150866ql = oia.A01;
            if (A002.CS0(c150866ql)) {
                BP5.A00(c51048Mh0.A02, AbstractC25231BEo.A0k(A002), AbstractC111324zv.A00(5422));
            }
            if (A002.CS0(c150866ql)) {
                if (C18U.A06(C06090Tz.A05, oia.A00, 36323672294174180L)) {
                    c51048Mh0.A00 = true;
                    User A006 = AbstractC54229NyA.A00(A00);
                    if (A006 != null) {
                        str2 = A006.B8y();
                    }
                    User A007 = AbstractC54229NyA.A00(A00);
                    if (A007 != null) {
                        str3 = A007.getId();
                    }
                    C51938MxL c51938MxL = new C51938MxL(str2, str3);
                    InterfaceC57875Plf interfaceC57875Plf = c51942MxP.A00;
                    String str4 = c51942MxP.A03;
                    Integer num2 = c51942MxP.A02;
                    boolean z2 = c51942MxP.A04;
                    AbstractC167027dH.A12(interfaceC57875Plf, str4, num2);
                    c05a.Egh(new C51942MxP(interfaceC57875Plf, c51938MxL, num2, str4, z2));
                    return;
                }
            }
            if (!C18U.A06(C06090Tz.A05, oia.A00, 36323693768879608L) || (A003 = A00(c51048Mh0)) == null || (c38321qM = A003.A01.A0b) == null) {
                return;
            }
            AbstractC23641Du.A05(anonymousClass191, new C57158PZc(c38321qM, c51048Mh0, null, 13), AbstractC141776au.A00(c51048Mh0));
        }
    }

    public static final void A03(C51048Mh0 c51048Mh0) {
        C51941MxO c51941MxO;
        Object value = c51048Mh0.A0G.getValue();
        if ((value instanceof C51941MxO) && (c51941MxO = (C51941MxO) value) != null) {
            C05A c05a = c51048Mh0.A0E;
            C51942MxP c51942MxP = c51941MxO.A00;
            c05a.Egh(c51942MxP);
            c51048Mh0.A06.A00(AbstractC167007dF.A1N(c51942MxP.A03.length()));
            PZE.A02(c51048Mh0, AbstractC141776au.A00(c51048Mh0), 6);
        }
    }

    public static final void A04(C51048Mh0 c51048Mh0) {
        C51942MxP c51942MxP;
        Object value = c51048Mh0.A0G.getValue();
        if ((value instanceof C51942MxP) && (c51942MxP = (C51942MxP) value) != null) {
            c51048Mh0.A0E.Egh(new C51941MxO(c51942MxP));
        }
    }

    public static final void A05(C51048Mh0 c51048Mh0, boolean z, boolean z2) {
        String str;
        String str2;
        C51942MxP c51942MxP;
        if (z2) {
            Object value = c51048Mh0.A0G.getValue();
            if (!(value instanceof C51942MxP) || (c51942MxP = (C51942MxP) value) == null || (str2 = c51942MxP.A03) == null || AbstractC001900j.A0T(str2)) {
                str2 = null;
            }
            String A01 = A01(c51048Mh0);
            if (A01 != null) {
                Map map = c51048Mh0.A09.A04.A00;
                if (str2 != null) {
                    map.put(A01, str2);
                } else {
                    map.remove(A01);
                }
            }
        }
        C05A c05a = c51048Mh0.A0E;
        C55166OdU c55166OdU = C55166OdU.A00;
        InterfaceC57873Pld interfaceC57873Pld = (InterfaceC57873Pld) c51048Mh0.A04.A02.getValue();
        C54479O5h c54479O5h = c51048Mh0.A0A;
        C147236jz c147236jz = c51048Mh0.A03;
        OIA oia = c51048Mh0.A0B;
        OUT out = c51048Mh0.A09;
        String A012 = A01(c51048Mh0);
        if (A012 != null) {
            str = AbstractC166987dD.A1A(A012, out.A04.A00);
        } else {
            str = null;
        }
        c05a.Egh(c55166OdU.A03(c147236jz, interfaceC57873Pld, out, c54479O5h, oia, str));
        PZK.A01(c51048Mh0, AbstractC141776au.A00(c51048Mh0), 3, z);
    }
}
