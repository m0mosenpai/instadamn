package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CXu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28042CXu {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        if (X.C18U.A06(X.AbstractC25225BEi.A0j(r5, 0), r5, 36318243454982218L) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bf, code lost:
    
        if (r4 != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r26, X.EnumC166147bi r27, X.InterfaceC16820sZ r28, X.InterfaceC16660sJ r29, int r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28042CXu.A01(X.5Tl, X.7bi, X.0sZ, X.0sJ, int, boolean):void");
    }

    public static final void A00(C5Tl c5Tl, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        c5Tl.Enr(-1079053485);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z2);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z3);
        }
        if ((i2 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1151647827, "com.instagram.comments.mvvm.view.compose.NuxText (CommentCoverNotRevealedTitle.kt:107)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A05, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String A002 = C5YD.A00(c5Tl, C28194Cbo.A00.A00(AbstractC25228BEl.A0u(c5Tl), z, z2, z3));
            C5WR.A0Q(c5Tl, AbstractC25227BEk.A0L(c1130158n, 8.0f), AbstractC25225BEi.A0Y(c5Tl), A002, 5, AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-756972814);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSG(z, z2, z3, i);
        }
    }
}
