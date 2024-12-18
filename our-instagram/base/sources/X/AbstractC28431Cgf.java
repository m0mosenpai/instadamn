package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Cgf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28431Cgf {
    public static final void A03(C5Tl c5Tl, C26050Bfd c26050Bfd, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, c26050Bfd, interfaceC16820sZ);
        c5Tl.Enr(114392806);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c26050Bfd) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1884370368, "com.instagram.aistudio.editor.ProfilePicture (AiSettingsScreen.kt:355)");
            }
            Modifier A0Q = AbstractC25225BEi.A0Q(AbstractC118175Wb.A0E(Modifier.A00, 0.0f, 20.0f, 0.0f, 20.0f));
            InterfaceC1127857k A0e = AbstractC25228BEl.A0e(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0Q);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0e, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            ImageUrl imageUrl = c26050Bfd.A04;
            c5Tl.Eno(-1855287197);
            if (imageUrl != null) {
                AbstractC27516CCm.A00(c5Tl, new C26115Bgz(imageUrl), c26050Bfd.A0A, interfaceC16820sZ, null, 0, ((i2 << 3) & 896) | 199728, 192, A1R, A1R, false);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(1482733429);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, c26050Bfd, interfaceC16820sZ, i, 13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (r25 != X.C83.ONLY_ME) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r23, X.C26050Bfd r24, X.C83 r25, X.InterfaceC16820sZ r26, int r27) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28431Cgf.A01(X.5Tl, X.Bfd, X.C83, X.0sZ, int):void");
    }

    public static final void A02(C5Tl c5Tl, C26050Bfd c26050Bfd, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        c5Tl.Enr(287071082);
        if ((i & 48) == 0) {
            i2 = AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1532296758, "com.instagram.aistudio.editor.AdvancedSettingsRow (AiSettingsScreen.kt:340)");
            }
            C1130158n c1130158n = Modifier.A00;
            boolean z = false;
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A0E, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C2DC A003 = C5Y7.A00(c5Tl, R.drawable.instagram_settings_pano_outline_24, 0);
            String A004 = C5YD.A00(c5Tl, 2131952694);
            c5Tl.Eno(-1645881415);
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object EEc = c5Tl.EEc();
            if (z || EEc == C5UI.A00) {
                EEc = C29907DGv.A01(interfaceC16820sZ, 41);
                c5Tl.FBy(EEc);
            }
            AbstractC25705BXp.A03(c5Tl, C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), true), A003, new BY4("", true), A004);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(651651964);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, c26050Bfd, interfaceC16820sZ, i, 12);
        }
    }

    public static final void A04(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i) {
        int i2;
        c5Tl.Enr(-1088000067);
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
                C0fH.A01(-824913782, "com.instagram.aistudio.editor.ConfirmDeletionDialog (AiSettingsScreen.kt:376)");
            }
            interfaceC16820sZ3.invoke();
            c5Tl.Eno(607265650);
            int i3 = i2 & 14;
            boolean A1P = AbstractC167007dF.A1P(i3, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = DGX.A00(interfaceC16820sZ, 0);
                c5Tl.FBy(EEc);
            }
            InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            String A00 = C5YD.A00(c5Tl, 2131952823);
            String A002 = C5YD.A00(c5Tl, 2131952824);
            Integer num = C05F.A0C;
            boolean A1P2 = AbstractC25233BEq.A1P(c5Tl, 607277009, i2);
            Object EEc2 = c5Tl.EEc();
            if (A1P2 || EEc2 == C5UI.A00) {
                EEc2 = DGX.A00(interfaceC16820sZ2, 1);
                c5Tl.FBy(EEc2);
            }
            C26079Bg8 A003 = CGH.A00(c5Tl, num, AbstractC25225BEi.A1A(A0K, EEc2, false), 2131957640, 12);
            Integer num2 = C05F.A00;
            boolean A1S = AbstractC25229BEm.A1S(c5Tl, 607281778, i3, 4);
            Object EEc3 = c5Tl.EEc();
            if (A1S || EEc3 == C5UI.A00) {
                EEc3 = DGX.A00(interfaceC16820sZ, 2);
                c5Tl.FBy(EEc3);
            }
            AbstractC28433Cgh.A02(c5Tl, A003, new C26079Bg8(num2, "Cancel", AbstractC25225BEi.A1A(A0K, EEc3, false), 12), A00, A002, interfaceC16820sZ4);
            if (C0fH.A02()) {
                C0fH.A00(-1626576434);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30509Dbs(interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, i, 9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0334, code lost:
    
        if (r9 == r0) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r68, X.C45127Jxw r69, X.C26050Bfd r70, X.C83 r71, X.InterfaceC16820sZ r72, X.InterfaceC16820sZ r73, X.InterfaceC16820sZ r74, X.InterfaceC16820sZ r75, X.InterfaceC16820sZ r76, X.InterfaceC16820sZ r77, X.InterfaceC16820sZ r78, X.InterfaceC16820sZ r79, X.InterfaceC16820sZ r80, X.InterfaceC16820sZ r81, X.InterfaceC16820sZ r82, X.InterfaceC16820sZ r83, X.InterfaceC16820sZ r84, X.InterfaceC16820sZ r85, X.InterfaceC16660sJ r86, X.InterfaceC16660sJ r87, X.InterfaceC16660sJ r88, X.InterfaceC16660sJ r89, X.InterfaceC16660sJ r90, X.InterfaceC16660sJ r91, int r92, int r93, int r94, boolean r95, boolean r96) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28431Cgf.A00(X.5Tl, X.Jxw, X.Bfd, X.C83, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, int, int, int, boolean, boolean):void");
    }
}
