package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Bjz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26292Bjz extends AbstractC51572Yf {
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C77123cy A00 = AbstractC77063cs.A00(c76223bS, DFQ.A00);
        C51762Yz A002 = AbstractC77073ct.A00(c76223bS, DFR.A00);
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A01;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(num, 75.0f, 0));
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.abc_list_item_height_material);
        Integer num2 = C05F.A00;
        C51722Yv A003 = C9CV.A00(C9CU.A00(A0h, num2, 0, A0D), num2, EnumC77683ds.CENTER, 3);
        C29893DGh.A00(c76223bS, A00, A002, AbstractC25225BEi.A1b(), 17);
        C51722Yv A16 = AbstractC25232BEp.A16(AbstractC25234BEr.A0N(null, num, num2, 100.0f, 0), C05F.A0D, "transitionFastPlayNuxViewId");
        EnumC77933eL enumC77933eL = EnumC77933eL.RELATIVE;
        Integer num3 = C05F.A0Y;
        C51722Yv A0P = AbstractC25233BEq.A0P(A002, C9CV.A00(A16, num3, enumC77933eL, 3));
        C3e8 c3e8 = C3e8.SPACE_BETWEEN;
        C2XE c2xe = c76223bS.A05;
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
        Drawable A0E = AbstractC77623dm.A0E(A0P2, R.drawable.clips_viewer_fast_play_nux);
        C51722Yv A0d = AbstractC25230BEn.A0d(A003, num, 180.0f, 2);
        C2XE c2xe2 = A0P2.A00;
        AbstractC25234BEr.A0r(A0E, c2xe2, A0P2, A0d);
        AbstractC25234BEr.A0r(AbstractC77623dm.A0E(A0P2, R.drawable.clips_viewer_fast_play_nux), c2xe2, A0P2, A003);
        C2WH A0K = AbstractC76963ci.A0K(A0P2, c76223bS, A0P, null, c3e8);
        C51722Yv A0d2 = AbstractC25230BEn.A0d(null, num2, 100.0f, 0);
        EnumC77933eL enumC77933eL2 = EnumC77933eL.ABSOLUTE;
        C51722Yv A004 = C9CV.A00(A0d2, num3, enumC77933eL2, 3);
        EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_END;
        C51722Yv A005 = C9CV.A00(A004, num2, enumC77683ds, 3);
        C2Z0 A0P3 = AbstractC167007dF.A0P(c2xe);
        String A0F = AbstractC77623dm.A0F(A0P3, 2131955519);
        long A06 = AbstractC77623dm.A06(A0P3);
        C2XE c2xe3 = A0P3.A00;
        int A0A = AbstractC25230BEn.A0A(c2xe3, A0P3);
        long A05 = AbstractC77623dm.A05(A0P3);
        C51722Yv A006 = C9CU.A00(null, C05F.A0A, 0, AbstractC25227BEk.A09(A0P3));
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe3, null, A0F, 0);
        AbstractC25233BEq.A1B(A0P3, A0a, A0A, A05);
        A0a.A0S(0);
        A0a.A0T(typeface);
        A0a.A0F();
        AbstractC25234BEr.A14(A0P3, A0a, AbstractC25228BEl.A08(A0P3, A06), A0D2);
        A0a.A0B();
        AbstractC25234BEr.A1E(A0a, num2, 1, false);
        AbstractC25233BEq.A1D(A006, A0a, false);
        AbstractC25227BEk.A1J(A0P3, A0a);
        C2WF A04 = AbstractC76963ci.A04(A0P3, c76223bS, A005);
        return AbstractC76963ci.A02(AbstractC25233BEq.A0I(A0K, A04, c2xe), c76223bS, C9CV.A00(C9CV.A00(AbstractC25234BEr.A0N(null, num2, num, 100.0f, 0), num3, enumC77933eL2, 3), num2, enumC77683ds, 3));
    }
}
