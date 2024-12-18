package X;

/* loaded from: classes5.dex */
public abstract class CXI {
    public static final void A01(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i) {
        int i2;
        c5Tl.Enr(-1356217986);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-243780372, "com.instagram.aistudio.editor.ConfirmDeletionDialog (AiEditExampleDialogueScreen.kt:158)");
            }
            String A00 = C5YD.A00(c5Tl, 2131952764);
            C26079Bg8 A002 = CGH.A00(c5Tl, C05F.A0C, interfaceC16820sZ2, 2131957640, 12);
            c5Tl.Eno(606978264);
            boolean z = true;
            boolean A1P = AbstractC167007dF.A1P(i2 & 896, 256);
            int i3 = i2 & 14;
            if (i3 != 4) {
                z = false;
            }
            boolean z2 = A1P | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = C29898DGm.A00(c5Tl, interfaceC16820sZ3, interfaceC16820sZ, 33);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC28433Cgh.A03(c5Tl, A002, CGH.A00(c5Tl, null, (InterfaceC16820sZ) EEc, 2131954754, 14), A00, null, interfaceC16820sZ, i3, 4068);
            if (C0fH.A02()) {
                C0fH.A00(2135561208);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30509Dbs(interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, i, 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d2, code lost:
    
        if (X.AbstractC28459ChB.A03(r8) == false) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0230 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e9  */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.5XQ, java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v1, types: [X.5XO] */
    /* JADX WARN: Type inference failed for: r31v2, types: [X.CfT] */
    /* JADX WARN: Type inference failed for: r31v3, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r32v2, types: [X.CdS] */
    /* JADX WARN: Type inference failed for: r41v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r72v0, types: [X.5Tl, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r72, java.lang.String r73, java.lang.String r74, X.InterfaceC16820sZ r75, X.InterfaceC16820sZ r76, X.InterfaceC16820sZ r77, X.InterfaceC16820sZ r78, X.InterfaceC16660sJ r79, X.InterfaceC16660sJ r80, X.InterfaceC16660sJ r81, X.InterfaceC16620sF r82, int r83, int r84, int r85, int r86, int r87, boolean r88, boolean r89, boolean r90, boolean r91, boolean r92, boolean r93) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CXI.A00(X.5Tl, java.lang.String, java.lang.String, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sJ, X.0sJ, X.0sJ, X.0sF, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
