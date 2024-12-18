package X;

import androidx.compose.ui.Modifier;
import com.instagram.compose.core.ui.IgClickableTextKt;

/* loaded from: classes5.dex */
public abstract class CHX {
    public static final void A00(C5Tl c5Tl, EnumC27394C6x enumC27394C6x, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        AbstractC167017dG.A1P(enumC27394C6x, interfaceC16820sZ);
        c5Tl.Enr(309405553);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, enumC27394C6x);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(407636749, "com.instagram.creation.genai.themes.ui.AiTermsDisclaimer (AiTermsDisclaimer.kt:23)");
            }
            if (!z && enumC27394C6x == EnumC27394C6x.A04) {
                String A00 = C5YD.A00(c5Tl, 2131952881);
                String A002 = C5YD.A00(c5Tl, 2131952880);
                int A08 = AbstractC001900j.A08(A002, A00, 0, false);
                int A0A = AbstractC167007dF.A0A(A00) + A08;
                C5W3 c5w3 = new C5W3(null, null, null, null, null, 65534, AbstractC25226BEj.A0C(c5Tl), 0L, 0L);
                C6C7 A0U = AbstractC25231BEo.A0U(A002);
                A0U.A06(c5w3, A08, A0A);
                C5C8 A0R = AbstractC25227BEk.A0R(A0U, "link", "ai_terms_link", A08, A0A);
                long A0M = AbstractC25226BEj.A0M(c5Tl);
                Modifier A0C = AbstractC118175Wb.A0C(AbstractC118175Wb.A0A(Modifier.A00, 16.0f, 0.0f), 0.0f, 0.0f, 16.0f);
                C118125Vw A0Y = AbstractC25225BEi.A0Y(c5Tl);
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A0R, 121990437) | AbstractC25231BEo.A1M(i2);
                Object EEc = c5Tl.EEc();
                if (A1Y || EEc == C5UI.A00) {
                    EEc = C30183DRo.A00(c5Tl, interfaceC16820sZ, A0R, 25);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                IgClickableTextKt.A08(c5Tl, A0C, A0R, A0Y, (InterfaceC16660sJ) EEc, A0M);
            }
            if (C0fH.A02()) {
                C0fH.A00(531162913);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30488DbX(i, 10, interfaceC16820sZ, enumC27394C6x, z);
        }
    }
}
