package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ce7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28319Ce7 {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r7 == X.C5UI.A00) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        if (r0 == X.C5UI.A00) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r26, androidx.compose.ui.Modifier r27, X.C26087BgG r28, X.InterfaceC16660sJ r29, X.InterfaceC16660sJ r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28319Ce7.A00(X.5Tl, androidx.compose.ui.Modifier, X.BgG, X.0sJ, X.0sJ, int, int):void");
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, C148336m3 c148336m3, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(375196289);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c148336m3);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1603302225, "com.instagram.friendmap.view.compose.EmojiImage (FriendMapEmojiSelectorContent.kt:177)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 917967394);
            Object obj = C5UI.A00;
            boolean z = true;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, true);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, 917969656, i2);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean z2 = A1O | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == obj) {
                EEc = new ME1(24, c148336m3, interfaceC16660sJ);
                c5Tl.FBy(EEc);
            }
            Modifier A0T = AbstractC25229BEm.A0T(c117505Tk, modifier, EEc);
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0a, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String str = c148336m3.A01;
            String str2 = c148336m3.A02;
            SimpleImageUrl A002 = C168157fA.A00(str, str2);
            long A0J = AbstractC25226BEj.A0J(c5Tl);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 1561666458);
            if (A0q2 == obj) {
                A0q2 = new C50158MDl(interfaceC74953Yl, 23);
                c5Tl.FBy(A0q2);
            }
            C2DB A02 = AbstractC43541zP.A02(c5Tl, A002, null, AbstractC25225BEi.A1A(c117505Tk, A0q2, false), null, 3072, 116, A0J, false, false);
            C1130158n c1130158n = Modifier.A00;
            C6LQ.A0C(c5Tl, AbstractC118185Wd.A08(AbstractC118185Wd.A0D(c1130158n, 50.0f), 64.0f), A02, str2, 384);
            c5Tl.Eno(1561671264);
            if (AbstractC25230BEn.A1X(interfaceC74953Yl)) {
                BIR.A01(c5Tl, AbstractC118185Wd.A0C(c1130158n, 32.0f));
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(1284376100);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(interfaceC16660sJ, c148336m3, modifier, i, 49);
        }
    }

    public static final void A02(C5Tl c5Tl, Modifier modifier, List list, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(927917758);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, list) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-947417297, "com.instagram.friendmap.view.compose.EmojiRow (FriendMapEmojiSelectorContent.kt:153)");
            }
            int size = 6 - list.size();
            Modifier A08 = AbstractC118175Wb.A08(modifier, 4.0f);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A05, c5Tl, C118195Wf.A05, 6);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            Iterator A0x = AbstractC25227BEk.A0x(c5Tl, list, 1533247273);
            while (A0x.hasNext()) {
                A01(c5Tl, AbstractC118185Wd.A0C(Modifier.A00, 64.0f), (C148336m3) A0x.next(), interfaceC16660sJ, ((i2 >> 3) & 14) | 384);
            }
            C117505Tk.A0I(c117505Tk);
            c5Tl.Eno(1533252793);
            int i3 = 1;
            if (1 <= size) {
                while (true) {
                    AbstractC119685bS.A00(c5Tl, AbstractC118185Wd.A0C(Modifier.A00, 64.0f));
                    if (i3 == size) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            C117505Tk.A0I(c117505Tk);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-993850263);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30219DSy(i, 0, modifier, interfaceC16660sJ, list);
        }
    }
}
