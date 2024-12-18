package X;

import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.BGa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25262BGa {
    public static final void A00(C5Tl c5Tl, C5Hc c5Hc, float f, float f2, float f3, float f4, int i, int i2) {
        int i3;
        C5UP c5up;
        Object AJX;
        float f5 = f4;
        float f6 = f3;
        float f7 = f2;
        float f8 = f;
        C14360o3.A0B(c5Hc, 0);
        c5Tl.Enr(355777594);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, c5Hc) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A04(c5Tl, f8);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A05(c5Tl, f7);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A06(c5Tl, f6);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25229BEm.A04(c5Tl.AH1(f5) ? 1 : 0);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                f8 = 18.0f;
            }
            if (i5 != 0) {
                f7 = 0.4f;
            }
            if (i6 != 0) {
                f6 = 1.0f;
            }
            if (i7 != 0) {
                f5 = 2.0f;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1332381180, "com.instagram.compose.ui.facepile.FacePile (FacePile.kt:53)");
            }
            float abs = Math.abs(f7) * f8;
            float f9 = f8 * f7;
            float f10 = (1.0f - f6) * f8;
            if (C0fH.A02()) {
                C0fH.A01(82660491, "com.instagram.compose.ui.facepile.getLayoutDirection (FacePile.kt:89)");
            }
            if (f7 < 0.0f) {
                c5Tl.Eno(-442448242);
                c5up = C5V2.A07;
                Object AJX2 = c5Tl.AJX(c5up);
                AJX = AnonymousClass583.Ltr;
                if (AJX2 == AJX) {
                    AJX = AnonymousClass583.Rtl;
                }
            } else {
                c5Tl.Eno(-442307533);
                c5up = C5V2.A07;
                AJX = c5Tl.AJX(c5up);
            }
            if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                C0fH.A00(411456574);
            }
            AbstractC25230BEn.A17(c5Tl, c5up.A02(AJX), new C25263BGb(c5Hc, abs, f10, f8, f9, f5), -712986758);
            if (C0fH.A02()) {
                C0fH.A00(186411408);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30239DTs(c5Hc, f8, f7, f6, f5, i, i2);
        }
    }
}
