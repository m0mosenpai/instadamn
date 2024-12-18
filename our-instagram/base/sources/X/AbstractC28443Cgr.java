package X;

import android.app.Activity;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cgr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28443Cgr {
    public static final void A02(C5Tl c5Tl, Modifier modifier, InterfaceC11380iw interfaceC11380iw, C50922Mer c50922Mer, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, int i2, boolean z) {
        int i3;
        int i4;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC16820sZ, interfaceC16820sZ2);
        AbstractC167007dF.A1E(interfaceC16820sZ3, 2, interfaceC16820sZ4);
        AbstractC25234BEr.A0k(4, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16820sZ5, c50922Mer);
        AbstractC167007dF.A1J(interfaceC11380iw, 8, modifier);
        c5Tl.Enr(-471704342);
        if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ4);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((196608 & i) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16660sJ2);
        }
        if ((i & 1572864) == 0) {
            i3 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ5);
        }
        if ((12582912 & i) == 0) {
            i3 |= AbstractC25232BEp.A0O(c5Tl, c50922Mer);
        }
        if ((100663296 & i) == 0) {
            i3 |= AbstractC25232BEp.A0P(c5Tl, interfaceC11380iw);
        }
        if ((805306368 & i) == 0) {
            i3 |= AbstractC25232BEp.A0a(c5Tl, modifier);
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | AbstractC25232BEp.A0b(c5Tl, z);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1130416523, "com.instagram.opal.impl.ui.OpalEditContent (OpalEditContent.kt:82)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c50922Mer.A05, 0);
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, AbstractC25227BEk.A0q(c5Tl, -12211072), C5UI.A00, false);
            AbstractC25225BEi.A1V(c5Tl, false);
            UserSession A0e = AbstractC25229BEm.A0e(c5Tl);
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            C14360o3.A0C(A19, AbstractC43591JPw.A00(4));
            C6L8.A01(null, c5Tl, modifier, null, C5UA.A01(c5Tl, new DXO((Activity) A19, interfaceC74953Yl, A02, interfaceC11380iw, A0e, interfaceC16820sZ4, interfaceC16820sZ, interfaceC16820sZ3, interfaceC16820sZ5, interfaceC16820sZ2, interfaceC16660sJ, interfaceC16660sJ2, z), -2008309268), 0.0f, ((i3 >> 27) & 14) | 1572864, 62, 0L, 0L);
            if (C0fH.A02()) {
                C0fH.A00(-1878482277);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30340DXp(modifier, interfaceC16820sZ5, c50922Mer, interfaceC16660sJ, interfaceC16820sZ4, interfaceC16820sZ2, interfaceC16660sJ2, interfaceC16820sZ3, interfaceC16820sZ, interfaceC11380iw, i, i2, A1R ? 1 : 0, z);
        }
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        AbstractC34277F9x.A00(interfaceC11380iw, userSession, "tap", str, "edit_opal", userSession.userId, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r18, androidx.compose.ui.Alignment r19, androidx.compose.ui.Modifier r20, X.C118125Vw r21, java.lang.String r22, X.InterfaceC16620sF r23, int r24, int r25, long r26, boolean r28) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28443Cgr.A00(X.5Tl, androidx.compose.ui.Alignment, androidx.compose.ui.Modifier, X.5Vw, java.lang.String, X.0sF, int, int, long, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r53, androidx.compose.ui.Modifier r54, X.InterfaceC11380iw r55, X.C68 r56, java.lang.String r57, X.InterfaceC16660sJ r58, int r59, int r60, boolean r61) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28443Cgr.A01(X.5Tl, androidx.compose.ui.Modifier, X.0iw, X.C68, java.lang.String, X.0sJ, int, int, boolean):void");
    }

    public static final void A03(Modifier modifier, C5Tl c5Tl, int i, int i2) {
        int i3;
        c5Tl.Enr(838631062);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-384023925, "com.instagram.opal.impl.ui.AudienceRow (OpalEditContent.kt:350)");
            }
            InterfaceC1127857k A0z = AbstractC25232BEp.A0z(AbstractC118255Wn.A01, c5Tl, C118195Wf.A05, (i3 >> 3) & 14);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131969012);
            C1130158n c1130158n = Modifier.A00;
            Modifier A003 = c6l0.A00(c1130158n);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C5WR.A0R(c5Tl, c6l0.AB7(interfaceC118225Wj, A003), AbstractC25226BEj.A0g(c5Tl), A002, AbstractC25226BEj.A0G(c5Tl));
            c5Tl.Eno(623228798);
            if (i > 0) {
                C5WR.A0e(c5Tl, c6l0.AB7(interfaceC118225Wj, AbstractC25227BEk.A0K(c1130158n, 8.0f)), String.valueOf(i), AbstractC25226BEj.A0M(c5Tl));
            }
            C117505Tk.A0L(c117505Tk, false);
            C5YS.A06(c5Tl, c6l0.AB7(interfaceC118225Wj, AbstractC118185Wd.A03(AbstractC25227BEk.A0K(c1130158n, 8.0f))), C5Y7.A00(c5Tl, R.drawable.instagram_chevron_right_pano_outline_24, 0), AbstractC25226BEj.A0L(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(716155206);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, modifier, i, i2, 17);
        }
    }
}
