package X;

import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CKK {
    public static final void A00(C5Tl c5Tl, InterfaceC30953DjA interfaceC30953DjA, SettingsScreenViewModel settingsScreenViewModel, C26229Bit c26229Bit, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        String A01;
        boolean z;
        String str;
        boolean z2;
        C14360o3.A0B(c26229Bit, 0);
        AbstractC167017dG.A1P(interfaceC30953DjA, interfaceC16660sJ);
        C14360o3.A0B(settingsScreenViewModel, 3);
        c5Tl.Enr(1129358592);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c26229Bit) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, interfaceC30953DjA, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, settingsScreenViewModel);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-587121989, "com.instagram.settings2.core.view.SingleSelectionEnumSetting (SingleSelectEnumSettingElement.kt:22)");
            }
            C51759Mti c51759Mti = c26229Bit.A00;
            c5Tl.Eno(679155438);
            if (c51759Mti == null) {
                A01 = null;
            } else {
                A01 = AbstractC25703BXn.A01(c5Tl, c51759Mti);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            BY1.A01(c5Tl, null, null, EnumC27366C5v.A03, AbstractC25703BXn.A01(c5Tl, c26229Bit.A01), A01, Integer.MAX_VALUE, 196992, 18);
            c5Tl.Eno(679164780);
            List list = c26229Bit.A05;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (((C45111Jxg) obj).A05) {
                    A1E.add(obj);
                }
            }
            Iterator it = A1E.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                C45111Jxg c45111Jxg = (C45111Jxg) it.next();
                C51759Mti c51759Mti2 = (C51759Mti) c45111Jxg.A01;
                c5Tl.Eno(679166898);
                if (c51759Mti2 != null) {
                    str = AbstractC25703BXn.A01(c5Tl, c51759Mti2);
                } else {
                    str = null;
                }
                C117505Tk.A0L(A0K, false);
                ArrayList A0T = AbstractC001800i.A0T(c45111Jxg.A04, (Collection) c45111Jxg.A03);
                if (!(A0T instanceof Collection) || !A0T.isEmpty()) {
                    Iterator it2 = A0T.iterator();
                    while (it2.hasNext()) {
                        if (C14360o3.A0K(it2.next(), c26229Bit.A03)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                String A012 = AbstractC25703BXn.A01(c5Tl, (C51759Mti) c45111Jxg.A02);
                boolean z3 = c26229Bit.A06;
                boolean A1W = AbstractC25227BEk.A1W(c5Tl, -388594097, z2);
                if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !c5Tl.AH6(interfaceC30953DjA))) {
                    z = false;
                }
                boolean A1X = AbstractC25233BEq.A1X(c5Tl, c26229Bit, c45111Jxg, A1W, z);
                Object EEc = c5Tl.EEc();
                if (A1X || EEc == C5UI.A00) {
                    EEc = new C29708D8b(3, interfaceC30953DjA, c26229Bit, c45111Jxg, z2);
                    c5Tl.FBy(EEc);
                }
                AbstractC25705BXp.A08(c5Tl, null, null, new C29197Cu2(z2, AbstractC25225BEi.A1A(A0K, EEc, false)), A012, str, 0, 130794, z3);
            }
            C117505Tk.A0L(A0K, false);
            List list2 = c26229Bit.A04;
            if (A01 == null) {
                z = false;
            }
            BY0.A06(c5Tl, list2, interfaceC16660sJ, i2 & 896, z);
            InterfaceC58303Psv interfaceC58303Psv = c26229Bit.A02;
            boolean A1W2 = AbstractC25233BEq.A1W(c5Tl, settingsScreenViewModel, c26229Bit, 679197545);
            Object EEc2 = c5Tl.EEc();
            if (A1W2 || EEc2 == C5UI.A00) {
                EEc2 = new C43171J6q(c26229Bit, settingsScreenViewModel, (InterfaceC23621Ds) null, 24);
                c5Tl.FBy(EEc2);
            }
            if (AbstractC25232BEp.A1V(c5Tl, A0K, EEc2, interfaceC58303Psv, false)) {
                C0fH.A00(-1955596901);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c26229Bit, settingsScreenViewModel, interfaceC30953DjA, interfaceC16660sJ, i, 25);
        }
    }
}
