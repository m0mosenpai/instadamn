package com.instagram.wellbeing.reporting.common.impersonation;

import X.AbstractC018607g;
import X.AbstractC111324zv;
import X.AbstractC18680vv;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31179DnN;
import X.AbstractC31674Dvf;
import X.AbstractC43591JPw;
import X.AbstractC56402iY;
import X.AbstractC59962oe;
import X.AbstractC71170Wp5;
import X.C06090Tz;
import X.C0f9;
import X.C0w9;
import X.C18U;
import X.C22P;
import X.C31446Drq;
import X.C32608EXi;
import X.C33313Eo8;
import X.C36011Fv9;
import X.C36683GFd;
import X.C61972ry;
import X.C66362zD;
import X.C66392zG;
import X.C67844UzI;
import X.EXO;
import X.InterfaceC1119353f;
import X.InterfaceC132405yL;
import X.InterfaceC169357h9;
import X.InterfaceC169517hR;
import X.InterfaceC59992oh;
import X.VXP;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public class SelectVictimSearchBottomSheetFragment extends AbstractC59962oe implements InterfaceC132405yL, InterfaceC1119353f {
    public User A00;
    public AbstractC71170Wp5 A01;
    public C67844UzI A02;
    public String A03;
    public int A04;
    public int A05;
    public UserSession A06;
    public C36011Fv9 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public TouchInterceptorFrameLayout mTouchInterceptorFrameLayout;

    @Override // X.InterfaceC1119353f
    public final InterfaceC59992oh B8R() {
        return this;
    }

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void CkK(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void CkL(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC132405yL
    public final void D9q(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void DAs(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC132405yL
    public final void Dle(RectF rectF, View view, C31446Drq c31446Drq, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC132405yL
    public final void Dqk(View view, C31446Drq c31446Drq, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z) {
    }

    @Override // X.InterfaceC132405yL
    public final void Dql(RectF rectF, C22P c22p, DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC132405yL
    public final void Dqm(View view) {
    }

    @Override // X.InterfaceC1119353f
    public final void EK1() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "SELECT_VICTIM_SEARCH_BOTTOM_SHEET_FRAGMENT";
    }

    @Override // X.InterfaceC132405yL
    public final void Dld(C31446Drq c31446Drq, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, int i5) {
        SearchController searchController = this.A07.A02;
        if (searchController != null) {
            searchController.A00();
        }
        C67844UzI c67844UzI = this.A02;
        AbstractC71170Wp5 abstractC71170Wp5 = this.A01;
        if (abstractC71170Wp5 != null && c67844UzI != null && (directSearchResult instanceof DirectShareTarget)) {
            boolean z = this.A08;
            ((C33313Eo8) abstractC71170Wp5).A00.A01((DirectShareTarget) directSearchResult, c67844UzI, z, false);
        }
    }

    @Override // X.InterfaceC132405yL
    public final void DpP(C31446Drq c31446Drq, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        C0w9.A01.EmN("SelectVictimSearchBottomSheetFragment", "Story ring should not be accessible here.");
    }

    @Override // X.InterfaceC1119353f
    public final TouchInterceptorFrameLayout CA1() {
        return this.mTouchInterceptorFrameLayout;
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnResume() {
        super.afterOnResume();
        if (this.A09) {
            C36011Fv9 c36011Fv9 = this.A07;
            if (c36011Fv9.A01 == null) {
                Context context = c36011Fv9.A06;
                InterfaceC169357h9 A03 = AbstractC31674Dvf.A03(context, c36011Fv9.A09, new C61972ry(context, c36011Fv9.A07), "raven", "direct_user_search_nullstate", null, 0, 0, true, false);
                c36011Fv9.A01 = A03;
                C36683GFd c36683GFd = c36011Fv9.A00;
                if (c36683GFd != null) {
                    A03.EYJ(c36683GFd);
                }
            }
            SearchController searchController = c36011Fv9.A02;
            if (searchController != null) {
                searchController.A02(false, 0.0f);
            }
            this.A09 = false;
        }
        if (!AbstractC56402iY.A09()) {
            AbstractC31179DnN.A0t(this);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A06;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1813194331);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        this.A06 = AbstractC31176DnK.A0S(this);
        String string = bundle2.getString(AbstractC111324zv.A00(681));
        this.A08 = bundle2.getBoolean(AbstractC111324zv.A00(56), true);
        this.A05 = bundle2.getInt(AbstractC43591JPw.A00(63), 0);
        this.A0A = bundle2.getBoolean(AbstractC111324zv.A00(1585), true);
        this.A04 = bundle2.getInt(AbstractC111324zv.A00(308), 5);
        String str = this.A03;
        if (this.A08 && string != null && str != null) {
            VXP.A00(this.A06, bundle2.getBoolean(AbstractC111324zv.A00(682))).A00(this, this.A00, str, string);
        }
        C0f9.A09(986016452, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1566696466);
        this.mTouchInterceptorFrameLayout = new TouchInterceptorFrameLayout(requireContext());
        Context requireContext = requireContext();
        UserSession userSession = this.A06;
        C36011Fv9 c36011Fv9 = new C36011Fv9(requireContext, AbstractC018607g.A00(this), userSession, this, this, this.A05, this.A04, this.A0A);
        this.A07 = c36011Fv9;
        User user = this.A00;
        if (user != null) {
            c36011Fv9.A03 = user.getId();
        }
        C36011Fv9 c36011Fv92 = this.A07;
        FragmentActivity requireActivity = requireActivity();
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.mTouchInterceptorFrameLayout;
        C66392zG A00 = C66362zD.A00(requireActivity);
        InterfaceC132405yL interfaceC132405yL = c36011Fv92.A0A;
        UserSession userSession2 = c36011Fv92.A09;
        A00.A01(new C32608EXi(this, userSession2, interfaceC132405yL, "direct_user_search", C18U.A06(C06090Tz.A05, userSession2, 36314790302124857L)));
        Context context = c36011Fv92.A06;
        A00.A01(new EXO(context, c36011Fv92));
        A00.A01(new Object());
        AbstractC31177DnL.A1I(A00, new Object());
        C66362zD A002 = A00.A00();
        C36683GFd c36683GFd = new C36683GFd(context, c36011Fv92.A08, A002, userSession2, c36011Fv92.A04, c36011Fv92.A0B);
        c36011Fv92.A00 = c36683GFd;
        String str = c36011Fv92.A03;
        if (str != null) {
            c36683GFd.A01 = str;
        }
        SearchController searchController = new SearchController(requireActivity, touchInterceptorFrameLayout, A002, new LinearLayoutManager(requireActivity), userSession2, null, null, null, c36011Fv92, c36011Fv92.A05, 0L, false, false, false, false, false, false, false);
        c36011Fv92.A02 = searchController;
        searchController.A08 = false;
        registerLifecycleListener(searchController);
        this.A09 = true;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.mTouchInterceptorFrameLayout;
        C0f9.A09(734127425, A02);
        return touchInterceptorFrameLayout2;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC169517hR interfaceC169517hR;
        int A02 = C0f9.A02(2045939503);
        super.onDestroyView();
        this.mTouchInterceptorFrameLayout = null;
        C36011Fv9 c36011Fv9 = this.A07;
        if (c36011Fv9 != null && (interfaceC169517hR = c36011Fv9.A01) != null) {
            interfaceC169517hR.EYJ(null);
            interfaceC169517hR.DEw();
        }
        C0f9.A09(1429305090, A02);
    }
}
