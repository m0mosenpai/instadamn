package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;

/* loaded from: classes5.dex */
public abstract class CYN {
    public static final void A01(C5Tl c5Tl, Modifier modifier, String str, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        C14360o3.A0B(modifier, 0);
        AbstractC167017dG.A1P(str, interfaceC16820sZ);
        c5Tl.Enr(84737011);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(213420506, "com.instagram.creation.genai.themes.ui.ThemePreviewThumbnailImage (AiThemesImagePickerHScrollSelector.kt:87)");
            }
            C1130158n c1130158n = Modifier.A00;
            String A00 = C5YD.A00(c5Tl, 2131975453);
            boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, 498352147, i2);
            Object EEc = c5Tl.EEc();
            if (A1Q || EEc == C5UI.A00) {
                EEc = new C57242PbQ(interfaceC16820sZ, 12);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6LQ.A0B(c5Tl, AbstractC27468CAo.A00(AbstractC118185Wd.A08(AbstractC25228BEl.A0X(AbstractC25227BEk.A0M(AbstractC118635Yc.A03(c5Tl, c1130158n, A00, (InterfaceC16820sZ) EEc), 4.0f).Eq3(modifier), 4.0f), 60.0f), 0.5625f, false), AbstractC25235BEs.A0d(c5Tl, str), C5YJ.A00, C5YD.A00(c5Tl, 2131975452), 24584);
            if (C0fH.A02()) {
                C0fH.A00(-364544436);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT4(interfaceC16820sZ, modifier, str, i, 9);
        }
    }

    public static final void A00(C5Tl c5Tl, Modifier modifier, ImmutableList immutableList, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        Modifier modifier2 = modifier;
        int A07 = AbstractC25230BEn.A07(2, immutableList, interfaceC16660sJ);
        c5Tl.Enr(141043265);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= AbstractC25232BEp.A09(c5Tl, i5);
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= AbstractC25232BEp.A0T(c5Tl, immutableList);
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i4 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i4 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                i5 = 0;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1268403392, "com.instagram.creation.genai.themes.ui.AiThemesImagePickerHScrollSelector (AiThemesImagePickerHScrollSelector.kt:42)");
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, A07);
            c5Tl.Eno(1393397321);
            if (immutableList.size() > 0) {
                Integer valueOf = Integer.valueOf(i5);
                boolean A1K = AbstractC25231BEo.A1K(i4) | AbstractC25227BEk.A1Y(c5Tl, A00, 1393399456);
                Object EEc = c5Tl.EEc();
                if (A1K || EEc == C5UI.A00) {
                    EEc = new C57155PYz(A00, null, i5, 15);
                    c5Tl.FBy(EEc);
                }
                AbstractC25231BEo.A10(c5Tl, EEc, valueOf);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            InterfaceC1127857k A002 = C5XX.A00(C118195Wf.A06, false);
            int A003 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A002, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            InterfaceC118335Wv interfaceC118335Wv = AbstractC118255Wn.A02;
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C1333560c c1333560c = new C1333560c(12.0f, 0.0f, 12.0f, 0.0f);
            Modifier A0A = AbstractC118175Wb.A0A(AbstractC118175Wb.A0E(AbstractC25228BEl.A0W(), 0.0f, 10.0f, 0.0f, 16.0f), 8.0f, 0.0f);
            boolean A1Z = AbstractC25234BEr.A1Z(c5Tl, 404949427, i4) | AbstractC25233BEq.A1I(i4) | AbstractC25233BEq.A1K(i4);
            Object EEc2 = c5Tl.EEc();
            if (A1Z || EEc2 == C5UI.A00) {
                EEc2 = new C30171DRb(i5, 4, immutableList, interfaceC16660sJ);
                c5Tl.FBy(EEc2);
            }
            C6IS.A02(interfaceC118335Wv, c1333560c, A00, c5Tl, interfaceC118225Wj, A0A, AbstractC25225BEi.A1B(A0K, EEc2, false), 12804480, 72);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(49854278);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUH(modifier2, immutableList, interfaceC16660sJ, i5, i2, i3, 0);
        }
    }
}
