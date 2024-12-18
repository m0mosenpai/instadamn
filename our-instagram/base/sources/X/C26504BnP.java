package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;
import java.util.List;

/* renamed from: X.BnP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26504BnP extends AbstractC51572Yf {
    public final float A00;
    public final AbstractC50812Vc A01;
    public final AbstractC50812Vc A02;
    public final AbstractC50812Vc A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;

    public C26504BnP(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2, AbstractC50812Vc abstractC50812Vc3, String str, String str2, List list, float f, boolean z, boolean z2) {
        C14360o3.A0B(str, 2);
        this.A01 = abstractC50812Vc;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = list;
        this.A00 = f;
        this.A03 = abstractC50812Vc2;
        this.A08 = z;
        this.A02 = abstractC50812Vc3;
        this.A07 = z2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i;
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        Integer num = C05F.A00;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(num, 100.0f, A1Z ? 1 : 0));
        Integer num2 = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(A0h, num2, 100.0f, A1Z ? 1 : 0);
        EnumC77933eL enumC77933eL = EnumC77933eL.RELATIVE;
        Integer num3 = C05F.A0Y;
        C51722Yv A00 = C9CV.A00(A0d, num3, enumC77933eL, 3);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        AbstractC50812Vc abstractC50812Vc = this.A01;
        if (abstractC50812Vc != null) {
            A12.A00(abstractC50812Vc);
        }
        C51722Yv A002 = C9CV.A00(null, num3, enumC77933eL, 3);
        long A0K = AbstractC25229BEm.A0K((int) (AbstractC25231BEo.A0F(A12, R.dimen.audience_selector_pill_layout_height) + this.A00));
        Integer num4 = C05F.A08;
        C51722Yv A003 = C9CU.A00(A002, num4, A1Z ? 1 : 0, A0K);
        long A0D = AbstractC77623dm.A0D(A12, R.dimen.abc_dropdownitem_icon_width);
        Integer num5 = C05F.A04;
        C51722Yv A0d2 = AbstractC25230BEn.A0d(C9CU.A00(A003, num5, A1Z ? 1 : 0, A0D), num2, 1.0f, 1);
        Integer num6 = C05F.A0C;
        C51722Yv A0d3 = AbstractC25230BEn.A0d(A0d2, num6, 0.0f, 1);
        long A0D2 = AbstractC77623dm.A0D(A12, R.dimen.ai_agent_share_profile_sticker_padding);
        String str = this.A05;
        C2XE c2xe = A12.A00;
        Context context = c2xe.A0C;
        Typeface typeface = Typeface.DEFAULT;
        Typeface A03 = AbstractC14710oj.A03(context, typeface, num6);
        int A04 = AbstractC25228BEl.A04(context, A12);
        long A0D3 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, str, A1Z ? 1 : 0);
        AbstractC25233BEq.A1B(A12, A0a, A04, A0D2);
        A0a.A0S(A1Z ? 1 : 0);
        AbstractC25234BEr.A0o(A03, A12, A0a, A0D3);
        A0a.A0X(num6);
        AbstractC25233BEq.A1E(A0a, num, 1.0f, A1Z);
        A0a.A0M(2);
        AbstractC25234BEr.A17(A0d3, A0a, A1Z);
        AbstractC25227BEk.A1J(A12, A0a);
        String str2 = this.A04;
        if (str2 != null) {
            C51722Yv A004 = C9CV.A00(null, num3, enumC77933eL, 3);
            boolean z = this.A08;
            int i2 = R.dimen.account_discovery_bottom_gap;
            if (z) {
                i2 = R.dimen.abc_action_bar_elevation_material;
            }
            C51722Yv A0d4 = AbstractC25230BEn.A0d(AbstractC25233BEq.A0T(AbstractC25234BEr.A0E(A004, AbstractC25225BEi.A0n(num4, A1Z ? 1 : 0, AbstractC77623dm.A0D(A12, i2)), A1Z ? 1 : 0, AbstractC77623dm.A04(A12)), AbstractC25230BEn.A0h(A12, num5, R.dimen.abc_dropdownitem_icon_width, A1Z ? 1 : 0), num2, 1.0f, 1), num6, 0.0f, 1);
            long A0C = AbstractC77623dm.A0C(A12);
            Typeface A032 = AbstractC14710oj.A03(context, typeface, num);
            int A02 = A12.BoZ().A02(R.color.grey_4);
            C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, str2, A1Z ? 1 : 0);
            AbstractC25233BEq.A1B(A12, A0a2, A02, A0C);
            A0a2.A0S(A1Z ? 1 : 0);
            AbstractC25234BEr.A0o(A032, A12, A0a2, A0D3);
            A0a2.A0X(num6);
            AbstractC25234BEr.A1D(A0a2, num, 1.0f, A1Z, true);
            A0a2.A0D();
            AbstractC25233BEq.A1A(A12, A0d4, A0a2);
        } else {
            C51722Yv A0T = AbstractC25233BEq.A0T(C9CV.A00(null, num3, enumC77933eL, 3), AbstractC25228BEl.A0m(num, A1Z ? 1 : 0), num2, 1.0f, 1);
            boolean z2 = this.A07;
            int i3 = R.dimen.abc_select_dialog_padding_start_material;
            if (z2) {
                i3 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            }
            A12.A00(AbstractC76963ci.A09(A12, AbstractC25233BEq.A0Y(A0T, A12, num2, i3, A1Z ? 1 : 0)));
        }
        C51722Yv A0N = AbstractC25234BEr.A0N(null, num2, num, 100.0f, A1Z ? 1 : 0);
        boolean z3 = this.A08;
        int i4 = R.dimen.abc_dialog_padding_material;
        if (z3) {
            i4 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        }
        long A0D4 = AbstractC77623dm.A0D(A12, i4);
        int i5 = R.dimen.abc_dialog_padding_material;
        if (z3) {
            i5 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        }
        long A0D5 = AbstractC77623dm.A0D(A12, i5);
        AbstractC50812Vc abstractC50812Vc2 = this.A03;
        if (abstractC50812Vc2 != null) {
            i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        } else {
            i = R.dimen.abc_dialog_padding_material;
            if (z3) {
                i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            }
        }
        long A0D6 = AbstractC77623dm.A0D(A12, i);
        Integer num7 = C05F.A0u;
        C51722Yv A005 = C9CU.A00(A0N, num7, A1Z ? 1 : 0, A0D4);
        Integer num8 = C05F.A1F;
        C51722Yv A006 = C9CV.A00(AbstractC25234BEr.A0D(A005, AbstractC25225BEi.A0n(num8, A1Z ? 1 : 0, A0D5), A1Z ? 1 : 0, A0D6), num3, enumC77933eL, 3);
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        C51722Yv A0V = AbstractC25233BEq.A0V(AbstractC25234BEr.A0N(null, num2, num, 100.0f, A1Z ? 1 : 0), AbstractC25225BEi.A0n(num8, A1Z ? 1 : 0, AbstractC77623dm.A0A(A0P)), num3, enumC77933eL, 3);
        C2XE c2xe2 = A0P.A00;
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe2);
        List list = this.A06;
        A0P2.A00((AbstractC50812Vc) list.get(A1Z ? 1 : 0));
        A0P2.A00(AbstractC76963ci.A09(A0P2, AbstractC25233BEq.A0Y(AbstractC25230BEn.A0d(AbstractC25233BEq.A0T(null, AbstractC25225BEi.A0o(num3, enumC77933eL, 3), num, 100.0f, A1Z ? 1 : 0), num2, 1.0f, 1), A0P2, num2, R.dimen.abc_dialog_padding_material, A1Z ? 1 : 0)));
        AbstractC25230BEn.A1H((AbstractC50812Vc) list.get(2), A0P2, A0P, A0V);
        C51722Yv A0V2 = AbstractC25233BEq.A0V(AbstractC25234BEr.A0N(null, num2, num, 100.0f, A1Z ? 1 : 0), AbstractC25225BEi.A0n(num7, A1Z ? 1 : 0, AbstractC77623dm.A0A(A0P)), num3, enumC77933eL, 3);
        C2Z0 A0P3 = AbstractC167007dF.A0P(c2xe2);
        A0P3.A00((AbstractC50812Vc) list.get(1));
        A0P3.A00(AbstractC76963ci.A09(A0P3, AbstractC25233BEq.A0Y(AbstractC25230BEn.A0d(AbstractC25233BEq.A0T(null, AbstractC25225BEi.A0o(num3, enumC77933eL, 3), num, 100.0f, A1Z ? 1 : 0), num2, 1.0f, 1), A0P3, num2, R.dimen.abc_dialog_padding_material, A1Z ? 1 : 0)));
        AbstractC25231BEo.A1A(AbstractC25227BEk.A0V((AbstractC50812Vc) list.get(3), A0P3, A0P, A0V2), A0P, A12, A006);
        if (abstractC50812Vc2 != null) {
            A12.A00(abstractC50812Vc2);
        }
        AbstractC50812Vc abstractC50812Vc3 = this.A02;
        if (abstractC50812Vc3 != null) {
            A12.A00(abstractC50812Vc3);
        }
        return AbstractC76963ci.A01(A12, c76223bS, A00);
    }
}
