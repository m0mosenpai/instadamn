package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagElement;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;

/* renamed from: X.BXo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25704BXo {
    public static final void A00(C5Tl c5Tl, C25714BXz c25714BXz, SettingsScreenViewModel settingsScreenViewModel, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        String str;
        C117505Tk c117505Tk;
        C2DC A00;
        InterfaceC30805Dgg by4;
        C14360o3.A0B(c25714BXz, 0);
        C14360o3.A0B(interfaceC16620sF, 1);
        C14360o3.A0B(settingsScreenViewModel, 2);
        c5Tl.Enr(-1125329329);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH6(c25714BXz)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = 16;
            if (c5Tl.AH6(interfaceC16620sF)) {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i5 = 128;
            if (c5Tl.AH6(settingsScreenViewModel)) {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1619291772, "com.instagram.settings2.core.view.NavigationRow (NavigationRow.kt:31)");
            }
            if (c25714BXz.A0A) {
                Modifier Eq3 = Modifier.A00.Eq3(new TestTagElement("settings_navigation_row"));
                C6N c6n = c25714BXz.A05;
                boolean z = true;
                String str2 = null;
                if (c6n != null) {
                    c5Tl.Eno(1502528069);
                    String str3 = AbstractC25703BXn.A02(c5Tl, c25714BXz.A02).toString();
                    Modifier Eq32 = Eq3.Eq3(AbstractC118185Wd.A02);
                    c5Tl.Eno(1849586903);
                    if ((i2 & 112) != 32) {
                        z = false;
                    }
                    boolean AH6 = c5Tl.AH6(c25714BXz) | z;
                    Object EEc = c5Tl.EEc();
                    if (AH6 || EEc == C5UI.A00) {
                        EEc = new C57252Pba(27, interfaceC16620sF, c25714BXz);
                        c5Tl.FBy(EEc);
                    }
                    c117505Tk = (C117505Tk) c5Tl;
                    C117505Tk.A0L(c117505Tk, false);
                    CGM.A00(c5Tl, Eq32, c6n, str3, (InterfaceC16820sZ) EEc, 384, 16, false);
                } else {
                    c5Tl.Eno(1502799691);
                    String str4 = AbstractC25703BXn.A02(c5Tl, c25714BXz.A02).toString();
                    C51759Mti c51759Mti = c25714BXz.A03;
                    c5Tl.Eno(1849595525);
                    if (c51759Mti == null) {
                        str = null;
                    } else {
                        str = AbstractC25703BXn.A02(c5Tl, c51759Mti).toString();
                    }
                    c117505Tk = (C117505Tk) c5Tl;
                    C117505Tk.A0L(c117505Tk, false);
                    c5Tl.Eno(1849597958);
                    if (!c25714BXz.A09) {
                        Modifier Eq33 = Eq3.Eq3(AbstractC118185Wd.A02);
                        C5XQ c5xq = new C5XQ(0);
                        c5Tl.Eno(1849602205);
                        boolean z2 = false;
                        if ((i2 & 112) == 32) {
                            z2 = true;
                        }
                        boolean AH62 = c5Tl.AH6(c25714BXz) | z2;
                        Object EEc2 = c5Tl.EEc();
                        if (AH62 || EEc2 == C5UI.A00) {
                            EEc2 = new C57252Pba(28, interfaceC16620sF, c25714BXz);
                            c5Tl.FBy(EEc2);
                        }
                        C117505Tk.A0L(c117505Tk, false);
                        Eq3 = C5XR.A05(Eq33, c5xq, null, (InterfaceC16820sZ) EEc2, true);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    Integer num = c25714BXz.A08;
                    c5Tl.Eno(1849606305);
                    if (num == null) {
                        A00 = null;
                    } else {
                        A00 = C5Y7.A00(c5Tl, num.intValue(), 0);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    C51759Mti c51759Mti2 = c25714BXz.A01;
                    c5Tl.Eno(1849609109);
                    if (c51759Mti2 == null) {
                        by4 = null;
                    } else {
                        by4 = new BY4(AbstractC25703BXn.A02(c5Tl, c51759Mti2).toString(), true);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    if (by4 == null) {
                        by4 = C29198Cu3.A00;
                    }
                    C51759Mti c51759Mti3 = c25714BXz.A00;
                    c5Tl.Eno(1849616549);
                    if (c51759Mti3 != null) {
                        str2 = AbstractC25703BXn.A02(c5Tl, c51759Mti3).toString();
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    AbstractC25705BXp.A00(c5Tl, Eq3, null, null, A00, null, c25714BXz.A04, by4, str4, str, str2, null, null, 0, 0, 0, 0, 0, 64716, 0L, false);
                }
                C117505Tk.A0L(c117505Tk, false);
                EnumC72393Xcf enumC72393Xcf = c25714BXz.A07;
                c5Tl.Eno(1849620128);
                boolean AH63 = c5Tl.AH6(settingsScreenViewModel) | c5Tl.AH6(c25714BXz);
                Object EEc3 = c5Tl.EEc();
                if (AH63 || EEc3 == C5UI.A00) {
                    EEc3 = new C43171J6q(c25714BXz, settingsScreenViewModel, (InterfaceC23621Ds) null, 20);
                    c5Tl.FBy(EEc3);
                }
                C117505Tk.A0L(c117505Tk, false);
                C5UX.A04(c5Tl, enumC72393Xcf, (InterfaceC16620sF) EEc3);
            }
            if (C0fH.A02()) {
                C0fH.A00(1616909953);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30219DSy(i, 11, interfaceC16620sF, c25714BXz, settingsScreenViewModel);
        }
    }
}
