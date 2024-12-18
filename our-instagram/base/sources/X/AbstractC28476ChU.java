package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.compose.core.ui.IgClickableTextKt;
import java.util.Iterator;

/* renamed from: X.ChU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28476ChU {
    public static final Modifier A00(C5Tl c5Tl, Modifier modifier) {
        C14360o3.A0B(modifier, 0);
        if (AbstractC25227BEk.A1U(c5Tl, 900965567)) {
            C0fH.A01(356255638, "com.instagram.creator.agent.settings.fragment.clippedShimmer (CreatorAISettingsComposableFragment.kt:532)");
        }
        C5XL.A02(c5Tl);
        Modifier A00 = AbstractC28487Chf.A00(c5Tl, C6L2.A01(modifier, C5WE.A02));
        if (C0fH.A02()) {
            C0fH.A00(-1187453054);
        }
        AbstractC25225BEi.A1V(c5Tl, false);
        return A00;
    }

    public static final void A05(C5Tl c5Tl, C6R c6r, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z, boolean z2) {
        int i2;
        C14360o3.A0B(c6r, 2);
        int A08 = AbstractC25230BEn.A08(3, interfaceC16820sZ, interfaceC16660sJ);
        c5Tl.Enr(-1717686422);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, c6r);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1724206222, "com.instagram.creator.agent.settings.fragment.AutoReplyToggle (CreatorAISettingsComposableFragment.kt:499)");
            }
            int ordinal = c6r.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal == 1) {
                        c5Tl.Eno(-1336533439);
                        AbstractC25705BXp.A08(c5Tl, null, C5Y7.A00(c5Tl, R.drawable.instagram_rocket_pano_outline_24, 0), new C29199Cu4(interfaceC16660sJ, z2, false), C5YD.A00(c5Tl, 2131957080), C5YD.A00(c5Tl, 2131957079), (i2 << 6) & 896, 130762, z);
                    } else {
                        throw AbstractC25233BEq.A0r(c5Tl, -1151501377);
                    }
                } else {
                    c5Tl.Eno(-1151498415);
                    CGS.A00(c5Tl, AbstractC118175Wb.A0E(AbstractC25228BEl.A0W(), 0.0f, 64.0f, 0.0f, 36.0f), interfaceC16820sZ, ((i2 >> 9) & 14) | 48, A08, 0L);
                }
            } else {
                c5Tl.Eno(-1151500569);
                A01(c5Tl, 0);
            }
            if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                C0fH.A00(1397053);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUJ(interfaceC16820sZ, c6r, interfaceC16660sJ, i, 0, z, z2);
        }
    }

    public static final void A03(C5Tl c5Tl, ImageUrl imageUrl, String str, int i) {
        int i2;
        AbstractC167007dF.A1K(str, imageUrl);
        c5Tl.Enr(-1978471065);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, imageUrl);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(119681419, "com.instagram.creator.agent.settings.fragment.Header (CreatorAISettingsComposableFragment.kt:472)");
            }
            float A02 = C5XT.A02(c5Tl, R.dimen.appreciation_reels_grid_item_width);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC1127857k A022 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A00, 48);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A022, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6LQ.A03(c5Tl, AbstractC25231BEo.A0R(c1130158n, A02), AbstractC25226BEj.A0w(c5Tl, imageUrl, i2 >> 3));
            String A17 = AbstractC25228BEl.A17(c5Tl, str, 2131957095);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            C5WR.A03(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 12.0f, 0.0f, 24.0f), AbstractC25226BEj.A0d(c5Tl), null, null, null, A17, null, 0, 0, 0, 0, 3120, 48, 14320, A0G, AbstractC118155Vz.A01(20), AbstractC118155Vz.A01(25), false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1603387338);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30503Dbm.A01(ASZ, imageUrl, str, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C5Tl r27, X.C26067Bfv r28, X.InterfaceC16820sZ r29, X.InterfaceC16820sZ r30, X.InterfaceC16660sJ r31, X.InterfaceC16660sJ r32, X.InterfaceC16660sJ r33, X.InterfaceC16660sJ r34, X.InterfaceC16620sF r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28476ChU.A06(X.5Tl, X.Bfv, X.0sZ, X.0sZ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sF, int, int):void");
    }

    public static final void A01(C5Tl c5Tl, int i) {
        c5Tl.Enr(1570635047);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1512419380, "com.instagram.creator.agent.settings.fragment.AutoReplyToggleLoadingShimmer (CreatorAISettingsComposableFragment.kt:519)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0D = AbstractC118175Wb.A0D(AbstractC25226BEj.A0T(c1130158n), 16.0f, 12.0f, 12.0f);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A05, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0D);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            Modifier A002 = A00(c5Tl, AbstractC118185Wd.A04(AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 12.0f, 0.0f)));
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C5XX.A02(c5Tl, c6l0.AB7(interfaceC118225Wj, A002), 0);
            Modifier A003 = c6l0.A00(c1130158n);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A003);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C5XX.A02(c5Tl, A00(c5Tl, AbstractC118185Wd.A07(AbstractC118185Wd.A08(c1130158n, 18.0f), 0.3f)), 0);
            C5XX.A02(c5Tl, A00(c5Tl, AbstractC118185Wd.A07(AbstractC118185Wd.A08(AbstractC118175Wb.A07(c1130158n), 14.0f), 0.9f)), 0);
            C5XX.A02(c5Tl, A00(c5Tl, AbstractC118185Wd.A07(AbstractC118185Wd.A08(AbstractC118175Wb.A0E(c1130158n, 0.0f, 6.0f, 0.0f, 0.0f), 14.0f), 0.7f)), 0);
            c5Tl.ASW();
            C5XX.A02(c5Tl, c6l0.AB7(interfaceC118225Wj, A00(c5Tl, AbstractC118185Wd.A0G(c1130158n, 48.0f, 32.0f))), 0);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1561602348);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 42);
        }
    }

    public static final void A02(C5Tl c5Tl, C51743MtS c51743MtS, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        C5UU ASZ;
        int i3;
        c5Tl.Enr(-982832537);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c51743MtS) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(90545951, "com.instagram.creator.agent.settings.fragment.ViolatingBanner (CreatorAISettingsComposableFragment.kt:425)");
            }
            if (c51743MtS == null) {
                if (C0fH.A02()) {
                    C0fH.A00(1458435984);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 47;
                C30507Dbq.A01(ASZ, interfaceC16660sJ, c51743MtS, i, i3);
            }
            c5Tl.Eno(269488586);
            C6C7 A0g = AbstractC25228BEl.A0g();
            A0g.A09(c51743MtS.A05);
            c5Tl.Eno(269490287);
            Iterator A1J = AbstractC25226BEj.A1J(c51743MtS.A00);
            while (A1J.hasNext()) {
                C25988Bec c25988Bec = (C25988Bec) A1J.next();
                int i4 = c25988Bec.A01;
                int i5 = i4 + c25988Bec.A00;
                A0g.A06(new C5W3(null, null, null, C5W5.A03, null, 65530, AbstractC25226BEj.A0C(c5Tl), 0L, 0L), i4, i5);
                A0g.A0A(c25988Bec.A02, c25988Bec.A03, i4, i5);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C5C8 A02 = A0g.A02();
            C1130158n A0O = AbstractC25225BEi.A0O(A0K);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A0O);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0Y, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            AbstractC28389Cfs.A00(c5Tl);
            Modifier A08 = AbstractC118175Wb.A08(A0O.Eq3(AbstractC118185Wd.A00), 16.0f);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0d, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C5YS.A07(c5Tl, C6L7.A03(AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(A0O, 0.0f, 12.0f, 16.0f, 12.0f), 44.0f), C5WF.A00, 0.5f, AbstractC25226BEj.A0E(c5Tl)), C5Y7.A00(c5Tl, R.drawable.instagram_warning_pano_outline_24, 0), C5YJ.A06, null, 24624, 0, AbstractC25226BEj.A0F(c5Tl));
            boolean A1X = AbstractC25232BEp.A1X(c5Tl, c51743MtS, A02, -499927003) | AbstractC25231BEo.A1L(i2);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = C30172DRc.A00(c5Tl, A02, c51743MtS, interfaceC16660sJ, 37);
            }
            IgClickableTextKt.A05(c5Tl, null, A02, null, AbstractC25225BEi.A1B(A0K, EEc, false), 114686, 0L);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(1165425014);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 48;
            C30507Dbq.A01(ASZ, interfaceC16660sJ, c51743MtS, i, i3);
        }
    }

    public static final void A04(C5Tl c5Tl, BP5 bp5, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        c5Tl.Enr(1313216877);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, bp5) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-832766687, "com.instagram.creator.agent.settings.fragment.ConfirmDeletionDialog (CreatorAISettingsComposableFragment.kt:539)");
            }
            C0eB c0eB = C0eB.A00;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, bp5, 1806783140);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = AbstractC25235BEs.A0u(c5Tl, bp5, 20);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            boolean A1T = AbstractC25229BEm.A1T(c5Tl, c117505Tk, c0eB, (InterfaceC16620sF) EEc);
            c5Tl.Eno(1806786085);
            int i3 = i2 & 112;
            boolean z = true;
            boolean A1P = AbstractC167007dF.A1P(i3, 32);
            Object EEc2 = c5Tl.EEc();
            if (A1P || EEc2 == C5UI.A00) {
                EEc2 = C29908DGw.A01(c5Tl, interfaceC16820sZ, 39);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, EEc2, A1T);
            String A00 = C5YD.A00(c5Tl, 2131957074);
            String A002 = C5YD.A00(c5Tl, 2131957073);
            Integer num = C05F.A0C;
            boolean A1P2 = AbstractC167007dF.A1P(i2 & 896, 256) | AbstractC25227BEk.A1Z(c5Tl, bp5, 1806797797);
            Object EEc3 = c5Tl.EEc();
            if (A1P2 || EEc3 == C5UI.A00) {
                EEc3 = C29894DGi.A00(c5Tl, interfaceC16820sZ2, bp5, 45);
            }
            C26079Bg8 A003 = CGH.A00(c5Tl, num, AbstractC25225BEi.A1A(c117505Tk, EEc3, A1T), 2131957640, 12);
            Integer num2 = C05F.A00;
            boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, bp5, 1806806790);
            if (i3 != 32) {
                z = false;
            }
            boolean z2 = A1Z2 | z;
            Object EEc4 = c5Tl.EEc();
            if (z2 || EEc4 == C5UI.A00) {
                EEc4 = C29894DGi.A00(c5Tl, interfaceC16820sZ, bp5, 46);
            }
            AbstractC28433Cgh.A02(c5Tl, A003, CGH.A00(c5Tl, num2, AbstractC25225BEi.A1A(c117505Tk, EEc4, A1T), 2131954754, 12), A00, A002, A1A);
            if (C0fH.A02()) {
                C0fH.A00(1611205538);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(interfaceC16820sZ, bp5, interfaceC16820sZ2, i, 32);
        }
    }
}
