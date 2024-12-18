package com.instagram.profile.fragment;

import X.AbstractC153346v3;
import X.AbstractC155926zM;
import X.AbstractC18680vv;
import X.AbstractC59962oe;
import X.AbstractC64552wE;
import X.C006802i;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C0j7;
import X.C14360o3;
import X.C152896uJ;
import X.C152906uK;
import X.C152936uN;
import X.C153096ud;
import X.C153146ui;
import X.C153156uj;
import X.C153376v6;
import X.C154736xO;
import X.C155406yT;
import X.C155786z8;
import X.C155886zI;
import X.C155896zJ;
import X.C155996zT;
import X.C18C;
import X.C18U;
import X.C1I2;
import X.C2U8;
import X.C2UU;
import X.C2ZI;
import X.C33616EtS;
import X.C38N;
import X.C38U;
import X.C3FN;
import X.C3FQ;
import X.C42749Ivn;
import X.C53N;
import X.C53Q;
import X.C53R;
import X.C57112jm;
import X.C5GV;
import X.C61372qz;
import X.C61582rL;
import X.C62882tR;
import X.C64572wG;
import X.C69613Av;
import X.C71163Hc;
import X.EnumC125765mR;
import X.EnumC125775mS;
import X.H8P;
import X.HY3;
import X.InterfaceC11380iw;
import X.InterfaceC152836uD;
import X.InterfaceC152846uE;
import X.InterfaceC152866uG;
import X.InterfaceC152886uI;
import X.InterfaceC153086uc;
import X.InterfaceC1571373s;
import X.InterfaceC53792dI;
import X.InterfaceC60132ov;
import X.InterfaceC60682pr;
import X.InterfaceC62602sz;
import X.InterfaceC62612t0;
import X.JHJ;
import X.ViewOnTouchListenerC60632pm;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.GraphGuardianContentImpl;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.ProfileMediaTabFragment;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class ProfileMediaTabFragment extends AbstractC59962oe implements InterfaceC60682pr, InterfaceC152836uD, InterfaceC152846uE, InterfaceC60132ov, C0j7 {
    public UserSession A00;
    public HY3 A01;
    public C152936uN A02;
    public EnumC125765mR A03;
    public C155996zT A04;
    public H8P A05;
    public InterfaceC62602sz A06;
    public String A07;
    public C57112jm A09;
    public C153156uj A0A;
    public C61582rL A0B;
    public C5GV A0C;
    public C153376v6 A0D;
    public C154736xO A0E;
    public String A0F;
    public C62882tR mDropFrameWatcher;
    public RecyclerView mRecyclerView;
    public C3FQ mScrollingViewProxy;
    public final C61372qz A0G = new C61372qz();
    public final InterfaceC152866uG A0J = new InterfaceC152866uG() { // from class: X.6uF
        @Override // X.InterfaceC152866uG
        public final void AAn(C38321qM c38321qM, int i) {
            ProfileMediaTabFragment.A00(ProfileMediaTabFragment.this).AAn(c38321qM, i);
        }

        @Override // X.InterfaceC152866uG
        public final void EDr(View view, C38321qM c38321qM) {
            ProfileMediaTabFragment.A00(ProfileMediaTabFragment.this).EDr(view, c38321qM);
        }
    };
    public final InterfaceC152886uI A0K = new InterfaceC152886uI() { // from class: X.6uH
        @Override // X.InterfaceC152886uI
        public final void AAo(Reel reel, int i) {
            ProfileMediaTabFragment.A00(ProfileMediaTabFragment.this).AAo(reel, i);
        }

        @Override // X.InterfaceC152886uI
        public final void EDs(View view, Reel reel) {
            ProfileMediaTabFragment.A00(ProfileMediaTabFragment.this).EDs(view, reel);
        }
    };
    public boolean A08 = false;
    public final C152896uJ A0H = new C152896uJ(this);
    public final C152906uK A0I = new C152906uK(this);

    public static C153376v6 A00(ProfileMediaTabFragment profileMediaTabFragment) {
        C155996zT c155996zT;
        UserDetailTabController userDetailTabController;
        C42749Ivn c42749Ivn;
        C153376v6 c153376v6 = profileMediaTabFragment.A0D;
        if (c153376v6 == null) {
            if (profileMediaTabFragment.A08 && (c42749Ivn = (c155996zT = profileMediaTabFragment.A04).A06) != null) {
                userDetailTabController = c42749Ivn.A02;
            } else {
                c155996zT = profileMediaTabFragment.A04;
                userDetailTabController = c155996zT.A07.A02;
            }
            User user = userDetailTabController.A0O.A0J;
            C153376v6 A00 = AbstractC153346v3.A00(profileMediaTabFragment, profileMediaTabFragment.A00, profileMediaTabFragment.A09, c155996zT.A02, profileMediaTabFragment.A03, c155996zT.A0D, user, c155996zT.A0H, c155996zT.A0G);
            profileMediaTabFragment.A0D = A00;
            return A00;
        }
        return c153376v6;
    }

    @Override // X.InterfaceC152836uD
    public final Fragment ACb() {
        return this;
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        return null;
    }

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        return false;
    }

    @Override // X.InterfaceC152836uD
    public final void DcV(UserDetailTabController userDetailTabController) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drq(boolean z) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drw() {
    }

    public final void A01() {
        C155406yT c155406yT = this.A04.A05;
        C154736xO c154736xO = c155406yT.A0C;
        int i = c154736xO.A00;
        if (i != 0) {
            C006802i c006802i = c154736xO.A01;
            c006802i.markerPoint(i, "empty_grid_rendered");
            int i2 = c154736xO.A00;
            if (i2 != 0) {
                c006802i.markerEnd(i2, (short) 2);
                c154736xO.A00 = 0;
            }
        }
        C69613Av c69613Av = c155406yT.A08;
        c69613Av.A01.A0K("is_empty_state", true);
        c69613Av.A05();
    }

    @Override // X.InterfaceC152836uD, X.InterfaceC152846uE
    public final String Bi9() {
        return this.A07;
    }

    @Override // X.InterfaceC152836uD
    public final ViewGroup Br5() {
        return this.mRecyclerView;
    }

    @Override // X.InterfaceC152846uE
    public final void DXk(int i, ViewGroup viewGroup) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && i != 0) {
            C153156uj.A01(recyclerView, this.A0A, i, true);
        }
    }

    @Override // X.InterfaceC152846uE
    public final void Dfk(final int i) {
        this.mRecyclerView.post(new Runnable() { // from class: X.6uo
            @Override // java.lang.Runnable
            public final void run() {
                HY3 hy3;
                ProfileMediaTabFragment profileMediaTabFragment = ProfileMediaTabFragment.this;
                int i2 = i;
                if (profileMediaTabFragment.mRecyclerView != null) {
                    if (profileMediaTabFragment.A08 && (hy3 = profileMediaTabFragment.A01) != null) {
                        hy3.A02.A03 = i2;
                        hy3.A01();
                    } else {
                        C152936uN c152936uN = profileMediaTabFragment.A02;
                        c152936uN.A02.A03 = i2;
                        c152936uN.A01();
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC152846uE
    public final void Dix(boolean z) {
        final RecyclerView recyclerView = this.mRecyclerView;
        recyclerView.post(new Runnable() { // from class: X.6un
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (recyclerView2 != null) {
                    recyclerView2.A0n(0);
                }
            }
        });
    }

    @Override // X.InterfaceC152836uD
    public final void Drv(boolean z) {
        C155886zI c155886zI;
        Object obj;
        if (this.A08 && (obj = this.A01) != null) {
            c155886zI = this.A04.A09;
        } else {
            c155886zI = this.A04.A09;
            obj = this.A02;
        }
        C14360o3.A0B(obj, 0);
        c155886zI.A00 = new WeakReference(obj);
        this.A04.A05.A04 = getScrollingViewProxy();
        H8P h8p = this.A05;
        if (h8p != null) {
            h8p.A0E("tab_selected");
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if ("profile_fan_club_grid".equals(this.A07)) {
            return "fan_club";
        }
        C155996zT c155996zT = this.A04;
        if (c155996zT != null) {
            return c155996zT.A01.getModuleName();
        }
        return "profile_unknown";
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        C3FQ c3fq = this.mScrollingViewProxy;
        if (c3fq == null) {
            C3FQ A00 = C3FN.A00(this.mRecyclerView);
            this.mScrollingViewProxy = A00;
            return A00;
        }
        return c3fq;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.C0j7
    public final String getUrl() {
        return null;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        int i3 = C2U8.A00;
        return null;
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnDestroyView() {
        super.afterOnDestroyView();
        unregisterLifecycleListener(this.mDropFrameWatcher);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if (r7.A03 != X.EnumC125765mR.A09) goto L6;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = 134852654(0x809b02e, float:4.1434036E-34)
            int r4 = X.C0f9.A02(r0)
            super.onCreate(r8)
            android.os.Bundle r3 = r7.requireArguments()
            X.0do r0 = X.AbstractC60492pY.A02(r7)
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            r7.A00 = r0
            java.lang.String r0 = "ProfileMediaTabFragment.profile_tab_mode"
            java.io.Serializable r0 = r3.getSerializable(r0)
            r0.getClass()
            X.5mR r0 = (X.EnumC125765mR) r0
            r7.A03 = r0
            java.lang.String r0 = "ProfileMediaTabFragment.profile_tab_identifier"
            java.lang.String r0 = r3.getString(r0)
            r0.getClass()
            r7.A07 = r0
            com.instagram.common.session.UserSession r0 = r7.A00
            boolean r0 = X.AnonymousClass502.A00(r0)
            if (r0 == 0) goto L41
            X.5mR r2 = r7.A03
            X.5mR r1 = X.EnumC125765mR.A09
            r0 = 1
            if (r2 == r1) goto L42
        L41:
            r0 = 0
        L42:
            r7.A08 = r0
            java.lang.String r0 = "ProfileMediaTabFragment.profile_source_media_id"
            java.lang.String r0 = r3.getString(r0)
            r7.A0F = r0
            r1 = 0
            X.2jk r0 = X.AbstractC57052jg.A00()
            X.2jm r0 = X.AbstractC57052jg.A01(r1, r0)
            r7.A09 = r0
            androidx.fragment.app.Fragment r0 = r7.requireParentFragment()
            com.instagram.profile.fragment.UserDetailFragment r0 = (com.instagram.profile.fragment.UserDetailFragment) r0
            X.2rL r0 = r0.A0h
            r7.A0B = r0
            if (r0 == 0) goto L66
            r7.registerLifecycleListener(r0)
        L66:
            com.instagram.common.session.UserSession r6 = r7.A00
            java.lang.String r3 = r7.A07
            r5 = 0
            X.C14360o3.A0B(r6, r5)
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317272792372188(0x81065e000013dc, double:3.030527779591279E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 == 0) goto Lb0
            r0 = 36880222745854268(0x83065e0001013c, double:3.386539596990861E-306)
            java.lang.String r1 = X.C18U.A04(r2, r6, r0)
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = X.AbstractC001900j.A0R(r1, r0, r5)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto Lb0
            com.instagram.common.session.UserSession r1 = r7.A00
            java.lang.String r0 = r7.A07
            X.H8P r2 = new X.H8P
            r2.<init>(r1, r0)
            r7.A05 = r2
            android.content.Context r1 = r7.requireContext()
            com.instagram.common.session.UserSession r0 = r7.A00
            X.2hJ r0 = X.C55772hI.A00(r0)
            r2.A0Q(r1, r0, r7)
        Lb0:
            java.lang.String r1 = r7.A07
            java.lang.String r0 = "profile_tagged_media_photos_of_you"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbf
            java.lang.String r0 = "tagged_profile"
            r7.setModuleNameV2(r0)
        Lbf:
            com.instagram.common.session.UserSession r3 = r7.A00
            X.C14360o3.A0B(r3, r5)
            X.02i r2 = X.C006802i.A0p
            r0 = 44
            X.GSv r1 = new X.GSv
            r1.<init>(r2, r0)
            java.lang.Class<X.6xO> r0 = X.C154736xO.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.6xO r0 = (X.C154736xO) r0
            r7.A0E = r0
            r0 = -1846210764(0xffffffff91f50f34, float:-3.8663554E-28)
            X.C0f9.A09(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.fragment.ProfileMediaTabFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC53792dI interfaceC53792dI;
        UserDetailTabController userDetailTabController;
        int A02 = C0f9.A02(-556154435);
        Integer num = this.A03.A01;
        Integer num2 = C05F.A01;
        boolean z = false;
        if (num == num2) {
            z = true;
        }
        C18C.A0G(z, "ProfileMediaTabFragment no longer supports FEED View.");
        this.A04 = ((C53R) requireParentFragment()).Avm();
        C61582rL c61582rL = this.A0B;
        if (c61582rL != null) {
            UserSession userSession = this.A00;
            Integer num3 = C05F.A0u;
            this.A0C = new C5GV(userSession, this.A09, new C64572wG(null, AbstractC64552wE.A00(this.A04.A05.A05, getModuleName()), c61582rL), num3);
            this.A0G.A03(this.A0B);
        }
        final UserDetailFragment userDetailFragment = this.A04.A0A;
        this.A06 = new InterfaceC62602sz() { // from class: X.6uL
            @Override // X.InterfaceC62602sz
            public final boolean CL7() {
                return userDetailFragment.A16(ProfileMediaTabFragment.this.A03);
            }

            @Override // X.InterfaceC62602sz
            public final boolean CLJ() {
                return userDetailFragment.A17(ProfileMediaTabFragment.this.A03);
            }

            @Override // X.InterfaceC62602sz
            public final boolean CUG() {
                UserDetailFragment userDetailFragment2 = userDetailFragment;
                EnumC125765mR enumC125765mR = ProfileMediaTabFragment.this.A03;
                if (enumC125765mR != null) {
                    C154776xS c154776xS = userDetailFragment2.A0j;
                    EnumC125775mS enumC125775mS = enumC125765mR.A00;
                    C14360o3.A0B(enumC125775mS, 0);
                    if (C154776xS.A00(c154776xS, enumC125775mS).A01()) {
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
            
                if (r4.A17(r3) == false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
            
                if (r1 == 0) goto L21;
             */
            @Override // X.InterfaceC62602sz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean CXf() {
                /*
                    r8 = this;
                    com.instagram.profile.fragment.ProfileMediaTabFragment r3 = com.instagram.profile.fragment.ProfileMediaTabFragment.this
                    com.instagram.common.session.UserSession r0 = r3.A00
                    r6 = 0
                    X.C14360o3.A0B(r0, r6)
                    X.0Tz r7 = X.C06090Tz.A05
                    r1 = 36328117586705608(0x81103b001d3cc8, double:3.0373860711962155E-306)
                    boolean r0 = X.C18U.A06(r7, r0, r1)
                    com.instagram.profile.fragment.UserDetailFragment r4 = r2
                    X.5mR r3 = r3.A03
                    if (r0 == 0) goto L70
                    X.MUB r0 = r4.A10
                    com.instagram.user.model.User r0 = r0.A03
                    r5 = 0
                    if (r0 == 0) goto L39
                    if (r3 == 0) goto L39
                    com.instagram.common.session.UserSession r0 = r4.A0I
                    X.C14360o3.A0B(r0, r6)
                    boolean r0 = X.C18U.A06(r7, r0, r1)
                    if (r0 == 0) goto L3a
                    boolean r0 = r4.A16(r3)
                    if (r0 == 0) goto L70
                    boolean r0 = r4.A17(r3)
                    if (r0 != 0) goto L70
                L39:
                    return r5
                L3a:
                    boolean r2 = r4.A1w
                    com.instagram.profile.fragment.UserDetailTabController r0 = r4.A0z
                    X.5mS r1 = r3.A00
                    if (r2 == 0) goto L6b
                    X.Ivn r0 = r0.A02
                    if (r0 == 0) goto L58
                    X.C14360o3.A0B(r1, r6)
                    X.Ivl r0 = X.C42749Ivn.A00(r0, r1)
                    X.HKx r0 = r0.A07
                    java.util.List r0 = r0.A01
                    int r1 = r0.size()
                L55:
                    r0 = 0
                    if (r1 != 0) goto L59
                L58:
                    r0 = 1
                L59:
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                    boolean r0 = r4.A18(r3)
                    if (r0 == 0) goto L69
                    boolean r0 = r1.booleanValue()
                    if (r0 != 0) goto L39
                L69:
                    r5 = 1
                    return r5
                L6b:
                    int r1 = r0.A08(r1)
                    goto L55
                L70:
                    boolean r5 = r4.A18(r3)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C152916uL.CXf():boolean");
            }

            @Override // X.InterfaceC62602sz
            public final void Chd() {
                userDetailFragment.A0t(ProfileMediaTabFragment.this.A03);
            }

            @Override // X.InterfaceC62602sz
            public final boolean isLoading() {
                return userDetailFragment.A18(ProfileMediaTabFragment.this.A03);
            }
        };
        UserSession userSession2 = this.A00;
        C14360o3.A0B(userSession2, 0);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession2, 36327348785658386L);
        Context requireContext = requireContext();
        C155996zT c155996zT = this.A04;
        C38N c38n = c155996zT.A04;
        C53Q c53q = c155996zT.A03;
        UserSession userSession3 = this.A00;
        C38U c38u = c155996zT.A0D;
        InterfaceC11380iw interfaceC11380iw = c155996zT.A01;
        InterfaceC62602sz interfaceC62602sz = this.A06;
        C155896zJ c155896zJ = c155996zT.A07;
        EnumC125765mR enumC125765mR = this.A03;
        C53N c53n = c155996zT.A0E;
        C155786z8 c155786z8 = c155996zT.A0B;
        InterfaceC152866uG interfaceC152866uG = this.A0J;
        C33616EtS c33616EtS = c155996zT.A08;
        C5GV c5gv = this.A0C;
        H8P h8p = this.A05;
        if (getRootActivity() instanceof InterfaceC53792dI) {
            interfaceC53792dI = (InterfaceC53792dI) getRootActivity();
        } else {
            interfaceC53792dI = null;
        }
        String str = this.A0F;
        InterfaceC53792dI interfaceC53792dI2 = null;
        InterfaceC53792dI interfaceC53792dI3 = interfaceC53792dI;
        this.A02 = new C152936uN(requireContext, interfaceC53792dI3, interfaceC11380iw, userSession3, c53q, c38n, interfaceC152866uG, c5gv, c155896zJ, c33616EtS, enumC125765mR, this, h8p, c155786z8, new InterfaceC1571373s() { // from class: X.6uM
            @Override // X.InterfaceC1571373s
            public final void DDQ() {
            }

            @Override // X.InterfaceC1571373s
            public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
            }

            @Override // X.InterfaceC1571373s
            public final void DDR() {
                String str2;
                ProfileMediaTabFragment profileMediaTabFragment = ProfileMediaTabFragment.this;
                GraphGuardianContentImpl graphGuardianContentImpl = ((AbstractC155926zM) profileMediaTabFragment.A04.A07.A03.get(profileMediaTabFragment.A03.A00)).A00;
                if (graphGuardianContentImpl != null && (str2 = graphGuardianContentImpl.A01) != null) {
                    SimpleWebViewActivity.A00(profileMediaTabFragment.requireContext(), profileMediaTabFragment.A00, new SimpleWebViewConfig((String) null, (String) null, true, false, false, false, false, true, false, false, true, false, false, false, (String) null, AbstractC63260SgI.A01(profileMediaTabFragment.requireContext(), str2)));
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("analytics_module", profileMediaTabFragment.A04.A01.getModuleName());
                bundle2.putString("location", "IG_PROFILE");
                C6XJ.A03(profileMediaTabFragment.requireActivity(), bundle2, profileMediaTabFragment.A00, ModalActivity.class, "account_status").A0C(profileMediaTabFragment.requireActivity());
            }
        }, c38u, interfaceC62602sz, c53n, Boolean.valueOf(A06), str);
        if (this.A08 && this.A04.A06 != null) {
            Context requireContext2 = requireContext();
            C155996zT c155996zT2 = this.A04;
            C38N c38n2 = c155996zT2.A04;
            C53Q c53q2 = c155996zT2.A03;
            JHJ jhj = c155996zT2.A0C;
            UserSession userSession4 = this.A00;
            C38U c38u2 = c155996zT2.A0D;
            InterfaceC11380iw interfaceC11380iw2 = c155996zT2.A01;
            InterfaceC62602sz interfaceC62602sz2 = this.A06;
            C42749Ivn c42749Ivn = c155996zT2.A06;
            EnumC125765mR enumC125765mR2 = this.A03;
            C53N c53n2 = c155996zT2.A0E;
            C155786z8 c155786z82 = c155996zT2.A0B;
            InterfaceC152886uI interfaceC152886uI = this.A0K;
            C33616EtS c33616EtS2 = c155996zT2.A08;
            C5GV c5gv2 = this.A0C;
            H8P h8p2 = this.A05;
            if (getRootActivity() instanceof InterfaceC53792dI) {
                interfaceC53792dI2 = (InterfaceC53792dI) getRootActivity();
            }
            this.A01 = new HY3(requireContext2, interfaceC53792dI2, interfaceC11380iw2, userSession4, c53q2, c38n2, interfaceC152866uG, interfaceC152886uI, c5gv2, c42749Ivn, c33616EtS2, enumC125765mR2, this, h8p2, c155786z82, jhj, c38u2, interfaceC62602sz2, c53n2, this.A0F, A06);
        }
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C153096ud c153096ud = new C153096ud(this, new InterfaceC153086uc() { // from class: X.6ub
            @Override // X.InterfaceC153086uc
            public final void DNW(C38321qM c38321qM, int i2, int i3) {
            }
        }, this.A02, this.A04.A0F);
        C61372qz c61372qz = this.A0G;
        c61372qz.A03(c153096ud);
        C62882tR c62882tR = new C62882tR(requireActivity(), this, this.A00, 23592965);
        this.mDropFrameWatcher = c62882tR;
        c62882tR.A03 = num2;
        registerLifecycleListener(c62882tR);
        c61372qz.A03(this.mDropFrameWatcher);
        H8P h8p3 = this.A05;
        if (h8p3 != null) {
            h8p3.A00 = this.A06;
            boolean z2 = this.A08;
            String str2 = null;
            C155996zT c155996zT3 = this.A04;
            if (z2) {
                C42749Ivn c42749Ivn2 = c155996zT3.A06;
                if (c42749Ivn2 != null) {
                    userDetailTabController = c42749Ivn2.A02;
                }
                this.A05.A01 = str2;
            } else {
                userDetailTabController = c155996zT3.A07.A02;
            }
            User user = userDetailTabController.A0O.A0J;
            if (user != null) {
                str2 = user.getId();
            }
            this.A05.A01 = str2;
        }
        View inflate = layoutInflater.inflate(R.layout.profile_media_tab_fragment, viewGroup, false);
        C0f9.A09(1884346520, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Object obj;
        List list;
        C42749Ivn c42749Ivn;
        int A02 = C0f9.A02(-1237624311);
        super.onDestroyView();
        this.A0A = null;
        this.mRecyclerView.A0a();
        this.mRecyclerView.setAdapter(null);
        this.A04.A0B.A04.remove(this);
        if (this.A08 && (c42749Ivn = this.A04.A06) != null) {
            EnumC125775mS enumC125775mS = this.A03.A00;
            obj = this.A0I;
            C14360o3.A0B(enumC125775mS, 0);
            C14360o3.A0B(obj, 1);
            list = C42749Ivn.A00(c42749Ivn, enumC125775mS).A08;
        } else {
            C155896zJ c155896zJ = this.A04.A07;
            EnumC125775mS enumC125775mS2 = this.A03.A00;
            obj = this.A0H;
            AbstractC155926zM abstractC155926zM = (AbstractC155926zM) c155896zJ.A03.get(enumC125775mS2);
            C14360o3.A0B(obj, 0);
            list = abstractC155926zM.A07;
        }
        list.remove(obj);
        this.A0G.A00();
        ProfileMediaTabFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(-1192000036, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C153146ui c153146ui;
        C2UU c2uu;
        C42749Ivn c42749Ivn;
        this.mRecyclerView = (RecyclerView) view.requireViewById(android.R.id.list);
        int i = 1;
        FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(requireContext());
        this.mRecyclerView.setItemAnimator(null);
        this.mRecyclerView.setLayoutManager(fastScrollingLinearLayoutManager);
        this.A04.A05.A04 = getScrollingViewProxy();
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        int A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36606148002125179L);
        InterfaceC62612t0 interfaceC62612t0 = new InterfaceC62612t0() { // from class: X.6uh
            @Override // X.InterfaceC62612t0
            public final void AD4() {
                ProfileMediaTabFragment profileMediaTabFragment = ProfileMediaTabFragment.this;
                if (!profileMediaTabFragment.A06.isLoading() && profileMediaTabFragment.A06.CLJ()) {
                    profileMediaTabFragment.A06.Chd();
                }
            }
        };
        if (A01 == -1) {
            c153146ui = C153146ui.A0C;
        } else {
            c153146ui = new C153146ui(C05F.A00, C05F.A01, A01);
        }
        C153156uj c153156uj = new C153156uj(fastScrollingLinearLayoutManager, interfaceC62612t0, c153146ui, false, true);
        this.A0A = c153156uj;
        C61372qz c61372qz = this.A0G;
        c61372qz.A02(c153156uj);
        this.mRecyclerView.A14(c61372qz);
        if (!this.A08) {
            this.mRecyclerView.setRecycledViewPool(this.A04.A00);
        }
        if (!this.A08 || this.A01 == null) {
            i = 0;
        }
        C2ZI.A00.A0B("profile", "use_grid_adapter", i);
        RecyclerView recyclerView = this.mRecyclerView;
        if (i != 0) {
            c2uu = this.A01;
        } else {
            c2uu = this.A02;
        }
        recyclerView.setAdapter(c2uu);
        C155786z8 c155786z8 = this.A04.A0B;
        Set set = c155786z8.A04;
        if (!set.contains(this)) {
            set.add(this);
            HashSet hashSet = c155786z8.A03;
            if (!hashSet.contains(this.A07)) {
                Dix(false);
            }
            hashSet.add(this.A07);
            HashSet hashSet2 = c155786z8.A02;
            if (!hashSet2.contains(this.A07)) {
                Dfk(c155786z8.A00);
            }
            hashSet2.add(this.A07);
        }
        if (this.A08 && (c42749Ivn = this.A04.A06) != null) {
            EnumC125775mS enumC125775mS = this.A03.A00;
            C152906uK c152906uK = this.A0I;
            C14360o3.A0B(enumC125775mS, 0);
            C14360o3.A0B(c152906uK, 1);
            List list = C42749Ivn.A00(c42749Ivn, enumC125775mS).A08;
            if (!list.contains(c152906uK)) {
                list.add(c152906uK);
            }
            c152906uK.A00();
        } else {
            C155896zJ c155896zJ = this.A04.A07;
            EnumC125775mS enumC125775mS2 = this.A03.A00;
            C152896uJ c152896uJ = this.A0H;
            AbstractC155926zM abstractC155926zM = (AbstractC155926zM) c155896zJ.A03.get(enumC125775mS2);
            C14360o3.A0B(c152896uJ, 0);
            List list2 = abstractC155926zM.A07;
            if (!list2.contains(c152896uJ)) {
                list2.add(c152896uJ);
            }
            c152896uJ.A00();
        }
        this.A09.A06(this.mRecyclerView, C71163Hc.A00(this));
        super.onViewCreated(view, bundle);
    }
}
