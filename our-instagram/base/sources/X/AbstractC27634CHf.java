package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CHf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27634CHf {
    public static final void A00(C5Tl c5Tl, C51610Mr3 c51610Mr3, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, boolean z) {
        int i4;
        boolean z2 = z;
        c5Tl.Enr(1592975817);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= AbstractC25232BEp.A0c(c5Tl, z2);
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i4 |= AbstractC25232BEp.A0U(c5Tl, c51610Mr3);
        }
        if ((i4 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            boolean z3 = true;
            z2 = AbstractC25226BEj.A1V(i5, z2);
            if (C0fH.A02()) {
                C0fH.A01(-124823558, "com.instagram.creation.genai.themes.ui.AnimatedNullStateImage (AnimatedNullStateImage.kt:30)");
            }
            C2DC A0Y = AbstractC25226BEj.A0Y(c5Tl, i4, i);
            Modifier A03 = AbstractC118175Wb.A03(Modifier.A00);
            boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, 520297715, i4);
            Object EEc = c5Tl.EEc();
            if (A1Q || EEc == C5UI.A00) {
                EEc = new C57242PbQ(interfaceC16820sZ, 14);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            Modifier A0G = AbstractC118185Wd.A0G(AbstractC118635Yc.A01(c5Tl, A03, null, null, (InterfaceC16820sZ) EEc, 6, z2), 104.0f, 180.0f);
            c5Tl.Eno(520300866);
            if ((i4 & 7168) != 2048) {
                z3 = false;
            }
            Object EEc2 = c5Tl.EEc();
            if (z3 || EEc2 == C5UI.A00) {
                EEc2 = new C57744PjX(c51610Mr3, 29);
                c5Tl.FBy(EEc2);
            }
            C117505Tk.A0I(A0J);
            Modifier A0Y2 = AbstractC25230BEn.A0Y(A0G, (InterfaceC16660sJ) EEc2);
            float f = c51610Mr3.A03;
            C6LQ.A0B(c5Tl, CB9.A00(A0Y2, AbstractC27748CLp.A00, f, f), A0Y, C5YJ.A00, C5YD.A00(c5Tl, 2131961924), 24584);
            if (C0fH.A02()) {
                C0fH.A00(212658990);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTF(c51610Mr3, interfaceC16820sZ, i, i2, i3, z2);
        }
    }
}
