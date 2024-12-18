package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CLK {
    public static final void A00(C5Tl c5Tl, C211819a8 c211819a8, String str, int i) {
        int i2;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(-1653962704);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c211819a8);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(474447070, "instagram.features.clips.spins.creation.ui.components.PreviewImage (SpinsSelectionPreview.kt:32)");
            }
            c5Tl.Eno(-35213476);
            boolean A1P = AbstractC167007dF.A1P(i2 & 14, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                Bitmap decodeFile = BitmapFactory.decodeFile(str);
                C14360o3.A07(decodeFile);
                EEc = new C6LZ(decodeFile);
                c5Tl.FBy(EEc);
            }
            InterfaceC137546La interfaceC137546La = (InterfaceC137546La) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            c5Tl.Eno(-35209823);
            C5UP c5up = C5V2.A01;
            float EqT = AbstractC25226BEj.A0j(c5Tl, c5up).EqT(C5XT.A02(c5Tl, R.dimen.avatar_size_ridiculously_xxxlarge_plus));
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(-35204990);
            float EqT2 = AbstractC25226BEj.A0j(c5Tl, c5up).EqT(C5XT.A02(c5Tl, R.dimen.before_and_after_media_card_width));
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(-35199780);
            float EqT3 = AbstractC25226BEj.A0j(c5Tl, c5up).EqT(C5XT.A02(c5Tl, R.dimen.abc_dialog_padding_material));
            C117505Tk.A0L(A0K, false);
            long A00 = AbstractC119585bG.A00(c5Tl, R.color.igds_gradient_yellow);
            C1130158n c1130158n = Modifier.A00;
            C28773Cn5 c28773Cn5 = new C28773Cn5(EqT3);
            Modifier A01 = C6L2.A01(c1130158n, new C5WJ(c28773Cn5, c28773Cn5, c28773Cn5, c28773Cn5));
            boolean A1W = AbstractC25226BEj.A1W(c5Tl, A00, c5Tl.AH1(EqT) | AbstractC25235BEs.A1X(c5Tl, -35186993, i2) | c5Tl.AH1(EqT2));
            Object EEc2 = c5Tl.EEc();
            if (A1W || EEc2 == C5UI.A00) {
                EEc2 = new C29920DHi(c211819a8, EqT, EqT2, 1, A00);
                c5Tl.FBy(EEc2);
            }
            C6LQ.A01(c5Tl, AbstractC25230BEn.A0W(A0K, A01, EEc2, false), null, interfaceC137546La, null, null, 48, 248);
            if (C0fH.A02()) {
                C0fH.A00(-1620828489);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30503Dbm.A01(ASZ, c211819a8, str, i, 16);
        }
    }
}
