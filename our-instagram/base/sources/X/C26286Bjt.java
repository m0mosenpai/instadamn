package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.Bjt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26286Bjt extends AbstractC51572Yf {
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.abc_alert_dialog_button_dimen);
        long A07 = AbstractC77623dm.A07(c76223bS);
        Drawable A0E = AbstractC77623dm.A0E(c76223bS, R.drawable.browser_close_button);
        A0E.setTint(AbstractC77623dm.A01(c76223bS));
        C75933ay c75933ay = C51722Yv.A02;
        int A09 = AbstractC25228BEl.A09(c76223bS, R.color.design_dark_default_color_on_background);
        Integer num = C05F.A00;
        C51722Yv A00 = C9CV.A00(AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, AbstractC25225BEi.A0i(A09), 4)), C05F.A0D, "clips_cta_right_panel_component", 4);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        C51722Yv A002 = C9CU.A00(null, num, 0, A0D);
        Integer num2 = C05F.A01;
        C51722Yv A003 = C9CU.A00(A002, num2, 0, A0D);
        C2XE c2xe = A12.A00;
        C80403iV A03 = C80393iU.A03(c2xe);
        A03.A0D(A0E);
        A03.A0E(scaleType);
        boolean A1a = AbstractC25233BEq.A1a(A12, A003, A03);
        long A04 = AbstractC77623dm.A04(A12);
        C51722Yv A0d = AbstractC25230BEn.A0d(C9CU.A00(null, num2, 0, A0D), num2, 1.0f, A1a ? 1 : 0);
        Typeface A0R = AbstractC167017dG.A0R(AbstractC77363dM.A00(A12));
        long A0D2 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, "Loading...", 0);
        AbstractC25233BEq.A1B(A12, A0a, -16777216, A04);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(A0R, A12, A0a, A0D2);
        A0a.A0X(num);
        AbstractC25234BEr.A1D(A0a, num2, 1.0f, false, A1a);
        AbstractC25233BEq.A1A(A12, A0d, A0a);
        Drawable A0E2 = AbstractC77623dm.A0E(A12, R.drawable.instagram_clock_dotted_pano_outline_24);
        C51722Yv A004 = C9CU.A00(null, num2, 0, A0D);
        Integer num3 = C05F.A0u;
        C51722Yv A005 = C9CU.A00(A004, num3, 0, A07);
        Integer num4 = C05F.A1F;
        AbstractC25234BEr.A0q(A0E2, scaleType, c2xe, A12, C9CU.A00(A005, num4, 0, A07));
        AbstractC25234BEr.A0q(AbstractC77623dm.A0E(A12, R.drawable.instagram_more_vertical_pano_filled_24), scaleType, c2xe, A12, C9CU.A00(C9CU.A00(C9CU.A00(null, num2, 0, A0D), num3, 0, A07), num4, 0, A07));
        return AbstractC76963ci.A0D(A12, c76223bS, A00);
    }
}
