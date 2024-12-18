package com.instagram.wellbeing.reporting.common.impersonation;

import X.AbstractC111324zv;
import X.AbstractC18680vv;
import X.AbstractC25231BEo;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31179DnN;
import X.AbstractC43591JPw;
import X.AbstractC56402iY;
import X.AbstractC59962oe;
import X.AbstractC71170Wp5;
import X.C0f9;
import X.C0w9;
import X.C22P;
import X.C31446Drq;
import X.C32608EXi;
import X.C33313Eo8;
import X.C36008Fv6;
import X.C66362zD;
import X.C66392zG;
import X.C67844UzI;
import X.EXO;
import X.InterfaceC1119353f;
import X.InterfaceC132405yL;
import X.InterfaceC59992oh;
import X.VXP;
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
public class ConsolidatedProfileSearchBottomSheetFragment extends AbstractC59962oe implements InterfaceC132405yL, InterfaceC1119353f {
    public int A00;
    public int A01;
    public UserSession A02;
    public User A03;
    public C36008Fv6 A04;
    public AbstractC71170Wp5 A05;
    public C67844UzI A06;
    public String A07;
    public String A08;
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
        return "CONSOLIDATED_PROFILE_SEARCH_BOTTOM_SHEET_FRAGMENT";
    }

    @Override // X.InterfaceC132405yL
    public final void Dld(C31446Drq c31446Drq, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, int i5) {
        SearchController searchController = this.A04.A01;
        if (searchController != null) {
            searchController.A00();
        }
        C67844UzI c67844UzI = this.A06;
        AbstractC71170Wp5 abstractC71170Wp5 = this.A05;
        if (abstractC71170Wp5 != null && c67844UzI != null && (directSearchResult instanceof DirectShareTarget)) {
            boolean z = this.A09;
            ((C33313Eo8) abstractC71170Wp5).A00.A01((DirectShareTarget) directSearchResult, c67844UzI, z, false);
        }
    }

    @Override // X.InterfaceC132405yL
    public final void DpP(C31446Drq c31446Drq, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        C0w9.A01.EmN("ConsolidatedProfileSearchBottomSheetFragment", "Story ring should not be accessible here.");
    }

    @Override // X.InterfaceC1119353f
    public final TouchInterceptorFrameLayout CA1() {
        return this.mTouchInterceptorFrameLayout;
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnResume() {
        super.afterOnResume();
        if (this.A0A) {
            C36008Fv6 c36008Fv6 = this.A04;
            c36008Fv6.A02 = true;
            SearchController searchController = c36008Fv6.A01;
            if (searchController != null) {
                searchController.A02(false, 0.0f);
            }
            this.A0A = false;
        }
        if (!AbstractC56402iY.A09()) {
            AbstractC31179DnN.A0t(this);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1039955695);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        this.A06.getClass();
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A02 = A0S;
        A0S.getClass();
        this.A07 = AbstractC31173DnH.A0j(bundle2, AbstractC111324zv.A00(681));
        this.A09 = bundle2.getBoolean(AbstractC111324zv.A00(56));
        this.A01 = bundle2.getInt(AbstractC43591JPw.A00(63), 0);
        this.A00 = bundle2.getInt(AbstractC111324zv.A00(308), 5);
        this.A04 = new C36008Fv6(requireContext(), this.A02, this, this, AbstractC25231BEo.A0t(this.A03), this.A01, this.A00);
        String str = this.A08;
        String str2 = this.A07;
        if (this.A09 && str2 != null && str != null) {
            VXP.A00(this.A02, bundle2.getBoolean(AbstractC111324zv.A00(682))).A00(this, this.A03, str, str2);
        }
        C0f9.A09(876716923, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1512744373);
        this.mTouchInterceptorFrameLayout = new TouchInterceptorFrameLayout(requireContext());
        C36008Fv6 c36008Fv6 = this.A04;
        FragmentActivity requireActivity = requireActivity();
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.mTouchInterceptorFrameLayout;
        C66392zG A00 = C66362zD.A00(requireActivity);
        InterfaceC132405yL interfaceC132405yL = c36008Fv6.A07;
        UserSession userSession = c36008Fv6.A06;
        A00.A01(new C32608EXi(this, userSession, interfaceC132405yL, "direct_user_search", false));
        A00.A01(new Object());
        AbstractC31177DnL.A1I(A00, new EXO(c36008Fv6.A05, null));
        c36008Fv6.A00 = A00.A00();
        SearchController searchController = new SearchController(requireActivity, touchInterceptorFrameLayout, c36008Fv6.A00, new LinearLayoutManager(requireActivity), userSession, null, null, null, c36008Fv6, c36008Fv6.A04, 0L, false, false, false, false, false, false, false);
        c36008Fv6.A01 = searchController;
        searchController.A08 = false;
        registerLifecycleListener(searchController);
        this.A0A = true;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.mTouchInterceptorFrameLayout;
        C0f9.A09(1811346546, A02);
        return touchInterceptorFrameLayout2;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(923471580);
        super.onDestroyView();
        this.mTouchInterceptorFrameLayout = null;
        this.A04.A02 = false;
        C0f9.A09(-112877424, A02);
    }
}
