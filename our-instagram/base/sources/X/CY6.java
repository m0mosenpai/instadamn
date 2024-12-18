package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public abstract class CY6 {
    public static final void A00(Bitmap bitmap, C5Tl c5Tl, C5AH c5ah, ImageUrl imageUrl, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, int i) {
        int i2;
        AbstractC167017dG.A1O(str, c5ah);
        AbstractC25234BEr.A0k(4, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4);
        c5Tl.Enr(365474314);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, imageUrl);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, c5ah);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, bitmap);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ2);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ3);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16820sZ4);
        }
        if ((4793491 & i2) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(803209562, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoContributionPostCaptureScreen (PotatoContributionPostCaptureScreen.kt:55)");
            }
            if (AbstractC25235BEs.A1a(c5Tl, new C30259DUm(bitmap, c5ah, imageUrl, str, interfaceC16820sZ, interfaceC16820sZ3, interfaceC16820sZ2, interfaceC16820sZ4), 1822135624, C5XL.A00(c5Tl).A0c)) {
                C0fH.A00(398290102);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWT(interfaceC16820sZ2, imageUrl, interfaceC16820sZ, interfaceC16820sZ4, interfaceC16820sZ3, c5ah, bitmap, str, i, 1);
        }
    }

    public static final void A01(InterfaceC119655bO interfaceC119655bO, C5Tl c5Tl, ImageUrl imageUrl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        c5Tl.Enr(1341015850);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, interfaceC119655bO) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, imageUrl);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-346569542, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.CaptureButtons (PotatoContributionPostCaptureScreen.kt:117)");
            }
            C1130158n c1130158n = Modifier.A00;
            Alignment alignment = C118195Wf.A07;
            Modifier A08 = AbstractC118175Wb.A08(interfaceC119655bO.AB5(alignment, interfaceC119655bO.AB5(alignment, c1130158n)), 20.0f);
            long A0C = AbstractC25225BEi.A0C(c5Tl);
            C5XL.A02(c5Tl);
            C5WI c5wi = C5WE.A02;
            Modifier A01 = C6L3.A01(A08, c5wi, A0C);
            float f = 12.0f;
            if (imageUrl != null) {
                f = 8.0f;
            }
            Modifier A082 = AbstractC118175Wb.A08(A01, f);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1601858849);
            Object obj = C5UI.A00;
            C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q, obj);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A0F = AbstractC25235BEs.A0F(c5xo, A082, interfaceC16820sZ);
            InterfaceC1127857k A0S = AbstractC25231BEo.A0S(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A0F);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0S, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            c5Tl.Eno(1397136500);
            if (imageUrl != null) {
                BGD.A03(c5Tl, AbstractC25226BEj.A0w(c5Tl, imageUrl, i2 >> 3), C29189Ctu.A00);
                AbstractC25227BEk.A16(c5Tl, c1130158n, 6.0f);
            }
            C117505Tk.A0L(A0K, false);
            String A002 = C5YD.A00(c5Tl, 2131952265);
            long A013 = AbstractC118155Vz.A01(17);
            C5WR.A0s(c5Tl, AbstractC25225BEi.A0X(c5Tl), A002, 16370, AbstractC25226BEj.A0I(c5Tl), A013);
            c5Tl.ASW();
            Modifier A083 = AbstractC118175Wb.A08(interfaceC119655bO.AB5(C118195Wf.A08, c1130158n), 20.0f);
            long j = C5XL.A00(c5Tl).A0r;
            C5XL.A02(c5Tl);
            Modifier A014 = AbstractC118175Wb.A01(C6L3.A01(A083, c5wi, j));
            C5XO c5xo2 = (C5XO) AbstractC25234BEr.A0Z(c5Tl, obj, -1601826017);
            C117505Tk.A0L(A0K, false);
            Modifier A0F2 = AbstractC25235BEs.A0F(c5xo2, A014, interfaceC16820sZ2);
            String A003 = C5YD.A00(c5Tl, 2131969883);
            long A015 = AbstractC118155Vz.A01(17);
            C5WR.A0L(c5Tl, A0F2, AbstractC25225BEi.A0X(c5Tl), A003, 3072, 16368, AbstractC25226BEj.A08(c5Tl), A015);
            if (C0fH.A02()) {
                C0fH.A00(-1439361935);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(interfaceC119655bO, imageUrl, interfaceC16820sZ, interfaceC16820sZ2, i, 5);
        }
    }
}
