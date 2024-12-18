package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import java.util.Date;
import java.util.List;

/* renamed from: X.ChN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28471ChN {
    public static final InterfaceC09390do A00 = C1XM.A00(C29822DDo.A00);

    public static final List A00(boolean z) {
        int i;
        Integer[] numArr = new Integer[8];
        if (z) {
            AbstractC25235BEs.A1R(numArr, 2131974129, 0);
            AbstractC25235BEs.A1R(numArr, 2131974133, 1);
            AbstractC25235BEs.A1R(numArr, 2131974136, 2);
            AbstractC25235BEs.A1R(numArr, 2131974135, 3);
            AbstractC25235BEs.A1R(numArr, 2131974132, 4);
            AbstractC25235BEs.A1R(numArr, 2131974131, 5);
            AbstractC25235BEs.A1R(numArr, 2131974134, 6);
            i = 2131974130;
        } else {
            AbstractC25235BEs.A1R(numArr, 2131957564, 0);
            AbstractC25235BEs.A1R(numArr, 2131957568, 1);
            AbstractC25235BEs.A1R(numArr, 2131957571, 2);
            AbstractC25235BEs.A1R(numArr, 2131957570, 3);
            AbstractC25235BEs.A1R(numArr, 2131957567, 4);
            AbstractC25235BEs.A1R(numArr, 2131957566, 5);
            AbstractC25235BEs.A1R(numArr, 2131957569, 6);
            i = 2131957565;
        }
        AbstractC25235BEs.A1R(numArr, i, 7);
        return AbstractC16960so.A1Q(numArr);
    }

    public static final void A03(C5Tl c5Tl, InterfaceC30953DjA interfaceC30953DjA, InterfaceC30953DjA interfaceC30953DjA2, SettingsScreenViewModel settingsScreenViewModel, C26231Biv c26231Biv, int i) {
        int i2;
        boolean z;
        boolean A1R = AbstractC167007dF.A1R(0, c26231Biv, interfaceC30953DjA);
        AbstractC167007dF.A1E(interfaceC30953DjA2, 2, settingsScreenViewModel);
        c5Tl.Enr(1153906671);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c26231Biv) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, interfaceC30953DjA, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            int i3 = 128;
            if (AbstractC25231BEo.A1Q(c5Tl, interfaceC30953DjA2, i & 512)) {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, settingsScreenViewModel);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1133241758, "com.instagram.settings2.core.view.SleepModeCustomSetting (SleepModeCustomElements.kt:65)");
            }
            Context A0P = AbstractC25230BEn.A0P(c5Tl);
            InterfaceC58303Psv interfaceC58303Psv = c26231Biv.A05;
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, settingsScreenViewModel, c26231Biv, 336279031);
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = new C43171J6q(c26231Biv, settingsScreenViewModel, (InterfaceC23621Ds) null, 25);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0E = AbstractC25235BEs.A0E(c5Tl, EEc, interfaceC58303Psv);
            boolean z2 = c26231Biv.A08;
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 336287338);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = new C36J(C36H.A04(C36G.A06, AbstractC35218FgB.A00()));
                c5Tl.FBy(A0q);
            }
            long j = ((C36J) A0q).A00;
            C117505Tk.A0L(A0E, false);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, c26231Biv, 336290273);
            Object EEc2 = c5Tl.EEc();
            if (A1Y || EEc2 == obj) {
                EEc2 = AbstractC25232BEp.A0w(c5Tl, new C25986Bea(c26231Biv.A07, c26231Biv.A01, c26231Biv.A00));
            }
            InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(A0E, EEc2, false);
            boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, c26231Biv, 336294898);
            Object EEc3 = c5Tl.EEc();
            if (A1Y2 || EEc3 == obj) {
                EEc3 = AbstractC25232BEp.A0w(c5Tl, false);
            }
            InterfaceC74953Yl A0M2 = AbstractC25225BEi.A0M(A0E, EEc3, false);
            boolean A1Y3 = AbstractC25227BEk.A1Y(c5Tl, c26231Biv, 336297170);
            Object EEc4 = c5Tl.EEc();
            if (A1Y3 || EEc4 == obj) {
                EEc4 = AbstractC25232BEp.A0w(c5Tl, false);
            }
            InterfaceC74953Yl A0M3 = AbstractC25225BEi.A0M(A0E, EEc4, false);
            if (z2 && AbstractC25226BEj.A13(A0M).A02.isEmpty() && !AbstractC25230BEn.A1X(A0M2) && !AbstractC25230BEn.A1X(A0M3)) {
                C25986Bea A13 = AbstractC25226BEj.A13(A0M);
                InterfaceC65696TsI A02 = AbstractC133095zb.A02(C78.A00);
                long j2 = A13.A01;
                long j3 = A13.A00;
                C14360o3.A0B(A02, 2);
                A0M.Egh(new C25986Bea(A02, j2, j3));
                Boolean valueOf = Boolean.valueOf(A1R);
                A0M2.Egh(valueOf);
                A0M3.Egh(valueOf);
            }
            long A05 = C36J.A05(j, AbstractC25226BEj.A13(A0M).A01);
            EnumC53144Nex enumC53144Nex = c26231Biv.A03;
            boolean A1X = AbstractC167007dF.A1X(enumC53144Nex, EnumC53144Nex.A03);
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131971417);
            String format = AbstractC35218FgB.A02(A0P).format(new Date(C36J.A03(A05)));
            C14360o3.A07(format);
            boolean A1S = AbstractC25231BEo.A1S(c5Tl, c26231Biv, A0M2, AbstractC25231BEo.A1S(c5Tl, A0P, A0M, AbstractC25227BEk.A1W(c5Tl, 336326435, A1X)));
            Object EEc5 = c5Tl.EEc();
            if (A1S || EEc5 == obj) {
                EEc5 = new BUO(6, c26231Biv, A0P, A0M, A0M2, A1X);
                c5Tl.FBy(EEc5);
            }
            A02(c5Tl, null, A002, format, AbstractC25225BEi.A1A(A0E, EEc5, false), 0, 8, A1X);
            long A052 = C36J.A05(j, AbstractC25226BEj.A13(A0M).A00);
            String A003 = AbstractC136736Hc.A00(c5Tl, 2131971415);
            String format2 = AbstractC35218FgB.A02(A0P).format(new Date(C36J.A03(A052)));
            C14360o3.A07(format2);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0L = AbstractC25227BEk.A0L(c1130158n, 18.0f);
            boolean A1S2 = AbstractC25231BEo.A1S(c5Tl, c26231Biv, A0M2, AbstractC25231BEo.A1S(c5Tl, A0P, A0M, AbstractC25227BEk.A1W(c5Tl, 336349886, A1X)));
            Object EEc6 = c5Tl.EEc();
            if (A1S2 || EEc6 == obj) {
                EEc6 = new BUO(7, c26231Biv, A0P, A0M, A0M2, A1X);
                c5Tl.FBy(EEc6);
            }
            boolean z3 = true;
            A02(c5Tl, A0L, A003, format2, AbstractC25225BEi.A1A(A0E, EEc6, false), 3072, 0, A1X);
            AbstractC25705BXp.A0S(c5Tl, AbstractC136736Hc.A00(c5Tl, 2131957572));
            boolean z4 = c26231Biv.A09;
            InterfaceC65696TsI interfaceC65696TsI = AbstractC25226BEj.A13(A0M).A02;
            boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, A0M2, AbstractC25232BEp.A1Y(c5Tl, A0M, c26231Biv, 336367878));
            Object EEc7 = c5Tl.EEc();
            if (A1X2 || EEc7 == obj) {
                EEc7 = C30184DRp.A00(c5Tl, A0M, A0M2, c26231Biv, 29);
            }
            A04(c5Tl, enumC53144Nex, AbstractC25225BEi.A1B(A0E, EEc7, false), interfaceC65696TsI, 0, z4);
            boolean A1X3 = AbstractC25230BEn.A1X(A0M2);
            String A004 = AbstractC136736Hc.A00(c5Tl, 2131957468);
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            boolean A1X4 = AbstractC25232BEp.A1X(c5Tl, c26231Biv, A0M, 336381808);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && c5Tl.AH6(interfaceC30953DjA))) {
                z = true;
            } else {
                z = false;
            }
            boolean z5 = A1X4 | z;
            if ((i2 & 896) != 256 && ((i2 & 512) == 0 || !c5Tl.AH6(interfaceC30953DjA2))) {
                z3 = false;
            }
            boolean z6 = z5 | z3;
            Object EEc8 = c5Tl.EEc();
            if (z6 || EEc8 == obj) {
                EEc8 = C29901DGp.A00(interfaceC30953DjA2, A0M, c26231Biv, interfaceC30953DjA, 24);
                c5Tl.FBy(EEc8);
            }
            AbstractC28506Chz.A06(c5Tl, A0T, A004, AbstractC25225BEi.A1A(A0E, EEc8, false), 384, 0, 32752, A1X3);
            if (C0fH.A02()) {
                C0fH.A00(804854941);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c26231Biv, settingsScreenViewModel, interfaceC30953DjA2, interfaceC30953DjA, i, 26);
        }
    }

    public static final C09530e4 A01(long j, long j2, boolean z) {
        long A04;
        C36G c36g = C36G.A04;
        long A05 = C36J.A05(C36H.A03(c36g, 23), C36H.A03(C36G.A07, 59));
        if (C36J.A02(j2, j) <= 0) {
            A04 = C36J.A05(C36J.A04(C36H.A03(c36g, 24), j), j2);
        } else {
            A04 = C36J.A04(j2, j);
        }
        long A03 = C36J.A03(A04);
        if (A03 > C36J.A03(A05)) {
            long A042 = C36H.A04(C36G.A06, A03 - C36J.A03(A05));
            if (z) {
                j = C36J.A05(j, A042);
                if (C36J.A02(j, C36H.A03(c36g, 24)) >= 0) {
                    j = C36J.A04(j, C36H.A03(c36g, 24));
                }
            } else {
                j2 = C36J.A04(j2, A042);
                if (C36J.A02(j2, C36H.A03(c36g, 0)) < 0) {
                    j2 = C36J.A05(C36H.A03(c36g, 24), j2);
                }
            }
        }
        return AbstractC166987dD.A1L(new C36J(j), new C36J(j2));
    }

    public static final void A02(C5Tl c5Tl, Modifier modifier, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(1345970082);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier2);
        }
        if ((i2 & 16) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1718264738, "com.instagram.settings2.core.view.SelectableIntervalRow (SleepModeCustomElements.kt:283)");
            }
            Modifier A0M = AbstractC25227BEk.A0M(AbstractC25225BEi.A0Q(modifier2), C5XT.A00(c5Tl));
            InterfaceC1127857k A002 = AbstractC118375Wz.A00(AbstractC118255Wn.A04, c5Tl, C118195Wf.A04);
            int A003 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0M);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A002, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            int i5 = i3 >> 3;
            C5WR.A0q(c5Tl, AbstractC25226BEj.A0g(c5Tl), str, i5 & 14, AbstractC25226BEj.A0G(c5Tl));
            C6GE.A00(null, c5Tl, null, null, C6GD.A03, AbstractC25235BEs.A0c(c5Tl, false), str2, interfaceC16820sZ, (i5 & 112) | 1572864 | ((i3 >> 12) & 14) | ((i3 << 12) & 57344), 396, z, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-755653867);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVG(interfaceC16820sZ, modifier2, str, str2, i2, i, 2, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cf, code lost:
    
        if (r21 == X.EnumC53144Nex.A04) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C5Tl r20, X.EnumC53144Nex r21, X.InterfaceC16660sJ r22, X.InterfaceC65696TsI r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28471ChN.A04(X.5Tl, X.Nex, X.0sJ, X.TsI, int, boolean):void");
    }
}
