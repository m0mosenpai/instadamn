package X;

import androidx.compose.ui.Modifier;
import com.instagram.compose.core.ui.IgClickableTextKt;
import java.util.Iterator;

/* renamed from: X.CGx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27626CGx {
    public static final void A00(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        int i3;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(-1777586169);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-567874642, "com.instagram.creation.genai.attribution.bottomsheet.FooterCreatedWithAIText (FooterCreatedWithAIText.kt:29)");
            }
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            int i4 = 0;
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131956992);
            c5Tl.Eno(9388920);
            boolean A1P = AbstractC167007dF.A1P(i2 & 14, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A0w(c5Tl, interfaceC16820sZ, 6);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C45127Jxw c45127Jxw = new C45127Jxw(A00, (InterfaceC16660sJ) EEc);
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131965052);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, A19, 9392607);
            Object EEc2 = c5Tl.EEc();
            if (A1Z || EEc2 == C5UI.A00) {
                EEc2 = AbstractC25230BEn.A0w(c5Tl, A19, 7);
            }
            C5Hb A04 = AbstractC133095zb.A04(c45127Jxw, new C45127Jxw(A002, AbstractC25225BEi.A1B(A0K, EEc2, false)));
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A04, 9401659);
            Object EEc3 = c5Tl.EEc();
            if (A1Y || EEc3 == C5UI.A00) {
                EEc3 = AbstractC25232BEp.A0w(c5Tl, AbstractC25226BEj.A1H(" • ", A04, DN5.A00));
            }
            InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(A0K, EEc3, false);
            c5Tl.Eno(9405716);
            C6C7 A0g = AbstractC25228BEl.A0g();
            Iterator A0x = AbstractC25227BEk.A0x(c5Tl, A04, 9406735);
            while (A0x.hasNext()) {
                Object next = A0x.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                String str = ((C45127Jxw) next).A01;
                A0g.A09(str);
                int A003 = A0g.A00(new C5W3(null, null, null, C5W5.A03, null, 65530, AbstractC25226BEj.A0C(c5Tl), 0L, 0L));
                try {
                    int A08 = AbstractC001900j.A08(AbstractC25226BEj.A1D(A0M), str, 0, false);
                    if (str != null) {
                        i3 = str.length();
                    } else {
                        i3 = 0;
                    }
                    A0g.A0A("Link", str, A08, i3 + A08);
                    A0g.A04(A003);
                    if (i4 < A04.size() - 1) {
                        A0g.A09(" • ");
                    }
                    i4 = i5;
                } catch (Throwable th) {
                    A0g.A04(A003);
                    throw th;
                }
            }
            C117505Tk.A0L(A0K, false);
            C5C8 A02 = A0g.A02();
            C117505Tk.A0L(A0K, false);
            long A0C = AbstractC25226BEj.A0C(c5Tl);
            Modifier A0A = AbstractC118175Wb.A0A(AbstractC118175Wb.A0E(Modifier.A00, 0.0f, 0.0f, 0.0f, 16.0f), 16.0f, 0.0f);
            C118125Vw A0Y = AbstractC25225BEi.A0Y(c5Tl);
            boolean A1Z2 = AbstractC25232BEp.A1Z(c5Tl, A02, A04, 9430026);
            Object EEc4 = c5Tl.EEc();
            if (A1Z2 || EEc4 == C5UI.A00) {
                EEc4 = C30183DRo.A00(c5Tl, A04, A02, 1);
            }
            IgClickableTextKt.A08(c5Tl, A0A, A02, A0Y, AbstractC25225BEi.A1B(A0K, EEc4, false), A0C);
            if (C0fH.A02()) {
                C0fH.A00(1222981824);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, interfaceC16820sZ, i, 38);
        }
    }
}
