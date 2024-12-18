package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.api.schemas.GraphGuardianContent;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.compose.core.ui.IgClickableTextKt;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.Chi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28490Chi {
    public static final void A02(C5Tl c5Tl, Modifier modifier, MUW muw, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        C2DB A00;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1400876314);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, muw) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i3 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-655931772, "com.instagram.user.userlist.ui.CTA (LikesListComposeFragment.kt:565)");
            }
            Alignment alignment = C118195Wf.A06;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A002 = C5XX.A00(alignment, false);
            int A003 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A002, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String str = muw.A02;
            ImageUrl imageUrl = (ImageUrl) muw.A01;
            c5Tl.Eno(-571059358);
            C1132359l c1132359l = null;
            if (imageUrl == null) {
                A00 = null;
            } else {
                A00 = AbstractC43541zP.A00(c5Tl, imageUrl);
            }
            C117505Tk.A0L(c117505Tk, false);
            String str2 = muw.A03;
            if (((Number) muw.A00) != null) {
                c1132359l = AbstractC25227BEk.A0O(r0.intValue());
            }
            CGX.A00(c5Tl, modifier2, c1132359l, A00, str, str2, interfaceC16820sZ, (i3 & 112) | 4096 | (i3 & 896), 32, 0L);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-476397294);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 39, muw, interfaceC16820sZ, modifier2);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(1814811677);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1249080324, "com.instagram.user.userlist.ui.LoadingScreen (LikesListComposeFragment.kt:248)");
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Z = AbstractC25230BEn.A0Z();
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            BIR.A03(c5Tl, c1130158n, A01);
            if (C0fH.A02()) {
                C0fH.A00(-1376414839);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 24);
        }
    }

    public static final void A01(C5Tl c5Tl, int i, int i2) {
        int i3;
        C118125Vw A00;
        C118125Vw A002;
        c5Tl.Enr(-424666504);
        if ((i2 & 14) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1901218237, "com.instagram.user.userlist.ui.LikesRow (LikesListComposeFragment.kt:429)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A003 = AnonymousClass598.A00(AbstractC118175Wb.A0D(AbstractC25226BEj.A0T(c1130158n), 16.0f, 16.0f, 0.0f), C30136DPs.A00, false);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A04, c5Tl, C118195Wf.A05, 6);
            int A004 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A003);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A004);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String A005 = C5YD.A00(c5Tl, 2131965115);
            C122965hX c122965hX = AbstractC122945hV.A00;
            Modifier Eq3 = c1130158n.Eq3(new WithAlignmentLineElement(c122965hX));
            A00 = C118125Vw.A00(null, null, AbstractC25225BEi.A0X(c5Tl), null, null, null, 0, 0, 0, 6291454, AbstractC25226BEj.A0G(c5Tl), 0L, 0L, 0L);
            C5WR.A06(c5Tl, Eq3, A00, A005);
            Resources A0B = AbstractC25235BEs.A0B(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1470975251);
            if (A0q == C5UI.A00) {
                C14360o3.A0A(A0B);
                A0q = AbstractC74053Tw.A00(A0B, i);
                c5Tl.FBy(A0q);
            }
            C117505Tk.A0L(c117505Tk, false);
            Modifier Eq32 = c1130158n.Eq3(new WithAlignmentLineElement(c122965hX));
            A002 = C118125Vw.A00(null, null, AbstractC25226BEj.A0c(c5Tl), null, null, null, 0, 0, 0, 6291454, AbstractC25226BEj.A0M(c5Tl), 0L, 0L, 0L);
            C5WR.A09(c5Tl, Eq32, A002, (String) A0q, 6);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-59267692);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30483DbS.A00(ASZ, i, i2, 10);
        }
    }

    public static final void A03(C5Tl c5Tl, GraphGuardianContent graphGuardianContent, int i) {
        if (AbstractC25235BEs.A1W(c5Tl, -1241756060)) {
            C0fH.A01(-1900335179, "com.instagram.user.userlist.ui.SpecialEmptyStateScreen (LikesListComposeFragment.kt:253)");
        }
        Modifier A08 = AbstractC118175Wb.A08(Modifier.A00, 32.0f);
        EnumC27362C5r enumC27362C5r = EnumC27362C5r.A03;
        String title = graphGuardianContent.getTitle();
        String str = "";
        if (title == null) {
            title = "";
        }
        String Agr = graphGuardianContent.Agr();
        if (Agr != null) {
            str = Agr;
        }
        AbstractC28504Chx.A01(c5Tl, A08, null, enumC27362C5r, null, str, null, title, null, null, null, null, 432, 0, 4072, 0L);
        if (C0fH.A02()) {
            C0fH.A00(197329445);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, graphGuardianContent, i, 49);
        }
    }

    public static final void A04(C5Tl c5Tl, ImageUrl imageUrl, FollowStatus followStatus, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        c5Tl.Enr(-782445859);
        if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, imageUrl) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str2);
        }
        if ((i & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, str3);
        }
        if ((i & 57344) == 0) {
            i3 |= AbstractC25232BEp.A0f(c5Tl, z);
        }
        if ((i & 458752) == 0) {
            i3 |= AbstractC25232BEp.A0W(c5Tl, followStatus);
        }
        if ((i & 3670016) == 0) {
            i3 |= AbstractC25232BEp.A0h(c5Tl, z2);
        }
        if ((i & 29360128) == 0) {
            i3 |= AbstractC25232BEp.A0i(c5Tl, z3);
        }
        if ((234881024 & i) == 0) {
            i3 |= AbstractC25232BEp.A0P(c5Tl, interfaceC16660sJ);
        }
        if ((i & 1879048192) == 0) {
            i3 |= AbstractC25232BEp.A0Q(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | AbstractC25231BEo.A0A(c5Tl, interfaceC16820sZ2);
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(388191063, "com.instagram.user.userlist.ui.UserRow (LikesListComposeFragment.kt:536)");
            }
            int i5 = i3 << 6;
            BI4.A07(c5Tl, AbstractC25226BEj.A0w(c5Tl, imageUrl, i3), str, str2, str3, interfaceC16820sZ, interfaceC16660sJ, C5UA.A01(c5Tl, new C30535DcI(12, interfaceC16820sZ2, followStatus, z), 73086588), (i3 & 112) | 8 | (i5 & 57344) | (i5 & 458752) | (i3 & 3670016) | (i3 & 29360128), 196608 | ((i3 >> 18) & 7168) | ((i3 >> 12) & 57344), 7948, z2, z3, false, false);
            if (C0fH.A02()) {
                C0fH.A00(1088012997);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DXR(imageUrl, followStatus, str, str2, str3, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, i, i2, z, z2, z3);
        }
    }

    public static final void A05(C5Tl c5Tl, CWE cwe, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        C5UU ASZ;
        int i3;
        c5Tl.Enr(-888406198);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, cwe) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-601902497, "com.instagram.user.userlist.ui.FeedbackFromFacebookRow (LikesListComposeFragment.kt:467)");
            }
            if (!(cwe instanceof C2I) && !(cwe instanceof C2J)) {
                c5Tl.Eno(1514183594);
                C6C7 A0g = AbstractC25228BEl.A0g();
                String A00 = C5YD.A00(c5Tl, 2131973683);
                C5UP c5up = AndroidCompositionLocals_androidKt.A01;
                Resources resources = ((Context) c5Tl.AJX(c5up)).getResources();
                C14360o3.A0A(resources);
                String A02 = cwe.A02(resources, A00);
                A0g.A07(A02);
                c5Tl.Eno(1514191464);
                if (AbstractC001900j.A0a(A02, A00, false)) {
                    C14360o3.A0B(A02, 0);
                    int A0E = AbstractC25230BEn.A0E(A02, A00);
                    int A04 = AbstractC25226BEj.A04(A00, A0E);
                    A0g.A06(new C5W3(null, null, null, C5W5.A03, null, 65530, AbstractC25226BEj.A0C(c5Tl), 0L, 0L), A0E, A04);
                    A0g.A0A("learn_more", "Clickable learn more link", A0E, A04);
                }
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                C5C8 A022 = A0g.A02();
                C117505Tk.A0L(A0K, false);
                BI3 bi3 = BI3.A03;
                C1130158n c1130158n = Modifier.A00;
                Modifier A09 = AbstractC118185Wd.A09(AbstractC118175Wb.A00(bi3.A01, AbstractC25226BEj.A0T(c1130158n)), 72.0f);
                InterfaceC1127857k A023 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A04, 48);
                int A002 = C5X2.A00(c5Tl);
                C59P A042 = C117505Tk.A04(A0K);
                Modifier A01 = C5X3.A01(c5Tl, A09);
                InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
                AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
                InterfaceC16620sF interfaceC16620sF = C5X8.A03;
                InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A023, A042, interfaceC16620sF);
                InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
                }
                InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
                InterfaceC31127DmA interfaceC31127DmA = bi3.A02;
                Modifier A0C = AbstractC118185Wd.A0C(c1130158n, interfaceC31127DmA.AeZ());
                InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
                int A003 = C5X2.A00(c5Tl);
                C59P A043 = C117505Tk.A04(A0K);
                Modifier A012 = C5X3.A01(c5Tl, A0C);
                AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
                C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
                if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
                }
                C5XJ.A00(c5Tl, A012, A1K);
                boolean z = true;
                C6LQ.A02(c5Tl, AbstractC25231BEo.A0R(c1130158n, interfaceC31127DmA.Aea()), AbstractC25228BEl.A0a(C5XL.A00(c5Tl).A0F), C5Y9.A00(cwe.A00((Context) c5Tl.AJX(c5up)), c5Tl), 56);
                c5Tl.ASW();
                Modifier A0B = AbstractC118175Wb.A0B(c1130158n, 0.0f, 0.0f, 0.0f);
                C118125Vw A0c = AbstractC25226BEj.A0c(c5Tl);
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A022, 2024461539);
                if ((i2 & 112) != 32) {
                    z = false;
                }
                boolean z2 = A1Y | z;
                Object EEc = c5Tl.EEc();
                if (z2 || EEc == C5UI.A00) {
                    EEc = new C57751Pje(21, A022, interfaceC16820sZ);
                    c5Tl.FBy(EEc);
                }
                IgClickableTextKt.A03(c5Tl, A0B, A022, A0c, AbstractC25225BEi.A1B(A0K, EEc, false), 48, 112636, 0L);
                if (AbstractC25227BEk.A1R(c5Tl)) {
                    C0fH.A00(2141747553);
                }
            } else {
                if (C0fH.A02()) {
                    C0fH.A00(-629288086);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 19;
                C30508Dbr.A01(ASZ, cwe, interfaceC16820sZ, i, i3);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 20;
            C30508Dbr.A01(ASZ, cwe, interfaceC16820sZ, i, i3);
        }
    }

    public static final void A06(C5Tl c5Tl, C26047Bfa c26047Bfa, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        boolean z;
        Object obj;
        c5Tl.Enr(1474525118);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26047Bfa) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ2);
        }
        if ((i & 7168) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i & 57344) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ3);
        }
        if ((i & 458752) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ);
        }
        if ((i & 3670016) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 29360128) == 0) {
            i2 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16660sJ4);
        }
        if ((i2 & 23967451) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1411380415, "com.instagram.user.userlist.ui.LikesListScreen (LikesListComposeFragment.kt:272)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 3163384);
            Object obj2 = C5UI.A00;
            if (A0q == obj2) {
                A0q = AbstractC25232BEp.A0w(c5Tl, null);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            C07R c07r = C07R.ON_PAUSE;
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 3166076);
            if (A0q2 == obj2) {
                A0q2 = new C57246PbU(A0q, 6);
                c5Tl.FBy(A0q2);
            }
            AbstractC27489CBk.A00(c5Tl, c07r, null, AbstractC25225BEi.A1A(c117505Tk, A0q2, false), 390, 2);
            LazyListState A0E = AbstractC25227BEk.A0E(c5Tl);
            boolean A1N = AbstractC25231BEo.A1N(i2, 29360128, DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) | AbstractC25227BEk.A1Y(c5Tl, A0E, 3169696);
            Object EEc = c5Tl.EEc();
            if (A1N || EEc == obj2) {
                EEc = new C57158PZc(A0E, interfaceC16660sJ4, null, 26);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1K(c5Tl, c117505Tk, EEc, A0E, false);
            BGU.A00(A0E, c5Tl, 23606367, 0);
            InterfaceC74953Yl A0U = AbstractC25228BEl.A0U(c5Tl, AbstractC117935Vd.A00);
            Object A0q3 = AbstractC25227BEk.A0q(c5Tl, 3184132);
            if (A0q3 == obj2) {
                A0q3 = AbstractC25232BEp.A0w(c5Tl, new C5YC(9205357640488583168L));
            }
            Modifier A0W = AbstractC25229BEm.A0W(AbstractC25225BEi.A0O(c117505Tk), "likes_list");
            boolean A1R = AbstractC25232BEp.A1R(i2 & 57344) | AbstractC25228BEl.A1V(c5Tl, A0U, AbstractC25234BEr.A1X(c5Tl, 3191739, i2) | AbstractC25233BEq.A1I(i2), AbstractC167007dF.A1P(i2 & 3670016, 1048576)) | AbstractC25233BEq.A1K(i2) | AbstractC25233BEq.A1J(i2);
            Object EEc2 = c5Tl.EEc();
            if (!A1R && EEc2 != obj2) {
                z = true;
            } else {
                z = true;
                EEc2 = new C25713BXy(A0U, A0q3, interfaceC16660sJ, interfaceC16620sF, interfaceC16820sZ2, c26047Bfa, interfaceC16660sJ3, A0q, interfaceC16660sJ2, 2);
                c5Tl.FBy(EEc2);
            }
            C6IS.A04(A0E, c5Tl, A0W, AbstractC25225BEi.A1B(c117505Tk, EEc2, false), 12582918, 124, z);
            C38688GzT c38688GzT = c26047Bfa.A01;
            if (c38688GzT != null && (obj = c38688GzT.A00) != null) {
                Object A0q4 = AbstractC25227BEk.A0q(c5Tl, -2106828259);
                Object obj3 = A0q4;
                if (A0q4 == obj2) {
                    C136606Go A0R = AbstractC25230BEn.A0R(false);
                    A0R.A00(Boolean.valueOf(z));
                    c5Tl.FBy(A0R);
                    obj3 = A0R;
                }
                C117505Tk.A0L(c117505Tk, false);
                C30135DPr c30135DPr = C30135DPr.A00;
                C5Y4 A0F = AbstractC25236BEt.A0F();
                CWS cws = CWS.A00;
                AbstractC28495Cho.A02(new BZO(new C28271CdG(null, null, null, new CVD(A0F, c30135DPr), AbstractC06930Yk.A0E(), false)), null, (C136606Go) obj3, c5Tl, null, null, C5UA.A01(c5Tl, new C30536DcJ(23, obj, interfaceC16820sZ, A0q3), -976701303), 196992, 26);
            }
            if (C0fH.A02()) {
                C0fH.A00(1948074123);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWQ(interfaceC16820sZ, interfaceC16820sZ2, c26047Bfa, interfaceC16660sJ2, interfaceC16660sJ4, interfaceC16660sJ, interfaceC16620sF, interfaceC16660sJ3, i, 8);
        }
    }

    public static final void A07(C5Tl c5Tl, InterfaceC30833Dh8 interfaceC30833Dh8, int i) {
        C118125Vw A00;
        if (AbstractC25235BEs.A1W(c5Tl, 821153859)) {
            C0fH.A01(-470392167, "com.instagram.user.userlist.ui.ViewsRow (LikesListComposeFragment.kt:385)");
        }
        C5UP c5up = AndroidCompositionLocals_androidKt.A01;
        Resources resources = ((Context) c5Tl.AJX(c5up)).getResources();
        C1130158n c1130158n = Modifier.A00;
        Modifier A0A = AbstractC118175Wb.A0A(AbstractC25226BEj.A0T(c1130158n), 0.0f, 32.0f);
        InterfaceC1127857k A002 = AbstractC118375Wz.A00(AbstractC118255Wn.A02, c5Tl, C118195Wf.A04);
        int A003 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, A0A);
        AbstractC25233BEq.A11(c5Tl, c117505Tk);
        AbstractC25231BEo.A12(c5Tl, A002, A04);
        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
        }
        AbstractC25225BEi.A1K(c5Tl, A01);
        C6LQ.A02(c5Tl, AbstractC118175Wb.A0A(c1130158n, 4.0f, 0.0f), AbstractC25228BEl.A0a(AbstractC25226BEj.A0F(c5Tl)), C5Y9.A00(C71x.A00((Context) c5Tl.AJX(c5up), R.drawable.instagram_play_pano_outline_16), c5Tl), 440);
        Object A0q = AbstractC25227BEk.A0q(c5Tl, -239390720);
        if (A0q == C5UI.A00) {
            if (interfaceC30833Dh8 instanceof C29401CxY) {
                C14360o3.A0A(resources);
                A0q = AbstractC74053Tw.A02(resources, Integer.valueOf(((C29401CxY) interfaceC30833Dh8).A00));
            } else if (interfaceC30833Dh8 instanceof C29402CxZ) {
                C14360o3.A0A(resources);
                A0q = AbstractC74053Tw.A03(resources, Integer.valueOf(((C29402CxZ) interfaceC30833Dh8).A00), 2131968662);
            } else {
                throw B4Z.A00();
            }
            c5Tl.FBy(A0q);
        }
        C117505Tk.A0L(c117505Tk, false);
        A00 = C118125Vw.A00(null, null, C5XL.A01(c5Tl).A08, null, C5W5.A04, null, 0, 0, 0, 6291450, AbstractC25226BEj.A0G(c5Tl), 0L, 0L, 0L);
        C5WR.A0k(c5Tl, A00, (String) A0q, 6, 16382);
        c5Tl.ASW();
        AbstractC28389Cfs.A00(c5Tl);
        if (C0fH.A02()) {
            C0fH.A00(-235000243);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, interfaceC30833Dh8, i, 0);
        }
    }
}
