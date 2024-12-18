package X;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Cfl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28382Cfl {
    public static final void A02(Drawable drawable, C5Tl c5Tl, Modifier modifier, Bf4 bf4, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        long A02;
        Modifier modifier2 = modifier;
        c5Tl.Enr(758247923);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, bf4);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, drawable);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 16) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(985514303, "com.instagram.archive.updateshub.UserReelItem (UpdatesHub.kt:266)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1701733051);
            Object obj = C5UI.A00;
            String str = null;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, null);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            C15370ps A1F = AbstractC25225BEi.A1F();
            String str2 = bf4.A08;
            if (str2 == null) {
                str2 = "";
            }
            A1F.A00 = AbstractC25235BEs.A0p(c5Tl, str2, 2131976299);
            c5Tl.Eno(1701739738);
            int i5 = bf4.A01;
            if (i5 > 0) {
                A1F.A00 = AnonymousClass001.A0g(AbstractC136736Hc.A01(c5Tl, AbstractC25228BEl.A1Y(i5), 2131976306), ", ", (String) A1F.A00);
            }
            C117505Tk.A0L(c117505Tk, false);
            Modifier A08 = AbstractC118185Wd.A08(AbstractC118185Wd.A0D(modifier2, 171.0f), 247.0f);
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131976308);
            C5XQ A0W = AbstractC25225BEi.A0W(0);
            boolean A1R = AbstractC25233BEq.A1R(c5Tl, 1701757754, i3) | AbstractC25233BEq.A1I(i3);
            Object EEc = c5Tl.EEc();
            if (A1R || EEc == obj) {
                EEc = AbstractC25229BEm.A10(c5Tl, A0q, bf4, interfaceC16620sF, 35);
            }
            Modifier A0X = AbstractC25228BEl.A0X(AnonymousClass598.A00(CY3.A00(c5Tl, A08, A0W, A00, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), 0.95f, 0.0f, 0.0f, 0.0f, 157, false), new C50262MHr(A1F, 9), false), 16.0f);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 1701766399);
            if (A0q2 == obj) {
                A0q2 = AbstractC25235BEs.A14(c5Tl, A0q, 10);
            }
            Modifier A0B = AbstractC25233BEq.A0B(c117505Tk, A0X, A0q2);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0B);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            ImageUrl imageUrl = bf4.A02;
            if (imageUrl != null) {
                str = imageUrl.getUrl();
            }
            c5Tl.Eno(-1723380341);
            if (str != null) {
                C1130158n c1130158n = Modifier.A00;
                C6LQ.A0A(c5Tl, c119645bN.Cng(c1130158n), AbstractC25235BEs.A0d(c5Tl, str), C5YJ.A03, 1597488, 40);
                c5Tl.Eno(-1723371987);
                if (i5 == 0) {
                    AbstractC25229BEm.A16(c5Tl, c119645bN.Cng(c1130158n), C5XL.A00(c5Tl).A09);
                }
                C117505Tk.A0L(c117505Tk, false);
                A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r3 & 63)], C1132359l.A03(r3), C1132359l.A02(r3), C1132359l.A01(AbstractC1132259k.A00), 0.4f);
                C5XX.A02(c5Tl, C6L3.A00(AbstractC118185Wd.A06(AbstractC25226BEj.A0T(c1130158n), 0.25f), AbstractC25236BEt.A0L(AbstractC25232BEp.A1G(AbstractC25225BEi.A0S(A02), C1132359l.A07)), C5AF.A00), 0);
                C5XX.A02(c5Tl, C6L7.A03(c119645bN.Cng(c1130158n), C5WF.A01(16.0f), 1.0f, AbstractC25226BEj.A0A(c5Tl)), 0);
                if (bf4.A0A) {
                    Modifier A0G = AbstractC118185Wd.A0G(AbstractC25225BEi.A0P(c119645bN, c1130158n), 32.0f, 32.0f);
                    C14360o3.A0B(drawable, 0);
                    if (AbstractC25227BEk.A1U(c5Tl, 677272873)) {
                        C0fH.A01(-1512066086, "com.instagram.compose.ui.loading.SpinnerImageStyle.Companion.largeBold (SpinnerImage.kt:78)");
                    }
                    BIY biy = new BIY(C5Y9.A00(drawable, c5Tl));
                    if (C0fH.A02()) {
                        C0fH.A00(-1324087786);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    BIR.A02(c5Tl, A0G, biy, 64, 0, AbstractC25226BEj.A0D(c5Tl));
                }
            }
            C117505Tk.A0L(c117505Tk, false);
            A03(c5Tl, bf4.A03, bf4.A07, str2, interfaceC16660sJ, i5, (i3 << 3) & 458752, bf4.A09);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1409331511);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV5(interfaceC16660sJ, interfaceC16620sF, drawable, modifier2, bf4, i, i2, 3);
        }
    }

    public static final void A03(C5Tl c5Tl, ImageUrl imageUrl, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z) {
        int i3;
        long j;
        c5Tl.Enr(-239045448);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, imageUrl);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0B(c5Tl, i);
        }
        if ((196608 & i2) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16660sJ);
        }
        if ((74899 & i3) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1570602459, "com.instagram.archive.updateshub.UserRowHeaderItem (UpdatesHub.kt:346)");
            }
            C1130158n c1130158n = Modifier.A00;
            boolean z2 = true;
            Modifier A01 = AbstractC118175Wb.A01(AbstractC25226BEj.A0T(c1130158n));
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131976307);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -2034527640);
            Object obj = C5UI.A00;
            C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q, obj);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C5XQ A0W = AbstractC25225BEi.A0W(0);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -2034525783, i3) | AbstractC25231BEo.A1N(458752, i3, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == obj) {
                EEc = new C57258Pbg(str, interfaceC16660sJ, 42);
                c5Tl.FBy(EEc);
            }
            Modifier A002 = AnonymousClass598.A00(C5XR.A00(null, c5xo, A01, A0W, A00, AbstractC25225BEi.A1A(A0K, EEc, false), true), DLM.A00, true);
            c5Tl.Eno(-2034520628);
            if ((i3 & 112) != 32) {
                z2 = false;
            }
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == obj) {
                EEc2 = new C50361MLn(str2, 15);
                c5Tl.FBy(EEc2);
            }
            Modifier A0J = AbstractC25236BEt.A0J(A0K, A002, EEc2);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            InterfaceC118275Wp interfaceC118275Wp = AbstractC118255Wn.A01;
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 48);
            int A003 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A0J);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            c5Tl.Eno(161989803);
            if (imageUrl != null) {
                BGD.A02(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 5.0f, 0.0f), AbstractC25226BEj.A0w(c5Tl, imageUrl, i3 >> 9), new BI2(28.0f, 28.0f, 2.0f, 1.0f), 432);
            }
            C117505Tk.A0L(A0K, false);
            InterfaceC1127857k A0a = AbstractC25230BEn.A0a(AbstractC118255Wn.A02, c5Tl);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            c5Tl.Eno(-171430879);
            if (str2 != null) {
                C5WR.A0M(c5Tl, AbstractC25227BEk.A0I(c1130158n, 5.0f), AbstractC25226BEj.A0h(c5Tl), str2, AbstractC25225BEi.A03(i3), AbstractC25226BEj.A08(c5Tl));
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(-171419974);
            if (i > 0) {
                InterfaceC1127857k A022 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 48);
                int A005 = C5X2.A00(c5Tl);
                C59P A043 = C117505Tk.A04(A0K);
                Modifier A014 = C5X3.A01(c5Tl, c1130158n);
                AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
                C5XJ.A00(c5Tl, A022, interfaceC16620sF);
                if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A005);
                }
                C5XJ.A00(c5Tl, A014, A1K);
                C2DC A006 = C5Y7.A00(c5Tl, R.drawable.blue_dot_medium, 0);
                Modifier A0C = AbstractC118185Wd.A0C(c1130158n, 8.0f);
                if (z) {
                    j = AbstractC25227BEk.A0g(c5Tl, -1961706612).A0P;
                } else {
                    j = AbstractC25227BEk.A0g(c5Tl, -1961704921).A0b;
                }
                C117505Tk.A0L(A0K, false);
                C5YS.A04(c5Tl, A0C, A006, j);
                String valueOf = String.valueOf(i);
                long A08 = AbstractC25226BEj.A08(c5Tl);
                C5WR.A0Y(c5Tl, AbstractC118175Wb.A0E(c1130158n, 5.0f, 0.0f, 5.0f, 0.0f), AbstractC25226BEj.A0c(c5Tl), valueOf, A08);
                c5Tl.ASW();
            }
            if (AbstractC25233BEq.A1S(c5Tl, A0K)) {
                C0fH.A00(1160664336);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVG(imageUrl, interfaceC16660sJ, str, str2, i, i2, 1, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x015b, code lost:
    
        if (r66.isEmpty() != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.graphics.drawable.Drawable r51, X.C5Tl r52, androidx.compose.ui.Modifier r53, X.InterfaceC30798DgZ r54, X.C26009Bex r55, X.C25246BFf r56, X.InterfaceC16820sZ r57, X.InterfaceC16820sZ r58, X.InterfaceC16660sJ r59, X.InterfaceC16660sJ r60, X.InterfaceC16660sJ r61, X.InterfaceC16620sF r62, X.InterfaceC16620sF r63, X.InterfaceC16620sF r64, X.InterfaceC16620sF r65, X.C5Hc r66, X.C5Hc r67, float r68, int r69, int r70, int r71, boolean r72, boolean r73, boolean r74) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28382Cfl.A00(android.graphics.drawable.Drawable, X.5Tl, androidx.compose.ui.Modifier, X.DgZ, X.Bex, X.BFf, X.0sZ, X.0sZ, X.0sJ, X.0sJ, X.0sJ, X.0sF, X.0sF, X.0sF, X.0sF, X.5Hc, X.5Hc, float, int, int, int, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.graphics.drawable.Drawable r51, X.C5Tl r52, androidx.compose.ui.Modifier r53, X.InterfaceC30798DgZ r54, X.C26009Bex r55, X.InterfaceC16820sZ r56, X.InterfaceC16820sZ r57, X.InterfaceC16660sJ r58, X.InterfaceC16660sJ r59, X.InterfaceC16660sJ r60, X.InterfaceC16620sF r61, X.InterfaceC16620sF r62, X.InterfaceC16620sF r63, X.InterfaceC16620sF r64, X.C5Hc r65, X.C5Hc r66, int r67, int r68, int r69, boolean r70, boolean r71, boolean r72) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28382Cfl.A01(android.graphics.drawable.Drawable, X.5Tl, androidx.compose.ui.Modifier, X.DgZ, X.Bex, X.0sZ, X.0sZ, X.0sJ, X.0sJ, X.0sJ, X.0sF, X.0sF, X.0sF, X.0sF, X.5Hc, X.5Hc, int, int, int, boolean, boolean, boolean):void");
    }
}
