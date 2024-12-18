package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.BlD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26368BlD extends AbstractC51572Yf {
    public final FoaUserSession A00;
    public final C25874BcZ A01;
    public final C28274CdJ A02;

    public C26368BlD(FoaUserSession foaUserSession, C28274CdJ c28274CdJ, C25874BcZ c25874BcZ) {
        C14360o3.A0B(c28274CdJ, 3);
        this.A00 = foaUserSession;
        this.A01 = c25874BcZ;
        this.A02 = c28274CdJ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Drawable drawable;
        long j;
        InterfaceC31128DmB A00 = C28351CfB.A00(AbstractC28337CeP.A00(c76223bS));
        C25874BcZ c25874BcZ = this.A01;
        CVX cvx = (CVX) AbstractC77183d4.A00(c76223bS, C29905DGt.A01(this, 30), new Object[]{c25874BcZ});
        if (c25874BcZ.A0D) {
            drawable = AbstractC28406CgC.A03(c76223bS, C87.A0b, null, Integer.valueOf(AbstractC28406CgC.A00(c76223bS, C88.A0h)));
        } else {
            drawable = null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        long A0J = AbstractC25229BEm.A0J();
        C51722Yv A002 = C9CU.A00(null, C05F.A0G, 0, A0J);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        long A0A = AbstractC25235BEs.A0A(A00, C05F.A0U);
        Integer num = C05F.A0E;
        C51722Yv A003 = C9CU.A00(null, num, 0, A0A);
        C2XE c2xe = A12.A00;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        if (drawable != null) {
            long doubleToRawLongBits = Double.doubleToRawLongBits(144.0d);
            Integer num2 = C05F.A00;
            C51722Yv A0H = AbstractC25234BEr.A0H(C9CU.A00(null, num2, 0, doubleToRawLongBits), AbstractC25225BEi.A0n(C05F.A01, 0, Double.doubleToRawLongBits(96.0d)), num2);
            long A0L = AbstractC25230BEn.A0L();
            Integer num3 = C05F.A08;
            AbstractC25234BEr.A0q(drawable, ImageView.ScaleType.CENTER_CROP, A0P.A00, A0P, C9CU.A00(A0H, num3, 0, A0L));
            String A0F = AbstractC77623dm.A0F(A0P, 2131966599);
            Integer num4 = C05F.A04;
            A0P.A00(new C26567BoQ(AbstractC25234BEr.A0E(null, AbstractC25225BEi.A0n(num3, 0, A0L), 0, AbstractC25230BEn.A0I()), C93E.CENTER, C88.A0Z, A0F, num4, 0, AbstractC25230BEn.A0K(), A0J));
        }
        for (CVY cvy : cvx.A00) {
            C87 c87 = cvy.A00;
            CVZ cvz = cvy.A01;
            C09530e4 c09530e4 = cvz.A01;
            CharSequence charSequence = cvz.A00;
            if (c09530e4 != null) {
                Context A004 = AbstractC77363dM.A00(A0P);
                String str = (String) c09530e4.A01;
                if (str != null) {
                    C50365MLr c50365MLr = new C50365MLr(A004, this, C30181DRm.A01(cvy, 20), str, 46);
                    BYS bys = new BYS(A0P);
                    c50365MLr.invoke(bys);
                    charSequence = TextUtils.expandTemplate(charSequence, bys);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            C14360o3.A0A(charSequence);
            A0P.A00(new C26333Bke(c87, charSequence));
        }
        AbstractC25227BEk.A1H(A0P, A12, A003);
        C51722Yv A15 = AbstractC25232BEp.A15(C9CU.A00(AbstractC25233BEq.A0Z(null, num, 15.0d, 0), C05F.A0F, 0, AbstractC25229BEm.A0F()), C05F.A00, EnumC77683ds.CENTER);
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
        String A0F2 = AbstractC77623dm.A0F(A0P2, 2131966535);
        Context A005 = AbstractC77363dM.A00(A0P2);
        C28274CdJ c28274CdJ = this.A02;
        C50365MLr c50365MLr2 = new C50365MLr(A005, this, C30181DRm.A01(A0P2, 21), c28274CdJ.A02, 46);
        BYS bys2 = new BYS(A0P2);
        c50365MLr2.invoke(bys2);
        C50365MLr c50365MLr3 = new C50365MLr(AbstractC77363dM.A00(A0P2), this, C30181DRm.A01(A0P2, 22), c28274CdJ.A00, 46);
        BYS bys3 = new BYS(A0P2);
        c50365MLr3.invoke(bys3);
        CharSequence expandTemplate = TextUtils.expandTemplate(A0F2, bys2, bys3);
        C14360o3.A07(expandTemplate);
        Integer num5 = C05F.A0C;
        C88 c88 = C88.A0i;
        long A0K = AbstractC25230BEn.A0K();
        AbstractC25230BEn.A1H(new C26567BoQ(null, C93E.CENTER, c88, expandTemplate, num5, 0, A0K, A0K), A0P2, A12, A15);
        long A0L2 = AbstractC25230BEn.A0L();
        boolean z = cvx.A01;
        if (z) {
            j = AbstractC25229BEm.A0D();
        } else {
            j = A0L2;
        }
        Integer num6 = C05F.A07;
        C51722Yv A006 = C9CU.A00(null, num6, 0, A0L2);
        Integer num7 = C05F.A08;
        C51722Yv A007 = C9CU.A00(A006, num7, 0, A0L2);
        Integer num8 = C05F.A09;
        C51722Yv A008 = C9CU.A00(A007, num8, 0, A0L2);
        Integer num9 = C05F.A0A;
        C51722Yv A009 = C9CU.A00(A008, num9, 0, j);
        String A0F3 = AbstractC77623dm.A0F(A12, 2131966523);
        Integer num10 = C05F.A01;
        A12.A00(new C26519Bne(A009, null, null, null, A0F3, num10, C05F.A0Y, num10, null, C29905DGt.A01(this, 28)));
        if (z) {
            A12.A00(new C26519Bne(C9CU.A00(C9CU.A00(C9CU.A00(C9CU.A00(null, num6, 0, A0L2), num7, 0, A0J), num8, 0, A0L2), num9, 0, A0L2), null, null, null, AbstractC77623dm.A0F(A12, 2131966522), num10, C05F.A0N, num10, null, C29905DGt.A01(this, 29)));
        }
        return AbstractC76963ci.A03(A12, c76223bS, A002);
    }
}
