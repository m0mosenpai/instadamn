package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Cdu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28308Cdu {
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
    
        if ((r38 & 1572864) == 1048576) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r31, androidx.compose.ui.Modifier r32, X.InterfaceC30813Dgo r33, com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r34, X.InterfaceC16820sZ r35, X.InterfaceC16620sF r36, X.InterfaceC16620sF r37, int r38, int r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28308Cdu.A00(X.5Tl, androidx.compose.ui.Modifier, X.Dgo, com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform, X.0sZ, X.0sF, X.0sF, int, int, boolean):void");
    }

    public static final void A01(C5Tl c5Tl, ImageUrl imageUrl, String str, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        c5Tl.Enr(-1025236442);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, imageUrl);
        }
        if ((i & 7168) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1864726434, "com.instagram.creation.genai.magicmod.common.ui.SuggestedPromptPill (MagicModSuggestedPrompts.kt:161)");
            }
            C1130158n c1130158n = Modifier.A00;
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131965960);
            boolean A1R = AbstractC25233BEq.A1R(c5Tl, 509512299, i2);
            Object EEc = c5Tl.EEc();
            if (A1R || EEc == C5UI.A00) {
                EEc = DH4.A01(c5Tl, interfaceC16820sZ, 40);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A03 = AbstractC118635Yc.A03(c5Tl, c1130158n, A00, (InterfaceC16820sZ) EEc);
            long j = C5XL.A00(c5Tl).A08;
            C5XL.A02(c5Tl);
            Modifier A0A = AbstractC118175Wb.A0A(C6L3.A01(A03, C5WE.A02, j), 16.0f, 14.0f);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0d, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (z) {
                c5Tl.Eno(1116072706);
                C5YS.A05(c5Tl, AbstractC25227BEk.A0I(AbstractC118185Wd.A0C(c1130158n, 16.0f), 6.0f), C5Y7.A00(c5Tl, R.drawable.instagram_promote_pano_outline_24, 0), AbstractC25226BEj.A0L(c5Tl));
            } else if (imageUrl != null) {
                c5Tl.Eno(1116387573);
                C6LQ.A04(c5Tl, AbstractC25226BEj.A0W(AbstractC118185Wd.A03(AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 6.0f, 0.0f))), AbstractC25226BEj.A0w(c5Tl, imageUrl, i2 >> 6));
            } else {
                c5Tl.Eno(1116604759);
            }
            C117505Tk.A0L(A0K, false);
            C5WR.A0d(c5Tl, null, str, i2 & 14, 32762, AbstractC25226BEj.A08(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(799285369);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30223DTc(imageUrl, interfaceC16820sZ, str, i, 2, z);
        }
    }

    public static final void A02(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-1775974332);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1776540248, "com.instagram.creation.genai.magicmod.common.ui.RerollPill (MagicModSuggestedPrompts.kt:141)");
            }
            C2DC A00 = C5Y7.A00(c5Tl, R.drawable.instagram_dice_filled_24, 0);
            long A0D = AbstractC25226BEj.A0D(c5Tl);
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131965961);
            C1130158n c1130158n = Modifier.A00;
            long j = C5XL.A00(c5Tl).A08;
            C5XL.A02(c5Tl);
            Modifier A08 = AbstractC118185Wd.A08(AbstractC118185Wd.A0D(AbstractC118175Wb.A0A(C6L3.A01(c1130158n, C5WE.A02, j), 16.0f, 14.0f), 16.0f), 16.0f);
            c5Tl.Eno(2002768169);
            boolean A1S = AbstractC25228BEl.A1S(i2);
            Object EEc = c5Tl.EEc();
            if (A1S || EEc == C5UI.A00) {
                EEc = DH4.A02(c5Tl, interfaceC16820sZ, 39);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C5YS.A08(c5Tl, AbstractC118635Yc.A04(c5Tl, A08, (InterfaceC16820sZ) EEc), A00, A002, 8, A0D);
            if (C0fH.A02()) {
                C0fH.A00(-2007209258);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, interfaceC16820sZ, i, 47);
        }
    }
}
