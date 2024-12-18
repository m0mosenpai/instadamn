package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CGo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27618CGo {
    public static final void A00(Bitmap bitmap, C5Tl c5Tl, C5AH c5ah, InterfaceC16820sZ interfaceC16820sZ, float f, int i, int i2) {
        int i3;
        float f2 = f;
        AbstractC167007dF.A1E(c5ah, 1, interfaceC16820sZ);
        c5Tl.Enr(64533065);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, bitmap) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, c5ah);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A05(c5Tl, f2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                f2 = 1.0f;
            }
            if (C0fH.A02()) {
                C0fH.A01(1973474724, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoCaptureImage (PotatoCaptureImage.kt:37)");
            }
            if (bitmap != null) {
                C1130158n c1130158n = Modifier.A00;
                Modifier A00 = CBB.A00(AbstractC25226BEj.A0T(c1130158n), f2, f2);
                InterfaceC1127857k A002 = C5XX.A00(C118195Wf.A06, false);
                int A003 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, A00);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A002, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                C6LQ.A01(c5Tl, C5XR.A05(C6L2.A01(AbstractC118185Wd.A0C(c1130158n, 280.0f), c5ah), null, null, interfaceC16820sZ, true), null, new C6LZ(bitmap), C5YJ.A00, C5YD.A00(c5Tl, 2131969882), DalvikInternals.IOPRIO_BACKGROUND, 232);
                c5Tl.ASW();
            }
            if (C0fH.A02()) {
                C0fH.A00(291345080);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUF(bitmap, c5ah, interfaceC16820sZ, f2, i, i2, 2);
        }
    }
}
