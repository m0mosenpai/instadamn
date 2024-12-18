package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.tigon.tigonhuc.HucClient;

/* renamed from: X.Chr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28498Chr {
    public static final void A04(C5Tl c5Tl, Modifier modifier, CWX cwx, C54781OIv c54781OIv, C64842wi c64842wi, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i) {
        int i2;
        boolean z;
        boolean A1b = AbstractC25233BEq.A1b(c5Hc, modifier, c64842wi);
        C14360o3.A0B(cwx, 3);
        AbstractC25234BEr.A0k(4, c54781OIv, interfaceC16620sF, interfaceC16820sZ, interfaceC16820sZ2);
        C14360o3.A0B(interfaceC16820sZ3, 8);
        c5Tl.Enr(-687929874);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, c64842wi);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, cwx);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25229BEm.A04(AbstractC25233BEq.A1V(c5Tl, c54781OIv, i, Constants.LOAD_RESULT_PGO) ? 1 : 0);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16620sF);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16820sZ2);
        }
        if ((100663296 & i) == 0) {
            i2 |= AbstractC25232BEp.A0P(c5Tl, interfaceC16820sZ3);
        }
        if ((38347923 & i2) == 38347922 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-474139226, "com.instagram.newsfeed.followrequests.ui.compose.LoadedFollowRequests (FollowRequestsCompose.kt:59)");
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            c5Tl.Eno(-1775357365);
            boolean A1P = AbstractC167007dF.A1P(i2 & 14, 4) | AbstractC25233BEq.A1K(i2) | AbstractC25233BEq.A1L(i2);
            if ((57344 & i2) == 16384 || ((i2 & Constants.LOAD_RESULT_PGO) != 0 && c5Tl.AH6(c54781OIv))) {
                z = true;
            } else {
                z = false;
            }
            boolean A1T = A1P | z | AbstractC25234BEr.A1T(i2) | AbstractC25234BEr.A1V(i2) | AbstractC25233BEq.A1M(i2) | AbstractC25231BEo.A1M(i2);
            Object EEc = c5Tl.EEc();
            if (A1T || EEc == C5UI.A00) {
                EEc = new DIL(0, c54781OIv, interfaceC16620sF, c5Hc, interfaceC16820sZ3, cwx, interfaceC16820sZ2, interfaceC16820sZ, c64842wi);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            A01(A00, c5Tl, modifier, (InterfaceC16660sJ) EEc, (i2 >> 3) & 14);
            if (C0fH.A02()) {
                C0fH.A00(1676535856);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30319DWu(c54781OIv, cwx, c5Hc, modifier, interfaceC16820sZ3, interfaceC16620sF, interfaceC16820sZ, interfaceC16820sZ2, c64842wi, i, A1b ? 1 : 0);
        }
    }

    public static final BJ3 A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return BJ3.A02;
            case 1:
                return BJ3.A03;
            case 2:
                return BJ3.A05;
            case 3:
                return BJ3.A04;
            case 4:
                return BJ3.A06;
            case 5:
            case 6:
                return BJ3.A07;
            case 7:
                return BJ3.A0A;
            case 8:
                return BJ3.A0B;
            default:
                return BJ3.A0D;
        }
    }

    public static final void A01(LazyListState lazyListState, C5Tl c5Tl, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(820032622);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, lazyListState);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1118789937, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestsLazyColumn (FollowRequestsCompose.kt:178)");
            }
            BGU.A00(lazyListState, c5Tl, 23598336, (i2 >> 3) & 14);
            C6IS.A03(AbstractC25229BEm.A0P(36.0f), lazyListState, c5Tl, modifier, interfaceC16660sJ, 12583296 | (i2 & 14) | (i2 & 112) | ((i2 << 18) & 234881024), HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, true);
            if (C0fH.A02()) {
                C0fH.A00(84804893);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30219DSy(i, 5, modifier, lazyListState, interfaceC16660sJ);
        }
    }

    public static final void A02(C5Tl c5Tl, int i) {
        c5Tl.Enr(414805140);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(127304758, "com.instagram.newsfeed.followrequests.ui.compose.LoadMoreSpinner (FollowRequestsCompose.kt:260)");
            }
            BIR.A01(c5Tl, AbstractC118175Wb.A04(AbstractC25228BEl.A0W()));
            if (C0fH.A02()) {
                C0fH.A00(846721786);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 8);
        }
    }

    public static final void A03(C5Tl c5Tl, int i) {
        c5Tl.Enr(-856571330);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-807594545, "com.instagram.newsfeed.followrequests.ui.compose.PrivateToPublicHeader (FollowRequestsCompose.kt:265)");
            }
            String A00 = C5YD.A00(c5Tl, 2131968500);
            C5WR.A0T(c5Tl, AbstractC118175Wb.A0A(Modifier.A00, 28.0f, 12.0f), AbstractC25225BEi.A0Y(c5Tl), A00, AbstractC25226BEj.A0M(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(1493484544);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 9);
        }
    }

    public static final void A05(C5Tl c5Tl, CWX cwx, InterfaceC30996Djv interfaceC30996Djv, C54781OIv c54781OIv, C64842wi c64842wi, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        c5Tl.Enr(-1145755880);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, interfaceC30996Djv) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, cwx);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i & 3072) == 0) {
            int i3 = 1024;
            if (AbstractC25231BEo.A1Q(c5Tl, c54781OIv, i & 4096)) {
                i3 = C3OO.FLAG_MOVED;
            }
            i2 |= i3;
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ2);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ3);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0Y(c5Tl, c64842wi);
        }
        if ((4793491 & i2) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-908172166, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestItemContent (FollowRequestsCompose.kt:88)");
            }
            if (C26222Bim.A00(interfaceC30996Djv, 0)) {
                c5Tl.Eno(240661211);
                C26222Bim c26222Bim = (C26222Bim) interfaceC30996Djv;
                C26023BfC c26023BfC = (C26023BfC) c26222Bim.A01;
                Object A0q = AbstractC25227BEk.A0q(c5Tl, -1931898377);
                if (A0q == C5UI.A00) {
                    A0q = new C27870CQh(cwx, c26023BfC);
                    c5Tl.FBy(A0q);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                AbstractC28132Caf.A00(c5Tl, (C27870CQh) A0q, c26023BfC.A04, c26023BfC.A07, c26023BfC.A06, c26023BfC.A08, c26023BfC.A0A, c26222Bim.BKd(), C5UA.A01(c5Tl, new DSA(40, cwx, c26023BfC), -1340421556), 805306368, 6, c26023BfC.A0C, c26023BfC.A0D, c26023BfC.A0E);
            } else if (interfaceC30996Djv instanceof C26220Bik) {
                c5Tl.Eno(-1931869919);
                C26220Bik c26220Bik = (C26220Bik) interfaceC30996Djv;
                CJN.A00(C5YD.A00(c5Tl, c26220Bik.A01), C5YD.A00(c5Tl, c26220Bik.A00), c5Tl, 0);
            } else if (C26222Bim.A00(interfaceC30996Djv, 1)) {
                c5Tl.Eno(-1931863341);
                A06(c5Tl, (Integer) ((C26222Bim) interfaceC30996Djv).A01, interfaceC16820sZ, (i2 >> 3) & 112);
            } else if (interfaceC30996Djv instanceof C29326CwL) {
                c5Tl.Eno(-1931858608);
                A03(c5Tl, 0);
            } else if (C26222Bim.A00(interfaceC30996Djv, 3)) {
                c5Tl.Eno(242032868);
                C26222Bim c26222Bim2 = (C26222Bim) interfaceC30996Djv;
                C26020Bf9 c26020Bf9 = (C26020Bf9) c26222Bim2.A01;
                Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1931854301);
                Object obj = C5UI.A00;
                if (A0q2 == obj) {
                    A0q2 = new BI0(c54781OIv, c26020Bf9, interfaceC16620sF);
                    c5Tl.FBy(A0q2);
                }
                InterfaceC58121Ppk interfaceC58121Ppk = (InterfaceC58121Ppk) A0q2;
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                String str = c26020Bf9.A06;
                String str2 = c26020Bf9.A05;
                String str3 = c26020Bf9.A07;
                String str4 = c26020Bf9.A08;
                String str5 = c26020Bf9.A04;
                String str6 = c26020Bf9.A03;
                boolean z = c26020Bf9.A09;
                boolean z2 = c26020Bf9.A0A;
                boolean z3 = c26020Bf9.A0B;
                boolean z4 = c26020Bf9.A0C;
                BJ3 A00 = A00(c26020Bf9.A02);
                Object A0q3 = AbstractC25227BEk.A0q(c5Tl, -1931828612);
                if (A0q3 == obj) {
                    A0q3 = new C57531Pg5(41, c54781OIv, c26020Bf9);
                    c5Tl.FBy(A0q3);
                }
                BIU.A01(c5Tl, A00, interfaceC58121Ppk, str, str2, str3, str4, str5, str6, c26222Bim2.BKd(), AbstractC25225BEi.A1A(A0K, A0q3, false), 0, 3456, z, z2, z3, z4);
            } else if (interfaceC30996Djv instanceof C29327CwM) {
                c5Tl.Eno(-1931819342);
                BIU.A00(c5Tl, 0);
            } else if (interfaceC30996Djv instanceof C29328CwN) {
                c5Tl.Eno(-1931816231);
                A07(interfaceC16820sZ2, c5Tl, (i2 >> 15) & 14);
            } else if (C26222Bim.A00(interfaceC30996Djv, 2)) {
                c5Tl.Eno(-1931812311);
                AbstractC28326CeE.A01(c5Tl, c64842wi, (C4NJ) ((C26222Bim) interfaceC30996Djv).A01, (i2 >> 18) & 112);
            } else if (interfaceC30996Djv instanceof C29325CwK) {
                c5Tl.Eno(-1931806102);
                A02(c5Tl, 0);
            } else if (C26221Bil.A00(interfaceC30996Djv, 0)) {
                c5Tl.Eno(243644713);
                String A002 = C5YD.A00(c5Tl, 2131974306);
                int i4 = ((C26221Bil) interfaceC30996Djv).A01;
                String A02 = C5YD.A02(c5Tl, AbstractC25228BEl.A1Y(i4), R.plurals.spam_follow_requests_subtitle, i4);
                AbstractC25705BXp.A06(c5Tl, C5XR.A05(Modifier.A00, null, null, interfaceC16820sZ3, true), C5Y7.A00(c5Tl, R.drawable.instagram_warning_pano_outline_24, 0), C29198Cu3.A00, A002, A02, 130764);
            } else {
                c5Tl.Eno(-1931786851);
            }
            if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                C0fH.A00(-1344067625);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWQ(cwx, interfaceC30996Djv, c54781OIv, c64842wi, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16620sF, interfaceC16820sZ3, i, 3);
        }
    }

    public static final void A06(C5Tl c5Tl, Integer num, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        String A17;
        c5Tl.Enr(-1645070522);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, num) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1290513258, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestsViewAllCta (FollowRequestsCompose.kt:252)");
            }
            c5Tl.Eno(1928479306);
            if (num == null) {
                A17 = null;
            } else {
                A17 = AbstractC25228BEl.A17(c5Tl, Integer.valueOf(num.intValue()), 2131973177);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            c5Tl.Eno(1928479044);
            if (A17 == null) {
                A17 = C5YD.A00(c5Tl, 2131973168);
            }
            C117505Tk.A0L(A0K, false);
            A08(interfaceC16820sZ, A17, c5Tl, i2 & 112);
            if (C0fH.A02()) {
                C0fH.A00(1909129698);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, num, interfaceC16820sZ, i, 32);
        }
    }

    public static final void A07(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-1485400205);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1505657578, "com.instagram.newsfeed.followrequests.ui.compose.SuggestedUsersViewAllCta (FollowRequestsCompose.kt:275)");
            }
            A08(interfaceC16820sZ, C5YD.A00(c5Tl, 2131973176), c5Tl, (i2 << 3) & 112);
            if (C0fH.A02()) {
                C0fH.A00(1588989796);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, interfaceC16820sZ, i, 25);
        }
    }

    public static final void A08(InterfaceC16820sZ interfaceC16820sZ, String str, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-1260532673);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1588710995, "com.instagram.newsfeed.followrequests.ui.compose.ViewAllCta (FollowRequestsCompose.kt:280)");
            }
            int i3 = i2 & 14;
            C5WR.A0M(c5Tl, AbstractC118185Wd.A01(C118195Wf.A04, AbstractC118175Wb.A04(AbstractC118185Wd.A09(AbstractC25225BEi.A0Q(C5XR.A05(Modifier.A00, null, null, interfaceC16820sZ, true)), 48.0f))), AbstractC25226BEj.A0c(c5Tl), str, i3, AbstractC25226BEj.A0N(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(-1465803951);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30503Dbm.A01(ASZ, interfaceC16820sZ, str, i, 12);
        }
    }
}
