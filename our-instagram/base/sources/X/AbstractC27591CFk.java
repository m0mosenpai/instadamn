package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import java.util.NoSuchElementException;

/* renamed from: X.CFk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27591CFk {
    public static final void A00(C5Tl c5Tl, C26947Buo c26947Buo, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        Integer num;
        int i3;
        Object A05;
        boolean A1R = AbstractC167007dF.A1R(0, c26947Buo, interfaceC16820sZ);
        c5Tl.Enr(-341474060);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26947Buo) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(157277975, "com.instagram.comments.mvvm.view.compose.CommentSortAndFilterRow (CommentSortAndFilterRow.kt:28)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 727091219);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                EnumC166067ba enumC166067ba = c26947Buo.A01;
                if (c26947Buo.A00 != 0) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                Resources A0M = AbstractC166997dE.A0M(A0K);
                if (enumC166067ba == EnumC166067ba.A05) {
                    i3 = 2131956448;
                } else {
                    if (num == C05F.A01) {
                        Object[] stringArray = A0M.getStringArray(R.array.comments_sorting_options);
                        C14360o3.A07(stringArray);
                        int length = stringArray.length;
                        if (length == 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        A05 = stringArray[length - 1];
                    } else if (num == C05F.A00) {
                        String[] stringArray2 = A0M.getStringArray(R.array.comments_sorting_options);
                        C14360o3.A07(stringArray2);
                        A05 = AbstractC009903n.A05(stringArray2);
                    } else {
                        i3 = 2131956446;
                    }
                    C14360o3.A07(A05);
                    A0q = (String) A05;
                    c5Tl.FBy(A0q);
                }
                A0q = AbstractC166997dE.A0q(A0M, i3);
                c5Tl.FBy(A0q);
            }
            String str = (String) A0q;
            C117505Tk A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, 727097019, i2);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == obj) {
                EEc = new C29906DGu(interfaceC16820sZ, 17);
                c5Tl.FBy(EEc);
            }
            Modifier A052 = C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(A0K2, EEc, false), A1R);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K2);
            Modifier A01 = C5X3.A01(c5Tl, A052);
            AbstractC25233BEq.A11(c5Tl, A0K2);
            AbstractC25231BEo.A12(c5Tl, A0f, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K2.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A0S(c5Tl, AbstractC118175Wb.A0E(c1130158n, 16.0f, 16.0f, 0.0f, 0.0f), AbstractC25226BEj.A0h(c5Tl), str, AbstractC25226BEj.A0G(c5Tl));
            C5YS.A08(c5Tl, AbstractC118175Wb.A0D(AbstractC118185Wd.A0I(c1130158n, 24.0f, Float.NaN, Float.NaN, Float.NaN), 0.0f, 16.0f, 16.0f), C5Y7.A00(c5Tl, R.drawable.instagram_sliders_pano_outline_24, 0), C5YD.A00(c5Tl, 2131956447), 8, AbstractC25226BEj.A0F(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1982570187);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, c26947Buo, interfaceC16820sZ, i, 29);
        }
    }
}
