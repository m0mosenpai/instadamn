package X;

import androidx.compose.ui.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Cfn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28384Cfn {
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017c, code lost:
    
        if (r49.A05 != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C5Tl r47, com.instagram.api.schemas.MetaPlaceDict r48, X.CT2 r49, com.instagram.common.typedurl.ImageUrl r50, java.lang.Double r51, java.lang.String r52, java.lang.String r53, X.InterfaceC16820sZ r54, X.InterfaceC16820sZ r55, X.InterfaceC16820sZ r56, int r57, int r58, boolean r59, boolean r60, boolean r61) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28384Cfn.A02(X.5Tl, com.instagram.api.schemas.MetaPlaceDict, X.CT2, com.instagram.common.typedurl.ImageUrl, java.lang.Double, java.lang.String, java.lang.String, X.0sZ, X.0sZ, X.0sZ, int, int, boolean, boolean, boolean):void");
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, String str, int i, int i2, int i3) {
        int i4;
        Modifier modifier2 = modifier;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(-1012349359);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = AbstractC25232BEp.A0R(c5Tl, str) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i4 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-654151424, "com.instagram.barcelona.feed.post.ui.QuotePostCaption (PostPreview.kt:591)");
            }
            long A01 = AbstractC118155Vz.A01(14);
            Map A0n = AbstractC167007dF.A0n("://quote", new BGB(new BGA(A01, A01, 7), C5UA.A01(c5Tl, new C30515Dby(((C57y) c5Tl.AJX(C5V2.A01)).EqG(A01), 0), -1505319063)));
            C6C7 c6c7 = new C6C7(16);
            BIT.A00(c6c7, "://quote", "�");
            c6c7.A09(" ");
            C5C8 A02 = c6c7.A02();
            c5Tl.Eno(590767008);
            C6C7 c6c72 = new C6C7(16);
            c6c72.A09(str);
            AbstractC119845bi A00 = C69X.A00(AbstractC25228BEl.A0K(c5Tl));
            ArrayList A1E = AbstractC166987dD.A1E();
            int i6 = 0;
            int i7 = 0;
            while (i6 < str.length()) {
                char charAt = str.charAt(i6);
                int i8 = i7 + 1;
                Integer valueOf = Integer.valueOf(i7);
                if (charAt == C00Q.A01("\uf000") && valueOf != null) {
                    A1E.add(valueOf);
                }
                i6++;
                i7 = i8;
            }
            Iterator it = AbstractC133095zb.A00(A1E).iterator();
            while (it.hasNext()) {
                int A0B = AbstractC167007dF.A0B(it);
                c6c72.A06(new C5W3(A00, null, null, null, null, 65375, 0L, 0L, AbstractC118155Vz.A01(3)), A0B, A0B + 1);
            }
            C5C8 A022 = c6c72.A02();
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C6C7 c6c73 = new C6C7(16);
            c6c73.A05(A02);
            c6c73.A05(A022);
            C5C8 A023 = c6c73.A02();
            InterfaceC1127857k A0z = AbstractC25232BEp.A0z(AbstractC118255Wn.A01, c5Tl, C118195Wf.A05, (i4 >> 6) & 14);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, modifier2);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C5WR.A02(c5Tl, null, A023, C118125Vw.A01(null, (C118125Vw) c5Tl.AJX(C5WR.A00), null, null, null, 0, 66562, 15728639, 0L, 0L, 0L), null, null, null, A0n, null, 0, 0, i, 2, 0, AbstractC25225BEi.A03(i4), 5114, AbstractC25226BEj.A0M(c5Tl), 0L, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(463154628);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30201DSg(modifier2, str, i, i2, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0288, code lost:
    
        if (r7.AXw() == null) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024a  */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C5Tl r51, X.C25999Ben r52, X.CT2 r53, X.C38641Gyi r54, java.lang.Integer r55, java.lang.String r56, X.InterfaceC16820sZ r57, X.InterfaceC16660sJ r58, X.InterfaceC16660sJ r59, X.InterfaceC16620sF r60, X.InterfaceC16610sE r61, X.InterfaceC16600sD r62, X.C5Hc r63, int r64, int r65, int r66, boolean r67) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28384Cfn.A03(X.5Tl, X.Ben, X.CT2, X.Gyi, java.lang.Integer, java.lang.String, X.0sZ, X.0sJ, X.0sJ, X.0sF, X.0sE, X.0sD, X.5Hc, int, int, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x062d, code lost:
    
        if (r0.isEmpty() == false) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r101, androidx.compose.ui.Modifier r102, com.instagram.api.schemas.LineType r103, X.InterfaceC99414dE r104, X.CT2 r105, X.C26024BfD r106, X.C132275y6 r107, java.lang.Integer r108, java.lang.String r109, java.lang.String r110, X.InterfaceC16820sZ r111, X.InterfaceC16820sZ r112, X.InterfaceC16820sZ r113, X.InterfaceC16820sZ r114, X.InterfaceC16820sZ r115, X.InterfaceC16820sZ r116, X.InterfaceC16820sZ r117, X.InterfaceC16660sJ r118, X.InterfaceC16660sJ r119, X.InterfaceC16660sJ r120, X.InterfaceC16660sJ r121, X.InterfaceC16620sF r122, X.InterfaceC16620sF r123, X.InterfaceC16620sF r124, X.InterfaceC16620sF r125, X.InterfaceC16610sE r126, X.InterfaceC16610sE r127, X.InterfaceC16600sD r128, int r129, int r130, int r131, int r132, int r133) {
        /*
            Method dump skipped, instructions count: 2300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28384Cfn.A00(X.5Tl, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.4dE, X.CT2, X.BfD, X.5y6, java.lang.Integer, java.lang.String, java.lang.String, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sF, X.0sF, X.0sF, X.0sF, X.0sE, X.0sE, X.0sD, int, int, int, int, int):void");
    }
}
