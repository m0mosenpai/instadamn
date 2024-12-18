package X;

import androidx.compose.ui.Modifier;
import com.instagram.compose.core.ui.IgClickableTextKt;

/* renamed from: X.Chz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28506Chz {
    public static final void A01(C5Tl c5Tl, Modifier modifier, CharSequence charSequence, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2, int i3) {
        A04(c5Tl, modifier, charSequence, str, str2, interfaceC16820sZ, interfaceC16820sZ2, null, i, i2, i3, false, false, false, false, false, false, false, false);
    }

    public static final void A02(C5Tl c5Tl, Modifier modifier, CharSequence charSequence, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2, int i3, boolean z, boolean z2) {
        A04(c5Tl, modifier, charSequence, str, str2, interfaceC16820sZ, interfaceC16820sZ2, null, i, i2, i3, z, z2, false, false, false, false, false, false);
    }

    public static final void A03(C5Tl c5Tl, Modifier modifier, CharSequence charSequence, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        A04(c5Tl, modifier, charSequence, str, str2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, i, i2, i3, z, z2, false, false, false, false, z3, false);
    }

    public static final void A05(C5Tl c5Tl, Modifier modifier, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3) {
        A04(c5Tl, modifier, null, str, str2, interfaceC16820sZ, null, null, i, i2, i3, false, false, false, false, false, false, false, false);
    }

    public static final void A06(C5Tl c5Tl, Modifier modifier, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, boolean z) {
        A04(c5Tl, modifier, null, str, null, interfaceC16820sZ, null, null, i, i2, i3, z, false, false, false, false, false, false, false);
    }

    public static final void A08(C5Tl c5Tl, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        A04(c5Tl, null, null, str, str2, interfaceC16820sZ, interfaceC16820sZ2, null, 0, 0, 32668, false, false, false, false, false, false, false, false);
    }

    public static final void A09(C5Tl c5Tl, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        A04(c5Tl, null, null, str, str2, interfaceC16820sZ, interfaceC16820sZ2, null, i, 0, 32668, false, false, false, false, false, false, false, false);
    }

    public static final void A0A(C5Tl c5Tl, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        A04(c5Tl, null, null, str, null, interfaceC16820sZ, null, null, 0, i, i2, false, false, false, false, false, false, false, false);
    }

    public static final void A0B(C5Tl c5Tl, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        A04(c5Tl, null, null, str, null, interfaceC16820sZ, null, null, 0, 0, 32740, z, z2, false, false, false, false, false, false);
    }

    public static final void A0C(InterfaceC16820sZ interfaceC16820sZ, String str, C5Tl c5Tl, int i) {
        A04(c5Tl, null, null, str, null, interfaceC16820sZ, null, null, i, 3072, 24572, false, false, false, false, false, false, false, false);
    }

    public static final void A0D(InterfaceC16820sZ interfaceC16820sZ, String str, C5Tl c5Tl, int i) {
        A04(c5Tl, null, null, str, null, interfaceC16820sZ, null, null, i, 0, 32764, false, false, false, false, false, false, false, false);
    }

    public static final void A00(C5Tl c5Tl, Modifier modifier, CharSequence charSequence, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2) {
        A04(c5Tl, modifier, charSequence, str, str2, interfaceC16820sZ, interfaceC16820sZ2, null, i, 3072, i2, false, false, false, false, false, false, true, false);
    }

    public static final void A07(C5Tl c5Tl, CharSequence charSequence, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        InterfaceC16660sJ interfaceC16660sJ2;
        C5UU ASZ;
        C30504Dbn A01;
        C118125Vw A00;
        c5Tl.Enr(-1002163239);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, charSequence) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
            interfaceC16660sJ2 = interfaceC16660sJ;
        } else {
            interfaceC16660sJ2 = null;
            if (i4 == 0) {
                interfaceC16660sJ2 = interfaceC16660sJ;
            }
            if (C0fH.A02()) {
                C0fH.A01(698993382, "com.instagram.compose.igds.components.bottombutton.FooterText (IgdsBottomButton.kt:114)");
            }
            if (charSequence != null && !AbstractC001900j.A0T(charSequence)) {
                Modifier A0A = AbstractC118175Wb.A0A(AbstractC25228BEl.A0W(), C5XT.A00(c5Tl), C5XT.A01(c5Tl));
                A00 = C118125Vw.A00(null, null, AbstractC25225BEi.A0Y(c5Tl), null, null, null, 0, 0, 0, 6291454, AbstractC25226BEj.A0M(c5Tl), 0L, 0L, 0L);
                boolean z = charSequence instanceof C5C8;
                if (z && interfaceC16660sJ2 != null) {
                    c5Tl.Eno(1807212048);
                    C5C8 c5c8 = (C5C8) charSequence;
                    boolean A1P = AbstractC25233BEq.A1P(c5Tl, -772981168, i3);
                    Object EEc = c5Tl.EEc();
                    if (A1P || EEc == C5UI.A00) {
                        EEc = C30185DRq.A01(c5Tl, interfaceC16660sJ2, 30);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    IgClickableTextKt.A06(c5Tl, A0A, c5c8, A00, (InterfaceC16660sJ) EEc, 112572, 0L);
                } else if (z) {
                    c5Tl.Eno(1807487328);
                    C5WR.A00(c5Tl, A0A, (C5C8) charSequence, A00, 3, 0, 0, 0, 0, 24444, 0L);
                } else {
                    c5Tl.Eno(1807656960);
                    C5WR.A07(c5Tl, A0A, A00, charSequence.toString());
                }
                if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                    C0fH.A00(1333088830);
                }
            } else {
                if (C0fH.A02()) {
                    C0fH.A00(131228398);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                A01 = C30504Dbn.A01(interfaceC16660sJ2, charSequence, i2, i, 23);
                ASZ.A06 = A01;
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            A01 = C30504Dbn.A01(interfaceC16660sJ2, charSequence, i2, i, 24);
            ASZ.A06 = A01;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C5Tl r36, androidx.compose.ui.Modifier r37, java.lang.CharSequence r38, java.lang.String r39, java.lang.String r40, X.InterfaceC16820sZ r41, X.InterfaceC16820sZ r42, X.InterfaceC16660sJ r43, int r44, int r45, int r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28506Chz.A04(X.5Tl, androidx.compose.ui.Modifier, java.lang.CharSequence, java.lang.String, java.lang.String, X.0sZ, X.0sZ, X.0sJ, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
