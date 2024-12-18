package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.Fv8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36010Fv8 implements InterfaceC11380iw, InterfaceC71990XEd, GYS, GYT {
    public static final String __redex_internal_original_name = "DirectInboxSearchController";
    public View A00;
    public C18920wW A01;
    public C36684GFe A02;
    public C31445Drp A03;
    public InterfaceC169517hR A04;
    public SearchController A05;
    public final int A06;
    public final Context A07;
    public final AbstractC018607g A08;
    public final AbstractC59962oe A0A;
    public final UserSession A0D;
    public final C57112jm A0E;
    public final C36303Fzy A0F;
    public final InterfaceC132405yL A0I;
    public final DirectSearchInboxFragment A0J;
    public final DirectSearchInboxFragment A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final C1I4 A09 = new E0L(this, 14);
    public final C34435FFz A0G = new C34435FFz(this);
    public final FG0 A0H = new FG0(this);
    public final InterfaceC60602pj A0C = new C31426DrW(this, 0);
    public final InterfaceC11380iw A0B = new InterfaceC11380iw() { // from class: X.Fu0
        public static final String __redex_internal_original_name = "DirectInboxSearchController$$ExternalSyntheticLambda0";

        @Override // X.InterfaceC11380iw
        public final String getModuleName() {
            return "direct_inbox_search";
        }
    };

    @Override // X.InterfaceC71990XEd
    public final float Aby(SearchController searchController, Integer num) {
        return 0.0f;
    }

    @Override // X.InterfaceC71990XEd
    public final void Cwf(SearchController searchController, Integer num, float f, float f2) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjB(SearchController searchController, boolean z) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DoO(SearchController searchController, Integer num, Integer num2) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_inbox_search";
    }

    public static void A00(C36010Fv8 c36010Fv8, DirectSearchPrompt directSearchPrompt, int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = 999;
        } else {
            i2 = 1000;
        }
        String A00 = AbstractC111324zv.A00(i2);
        if (A01(FVU.A00(EnumC33443EqF.NULL_STATE_PROMPT, null, c36010Fv8.A0D, directSearchPrompt.A02, null), c36010Fv8, A00, directSearchPrompt.A03, false)) {
            InterfaceC132405yL interfaceC132405yL = c36010Fv8.A0I;
            if (z) {
                i3 = i % 3;
            } else {
                i3 = i;
            }
            int i4 = 41;
            if (z) {
                i4 = 40;
            }
            interfaceC132405yL.Dld(null, directSearchPrompt, A00, i3, i, -1, -1, i4);
        }
    }

    public static boolean A01(C32021E4z c32021E4z, C36010Fv8 c36010Fv8, String str, String str2, boolean z) {
        String str3;
        Long l;
        AbstractC59962oe abstractC59962oe = c36010Fv8.A0A;
        if (abstractC59962oe.getActivity() != null) {
            UserSession userSession = c36010Fv8.A0D;
            C36303Fzy c36303Fzy = c36010Fv8.A0F;
            C32873EdF.A00(userSession, c36303Fzy).A02();
            EY2 ey2 = c36010Fv8.A02.A01;
            C36395G3w c36395G3w = null;
            if (ey2 != null) {
                str3 = ey2.A01;
                l = Long.valueOf(ey2.A00);
            } else {
                str3 = null;
                l = null;
            }
            C34721FRi c34721FRi = c36303Fzy.A01;
            if (c34721FRi != null) {
                c34721FRi.A09 = c34721FRi.A0G.schedule(new C32666EZq(c34721FRi, l, str3, z), 2L, TimeUnit.SECONDS);
            }
            AiAgentThreadLauncher aiAgentThreadLauncher = new AiAgentThreadLauncher(userSession);
            FragmentActivity activity = abstractC59962oe.getActivity();
            DirectShareTarget directShareTarget = c36010Fv8.A02.A03;
            C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
            boolean A06 = C18U.A06(A0j, userSession, 36324767510311358L);
            if (!str.equals(AbstractC111324zv.A00(999)) && str2 != null && !str2.isEmpty()) {
                c36395G3w = new C36395G3w(c36010Fv8, 10);
            }
            boolean A0B = aiAgentThreadLauncher.A0B(activity, c32021E4z, c36010Fv8, c36395G3w, directShareTarget, null, str, str2, A06, false, false, false, false);
            if (!A0B) {
                F1W.A00(c36010Fv8.A01, c36010Fv8.A02.A03, AbstractC31178DnM.A0b(), str, android.util.Log.getStackTraceString(new Exception()), __redex_internal_original_name, C18U.A04(A0j, userSession, 36882318691992000L), "", "");
            }
            return A0B;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A02() {
        /*
            r2 = this;
            X.7hR r0 = r2.A04
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.BjQ()
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.trim()
        Le:
            java.util.regex.Pattern r1 = X.AbstractC13670mt.A01
            int r0 = X.AbstractC167007dF.A0A(r0)
            return r0
        L15:
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r0 = r2.A0J
            X.Dy8 r0 = X.AbstractC31174DnI.A0U(r0)
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto Le
        L1f:
            java.lang.String r0 = ""
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36010Fv8.A02():int");
    }

    public final String A03() {
        InterfaceC169517hR interfaceC169517hR = this.A04;
        if (interfaceC169517hR != null) {
            String BjQ = interfaceC169517hR.BjQ();
            if (BjQ != null) {
                return BjQ.trim();
            }
            return "";
        }
        String str = AbstractC31174DnI.A0U(this.A0J).A00;
        if (str != null) {
            return str;
        }
        return "";
    }

    public final void A04(String str) {
        C69476Vnz c69476Vnz;
        SearchController searchController = this.A05;
        if (searchController != null && (c69476Vnz = searchController.mViewHolder) != null) {
            c69476Vnz.A0F.setText(str);
            SearchEditText searchEditText = c69476Vnz.A0F;
            Pattern pattern = AbstractC13670mt.A01;
            searchEditText.setSelection(AbstractC167007dF.A0A(str));
        }
    }

    @Override // X.InterfaceC71990XEd
    public final void DEw() {
        DirectSearchInboxFragment directSearchInboxFragment = this.A0K;
        FragmentActivity activity = this.A0A.getActivity();
        if (activity != null) {
            int length = A03().length();
            UserSession userSession = this.A0D;
            C14360o3.A0B(userSession, 1);
            if (length >= 2 && C1VN.A00 != null) {
                AbstractC31282Dp4.A00().A01(activity, userSession, AbstractC111324zv.A00(1476), null);
            }
        }
        if (directSearchInboxFragment != null) {
            directSearchInboxFragment.A03();
        }
        this.A0F.A06(A02());
    }

    @Override // X.InterfaceC71990XEd
    public final void DTR() {
        int i;
        this.A0F.A0B(C05F.A0B, 1, A02());
        C32021E4z A00 = FVU.A00(EnumC33443EqF.USER_INPUT_PROMPT, null, this.A0D, null, null);
        if (A02() == 0) {
            i = 2514;
        } else {
            i = 2515;
        }
        A01(A00, this, AbstractC111324zv.A00(i), A03(), false);
    }

    @Override // X.InterfaceC71990XEd
    public final void DTT() {
        String A00;
        this.A0F.A0B(C05F.A0B, 3, A02());
        if (A02() == 0) {
            A00 = AbstractC43591JPw.A00(165);
        } else {
            A00 = AbstractC111324zv.A00(2516);
        }
        A01(null, this, A00, null, false);
    }

    @Override // X.GYT
    public final void DjF() {
        InterfaceC169517hR interfaceC169517hR = this.A04;
        if (interfaceC169517hR != null) {
            interfaceC169517hR.EKu();
        }
    }

    @Override // X.InterfaceC71990XEd
    public final void DjP(String str, boolean z) {
        UserSession userSession = this.A0D;
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
        if (C18U.A06(A0j, userSession, 36327997325720604L) && C18U.A06(A0j, userSession, 36327997325982752L)) {
            C36303Fzy c36303Fzy = this.A0F;
            Pattern pattern = AbstractC13670mt.A01;
            c36303Fzy.A0B(null, 5, AbstractC167007dF.A0A(str));
            AbstractC34148F4y.A00(userSession, this.A0G, str, "KEYBOARD_SEND");
            return;
        }
        if (!z) {
            return;
        }
        C36303Fzy c36303Fzy2 = this.A0F;
        Pattern pattern2 = AbstractC13670mt.A01;
        c36303Fzy2.A0B(null, 2, AbstractC167007dF.A0A(str));
        A01(null, this, AbstractC111324zv.A00(2517), str, false);
    }

    @Override // X.InterfaceC71990XEd
    public final void DjS(String str, String str2) {
        String A0n;
        C36684GFe c36684GFe = this.A02;
        c36684GFe.A0H = false;
        C36216FyV c36216FyV = c36684GFe.A02;
        if (c36216FyV != null) {
            c36216FyV.A00 = false;
        }
        InterfaceC169517hR interfaceC169517hR = this.A04;
        if (this.A0U) {
            str = str2;
        }
        if (interfaceC169517hR != null) {
            interfaceC169517hR.Eby(str);
        }
        DirectSearchInboxFragment directSearchInboxFragment = this.A0J;
        C14360o3.A0B(str, 0);
        if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(directSearchInboxFragment.A0Q, 0), 36323294337117331L)) {
            C31789Dy8 A0U = AbstractC31174DnI.A0U(directSearchInboxFragment);
            A0U.A00 = str;
            A0U.A01.FBt(str);
        }
        C32873EdF c32873EdF = directSearchInboxFragment.A05;
        if (c32873EdF != null) {
            if (AbstractC13670mt.A0B(str)) {
                A0n = null;
            } else {
                if (c32873EdF.A01 == null) {
                    A0n = AbstractC166997dE.A0n();
                }
                c32873EdF.A00 = str;
            }
            c32873EdF.A01 = A0n;
            c32873EdF.A00 = str;
        }
        C36303Fzy c36303Fzy = this.A0F;
        C34721FRi c34721FRi = c36303Fzy.A01;
        if (c34721FRi != null) {
            c34721FRi.A04(str);
        }
        if (c36303Fzy.A06 != null) {
            c36303Fzy.A05 = str;
            System.currentTimeMillis();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c36303Fzy.A0C, "direct_compose_search");
            if (A0f.isSampled()) {
                Pattern pattern = AbstractC13670mt.A01;
                AbstractC31175DnJ.A13(A0f, str.length());
                A0f.AAP("search_string", str);
                AbstractC31173DnH.A1L(A0f, c36303Fzy.A06);
                A0f.Cht();
            }
            String str3 = c36303Fzy.A05;
            FPY fpy = c36303Fzy.A02;
            if (fpy != null && str3 != null && !str3.isEmpty()) {
                fpy.A00 = Integer.valueOf(fpy.A01.startFlow(str3.length(), str3, AbstractC167017dG.A0K(AbstractC31174DnI.A0m(c36303Fzy.A0D).B7S()), "universal_search", ""));
            }
        }
    }

    @Override // X.GYS
    public final void Dvu() {
        InterfaceC169517hR interfaceC169517hR = this.A04;
        if (interfaceC169517hR != null) {
            interfaceC169517hR.EKu();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0075, code lost:
    
        if (X.C18U.A06(r2, r9, 36320382349615525L) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C36010Fv8(android.content.Context r6, X.AbstractC018607g r7, X.AbstractC59962oe r8, com.instagram.common.session.UserSession r9, X.C57112jm r10, X.C36303Fzy r11, X.InterfaceC132405yL r12, com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r13, com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r14, int r15, boolean r16, boolean r17) {
        /*
            r5 = this;
            r5.<init>()
            r1 = 14
            X.E0L r0 = new X.E0L
            r0.<init>(r5, r1)
            r5.A09 = r0
            X.FFz r0 = new X.FFz
            r0.<init>(r5)
            r5.A0G = r0
            X.FG0 r0 = new X.FG0
            r0.<init>(r5)
            r5.A0H = r0
            r3 = 0
            X.DrW r0 = new X.DrW
            r0.<init>(r5, r3)
            r5.A0C = r0
            r5.A0A = r8
            r5.A07 = r6
            r5.A0D = r9
            r5.A08 = r7
            r5.A06 = r15
            r5.A0J = r13
            r5.A0I = r12
            r5.A0F = r11
            r5.A0E = r10
            r5.A0K = r14
            X.Fu0 r0 = new X.Fu0
            r0.<init>()
            r5.A0B = r0
            boolean r0 = X.AbstractC137186Ix.A01(r9)
            r4 = 1
            if (r0 != 0) goto Lf2
            if (r16 != 0) goto L52
            X.2Eg r0 = X.AbstractC47132Ef.A00(r9)
            X.2Ei r0 = r0.A0a
            boolean r0 = X.AbstractC31177DnL.A1Z(r0)
            if (r0 == 0) goto Lf2
        L52:
            r0 = 1
        L53:
            r5.A0S = r0
            r0 = r17
            r5.A0O = r0
            X.0Tz r2 = X.AbstractC25225BEi.A0j(r9, r3)
            r0 = 36320403823796669(0x810937000421bd, double:3.0325078564717723E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            if (r0 != 0) goto L77
            X.C14360o3.A0B(r9, r3)
            r0 = 36320382349615525(0x810932000e21a5, double:3.032494276113147E-306)
            boolean r1 = X.C18U.A06(r2, r9, r0)
            r0 = 1
            if (r1 != 0) goto L78
        L77:
            r0 = 0
        L78:
            r5.A0N = r0
            r0 = 36313931308075333(0x81035400040945, double:3.0284146114668706E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            r5.A0R = r0
            r0 = 2342156051466094224(0x20810285002b0690, double:4.0596863004819785E-152)
            X.C18U.A06(r2, r9, r0)
            X.C14360o3.A0B(r9, r3)
            r0 = 36320403824452038(0x810937000e21c6, double:3.0325078568862303E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            r5.A0U = r0
            com.instagram.user.model.User r3 = X.AbstractC166997dE.A0Y(r9)
            boolean r0 = X.C2E7.A00(r3)
            if (r0 != 0) goto Lb0
            r0 = 36314790301272884(0x81041c00000b34, double:3.02895784222389E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            if (r0 != 0) goto Lc1
        Lb0:
            boolean r0 = X.C2E7.A00(r3)
            if (r0 == 0) goto Lf0
            r0 = 36314790301338421(0x81041c00010b35, double:3.0289578422653357E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            if (r0 == 0) goto Lf0
        Lc1:
            r5.A0L = r4
            r0 = 36314790302124857(0x81041c000d0b39, double:3.028957842762681E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            r5.A0M = r0
            r0 = 36321941421828005(0x810a9d000027a5, double:3.0334802396581995E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            r5.A0P = r0
            r0 = 36321941421893542(0x810a9d000127a6, double:3.0334802396996454E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            r5.A0Q = r0
            r0 = 36317496130671888(0x81069200001510, double:3.0306690196313204E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            r5.A0T = r0
            return
        Lf0:
            r4 = 0
            goto Lc1
        Lf2:
            r0 = 0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36010Fv8.<init>(android.content.Context, X.07g, X.2oe, com.instagram.common.session.UserSession, X.2jm, X.Fzy, X.5yL, com.instagram.direct.inbox.fragment.DirectSearchInboxFragment, com.instagram.direct.inbox.fragment.DirectSearchInboxFragment, int, boolean, boolean):void");
    }
}
