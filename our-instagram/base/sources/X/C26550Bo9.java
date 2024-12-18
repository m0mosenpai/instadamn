package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Bo9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26550Bo9 extends AbstractC51572Yf {
    public final FoaUserSession A00;
    public final InterfaceC16660sJ A01;
    public final boolean A02;
    public final C28274CdJ A03;

    public C26550Bo9(FoaUserSession foaUserSession, C28274CdJ c28274CdJ, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(c28274CdJ, 2);
        this.A00 = foaUserSession;
        this.A03 = c28274CdJ;
        this.A02 = z;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C26567BoQ c26567BoQ;
        C2WH c2wh;
        C2WH c2wh2;
        C2WH c2wh3;
        C14360o3.A0B(c76223bS, 0);
        C27947CTg A01 = CXC.A01(c76223bS, AbstractC43591JPw.A00(65), AbstractC85303rL.A01(c76223bS, C30182DRn.A01(this, 43)));
        C3e8 c3e8 = C3e8.SPACE_AROUND;
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(num, 100.0f, 0));
        Integer num2 = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(A0h, num2, 100.0f, 0);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        long A0D = AbstractC25229BEm.A0D();
        C2XE c2xe = A12.A00;
        BOO boo = new BOO(c2xe, new C51632Yl());
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        A0P.A00(new C26330Bkb(AbstractC25233BEq.A0Z(AbstractC25233BEq.A0Z(null, num, 257.0d, 0), num2, 163.0d, 0), C87.A08));
        long A0E = AbstractC25229BEm.A0E();
        Integer num3 = C05F.A0G;
        C51722Yv A00 = C9CU.A00(null, num3, 0, A0E);
        String A0F = AbstractC77623dm.A0F(A0P, 2131966182);
        C88 c88 = C88.A0Z;
        Integer num4 = C05F.A04;
        long A0B = AbstractC25229BEm.A0B();
        C93E c93e = C93E.CENTER;
        A0P.A00(new C26567BoQ(A00, c93e, c88, A0F, num4, 0, A0B, A0B));
        boolean z = this.A02;
        if (z) {
            c26567BoQ = new C26567BoQ(C9CU.A00(null, num3, 0, A0E), c93e, c88, AbstractC77623dm.A0F(A0P, 2131966189), num3, 0, A0B, A0B);
        } else {
            c26567BoQ = null;
        }
        A0P.A00(c26567BoQ);
        if (!z) {
            c2wh = A03(A0P, C87.A0d, AbstractC77623dm.A0F(A0P, 2131966184), AbstractC77623dm.A0F(A0P, 2131966183));
        } else {
            c2wh = null;
        }
        A0P.A00(c2wh);
        if (!z) {
            c2wh2 = A03(A0P, C87.A0c, AbstractC77623dm.A0F(A0P, 2131966188), AbstractC77623dm.A0F(A0P, 2131966187));
        } else {
            c2wh2 = null;
        }
        A0P.A00(c2wh2);
        if (!z) {
            c2wh3 = A03(A0P, C87.A04, AbstractC77623dm.A0F(A0P, 2131966186), AbstractC77623dm.A0F(A0P, 2131966185));
        } else {
            c2wh3 = null;
        }
        A0P.A00(c2wh3);
        boo.A0A(AbstractC76963ci.A08(A0P, A12, null, c3e8));
        int A08 = AbstractC25228BEl.A08(A12, 9221401712017801216L);
        C51632Yl c51632Yl = boo.A01;
        c51632Yl.A01 = A08;
        c51632Yl.A05 = false;
        c51632Yl.A06 = true;
        c51632Yl.A08 = false;
        c51632Yl.A04 = true;
        c51632Yl.A00 = AbstractC25228BEl.A08(A12, A0D);
        c51632Yl.A07 = false;
        c51632Yl.A03 = null;
        AbstractC77733dx.A00(boo.A02, boo.A03, 1);
        boo.A03();
        C14360o3.A0A(c51632Yl);
        A12.A00(c51632Yl);
        C3e8 c3e82 = C3e8.FLEX_END;
        C51722Yv A002 = C9CU.A00(AbstractC25230BEn.A0d(AbstractC25234BEr.A0B(null, AbstractC25225BEi.A0m(num2, 1.0f, 1), 0.0f), num, 100.0f, 0), C05F.A0A, 0, AbstractC25230BEn.A0J());
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
        C51722Yv A003 = C9CU.A00(null, num3, 0, A0E);
        String A0F2 = AbstractC77623dm.A0F(A0P2, 2131966192);
        Context A004 = AbstractC77363dM.A00(A0P2);
        C28274CdJ c28274CdJ = this.A03;
        C50365MLr c50365MLr = new C50365MLr(A004, this, C30182DRn.A01(A0P2, 40), c28274CdJ.A01, 43);
        BYS bys = new BYS(A0P2);
        c50365MLr.invoke(bys);
        C50365MLr c50365MLr2 = new C50365MLr(AbstractC77363dM.A00(A0P2), this, C30182DRn.A01(A0P2, 41), c28274CdJ.A02, 43);
        BYS bys2 = new BYS(A0P2);
        c50365MLr2.invoke(bys2);
        C50365MLr c50365MLr3 = new C50365MLr(AbstractC77363dM.A00(A0P2), this, C30182DRn.A01(A0P2, 42), c28274CdJ.A03, 43);
        BYS bys3 = new BYS(A0P2);
        c50365MLr3.invoke(bys3);
        CharSequence expandTemplate = TextUtils.expandTemplate(A0F2, bys, bys2, bys3);
        C14360o3.A07(expandTemplate);
        A0P2.A00(new C26567BoQ(A003, c93e, C88.A0i, expandTemplate, C05F.A0N, 0, A0B, A0B));
        long A0H = AbstractC25229BEm.A0H();
        Integer num5 = C05F.A0E;
        C51722Yv A005 = C9CU.A00(null, num5, 0, A0H);
        long A0C = AbstractC25229BEm.A0C();
        C51722Yv A0T = AbstractC25233BEq.A0T(A005, AbstractC25225BEi.A0n(num2, 0, A0C), num, 100.0f, 0);
        C51722Yv A0T2 = AbstractC25233BEq.A0T(AbstractC25234BEr.A0G(null, AbstractC25225BEi.A0n(num5, 0, A0H), 0, AbstractC25229BEm.A0F()), AbstractC25225BEi.A0n(num2, 0, A0C), num, 100.0f, 0);
        C2XE ArD = A0P2.ArD();
        C2Z0 A0P3 = AbstractC167007dF.A0P(ArD);
        C51722Yv A006 = C9CU.A00(null, num5, 0, A0E);
        String A0F3 = AbstractC77623dm.A0F(A0P3, 2131966180);
        C88 c882 = C88.A0Q;
        C88 c883 = C88.A0T;
        Integer num6 = C05F.A0F;
        AbstractC25231BEo.A1B(new C26519Bne(A006, c882, c883, null, A0F3, num2, num, num, num6, C29896DGk.A00(A01, this, 43)), A0P3, A0P2, A0T, c3e8);
        C2Z0 A0P4 = AbstractC167007dF.A0P(ArD);
        AbstractC25231BEo.A1B(new C26519Bne(C9CU.A00(null, num3, 0, A0E), C88.A0A, c88, c882, AbstractC77623dm.A0F(A0P4, 2131966181), num2, num2, num, num6, C29910DGy.A01(this, 33)), A0P4, A0P2, A0T2, c3e8);
        A12.A00(AbstractC76963ci.A08(A0P2, A12, A002, c3e82));
        return AbstractC76963ci.A08(A12, c76223bS, A0d, c3e8);
    }

    public static final C2WH A03(C2Z1 c2z1, C87 c87, String str, String str2) {
        C3e8 c3e8 = C3e8.SPACE_AROUND;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CU.A00(null, C05F.A0E, 0, Double.doubleToRawLongBits(36.0d));
        C2Z0 A0L = AbstractC25233BEq.A0L(c2z1);
        C88 c88 = C88.A0Y;
        Drawable A03 = AbstractC28406CgC.A03(A0L, c87, null, Integer.valueOf(AbstractC28406CgC.A00(A0L, c88)));
        long A0J = AbstractC25230BEn.A0J();
        Integer num = C05F.A00;
        C51722Yv A002 = C9CU.A00(AbstractC25234BEr.A0L(null, num, 0, A0J), C05F.A09, 0, AbstractC25230BEn.A0L());
        C2XE c2xe = A0L.A00;
        AbstractC25234BEr.A0r(A03, c2xe, A0L, A002);
        long A0J2 = AbstractC25229BEm.A0J();
        C51722Yv A0E = AbstractC25234BEr.A0E(null, AbstractC25226BEj.A0m(0, A0J2), 0, A0J2);
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        C51722Yv A0d = AbstractC25230BEn.A0d(null, num, 100.0f, 0);
        C2XE c2xe2 = A0P.A00;
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe2);
        C88 c882 = C88.A0Z;
        Integer num2 = C05F.A0H;
        long A0B = AbstractC25229BEm.A0B();
        C93E c93e = C93E.TEXT_START;
        A0P2.A00(new C26567BoQ(null, c93e, c882, str, num2, 2, A0B, A0B));
        A0P.A00(AbstractC76963ci.A0D(A0P2, A0P, A0d));
        C51722Yv A0d2 = AbstractC25230BEn.A0d(null, num, 100.0f, 0);
        C2Z0 A0P3 = AbstractC167007dF.A0P(c2xe2);
        A0P3.A00(new C26567BoQ(null, c93e, c88, str2, C05F.A03, 2, A0B, A0B));
        A0P.A00(AbstractC76963ci.A0D(A0P3, A0P, A0d2));
        A0L.A00(AbstractC76963ci.A08(A0P, A0L, A0E, c3e8));
        return AbstractC76963ci.A0L(A0L, c2z1, A00, c3e8);
    }
}
