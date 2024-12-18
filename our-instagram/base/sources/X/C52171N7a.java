package X;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* renamed from: X.N7a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52171N7a extends AbstractC60672pq implements InterfaceC62602sz, InterfaceC60442pS, InterfaceC60072op, InterfaceC62612t0, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BrandedContentNotificationFragment";
    public C52200N8p A00;
    public GAJ A01;
    public C64842wi A02;
    public C57112jm A03;
    public C65953Twy A04;
    public C154796xU A05;
    public EmptyStateView A06;
    public final int A08 = 8;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final InterfaceC41501vz A09 = new C56026Otx(this, 1);

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A00(this, false);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle(BJG.A02.A01(requireContext(), null));
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A00();
        AbstractC31176DnK.A1C(new ViewOnClickListenerC55467OkM(this, 45), A0B, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "branded_content_activity";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EmptyStateView emptyStateView = (EmptyStateView) view.requireViewById(R.id.empty);
        this.A06 = emptyStateView;
        if (emptyStateView == null) {
            str = "emptyStateView";
        } else {
            EnumC153216up enumC153216up = EnumC153216up.A04;
            emptyStateView.A0R(enumC153216up, com.facebook.R.drawable.loadmore_icon_refresh_compound);
            EnumC153216up enumC153216up2 = EnumC153216up.A02;
            emptyStateView.A0R(enumC153216up2, com.facebook.R.drawable.instagram_media_account_outline_96);
            emptyStateView.A0T(enumC153216up2, 2131966875);
            emptyStateView.A0S(enumC153216up2, 2131966868);
            emptyStateView.A0N(new ViewOnClickListenerC55467OkM(this, 46), enumC153216up);
            emptyStateView.A0I();
            RecyclerView recyclerView = getRecyclerView();
            C65953Twy c65953Twy = this.A04;
            if (c65953Twy == null) {
                str = "autoLoadMoreHelper";
            } else {
                recyclerView.A14(c65953Twy);
                getRecyclerView().setImportantForAccessibility(1);
                ((C3FR) getScrollingViewProxy()).Ehc(new PLQ(this));
                A00(this, true);
                C64842wi c64842wi = this.A02;
                if (c64842wi == null) {
                    str = "quickPromotionDelegate";
                } else {
                    c64842wi.DiZ();
                    C57112jm c57112jm = this.A03;
                    if (c57112jm == null) {
                        str = "viewpointManager";
                    } else {
                        c57112jm.A08(getRecyclerView(), C71163Hc.A00(this), new InterfaceC57142jp[0]);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(C52171N7a c52171N7a, boolean z) {
        C154796xU c154796xU = c52171N7a.A05;
        if (c154796xU == null) {
            C14360o3.A0F("feedNetworkSource");
            throw C00O.createAndThrow();
        }
        AbstractC12990ll A0o = AbstractC166987dD.A0o(c52171N7a.A07);
        C14360o3.A0B(A0o, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(A0o);
        A0M.A0B("business/branded_content/news/inbox/");
        c154796xU.A03(AbstractC25227BEk.A0e(A0M, N3T.class, OO5.class), new C68044V7w(0, c52171N7a, z));
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        C154796xU c154796xU = this.A05;
        if (c154796xU == null) {
            C14360o3.A0F("feedNetworkSource");
            throw C00O.createAndThrow();
        }
        if (c154796xU.A06()) {
            A00(this, false);
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        if (this.A00 == null) {
            C14360o3.A0F("listAdapter");
            throw C00O.createAndThrow();
        }
        return !r0.isEmpty();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        C154796xU c154796xU = this.A05;
        if (c154796xU == null) {
            C14360o3.A0F("feedNetworkSource");
            throw C00O.createAndThrow();
        }
        return c154796xU.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        C154796xU c154796xU = this.A05;
        if (c154796xU == null) {
            C14360o3.A0F("feedNetworkSource");
            throw C00O.createAndThrow();
        }
        return AbstractC167007dF.A1X(c154796xU.A03.A03, C05F.A01);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        C154796xU c154796xU = this.A05;
        if (c154796xU == null) {
            C14360o3.A0F("feedNetworkSource");
            throw C00O.createAndThrow();
        }
        return AbstractC167007dF.A1X(c154796xU.A03.A03, C05F.A00);
    }

    public static final void A01(C52171N7a c52171N7a, boolean z) {
        if (c52171N7a.isLoading()) {
            EmptyStateView emptyStateView = c52171N7a.A06;
            if (emptyStateView != null) {
                emptyStateView.A0L();
                return;
            }
        } else if (c52171N7a.CUG()) {
            EmptyStateView emptyStateView2 = c52171N7a.A06;
            if (emptyStateView2 != null) {
                emptyStateView2.A0J();
                return;
            }
        } else {
            EmptyStateView emptyStateView3 = c52171N7a.A06;
            if (z) {
                if (emptyStateView3 != null) {
                    emptyStateView3.A0P(EnumC153216up.A02);
                    return;
                }
            } else if (emptyStateView3 != null) {
                emptyStateView3.A0K();
                return;
            }
        }
        C14360o3.A0F("emptyStateView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (isLoading() && !CL7()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!getParentFragmentManager().A11()) {
            getParentFragmentManager().A12();
            return true;
        }
        return true;
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(329085572);
        super.onCreate(bundle);
        this.A03 = AbstractC31180DnO.A0N();
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A07;
        AbstractC1566271k.A0R(AbstractC166987dD.A0r(interfaceC09390do), requireActivity, "branded_content_activity");
        this.A05 = AbstractC37302Gc3.A0L(requireContext(), this, AbstractC166987dD.A0r(interfaceC09390do));
        this.A01 = new GAJ(requireContext(), requireActivity(), this, this, AbstractC166987dD.A0r(interfaceC09390do), this);
        C27961Xa A00 = AbstractC54912fq.A00();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0B;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        A0S.A04 = new P72(this, 2);
        A0S.A08 = new MUU(this, 2);
        this.A02 = AbstractC31175DnJ.A0T(this, A0r, A0S, A00, quickPromotionSlot);
        Context requireContext = requireContext();
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        GAJ gaj = this.A01;
        if (gaj == null) {
            str = "delegate";
        } else {
            C64842wi c64842wi = this.A02;
            if (c64842wi == null) {
                str = "quickPromotionDelegate";
            } else {
                this.A00 = new C52200N8p(requireContext, this, A0r2, gaj, c64842wi);
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                this.A04 = new C65953Twy(AbstractC166987dD.A0r(interfaceC09390do), this, C05F.A01, this.A08);
                C52200N8p c52200N8p = this.A00;
                if (c52200N8p == null) {
                    str = "listAdapter";
                } else {
                    setAdapter(c52200N8p);
                    AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A09, C55961Ost.class);
                    C0f9.A09(-572184328, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(612711760);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, com.facebook.R.layout.layout_refreshable_recyclerview_with_empty_state, false);
        C0f9.A09(-1366946992, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1446968617);
        super.onPause();
        AbstractC31176DnK.A0Q(this.A07).A02(this.A09, C55961Ost.class);
        C3M4 A05 = C1OU.A05(requireActivity());
        if (A05 != null) {
            A05.A0T();
        }
        C0f9.A09(1088747412, A02);
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManagerCompat(AbstractC31176DnK.A05(this, recyclerView)));
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(127552653);
        super.onResume();
        C3M4 A05 = C1OU.A05(requireActivity());
        if (A05 != null && A05.A0a()) {
            getRecyclerView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC55496Okp(this, 0));
        }
        C0f9.A09(1208065925, A02);
    }
}
