package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HCV extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60682pr, InterfaceC60072op, JI1, InterfaceC60122ou, C38N, JGY {
    public static final String __redex_internal_original_name = "FeaturedProductsMediaFeedGridFragment";
    public InterfaceC70513Em A00;
    public RecyclerView A01;
    public RefreshableNestedScrollingParent A02;
    public final InterfaceC09390do A0A = J8Y.A00(this, 14);
    public final InterfaceC41501vz A0H = C37816GkW.A00(this, 30);
    public final InterfaceC09390do A0F = J8Y.A00(this, 18);
    public final InterfaceC09390do A0B = J8Y.A00(this, 15);
    public final InterfaceC09390do A08 = J8Y.A00(this, 12);
    public final InterfaceC09390do A0E = J8Y.A00(this, 17);
    public final C38U A03 = C38U.A00;
    public final InterfaceC09390do A09 = J8Y.A00(this, 13);
    public final InterfaceC09390do A06 = J8Y.A00(this, 10);
    public final InterfaceC09390do A07 = J8Y.A00(this, 11);
    public final InterfaceC09390do A0C = J8Y.A00(this, 16);
    public final InterfaceC09390do A0G = J8Y.A00(this, 19);
    public final List A04 = AbstractC166987dD.A1E();
    public final Map A05 = AbstractC166987dD.A1I();
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);

    @Override // X.C38N
    public final void DJj(View view, C38321qM c38321qM, int i) {
        C14360o3.A0B(c38321qM, 0);
        InterfaceC09390do interfaceC09390do = this.A0D;
        C99114cY A00 = AbstractC99104cX.A00(AbstractC166987dD.A0r(interfaceC09390do));
        List list = this.A04;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (((C3XG) obj).A06 == C1XV.A0d) {
                A1E.add(obj);
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            InterfaceC38381qS interfaceC38381qS = AbstractC37300Gc1.A0D(it).A05;
            C14360o3.A0C(interfaceC38381qS, AbstractC111324zv.A00(37));
            if (interfaceC38381qS != null) {
                A1E2.add(interfaceC38381qS);
            }
        }
        A00.A00(AbstractC001800i.A0j(A1E2));
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity requireActivity = requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A08;
        String str = AbstractC37303Gc4.A0F(interfaceC09390do2).A06;
        String str2 = AbstractC37303Gc4.A0F(interfaceC09390do2).A00;
        String str3 = AbstractC37303Gc4.A0F(interfaceC09390do2).A04;
        String str4 = AbstractC37300Gc1.A0I(this.A0E).A01.A03.A07;
        ArrayList A1E3 = AbstractC166987dD.A1E();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC37304Gc5.A1S(A1E3, it2);
        }
        String id = c38321qM.getId();
        if (id != null) {
            c1xj.A0y(requireActivity, A0r, this, (ProductDetailsPageLoggingInfo) this.A0B.getValue(), str, str2, str3, str4, id, null, AbstractC25225BEi.A15(this.A0F), A1E3);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_media_grid";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A02;
        String str = "refreshableContainer";
        if (refreshableNestedScrollingParent != null) {
            AbstractC37304Gc5.A1R(refreshableNestedScrollingParent);
            InterfaceC09390do interfaceC09390do = this.A0D;
            this.A00 = AbstractC1571573u.A01(view, AbstractC166987dD.A0r(interfaceC09390do), new J1N(this, 4));
            RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.A02;
            if (refreshableNestedScrollingParent2 != null) {
                RecyclerView A08 = AbstractC31180DnO.A08(refreshableNestedScrollingParent2);
                FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext(), 3);
                ((GridLayoutManager) fastScrollingGridLayoutManager).A01 = new C37922GmJ(this, 3);
                A08.setLayoutManager(fastScrollingGridLayoutManager);
                InterfaceC09390do interfaceC09390do2 = this.A06;
                AbstractC37304Gc5.A10(A08, interfaceC09390do2);
                AbstractC37304Gc5.A0y(A08.A0D, A08, new C42508Irn(this, 6), C153146ui.A0D);
                this.A01 = A08;
                if (getScrollingViewProxy() instanceof C3FR) {
                    boolean A1b = AbstractC37304Gc5.A1b(interfaceC09390do);
                    String A00 = AbstractC111324zv.A00(70);
                    C3FQ scrollingViewProxy = getScrollingViewProxy();
                    C14360o3.A0C(scrollingViewProxy, A00);
                    C3FR c3fr = (C3FR) scrollingViewProxy;
                    if (A1b) {
                        InterfaceC70513Em interfaceC70513Em = this.A00;
                        str = "pullToRefresh";
                        if (interfaceC70513Em != null) {
                            C42082Ikp.A00(c3fr, (C71094Wnq) interfaceC70513Em, this, 5);
                            InterfaceC70513Em interfaceC70513Em2 = this.A00;
                            if (interfaceC70513Em2 != null) {
                                interfaceC70513Em2.ARj();
                            }
                        }
                    } else {
                        c3fr.Ehc(new J3Z(this));
                    }
                }
                ((HEY) interfaceC09390do2.getValue()).A01();
                C42882Ixw.A00(this.A09);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.JI1
    public final C25621Ms Ac9() {
        C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC166987dD.A0o(this.A0D));
        InterfaceC09390do interfaceC09390do = this.A08;
        A0M.A0B(AbstractC37303Gc4.A0F(interfaceC09390do).A00);
        A0M.A9s("merchant_id", AbstractC37303Gc4.A0F(interfaceC09390do).A04);
        A0M.A0R(HB5.class, IQK.class);
        return A0M;
    }

    @Override // X.JI1
    public final void Dlr(AbstractC115105If abstractC115105If, boolean z) {
        InterfaceC70513Em interfaceC70513Em = this.A00;
        if (interfaceC70513Em == null) {
            C14360o3.A0F("pullToRefresh");
            throw C00O.createAndThrow();
        }
        interfaceC70513Em.setIsLoading(false);
        C42882Ixw.A00(this.A09);
        HEY.A00(this);
        AbstractC37304Gc5.A0w(this);
    }

    @Override // X.JI1
    public final void Dls() {
        C42882Ixw.A00(this.A09);
        HEY.A00(this);
    }

    @Override // X.JI1
    public final /* bridge */ /* synthetic */ void Dlt(InterfaceC74303Vl interfaceC74303Vl, boolean z, boolean z2) {
        HB5 hb5 = (HB5) interfaceC74303Vl;
        C14360o3.A0B(hb5, 0);
        InterfaceC70513Em interfaceC70513Em = this.A00;
        if (interfaceC70513Em == null) {
            C14360o3.A0F("pullToRefresh");
            throw C00O.createAndThrow();
        }
        interfaceC70513Em.setIsLoading(false);
        if (z) {
            this.A04.clear();
        }
        if (hb5.A05 == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "Received null FeedItem list from MediaFeedResponse payload on IG Shopping featured product Grid Fragment", 817903268);
        }
        List list = hb5.A05;
        if (list != null) {
            this.A04.addAll(list);
        }
        ((HEY) this.A06.getValue()).A02(A00());
        C42882Ixw.A00(this.A09);
        AbstractC37304Gc5.A1U(this.A07);
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        C3FQ A00 = C3FN.A00(recyclerView);
        C14360o3.A07(A00);
        return A00;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // X.JI1
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N(this.A04.size());
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return ((AnonymousClass308) this.A0C.getValue()).onBackPressed();
    }

    private final ArrayList A00() {
        Object obj;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            C3XG A0D = AbstractC37300Gc1.A0D(it);
            int ordinal = A0D.A06.ordinal();
            if (ordinal != 1) {
                if (ordinal == 33) {
                    obj = A0D.A05;
                    C14360o3.A0C(obj, AbstractC111324zv.A00(37));
                    A1E.add(obj);
                }
            } else {
                obj = AbstractC37300Gc1.A0E(A0D);
                if (obj != null) {
                    A1E.add(obj);
                }
            }
        }
        return A1E;
    }

    @Override // X.C38N
    public final boolean DJk(MotionEvent motionEvent, View view, InterfaceC38411qV interfaceC38411qV, int i) {
        AbstractC167027dH.A12(view, motionEvent, interfaceC38411qV);
        return ((AnonymousClass308) this.A0C.getValue()).DuC(motionEvent, view, interfaceC38411qV, i);
    }

    @Override // X.JGY
    public final void FAt() {
        HEY.A00(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(AbstractC37303Gc4.A0F(this.A08).A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C38535Gww c38535Gww;
        int A02 = C0f9.A02(746452643);
        super.onCreate(bundle);
        List list = AbstractC37303Gc4.A0F(this.A08).A07;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C38321qM A0F = AbstractC37304Gc5.A0F(AbstractC166987dD.A1B(it), this.A0D);
                if (A0F != null) {
                    this.A04.add(C3XH.A01(A0F));
                }
            }
        }
        if (!this.A04.isEmpty()) {
            ((HEY) this.A06.getValue()).A02(A00());
        } else {
            AbstractC37300Gc1.A0I(this.A0E).A01(true, false);
        }
        AbstractC37304Gc5.A1K(this, this.A0A);
        AbstractC37304Gc5.A1J(this, this.A07);
        AbstractC37304Gc5.A1J(this, this.A0C);
        AbstractC31176DnK.A0Q(this.A0D).A01(this.A0H, C42228InE.class);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(this.A0G), "instagram_shopping_media_grid_entry");
        C38B A06 = AbstractC37304Gc5.A06(this);
        AbstractC37300Gc1.A0w(A06, requireArguments().getString("prior_submodule_name"));
        AbstractC37302Gc3.A0u(A0f, A06, AbstractC25225BEi.A15(this.A0F));
        ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo = (ProductDetailsPageLoggingInfo) this.A0B.getValue();
        if (productDetailsPageLoggingInfo != null) {
            c38535Gww = productDetailsPageLoggingInfo.A00();
        } else {
            c38535Gww = null;
        }
        A0f.AAQ(c38535Gww, "pdp_logging_info");
        A0f.Cht();
        C0f9.A09(293679993, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View A05;
        View view;
        int A02 = C0f9.A02(-609716038);
        C14360o3.A0B(layoutInflater, 0);
        if (AbstractC37304Gc5.A1b(this.A0D)) {
            A05 = layoutInflater.inflate(R.layout.layout_swipe_refresh_hscroll_recyclerview, viewGroup, false);
            view = A05.findViewById(R.id.refreshable_container);
        } else {
            A05 = AbstractC37304Gc5.A05(layoutInflater, viewGroup, R.layout.layout_refreshable_recyclerview);
            view = A05;
        }
        this.A02 = (RefreshableNestedScrollingParent) view;
        C14360o3.A0A(A05);
        C0f9.A09(-351631623, A02);
        return A05;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1380924713);
        super.onDestroy();
        AbstractC37304Gc5.A1M(this, this.A0A);
        AbstractC37304Gc5.A1L(this, this.A07);
        AbstractC37304Gc5.A1L(this, this.A0C);
        AbstractC31176DnK.A0Q(this.A0D).A02(this.A0H, C42228InE.class);
        C0f9.A09(-470494485, A02);
    }
}
