package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CgR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28420CgR {
    public static final InterfaceC16660sJ A00 = DNV.A00;
    public static final InterfaceC16660sJ A01 = DNW.A00;
    public static final InterfaceC16660sJ A02 = DNX.A00;
    public static final InterfaceC16660sJ A03 = DNY.A00;

    public static final void A01(C5Tl c5Tl, Modifier modifier, C51758Mth c51758Mth, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(452163729);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c51758Mth) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-958639634, "com.instagram.creator.agent.settings.audience.AccountCell (SelectAccountsFragment.kt:229)");
            }
            C45126Jxv c45126Jxv = (C45126Jxv) c51758Mth.A00;
            C2DB A002 = AbstractC43541zP.A00(c5Tl, (ImageUrl) c45126Jxv.A00);
            String str = c45126Jxv.A01;
            String str2 = c45126Jxv.A03;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, c45126Jxv, AbstractC25233BEq.A1P(c5Tl, 1601241392, i3));
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = C29894DGi.A00(c5Tl, interfaceC16660sJ, c45126Jxv, 32);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            BI4.A01(c5Tl, modifier2, A002, null, str, str2, null, (InterfaceC16820sZ) EEc, null, C5UA.A01(c5Tl, new C30536DcJ(12, interfaceC16660sJ, c51758Mth, c45126Jxv), 125724242), i3 & 896, 196608, 24552, false, false, false, false);
            if (C0fH.A02()) {
                C0fH.A00(-2004331427);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 29, modifier2, c51758Mth, interfaceC16660sJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C5Tl r23, X.C26082BgB r24, X.BP5 r25, X.InterfaceC16820sZ r26, X.InterfaceC16820sZ r27, X.InterfaceC16660sJ r28, X.InterfaceC16660sJ r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28420CgR.A02(X.5Tl, X.BgB, X.BP5, X.0sZ, X.0sZ, X.0sJ, X.0sJ, int, int):void");
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(-1593723520);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-560310966, "com.instagram.creator.agent.settings.audience.LoadingShimmer (SelectAccountsFragment.kt:247)");
            }
            C5XL.A02(c5Tl);
            C5WI c5wi = C5WE.A02;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0A = AbstractC118175Wb.A0A(c1130158n, 12.0f, 8.0f);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0A);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0d, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            C5XX.A02(c5Tl, AbstractC118175Wb.A08(AbstractC28487Chf.A00(c5Tl, AbstractC25231BEo.A0R(c1130158n, 56.0f)), 4.0f), 0);
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 8.0f, 0.0f, 0.0f, 0.0f);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            AbstractC28487Chf.A07(c5Tl, AbstractC118185Wd.A07(AbstractC118185Wd.A08(AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 4.0f), 18.0f), 0.5f), c5wi);
            AbstractC28487Chf.A07(c5Tl, AbstractC118185Wd.A07(AbstractC118185Wd.A08(c1130158n, 14.0f), 0.3f), c5wi);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(908219290);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 39);
        }
    }
}
