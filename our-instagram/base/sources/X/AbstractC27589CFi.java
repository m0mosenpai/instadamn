package X;

/* renamed from: X.CFi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27589CFi {
    public static final void A00(C5Tl c5Tl, C26949Buq c26949Buq, C166047bW c166047bW, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16610sE interfaceC16610sE, InterfaceC16610sE interfaceC16610sE2, InterfaceC16600sD interfaceC16600sD, InterfaceC16600sD interfaceC16600sD2, InterfaceC16590sC interfaceC16590sC, int i) {
        int i2;
        C14360o3.A0B(c26949Buq, 0);
        AbstractC167007dF.A1E(interfaceC16600sD, 2, interfaceC16610sE);
        AbstractC25234BEr.A0k(4, interfaceC16660sJ, interfaceC16590sC, interfaceC16610sE2, interfaceC16600sD2);
        c5Tl.Enr(786209455);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26949Buq) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c166047bW);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16600sD);
        }
        if ((i & 7168) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16610sE);
        }
        if ((57344 & i) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((458752 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16590sC);
        }
        if ((3670016 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16610sE2);
        }
        if ((29360128 & i) == 0) {
            i2 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16600sD2);
        }
        if ((23967451 & i2) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(964080306, "com.instagram.comments.mvvm.view.compose.CommentPollResults (CommentPollResults.kt:68)");
            }
            C29177Cti c29177Cti = new C29177Cti(AbstractC25230BEn.A0P(c5Tl), c26949Buq, AbstractC25229BEm.A0e(c5Tl), (InterfaceC60442pS) c5Tl.AJX(AbstractC117915Vb.A00), interfaceC16660sJ, interfaceC16610sE, interfaceC16610sE2, interfaceC16600sD, interfaceC16600sD2, interfaceC16590sC, c26949Buq.A03, c26949Buq.A02);
            if (c166047bW != null) {
                CGA.A00(c5Tl, null, c29177Cti, c166047bW, i2 & 112, 4);
            }
            if (C0fH.A02()) {
                C0fH.A00(-878272684);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWQ(c26949Buq, c166047bW, interfaceC16660sJ, interfaceC16600sD, interfaceC16610sE2, interfaceC16610sE, interfaceC16600sD2, interfaceC16590sC, i, 2);
        }
    }
}
