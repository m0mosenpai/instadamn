package X;

import androidx.compose.ui.Modifier;
import com.instagram.user.model.User;

/* renamed from: X.CXb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28027CXb {
    /* JADX WARN: Type inference failed for: r13v1, types: [X.DiS, java.lang.Object] */
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i, int i2, long j) {
        int i3;
        Modifier modifier2 = modifier;
        AbstractC25233BEq.A0v(0, c5Hc, interfaceC16620sF, interfaceC16820sZ);
        c5Tl.Enr(-786591552);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, c5Hc) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0E(c5Tl, j);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if ((i2 & 16) != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-2017092224, "com.instagram.barcelona.feed.post.ui.MultiAccountLikePopup (MultiAccountLikePopup.kt:46)");
            }
            AbstractC28413CgJ.A01(c5Tl, new Object(), null, interfaceC16820sZ, C5UA.A01(c5Tl, new DSV(j, c5Hc, interfaceC16620sF, 1), -1114261406), ((i3 >> 6) & 112) | 3072, 4);
            if (C0fH.A02()) {
                C0fH.A00(1665227335);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV3(c5Hc, interfaceC16620sF, interfaceC16820sZ, modifier2, i, i2, 1, j);
        }
    }

    public static final void A01(C5Tl c5Tl, User user, InterfaceC16660sJ interfaceC16660sJ, int i, long j) {
        int i2;
        AbstractC167007dF.A1D(user, 0, interfaceC16660sJ);
        c5Tl.Enr(-2006077094);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, user) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0E(c5Tl, j);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-962690252, "com.instagram.barcelona.feed.post.ui.MultiAccountUserLikeRow (MultiAccountLikePopup.kt:98)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -295646954);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0f, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            AbstractC136656Gu.A02(c5Tl, AbstractC25231BEo.A0R(AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 8.0f, 0.0f), 20.0f), user.Bhu());
            C5WR.A0c(c5Tl, c6l0.A00(c1130158n), user.getUsername(), 32764);
            boolean A1X = AbstractC25230BEn.A1X(interfaceC74953Yl);
            boolean A1Z = AbstractC25234BEr.A1Z(c5Tl, -697474079, i2);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == obj) {
                EEc = new MHW(4, interfaceC74953Yl, interfaceC16660sJ);
                c5Tl.FBy(EEc);
            }
            C6HO.A01(c5Tl, null, AbstractC25225BEi.A1A(A0K, EEc, false), null, i2 & 112, 108, j, A1X, false, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(898090128);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30216DSv(j, user, interfaceC16660sJ, i, 1);
        }
    }
}
