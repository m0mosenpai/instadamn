package X;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.fragment.NewsfeedFragment;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;

/* renamed from: X.2pP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60412pP extends AbstractC60422pQ implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60092or, InterfaceC60102os, InterfaceC60122ou, InterfaceC60132ov, InterfaceC60452pT, InterfaceC60182p1, InterfaceC60192p2, InterfaceC60042om {
    public static final String __redex_internal_original_name = "IgTabHostFragment";
    public EnumC60652po A00;
    public String A01;
    public Bundle A02;
    public ViewOnTouchListenerC60632pm A03;
    public boolean A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final C06N A06 = new C06N() { // from class: X.2pa
        @Override // X.C06N
        public final void onBackStackChanged() {
            C60412pP c60412pP = C60412pP.this;
            if (Systrace.A0E(1L)) {
                C0fO.A01("IgTabHostFragment.onBackStackChangedListener", -871335122);
            }
            try {
                AbstractC60542pd.A04(c60412pP.requireActivity(), c60412pP.getChildFragmentManager(), (UserSession) c60412pP.A05.getValue());
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-591366542);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(435695839);
                }
                throw th;
            }
        }
    };

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    @Deprecated(message = "Deprecated in Android")
    public final void onAttachFragment(Fragment fragment) {
        Bundle bundle;
        C14360o3.A0B(fragment, 0);
        this.A00 = EnumC60652po.A02;
        String str = this.A01;
        if (str != null && str.equals(fragment.mTag) && (fragment instanceof InterfaceC60102os) && (bundle = this.A02) != null) {
            ((InterfaceC60102os) fragment).EU2(bundle);
            this.A02 = null;
        }
    }

    @Override // X.AbstractC60422pQ, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        EnumC60652po enumC60652po = this.A00;
        if (enumC60652po != null) {
            bundle.putSerializable("KEY_TAB_HOST_FRAGMENT_LOADING_STATE", enumC60652po);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Fragment A00(String str) {
        C38321qM E3r;
        Fragment c59952od;
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgTabHostFragment.loadTabFragment", 2083744956);
        }
        try {
            switch (str.hashCode()) {
                case -869920652:
                    if (str.equals("fragment_clips")) {
                        Context requireContext = requireContext();
                        InterfaceC09390do interfaceC09390do = this.A05;
                        UserSession userSession = (UserSession) interfaceC09390do.getValue();
                        C14360o3.A0B(userSession, 1);
                        C97Z c97z = new C97Z(requireContext, userSession);
                        UserSession userSession2 = c97z.A01;
                        C5RA A00 = C5R9.A00(userSession2);
                        if (SystemClock.elapsedRealtime() - A00.A00 >= TimeUnit.SECONDS.toMillis(C37787Gk2.A00(A00.A02)) || (E3r = A00.A01) == null || !E3r.A59() || !C37787Gk2.A01.A0A(userSession2)) {
                            EnumC37328GcW enumC37328GcW = EnumC37328GcW.A04;
                            E3r = C37327GcV.A00(userSession2, enumC37328GcW).E3r(enumC37328GcW);
                            if (E3r != null && E3r.A59()) {
                            }
                            UserSession userSession3 = (UserSession) interfaceC09390do.getValue();
                            C14360o3.A0B(userSession3, 0);
                            Bundle bundle = new Bundle();
                            C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0g, userSession3);
                            c116875Qr.A1M = AbstractC58592mI.A00(userSession3).A03;
                            bundle.putParcelable("ClipsViewerLauncher.KEY_CONFIG", c116875Qr.A00());
                            c59952od = new C59952od();
                            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession3.token);
                            c59952od.setArguments(bundle);
                            AbstractC60902qE.A00(c59952od, (UserSession) interfaceC09390do.getValue());
                            break;
                        }
                        C4VX c4vx = new C4VX(c97z.A00, userSession2, E3r.CFR(), " ReelsViewerVideoPreWarmer");
                        c4vx.A04 = true;
                        c4vx.A02 = true;
                        C4VZ.A00(c4vx.A00());
                        UserSession userSession32 = (UserSession) interfaceC09390do.getValue();
                        C14360o3.A0B(userSession32, 0);
                        Bundle bundle2 = new Bundle();
                        C116875Qr c116875Qr2 = new C116875Qr(ClipsViewerSource.A0g, userSession32);
                        c116875Qr2.A1M = AbstractC58592mI.A00(userSession32).A03;
                        bundle2.putParcelable("ClipsViewerLauncher.KEY_CONFIG", c116875Qr2.A00());
                        c59952od = new C59952od();
                        bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession32.token);
                        c59952od.setArguments(bundle2);
                        AbstractC60902qE.A00(c59952od, (UserSession) interfaceC09390do.getValue());
                    }
                    throw new RuntimeException("Unknown starting fragment.");
                case -859263443:
                    if (str.equals("fragment_feed")) {
                        c59952od = new C60662pp();
                        AbstractC60902qE.A00(c59952od, (UserSession) this.A05.getValue());
                        break;
                    }
                    throw new RuntimeException("Unknown starting fragment.");
                case -859024542:
                    if (str.equals("fragment_news")) {
                        c59952od = new NewsfeedFragment();
                        AbstractC60902qE.A00(c59952od, (UserSession) this.A05.getValue());
                        break;
                    }
                    throw new RuntimeException("Unknown starting fragment.");
                case -746371465:
                    if (str.equals("fragment_search")) {
                        boolean z = false;
                        if (C36971nu.A04 != null) {
                            z = true;
                        }
                        if (!z) {
                            throw new RuntimeException("Explore fragment not available!");
                        }
                        C41181IKu c41181IKu = (C41181IKu) AbstractC77423dS.A00().A01.getValue();
                        InterfaceC09390do interfaceC09390do2 = this.A05;
                        C14360o3.A0B((UserSession) interfaceC09390do2.getValue(), 0);
                        c59952od = c41181IKu.A00(0);
                        AbstractC60902qE.A00(c59952od, (UserSession) interfaceC09390do2.getValue());
                        break;
                    }
                    throw new RuntimeException("Unknown starting fragment.");
                case 354534074:
                    if (str.equals("fragment_profile")) {
                        C28431Ze c28431Ze = AbstractC31364DqT.A03().A01;
                        InterfaceC09390do interfaceC09390do3 = this.A05;
                        UserSession userSession4 = (UserSession) interfaceC09390do3.getValue();
                        C31368DqX A002 = AbstractC31402Dr6.A00((UserSession) interfaceC09390do3.getValue(), "tab_button", "ig_tab_host");
                        A002.A0V = true;
                        c59952od = c28431Ze.A02(userSession4, A002.A03());
                        AbstractC60902qE.A00(c59952od, (UserSession) interfaceC09390do3.getValue());
                        break;
                    }
                    throw new RuntimeException("Unknown starting fragment.");
                case 1600254799:
                    if (str.equals("fragment_panel_camera")) {
                        AbstractC69933Cc.A01();
                        c59952od = new C207549Gh();
                        AbstractC60902qE.A00(c59952od, (UserSession) this.A05.getValue());
                        break;
                    }
                    throw new RuntimeException("Unknown starting fragment.");
                case 1636420627:
                    if (str.equals("fragment_panel_direct")) {
                        c59952od = C28531Zo.A04.A02.A09(null, null, false);
                        AbstractC60902qE.A00(c59952od, (UserSession) this.A05.getValue());
                        break;
                    }
                    throw new RuntimeException("Unknown starting fragment.");
                case 1926909838:
                    if (str.equals("fragment_direct_tab")) {
                        C28501Zl c28501Zl = C28531Zo.A04.A02;
                        InterfaceC09390do interfaceC09390do4 = this.A05;
                        UserSession userSession5 = (UserSession) interfaceC09390do4.getValue();
                        C14360o3.A0B(userSession5, 0);
                        c59952od = c28501Zl.A09(null, userSession5.token, true);
                        AbstractC60902qE.A00(c59952od, (UserSession) interfaceC09390do4.getValue());
                        break;
                    }
                    throw new RuntimeException("Unknown starting fragment.");
                default:
                    throw new RuntimeException("Unknown starting fragment.");
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-383240891);
            }
            return c59952od;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(437285882);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, (com.instagram.common.session.UserSession) r17.A05.getValue(), 36327735332977476L) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(boolean r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60412pP.A01(boolean):void");
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A03;
        if (viewOnTouchListenerC60632pm == null) {
            C14360o3.A0F("scrollableNavigationHelper");
            throw C00O.createAndThrow();
        }
        return viewOnTouchListenerC60632pm;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A05.getValue();
        FragmentActivity activity = getActivity();
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        InterfaceC08430c6 A0O = childFragmentManager.A0O(R.id.layout_container_main);
        if (((A0O instanceof InterfaceC60072op) && ((InterfaceC60072op) A0O).onBackPressed()) || !C06P.A01(childFragmentManager)) {
            return true;
        }
        C55772hI.A00(abstractC12990ll).A09(activity, "back");
        return childFragmentManager.A12();
    }

    public final Fragment A02() {
        if (!isAdded()) {
            return null;
        }
        return getChildFragmentManager().A0O(R.id.layout_container_main);
    }

    public final boolean A03() {
        Fragment A02 = A02();
        if (A02 instanceof C60412pP) {
            return ((C60412pP) A02).A03();
        }
        return false;
    }

    @Override // X.InterfaceC60452pT
    public final boolean CJv(int i, KeyEvent keyEvent) {
        InterfaceC08430c6 A0O = getChildFragmentManager().A0O(R.id.layout_container_main);
        if ((A0O instanceof InterfaceC60452pT) && ((InterfaceC60452pT) A0O).CJv(i, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        InterfaceC08430c6 A00 = AbstractC60542pd.A00(getChildFragmentManager());
        if ((A00 instanceof InterfaceC60132ov) && ((InterfaceC60132ov) A00).CcV()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60182p1
    public final boolean ECu() {
        InterfaceC08430c6 A02 = A02();
        if (A02 instanceof InterfaceC60182p1) {
            return ((InterfaceC60182p1) A02).ECu();
        }
        return false;
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        InterfaceC08430c6 A02 = A02();
        if (A02 instanceof InterfaceC60092or) {
            ((InterfaceC60092or) A02).EMT();
        }
    }

    @Override // X.InterfaceC60102os
    public final void EU2(Bundle bundle) {
        InterfaceC08430c6 A0Q = getChildFragmentManager().A0Q(this.A01);
        this.A02 = bundle;
        if (A0Q instanceof InterfaceC60102os) {
            ((InterfaceC60102os) A0Q).EU2(bundle);
        } else if (this.A00 != EnumC60652po.A02) {
            return;
        }
        this.A02 = null;
    }

    @Override // X.InterfaceC60192p2
    public final void F8W() {
        InterfaceC08430c6 A02 = A02();
        if (A02 instanceof InterfaceC60192p2) {
            ((InterfaceC60192p2) A02).F8W();
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        Fragment A02 = A02();
        if (A02 != null && A02.isVisible()) {
            AbstractC60542pd.A02(requireActivity(), getChildFragmentManager());
            this.A04 = true;
        }
    }

    @Override // X.InterfaceC60042om
    public final boolean getCanShowVoiceMessageBar() {
        InterfaceC60042om interfaceC60042om;
        InterfaceC08430c6 A02 = A02();
        if ((A02 instanceof InterfaceC60042om) && (interfaceC60042om = (InterfaceC60042om) A02) != null) {
            return interfaceC60042om.getCanShowVoiceMessageBar();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[RETURN] */
    @Override // X.InterfaceC11380iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getModuleName() {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.A02()
            if (r0 == 0) goto Ld
            X.0iw r0 = (X.InterfaceC11380iw) r0
            java.lang.String r0 = r0.getModuleName()
            return r0
        Ld:
            java.lang.String r1 = r2.A01
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -869920652: goto L5c;
                case -859263443: goto L51;
                case -859024542: goto L46;
                case -746371465: goto L3b;
                case 354534074: goto L30;
                case 1926909838: goto L25;
                default: goto L19;
            }
        L19:
            java.lang.String r0 = "Should call on instantiated fragment instead: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L25:
            java.lang.String r0 = "fragment_direct_tab"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L19
            java.lang.String r0 = "direct_inbox"
            return r0
        L30:
            java.lang.String r0 = "fragment_profile"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L19
            java.lang.Integer r0 = X.C05F.A0j
            goto L66
        L3b:
            java.lang.String r0 = "fragment_search"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L19
            java.lang.Integer r0 = X.C05F.A0Y
            goto L66
        L46:
            java.lang.String r0 = "fragment_news"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L19
            java.lang.Integer r0 = X.C05F.A01
            goto L66
        L51:
            java.lang.String r0 = "fragment_feed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L19
            java.lang.String r0 = "feed_timeline"
            return r0
        L5c:
            java.lang.String r0 = "fragment_clips"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L19
            java.lang.Integer r0 = X.C05F.A15
        L66:
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L80;
                case 2: goto L6d;
                case 3: goto L6d;
                case 4: goto L7d;
                case 5: goto L7a;
                case 6: goto L77;
                case 7: goto L74;
                default: goto L6d;
            }
        L6d:
            r0 = 2689(0xa81, float:3.768E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            return r0
        L74:
            java.lang.String r0 = "main_clips"
            return r0
        L77:
            java.lang.String r0 = "shopping"
            return r0
        L7a:
            java.lang.String r0 = "main_profile"
            return r0
        L7d:
            java.lang.String r0 = "main_search"
            return r0
        L80:
            java.lang.String r0 = "main_inbox"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60412pP.getModuleName():java.lang.String");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException th;
        int i;
        Serializable serializable;
        int A02 = C0f9.A02(300193358);
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgTabHostFragment.onCreate", -1067439695);
        }
        try {
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null && bundle2.containsKey("TAB_FRAGMENT_TAG")) {
                this.A01 = requireArguments().getString("TAB_FRAGMENT_TAG");
            }
            if (this.A01 != null) {
                if (Systrace.A0E(1L)) {
                    C0fO.A01("IgTabHostFragment.super.onCreate", 1150412741);
                }
                try {
                    super.onCreate(bundle);
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1810779294);
                    }
                    int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                    this.A03 = AbstractC60622pl.A00(requireContext(), null, false);
                    getChildFragmentManager().A0r(this.A06);
                    Bundle bundle3 = this.mArguments;
                    if (bundle != null) {
                        serializable = bundle.getSerializable("KEY_TAB_HOST_FRAGMENT_LOADING_STATE");
                    } else {
                        serializable = null;
                    }
                    EnumC60652po enumC60652po = (EnumC60652po) serializable;
                    if (enumC60652po == null) {
                        if (bundle3 != null && bundle3.getBoolean("DELAY_FRAGMENT_LOADING")) {
                            enumC60652po = EnumC60652po.A03;
                        } else {
                            enumC60652po = EnumC60652po.A05;
                        }
                    }
                    this.A00 = enumC60652po;
                    if (enumC60652po == EnumC60652po.A05) {
                        A01(false);
                    }
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1160451869);
                    }
                    C0f9.A09(-605862155, A02);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1859142868);
                    }
                    i = 1122039945;
                }
            } else {
                th = new IllegalStateException("Unknown starting fragment.");
                i = 376110890;
            }
            C0f9.A09(i, A02);
            throw th;
        } catch (Throwable th3) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1985292770);
            }
            C0f9.A09(-217755263, A02);
            throw th3;
        }
    }

    @Override // X.AbstractC60422pQ, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(2133770767);
        super.onDestroy();
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        childFragmentManager.A0F.remove(this.A06);
        C0f9.A09(-1632351873, A02);
    }

    @Override // X.AbstractC60422pQ, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1956949513);
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgTabHostFragment.onResume", 1668549896);
        }
        try {
            super.onResume();
            EnumC60652po enumC60652po = this.A00;
            if (enumC60652po == EnumC60652po.A03) {
                this.A00 = EnumC60652po.A06;
            } else if (enumC60652po == EnumC60652po.A06) {
                A01(true);
                AbstractC60542pd.A04(requireActivity(), getChildFragmentManager(), (UserSession) this.A05.getValue());
            }
            if (!C18U.A06(C06090Tz.A05, (UserSession) this.A05.getValue(), 36326614346381309L) && !this.A04) {
                AbstractC60542pd.A02(requireActivity(), getChildFragmentManager());
                this.A04 = true;
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(749833873);
            }
            C0f9.A09(1460232513, A02);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1330989948);
            }
            C0f9.A09(1363833229, A02);
            throw th;
        }
    }
}
