package X;

import androidx.compose.ui.Modifier;
import java.util.Locale;

/* renamed from: X.Cgm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28438Cgm {
    public static final void A02(C5Tl c5Tl, String str, String str2, String str3, int i) {
        int i2;
        AbstractC167007dF.A1K(str, str2);
        C14360o3.A0B(str3, 2);
        c5Tl.Enr(1775306711);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str3);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2017067565, "com.instagram.creation.genai.memu.settings.FooterWithEndingLink (MemuSettingsComposables.kt:87)");
            }
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            boolean z = true;
            String format = String.format(Locale.getDefault(), str, str2);
            C14360o3.A07(format);
            if (AbstractC25227BEk.A1U(c5Tl, -571451189)) {
                C0fH.A01(949616702, "com.instagram.creation.genai.memu.settings.getAnnotatedStringWithLearnMoreLink (MemuSettingsComposables.kt:57)");
            }
            int A0E = AbstractC25230BEn.A0E(format, str2);
            int A04 = AbstractC25226BEj.A04(str2, A0E);
            C6C7 A0U = AbstractC25231BEo.A0U(format);
            A0U.A06(new C5W3(null, null, null, C5W5.A03, null, 65530, AbstractC25226BEj.A0C(c5Tl), 0L, 0L), A0E, A04);
            C5C8 A0R = AbstractC25227BEk.A0R(A0U, "link", "Clickable link", A0E, A04);
            if (C0fH.A02()) {
                C0fH.A00(1056090724);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Object A11 = AbstractC25225BEi.A11(c5Tl);
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, A11, AbstractC25232BEp.A1Y(c5Tl, A0R, A19, -1199437097));
            if ((i2 & 896) != 256) {
                z = false;
            }
            boolean z2 = A1X | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = new C50365MLr(A0R, A11, A19, str3, 31);
                c5Tl.FBy(EEc);
            }
            AbstractC28303Cdp.A01(c5Tl, null, A0R, AbstractC25225BEi.A1B(A0K, EEc, false), 0, 2);
            if (C0fH.A02()) {
                C0fH.A00(-1606597472);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT7(str, str2, str3, i, 0);
        }
    }

    public static final void A03(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        C14360o3.A0B(interfaceC16820sZ, 1);
        c5Tl.Enr(1347916169);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-867029336, "com.instagram.creation.genai.memu.settings.LinkListCell (MemuSettingsComposables.kt:75)");
            }
            String A00 = C5YD.A00(c5Tl, i);
            C1130158n c1130158n = Modifier.A00;
            C5XQ A0W = AbstractC25225BEi.A0W(0);
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, 1844385351, i3);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = DGV.A00(c5Tl, interfaceC16820sZ, 38);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC25705BXp.A0E(c5Tl, C5XR.A05(c1130158n, A0W, null, (InterfaceC16820sZ) EEc, true), C29198Cu3.A00, A00);
            if (C0fH.A02()) {
                C0fH.A00(407355206);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, interfaceC16820sZ, i, i2, 14);
        }
    }

    public static final void A04(C5Tl c5Tl, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        InterfaceC16660sJ interfaceC16660sJ2 = interfaceC16660sJ;
        boolean z3 = z2;
        c5Tl.Enr(-932795376);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = AbstractC25232BEp.A0b(c5Tl, z) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= AbstractC25232BEp.A0d(c5Tl, z3);
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ2);
        }
        if ((i4 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            z3 = AbstractC25226BEj.A1V(i5, z3);
            if (i6 != 0) {
                interfaceC16660sJ2 = DNL.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1260790257, "com.instagram.creation.genai.memu.settings.SettingSwitch (MemuSettingsComposables.kt:46)");
            }
            AbstractC25705BXp.A0H(c5Tl, null, new C29199Cu4(interfaceC16660sJ2, z, false), C5YD.A00(c5Tl, i), i4 & 896, 130810, z3);
            if (C0fH.A02()) {
                C0fH.A00(1289431522);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTE(interfaceC16660sJ2, i, i2, i3, z, z3);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(-867674066);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1669160208, "com.instagram.creation.genai.memu.settings.MemuSettingsDivider (MemuSettingsComposables.kt:36)");
            }
            AbstractC28389Cfs.A02(c5Tl, AbstractC118185Wd.A08(Modifier.A00, 6.0f), 0.0f, 6, 4, AbstractC25226BEj.A0B(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(2130496923);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 36);
        }
    }

    public static final void A01(C5Tl c5Tl, int i, int i2) {
        int i3;
        c5Tl.Enr(-555839344);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2003262537, "com.instagram.creation.genai.memu.settings.Header (MemuSettingsComposables.kt:31)");
            }
            BY1.A04(c5Tl, C5YD.A00(c5Tl, i));
            if (C0fH.A02()) {
                C0fH.A00(-1257348456);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30483DbS.A00(ASZ, i, i2, 7);
        }
    }
}
