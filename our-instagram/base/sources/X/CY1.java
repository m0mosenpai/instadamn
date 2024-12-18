package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CY1 {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r2 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if ((r22 & 32) != 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r15, androidx.compose.ui.Modifier r16, X.EnumC27349C5e r17, X.InterfaceC16660sJ r18, X.C5Hc r19, int r20, int r21, int r22, long r23) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CY1.A00(X.5Tl, androidx.compose.ui.Modifier, X.C5e, X.0sJ, X.5Hc, int, int, int, long):void");
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, int i, int i2, long j) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1354119620);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25230BEn.A04(c5Tl.AH3(j) ? 1 : 0) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i3 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1368521849, "com.instagram.compose.igds.components.segmentedtabs.IgdsSegmentedTabLayoutImpl (IgdsSegmentedTabLayout.kt:100)");
            }
            C6L8.A01(null, c5Tl, AnonymousClass598.A00(modifier2, DJK.A00, false), null, C30485DbU.A00(c5Tl, interfaceC16660sJ, interfaceC16620sF, 27, 2089636090), 0.0f, ((i3 << 6) & 896) | 1572864, 58, j, 0L);
            if (C0fH.A02()) {
                C0fH.A00(930419350);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUG(interfaceC16660sJ, modifier2, interfaceC16620sF, i, i2, 2, j);
        }
    }
}
