package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.Cdi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28296Cdi {
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bf, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC25229BEm.A0d(r49), 36327537764219553L) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e4, code lost:
    
        if (((android.content.res.Configuration) r49.AJX(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A00)).screenHeightDp <= X.C18U.A01(X.C06090Tz.A05, X.AbstractC25229BEm.A0d(r49), 36609012740986680L)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f6, code lost:
    
        if (r14 == false) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ec  */
    /* JADX WARN: Type inference failed for: r4v27, types: [androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C5Tl r49, X.C51729Mt8 r50, X.C26145BhW r51, X.C25660BVw r52, X.C28357CfH r53, java.lang.String r54, X.InterfaceC16820sZ r55, X.InterfaceC16820sZ r56, X.InterfaceC16660sJ r57, X.InterfaceC16660sJ r58, X.InterfaceC16660sJ r59, float r60, int r61, int r62, int r63, boolean r64, boolean r65, boolean r66, boolean r67, boolean r68) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28296Cdi.A02(X.5Tl, X.Mt8, X.BhW, X.BVw, X.CfH, java.lang.String, X.0sZ, X.0sZ, X.0sJ, X.0sJ, X.0sJ, float, int, int, int, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0159, code lost:
    
        if (r60 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017d, code lost:
    
        if (X.AbstractC25231BEo.A1U(r50.A05) != false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r45, androidx.compose.ui.Modifier r46, X.MUD r47, X.C26145BhW r48, X.C25660BVw r49, X.C28357CfH r50, X.C136946Hx r51, X.C136936Hw r52, java.lang.String r53, X.InterfaceC16660sJ r54, float r55, int r56, int r57, int r58, boolean r59, boolean r60, boolean r61, boolean r62) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28296Cdi.A00(X.5Tl, androidx.compose.ui.Modifier, X.MUD, X.BhW, X.BVw, X.CfH, X.6Hx, X.6Hw, java.lang.String, X.0sJ, float, int, int, int, boolean, boolean, boolean, boolean):void");
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i, int i2, boolean z) {
        int i3;
        C2DC A00;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC16820sZ, interfaceC16820sZ2);
        C14360o3.A0B(interfaceC16820sZ3, 2);
        c5Tl.Enr(-217786939);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0e(c5Tl, z);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0V(c5Tl, modifier2);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(110158003, "com.instagram.barcelona.feed.mediaviewer.ui.MediaControlPill (VideoMediaBox.kt:199)");
            }
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            InterfaceC118335Wv interfaceC118335Wv = AbstractC118255Wn.A05;
            Modifier A0Z = AbstractC25228BEl.A0Z(AbstractC118185Wd.A0D(AbstractC118185Wd.A08(modifier2, 50.0f), 180.0f), 24.0f, C1132359l.A03);
            InterfaceC1127857k A002 = AbstractC118375Wz.A00(interfaceC118335Wv, c5Tl, interfaceC118225Wj);
            int A003 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0Z);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A002, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C2DC A004 = C5Y7.A00(c5Tl, R.drawable.instagram_arrow_left_pano_outline_24, 0);
            long j = C1132359l.A09;
            C1130158n c1130158n = Modifier.A00;
            c5Tl.Eno(-1468378495);
            boolean A1J = AbstractC25231BEo.A1J(i3 & 14);
            Object EEc = c5Tl.EEc();
            if (A1J || EEc == C5UI.A00) {
                EEc = AbstractC25235BEs.A12(c5Tl, interfaceC16820sZ, 29);
            }
            C5YS.A01(c5Tl, C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), A1R), A004, 3072, 18, j);
            if (z) {
                c5Tl.Eno(-1468375784);
                A00 = C5Y7.A00(c5Tl, R.drawable.instagram_pause_pano_filled_24, 0);
                C117505Tk.A0L(c117505Tk, false);
            } else {
                c5Tl.Eno(-1468372873);
                A00 = C5Y7.A00(c5Tl, R.drawable.instagram_play_pano_filled_24, 0);
                C117505Tk.A0L(c117505Tk, false);
            }
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, -1468368445, i3);
            Object EEc2 = c5Tl.EEc();
            if (A1P || EEc2 == C5UI.A00) {
                EEc2 = AbstractC25228BEl.A1F(c5Tl, interfaceC16820sZ2, 30);
            }
            C5YS.A01(c5Tl, C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), A1R), A00, 3072, 18, j);
            C2DC A005 = C5Y7.A00(c5Tl, R.drawable.instagram_arrow_right_pano_outline_24, 0);
            c5Tl.Eno(-1468361852);
            boolean A1M = AbstractC25231BEo.A1M(i3);
            Object EEc3 = c5Tl.EEc();
            if (A1M || EEc3 == C5UI.A00) {
                EEc3 = AbstractC25228BEl.A1F(c5Tl, interfaceC16820sZ3, 31);
            }
            C5YS.A01(c5Tl, C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc3, false), A1R), A005, 3072, 18, j);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1147116290);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV4(interfaceC16820sZ, interfaceC16820sZ3, modifier2, interfaceC16820sZ2, i, i2, 2, z);
        }
    }
}
