package X;

import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.6Fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC136446Fx {
    public static final void A01(C5Tl c5Tl, C132335yC c132335yC, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        c5Tl.Enr(167800655);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i4 = 2;
            if (c5Tl.AH4(c132335yC)) {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i5 = 16;
            if (c5Tl.AH6(interfaceC16820sZ)) {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i6 = 128;
            if (c5Tl.AH6(interfaceC16820sZ2)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            int i8 = 1024;
            if (c5Tl.AH5(z2)) {
                i8 = C3OO.FLAG_MOVED;
            }
            i3 |= i8;
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i7 != 0) {
                z2 = true;
            }
            if (C0fH.A02()) {
                C0fH.A01(51024845, "com.instagram.feed.tifu.ui.Header (TifuUnit.kt:149)");
            }
            C6G6.A00(c5Tl, AbstractC118185Wd.A02, C6G4.A06, C6G5.A00, C5UA.A01(c5Tl, new C207169Ev(13, interfaceC16820sZ2, c132335yC), -172398579), null, C5UA.A01(c5Tl, new C9FV(0, c132335yC, interfaceC16820sZ2, interfaceC16820sZ, z2), 689435023), 0, 1772982, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, false, false);
            if (C0fH.A02()) {
                C0fH.A00(233068016);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUI(c132335yC, interfaceC16820sZ, interfaceC16820sZ2, i, i2, 6, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r44, X.C5yI r45, X.InterfaceC132365yF r46, X.C132335yC r47, X.InterfaceC16820sZ r48, X.InterfaceC16820sZ r49, X.InterfaceC16820sZ r50, X.InterfaceC16820sZ r51, X.InterfaceC16660sJ r52, X.InterfaceC16660sJ r53, X.InterfaceC16660sJ r54, X.InterfaceC16660sJ r55, X.InterfaceC16620sF r56, int r57, int r58, int r59, boolean r60, boolean r61, boolean r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC136446Fx.A00(X.5Tl, X.5yI, X.5yF, X.5yC, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sF, int, int, int, boolean, boolean, boolean, boolean):void");
    }
}
