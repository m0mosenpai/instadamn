package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mgx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51045Mgx extends AbstractC52922bZ {
    public final CallerContext A00;
    public final UserSession A01;
    public final OJY A02;
    public final C196058lv A03;
    public final C173467ny A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;
    public final InterfaceC41501vz A09;
    public final InterfaceC41501vz A0A;
    public final InterfaceC41501vz A0B;
    public final InterfaceC41501vz A0C;
    public final C52458NJc A0D;
    public final C23031Ai A0E;

    public C51045Mgx(UserSession userSession, OJY ojy, C52458NJc c52458NJc, C196058lv c196058lv, C173467ny c173467ny, C23031Ai c23031Ai) {
        AbstractC167007dF.A1D(userSession, 1, c52458NJc);
        C14360o3.A0B(c196058lv, 3);
        AbstractC25229BEm.A1I(c23031Ai, 4, c173467ny);
        this.A01 = userSession;
        this.A0D = c52458NJc;
        this.A03 = c196058lv;
        this.A0E = c23031Ai;
        this.A02 = ojy;
        this.A04 = c173467ny;
        this.A00 = CallerContext.A01("FeedXpostViewModel");
        C008002u A1H = AbstractC25225BEi.A1H(new C51713Msi(null, null, null, false, false, false, false));
        this.A05 = A1H;
        this.A07 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(new C50569MUa(ojy, (InterfaceC173987oq) null, 0, A03(this), true));
        this.A06 = A1H2;
        this.A08 = A1H2;
        C56035Ou7 A00 = C56035Ou7.A00(this, 63);
        this.A09 = A00;
        C56035Ou7 A002 = C56035Ou7.A00(this, 64);
        this.A0A = A002;
        C56035Ou7 A003 = C56035Ou7.A00(this, 65);
        this.A0B = A003;
        C56035Ou7 A004 = C56035Ou7.A00(this, 66);
        this.A0C = A004;
        if (AbstractC55222Oeo.A0A(userSession)) {
            C25671My A005 = AbstractC25651Mw.A00(userSession);
            A005.A01(A00, C56000OtX.class);
            A005.A01(A002, C36111Fwl.class);
            A005.A01(A003, C55987OtK.class);
            A005.A01(A004, C55984OtH.class);
            A00(this);
            PZT.A02(this, PZT.A01(this, AbstractC141776au.A00(this), 3), AbstractC141776au.A00(this), 4);
            c173467ny.A01();
        }
    }

    public static final void A00(C51045Mgx c51045Mgx) {
        Object value;
        C131975xX c131975xX = C131965xW.A05;
        UserSession userSession = c51045Mgx.A01;
        boolean z = false;
        if (!C131975xX.A00(userSession).A0C(userSession) && EnumC53382NjX.A05.A09(userSession) && C196218mC.A00(userSession)) {
            z = true;
        }
        C05A c05a = c51045Mgx.A05;
        do {
            value = c05a.getValue();
        } while (!C51713Msi.A00((C51713Msi) value, value, c05a, z));
    }

    public static final void A01(C51045Mgx c51045Mgx) {
        Object value;
        C51713Msi c51713Msi;
        boolean A0C;
        boolean z;
        boolean z2;
        C05A c05a = c51045Mgx.A05;
        do {
            value = c05a.getValue();
            c51713Msi = (C51713Msi) value;
            C131975xX c131975xX = C131965xW.A05;
            UserSession userSession = c51045Mgx.A01;
            A0C = C131975xX.A00(userSession).A0C(userSession);
            z = c51713Msi.A06;
            z2 = c51713Msi.A04;
        } while (!c05a.AIi(value, new C51713Msi(c51713Msi.A00, c51713Msi.A01, c51713Msi.A02, z, z2, c51713Msi.A03, A0C)));
    }

    public static final void A02(C51045Mgx c51045Mgx, boolean z) {
        Object value;
        boolean A03;
        int i;
        InterfaceC173987oq interfaceC173987oq;
        OJY ojy;
        C05A c05a = c51045Mgx.A06;
        do {
            value = c05a.getValue();
            C50569MUa c50569MUa = (C50569MUa) value;
            A03 = A03(c51045Mgx);
            i = c50569MUa.A01 + 1;
            interfaceC173987oq = (InterfaceC173987oq) c50569MUa.A02;
            ojy = (OJY) c50569MUa.A03;
            C14360o3.A0B(ojy, 1);
        } while (!c05a.AIi(value, new C50569MUa(ojy, interfaceC173987oq, i, A03, z)));
    }

    public static final boolean A03(C51045Mgx c51045Mgx) {
        InterfaceC173987oq CI6;
        if (!AbstractC166997dE.A1Z(AbstractC31171DnF.A0T(c51045Mgx.A01, C17060sy.A01).BCH(), false)) {
            return false;
        }
        C173467ny c173467ny = c51045Mgx.A04;
        if (!c173467ny.A00) {
            return false;
        }
        InterfaceC173487o0 interfaceC173487o0 = (InterfaceC173487o0) c173467ny.A02.getValue();
        if (interfaceC173487o0 != null && (CI6 = interfaceC173487o0.CI6()) != null && CI6.getId() != null) {
            return false;
        }
        return true;
    }

    public final void A04() {
        C52458NJc c52458NJc = this.A0D;
        C47Z c47z = c52458NJc.A00;
        if (c47z != null) {
            C51754Mtd A02 = c52458NJc.A02();
            OV5 ov5 = OV5.A00;
            UserSession userSession = this.A01;
            OJY ojy = this.A02;
            Integer A00 = ov5.A00(userSession, c47z, ojy.A02, ojy.A03, AbstractC167007dF.A1W(A02.A08));
            C14360o3.A0B(A00, 0);
            ojy.A01 = A00;
            A02(this, AbstractC167007dF.A1X(A00, C05F.A00));
        }
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        C25671My A00 = AbstractC25651Mw.A00(this.A01);
        A00.A02(this.A09, C56000OtX.class);
        A00.A02(this.A0A, C36111Fwl.class);
        A00.A02(this.A0B, C55987OtK.class);
        A00.A02(this.A0C, C55984OtH.class);
    }
}
