package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public abstract class CZ6 {
    public static final void A00(Bitmap bitmap, C5Tl c5Tl, float f, int i) {
        int i2;
        C5YL c5yl;
        C14360o3.A0B(bitmap, 0);
        c5Tl.Enr(1437973019);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, bitmap) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A04(c5Tl, f);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1626205847, "com.instagram.wonderwall.ui.compose.components.BitmapAttachment (WallImageAttachment.kt:36)");
            }
            C137026If c137026If = new C137026If(new C6LZ(bitmap));
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131966152);
            Modifier A0X = AbstractC25228BEl.A0X(AbstractC27468CAo.A00(AbstractC25228BEl.A0W(), f, false), 12.0f);
            if (f < 1.0f) {
                c5yl = C5YJ.A03;
            } else {
                c5yl = C5YJ.A00;
            }
            C6LQ.A0B(c5Tl, A0X, c137026If, c5yl, A00, 0);
            if (C0fH.A02()) {
                C0fH.A00(853476635);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSS(bitmap, f, i, 1);
        }
    }

    public static final void A01(C5Tl c5Tl, ImageUrl imageUrl, float f, int i) {
        int i2;
        C5YL c5yl;
        C5UU ASZ;
        int i3;
        c5Tl.Enr(1320262832);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A04(c5Tl, f);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1198159880, "com.instagram.wonderwall.ui.compose.components.ImageAttachment (WallImageAttachment.kt:22)");
            }
            if (imageUrl == null) {
                if (C0fH.A02()) {
                    C0fH.A00(1612323711);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 2;
                ASZ.A06 = new DSS(imageUrl, f, i, i3);
            }
            C2DB A01 = AbstractC43541zP.A01(c5Tl, imageUrl, i2 & 14);
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131966152);
            Modifier A0X = AbstractC25228BEl.A0X(AbstractC27468CAo.A00(AbstractC25228BEl.A0W(), f, false), 12.0f);
            if (f < 1.0f) {
                c5yl = C5YJ.A03;
            } else {
                c5yl = C5YJ.A00;
            }
            C6LQ.A0B(c5Tl, A0X, A01, c5yl, A00, 0);
            if (C0fH.A02()) {
                C0fH.A00(-1076220582);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 3;
            ASZ.A06 = new DSS(imageUrl, f, i, i3);
        }
    }
}
