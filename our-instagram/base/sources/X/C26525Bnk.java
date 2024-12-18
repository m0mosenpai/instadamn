package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Bnk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26525Bnk extends AbstractC51572Yf {
    public final CR0 A00;
    public final InterfaceC31152Dmw A01;
    public final List A02;
    public final List A03;
    public final float A04;
    public final AbstractC50812Vc A05;
    public final AbstractC50812Vc A06;
    public final AbstractC50812Vc A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i;
        InterfaceC31152Dmw interfaceC31152Dmw;
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = C29903DGr.A00(c76223bS, this, 49);
        Number number = (Number) A00.A03;
        int intValue = number.intValue();
        if (intValue < this.A02.size() && (interfaceC31152Dmw = this.A01) != null) {
            interfaceC31152Dmw.FAB(AbstractC25225BEi.A0x(this.A03, intValue), "", intValue);
        }
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(num, 100.0f, 0));
        Integer num2 = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(A0h, num2, 100.0f, 0);
        EnumC77933eL enumC77933eL = EnumC77933eL.RELATIVE;
        Integer num3 = C05F.A0Y;
        C51722Yv A002 = C9CV.A00(A0d, num3, enumC77933eL, 3);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        AbstractC50812Vc abstractC50812Vc = this.A05;
        if (abstractC50812Vc != null) {
            A12.A00(abstractC50812Vc);
        }
        C51722Yv A003 = C9CV.A00(null, num3, enumC77933eL, 3);
        long A0K = AbstractC25229BEm.A0K((int) (AbstractC25231BEo.A0F(A12, R.dimen.audience_selector_pill_layout_height) + this.A04));
        Integer num4 = C05F.A08;
        C51722Yv A004 = C9CU.A00(A003, num4, 0, A0K);
        long A0D = AbstractC77623dm.A0D(A12, R.dimen.abc_dropdownitem_icon_width);
        Integer num5 = C05F.A04;
        C51722Yv A0d2 = AbstractC25230BEn.A0d(C9CU.A00(A004, num5, 0, A0D), num2, 1.0f, 1);
        Integer num6 = C05F.A0C;
        C51722Yv A0d3 = AbstractC25230BEn.A0d(A0d2, num6, 0.0f, 1);
        long A0D2 = AbstractC77623dm.A0D(A12, R.dimen.ai_agent_share_profile_sticker_padding);
        String str = this.A09;
        C2XE c2xe = A12.A00;
        Context context = c2xe.A0C;
        Typeface typeface = Typeface.DEFAULT;
        Typeface A03 = AbstractC14710oj.A03(context, typeface, num6);
        int A04 = AbstractC25228BEl.A04(context, A12);
        long A0D3 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, str, 0);
        AbstractC25233BEq.A1B(A12, A0a, A04, A0D2);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(A03, A12, A0a, A0D3);
        A0a.A0X(num6);
        AbstractC25233BEq.A1E(A0a, num, 1.0f, false);
        A0a.A0M(2);
        AbstractC25234BEr.A17(A0d3, A0a, false);
        AbstractC25227BEk.A1J(A12, A0a);
        String str2 = this.A08;
        if (str2 != null) {
            C51722Yv A005 = C9CV.A00(null, num3, enumC77933eL, 3);
            boolean z = this.A0B;
            int i2 = R.dimen.account_discovery_bottom_gap;
            if (z) {
                i2 = R.dimen.abc_action_bar_elevation_material;
            }
            C51722Yv A0d4 = AbstractC25230BEn.A0d(AbstractC25233BEq.A0T(AbstractC25234BEr.A0E(A005, AbstractC25225BEi.A0n(num4, 0, AbstractC77623dm.A0D(A12, i2)), 0, AbstractC77623dm.A04(A12)), AbstractC25230BEn.A0h(A12, num5, R.dimen.abc_dropdownitem_icon_width, 0), num2, 1.0f, 1), num6, 0.0f, 1);
            long A0C = AbstractC77623dm.A0C(A12);
            Typeface A032 = AbstractC14710oj.A03(context, typeface, num);
            int A02 = A12.BoZ().A02(R.color.grey_4);
            C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, str2, 0);
            AbstractC25233BEq.A1B(A12, A0a2, A02, A0C);
            A0a2.A0S(0);
            AbstractC25234BEr.A0o(A032, A12, A0a2, A0D3);
            A0a2.A0X(num6);
            AbstractC25234BEr.A1D(A0a2, num, 1.0f, false, true);
            A0a2.A0D();
            AbstractC25233BEq.A1A(A12, A0d4, A0a2);
        } else {
            C51722Yv A0T = AbstractC25233BEq.A0T(C9CV.A00(null, num3, enumC77933eL, 3), AbstractC25228BEl.A0m(num, 0), num2, 1.0f, 1);
            boolean z2 = this.A0A;
            int i3 = R.dimen.abc_select_dialog_padding_start_material;
            if (z2) {
                i3 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            }
            A12.A00(AbstractC76963ci.A09(A12, AbstractC25233BEq.A0Y(A0T, A12, num2, i3, 0)));
        }
        C51722Yv A0N = AbstractC25234BEr.A0N(null, num2, num, 100.0f, 0);
        AbstractC50812Vc abstractC50812Vc2 = this.A07;
        if (abstractC50812Vc2 != null) {
            i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        } else {
            boolean z3 = this.A0B;
            i = R.dimen.abc_dialog_padding_material;
            if (z3) {
                i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            }
        }
        C51722Yv A0V = AbstractC25233BEq.A0V(A0N, AbstractC25225BEi.A0n(C05F.A1I, 0, AbstractC77623dm.A0D(A12, i)), num3, enumC77933eL, 3);
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        long A0D4 = AbstractC77623dm.A0D(A0P, R.dimen.clips_multiads_mega_card_height);
        AbstractC25231BEo.A1A(new C26639Bpa(AbstractC25234BEr.A0N(null, num, num2, 100.0f, 0), AbstractC25225BEi.A0p(AbstractC77623dm.A07(A0P)), C30180DRl.A00(this, 21), DRY.A00(this, A00, 36), number.intValue(), AbstractC77623dm.A0D(A0P, R.dimen.album_preview_view_width), A0D4), A0P, A12, A0V);
        if (abstractC50812Vc2 != null) {
            A12.A00(abstractC50812Vc2);
        }
        AbstractC50812Vc abstractC50812Vc3 = this.A06;
        if (abstractC50812Vc3 != null) {
            A12.A00(abstractC50812Vc3);
        }
        return AbstractC76963ci.A01(A12, c76223bS, A002);
    }

    public C26525Bnk(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2, AbstractC50812Vc abstractC50812Vc3, CR0 cr0, InterfaceC31152Dmw interfaceC31152Dmw, String str, String str2, List list, List list2, float f, boolean z, boolean z2) {
        this.A05 = abstractC50812Vc;
        this.A09 = str;
        this.A08 = str2;
        this.A03 = list;
        this.A02 = list2;
        this.A04 = f;
        this.A07 = abstractC50812Vc2;
        this.A0B = z;
        this.A06 = abstractC50812Vc3;
        this.A0A = z2;
        this.A01 = interfaceC31152Dmw;
        this.A00 = cr0;
    }
}
