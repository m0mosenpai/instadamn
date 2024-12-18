package X;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;

/* renamed from: X.BXu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25709BXu {
    public static final void A01(C5Tl c5Tl, C45119Jxo c45119Jxo, InterfaceC30953DjA interfaceC30953DjA, InterfaceC30953DjA interfaceC30953DjA2, InterfaceC30953DjA interfaceC30953DjA3, SettingsScreenViewModel settingsScreenViewModel, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean A1R = AbstractC167007dF.A1R(0, c45119Jxo, interfaceC16620sF);
        AbstractC167007dF.A1E(interfaceC30953DjA, 2, interfaceC30953DjA2);
        AbstractC25234BEr.A0k(4, interfaceC16620sF2, interfaceC16660sJ, interfaceC30953DjA3, interfaceC16660sJ2);
        C14360o3.A0B(settingsScreenViewModel, 8);
        c5Tl.Enr(-348433592);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c45119Jxo) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF);
        }
        if ((i & 384) == 0) {
            int i3 = 128;
            if (AbstractC25231BEo.A1Q(c5Tl, interfaceC30953DjA, i & 512)) {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            int i4 = 1024;
            if (AbstractC25231BEo.A1Q(c5Tl, interfaceC30953DjA2, i & 4096)) {
                i4 = C3OO.FLAG_MOVED;
            }
            i2 |= i4;
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF2);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16660sJ);
        }
        if ((1572864 & i) == 0) {
            boolean A1V = AbstractC25233BEq.A1V(c5Tl, interfaceC30953DjA3, i, 2097152);
            int i5 = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            if (A1V) {
                i5 = 1048576;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16660sJ2);
        }
        if ((100663296 & i) == 0) {
            i2 |= AbstractC25232BEp.A0P(c5Tl, settingsScreenViewModel);
        }
        if ((38347923 & i2) == 38347922 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1325560333, "com.instagram.settings2.core.view.SettingsScreen (SettingsScreen.kt:57)");
            }
            c5Tl.AJX(AndroidCompositionLocals_androidKt.A01);
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, settingsScreenViewModel, AbstractC25227BEk.A1Z(c5Tl, c45119Jxo, 974764413) | AbstractC25234BEr.A1V(i2) | AbstractC25234BEr.A1T(i2), AbstractC25233BEq.A1I(i2)) | AbstractC25234BEr.A1W(i2);
            if ((i2 & 896) == 256 || ((i2 & 512) != 0 && c5Tl.AH6(interfaceC30953DjA))) {
                z = true;
            } else {
                z = false;
            }
            boolean z4 = A1U | z;
            if ((3670016 & i2) == 1048576 || ((i2 & 2097152) != 0 && c5Tl.AH6(interfaceC30953DjA3))) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z5 = z4 | z2;
            if ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && c5Tl.AH6(interfaceC30953DjA2))) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z5 | z3;
            Object EEc = c5Tl.EEc();
            if (z6 || EEc == C5UI.A00) {
                EEc = new C25713BXy(c45119Jxo, interfaceC16660sJ2, interfaceC16660sJ, interfaceC16620sF, settingsScreenViewModel, interfaceC16620sF2, interfaceC30953DjA, interfaceC30953DjA3, interfaceC30953DjA2, A1R ? 1 : 0);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C6IS.A09(c5Tl, (InterfaceC16660sJ) EEc);
            Object obj = c45119Jxo.A04;
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, settingsScreenViewModel, c45119Jxo, 974916711);
            Object EEc2 = c5Tl.EEc();
            if (A1W || EEc2 == C5UI.A00) {
                EEc2 = new C43171J6q(c45119Jxo, settingsScreenViewModel, (InterfaceC23621Ds) null, 23);
                c5Tl.FBy(EEc2);
            }
            if (AbstractC25232BEp.A1V(c5Tl, A0K, EEc2, obj, false)) {
                C0fH.A00(-808713489);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30319DWu(c45119Jxo, interfaceC16660sJ2, settingsScreenViewModel, interfaceC30953DjA, interfaceC16620sF, interfaceC16660sJ, interfaceC30953DjA2, interfaceC30953DjA3, interfaceC16620sF2, i, 2);
        }
    }

    public static final void A00(C5Tl c5Tl, C51759Mti c51759Mti, EnumC72392Xce enumC72392Xce, int i) {
        int i2;
        C29194Ctz c29194Ctz;
        c5Tl.Enr(-1260308514);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, enumC72392Xce) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c51759Mti);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1412115937, "com.instagram.settings2.core.view.SectionHeader (SettingsScreen.kt:186)");
            }
            String A01 = AbstractC25703BXn.A01(c5Tl, c51759Mti);
            EnumC27366C5v enumC27366C5v = EnumC27366C5v.A03;
            c5Tl.Eno(-639474187);
            if (enumC72392Xce == EnumC72392Xce.A0t) {
                c29194Ctz = new C29194Ctz(AbstractC25225BEi.A0S(C1132359l.A08), AbstractC25227BEk.A0P(c5Tl, R.drawable.company_brand_meta_lockup_primary_12));
            } else {
                c29194Ctz = null;
            }
            AbstractC25228BEl.A1O(c5Tl);
            BY1.A00(c5Tl, null, c29194Ctz, enumC27366C5v, A01, 33152, 42);
            if (C0fH.A02()) {
                C0fH.A00(920430104);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, enumC72392Xce, c51759Mti, i, 18);
        }
    }
}
