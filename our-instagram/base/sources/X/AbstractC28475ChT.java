package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.ChT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28475ChT {
    public static final void A00(C5XO c5xo, C5Tl c5Tl, Modifier modifier, InterfaceC30990Djp interfaceC30990Djp, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        AbstractC25233BEq.A0w(1, interfaceC30990Djp, c5xo, interfaceC16660sJ);
        c5Tl.Enr(1644036314);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, interfaceC30990Djp);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, c5xo);
        }
        if ((i2 & 16) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1283746100, "com.instagram.compose.igds.components.segmentedpills.IgdsSegmentedPill (Pills.kt:150)");
            }
            Modifier modifier3 = modifier2;
            A02(c5xo, c5Tl, modifier3, C30716DfE.A00(c5Tl, interfaceC16660sJ, interfaceC30990Djp, 25, 557539287), (i3 & 14) | DalvikInternals.IOPRIO_BACKGROUND | ((i3 >> 6) & 112) | (i3 & 896), 0, z, interfaceC30990Djp.getEnabled());
            if (C0fH.A02()) {
                C0fH.A00(-240692760);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV4(modifier2, interfaceC30990Djp, c5xo, interfaceC16660sJ, i, i2, 5, z);
        }
    }

    public static final void A06(String str, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(-894711963);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1859794278, "com.instagram.compose.igds.components.segmentedpills.LabelPillContent (Pills.kt:84)");
            }
            C5WR.A0k(c5Tl, null, str, i2 & 14, 32766);
            if (C0fH.A02()) {
                C0fH.A00(-2077608461);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30500Dbj.A01(ASZ, str, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5XO r16, X.C5Tl r17, androidx.compose.ui.Modifier r18, X.InterfaceC30990Djp r19, X.InterfaceC16660sJ r20, X.InterfaceC16660sJ r21, int r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28475ChT.A01(X.5XO, X.5Tl, androidx.compose.ui.Modifier, X.Djp, X.0sJ, X.0sJ, int, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C5XO r16, X.C5Tl r17, androidx.compose.ui.Modifier r18, X.InterfaceC16610sE r19, int r20, int r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28475ChT.A02(X.5XO, X.5Tl, androidx.compose.ui.Modifier, X.0sE, int, int, boolean, boolean):void");
    }

    public static final void A03(C5Tl c5Tl, C2DC c2dc, EnumC27364C5t enumC27364C5t, String str, String str2, int i, int i2) {
        int i3;
        String str3 = str2;
        EnumC27364C5t enumC27364C5t2 = enumC27364C5t;
        AbstractC167007dF.A1K(str, c2dc);
        c5Tl.Enr(-909483918);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, c2dc);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, enumC27364C5t);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, str3);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                enumC27364C5t2 = EnumC27364C5t.A03;
            }
            if (i5 != 0) {
                str3 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(1935118757, "com.instagram.compose.igds.components.segmentedpills.LabelWithIconPillContent (Pills.kt:95)");
            }
            c5Tl.Eno(662548426);
            if (enumC27364C5t2 == EnumC27364C5t.A03) {
                int i6 = i3 >> 3;
                A04(c5Tl, c2dc, str3, 12.0f, (i6 & 896) | (i6 & 14) | 48);
                AbstractC25227BEk.A16(c5Tl, Modifier.A00, 6.0f);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C5WR.A0k(c5Tl, null, str, i3 & 14, 32766);
            if (enumC27364C5t2 == EnumC27364C5t.A02) {
                AbstractC25227BEk.A16(c5Tl, Modifier.A00, 6.0f);
                int i7 = i3 >> 3;
                A04(c5Tl, c2dc, str3, 12.0f, (i7 & 896) | (i7 & 14) | 48);
            }
            if (C0fH.A02()) {
                C0fH.A00(2063066330);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUU(c2dc, enumC27364C5t2, str3, str, i, i2, 3);
        }
    }

    public static final void A04(C5Tl c5Tl, C2DC c2dc, String str, float f, int i) {
        int i2;
        c5Tl.Enr(1695605811);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c2dc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A04(c5Tl, f);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-466046612, "com.instagram.compose.igds.components.segmentedpills.IconInPill (Pills.kt:215)");
            }
            C5YS.A07(c5Tl, AbstractC118185Wd.A0C(Modifier.A00, f), c2dc, null, str, (i2 & 14) | ((i2 >> 3) & 112), 24, 0L);
            if (C0fH.A02()) {
                C0fH.A00(81548589);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT1(c2dc, str, f, i, 0);
        }
    }

    public static final void A05(C5Tl c5Tl, C2DC c2dc, String str, int i) {
        int i2;
        AbstractC167017dG.A1N(c2dc, str);
        c5Tl.Enr(-496698969);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c2dc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1104315720, "com.instagram.compose.igds.components.segmentedpills.IconPillContent (Pills.kt:112)");
            }
            A04(c5Tl, c2dc, str, 16.0f, ((i2 << 3) & 896) | (i2 & 14) | 48);
            if (C0fH.A02()) {
                C0fH.A00(-44122523);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30503Dbm.A01(ASZ, c2dc, str, i, 5);
        }
    }
}
