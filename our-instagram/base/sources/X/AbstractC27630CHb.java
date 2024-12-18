package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;

/* renamed from: X.CHb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27630CHb {
    public static final void A00(C5Tl c5Tl, ImmutableList immutableList, C26071Bg0 c26071Bg0, C27829COs c27829COs, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        long A02;
        C14360o3.A0B(interfaceC16660sJ, 0);
        AbstractC25233BEq.A0v(1, c27829COs, immutableList, c26071Bg0);
        c5Tl.Enr(-1296261718);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c27829COs);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, immutableList);
        }
        if ((i & 7168) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, c26071Bg0);
        }
        if ((i2 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1550147156, "com.instagram.creation.genai.themes.ui.AiThemesImagePickerContent (AiThemesImagePickerContent.kt:35)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 943849177);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, Float.valueOf(0.5625f));
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A03 = AbstractC118175Wb.A03(AbstractC25229BEm.A0X(AbstractC25228BEl.A0V(), new C30183DRo(26, c26071Bg0, A0q)));
            C28773Cn5 c28773Cn5 = new C28773Cn5(24.0f);
            Modifier A01 = C6L2.A01(A03, new C5WJ(c28773Cn5, c28773Cn5, c28773Cn5, c28773Cn5));
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r0 & 63)], C1132359l.A03(r0), C1132359l.A02(r0), C1132359l.A01(AbstractC25226BEj.A09(c5Tl)), 0.0f);
            Modifier A0X = AbstractC25226BEj.A0X(A01, A02);
            c5Tl.Enp(-270267587);
            Object A0k = AbstractC25235BEs.A0k(c5Tl, -3687241);
            if (A0k == obj) {
                A0k = new C28880Coo();
                c5Tl.FBy(A0k);
            }
            C117505Tk.A0L(A0K, false);
            C28880Coo c28880Coo = (C28880Coo) A0k;
            Object A0k2 = AbstractC25235BEs.A0k(c5Tl, -3687241);
            if (A0k2 == obj) {
                A0k2 = new CU3();
                c5Tl.FBy(A0k2);
            }
            C117505Tk.A0L(A0K, false);
            CU3 cu3 = (CU3) A0k2;
            Object A0c = AbstractC25234BEr.A0c(c5Tl, AbstractC25235BEs.A0k(c5Tl, -3687241), obj, false);
            C117505Tk.A0L(A0K, false);
            C09530e4 A00 = AbstractC28019CWr.A00(c5Tl, (InterfaceC74953Yl) A0c, cu3, c28880Coo);
            Object obj2 = A0q;
            CBM.A00(c5Tl, AnonymousClass598.A00(A0X, new C57744PjX(c28880Coo, 26), false), (InterfaceC1127857k) A00.A00, C5UA.A00(c5Tl, new DWO(obj2, c26071Bg0, cu3, c27829COs, A00.A01, interfaceC16660sJ, immutableList, 0, i2, 1)), 48, 0);
            if (AbstractC25227BEk.A1b(A0K, false)) {
                C0fH.A00(-1658957752);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c26071Bg0, interfaceC16660sJ, immutableList, c27829COs, i, 7);
        }
    }
}
