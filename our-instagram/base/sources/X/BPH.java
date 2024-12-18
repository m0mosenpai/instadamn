package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class BPH {
    public static final C51722Yv A00(C2Z1 c2z1) {
        return A01(c2z1, null, false, false, false, false);
    }

    public static final C51722Yv A01(C2Z1 c2z1, Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        C51722Yv A0X;
        if (z2 && z) {
            i = R.drawable.clips_viewer_pill_invert_background_attribute_pill_system;
        } else {
            i = R.drawable.clips_viewer_pill_background_attribute_pill_system;
            if (z4) {
                i = R.drawable.clips_viewer_pill_background_attribute_pill_system_prompt_design;
            }
        }
        C75933ay c75933ay = C51722Yv.A02;
        long A0D = AbstractC77623dm.A0D(c2z1, R.dimen.afi_margin_top);
        C51722Yv A16 = AbstractC25232BEp.A16(AbstractC25233BEq.A0R(null, AbstractC25227BEk.A0Y(0, A0D), 0, AbstractC77623dm.A0D(c2z1, R.dimen.accent_edge_thickness)), C05F.A00, AbstractC77623dm.A0E(c2z1, i));
        if (z3) {
            A0X = C9CU.A00(A16, C05F.A0Y, 0, AbstractC77623dm.A0D(c2z1, R.dimen.asset_picker_section_title_horizontal_padding));
        } else if (z4) {
            A0X = AbstractC25233BEq.A0X(A16, c2z1, R.dimen.abc_dialog_padding_material);
        } else {
            A0X = AbstractC25233BEq.A0X(A16, c2z1, R.dimen.asset_picker_section_title_horizontal_padding);
        }
        if (num != null) {
            A0X = C9CU.A00(A0X, C05F.A0N, 0, AbstractC25229BEm.A0K(num.intValue()));
        }
        return A0X.A00(null);
    }

    public static final C51682Yq A02(C2Z1 c2z1, C51722Yv c51722Yv, String str, boolean z) {
        int A0A;
        C14360o3.A0B(str, 1);
        C51722Yv c51722Yv2 = C51722Yv.A02;
        C51722Yv A00 = c51722Yv2.A00(c51722Yv);
        C9CU A0n = AbstractC25225BEi.A0n(C05F.A0E, 0, AbstractC77623dm.A06(c2z1));
        if (A00 == c51722Yv2) {
            A00 = null;
        }
        C51722Yv A002 = C9CU.A00(AbstractC25225BEi.A0h(A00, A0n), C05F.A0j, 0, AbstractC77623dm.A04(c2z1));
        Integer num = C05F.A01;
        C51722Yv A003 = C9CV.A00(A002, num, "android.widget.Button", 0);
        if (z) {
            A0A = R.color.fds_white_alpha80;
        } else {
            A0A = AbstractC53242c7.A0A(AbstractC25229BEm.A0M(c2z1));
        }
        int A09 = AbstractC25228BEl.A09(c2z1, A0A);
        long A092 = AbstractC77623dm.A09(c2z1);
        C2XE ArD = c2z1.ArD();
        Context context = ArD.A0C;
        Integer num2 = C05F.A00;
        Typeface typeface = Typeface.SANS_SERIF;
        C14360o3.A08(typeface);
        Typeface A03 = AbstractC14710oj.A03(context, typeface, num2);
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0g = AbstractC25233BEq.A0g(ArD, str, A09);
        AbstractC25230BEn.A1K(A0g, c2z1.BoZ(), 0, A092);
        A0g.A0T(A03);
        A0g.A0F();
        AbstractC25234BEr.A18(A0g, c2z1, AbstractC25228BEl.A0A(c2z1, A0D), A0D);
        A0g.A0H(AbstractC25228BEl.A0A(c2z1, A0D));
        A0g.A0X(num2);
        AbstractC25234BEr.A1B(A0g, num);
        A0g.A0M(1);
        A0g.A0c(false);
        AbstractC25232BEp.A1N(A0g, false);
        return AbstractC25227BEk.A0X(A003, A0g);
    }
}
