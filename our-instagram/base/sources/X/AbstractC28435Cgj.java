package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.Cgj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28435Cgj {
    /* JADX WARN: Code restructure failed: missing block: B:126:0x015a, code lost:
    
        if ((r13 & 48) == 32) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0144, code lost:
    
        if ((r13 & 6) == 4) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0103, code lost:
    
        if ((r13 & 6) == 4) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C5Tl r43, androidx.compose.ui.Modifier r44, X.InterfaceC16660sJ r45, int r46, int r47, boolean r48, boolean r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28435Cgj.A04(X.5Tl, androidx.compose.ui.Modifier, X.0sJ, int, int, boolean, boolean, boolean):void");
    }

    public static final C2DC A00(C5Tl c5Tl, int i) {
        if (AbstractC25227BEk.A1U(c5Tl, -308413187)) {
            C0fH.A01(1085712242, "com.instagram.compose.igds.components.switchbutton.rememberDrawablePainter (IgdsSwitch.kt:227)");
        }
        C2DC A00 = C5Y9.A00(AbstractC25228BEl.A0K(c5Tl).getDrawable(i), c5Tl);
        if (C0fH.A02()) {
            C0fH.A00(184478435);
        }
        AbstractC25225BEi.A1T(c5Tl);
        return A00;
    }

    public static final void A01(InterfaceC119655bO interfaceC119655bO, C5Tl c5Tl, InterfaceC74963Ym interfaceC74963Ym, C26005Bet c26005Bet, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        long j;
        long j2;
        long j3;
        c5Tl.Enr(-1022750408);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, interfaceC119655bO) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, c26005Bet);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0V(c5Tl, interfaceC74963Ym);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0g(c5Tl, z3);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1467998242, "com.instagram.compose.igds.components.switchbutton.PrismSwitch (IgdsSwitch.kt:188)");
            }
            if (!z2) {
                j = c26005Bet.A04;
                j2 = c26005Bet.A03;
            } else if (z) {
                j = c26005Bet.A01;
                j2 = c26005Bet.A00;
            } else {
                j = c26005Bet.A07;
                j2 = c26005Bet.A06;
            }
            C1130158n c1130158n = Modifier.A00;
            Alignment alignment = C118195Wf.A09;
            Modifier AB5 = interfaceC119655bO.AB5(alignment, c1130158n);
            float f = CNY.A00;
            Modifier A08 = AbstractC118185Wd.A08(AbstractC118185Wd.A0D(AB5, 52.0f), 32.0f);
            C5WI c5wi = C5WF.A00;
            Modifier A01 = C6L3.A01(A08, c5wi, j);
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A0E, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            Modifier AB52 = C119645bN.A00.AB5(C118195Wf.A0B, c1130158n);
            c5Tl.Eno(1264383351);
            boolean A1W = AbstractC25234BEr.A1W(i2);
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = C30185DRq.A01(c5Tl, interfaceC74963Ym, 40);
            }
            Modifier A013 = C6L3.A01(AbstractC118185Wd.A0B(AbstractC28010CWi.A01(AB52, AbstractC25225BEi.A1B(c117505Tk, EEc, false)), 24.0f), c5wi, j2);
            InterfaceC1127857k A003 = C5XX.A00(alignment, false);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A014 = C5X3.A01(c5Tl, A013);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            c5Tl.Eno(-1945741496);
            if (z3) {
                if (z2) {
                    j3 = c26005Bet.A05;
                } else {
                    j3 = c26005Bet.A02;
                }
                A02(c5Tl, (i2 >> 3) & 14, j3, z);
            }
            if (AbstractC25233BEq.A1S(c5Tl, c117505Tk)) {
                C0fH.A00(-1199403377);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30238DTr(interfaceC119655bO, interfaceC74963Ym, c26005Bet, i, z, z2, z3);
        }
    }

    public static final void A02(C5Tl c5Tl, int i, long j, boolean z) {
        int i2;
        c5Tl.Enr(-344006266);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0E(c5Tl, j);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(703969658, "com.instagram.compose.igds.components.switchbutton.LockIcon (IgdsSwitch.kt:213)");
            }
            C2DC A00 = A00(c5Tl, R.drawable.instagram_lock_pano_filled_24);
            C2DC A002 = A00(c5Tl, R.drawable.instagram_unlock_pano_filled_24);
            if (!z) {
                A00 = A002;
            }
            C5YS.A02(c5Tl, AbstractC118185Wd.A0B(Modifier.A00, 12.0f), A00, ((i2 << 6) & 7168) | 432, j);
            if (C0fH.A02()) {
                C0fH.A00(-681932131);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DS1(j, i, z);
        }
    }

    public static final void A03(C5Tl c5Tl, InterfaceC74963Ym interfaceC74963Ym, Modifier modifier, C2DC c2dc, C2DC c2dc2, int i) {
        int i2;
        c5Tl.Enr(1561960418);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c2dc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c2dc2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, interfaceC74963Ym);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, modifier);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1675470136, "com.instagram.compose.igds.components.switchbutton.ImageCrossfade (IgdsSwitch.kt:174)");
            }
            InterfaceC1127857k A0Z = AbstractC25230BEn.A0Z();
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C1130158n c1130158n = Modifier.A00;
            AbstractC25227BEk.A17(c5Tl, CB8.A00(c1130158n, 1.0f - AbstractC25231BEo.A05(interfaceC74963Ym)), c2dc, i2);
            AbstractC25227BEk.A17(c5Tl, CB8.A00(c1130158n, AbstractC25231BEo.A05(interfaceC74963Ym)), c2dc2, i2 >> 3);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-455147784);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c2dc2, interfaceC74963Ym, c2dc, modifier, i, 4);
        }
    }
}
