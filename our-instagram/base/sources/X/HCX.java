package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HCX extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60682pr, JI1, InterfaceC60122ou, JPp {
    public static final String __redex_internal_original_name = "FeaturedProductMediaFeedListFragment";
    public InterfaceC70513Em A00;
    public boolean A01;
    public RecyclerView A02;
    public RefreshableNestedScrollingParent A03;
    public final C57112jm A04;
    public final C61372qz A05;
    public final List A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B = C43209J8g.A01(this, 43);
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;

    @Override // X.JI1
    public final void Dls() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_media_contextual_feed";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0107, code lost:
    
        r6.EdZ(r2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010a, code lost:
    
        return;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HCX.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC43443JHh
    public final /* bridge */ /* synthetic */ void AAq(Object obj) {
        C09530e4 c09530e4 = (C09530e4) obj;
        C14360o3.A0B(c09530e4, 0);
        ((C41615Ib5) this.A0P.getValue()).A01(c09530e4);
    }

    @Override // X.InterfaceC43443JHh
    public final /* bridge */ /* synthetic */ void AAr(Object obj, Object obj2) {
        ((C41615Ib5) this.A0P.getValue()).A01((C09530e4) obj);
    }

    @Override // X.JI1
    public final C25621Ms Ac9() {
        C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC166987dD.A0o(this.A0K));
        A0M.A0B(AbstractC25225BEi.A15(this.A08));
        A0M.A9s("merchant_id", AbstractC25225BEi.A15(this.A0F));
        A0M.A0R(C74293Vk.class, C74313Vm.class);
        return A0M;
    }

    @Override // X.JGN
    public final void Dhl(C38818H7j c38818H7j) {
        ProductDetailsProductItemDict productDetailsProductItemDict = c38818H7j.A01;
        if (productDetailsProductItemDict != null) {
            C1XJ c1xj = C1XJ.A00;
            FragmentActivity requireActivity = requireActivity();
            Product A01 = AbstractC38048Gob.A01(productDetailsProductItemDict);
            C42130Ile.A01(c1xj.A0L(requireActivity, AbstractC166987dD.A0r(this.A0K), this, A01, AbstractC111324zv.A00(932), AbstractC25225BEi.A15(this.A0M)));
        }
    }

    @Override // X.JI1
    public final void Dlr(AbstractC115105If abstractC115105If, boolean z) {
        InterfaceC70513Em interfaceC70513Em = this.A00;
        if (interfaceC70513Em == null) {
            C14360o3.A0F("pullToRefresh");
            throw C00O.createAndThrow();
        }
        interfaceC70513Em.setIsLoading(false);
        AbstractC37304Gc5.A0w(this);
    }

    @Override // X.JI1
    public final /* bridge */ /* synthetic */ void Dlt(InterfaceC74303Vl interfaceC74303Vl, boolean z, boolean z2) {
        C74293Vk c74293Vk = (C74293Vk) interfaceC74303Vl;
        C14360o3.A0B(c74293Vk, 0);
        InterfaceC70513Em interfaceC70513Em = this.A00;
        if (interfaceC70513Em == null) {
            C14360o3.A0F("pullToRefresh");
            throw C00O.createAndThrow();
        }
        interfaceC70513Em.setIsLoading(false);
        if (z) {
            this.A06.clear();
        }
        List list = this.A06;
        List list2 = c74293Vk.A06;
        C14360o3.A07(list2);
        list.addAll(list2);
        C38978HEg c38978HEg = (C38978HEg) this.A07.getValue();
        C155946zO c155946zO = c38978HEg.A02;
        c155946zO.A04();
        c155946zO.A0B(list);
        c38978HEg.A00();
        AbstractC37304Gc5.A1U(this.A0E);
    }

    @Override // X.InterfaceC43443JHh
    public final /* bridge */ /* synthetic */ void EDu(View view, Object obj) {
        C09530e4 c09530e4 = (C09530e4) obj;
        C14360o3.A0B(c09530e4, 1);
        C41615Ib5 c41615Ib5 = (C41615Ib5) this.A0P.getValue();
        View view2 = this.mView;
        AbstractC167007dF.A1C(view2);
        AbstractC37304Gc5.A0u(view2, c41615Ib5.A00, c41615Ib5.A01, C41615Ib5.A00(c09530e4));
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        RecyclerView recyclerView = this.A02;
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
        return AbstractC166987dD.A0n(this.A0K);
    }

    @Override // X.JI1
    public final boolean isEmpty() {
        return ((C2UT) this.A07.getValue()).isEmpty();
    }

    public HCX() {
        C43209J8g c43209J8g = new C43209J8g(this, 41);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J8Y(new J8Y(this, 4), 5));
        this.A09 = AbstractC25225BEi.A0a(new J8Y(A00, 6), c43209J8g, C43208J8f.A00(null, A00, 0), AbstractC25225BEi.A1D(C61142qc.class));
        this.A0E = C43209J8g.A01(this, 46);
        this.A0D = C43209J8g.A01(this, 45);
        this.A0M = J8Y.A00(this, 3);
        this.A0G = C43209J8g.A01(this, 48);
        this.A0H = C43209J8g.A01(this, 49);
        this.A0N = J8Y.A00(this, 7);
        this.A08 = C43209J8g.A01(this, 40);
        this.A0F = C43209J8g.A01(this, 47);
        this.A0C = C43209J8g.A01(this, 44);
        this.A0J = J8Y.A00(this, 1);
        this.A0L = J8Y.A00(this, 2);
        this.A05 = new C61372qz();
        this.A0I = J8Y.A00(this, 0);
        this.A0A = C43209J8g.A01(this, 42);
        this.A0O = J8Y.A00(this, 8);
        this.A04 = C57112jm.A00();
        this.A0P = J8Y.A00(this, 9);
        this.A07 = C43209J8g.A01(this, 39);
        this.A06 = AbstractC166987dD.A1E();
        this.A0K = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(AbstractC25225BEi.A15(this.A0N));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C0Zx c0Zx;
        C38535Gww c38535Gww;
        int A02 = C0f9.A02(1405739050);
        super.onCreate(bundle);
        AbstractC37304Gc5.A1J(this, this.A0E);
        AbstractC37304Gc5.A1K(this, this.A0D);
        registerLifecycleListener((AnonymousClass396) this.A0A.getValue());
        AbstractCollection abstractCollection = (AbstractCollection) this.A0C.getValue();
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                C38321qM A0F = AbstractC37304Gc5.A0F(AbstractC166987dD.A1B(it), this.A0K);
                if (A0F != null) {
                    this.A06.add(A0F);
                }
            }
        }
        List list = this.A06;
        if (!list.isEmpty()) {
            C38978HEg c38978HEg = (C38978HEg) this.A07.getValue();
            C155946zO c155946zO = c38978HEg.A02;
            c155946zO.A04();
            c155946zO.A0B(list);
            c38978HEg.A00();
        } else {
            AbstractC37300Gc1.A0I(this.A0L).A01(true, false);
        }
        InterfaceC09390do interfaceC09390do = this.A0J;
        String A15 = AbstractC25225BEi.A15(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A0K;
        C38321qM A0F2 = AbstractC37304Gc5.A0F(A15, interfaceC09390do2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(this.A0O), "instagram_shopping_media_contextual_feed_entry");
        C0Zx c0Zx2 = new C0Zx();
        AbstractC37300Gc1.A0v(c0Zx2, AbstractC25225BEi.A15(this.A0G));
        AbstractC37300Gc1.A0w(c0Zx2, AbstractC25225BEi.A15(this.A0H));
        AbstractC37302Gc3.A0u(A0f, c0Zx2, AbstractC25225BEi.A15(this.A0M));
        if (A0F2 != null) {
            c0Zx = C128205qp.A00(AbstractC166987dD.A0r(interfaceC09390do2), A0F2);
        } else {
            c0Zx = new C0Zx();
            c0Zx.A06("m_pk", AbstractC25225BEi.A15(interfaceC09390do));
        }
        A0f.AAQ(c0Zx, "feed_item_info");
        ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo = (ProductDetailsPageLoggingInfo) requireArguments().getParcelable("product_details_page_logging_info");
        if (productDetailsPageLoggingInfo != null) {
            c38535Gww = productDetailsPageLoggingInfo.A00();
        } else {
            c38535Gww = null;
        }
        A0f.AAQ(c38535Gww, "pdp_logging_info");
        A0f.Cht();
        C0f9.A09(702472526, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View A05;
        View view;
        int A02 = C0f9.A02(817531756);
        C14360o3.A0B(layoutInflater, 0);
        if (AbstractC37304Gc5.A1b(this.A0K)) {
            A05 = layoutInflater.inflate(R.layout.layout_media_feed_swipe_refreshable, viewGroup, false);
            view = A05.findViewById(R.id.refreshable_container);
        } else {
            A05 = AbstractC37304Gc5.A05(layoutInflater, viewGroup, R.layout.layout_media_feed_refreshable);
            view = A05;
        }
        this.A03 = (RefreshableNestedScrollingParent) view;
        C14360o3.A0A(A05);
        C0f9.A09(-2119341415, A02);
        return A05;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(997483411);
        super.onDestroy();
        AbstractC37304Gc5.A1L(this, this.A0E);
        AbstractC37304Gc5.A1M(this, this.A0D);
        unregisterLifecycleListener((AnonymousClass396) this.A0A.getValue());
        C0f9.A09(-51414683, A02);
    }
}
