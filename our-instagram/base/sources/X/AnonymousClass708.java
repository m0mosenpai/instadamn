package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.708, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass708 implements InterfaceC60602pj, AnonymousClass709, C70A, C70B {
    public C53I A00;
    public final FragmentActivity A01;
    public final BusinessFlowAnalyticsLogger A02;
    public final InterfaceC11380iw A03;
    public final C18920wW A04;
    public final UserSession A05;
    public final InterfaceC60442pS A06;
    public final EnumC906041v A07;
    public final C155636ys A08;
    public final C155476ya A09;
    public final C152336tJ A0A;
    public final C156296zz A0B;
    public final C70D A0C;
    public final C156096zd A0D;
    public final UserDetailFragment A0E;
    public final C70C A0F;
    public final UserDetailTabController A0G;
    public final MUB A0H;
    public final C37494GfC A0I;
    public final UserDetailLaunchConfig A0J;
    public final C154716xM A0K;
    public final C64842wi A0L;
    public final C38E A0M;
    public final InterfaceC53892dT A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final InterfaceC09390do A0V;
    public final InterfaceC09390do A0W;
    public final InterfaceC09390do A0X;
    public final InterfaceC09390do A0Y;
    public final InterfaceC09390do A0Z;
    public final InterfaceC09390do A0a;
    public final InterfaceC09390do A0b;
    public final InterfaceC09390do A0c;
    public final InterfaceC09390do A0d;
    public final InterfaceC09390do A0e;
    public final InterfaceC09390do A0f;
    public final InterfaceC09390do A0g;
    public final InterfaceC09390do A0h;
    public final boolean A0i;
    public final InterfaceC41501vz A0j;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        AbstractC25651Mw.A00(this.A05).A01(this.A0j, C71G.class);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.AnonymousClass709
    public final InterfaceC151446rm BhX() {
        return (C151436rl) this.A0Y.getValue();
    }

    @Override // X.C70A
    public final AnonymousClass741 BiC() {
        return (AnonymousClass740) this.A0c.getValue();
    }

    @Override // X.C70B
    public final InterfaceC1570073e BxR() {
        return (C1569973d) this.A0e.getValue();
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        AbstractC25651Mw.A00(this.A05).A02(this.A0j, C71G.class);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        try {
            FragmentActivity fragmentActivity = this.A01;
            C1OU c1ou = C1OU.$redex_init_class;
            C3M4 A05 = C3M4.A05(fragmentActivity);
            if (A05 != null) {
                A05.A0T();
            }
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("activity: ");
            sb.append(this.A01);
            C0w9.A06("UserDetailDelegate#onPause NPE on ReelViewerAnimator#get but null check passed", sb.toString(), e);
        }
    }

    public AnonymousClass708(FragmentActivity fragmentActivity, BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, C684436h c684436h, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C155636ys c155636ys, C155476ya c155476ya, C152336tJ c152336tJ, C152326tI c152326tI, C156296zz c156296zz, C156096zd c156096zd, UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController, MUB mub, C70P c70p, C37494GfC c37494GfC, UserDetailLaunchConfig userDetailLaunchConfig, C154716xM c154716xM, C64842wi c64842wi, InterfaceC53892dT interfaceC53892dT, String str, String str2, String str3) {
        int i;
        String str4;
        EnumC906041v enumC906041v;
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(mub, 3);
        C14360o3.A0B(userDetailTabController, 4);
        C14360o3.A0B(userSession, 5);
        C14360o3.A0B(c684436h, 7);
        C14360o3.A0B(userDetailLaunchConfig, 12);
        C14360o3.A0B(c18920wW, 13);
        C14360o3.A0B(c64842wi, 17);
        C14360o3.A0B(c155476ya, 19);
        C14360o3.A0B(c155636ys, 25);
        this.A01 = fragmentActivity;
        this.A0E = userDetailFragment;
        this.A0H = mub;
        this.A0G = userDetailTabController;
        this.A05 = userSession;
        this.A0N = interfaceC53892dT;
        this.A0A = c152336tJ;
        this.A06 = interfaceC60442pS;
        this.A0J = userDetailLaunchConfig;
        this.A04 = c18920wW;
        this.A0K = c154716xM;
        this.A02 = businessFlowAnalyticsLogger;
        this.A0P = str;
        this.A0L = c64842wi;
        this.A0B = c156296zz;
        this.A09 = c155476ya;
        this.A0I = c37494GfC;
        this.A03 = interfaceC11380iw;
        this.A0T = str2;
        this.A0U = str3;
        this.A0D = c156096zd;
        this.A08 = c155636ys;
        if (C18U.A06(C06090Tz.A05, userSession, 2342156184607262523L)) {
            i = -1;
        } else {
            i = 60574;
        }
        this.A0M = new C38E(userDetailFragment, userSession, new C38C(userDetailFragment, i));
        this.A0O = userDetailLaunchConfig.A0C;
        InterfaceC38371qR interfaceC38371qR = userDetailFragment.A0M;
        String id = interfaceC38371qR != null ? interfaceC38371qR.BQN().getId() : null;
        this.A0Q = id;
        InterfaceC38371qR interfaceC38371qR2 = userDetailFragment.A0M;
        if (interfaceC38371qR2 != null) {
            str4 = interfaceC38371qR2.BQN().CAR();
        } else {
            str4 = null;
        }
        this.A0S = str4;
        this.A0R = userDetailFragment.A0k();
        AndroidLink A02 = AbstractC905941u.A02(userDetailFragment.requireContext(), userDetailFragment.A0I, userDetailFragment.A0M, userDetailFragment.A00, false);
        if (A02 != null) {
            enumC906041v = AbstractC114965Hm.A01(A02);
        } else {
            enumC906041v = null;
        }
        this.A07 = enumC906041v;
        this.A0i = userDetailLaunchConfig.A0W;
        this.A0F = new C70C(fragmentActivity, userSession, interfaceC53892dT);
        this.A0C = new C70D(userDetailFragment.requireContext(), fragmentActivity, userDetailFragment, c684436h, userSession, interfaceC60442pS, c152336tJ, c152326tI, c70p, mub.A03, mub.A02(), id, str4, userDetailFragment.A10.A0C.A00);
        this.A0j = new InterfaceC41501vz() { // from class: X.70E
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(2067750803);
                C71G c71g = (C71G) obj;
                int A032 = C0f9.A03(-953524784);
                C14360o3.A0B(c71g, 0);
                ((AnonymousClass740) AnonymousClass708.this.A0c.getValue()).D3u(FollowStatus.A08, c71g.A00);
                C0f9.A0A(2087883951, A032);
                C0f9.A0A(-2025889589, A03);
            }
        };
        this.A0V = AbstractC09440dt.A01(new C9F7(4, c70p, this));
        this.A0g = AbstractC09440dt.A01(new C9EY(this, 43));
        this.A0a = AbstractC09440dt.A01(new C9EY(this, 37));
        this.A0W = AbstractC09440dt.A01(new C9EY(this, 33));
        this.A0X = AbstractC09440dt.A01(new C9EY(this, 34));
        this.A0Z = AbstractC09440dt.A01(new C9EY(this, 36));
        this.A0d = AbstractC09440dt.A01(new C9EY(this, 40));
        this.A0e = AbstractC09440dt.A01(new C9EY(this, 41));
        this.A0c = AbstractC09440dt.A01(new C9EY(this, 39));
        this.A0Y = AbstractC09440dt.A01(new C9EY(this, 35));
        this.A0h = AbstractC09440dt.A01(new C9EY(this, 44));
        this.A0b = AbstractC09440dt.A01(new C9EY(this, 38));
        this.A0f = AbstractC09440dt.A01(new C9EY(this, 42));
    }
}
