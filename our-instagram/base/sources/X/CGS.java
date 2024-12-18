package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CGS {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, long j) {
        int i3;
        C5YU A0a;
        long j2 = j;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(-978104369);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0F(c5Tl, j2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                j2 = C1132359l.A08;
            }
            if (C0fH.A02()) {
                C0fH.A01(1474083035, "com.instagram.compose.ui.loading.RetryImage (RetryImage.kt:26)");
            }
            C5XO c5xo = (C5XO) AbstractC25234BEr.A0Y(c5Tl, 1675951265);
            AbstractC25225BEi.A1V(c5Tl, false);
            boolean A1X = AbstractC25230BEn.A1X(AbstractC27467CAn.A00(c5xo, c5Tl, 6));
            int i6 = R.drawable.loadmore_icon_refresh;
            if (A1X) {
                i6 = R.drawable.loadmore_icon_refresh_pressed;
            }
            C2DC A00 = C5Y7.A00(c5Tl, i6, 0);
            String A002 = C5YD.A00(c5Tl, 2131972568);
            if (j2 == C1132359l.A08) {
                A0a = null;
            } else {
                A0a = AbstractC25228BEl.A0a(j2);
            }
            C6LQ.A00(c5Tl, null, C5XR.A00(null, c5xo, modifier2, AbstractC25225BEi.A0W(0), null, interfaceC16820sZ, true), A0a, A00, C5YJ.A05, A002, 0.0f, DalvikInternals.IOPRIO_BACKGROUND, 40);
            if (C0fH.A02()) {
                C0fH.A00(-626596230);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTT(i, i2, 2, j2, interfaceC16820sZ, modifier2);
        }
    }
}
