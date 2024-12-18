package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.BkB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26304BkB extends AbstractC51572Yf {
    public final String A00;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.action_button_settings_height);
        long A04 = AbstractC77623dm.A04(c76223bS);
        long A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.achievements_only_you_top_margin);
        long A0D3 = AbstractC77623dm.A0D(c76223bS, R.dimen.ad4ad_button_bottom_margin);
        Drawable A0E = AbstractC77623dm.A0E(c76223bS, R.drawable.instagram_arrow_left_pano_outline_24);
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        A0E.setTint(AbstractC25228BEl.A09(c76223bS, AbstractC53242c7.A08(context)));
        C75933ay c75933ay = C51722Yv.A02;
        int A09 = AbstractC25228BEl.A09(c76223bS, AbstractC53242c7.A0D(context));
        Integer num = C05F.A00;
        C51722Yv A00 = C9CV.A00(AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, AbstractC25225BEi.A0i(A09), 4)), C05F.A0D, "clips_cta_right_panel_component", 4);
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        Integer num2 = C05F.A0u;
        C51722Yv A002 = C9CU.A00(null, num2, 0, A04);
        Integer num3 = C05F.A15;
        C51722Yv A003 = C9CU.A00(A002, num3, 0, A04);
        Integer num4 = C05F.A1F;
        C51722Yv A004 = C9CU.A00(A003, num4, 0, A04);
        Integer num5 = C05F.A1I;
        C51722Yv A005 = C9CU.A00(C9CU.A00(C9CU.A00(A004, num5, 0, A0D3), C05F.A01, 0, A0D), num, 0, A0D);
        C2XE c2xe2 = A0P.A00;
        C80403iV A03 = C80393iU.A03(c2xe2);
        A03.A0D(A0E);
        A03.A0E(scaleType);
        boolean A1a = AbstractC25233BEq.A1a(A0P, A005, A03);
        String str = this.A00;
        C51722Yv A006 = C9CU.A00(C9CU.A00(C9CU.A00(C9CU.A00(null, num2, 0, A04), num3, 0, A0D2), num4, 0, A04), num5, 0, A04);
        Typeface A02 = AbstractC15960qq.A00(AbstractC77363dM.A00(A0P)).A02(EnumC15950qp.A11);
        int A05 = AbstractC25228BEl.A05(AbstractC77363dM.A00(A0P), A0P);
        long A0D4 = AbstractC77623dm.A0D(A0P, R.dimen.backup_codes_text_size);
        long A0D5 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, str, 0);
        AbstractC25233BEq.A1B(A0P, A0a, A05, A0D4);
        A0a.A0S(A1a ? 1 : 0);
        AbstractC25234BEr.A0o(A02, A0P, A0a, A0D5);
        A0a.A0X(num);
        AbstractC25234BEr.A1J(A0a, num, false, A1a);
        AbstractC77743dy.A00(A0a, A006);
        AbstractC25227BEk.A1J(A0P, A0a);
        return AbstractC76963ci.A0D(A0P, c76223bS, A00);
    }

    public C26304BkB(String str) {
        this.A00 = str;
    }
}
