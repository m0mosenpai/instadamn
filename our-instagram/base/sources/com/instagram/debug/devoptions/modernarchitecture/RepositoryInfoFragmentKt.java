package com.instagram.debug.devoptions.modernarchitecture;

import X.AbstractC118175Wb;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25228BEl;
import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.AbstractC25231BEo;
import X.AbstractC25232BEp;
import X.AbstractC25233BEq;
import X.AbstractC25234BEr;
import X.AbstractC28010CWi;
import X.AbstractC28495Cho;
import X.C0fH;
import X.C1130158n;
import X.C117505Tk;
import X.C118195Wf;
import X.C1333560c;
import X.C59P;
import X.C5Tl;
import X.C5UA;
import X.C5UI;
import X.C5UU;
import X.C5WR;
import X.C5X2;
import X.C5X3;
import X.C5X8;
import X.C5XJ;
import X.C5XL;
import X.C5Y7;
import X.C5YS;
import X.C6GM;
import X.C6IS;
import X.C6L0;
import X.InterfaceC1127857k;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC74953Yl;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class RepositoryInfoFragmentKt {
    public static final void Header(Modifier modifier, C5Tl c5Tl, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1403885503);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-961245272, "com.instagram.debug.devoptions.modernarchitecture.Header (RepositoryInfoFragment.kt:75)");
            }
            C5WR.A0P(c5Tl, modifier2, AbstractC25226BEj.A0e(c5Tl), "UserSession scoped Repositories", ((i3 << 3) & 112) | 6, C5XL.A00(c5Tl).A0L);
            if (C0fH.A02()) {
                C0fH.A00(1793011538);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new RepositoryInfoFragmentKt$Header$1(modifier2, i, i2);
        }
    }

    public static final void RepositoryList(List list, Modifier modifier, C5Tl c5Tl, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-311566224);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, list) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(545956729, "com.instagram.debug.devoptions.modernarchitecture.RepositoryList (RepositoryInfoFragment.kt:87)");
            }
            C1333560c c1333560c = new C1333560c(0.0f, 4.0f, 0.0f, 4.0f);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, list, -900790053);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = new RepositoryInfoFragmentKt$RepositoryList$1$1(list);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6IS.A03(c1333560c, null, c5Tl, modifier2, (InterfaceC16660sJ) EEc, ((i3 >> 3) & 14) | 12583296, 122, true);
            if (C0fH.A02()) {
                C0fH.A00(308020498);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new RepositoryInfoFragmentKt$RepositoryList$2(list, modifier2, i, i2);
        }
    }

    public static final void ExpandableColumn(String str, Modifier modifier, InterfaceC16620sF interfaceC16620sF, C5Tl c5Tl, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-966988226);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1740630753, "com.instagram.debug.devoptions.modernarchitecture.ExpandableColumn (RepositoryInfoFragment.kt:143)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1956361433);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A0Y, A04, interfaceC16620sF2);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            Object A0q3 = AbstractC25227BEk.A0q(c5Tl, -1326532576);
            if (A0q3 == obj) {
                A0q3 = new RepositoryInfoFragmentKt$ExpandableColumn$1$1$1(interfaceC74953Yl);
                c5Tl.FBy(A0q3);
            }
            Modifier A0T = AbstractC25229BEm.A0T(A0K, c1130158n, A0q3);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0f, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C6L0 c6l0 = C6L0.A00;
            boolean A1X = AbstractC25230BEn.A1X(interfaceC74953Yl);
            int i5 = R.drawable.instagram_chevron_right_pano_outline_16;
            if (A1X) {
                i5 = R.drawable.instagram_chevron_down_outline_16;
            }
            C5YS.A07(c5Tl, c6l0.AB7(C118195Wf.A04, c1130158n), C5Y7.A00(c5Tl, i5, 0), null, "icon to signify whether the row item is expanded", 48, 24, 0L);
            C5WR.A0d(c5Tl, AbstractC118175Wb.A08(modifier2, 4.0f), str, i3 & 14, 32764, 0L);
            c5Tl.ASW();
            AbstractC28495Cho.A05(null, null, c6gm, c5Tl, AbstractC28010CWi.A00(modifier2, 20.0f, 0.0f), null, C5UA.A01(c5Tl, new RepositoryInfoFragmentKt$ExpandableColumn$1$3(interfaceC16620sF), -347926608), 1572870, 28, AbstractC25230BEn.A1X(interfaceC74953Yl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1154379214);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new RepositoryInfoFragmentKt$ExpandableColumn$2(str, modifier2, interfaceC16620sF, i, i2);
        }
    }

    public static final void HeaderPreview(C5Tl c5Tl, int i) {
        c5Tl.Enr(489554936);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2025971415, "com.instagram.debug.devoptions.modernarchitecture.HeaderPreview (RepositoryInfoFragment.kt:166)");
            }
            Header(null, c5Tl, 0, 1);
            if (C0fH.A02()) {
                C0fH.A00(1340260924);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new RepositoryInfoFragmentKt$HeaderPreview$1(i);
        }
    }

    public static final void MemoryCacheStats(RepositoryInfoViewModel.MemoryCacheStats memoryCacheStats, Modifier modifier, C5Tl c5Tl, int i, int i2) {
        int i3;
        c5Tl.Enr(-1258332538);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, memoryCacheStats) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1707852052, "com.instagram.debug.devoptions.modernarchitecture.MemoryCacheStats (RepositoryInfoFragment.kt:112)");
            }
            ExpandableColumn("Memory Cache", null, C5UA.A01(c5Tl, new RepositoryInfoFragmentKt$MemoryCacheStats$1(memoryCacheStats, modifier), -24091347), c5Tl, 390, 2);
            if (C0fH.A02()) {
                C0fH.A00(1378999784);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new RepositoryInfoFragmentKt$MemoryCacheStats$2(memoryCacheStats, modifier, i, i2);
        }
    }

    public static final void RepositoryItem(RepositoryInfoViewModel.RepositoryInfo repositoryInfo, Modifier modifier, C5Tl c5Tl, int i, int i2) {
        int i3;
        c5Tl.Enr(-1817237141);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, repositoryInfo) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-230361885, "com.instagram.debug.devoptions.modernarchitecture.RepositoryItem (RepositoryInfoFragment.kt:99)");
            }
            ExpandableColumn(repositoryInfo.name, null, C5UA.A01(c5Tl, new RepositoryInfoFragmentKt$RepositoryItem$1(repositoryInfo, modifier), 782474130), c5Tl, 384, 2);
            if (C0fH.A02()) {
                C0fH.A00(-1871361761);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new RepositoryInfoFragmentKt$RepositoryItem$2(repositoryInfo, modifier, i, i2);
        }
    }

    public static final void RepositoryItemPreview(C5Tl c5Tl, int i) {
        c5Tl.Enr(-1030001432);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1359702806, "com.instagram.debug.devoptions.modernarchitecture.RepositoryItemPreview (RepositoryInfoFragment.kt:172)");
            }
            RepositoryItem(new RepositoryInfoViewModel.RepositoryInfo("TestRepository", "Some extra info", null), null, c5Tl, 0, 2);
            if (C0fH.A02()) {
                C0fH.A00(-628954269);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new RepositoryInfoFragmentKt$RepositoryItemPreview$1(i);
        }
    }
}
