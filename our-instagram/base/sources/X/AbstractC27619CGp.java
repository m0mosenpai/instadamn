package X;

import android.graphics.Bitmap;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CGp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27619CGp {
    public static final void A00(Bitmap bitmap, C5Tl c5Tl, C5AH c5ah, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, float f, int i, int i2) {
        int i3;
        C14360o3.A0B(c5ah, 1);
        AbstractC25234BEr.A0k(4, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC16820sZ3);
        C14360o3.A0B(interfaceC16820sZ4, 8);
        c5Tl.Enr(716975629);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, c5ah);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A05(c5Tl, f);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, bitmap);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((196608 & i2) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ2);
        }
        if ((1572864 & i2) == 0) {
            i3 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16660sJ);
        }
        if ((12582912 & i2) == 0) {
            i3 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16820sZ3);
        }
        if ((100663296 & i2) == 0) {
            i3 |= AbstractC25232BEp.A0P(c5Tl, interfaceC16820sZ4);
        }
        if ((38347923 & i3) == 38347922 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1475937349, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoCreationPostCaptureScreen (PotatoCreationPostCaptureScreen.kt:49)");
            }
            int A07 = AbstractC25225BEi.A07(C06090Tz.A05, AbstractC25229BEm.A0d(c5Tl), 36605641191855423L);
            if (AbstractC25235BEs.A1a(c5Tl, new C30315DWq(c5ah, bitmap, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC16820sZ3, interfaceC16820sZ4, f, A07, i, 0), -158441397, C5XL.A00(c5Tl).A0c)) {
                C0fH.A00(1774929821);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30315DWq(c5ah, bitmap, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC16820sZ3, interfaceC16820sZ4, f, i, i2, 1);
        }
    }
}
