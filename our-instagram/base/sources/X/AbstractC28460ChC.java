package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.ChC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28460ChC {
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        if (r2.A01 == null) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C5Tl r21, androidx.compose.ui.Modifier r22, X.InterfaceC30797DgY r23, X.InterfaceC16620sF r24, float r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28460ChC.A03(X.5Tl, androidx.compose.ui.Modifier, X.DgY, X.0sF, float, int, int):void");
    }

    public static final void A05(C5Tl c5Tl, Modifier modifier, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i, int i2) {
        int i3;
        C5UU ASZ;
        int i4;
        Modifier modifier2 = modifier;
        AbstractC167017dG.A1P(c5Hc, interfaceC16620sF);
        c5Tl.Enr(1019294623);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, c5Hc);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1733001327, "com.instagram.archive.updateshub.ArchiveCalendarStrip (ArchiveCalendarStrip.kt:66)");
            }
            if (c5Hc.isEmpty()) {
                if (C0fH.A02()) {
                    C0fH.A00(1477355965);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i4 = 7;
                ASZ.A06 = new C30490DbZ(i, i2, i4, c5Hc, interfaceC16620sF, modifier2);
            }
            boolean z = false;
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            float A02 = (((AbstractC25231BEo.A02(c5Tl) - 10.0f) - (2.0f * 8.0f)) / 7.0f) - 8.0f;
            C0eB c0eB = C0eB.A00;
            boolean A1Y = AbstractC25232BEp.A1Y(c5Tl, A00, c5Hc, -1100432549);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = new MCH(c5Hc, A00, (InterfaceC23621Ds) null, 42);
                c5Tl.FBy(EEc);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            C5UX.A04(c5Tl, c0eB, (InterfaceC16620sF) EEc);
            C6ID A01 = AbstractC118255Wn.A01(8.0f);
            C1333560c c1333560c = new C1333560c(8.0f, 0.0f, 8.0f, 0.0f);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c5Hc, -1100423990) | c5Tl.AH1(A02);
            if ((i3 & 896) == 256) {
                z = true;
            }
            boolean z2 = z | A1Z;
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == C5UI.A00) {
                EEc2 = new DHY(c5Hc, interfaceC16620sF, A02, 4);
                c5Tl.FBy(EEc2);
            }
            C6IS.A00(null, A01, c1333560c, A00, c5Tl, null, modifier2, AbstractC25225BEi.A1B(c117505Tk, EEc2, false), (i3 & 14) | 24960, 232, false, false);
            if (C0fH.A02()) {
                C0fH.A00(-631707721);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i4 = 8;
            ASZ.A06 = new C30490DbZ(i, i2, i4, c5Hc, interfaceC16620sF, modifier2);
        }
    }

    public static final void A00(C5Tl c5Tl, Modifier modifier, int i) {
        int i2;
        c5Tl.Enr(694886831);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1068289393, "com.instagram.archive.updateshub.ArchivePog (ArchiveCalendarStrip.kt:157)");
            }
            Modifier A03 = C6L7.A03(modifier, C5WF.A00, 1.0f, AbstractC25226BEj.A0G(c5Tl));
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A03);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5YS.A07(c5Tl, AbstractC25225BEi.A0P(C119645bN.A00, AbstractC118185Wd.A03(Modifier.A00)), C5Y7.A00(c5Tl, R.drawable.instagram_history_pano_outline_24, 0), C5YJ.A05, AbstractC136736Hc.A00(c5Tl, 2131953165), DalvikInternals.IOPRIO_BACKGROUND, 0, AbstractC25226BEj.A0F(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-814487420);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, modifier, i, 17);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, C26692BqZ c26692BqZ, int i) {
        int i2;
        Modifier modifier2;
        BZO A01;
        BZP A06;
        long j;
        c5Tl.Enr(-1901834690);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, c26692BqZ, i) ? 1 : 0);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1995555150, "com.instagram.archive.updateshub.ContentCalendarPog (ArchiveCalendarStrip.kt:180)");
            }
            C51665Mrw c51665Mrw = c26692BqZ.A01;
            boolean A1W = AbstractC167007dF.A1W(c51665Mrw);
            c5Tl.Eno(613447194);
            if (!A1W) {
                if (c26692BqZ.A05 && c51665Mrw == null) {
                    j = AbstractC25227BEk.A0g(c5Tl, 1325055081).A0n;
                } else {
                    j = AbstractC25227BEk.A0g(c5Tl, 1325056740).A0z;
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                modifier2 = modifier.Eq3(C6L7.A03(modifier, C5WF.A00, 1.0f, j));
            } else {
                modifier2 = modifier;
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, modifier2);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C119645bN c119645bN = C119645bN.A00;
            A01 = AbstractC28503Chw.A01(AbstractC25225BEi.A0I(null, 1.0f, 400.0f), 0.0f);
            A06 = AbstractC28503Chw.A06(AbstractC25225BEi.A0I(null, 1.0f, 400.0f), 0.0f);
            AbstractC28495Cho.A07(A01, A06, c5Tl, null, null, C5UA.A01(c5Tl, C30712DfA.A00(c26692BqZ, 25), -1321330788), 200064, 18, A1W);
            if (c26692BqZ.A05 && c51665Mrw == null) {
                C5YS.A07(c5Tl, AbstractC25225BEi.A0P(c119645bN, AbstractC118185Wd.A03(AbstractC25225BEi.A0N(c5Tl, -1872504539))), C5Y7.A00(c5Tl, R.drawable.instagram_add_pano_filled_24, 0), C5YJ.A05, AbstractC136736Hc.A00(c5Tl, 2131952388), DalvikInternals.IOPRIO_BACKGROUND, 0, AbstractC25226BEj.A0F(c5Tl));
            } else {
                AbstractC28284CdW.A02(c5Tl, null, AbstractC25225BEi.A0P(c119645bN, AbstractC25225BEi.A0N(c5Tl, -1872105972)), Boolean.valueOf(c26692BqZ.A04), "Loading indicator", null, null, C5UA.A01(c5Tl, new C30717DfF(c26692BqZ, A1W), 443246123), 1597440, 44);
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(1985587865);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, modifier, c26692BqZ, i, 20);
        }
    }

    public static final void A02(C5Tl c5Tl, Modifier modifier, C26691BqY c26691BqY, int i) {
        int i2;
        c5Tl.Enr(1518811497);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, c26691BqY, i) ? 1 : 0);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1105857004, "com.instagram.archive.updateshub.FutureDayPog (ArchiveCalendarStrip.kt:238)");
            }
            InterfaceC1127857k A0Z = AbstractC25230BEn.A0Z();
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A0R(c5Tl, AbstractC25225BEi.A0P(C119645bN.A00, Modifier.A00), AbstractC25226BEj.A0h(c5Tl), String.valueOf(c26691BqY.A00), AbstractC25226BEj.A0K(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1411341466);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, modifier, c26691BqY, i, 21);
        }
    }

    public static final void A04(C5Tl c5Tl, Modifier modifier, ImageUrl imageUrl, int i, int i2) {
        int i3;
        c5Tl.Enr(-1731298309);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, imageUrl);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1439050397, "com.instagram.archive.updateshub.CoverImageOverlay (ArchiveCalendarStrip.kt:250)");
            }
            if (imageUrl != null) {
                C6LQ.A08(c5Tl, AbstractC119675bQ.A01(AbstractC25226BEj.A0W(modifier), DLG.A00), AbstractC25226BEj.A0w(c5Tl, imageUrl, i3 >> 3), C5YJ.A00);
            }
            if (C0fH.A02()) {
                C0fH.A00(172222333);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(imageUrl, modifier, i2, i, 10);
        }
    }
}
