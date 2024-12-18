package X;

import android.graphics.Bitmap;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.creation.genai.magicmod.common.ui.MagicModGenAIImageSelectorKt$LastItemAnimatingBox$1$1;
import java.util.List;

/* renamed from: X.Cds, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28306Cds {
    public static final void A00(C5Tl c5Tl, C28224CcU c28224CcU, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        float f;
        float f2;
        float f3;
        AbstractC167007dF.A1D(c28224CcU, 0, interfaceC16660sJ);
        if (AbstractC25235BEs.A1W(c5Tl, -1628043439)) {
            C0fH.A01(-2069535389, "com.instagram.creation.genai.magicmod.common.ui.ImageOptionThumbnail (MagicModGenAIImageSelector.kt:110)");
        }
        Bitmap bitmap = c28224CcU.A00;
        if (bitmap != null) {
            C6LZ c6lz = new C6LZ(bitmap);
            C5UP c5up = AbstractC117935Vd.A00;
            AbstractC12990ll A0v = AbstractC25226BEj.A0v(c5Tl, c5up);
            C06090Tz A0j = AbstractC25225BEi.A0j(A0v, 0);
            boolean A06 = C18U.A06(A0j, A0v, 36319888432111384L);
            c5Tl.Eno(-2145912430);
            if (A06) {
                AbstractC12990ll A0v2 = AbstractC25226BEj.A0v(c5Tl, c5up);
                C14360o3.A0B(A0v2, 0);
                f = AbstractC25225BEi.A07(A0j, A0v2, 36601363409277098L);
            } else {
                f = 44.0f;
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            c5Tl.Eno(-2145906219);
            if (A06) {
                AbstractC12990ll A0v3 = AbstractC25226BEj.A0v(c5Tl, c5up);
                C14360o3.A0B(A0v3, 0);
                f2 = AbstractC25225BEi.A07(A0j, A0v3, 36601363409342635L);
            } else {
                f2 = 4.0f;
            }
            C117505Tk.A0L(A0K, false);
            if (z) {
                f3 = 2.0f * 2.0f;
            } else {
                f3 = 0.0f;
            }
            float f4 = f + f3;
            C137026If c137026If = new C137026If(c6lz);
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131969910);
            float A002 = AbstractC25230BEn.A00(z ? 1 : 0);
            C5YL c5yl = C5YJ.A00;
            Modifier modifier = Modifier.A00;
            Modifier A0M = AbstractC25227BEk.A0M(AbstractC118635Yc.A03(c5Tl, modifier, AbstractC136736Hc.A00(c5Tl, 2131973234), new DH0(8, c28224CcU, interfaceC16660sJ)), 4.0f);
            c5Tl.Eno(-2145878420);
            if (z) {
                modifier = AbstractC25228BEl.A0Y(modifier, f2, 2.0f, AbstractC25226BEj.A0D(c5Tl));
            }
            C6LQ.A00(c5Tl, null, AbstractC25228BEl.A0X(AbstractC27468CAo.A00(AbstractC118185Wd.A08(AbstractC25227BEk.A0G(A0K, A0M, modifier), f4), 0.5625f, false), f2), null, c137026If, c5yl, A00, A002, 24584, 72);
        }
        if (C0fH.A02()) {
            C0fH.A00(909310997);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30488DbX(i, 7, interfaceC16660sJ, c28224CcU, z);
        }
    }

    public static final void A01(C5Tl c5Tl, String str, List list, InterfaceC16660sJ interfaceC16660sJ, int i) {
        C5UU ASZ;
        int i2;
        AbstractC167017dG.A1P(list, interfaceC16660sJ);
        if (AbstractC25235BEs.A1W(c5Tl, 1494702248)) {
            C0fH.A01(1540734307, "com.instagram.creation.genai.magicmod.common.ui.MagicModGeneratedImageOptionSelector (MagicModGenAIImageSelector.kt:53)");
        }
        if (list.isEmpty()) {
            if (C0fH.A02()) {
                C0fH.A00(426237561);
            }
            ASZ = c5Tl.ASZ();
            if (ASZ != null) {
                i2 = 5;
            } else {
                return;
            }
        } else {
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, list, -18671417);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = Integer.valueOf(list.size());
                c5Tl.FBy(EEc);
            }
            int A0H = AbstractC166987dD.A0H(EEc);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, list, -18668589);
            Object EEc2 = c5Tl.EEc();
            if (A1Y2 || EEc2 == C5UI.A00) {
                C28224CcU c28224CcU = (C28224CcU) AbstractC001800i.A0L(list);
                if (c28224CcU != null) {
                    EEc2 = c28224CcU.A04;
                } else {
                    EEc2 = null;
                }
                c5Tl.FBy(EEc2);
            }
            String str2 = (String) EEc2;
            C117505Tk.A0L(A0K, false);
            if (str2 == null) {
                if (C0fH.A02()) {
                    C0fH.A00(-480847508);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                } else {
                    i2 = 7;
                }
            } else {
                Integer valueOf = Integer.valueOf(A0H);
                boolean A1Y3 = AbstractC25227BEk.A1Y(c5Tl, A00, -18664963) | c5Tl.AH2(A0H);
                Object EEc3 = c5Tl.EEc();
                if (A1Y3 || EEc3 == C5UI.A00) {
                    EEc3 = new C57155PYz(A00, null, A0H, 14);
                    c5Tl.FBy(EEc3);
                }
                AbstractC25228BEl.A1K(c5Tl, A0K, EEc3, valueOf, false);
                Alignment alignment = C118195Wf.A06;
                C1130158n c1130158n = Modifier.A00;
                Modifier A0A = AbstractC118175Wb.A0A(c1130158n, 0.0f, 10.0f);
                InterfaceC1127857k A002 = C5XX.A00(alignment, false);
                int A003 = C5X2.A00(c5Tl);
                C59P A04 = C117505Tk.A04(A0K);
                Modifier A01 = C5X3.A01(c5Tl, A0A);
                AbstractC25233BEq.A11(c5Tl, A0K);
                AbstractC25231BEo.A12(c5Tl, A002, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                C6IS.A02(AbstractC118255Wn.A02, new C1333560c(12.0f, 0.0f, 12.0f, 0.0f), A00, c5Tl, C118195Wf.A04, AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), 0.0f, 0.0f, 0.0f, 12.0f), new C50371MLy(interfaceC16660sJ, list, str2, str, 24), 12804486, 72);
                if (AbstractC25227BEk.A1R(c5Tl)) {
                    C0fH.A00(2064297046);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                } else {
                    i2 = 6;
                }
            }
        }
        ASZ.A06 = new DT4(interfaceC16660sJ, list, str, i, i2);
    }

    public static final void A02(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, float f, int i, boolean z) {
        int i2;
        c5Tl.Enr(-1819177158);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A04(c5Tl, f);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1562316294, "com.instagram.creation.genai.magicmod.common.ui.LastItemAnimatingBox (MagicModGenAIImageSelector.kt:90)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -270038416);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                float f2 = 0.0f;
                if (z) {
                    f2 = f;
                }
                A0q = AbstractC25232BEp.A0w(c5Tl, new C119145aW(f2));
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -270035679);
            if (A0q2 == obj) {
                float f3 = 1.0f;
                if (z) {
                    f3 = 0.0f;
                }
                A0q2 = AbstractC25232BEp.A0w(c5Tl, Float.valueOf(f3));
            }
            InterfaceC74953Yl interfaceC74953Yl2 = (InterfaceC74953Yl) A0q2;
            Boolean A0k = AbstractC25227BEk.A0k(c117505Tk, z);
            boolean A1K = AbstractC25231BEo.A1K(i2) | AbstractC25233BEq.A1O(c5Tl, -270032761, i2);
            Object EEc = c5Tl.EEc();
            if (A1K || EEc == obj) {
                EEc = new MagicModGenAIImageSelectorKt$LastItemAnimatingBox$1$1(interfaceC74953Yl, interfaceC74953Yl2, null, f, z);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1K(c5Tl, c117505Tk, EEc, A0k, false);
            Modifier A00 = CB8.A00(AbstractC28010CWi.A00(Modifier.A00, ((C119145aW) interfaceC74953Yl.getValue()).A00, 0.0f), AbstractC25231BEo.A03(interfaceC74953Yl2));
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A00);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF, i2 >> 6);
            if (C0fH.A02()) {
                C0fH.A00(1579596047);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSM(interfaceC16620sF, f, i, z);
        }
    }
}
