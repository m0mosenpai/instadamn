package X;

import android.content.res.Resources;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CEH {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, C5Hc c5Hc, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Modifier modifier2 = modifier;
        int A07 = AbstractC25230BEn.A07(2, c5Hc, interfaceC16820sZ);
        c5Tl.Enr(1060365947);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = AbstractC25232BEp.A08(c5Tl, i) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= AbstractC25232BEp.A09(c5Tl, i2);
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= AbstractC25232BEp.A0T(c5Tl, c5Hc);
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        int i7 = i4 & 16;
        if (i7 != 0) {
            i5 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i3 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i5 |= AbstractC25232BEp.A0V(c5Tl, modifier2);
        }
        if ((i5 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(2004928754, "com.instagram.barcelona.feed.post.ui.PostFediverseRepliesRow (PostFediverseRepliesRow.kt:38)");
            }
            Modifier A0D = AbstractC118175Wb.A0D(modifier2, 12.0f, 13.0f, 13.0f);
            boolean A1R = AbstractC25233BEq.A1R(c5Tl, -485787760, i5);
            Object EEc = c5Tl.EEc();
            if (A1R || EEc == C5UI.A00) {
                EEc = AbstractC25235BEs.A12(c5Tl, interfaceC16820sZ, 47);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Modifier A0I = AbstractC25235BEs.A0I(c5Tl, c117505Tk, A0D, (InterfaceC16820sZ) EEc);
            InterfaceC1127857k A00 = AbstractC118375Wz.A00(AbstractC118255Wn.A00(), c5Tl, C118195Wf.A04);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0I);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0C = AbstractC118185Wd.A0C(c1130158n, 36.0f);
            if (c5Hc.size() >= A07) {
                c5Tl.Eno(1248403341);
                AbstractC136726Hb.A00(c5Tl, A0C, c5Hc, ((i5 >> 6) & 14) | 48, 0);
            } else {
                c5Tl.Eno(1248517173);
                C2DC A003 = C5Y7.A00(c5Tl, R.drawable.barcelona_fediverse_outline_44, 0);
                long A0F = AbstractC25226BEj.A0F(c5Tl);
                C5WI c5wi = C5WF.A00;
                C5YS.A06(c5Tl, AbstractC118175Wb.A08(C6L7.A03(C6L2.A01(A0C, c5wi), c5wi, 0.5f, AbstractC25226BEj.A0E(c5Tl)), 4.0f), A003, A0F);
            }
            C117505Tk.A0L(c117505Tk, false);
            Modifier A004 = c6l0.A00(c1130158n);
            InterfaceC1127857k A0a = AbstractC25230BEn.A0a(AbstractC118255Wn.A02, c5Tl);
            int A005 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A004);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A005);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            Resources A0B = AbstractC25235BEs.A0B(c5Tl);
            C14360o3.A0A(A0B);
            C14360o3.A0B(A0B, 0);
            C5WR.A0u(c5Tl, AbstractC25226BEj.A0h(c5Tl), AbstractC25231BEo.A0r(A0B, C84963qk.A04(A0B, Integer.valueOf(i), 1000000000, true, false), R.plurals.barcelona_replies_from_fediverse_users, i), AbstractC25226BEj.A0G(c5Tl));
            AbstractC25236BEt.A0l(c5Tl, AbstractC25231BEo.A0r(A0B, C84963qk.A04(A0B, Integer.valueOf(i2), 1000000000, true, false), R.plurals.barcelona_replies_from_fediverse_platforms, i2));
            c5Tl.ASW();
            if (AbstractC25226BEj.A18(c5Tl) == AnonymousClass583.Rtl) {
                c5Tl.Eno(1249918094);
                i6 = R.drawable.instagram_chevron_left_pano_outline_24;
            } else {
                c5Tl.Eno(1250021293);
                i6 = R.drawable.instagram_chevron_right_pano_outline_24;
            }
            C2DC A006 = C5Y7.A00(c5Tl, i6, 0);
            C117505Tk.A0L(c117505Tk, false);
            AbstractC25230BEn.A18(c5Tl, AbstractC118185Wd.A0C(c1130158n, 12.0f), A006);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(2078180898);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV1(c5Hc, interfaceC16820sZ, modifier2, i, i2, i3, i4, 0);
        }
    }
}
