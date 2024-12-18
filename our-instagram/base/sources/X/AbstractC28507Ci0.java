package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import com.instagram.opal.impl.data.OpalProfileData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ci0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28507Ci0 {
    public static final C5Hb A00 = AbstractC133095zb.A04(C67.A03, C67.A02);

    public static final void A0A(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        AbstractC34277F9x.A00(interfaceC11380iw, userSession, str, str2, "opal_self_profile", userSession.userId, null);
    }

    public static final void A0B(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, int i) {
        String str3;
        String str4;
        int ordinal = ((C67) A00.get(i)).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                str3 = "reel_tab";
            } else {
                throw B4Z.A00();
            }
        } else {
            str3 = "post_tab";
        }
        if (C2TN.A05(userSession, str)) {
            str4 = "opal_self_profile";
        } else {
            str4 = "opal_profile";
        }
        AbstractC34277F9x.A00(interfaceC11380iw, userSession, str2, str3, str4, str, null);
    }

    public static String A00(List list, int i) {
        return ((OpalAudienceSelectorRepository.OpalAudience) list.get(i)).A03;
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, int i) {
        int i2;
        C5UU ASZ;
        int i3;
        c5Tl.Enr(-179870339);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1599922755, "com.instagram.opal.impl.ui.OpalStoryHighlights (OpalContent.kt:878)");
            }
            c5Tl.AJX(AbstractC117935Vd.A00);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -587412235);
            if (A0q == C5UI.A00) {
                A0q = AbstractC25227BEk.A0j(c5Tl, false);
            }
            boolean A1a = AbstractC166987dD.A1a(A0q);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            if (!A1a) {
                if (C0fH.A02()) {
                    C0fH.A00(-177835875);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 29;
                C30497Dbg.A01(ASZ, modifier, i, i3);
            }
            Modifier A02 = C5X3.A02(modifier, C5XU.A00, new C30511Dbu(AbstractC28285CdX.A00(c5Tl), false));
            InterfaceC1127857k A0L = AbstractC25235BEs.A0L(AbstractC118255Wn.A05, c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A02);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A0L, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C6GM c6gm = C6GM.A00;
            Modifier A0C = AbstractC118185Wd.A0C(c1130158n, 56.0f);
            C6L4 c6l4 = new C6L4(AbstractC25226BEj.A0F(c5Tl));
            C5WI c5wi = C5WF.A00;
            Modifier A022 = C6L7.A02(A0C, c6l4, c5wi, 0.5f);
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A004 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A022);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            C5YS.A04(c5Tl, AbstractC118185Wd.A04(c1130158n), C5Y7.A00(c5Tl, R.drawable.instagram_add_pano_outline_24, 0), AbstractC25226BEj.A0F(c5Tl));
            c5Tl.ASW();
            String A005 = AbstractC136736Hc.A00(c5Tl, 2131956543);
            C5WR.A0R(c5Tl, AbstractC25235BEs.A0G(c6gm, AbstractC118175Wb.A08(c1130158n, 4.0f)), AbstractC25225BEi.A0Y(c5Tl), A005, AbstractC25226BEj.A0G(c5Tl));
            c5Tl.ASW();
            c5Tl.Eno(1401123144);
            int i4 = 1;
            do {
                C5XX.A02(c5Tl, C6L3.A01(AbstractC118185Wd.A0C(c1130158n, 56.0f), c5wi, AbstractC25226BEj.A06(c5Tl)), 0);
                i4++;
            } while (i4 < 5);
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(-1554860175);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 30;
            C30497Dbg.A01(ASZ, modifier, i, i3);
        }
    }

    public static final void A02(C5Tl c5Tl, Modifier modifier, C51745MtU c51745MtU, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF, int i, boolean z) {
        int i2;
        c5Tl.Enr(1451177669);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16620sF) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, str);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0V(c5Tl, imageUrl);
        }
        if ((i & 196608) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, c51745MtU);
        }
        if ((i & 1572864) == 0) {
            i2 |= AbstractC25232BEp.A0h(c5Tl, z);
        }
        if ((i & 12582912) == 0) {
            i2 |= AbstractC25232BEp.A0O(c5Tl, interfaceC11380iw);
        }
        if ((i & 100663296) == 0) {
            i2 |= AbstractC25232BEp.A0Z(c5Tl, modifier);
        }
        if ((i2 & 38347923) == 38347922 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-375854093, "com.instagram.opal.impl.ui.OpalProfilePic (OpalContent.kt:676)");
            }
            ParcelableSnapshotMutableState A0U = AbstractC25230BEn.A0U(true);
            UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
            InterfaceC1127857k A002 = C5XX.A00(C118195Wf.A0E, false);
            int A003 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A002, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            C30106DOo c30106DOo = C30106DOo.A00;
            C1130158n c1130158n = Modifier.A00;
            c5Tl.Eno(212297036);
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, A0u, AbstractC25225BEi.A1X(c5Tl, A0U, AbstractC25232BEp.A1b(c5Tl, interfaceC11380iw, c51745MtU, AbstractC25234BEr.A1W(i2))) | AbstractC25233BEq.A1H(i2), AbstractC25233BEq.A1K(i2)) | AbstractC25233BEq.A1L(i2) | AbstractC25233BEq.A1I(i2);
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == C5UI.A00) {
                EEc = new C57576Pgo(A0U, c51745MtU, interfaceC11380iw, A0u, imageUrl, str, interfaceC16820sZ, interfaceC16620sF, z);
                c5Tl.FBy(EEc);
            }
            AbstractC28450Cgz.A02(c5Tl, c1130158n, c30106DOo, AbstractC25225BEi.A1B(c117505Tk, EEc, false), 54, 0);
            c5Tl.Eno(212365138);
            if (z) {
                C2DC A004 = C5Y9.A00(C1QI.A0D(AbstractC25228BEl.A0K(c5Tl), false), c5Tl);
                String A005 = AbstractC136736Hc.A00(c5Tl, 2131969034);
                Modifier A006 = AbstractC28010CWi.A00(c119645bN.AB5(C118195Wf.A07, c1130158n), -7.0f, -7.0f);
                c5Tl.Eno(212377027);
                boolean A1b = AbstractC25232BEp.A1b(c5Tl, A0u, interfaceC11380iw, AbstractC25231BEo.A1M(i2));
                Object EEc2 = c5Tl.EEc();
                if (A1b || EEc2 == C5UI.A00) {
                    EEc2 = new C29900DGo(37, interfaceC11380iw, A0u, interfaceC16820sZ2);
                    c5Tl.FBy(EEc2);
                }
                C6LQ.A0C(c5Tl, CY3.A01(c5Tl, A006, AbstractC25225BEi.A1A(c117505Tk, EEc2, false)), A004, A005, 0);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(1291804353);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30322DWx(interfaceC16620sF, interfaceC16820sZ2, c51745MtU, interfaceC16820sZ, imageUrl, interfaceC11380iw, modifier, str, i, 0, z);
        }
    }

    public static final void A03(C5Tl c5Tl, Modifier modifier, C51745MtU c51745MtU, InterfaceC11380iw interfaceC11380iw, OpalProfileData opalProfileData, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i, boolean z) {
        int i2;
        String str;
        ImageUrl A0t;
        String str2;
        String str3;
        c5Tl.Enr(-2135243600);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16620sF) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, opalProfileData);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0g(c5Tl, z);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, c51745MtU);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0O(c5Tl, interfaceC11380iw);
        }
        if ((i & 100663296) == 0) {
            i2 |= AbstractC25232BEp.A0Z(c5Tl, modifier);
        }
        if ((38347923 & i2) == 38347922 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(176422394, "com.instagram.opal.impl.ui.OpalInfo (OpalContent.kt:629)");
            }
            InterfaceC1127857k A0z = AbstractC25232BEp.A0z(AbstractC118255Wn.A01, c5Tl, C118195Wf.A05, (i2 >> 24) & 14);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            InterfaceC16820sZ interfaceC16820sZ3 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0z, A04, interfaceC16620sF3);
            InterfaceC16620sF interfaceC16620sF4 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF4, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            if (opalProfileData != null) {
                str = opalProfileData.A05;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (opalProfileData != null) {
                A0t = opalProfileData.A01();
            } else {
                A0t = AbstractC25225BEi.A0t(null);
            }
            C1130158n c1130158n = Modifier.A00;
            int i3 = i2 >> 3;
            A02(c5Tl, c1130158n, c51745MtU, interfaceC11380iw, A0t, str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16620sF2, (i3 & 458752) | (i3 & 896) | ((i2 >> 6) & 14) | 100663296 | (i2 & 112) | (3670016 & (i2 << 3)) | (29360128 & i2), z);
            Modifier AB7 = c6l0.AB7(C118195Wf.A04, AbstractC118175Wb.A0B(c6l0.A00(c1130158n), 0.0f, 0.0f, 0.0f));
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, AB7);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF3);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF4, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            c5Tl.Eno(-122683432);
            int i4 = i2 & 14;
            boolean A1J = AbstractC25231BEo.A1J(i4);
            Object EEc = c5Tl.EEc();
            if (A1J || EEc == C5UI.A00) {
                EEc = new C57752Pjf(interfaceC16620sF, 38);
                c5Tl.FBy(EEc);
            }
            InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(c117505Tk, EEc, false);
            if (opalProfileData == null || (str2 = opalProfileData.A04) == null) {
                str2 = "";
            }
            C68 c68 = C68.A03;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            int i5 = i2 >> 9;
            int i6 = (i5 & 57344) | 199680 | (i5 & 896);
            A05(c5Tl, A0T, interfaceC11380iw, c68, str2, A1B, i6, z);
            c5Tl.Eno(-122670697);
            boolean A1J2 = AbstractC25231BEo.A1J(i4);
            Object EEc2 = c5Tl.EEc();
            if (A1J2 || EEc2 == C5UI.A00) {
                EEc2 = new C57752Pjf(interfaceC16620sF, 39);
                c5Tl.FBy(EEc2);
            }
            InterfaceC16660sJ A1B2 = AbstractC25225BEi.A1B(c117505Tk, EEc2, false);
            if (opalProfileData == null || (str3 = opalProfileData.A02) == null) {
                str3 = "";
            }
            A05(c5Tl, AbstractC118175Wb.A0E(A0T, 0.0f, 6.0f, 0.0f, 0.0f), interfaceC11380iw, C68.A02, str3, A1B2, i6, z);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-1540301709);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30318DWt(interfaceC11380iw, modifier, interfaceC16620sF, interfaceC16820sZ2, opalProfileData, c51745MtU, interfaceC16620sF2, interfaceC16820sZ, i, 1, z);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x00ac. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C5Tl r32, androidx.compose.ui.Modifier r33, X.InterfaceC11380iw r34, X.C74 r35, X.InterfaceC16820sZ r36, X.InterfaceC16820sZ r37, X.InterfaceC16820sZ r38, int r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28507Ci0.A04(X.5Tl, androidx.compose.ui.Modifier, X.0iw, X.C74, X.0sZ, X.0sZ, X.0sZ, int, boolean):void");
    }

    public static final void A05(C5Tl c5Tl, Modifier modifier, InterfaceC11380iw interfaceC11380iw, C68 c68, String str, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        int i2;
        int i3;
        C118125Vw A0X;
        long A01;
        c5Tl.Enr(-533605065);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, c68);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC11380iw);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0W(c5Tl, modifier);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2110747040, "com.instagram.opal.impl.ui.OpalProfilePropertyRow (OpalContent.kt:924)");
            }
            InterfaceC74953Yl A002 = C5WZ.A00(c5Tl, AbstractC25225BEi.A11(c5Tl));
            int ordinal = c68.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i3 = 5;
                } else {
                    throw B4Z.A00();
                }
            } else {
                i3 = 2;
            }
            if (ordinal != 0) {
                c5Tl.Eno(-641338250);
                A0X = AbstractC25226BEj.A0c(c5Tl);
                A01 = AbstractC118155Vz.A01(14);
            } else {
                c5Tl.Eno(-641343946);
                A0X = AbstractC25225BEi.A0X(c5Tl);
                A01 = AbstractC118155Vz.A01(16);
            }
            C118125Vw A0D = A0X.A0D(new C118125Vw(null, null, null, 0, 0, 6291453, 0L, A01, 0L, 0L));
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C118125Vw A0D2 = A0D.A0D(new C118125Vw(null, null, null, 0, 0, 6291454, AbstractC25226BEj.A0G(c5Tl), 0L, 0L, 0L));
            InterfaceC74953Yl A0U = AbstractC25228BEl.A0U(c5Tl, AndroidCompositionLocals_androidKt.A03);
            if (z) {
                c5Tl.Eno(1593772084);
                c5Tl.Eno(-641306743);
                int i4 = i2 & 7168;
                boolean A1U = AbstractC25228BEl.A1U(c5Tl, interfaceC11380iw, AbstractC167007dF.A1P(i4, C3OO.FLAG_MOVED), c5Tl.AH4(A002));
                Object EEc = c5Tl.EEc();
                if (A1U || EEc == C5UI.A00) {
                    EEc = C30184DRp.A00(c5Tl, c68, interfaceC11380iw, A002, 14);
                }
                Modifier Eq3 = modifier.Eq3(new FocusChangedElement(AbstractC25225BEi.A1B(A0K, EEc, false)));
                C6L4 c6l4 = new C6L4(AbstractC25226BEj.A0G(c5Tl));
                c5Tl.Eno(-641324111);
                boolean A1X = AbstractC25225BEi.A1X(c5Tl, A0U, AbstractC167007dF.A1P(i4, C3OO.FLAG_MOVED)) | AbstractC25233BEq.A1H(i2);
                Object EEc2 = c5Tl.EEc();
                if (A1X || EEc2 == C5UI.A00) {
                    EEc2 = C30184DRp.A00(c5Tl, c68, interfaceC16660sJ, A0U, 15);
                }
                AbstractC28411CgH.A02(c5Tl, Eq3, c6l4, A0D2, str, AbstractC25225BEi.A1B(A0K, EEc2, false), C5UA.A01(c5Tl, new C30528DcB(str, c68, 1), -72904161), i3, 1, (i2 >> 3) & 14, 196614, 14808, false);
            } else {
                c5Tl.Eno(1595844093);
                C5WR.A03(c5Tl, modifier, A0D2, null, null, null, str, null, 0, 1, i3, 0, 805306368 | ((i2 >> 3) & 14) | ((i2 >> 12) & 112), 0, 14844, 0L, 0L, 0L, false);
            }
            if (AbstractC25227BEk.A1b(A0K, false)) {
                C0fH.A00(386114087);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVF(interfaceC11380iw, modifier, interfaceC16660sJ, c68, str, i, 1, z);
        }
    }

    public static final void A08(C5Tl c5Tl, Modifier modifier, List list, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        InterfaceC118225Wj interfaceC118225Wj;
        C5UU ASZ;
        int i4;
        c5Tl.Enr(1209881840);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, list);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(634531362, "com.instagram.opal.impl.ui.OpalVisibility (OpalContent.kt:760)");
            }
            if (i != 0 && list.isEmpty()) {
                if (C0fH.A02()) {
                    C0fH.A00(-1231153716);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i4 = 31;
                ASZ.A06 = new C30490DbZ(i2, i, i4, modifier, list, interfaceC16820sZ);
            }
            Modifier A0X = AbstractC25228BEl.A0X(AbstractC25228BEl.A0Z(modifier, 8.0f, AbstractC25226BEj.A0B(c5Tl)), 8.0f);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, 1295293242, i3);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = DH3.A02(c5Tl, interfaceC16820sZ, 3);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A05 = C5XR.A05(A0X, null, null, (InterfaceC16820sZ) EEc, true);
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0a, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C1130158n c1130158n = Modifier.A00;
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25226BEj.A0T(c1130158n), 16.0f);
            InterfaceC1127857k A0L = AbstractC25235BEs.A0L(AbstractC118255Wn.A01(12.0f), c5Tl);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0L, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C6L0 c6l0 = C6L0.A00;
            if (i == 0) {
                c5Tl.Eno(-6203954);
                C2DC A004 = C5Y7.A00(c5Tl, R.drawable.instagram_eye_pano_outline_24, 0);
                Modifier A043 = AbstractC118185Wd.A04(c1130158n);
                interfaceC118225Wj = C118195Wf.A04;
                C5YS.A06(c5Tl, c6l0.AB7(interfaceC118225Wj, A043), A004, AbstractC25226BEj.A0F(c5Tl));
                C5WR.A0g(c5Tl, c6l0.AB7(interfaceC118225Wj, c6l0.A00(c1130158n)), AbstractC136736Hc.A00(c5Tl, 2131969079), AbstractC25226BEj.A0M(c5Tl));
            } else {
                c5Tl.Eno(-5710372);
                Modifier A005 = c6l0.A00(c1130158n);
                interfaceC118225Wj = C118195Wf.A04;
                A0C(list, c6l0.AB7(interfaceC118225Wj, A005), c5Tl, i, AbstractC25228BEl.A01(i3));
            }
            C117505Tk.A0L(A0K, false);
            C5YS.A06(c5Tl, c6l0.AB7(interfaceC118225Wj, AbstractC118185Wd.A0C(c1130158n, 16.0f)), C5Y7.A00(c5Tl, R.drawable.instagram_chevron_right_pano_outline_24, 0), AbstractC25226BEj.A0L(c5Tl));
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(1861388384);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i4 = 32;
            ASZ.A06 = new C30490DbZ(i2, i, i4, modifier, list, interfaceC16820sZ);
        }
    }

    public static final void A09(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        c5Tl.Enr(2091574348);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1228877182, "com.instagram.opal.impl.ui.OpalMessageButton (OpalContent.kt:868)");
            }
            C6GE.A06(c5Tl, modifier, AbstractC25235BEs.A0c(c5Tl, false), AbstractC136736Hc.A00(c5Tl, 2131966348), interfaceC16820sZ, (i2 & 14) | ((i2 << 3) & 896));
            if (C0fH.A02()) {
                C0fH.A00(880999272);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, interfaceC16820sZ, modifier, i, 37);
        }
    }

    public static final void A0C(List list, Modifier modifier, C5Tl c5Tl, int i, int i2) {
        int i3;
        int i4;
        Object[] objArr;
        c5Tl.Enr(-849712685);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, list);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(313976970, "com.instagram.opal.impl.ui.OpalVisibilityFacepile (OpalContent.kt:810)");
            }
            c5Tl.Eno(-1919992206);
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(AbstractC25235BEs.A0d(c5Tl, ((OpalAudienceSelectorRepository.OpalAudience) it.next()).A02));
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            int size = list.size();
            if (size != 1) {
                if (size != 2) {
                    if (size != 3) {
                        c5Tl.Eno(610643328);
                        i4 = 2131969016;
                        objArr = new Object[]{A00(list, 0), A00(list, 1), A00(list, 2), String.valueOf(i - 3)};
                    } else {
                        c5Tl.Eno(610350812);
                        i4 = 2131969017;
                        objArr = new Object[]{A00(list, 0), A00(list, 1), A00(list, 2)};
                    }
                } else {
                    c5Tl.Eno(610115026);
                    i4 = 2131969014;
                    objArr = new Object[]{A00(list, 0), A00(list, 1)};
                }
            } else {
                c5Tl.Eno(609940496);
                i4 = 2131969015;
                objArr = new Object[]{A00(list, 0)};
            }
            String A01 = AbstractC136736Hc.A01(c5Tl, objArr, i4);
            C117505Tk.A0L(c117505Tk, false);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A05, AbstractC25225BEi.A02(((i3 >> 6) & 14) >> 3));
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, modifier);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            C6L0 c6l0 = C6L0.A00;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            Modifier AB7 = c6l0.AB7(interfaceC118225Wj, c1130158n);
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, AB7);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            AbstractC25262BGa.A00(c5Tl, AbstractC133095zb.A00(AbstractC001800i.A0d(A0q, 3)), 28.0f, 0.0f, 0.0f, 0.0f, 48, 28);
            c5Tl.ASW();
            C5WR.A0g(c5Tl, AbstractC118175Wb.A0B(c6l0.AB7(interfaceC118225Wj, c6l0.A00(c1130158n)), 0.0f, 0.0f, 0.0f), A01, AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1941493380);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(modifier, list, i, i2, 39);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0356, code lost:
    
        if (r14.A0A == false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C5Tl r57, androidx.compose.ui.Modifier r58, X.InterfaceC11380iw r59, X.C26073Bg2 r60, X.InterfaceC16820sZ r61, X.InterfaceC16820sZ r62, X.InterfaceC16820sZ r63, X.InterfaceC16820sZ r64, X.InterfaceC16820sZ r65, X.InterfaceC16820sZ r66, X.InterfaceC16820sZ r67, X.InterfaceC16820sZ r68, X.InterfaceC16660sJ r69, X.InterfaceC16660sJ r70, X.InterfaceC16660sJ r71, X.InterfaceC16660sJ r72, X.InterfaceC16620sF r73, X.InterfaceC16620sF r74, X.InterfaceC16610sE r75, X.InterfaceC16610sE r76, int r77, int r78, long r79) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28507Ci0.A06(X.5Tl, androidx.compose.ui.Modifier, X.0iw, X.Bg2, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sF, X.0sF, X.0sE, X.0sE, int, int, long):void");
    }

    public static final void A07(C5Tl c5Tl, Modifier modifier, InterfaceC11380iw interfaceC11380iw, C51030Mgd c51030Mgd, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16820sZ interfaceC16820sZ8, InterfaceC16820sZ interfaceC16820sZ9, InterfaceC16820sZ interfaceC16820sZ10, InterfaceC16820sZ interfaceC16820sZ11, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16610sE interfaceC16610sE, InterfaceC16610sE interfaceC16610sE2, int i, int i2, int i3, long j, boolean z) {
        int i4;
        C25246BFf A002;
        C14360o3.A0B(interfaceC16820sZ, 0);
        AbstractC167027dH.A0a(1, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5);
        C14360o3.A0B(interfaceC16820sZ6, 5);
        AbstractC167007dF.A1H(interfaceC16660sJ, 6, interfaceC16660sJ2);
        AbstractC25234BEr.A0l(8, interfaceC16610sE, interfaceC16610sE2, interfaceC16660sJ3, interfaceC16820sZ7);
        AbstractC25234BEr.A1Q(interfaceC16620sF, interfaceC16820sZ8, interfaceC16620sF2);
        AbstractC25233BEq.A0z(15, interfaceC16820sZ9, interfaceC16820sZ10, interfaceC16820sZ11);
        C14360o3.A0B(c51030Mgd, 18);
        C14360o3.A0B(interfaceC11380iw, 20);
        C14360o3.A0B(modifier, 23);
        c5Tl.Enr(-1071761543);
        int A0H = (i & 6) == 0 ? i | AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) : i;
        if ((i & 48) == 0) {
            A0H |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            A0H |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        if ((i & 3072) == 0) {
            A0H |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ4);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            A0H |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ5);
        }
        if ((i & 196608) == 0) {
            A0H |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ6);
        }
        if ((i & 1572864) == 0) {
            A0H |= AbstractC25232BEp.A0N(c5Tl, interfaceC16660sJ);
        }
        if ((i & 12582912) == 0) {
            A0H |= AbstractC25232BEp.A0O(c5Tl, interfaceC16660sJ2);
        }
        if ((i & 100663296) == 0) {
            A0H |= AbstractC25232BEp.A0P(c5Tl, interfaceC16610sE);
        }
        if ((i & 805306368) == 0) {
            A0H |= AbstractC25232BEp.A0Q(c5Tl, interfaceC16610sE2);
        }
        int A0H2 = (i2 & 6) == 0 ? i2 | AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ3) : i2;
        if ((i2 & 48) == 0) {
            A0H2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ7);
        }
        if ((i2 & 384) == 0) {
            A0H2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 3072) == 0) {
            A0H2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ8);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            A0H2 |= c5Tl.AH6(interfaceC16620sF2) ? Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET : 8192;
        }
        if ((i2 & 196608) == 0) {
            A0H2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ9);
        }
        if ((i2 & 1572864) == 0) {
            A0H2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ10);
        }
        if ((i2 & 12582912) == 0) {
            A0H2 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16820sZ11);
        }
        if ((i2 & 100663296) == 0) {
            A0H2 |= AbstractC25232BEp.A0P(c5Tl, c51030Mgd);
        }
        if ((i2 & 805306368) == 0) {
            A0H2 |= AbstractC25232BEp.A0a(c5Tl, str);
        }
        if ((i3 & 6) == 0) {
            i4 = i3 | AbstractC25231BEo.A0A(c5Tl, interfaceC11380iw);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c5Tl.AH3(j) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c5Tl.AH5(z) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= AbstractC25230BEn.A09(c5Tl, modifier);
        }
        if ((A0H & 306783379) == 306783378 && (306783379 & A0H2) == 306783378 && (i4 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1619877306, "com.instagram.opal.impl.ui.OpalContent (OpalContent.kt:137)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c51030Mgd.A06, 0);
            Object[] objArr = new Object[0];
            boolean A1Z = AbstractC25234BEr.A1Z(c5Tl, 448744683, i4);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = new D86(z, 5);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) C6M6.A00(c5Tl, null, (InterfaceC16820sZ) EEc, objArr, 0, 6);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 448746634);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl2 = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            boolean A1X = AbstractC167007dF.A1X(((C26073Bg2) AbstractC25227BEk.A0s(A0K, A02, false)).A06, C74.A05);
            UserSession A0e = AbstractC25229BEm.A0e(c5Tl);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 448752820);
            if (A0q2 == obj) {
                A0q2 = AbstractC166997dE.A0c(AbstractC25225BEi.A0j(A0e, 0), A0e, 36321043774645345L);
                c5Tl.FBy(A0q2);
            }
            boolean A1a = AbstractC166987dD.A1a(A0q2);
            C117505Tk.A0L(A0K, false);
            if (A1a) {
                c5Tl.Eno(1026580304);
                A002 = BGQ.A00(C25245BFe.A01(AbstractC25328BIx.A02, 200, 0), c5Tl, DDS.A00, 0.0f, 3120, 36, AbstractC25230BEn.A1X(interfaceC74953Yl2));
            } else {
                c5Tl.Eno(1026816338);
                boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, c51030Mgd, 448767807);
                Object EEc2 = c5Tl.EEc();
                if (A1Z2 || EEc2 == obj) {
                    EEc2 = DH3.A02(c5Tl, c51030Mgd, 1);
                }
                A002 = BGQ.A00(null, c5Tl, AbstractC25225BEi.A1A(A0K, EEc2, false), 0.0f, 3072, 52, A1X);
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(448770604);
            if (A1a && AbstractC25231BEo.A05(A002.A06) / A002.A01 > 1.0f) {
                C0eB c0eB = C0eB.A00;
                c5Tl.Eno(448774785);
                boolean A1P = AbstractC167007dF.A1P(A0H2 & 3670016, 1048576);
                Object EEc3 = c5Tl.EEc();
                if (A1P || EEc3 == obj) {
                    EEc3 = new PZU(interfaceC16820sZ10, interfaceC74953Yl2, (InterfaceC23621Ds) null, 18);
                    c5Tl.FBy(EEc3);
                }
                AbstractC25228BEl.A1K(c5Tl, A0K, EEc3, c0eB, false);
            }
            C117505Tk.A0L(A0K, false);
            if (AbstractC25231BEo.A1P(c5Tl, BGR.A00(modifier, A002), new DZ2(interfaceC74953Yl, interfaceC74953Yl2, A02, (C58Y) c5Tl.AJX(C5V2.A02), interfaceC11380iw, A0e, A002, c51030Mgd, str, interfaceC16820sZ11, interfaceC16820sZ, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16820sZ7, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ8, interfaceC16820sZ9, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16620sF, interfaceC16620sF2, interfaceC16610sE, interfaceC16610sE2, j, A1a, A1X), 737584695)) {
                C0fH.A00(-922343279);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30375DYy(modifier, interfaceC11380iw, c51030Mgd, str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16820sZ7, interfaceC16820sZ8, interfaceC16820sZ9, interfaceC16820sZ10, interfaceC16820sZ11, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16620sF, interfaceC16620sF2, interfaceC16610sE, interfaceC16610sE2, i, i2, i3, j, z);
        }
    }
}
