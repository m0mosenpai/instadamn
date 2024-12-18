package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CYC {
    public static final void A00(C5Tl c5Tl, InterfaceC30812Dgn interfaceC30812Dgn, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        int i2;
        AbstractC167007dF.A1D(interfaceC30812Dgn, 0, interfaceC16660sJ);
        c5Tl.Enr(1102999237);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC30812Dgn) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(930753694, "com.instagram.creation.genai.common.ui.ImageOptionThumbnail (CreationGenAIImageSelector.kt:71)");
            }
            Modifier modifier = Modifier.A00;
            Modifier A0X = AbstractC25228BEl.A0X(AbstractC27468CAo.A00(AbstractC118175Wb.A0A(AbstractC118185Wd.A08(modifier, 100.0f), 4.0f, 0.0f), 0.5625f, false), 10.0f);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0X);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (interfaceC30812Dgn instanceof C29229CuY) {
                c5Tl.Eno(-481397310);
                C137026If c137026If = new C137026If(new C6LZ(((C29229CuY) interfaceC30812Dgn).A00));
                String A002 = C5YD.A00(c5Tl, 2131969910);
                float f = 0.8f;
                if (z) {
                    f = 1.0f;
                }
                C5YL c5yl = C5YJ.A00;
                String A003 = C5YD.A00(c5Tl, 2131973234);
                c5Tl.Eno(1647056131);
                boolean AH6 = c5Tl.AH6(interfaceC30812Dgn) | AbstractC25231BEo.A1M(i2);
                Object EEc = c5Tl.EEc();
                if (AH6 || EEc == C5UI.A00) {
                    EEc = DH0.A01(c5Tl, interfaceC30812Dgn, interfaceC16660sJ, 1);
                }
                Modifier A03 = AbstractC118635Yc.A03(c5Tl, modifier, A003, AbstractC25225BEi.A1A(c117505Tk, EEc, false));
                c5Tl.Eno(1647060901);
                if (z) {
                    modifier = AbstractC25228BEl.A0Y(modifier, 10.0f, 2.0f, AbstractC25226BEj.A0D(c5Tl));
                }
                C6LQ.A00(c5Tl, null, AbstractC25228BEl.A0X(AbstractC27468CAo.A00(AbstractC118185Wd.A08(AbstractC25227BEk.A0G(c117505Tk, A03, modifier), 100.0f), 0.5625f, false), 10.0f), null, c137026If, c5yl, A002, f, DalvikInternals.IOPRIO_BACKGROUND, 72);
            } else {
                C5XX.A02(c5Tl, AbstractC28487Chf.A01(c5Tl, AbstractC25226BEj.A0X(modifier, AbstractC25227BEk.A0g(c5Tl, -480224704).A0c).Eq3(AbstractC118185Wd.A01), AbstractC28487Chf.A03(c5Tl, null, 0.0f, 0.0f, 0, 1572864, 62, C5XL.A00(c5Tl).A0c), 0), 0);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(1031083673);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30488DbX(i, 6, interfaceC16660sJ, interfaceC30812Dgn, z);
        }
    }

    public static final void A01(C5Tl c5Tl, String str, List list, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        C5UU ASZ;
        int i3;
        AbstractC167017dG.A1P(list, interfaceC16660sJ);
        c5Tl.Enr(-819376631);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, list);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(55491178, "com.instagram.creation.genai.common.ui.CreationGenAIImageSelector (CreationGenAIImageSelector.kt:42)");
            }
            if (list.isEmpty()) {
                if (C0fH.A02()) {
                    C0fH.A00(-612571186);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 3;
                ASZ.A06 = new DT4(interfaceC16660sJ, list, str, i, i3);
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            Alignment alignment = C118195Wf.A06;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0A = AbstractC118175Wb.A0A(c1130158n, 0.0f, 10.0f);
            InterfaceC1127857k A002 = C5XX.A00(alignment, false);
            int A003 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A002, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            InterfaceC118335Wv interfaceC118335Wv = AbstractC118255Wn.A02;
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C1333560c c1333560c = new C1333560c(12.0f, 0.0f, 12.0f, 0.0f);
            Modifier A0E = AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), 0.0f, 0.0f, 0.0f, 12.0f);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, list, -928992963) | AbstractC25233BEq.A1H(i2) | AbstractC25233BEq.A1J(i2);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = AbstractC25229BEm.A11(c5Tl, interfaceC16660sJ, list, str, 23);
            }
            C6IS.A02(interfaceC118335Wv, c1333560c, A00, c5Tl, interfaceC118225Wj, A0E, AbstractC25225BEi.A1B(c117505Tk, EEc, false), 12804486, 72);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-868681473);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 4;
            ASZ.A06 = new DT4(interfaceC16660sJ, list, str, i, i3);
        }
    }
}
