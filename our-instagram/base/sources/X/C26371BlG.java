package X;

import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BlG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26371BlG extends AbstractC51572Yf {
    public final UserSession A00;
    public final InterfaceC31137Dmc A01;
    public final boolean A02;

    public C26371BlG(UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = interfaceC31137Dmc;
        this.A02 = true;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C3e8 c3e8;
        String str;
        C14360o3.A0B(c76223bS, 0);
        boolean A00 = BT8.A00(this.A00);
        Float A0l = AbstractC25227BEk.A0l();
        C2XI A002 = AbstractC80383iT.A00(c76223bS, A0l);
        C2XI A003 = AbstractC80383iT.A00(c76223bS, A0l);
        C2XI A004 = AbstractC80383iT.A00(c76223bS, A0l);
        C77123cy A005 = AbstractC77063cs.A00(c76223bS, DF6.A00);
        C77123cy A006 = AbstractC77063cs.A00(c76223bS, DF5.A00);
        C77123cy A007 = AbstractC77063cs.A00(c76223bS, DF4.A00);
        boolean z = this.A02;
        if (z) {
            c3e8 = C3e8.FLEX_START;
        } else {
            c3e8 = C3e8.FLEX_END;
        }
        long A04 = AbstractC77623dm.A04(c76223bS);
        CUJ As5 = this.A01.As5();
        C51762Yz A008 = C29902DGq.A00(c76223bS, As5, 27);
        AbstractC77313dH.A00(c76223bS, new D8J(48, A008, As5), new Object[]{As5});
        if (z) {
            int i = 2131955408;
            if (A00) {
                i = 2131955409;
            }
            str = AbstractC77623dm.A0G(c76223bS, A008.A03, i);
        } else {
            str = null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A01;
        C51722Yv A0e = AbstractC25233BEq.A0e(num, 100.0f, 0);
        Integer num2 = C05F.A00;
        C51722Yv A009 = C9CV.A00(AbstractC25230BEn.A0d(A0e, num2, 100.0f, 0), C05F.A0Y, EnumC77933eL.ABSOLUTE, 3);
        EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_END;
        C51722Yv A0R = AbstractC25233BEq.A0R(C9CU.A00(C9CV.A00(A009, num2, enumC77683ds, 3), C05F.A0N, 0, Double.doubleToRawLongBits(500.0d)), AbstractC25227BEk.A0Y(0, AbstractC77623dm.A04(c76223bS)), 0, A04);
        C2XE c2xe = c76223bS.A05;
        C51722Yv A0e2 = AbstractC25230BEn.A0e(AbstractC25230BEn.A0e(AbstractC25231BEo.A0X(A004, AbstractC25232BEp.A16(A0R, num2, AbstractC77623dm.A0E(c76223bS, AbstractC53242c7.A0H(c2xe.A0C, R.attr.igds_color_legibility_gradient))), num2), num2, new C25241BEz(5, A004, A007, A003, c76223bS, A005, A006, A002), null), num, new C30177DRh(34, A005, A007, A003, A006), null);
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        C51722Yv A0X = AbstractC25231BEo.A0X(A003, AbstractC25231BEo.A0X(A002, AbstractC25234BEr.A0I(null, AbstractC25226BEj.A0m(0, AbstractC77623dm.A0D(A0P, R.dimen.abc_select_dialog_padding_start_material)), num2, 3), C05F.A03), num2);
        C2XE c2xe2 = A0P.A00;
        int A0A = AbstractC25230BEn.A0A(c2xe2, A0P);
        long A0D = AbstractC77623dm.A0D(A0P, R.dimen.account_group_management_row_text_size);
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, str, 0);
        AbstractC25233BEq.A1B(A0P, A0a, A0A, A0D);
        A0a.A0S(1);
        AbstractC25234BEr.A0o(typeface, A0P, A0a, A0D2);
        A0a.A0B();
        AbstractC25234BEr.A1J(A0a, num2, false, true);
        AbstractC77743dy.A00(A0a, A0X);
        AbstractC25227BEk.A1J(A0P, A0a);
        return AbstractC76963ci.A07(A0P, c76223bS, A0e2, enumC77683ds, c3e8);
    }
}
