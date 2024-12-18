package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.compose.core.ui.IgClickableTextKt;
import java.util.Arrays;

/* renamed from: X.CeR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28339CeR {
    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(554783197);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1654447796, "instagram.features.clips.pivot.header.impl.compose.NativeShimmerView (ComposePivotPageDefaultHeaderFragmentImpl.kt:84)");
            }
            AbstractC28450Cgz.A02(c5Tl, null, C30166DQw.A00, null, 6, 6);
            if (C0fH.A02()) {
                C0fH.A00(-736500969);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 31);
        }
    }

    public static final void A01(C5Tl c5Tl, C26054Bfh c26054Bfh, MOE moe, int i) {
        int i2;
        C0eB c0eB;
        C5UU ASZ;
        int i3;
        c5Tl.Enr(-786801180);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c26054Bfh) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, moe);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1620163253, "instagram.features.clips.pivot.header.impl.compose.UserNameAttribution (ComposePivotPageDefaultHeaderFragmentImpl.kt:102)");
            }
            c5Tl.Eno(-181061719);
            String str = "";
            if (!c26054Bfh.A09) {
                AbstractC28478ChW.A04(c5Tl, "", C29845DEl.A00, 438, false);
                if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                    C0fH.A00(-156084301);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 39;
                C30508Dbr.A01(ASZ, c26054Bfh, moe, i, i3);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            String str2 = c26054Bfh.A08;
            c5Tl.Eno(-181056271);
            String str3 = null;
            if (str2 == null) {
                c0eB = null;
            } else {
                A02(c5Tl, moe, (C69749Vuj) c26054Bfh.A04, (ImageUrl) c26054Bfh.A03, str2, (i2 << 9) & 57344, AbstractC167007dF.A1T((Boolean) c26054Bfh.A01));
                c0eB = C0eB.A00;
            }
            C117505Tk.A0L(A0K, false);
            if (c0eB == null) {
                C69749Vuj c69749Vuj = (C69749Vuj) c26054Bfh.A05;
                c5Tl.Eno(-181046105);
                if (c69749Vuj != null) {
                    str3 = AbstractC25228BEl.A17(c5Tl, c69749Vuj.A01, c69749Vuj.A00);
                }
                C117505Tk.A0L(A0K, false);
                if (str3 != null) {
                    str = str3;
                }
                AbstractC28478ChW.A04(c5Tl, str, C29846DEm.A00, 432, false);
            }
            if (C0fH.A02()) {
                C0fH.A00(270005570);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 40;
            C30508Dbr.A01(ASZ, c26054Bfh, moe, i, i3);
        }
    }

    public static final void A02(C5Tl c5Tl, MOE moe, C69749Vuj c69749Vuj, ImageUrl imageUrl, String str, int i, boolean z) {
        int i2;
        String A01;
        c5Tl.Enr(1452827138);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c69749Vuj);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, imageUrl);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, moe);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-655904081, "instagram.features.clips.pivot.header.impl.compose.ClickableUserNameAttribution (ComposePivotPageDefaultHeaderFragmentImpl.kt:136)");
            }
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 0.0f, 6.0f, 0.0f, 0.0f);
            InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0V, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            String A013 = AbstractC58346Ptm.A01(19, 8, 121);
            c5Tl.Eno(-1155618861);
            C6C7 A0g = AbstractC25228BEl.A0g();
            c5Tl.Eno(-1155616911);
            if (c69749Vuj == null) {
                A01 = null;
            } else {
                int i3 = c69749Vuj.A00;
                Object[] objArr = c69749Vuj.A01;
                A01 = C5YD.A01(c5Tl, Arrays.copyOf(objArr, objArr.length), i3);
            }
            C117505Tk.A0L(c117505Tk, false);
            if (A01 == null) {
                A01 = str;
            }
            A0g.A09(A01);
            if (AbstractC001900j.A0a(A01, str, false)) {
                C14360o3.A0B(A01, 0);
                int A0E2 = AbstractC25230BEn.A0E(A01, str);
                int A042 = AbstractC25226BEj.A04(str, A0E2);
                A0g.A06(new C5W3(null, null, null, C5W5.A01, null, 65531, 0L, 0L, 0L), A0E2, A042);
                A0g.A0A(A013, "Clickable username", A0E2, A042);
            }
            C5C8 A02 = A0g.A02();
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-1155596358);
            if (imageUrl != null) {
                AbstractC28478ChW.A02(c5Tl, imageUrl, 0);
            }
            C117505Tk.A0L(c117505Tk, false);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            long A014 = AbstractC118155Vz.A01(14);
            boolean A1Y = AbstractC25232BEp.A1Y(c5Tl, A02, moe, -1155590323);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = AbstractC25229BEm.A11(c5Tl, moe, A02, A013, 42);
            }
            IgClickableTextKt.A01(c5Tl, null, A02, null, null, null, null, AbstractC25225BEi.A1B(c117505Tk, EEc, false), null, null, 0, 0, 0, 0, 3072, 0, 114674, A0G, A014, false, false);
            c5Tl.Eno(-1155584290);
            if (z && c69749Vuj == null) {
                AbstractC137516Kw.A00(c5Tl, AbstractC118175Wb.A0E(c1130158n, 4.0f, 0.0f, 0.0f, 0.0f));
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(249622002);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUS(c69749Vuj, imageUrl, moe, str, i, 2, z);
        }
    }
}
