package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ENa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32353ENa extends AbstractC60672pq implements InterfaceC62602sz, InterfaceC62612t0, InterfaceC60092or, InterfaceC60122ou, C38O {
    public static final String __redex_internal_original_name = "ExplorePeopleFragment";
    public Bundle A00;
    public EQJ A01;
    public C1570473j A02;
    public InterfaceC70513Em A03;
    public String A07;
    public String A08;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public FNJ A0F;
    public C57112jm A0G;
    public C32124E9x A0H;
    public C65953Twy A0I;
    public C31253Dob A0J;
    public C31445Drp A0K;
    public EVP A0L;
    public C161887My A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public boolean A0R;
    public EnumC31713DwI A04 = EnumC31713DwI.A0b;
    public Integer A05 = C05F.A01;
    public String A06 = "unknown";
    public boolean A09 = true;
    public boolean A0Q = true;
    public final InterfaceC09390do A0S = AbstractC60492pY.A02(this);

    @Override // X.C38O
    public final C193328hC AM3(C193328hC c193328hC) {
        C14360o3.A0B(c193328hC, 0);
        c193328hC.A0n(this);
        return c193328hC;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        boolean z = false;
        C14360o3.A0B(interfaceC56362iU, 0);
        if (requireArguments().containsKey("ExplorePeopleFragment.ARGUMENT_FRAGMENT_TITLE")) {
            interfaceC56362iU.setTitle(requireArguments().getString("ExplorePeopleFragment.ARGUMENT_FRAGMENT_TITLE"));
        } else {
            interfaceC56362iU.Efu(2131960982);
        }
        InterfaceC37264GbH A00 = AbstractC34275F9v.A00(this);
        if (A00 != null) {
            int i = 2131960982;
            if (this.A05 == C05F.A0N) {
                i = 2131953761;
            }
            interfaceC56362iU.Ehi(new FpQ(60, this, A00), i);
        } else {
            z = true;
        }
        interfaceC56362iU.EkS(z);
        interfaceC56362iU.Ehq(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r5.A09 != false) goto L19;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r4 = 0
            X.C14360o3.A0B(r6, r4)
            boolean r0 = r5.A0B
            if (r0 != 0) goto L13
            X.Twy r1 = r5.A0I
            if (r1 == 0) goto L13
            X.3FQ r0 = r5.getScrollingViewProxy()
            r0.AAJ(r1)
        L13:
            X.3FQ r2 = r5.getScrollingViewProxy()
            int r0 = X.C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            r0 = 21
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            X.C14360o3.A0C(r1, r0)
            X.2d4 r1 = (X.C2d4) r1
            X.3Hy r0 = new X.3Hy
            r0.<init>(r1, r4)
            r2.AAJ(r0)
            X.3FQ r1 = r5.getScrollingViewProxy()
            X.Drp r0 = r5.A0K
            if (r0 != 0) goto L42
            java.lang.String r1 = "dropFrameListener"
        L3a:
            X.C14360o3.A0F(r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L42:
            r1.AAJ(r0)
            super.onViewCreated(r6, r7)
            X.EQJ r0 = r5.A01
            if (r0 != 0) goto L4f
            java.lang.String r1 = "explorePeopleAdapter"
            goto L3a
        L4f:
            r5.setAdapter(r0)
            boolean r0 = r5.A0A
            if (r0 != 0) goto L5b
            boolean r1 = r5.A09
            r0 = 0
            if (r1 == 0) goto L5c
        L5b:
            r0 = 1
        L5c:
            X.AbstractC31557Dth.A00(r6, r0)
            java.lang.Integer r1 = r5.A05
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L77
            X.3FQ r0 = r5.getScrollingViewProxy()
            X.3FR r0 = (X.C3FR) r0
            if (r0 == 0) goto L70
            r0.APU()
        L70:
            X.7My r0 = r5.A0M
            if (r0 != 0) goto L99
            java.lang.String r1 = "followStatusUpdatedEventListener"
            goto L3a
        L77:
            X.3Em r0 = r5.A03
            java.lang.String r1 = "pullToRefresh"
            if (r0 == 0) goto L3a
            boolean r0 = r0 instanceof X.C71094Wnq
            if (r0 == 0) goto L70
            X.3FQ r3 = r5.getScrollingViewProxy()
            X.3FR r3 = (X.C3FR) r3
            if (r3 == 0) goto L70
            X.3Em r2 = r5.A03
            if (r2 == 0) goto L3a
            X.Wnq r2 = (X.C71094Wnq) r2
            r1 = 1
            X.Ikp r0 = new X.Ikp
            r0.<init>(r5, r1)
            r3.EgS(r0, r2)
            goto L70
        L99:
            r0.A00()
            X.3FQ r0 = r5.getScrollingViewProxy()
            X.3FR r0 = (X.C3FR) r0
            if (r0 == 0) goto Lb8
            X.2jm r3 = r5.A0G
            if (r3 != 0) goto Lab
            java.lang.String r1 = "viewPointManager"
            goto L3a
        Lab:
            X.3Hc r2 = X.C71163Hc.A00(r5)
            android.view.View r1 = r0.CGT()
            X.2jp[] r0 = new X.InterfaceC57142jp[r4]
            r3.A08(r1, r2, r0)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32353ENa.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void A02() {
        if (!this.A0A && isResumed()) {
            this.A0D = true;
            this.A07 = null;
            A00();
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        if (this.A01 == null) {
            C14360o3.A0F("explorePeopleAdapter");
            throw C00O.createAndThrow();
        }
        return !r0.isEmpty();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        if (this.A07 != null && this.A0C) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (this.A01 == null) {
            C14360o3.A0F("explorePeopleAdapter");
            throw C00O.createAndThrow();
        }
        return !r0.isEmpty();
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        if (this.mView != null) {
            getScrollingViewProxy().EMU(this);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        switch (this.A05.intValue()) {
            case 0:
            case 1:
            case 4:
                return "discover_people";
            case 2:
                return "discover_people_nux";
            case 3:
                return "based_on_your_interests";
            case 5:
                return "explore_businesses";
            default:
                return "explore_people";
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0S);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        boolean z2 = C2U8.A03;
        return null;
    }

    private final void A00() {
        String str;
        String str2;
        C1ON A00;
        C1P1 euq;
        Bundle requireArguments = requireArguments();
        C1570473j c1570473j = this.A02;
        String str3 = "latencyPerfLogger";
        if (c1570473j != null) {
            ((MTJ) c1570473j).A00.A08(null);
            C1570473j c1570473j2 = this.A02;
            if (c1570473j2 != null) {
                c1570473j2.A0E("fetch_request_start");
                if (this.A0B) {
                    if (this.A08 != null && this.A0O != null) {
                        A00 = AbstractC31513Dsx.A01(AbstractC166987dD.A0r(this.A0S), this.A08, this.A0O, this.A0P, false, false);
                    } else {
                        A00 = AbstractC31513Dsx.A01(AbstractC166987dD.A0r(this.A0S), null, this.A0O, this.A0P, AbstractC167007dF.A1X(this.A05, C05F.A0C), AbstractC31174DnI.A1a(EnumC33444EqG.A0L, this.A06));
                    }
                } else {
                    Integer num = this.A05;
                    Integer num2 = C05F.A0N;
                    if (num == num2) {
                        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0S);
                        C14360o3.A0B(A0o, 0);
                        C25621Ms A0q = AbstractC25228BEl.A0q(A0o);
                        A0q.A09(num2);
                        A0q.A0B("interest_nux/based_on_interests/");
                        A00 = AbstractC31172DnG.A0R(null, A0q, C32151EAy.class, C34745FSk.class, false);
                    } else {
                        UserSession A0r = AbstractC166987dD.A0r(this.A0S);
                        boolean z = !AbstractC111324zv.A00(1126).equals(this.A06);
                        int intValue = this.A05.intValue();
                        if (intValue != 4) {
                            if (intValue != 2 && intValue != 1) {
                                str = getModuleName();
                            } else {
                                str = "explore_people";
                            }
                        } else {
                            str = "self_profile_dp";
                        }
                        String str4 = this.A07;
                        if (this.A09) {
                            str2 = this.A0O;
                        } else {
                            str2 = null;
                        }
                        A00 = AbstractC31513Dsx.A00(A0r, null, str, str4, str2, requireArguments.getString(MSV.A00(161)), this.A0N, this.A0P, z, false);
                        C32124E9x c32124E9x = this.A0H;
                        if (c32124E9x == null) {
                            str3 = "navigationPerfLogger";
                        } else {
                            C1570473j c1570473j3 = this.A02;
                            if (c1570473j3 != null) {
                                euq = new EUQ(this, c32124E9x, c1570473j3);
                                A00.A00 = euq;
                                schedule(A00);
                                return;
                            }
                        }
                    }
                }
                euq = EV0.A00(this, 21);
                A00.A00 = euq;
                schedule(A00);
                return;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    public static final void A01(C69613Av c69613Av, C32353ENa c32353ENa, C47K c47k) {
        if (!c47k.A07()) {
            List list = c47k.A0M;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C25821No.A00().A0O(AbstractC166987dD.A0o(c32353ENa.A0S), ((C47O) it.next()).A03.Bhu(), c32353ENa.getModuleName());
                }
                if (AbstractC166987dD.A1b(list)) {
                    C1ON A03 = AbstractC151506rw.A03(AbstractC166987dD.A0r(c32353ENa.A0S), list);
                    A03.A00 = new C32545EUv(c69613Av, c32353ENa);
                    c32353ENa.schedule(A03);
                    return;
                }
            } else {
                return;
            }
        }
        c69613Av.A03();
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (isResumed() && !this.A0A && !this.A0B && CLJ() && !getScrollingViewProxy().CQ6()) {
            A00();
        }
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A00();
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return this.A0A;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, X.FWI] */
    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC72412Xd8 enumC72412Xd8;
        String str;
        Integer num;
        String string;
        int A02 = C0f9.A02(-141518231);
        Bundle requireArguments = requireArguments();
        InterfaceC09390do interfaceC09390do = this.A0S;
        C32124E9x c32124E9x = new C32124E9x(AbstractC166987dD.A0r(interfaceC09390do));
        this.A0H = c32124E9x;
        AbstractC31178DnM.A0m(requireContext(), c32124E9x, this, interfaceC09390do);
        C1570473j c1570473j = new C1570473j(AbstractC166987dD.A0r(interfaceC09390do), "dp_page_1", 31795922);
        this.A02 = c1570473j;
        AbstractC31178DnM.A0m(requireContext(), c1570473j, this, interfaceC09390do);
        super.onCreate(bundle);
        if (requireArguments.containsKey("ExplorePeopleFragment.ARGUMENT_TYPE")) {
            String string2 = requireArguments.getString("ExplorePeopleFragment.ARGUMENT_TYPE");
            Integer num2 = C05F.A00;
            if (!C14360o3.A0K(string2, "discover_people")) {
                num2 = C05F.A0C;
                if (!C14360o3.A0K(string2, AbstractC111324zv.A00(1152))) {
                    num2 = C05F.A0N;
                    if (!C14360o3.A0K(string2, "nux_based_on_interests")) {
                        num2 = C05F.A0Y;
                        if (!C14360o3.A0K(string2, AbstractC111324zv.A00(4325))) {
                            num2 = C05F.A0j;
                            if (!C14360o3.A0K(string2, "suggested_businesses")) {
                                num2 = C05F.A01;
                            }
                        }
                    }
                }
            }
            this.A05 = num2;
        }
        if (requireArguments.containsKey("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT") && (string = requireArguments.getString("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT")) != null) {
            this.A06 = string;
        }
        if (requireArguments.containsKey("ExplorePeopleFragment.ARGUMENT_ENTRY_FEED_ITEM_TYPE")) {
            this.A0N = requireArguments.getString("ExplorePeopleFragment.ARGUMENT_ENTRY_FEED_ITEM_TYPE");
        }
        this.A0O = requireArguments.getString(MSV.A00(40));
        this.A0P = requireArguments.getString("ExplorePeopleFragment.ARGUMENT_SURFACE");
        this.A0E = requireArguments.getBoolean("ExplorePeopleFragment.ARGUMENT_SHOULD_SHOW_NEW_HEADER", true);
        this.A00 = requireArguments.getBundle(AbstractC111324zv.A00(631));
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0M(this, interfaceC09390do), "friend_center_loaded");
        AbstractC31171DnF.A1G(A0f, this.A06);
        AbstractC31171DnF.A1D(A0f, getModuleName());
        A0f.Cht();
        boolean z = true;
        if (!AbstractC31174DnI.A1a(EnumC33444EqG.A0L, this.A06) && (num = this.A05) != C05F.A0C && (num == C05F.A0j || num == C05F.A0N)) {
            z = false;
        }
        this.A0B = z;
        String string3 = requireArguments.getString("request_from_notif_type");
        this.A08 = string3;
        if (string3 != null) {
            this.A0B = true;
        }
        String string4 = requireArguments.getString("is_sectioned");
        C32353ENa c32353ENa = null;
        if (string4 != null && string4.equals("false")) {
            this.A0Q = false;
        }
        if (!this.A0B) {
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            this.A0I = new C65953Twy(AbstractC166987dD.A0r(interfaceC09390do), this, C05F.A01, 4);
        }
        this.A0R = requireArguments.getBoolean("ExplorePeopleFragment.ARGUMENT_ONLY_ALLOW_CONNECT_CONTACTS_UPSELL");
        if (this.A05 == C05F.A0N) {
            this.A04 = EnumC31713DwI.A0H;
        }
        AbstractC34217F7p.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00();
        this.A0L = new EVP(this, this, AbstractC166987dD.A0r(interfaceC09390do), new Object(), new C64592wI(this, AbstractC166987dD.A0r(interfaceC09390do)));
        this.A0J = new C32905Edm(AbstractC166987dD.A0r(interfaceC09390do), this);
        this.A0G = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C57112jm c57112jm = this.A0G;
        if (c57112jm == null) {
            str = "viewPointManager";
        } else {
            this.A0F = new FNJ(this, A0r, c57112jm);
            Context requireContext = requireContext();
            FragmentActivity requireActivity = requireActivity();
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            if (!this.A0B) {
                c32353ENa = this;
            }
            C31253Dob c31253Dob = this.A0J;
            if (c31253Dob == null) {
                str = "delegate";
            } else {
                boolean z2 = this.A0R;
                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                if (this.A05 == C05F.A0C) {
                    enumC72412Xd8 = EnumC72412Xd8.A0S;
                } else {
                    enumC72412Xd8 = EnumC72412Xd8.A0C;
                }
                C33283Ene c33283Ene = new C33283Ene(new C36780GJd(2), A0r3, this, enumC72412Xd8);
                String str2 = this.A06;
                FNJ fnj = this.A0F;
                if (fnj == null) {
                    str = "nametagEntrypointViewpointUtil";
                } else {
                    this.A01 = new EQJ(requireActivity, requireContext, fnj, this, A0r2, this, c31253Dob, c32353ENa, c33283Ene, this.A05, str2, this.A08, z2, this.A0B, this.A0Q);
                    Context requireContext2 = requireContext();
                    UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do);
                    EQJ eqj = this.A01;
                    if (eqj == null) {
                        str = "explorePeopleAdapter";
                    } else {
                        this.A0M = new C161887My(requireContext2, A0r4, eqj);
                        int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                        C31445Drp A00 = AbstractC31589DuH.A00(requireActivity(), this, AbstractC166987dD.A0r(interfaceC09390do), 23599974);
                        this.A0K = A00;
                        registerLifecycleListener(A00);
                        C0f9.A09(-1406281857, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-535024091);
        C14360o3.A0B(layoutInflater, 0);
        if (AbstractC34275F9v.A00(this) != null) {
            C35203Ffv.A01(AbstractC166987dD.A0o(this.A0S), this.A04.A01);
        }
        if (requireActivity() instanceof BaseFragmentActivity) {
            EVP evp = this.A0L;
            if (evp == null) {
                C14360o3.A0F("facebookConnectHelper");
                throw C00O.createAndThrow();
            }
            FragmentActivity requireActivity = requireActivity();
            C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
            IgFragmentActivity igFragmentActivity = (IgFragmentActivity) requireActivity;
            C14360o3.A0B(igFragmentActivity, 0);
            igFragmentActivity.registerOnActivityResultListener(evp.A03);
        }
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_refreshable_recyclerview_with_progress, false);
        this.A03 = AbstractC1571573u.A01(A0R, AbstractC166987dD.A0r(this.A0S), new GHu(this, 1));
        C0f9.A09(252768860, A02);
        return A0R;
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-1441702728);
        getScrollingViewProxy().AI0();
        C161887My c161887My = this.A0M;
        if (c161887My == null) {
            str = "followStatusUpdatedEventListener";
        } else {
            c161887My.A01();
            if (requireActivity() instanceof BaseFragmentActivity) {
                EVP evp = this.A0L;
                if (evp == null) {
                    str = "facebookConnectHelper";
                } else {
                    FragmentActivity requireActivity = requireActivity();
                    C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
                    IgFragmentActivity igFragmentActivity = (IgFragmentActivity) requireActivity;
                    C14360o3.A0B(igFragmentActivity, 0);
                    igFragmentActivity.unregisterOnActivityResultListener(evp.A03);
                }
            }
            C31445Drp c31445Drp = this.A0K;
            if (c31445Drp == null) {
                str = "dropFrameListener";
            } else {
                unregisterLifecycleListener(c31445Drp);
                super.onDestroyView();
                C0f9.A09(-1422836738, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1155275134);
        super.onPause();
        C31253Dob c31253Dob = this.A0J;
        if (c31253Dob == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        c31253Dob.A02.clear();
        C0f9.A09(-1132068991, A02);
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        AbstractC31179DnN.A12(recyclerView);
        recyclerView.setItemAnimator(null);
        recyclerView.A0S = true;
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1597366944);
        super.onResume();
        if (this.A09) {
            A00();
        }
        C0f9.A09(1223831940, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(699154324);
        super.onStop();
        FNJ fnj = this.A0F;
        if (fnj == null) {
            C14360o3.A0F("nametagEntrypointViewpointUtil");
            throw C00O.createAndThrow();
        }
        fnj.A05.clear();
        C0f9.A09(1172598150, A02);
    }
}
