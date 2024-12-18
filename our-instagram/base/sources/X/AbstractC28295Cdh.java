package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Cdh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28295Cdh {
    public static final void A02(C5Tl c5Tl, Modifier modifier, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(-125214729);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-975391289, "com.instagram.barcelona.creation.topics.SearchTopicTitleOnlyPreview (SearchTopicPreview.kt:124)");
            }
            Modifier A0N = AbstractC25227BEk.A0N(modifier2, 12.0f);
            InterfaceC1127857k A0L = AbstractC25235BEs.A0L(AbstractC118255Wn.A04, c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0N);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0L, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            C5WR.A0k(c5Tl, AbstractC25226BEj.A0h(c5Tl), str, i3 & 14, 16382);
            C5YS.A00(c5Tl, c6l0.AB7(C118195Wf.A04, AbstractC118185Wd.A03(Modifier.A00)), C5Y7.A00(c5Tl, R.drawable.barcelona_search_filled_26, 0));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1424782490);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT2(modifier2, str, i2, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r13, androidx.compose.ui.Modifier r14, com.instagram.api.schemas.LineType r15, com.instagram.common.typedurl.ImageUrl r16, java.lang.String r17, java.lang.String r18, X.InterfaceC16820sZ r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28295Cdh.A00(X.5Tl, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, X.0sZ, int, int, boolean):void");
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, ImageUrl imageUrl, String str, String str2, int i, int i2) {
        int i3;
        C118125Vw A00;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, str, str2);
        c5Tl.Enr(-1194085462);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, imageUrl);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier2);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1588819899, "com.instagram.barcelona.creation.topics.SearchTopicRichPreview (SearchTopicPreview.kt:86)");
            }
            InterfaceC1127857k A0z = AbstractC25232BEp.A0z(AbstractC118255Wn.A04, c5Tl, C118195Wf.A05, ((i3 >> 9) & 14) | 48);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0z, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            C1130158n c1130158n = Modifier.A00;
            Modifier A003 = c6l0.A00(AbstractC118175Wb.A01(c1130158n));
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A01(6.0f), c5Tl, C118195Wf.A02, 6);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A003);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A02, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C5WR.A0k(c5Tl, AbstractC25226BEj.A0h(c5Tl), str, i3 & 14, 16382);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            A00 = C118125Vw.A00(null, null, AbstractC25225BEi.A0Y(c5Tl), null, null, null, 0, 0, 0, 16646141, 0L, AbstractC118155Vz.A01(13), 0L, AbstractC118155Vz.A00(18.2f, 4294967296L));
            C5WR.A0p(c5Tl, A00, str2, 3, (i3 >> 3) & 14, A0M);
            c5Tl.ASW();
            c5Tl.Eno(-2054717515);
            if (imageUrl != null) {
                AbstractC136656Gu.A01(c5Tl, null, c6l0.AB7(C118195Wf.A04, AbstractC25226BEj.A0X(AbstractC118185Wd.A0C(AbstractC25228BEl.A0X(AbstractC118175Wb.A01(c1130158n), 10.0f), 65.0f), C5XL.A00(c5Tl).A0i)), null, C5YJ.A00, imageUrl, null, null, null, null, 0.0f, ((i3 >> 6) & 14) | 12582960, 0, 1912, 0L);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(1447491445);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUU(modifier2, imageUrl, str2, str, i, i2, A1R ? 1 : 0);
        }
    }
}
