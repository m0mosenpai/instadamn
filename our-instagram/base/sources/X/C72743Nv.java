package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableMap;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Nv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72743Nv extends AbstractC72753Nw implements InterfaceC60072op, InterfaceC60122ou, InterfaceC60132ov, InterfaceC72763Nx, InterfaceC72523Mz, InterfaceC60452pT, C3KA, C0j7, InterfaceC72773Ny, InterfaceC72783Nz {
    public static final ImmutableMap A0U;
    public static final String __redex_internal_original_name = "IgBloksScreenFragment";
    public View A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public FragmentActivity A03;
    public C66273U6s A05;
    public C126545np A07;
    public C62862tP A08;
    public IgBloksScreenConfig A09;
    public AbstractC69784VvL A0A;
    public C6T7 A0B;
    public Ut3 A0C;
    public UserSession A0D;
    public C57012jc A0E;
    public C57012jc A0F;
    public String A0G;
    public boolean A0H;
    public int A0J;
    public int A0K;
    public InterfaceC43433JGx A0L;
    public C6FC A0M;
    public AbstractC18680vv A0N;
    public C3I9 A0O;
    public C57112jm A0P;
    public final List A0Q = new ArrayList();
    public final List A0T = new ArrayList(5);
    public boolean A0I = true;
    public C66201U3x A04 = null;
    public InterfaceC72008XEw A06 = null;
    public final InterfaceC41501vz A0R = new C38276GsL(this);
    public final InterfaceC60152ox A0S = new U4P(this);

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put(1, "bind_initial_content_start");
        builder.put(2, "bind_initial_content_end");
        builder.put(3, "bind_initial_data_on_mount");
        builder.put(4, "receive_additional");
        builder.put(6, "bind_network_content_start");
        builder.put(8, "bind_network_content_pending");
        builder.put(7, "bind_network_content_end");
        builder.put(9, "bind_data_on_mount");
        builder.put(10, "bind_network_content_on_attach");
        builder.put(11, "bind_network_content_action_attach");
        A0U = builder.buildOrThrow();
    }

    @Override // X.InterfaceC72773Ny
    public final void DV2(X9M x9m, C6FG c6fg, C102884kP c102884kP) {
        U5K A00 = U5L.A00(x9m, c6fg, null, c102884kP);
        if (A00 != null) {
            A07(A00);
        }
    }

    public static String A00(C102884kP c102884kP) {
        String A0L = c102884kP.A0L(43);
        String str = A0L != null ? A0L : "";
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    private void A01() {
        List<C71185WpX> list = this.A0Q;
        if (list != null && !list.isEmpty()) {
            for (C71185WpX c71185WpX : list) {
                UserSession userSession = this.A0D;
                if (userSession != null) {
                    AbstractC25651Mw.A00(userSession).A02(c71185WpX.A02, C71H.class);
                }
                c71185WpX.A00 = null;
            }
        }
    }

    public static void A03(U5K u5k, C72743Nv c72743Nv) {
        C6T7 c6t7 = c72743Nv.A0B;
        if (c6t7 != null) {
            c6t7.A03();
            c72743Nv.A0B = null;
        }
        FrameLayout frameLayout = c72743Nv.A02;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            c72743Nv.A02 = null;
            c72743Nv.A07 = null;
            c72743Nv.A0C = null;
        }
        c72743Nv.A09.A06(u5k);
        if (c72743Nv.getContext() != null && c72743Nv.isAdded()) {
            FragmentActivity fragmentActivity = c72743Nv.A03;
            if (fragmentActivity instanceof BaseFragmentActivity) {
                BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) fragmentActivity;
                baseFragmentActivity.A0Z();
                baseFragmentActivity.A0d();
                return;
            }
            C56352iT.A0L(C56352iT.A0t.A03(fragmentActivity), true);
        }
    }

    public static void A04(C72743Nv c72743Nv, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        C6FG c6fg;
        String str;
        C6T7 c6t7;
        C66201U3x c66201U3x = c72743Nv.A04;
        if (c66201U3x != null && (c6t7 = c66201U3x.A04.A01) != null) {
            c6fg = c6t7.A02();
        } else {
            c6fg = null;
        }
        if (c6fg == null) {
            str = AbstractC111324zv.A00(1528);
        } else {
            C6FX c6fx = new C6FX();
            c6fx.A03(c102884kP, 0);
            c6fx.A03(c6fg, 1);
            C6FW A00 = c6fx.A00();
            C66201U3x c66201U3x2 = c72743Nv.A04;
            if (c66201U3x2 == null) {
                return;
            }
            C6T7 c6t72 = c66201U3x2.A04.A01;
            if (c6t72 == null) {
                if (c72743Nv.mView == null) {
                    return;
                } else {
                    str = "runExpression failed on Surface Core.";
                }
            } else {
                C6FP.A03(c6t72.A02(), c102884kP, A00, interfaceC103384lE);
                return;
            }
        }
        AbstractC25241Le.A02(__redex_internal_original_name, str);
    }

    public static void A05(C72743Nv c72743Nv, InterfaceC103384lE interfaceC103384lE) {
        C66201U3x c66201U3x;
        C6FG c6fg;
        String str;
        C6FG A02;
        AnonymousClass630 A022;
        if (interfaceC103384lE != null && (c66201U3x = c72743Nv.A04) != null) {
            C6T7 c6t7 = c66201U3x.A04.A01;
            if (c6t7 != null) {
                c6fg = c6t7.A02();
            } else {
                c6fg = null;
            }
            if (c6fg == null) {
                str = "Cannot run expression on root model without valid context";
            } else {
                C6FX c6fx = new C6FX();
                c6fx.A03(c6fg, 0);
                C6FW A00 = c6fx.A00();
                C6T7 c6t72 = c72743Nv.A04.A04.A01;
                if (c6t72 != null && (A022 = AnonymousClass634.A02((A02 = c6t72.A02()))) != null) {
                    C6FP.A03(A02, A022.A06, A00, interfaceC103384lE);
                    return;
                } else if (c72743Nv.mView == null) {
                    return;
                } else {
                    str = "runExpressionOnRootModel failed on Surface Core.";
                }
            }
            AbstractC25241Le.A02(__redex_internal_original_name, str);
        }
    }

    public final void A07(U5K u5k) {
        View view = this.mView;
        if (view != null) {
            if (view.isInLayout()) {
                view.post(new U5N(u5k, this));
            } else {
                A03(u5k, this);
            }
        }
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        C6FC c6fc = this.A0M;
        if (c6fc != null) {
            return c6fc.A02;
        }
        return null;
    }

    @Override // X.InterfaceC72523Mz
    public final String BUi() {
        String str = this.A0G;
        if (TextUtils.isEmpty(str)) {
            return "bloks_unknown_class";
        }
        return str;
    }

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        C6FC c6fc = this.A0M;
        if (c6fc != null) {
            return c6fc.A01;
        }
        return false;
    }

    @Override // X.InterfaceC72763Nx
    public final void DfM(int i) {
        Runnable u4u;
        ImmutableMap immutableMap = A0U;
        Integer valueOf = Integer.valueOf(i);
        if (immutableMap.containsKey(valueOf)) {
            String str = (String) immutableMap.get(valueOf);
            InterfaceC72008XEw interfaceC72008XEw = this.A06;
            if (interfaceC72008XEw != null) {
                interfaceC72008XEw.Cna(str);
            }
            this.A04.getClass();
            C66201U3x c66201U3x = this.A04;
            AbstractC192138fE abstractC192138fE = (AbstractC192138fE) Pair.create(c66201U3x.A0A.get(), c66201U3x.A03).first;
            if (abstractC192138fE == null) {
                InterfaceC72008XEw interfaceC72008XEw2 = this.A06;
                if (interfaceC72008XEw2 != null) {
                    interfaceC72008XEw2.CnT("response_source", "UNKNOWN");
                }
            } else {
                int i2 = 0;
                if (abstractC192138fE.A00.A00 == 0) {
                    i2 = 1;
                }
                InterfaceC72008XEw interfaceC72008XEw3 = this.A06;
                if (interfaceC72008XEw3 != null) {
                    interfaceC72008XEw3.CnR("prefetched_data_exists", i2);
                }
            }
            if (i == 4) {
                InterfaceC72008XEw interfaceC72008XEw4 = this.A06;
                if (interfaceC72008XEw4 != null) {
                    interfaceC72008XEw4.Cna("request_end");
                }
                u4u = new U4R(this);
                C11T.A07(false, u4u);
            }
        }
        if (i != 0) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            return;
                        } else {
                            u4u = new U4T(this);
                        }
                    } else {
                        u4u = new U4S(this);
                    }
                } else {
                    u4u = new RunnableC71308Wrc(this);
                }
            }
            u4u = new U4R(this);
        } else {
            u4u = new U4U(this);
        }
        C11T.A07(false, u4u);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str;
        IgBloksScreenConfig igBloksScreenConfig = this.A09;
        if (igBloksScreenConfig != null) {
            str = igBloksScreenConfig.A0R;
        } else {
            str = null;
        }
        String str2 = this.A0G;
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            return "bloks_unknown";
        }
        return str;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A0N;
    }

    @Override // X.C0j7
    public final String getUrl() {
        String str = this.A0G;
        if (str == null) {
            return null;
        }
        return AbstractC13670mt.A06("instagram://bloks/?app_id=%s", str);
    }

    @Override // X.InterfaceC72783Nz
    public final boolean isScrolledToTop() {
        C6FG A02;
        this.A04.getClass();
        C6T7 c6t7 = this.A04.A04.A01;
        if (c6t7 != null && (A02 = c6t7.A02()) != null && !VR3.A00(A02)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC103384lE interfaceC103384lE;
        IgBloksScreenConfig igBloksScreenConfig = this.A09;
        if (igBloksScreenConfig == null || (interfaceC103384lE = igBloksScreenConfig.A09) == null || this.A0H) {
            return false;
        }
        this.A0H = true;
        A05(this, interfaceC103384lE);
        this.A0H = false;
        return true;
    }

    private void A02(Bundle bundle) {
        Bundle bundle2;
        InterfaceC72008XEw interfaceC72008XEw;
        C6FG A02;
        AbstractC18680vv A04 = C023409i.A0A.A04(requireArguments());
        this.A0N = A04;
        this.A0D = AbstractC03270Dk.A01(A04);
        this.A0P = AbstractC57052jg.A01(null, W1a.A01.A00);
        if (bundle == null) {
            bundle2 = requireArguments();
        } else {
            bundle2 = bundle;
        }
        C66273U6s A01 = C66201U3x.A01(bundle2);
        this.A05 = A01;
        this.A0G = A01.A09;
        try {
            IgBloksScreenConfig A012 = IgBloksScreenConfig.A01(this.mArguments, this.A0N);
            A012.getClass();
            this.A09 = A012;
        } catch (NullPointerException e) {
            String str = this.A0G;
            boolean z = false;
            if (bundle != null) {
                z = true;
            }
            AbstractC25241Le.A00(null, __redex_internal_original_name, AnonymousClass001.A19("Unexpected null screen config for screen with appId: ", str, " | fromConfigChange: ", z), e);
            this.A09 = new IgBloksScreenConfig(this.A0N);
        }
        this.A08 = C62862tP.A02(this, this, this.A0N, this.A0P);
        this.A03 = requireActivity();
        IgBloksScreenConfig igBloksScreenConfig = this.A09;
        this.A0A = igBloksScreenConfig.A05;
        C62862tP c62862tP = this.A08;
        if (igBloksScreenConfig.A0c) {
            c62862tP.A00 = true;
        }
        C66201U3x A00 = C66201U3x.A00(requireContext(), new SparseArray(), this.A05, this.A09.A07, this.A08, this.A09.A04());
        this.A04 = A00;
        if (A00.A08(requireContext(), this)) {
            String A002 = AbstractC111324zv.A00(3017);
            InterfaceC72008XEw interfaceC72008XEw2 = this.A06;
            if (interfaceC72008XEw2 != null) {
                interfaceC72008XEw2.Cna(A002);
            }
            AbstractC69784VvL abstractC69784VvL = this.A0A;
            if (abstractC69784VvL != null) {
                abstractC69784VvL.A01();
            }
        }
        InterfaceC72008XEw interfaceC72008XEw3 = this.A04.A00;
        interfaceC72008XEw3.getClass();
        this.A06 = interfaceC72008XEw3;
        interfaceC72008XEw3.Cna("fragment_create");
        this.A0O = C3I7.A01(this, false, true);
        UserSession userSession = this.A0D;
        if (userSession != null) {
            AbstractC25651Mw.A00(userSession).A03(this.A0R, AbstractC142666cS.class, "support_personalized_ads_sticker_shared_event");
        }
        this.A0J = C30D.A00(getRootActivity());
        C6T7 c6t7 = this.A04.A04.A01;
        if (c6t7 != null && (A02 = c6t7.A02()) != null) {
            this.A0M = (C6FC) A02.A01.get(R.id.bloks_ig_scrollable_navigation_helper);
        }
        String moduleName = getModuleName();
        InterfaceC72008XEw interfaceC72008XEw4 = this.A06;
        if (interfaceC72008XEw4 != null) {
            interfaceC72008XEw4.CnT("analytics_module", moduleName);
        }
        String str2 = this.A0G;
        if (str2 != null && (interfaceC72008XEw = this.A06) != null) {
            interfaceC72008XEw.CnT("app_id", str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A06(X.C72743Nv r1) {
        /*
            android.app.Activity r0 = r1.getRootActivity()
            boolean r0 = r0 instanceof com.instagram.modal.ModalActivity
            if (r0 == 0) goto L24
            android.app.Activity r1 = r1.getRootActivity()
            com.instagram.modal.ModalActivity r1 = (com.instagram.modal.ModalActivity) r1
            android.view.View r0 = r1.A00
            if (r0 != 0) goto L1d
            r0 = 2131435254(0x7f0b1ef6, float:1.8492345E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.A00 = r0
            if (r0 == 0) goto L24
        L1d:
            boolean r1 = r0.getFitsSystemWindows()
            r0 = 1
            if (r1 != 0) goto L25
        L24:
            r0 = 0
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72743Nv.A06(X.3Nv):boolean");
    }

    @Override // X.C3KA
    public final boolean Cdf() {
        if (isAdded()) {
            Activity rootActivity = getRootActivity();
            rootActivity.getClass();
            if (AbstractC13880nE.A0y(rootActivity) && !A06(this) && !AbstractC13440mV.A07()) {
                IgBloksScreenConfig igBloksScreenConfig = this.A09;
                if (igBloksScreenConfig.A0f || igBloksScreenConfig.A0h) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cb, code lost:
    
        if (r5.intValue() <= 0) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0290  */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r15) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72743Nv.configureActionBar(X.2iU):void");
    }

    @Override // X.AbstractC59962oe
    public final EnumC60772q1 getStatusBarType() {
        if (Cdf()) {
            return EnumC60772q1.A05;
        }
        return EnumC60772q1.A02;
    }

    @Override // X.AbstractC72753Nw, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1891871661);
        super.onCreate(bundle);
        this.A0T.add("ON_CREATE");
        A02(bundle);
        C0f9.A09(-820291927, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-146108340);
        this.A0T.add("ON_CREATE_VIEW");
        View inflate = layoutInflater.inflate(R.layout.bloks_fragment, viewGroup, false);
        C0f9.A09(-972454627, A02);
        return inflate;
    }

    @Override // X.AbstractC72753Nw, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i;
        int A02 = C0f9.A02(-420573117);
        super.onDestroy();
        this.A0T.add("ON_DESTROY");
        C66201U3x c66201U3x = this.A04;
        if (c66201U3x != null) {
            c66201U3x.A06();
        }
        this.A08 = null;
        InterfaceC43433JGx interfaceC43433JGx = this.A0L;
        if (interfaceC43433JGx != null) {
            interfaceC43433JGx.onDestroy();
        }
        if (this.A0Q != null) {
            A01();
        }
        IgBloksScreenConfig igBloksScreenConfig = this.A09;
        if (igBloksScreenConfig == null) {
            i = 858753766;
        } else {
            C69503VpY c69503VpY = igBloksScreenConfig.A03;
            if (c69503VpY != null) {
                c69503VpY.A00(this.A0D);
            }
            if (requireActivity().isFinishing() || !requireActivity().isChangingConfigurations()) {
                this.A09.A05();
            }
            i = 1261094315;
        }
        C0f9.A09(i, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(204769635);
        super.onDestroyView();
        this.A0T.add("ON_DESTROY_VIEW");
        C66201U3x c66201U3x = this.A04;
        if (c66201U3x != null) {
            c66201U3x.A07();
        }
        this.A01 = null;
        this.A0F = null;
        this.A00 = null;
        C6T7 c6t7 = this.A0B;
        if (c6t7 != null) {
            c6t7.A03();
            this.A0B = null;
        }
        this.A07 = null;
        this.A0C = null;
        this.A02 = null;
        UserSession userSession = this.A0D;
        if (userSession != null) {
            AbstractC25651Mw.A00(userSession).A02(this.A0R, AbstractC142666cS.class);
        }
        C0f9.A09(-319279992, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC72008XEw interfaceC72008XEw;
        int A02 = C0f9.A02(1323028920);
        super.onPause();
        this.A0T.add("ON_PAUSE");
        getRootActivity().getClass();
        if (getRootActivity().getWindow() != null) {
            getRootActivity().getWindow().setSoftInputMode(this.A0K);
        }
        if (!this.A09.A0Z) {
            C56352iT.A0t.A03(this.A03).A0W.remove(this);
        }
        boolean isFinishing = requireActivity().isFinishing();
        InterfaceC72008XEw interfaceC72008XEw2 = this.A06;
        if (interfaceC72008XEw2 != null) {
            interfaceC72008XEw2.CnR("is_finishing", isFinishing ? 1 : 0);
        }
        boolean z = this.mRemoving;
        InterfaceC72008XEw interfaceC72008XEw3 = this.A06;
        if (interfaceC72008XEw3 != null) {
            interfaceC72008XEw3.CnR("is_removing", z ? 1 : 0);
        }
        AbstractC69784VvL abstractC69784VvL = this.A0A;
        if (abstractC69784VvL != null) {
            abstractC69784VvL.A00();
        }
        C30D.A04(getRootActivity(), this.A0J);
        C66201U3x c66201U3x = this.A04;
        if (c66201U3x != null && (interfaceC72008XEw = c66201U3x.A00) != null) {
            interfaceC72008XEw.Ch8("BloksSurfaceController_onPause");
        }
        C0f9.A09(476915104, A02);
    }

    @Override // X.AbstractC72753Nw, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1925495189);
        super.onResume();
        this.A0T.add("ON_RESUME");
        if (getRootActivity() != null && getRootActivity().getWindow() != null) {
            this.A0K = getRootActivity().getWindow().getAttributes().softInputMode;
            getRootActivity().getWindow().setSoftInputMode(this.A09.A00 | 2);
        }
        if (!this.A09.A0Z) {
            C56352iT.A0t.A03(requireActivity()).A0W.put(this, null);
        }
        IgBloksScreenConfig igBloksScreenConfig = this.A09;
        if ((igBloksScreenConfig.A0f || igBloksScreenConfig.A0g) && !A06(this)) {
            Activity rootActivity = getRootActivity();
            rootActivity.getClass();
            C30D.A04(rootActivity, getRootActivity().getColor(R.color.fds_transparent));
        }
        C0f9.A09(604721443, A02);
    }

    @Override // X.AbstractC72753Nw, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A0T.add("ON_SAVE_INSTANCE_STATE");
        boolean booleanValue = AbstractC66275U6v.A00(this.A0N).booleanValue();
        C66201U3x c66201U3x = this.A04;
        if (c66201U3x != null) {
            C66273U6s c66273U6s = c66201U3x.A05;
            bundle.putString("__nav_data_type", "legacy_screen");
            if (booleanValue) {
                bundle.putBoolean(AbstractC111324zv.A00(1514), true);
                bundle.putAll(C66273U6s.A00(c66273U6s, true));
            } else {
                bundle.putBundle("BloksSurfaceProps", C66273U6s.A00(c66273U6s, true));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-177808060);
        super.onStart();
        this.A0T.add("ON_START");
        IgBloksScreenConfig igBloksScreenConfig = this.A09;
        if (igBloksScreenConfig != null && !igBloksScreenConfig.A0l && (getRootActivity() instanceof InterfaceC53712dA)) {
            ((InterfaceC53712dA) getRootActivity()).EfL(8);
        }
        C3I9 c3i9 = this.A0O;
        if (c3i9 == null) {
            C0w9.A03(__redex_internal_original_name, "KHCD should already be initialized");
            c3i9 = C3I7.A01(this, false, true);
            this.A0O = c3i9;
        }
        c3i9.Dnr(getRootActivity());
        this.A0O.A9e(this.A0S);
        C0f9.A09(-2122557893, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int i;
        int A02 = C0f9.A02(1082412251);
        super.onStop();
        this.A0T.add("ON_STOP");
        if (getRootActivity() instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) getRootActivity()).EfL(0);
        }
        C3I9 c3i9 = this.A0O;
        if (c3i9 == null) {
            C0w9.A03(__redex_internal_original_name, "KHCD should have been initialized");
            i = -1579484603;
        } else {
            c3i9.EFx(this.A0S);
            this.A0O.onStop();
            i = -1031934192;
        }
        C0f9.A09(i, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r3 != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v13, types: [X.U3x] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.9hP, android.view.View, android.view.ViewGroup, com.instagram.common.ui.base.IgFrameLayout] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72743Nv.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC60452pT
    public final boolean CJv(int i, KeyEvent keyEvent) {
        return false;
    }
}
