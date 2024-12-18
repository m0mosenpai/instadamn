package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;

/* renamed from: X.CWc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28005CWc {
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ca, code lost:
    
        if (((r22 & ((r22 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Y5 r29, X.BTO r30, X.C5Tl r31, androidx.compose.ui.Modifier r32, X.InterfaceC16660sJ r33, X.InterfaceC16610sE r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28005CWc.A00(X.5Y5, X.BTO, X.5Tl, androidx.compose.ui.Modifier, X.0sJ, X.0sE, int, int):void");
    }

    public static final void A01(C5Y5 c5y5, C5Tl c5Tl, Modifier modifier, Object obj, String str, InterfaceC16610sE interfaceC16610sE, int i, int i2) {
        int i3;
        String str2 = str;
        C5Y5 c5y52 = c5y5;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-310686752);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, obj, i) ? 1 : 0) | i;
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
            i3 |= AbstractC25232BEp.A0J(c5Tl, c5y5);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, str2);
        }
        if ((i2 & 16) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16610sE);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                c5y52 = C25245BFe.A00(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 0);
            }
            if (i6 != 0) {
                str2 = "Crossfade";
            }
            if (C0fH.A02()) {
                C0fH.A01(804645818, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
            }
            A00(c5y52, AbstractC28452Ch2.A03(c5Tl, obj, str2, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112)), c5Tl, modifier2, null, interfaceC16610sE, (i3 & 112) | (i3 & 896) | (i3 & 57344), 4);
            if (C0fH.A02()) {
                C0fH.A00(1324503022);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVE(c5y52, obj, modifier2, interfaceC16610sE, str2, i, i2, 0);
        }
    }
}
