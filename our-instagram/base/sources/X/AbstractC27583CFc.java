package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CFc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27583CFc {
    public static final void A00(C5Tl c5Tl, C169207gt c169207gt, C27961CUg c27961CUg, int i) {
        int i2;
        String A00;
        int i3;
        int i4;
        boolean A1R = AbstractC167007dF.A1R(0, c169207gt, c27961CUg);
        c5Tl.Enr(640381991);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c169207gt) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c27961CUg);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1060363348, "com.instagram.comments.mvvm.view.compose.ChildCommentLoadRow (ChildCommentLoadRow.kt:34)");
            }
            int intValue = c169207gt.A02.intValue();
            if (intValue != A1R) {
                if (intValue != 0 && intValue != 2) {
                    throw AbstractC25233BEq.A0r(c5Tl, -32404432);
                }
                c5Tl.Eno(-1004328140);
                int intValue2 = c169207gt.A04.intValue();
                if (intValue2 != 0) {
                    if (intValue2 == A1R) {
                        c5Tl.Eno(-32392589);
                        A00 = C5YD.A00(c5Tl, 2131965664);
                    } else {
                        throw AbstractC25233BEq.A0r(c5Tl, -32397320);
                    }
                } else {
                    c5Tl.Eno(-32395520);
                    Context A0K = AbstractC25228BEl.A0K(c5Tl);
                    C14360o3.A0B(A0K, 0);
                    int intValue3 = c169207gt.A03.intValue();
                    Resources A0M = AbstractC166997dE.A0M(A0K);
                    int i5 = c169207gt.A00;
                    if (intValue3 != 0) {
                        i3 = R.plurals.view_x_previous_replies;
                        i4 = 2131976872;
                    } else {
                        i3 = R.plurals.view_x_more_replies;
                        i4 = 2131976861;
                    }
                    if (i5 > 0) {
                        try {
                            A00 = A0M.getQuantityString(i3, i5, Integer.valueOf(i5));
                        } catch (Resources.NotFoundException unused) {
                            A00 = A0M.getString(i4);
                        }
                    } else {
                        A00 = A0M.getString(i4);
                    }
                    C14360o3.A0A(A00);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
            } else {
                c5Tl.Eno(-32402512);
                A00 = C5YD.A00(c5Tl, 2131963549);
            }
            C117505Tk A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0A = AbstractC118175Wb.A0A(AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), 54.0f, 0.0f, 12.0f, 0.0f), 0.0f, 6.0f);
            boolean A1K = AbstractC25231BEo.A1K(i2) | AbstractC25233BEq.A1O(c5Tl, -32378738, i2);
            Object EEc = c5Tl.EEc();
            if (A1K || EEc == C5UI.A00) {
                EEc = new D8L(15, c169207gt, c27961CUg);
                c5Tl.FBy(EEc);
            }
            Modifier A0T = AbstractC25229BEm.A0T(A0K2, A0A, EEc);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K2);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, A0K2);
            AbstractC25231BEo.A12(c5Tl, A0d, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K2.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC25229BEm.A16(c5Tl, AbstractC118175Wb.A0E(AbstractC118185Wd.A0D(AbstractC118185Wd.A08(c1130158n, 1.0f), 22.0f), 0.0f, 0.0f, 9.0f, 0.0f), AbstractC25225BEi.A0D(c5Tl));
            AbstractC27588CFh.A00(A00, c5Tl, 0);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1930664534);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, c27961CUg, c169207gt, i, 28);
        }
    }
}
