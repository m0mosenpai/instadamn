package X;

/* renamed from: X.CXs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28040CXs {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r41, androidx.compose.ui.Modifier r42, X.C169527hS r43, X.C166047bW r44, X.C27961CUg r45, X.InterfaceC16660sJ r46, X.InterfaceC16620sF r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28040CXs.A00(X.5Tl, androidx.compose.ui.Modifier, X.7hS, X.7bW, X.CUg, X.0sJ, X.0sF, int, int):void");
    }

    public static final void A01(C5Tl c5Tl, EnumC166167bk enumC166167bk, String str, InterfaceC16620sF interfaceC16620sF, int i, boolean z) {
        int i2;
        int i3;
        c5Tl.Enr(-1851101519);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, enumC166167bk);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str);
        }
        if ((i & 7168) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1994339894, "com.instagram.comments.mvvm.view.compose.CommentBottomActionRow (CaptionRow.kt:121)");
            }
            if (z) {
                int ordinal = enumC166167bk.ordinal();
                boolean z2 = true;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            i3 = 2131973204;
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        i3 = 2131965660;
                    }
                } else {
                    i3 = 2131973211;
                }
                boolean A1P = AbstractC25233BEq.A1P(c5Tl, 794004807, i2) | AbstractC167007dF.A1P(i2 & 7168, C3OO.FLAG_MOVED);
                if ((i2 & 896) != 256) {
                    z2 = false;
                }
                boolean z3 = A1P | z2;
                Object EEc = c5Tl.EEc();
                if (z3 || EEc == C5UI.A00) {
                    EEc = new C50253MHi(enumC166167bk, interfaceC16620sF, str, 34);
                    c5Tl.FBy(EEc);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                AbstractC28041CXt.A01((InterfaceC16820sZ) EEc, c5Tl, i3);
            }
            if (C0fH.A02()) {
                C0fH.A00(2098093487);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30223DTc(interfaceC16620sF, enumC166167bk, str, i, 0, z);
        }
    }
}
