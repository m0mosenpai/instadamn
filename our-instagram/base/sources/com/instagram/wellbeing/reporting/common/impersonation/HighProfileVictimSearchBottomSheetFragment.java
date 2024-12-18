package com.instagram.wellbeing.reporting.common.impersonation;

import X.AbstractC018607g;
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
import X.C32483ESj;
import X.C32608EXi;
import X.C33313Eo8;
import X.C36009Fv7;
import X.C66362zD;
import X.C66392zG;
import X.C67844UzI;
import X.EXO;
import X.InterfaceC1119353f;
import X.InterfaceC132405yL;
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
public class HighProfileVictimSearchBottomSheetFragment extends AbstractC59962oe implements InterfaceC132405yL, InterfaceC1119353f {
    public int A00;
    public int A01;
    public UserSession A02;
    public User A03;
    public C36009Fv7 A04;
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
        return "HIGH_PROFILE_VICTIM_SEARCH_BOTTOM_SHEET_FRAGMENT";
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
        C0w9.A01.EmN("HighProfileVictimSearchBottomSheetFragment", "Story ring should not be accessible here.");
    }

    @Override // X.InterfaceC1119353f
    public final TouchInterceptorFrameLayout CA1() {
        return this.mTouchInterceptorFrameLayout;
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnResume() {
        super.afterOnResume();
        if (this.A0A) {
            C36009Fv7 c36009Fv7 = this.A04;
            c36009Fv7.A04 = true;
            SearchController searchController = c36009Fv7.A01;
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
        int A02 = C0f9.A02(1540643210);
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
        this.A04 = new C36009Fv7(requireContext(), AbstractC018607g.A00(this), this.A02, this, this, AbstractC25231BEo.A0t(this.A03), this.A01, this.A00);
        String str = this.A08;
        String str2 = this.A07;
        if (this.A09 && str2 != null && str != null) {
            VXP.A00(this.A02, bundle2.getBoolean(AbstractC111324zv.A00(682))).A00(this, this.A03, str, str2);
        }
        C0f9.A09(-941301136, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1743043500);
        this.mTouchInterceptorFrameLayout = new TouchInterceptorFrameLayout(requireContext());
        C36009Fv7 c36009Fv7 = this.A04;
        FragmentActivity requireActivity = requireActivity();
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.mTouchInterceptorFrameLayout;
        C66392zG A00 = C66362zD.A00(requireActivity);
        InterfaceC132405yL interfaceC132405yL = c36009Fv7.A0A;
        UserSession userSession = c36009Fv7.A09;
        A00.A01(new C32608EXi(this, userSession, interfaceC132405yL, "direct_user_search", false));
        A00.A01(new Object());
        Context context = c36009Fv7.A08;
        AbstractC31177DnL.A1I(A00, new EXO(context, null));
        C66362zD A002 = A00.A00();
        c36009Fv7.A00 = A002;
        c36009Fv7.A02 = new C32483ESj(context, A002, userSession, c36009Fv7.A03);
        SearchController searchController = new SearchController(requireActivity, touchInterceptorFrameLayout, c36009Fv7.A00, new LinearLayoutManager(requireActivity), userSession, null, null, null, c36009Fv7, c36009Fv7.A07, 0L, false, false, false, false, false, false, false);
        c36009Fv7.A01 = searchController;
        searchController.A08 = false;
        registerLifecycleListener(searchController);
        this.A0A = true;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.mTouchInterceptorFrameLayout;
        C0f9.A09(-684296771, A02);
        return touchInterceptorFrameLayout2;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1723356771);
        super.onDestroyView();
        this.mTouchInterceptorFrameLayout = null;
        this.A04.A04 = false;
        C0f9.A09(1874666237, A02);
    }
}
