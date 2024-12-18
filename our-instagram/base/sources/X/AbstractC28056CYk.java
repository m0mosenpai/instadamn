package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CYk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28056CYk {
    public static final void A01(C5Tl c5Tl, Modifier modifier, C2DC c2dc, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, c2dc, interfaceC16820sZ);
        c5Tl.Enr(951498);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, c2dc) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
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
                C0fH.A01(-1196880483, "com.instagram.feed.adapter.row.ufi.compose.ComposeContentNotesNux (ComposeContentNotesNux.kt:37)");
            }
            Modifier A0E = AbstractC118175Wb.A0E(modifier2, 4.0f, 0.0f, 0.0f, 0.0f);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131956717);
            C1130158n c1130158n = Modifier.A00;
            Modifier A003 = CBA.A00(AbstractC118185Wd.A08(AbstractC118185Wd.A0D(AbstractC118175Wb.A0E(c1130158n, 4.0f, 2.0f, 0.0f, 0.0f), 28.0f), 32.0f), 10.0f);
            C5XL.A02(c5Tl);
            C5WI c5wi = C5WE.A01;
            Modifier A012 = C6L2.A01(A003, c5wi);
            long A0E2 = AbstractC25226BEj.A0E(c5Tl);
            C5XL.A02(c5Tl);
            Modifier A03 = C6L7.A03(A012, c5wi, 0.5f, A0E2);
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, 486083503, i3);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new DGY(interfaceC16820sZ, 30);
                c5Tl.FBy(EEc);
            }
            C6LQ.A0B(c5Tl, C5XR.A05(A03, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), A1R), c2dc, C5YJ.A00, A002, (i3 & 14) | DalvikInternals.IOPRIO_BACKGROUND);
            A00(c5Tl, CBA.A00(c1130158n, -6.0f), 0);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1188310374);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 30, modifier2, c2dc, interfaceC16820sZ);
        }
    }

    public static final void A00(C5Tl c5Tl, Modifier modifier, int i) {
        int i2;
        c5Tl.Enr(-427697010);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1395054750, "com.instagram.feed.adapter.row.ufi.compose.PlusBubble (ComposeContentNotesNux.kt:66)");
            }
            long A06 = AbstractC25226BEj.A06(c5Tl);
            boolean A1X = AbstractC167007dF.A1X(AbstractC25226BEj.A18(c5Tl), AnonymousClass583.Rtl);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C2DC A002 = C5Y7.A00(c5Tl, R.drawable.instagram_add_pano_outline_24, 0);
            C1130158n c1130158n = Modifier.A00;
            Modifier A03 = AbstractC118185Wd.A03(c1130158n);
            C5XL.A02(c5Tl);
            C5WI c5wi = C5WE.A02;
            long j = AbstractC1132259k.A00;
            Modifier A012 = AbstractC28015CWn.A01(A03, c5wi, 4.0f, j, j, false);
            C5XL.A02(c5Tl);
            C5YS.A01(c5Tl, AbstractC118175Wb.A08(C6L3.A01(A012, c5wi, A06), 4.0f), A002, 0, 26, 0L);
            Modifier A0H = AbstractC118185Wd.A0H(c1130158n, 24.0f, Float.NaN);
            boolean A1W = AbstractC25226BEj.A1W(c5Tl, A06, AbstractC25227BEk.A1W(c5Tl, 428322067, A1X));
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = new DHC(A06, A1X);
                c5Tl.FBy(EEc);
            }
            AbstractC119665bP.A00(c5Tl, A0H, AbstractC25225BEi.A1B(c117505Tk, EEc, false), 6);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1419142892);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, modifier, i, 15);
        }
    }
}
