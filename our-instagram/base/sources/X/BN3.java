package X;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BN3 extends AbstractC51572Yf {
    public final boolean A00;
    public final boolean A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        if (this.A01) {
            return new AbstractC51572Yf();
        }
        if (this.A00) {
            Drawable A0E = AbstractC77623dm.A0E(c76223bS, R.drawable.instagram_fast_forward_pano_filled_24);
            A0E.setColorFilter(AbstractC25228BEl.A09(c76223bS, R.color.design_dark_default_color_on_background), PorterDuff.Mode.SRC_IN);
            C75933ay c75933ay = C51722Yv.A02;
            Integer num = C05F.A00;
            C51722Yv A0W = AbstractC25233BEq.A0W(C9CV.A00(C9CV.A00(AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0m(num, 0)), C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), num, EnumC77683ds.FLEX_END, 3), c76223bS, 2131955518);
            C2Z0 A0J = AbstractC25233BEq.A0J(c76223bS);
            String A0F = AbstractC77623dm.A0F(A0J, 2131955518);
            long A06 = AbstractC77623dm.A06(A0J);
            C2XE c2xe = A0J.A00;
            int A0A = AbstractC25230BEn.A0A(c2xe, A0J);
            long A05 = AbstractC77623dm.A05(A0J);
            long A09 = AbstractC25227BEk.A09(A0J);
            Integer num2 = C05F.A0A;
            C51722Yv A00 = C9CU.A00(null, num2, 0, A09);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0F, 0);
            AbstractC25233BEq.A1B(A0J, A0a, A0A, A05);
            A0a.A0S(0);
            A0a.A0T(typeface);
            A0a.A0F();
            AbstractC25234BEr.A14(A0J, A0a, AbstractC25228BEl.A08(A0J, A06), A0D);
            AbstractC25230BEn.A1L(A0a, num);
            A0a.A0G();
            A0a.A0b(false);
            A0a.A0N(1);
            A0a.A0E();
            AbstractC25233BEq.A1D(A00, A0a, false);
            AbstractC25227BEk.A1J(A0J, A0a);
            C51722Yv A002 = C9CV.A00(AbstractC25233BEq.A0X(AbstractC25233BEq.A0Y(null, A0J, num, R.dimen.abc_edit_text_inset_top_material, 0), A0J, R.dimen.abc_edit_text_inset_top_material), num, EnumC77683ds.CENTER, 3);
            long A062 = AbstractC77623dm.A06(A0J);
            AbstractC25234BEr.A0r(A0E, c2xe, A0J, C9CU.A00(AbstractC25232BEp.A14(A002, 0, A062), num2, 0, AbstractC77623dm.A0D(A0J, R.dimen.ai_agent_share_profile_sticker_padding)));
            return AbstractC76963ci.A0F(A0J, c76223bS, A0W);
        }
        return null;
    }

    public BN3(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
