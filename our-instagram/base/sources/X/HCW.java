package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HCW extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60682pr, JI1, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FeaturedProductsMediaFeedListFragment";
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
    public final InterfaceC09390do A0B = J8Y.A00(this, 24);
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
    public final InterfaceC41501vz A0Q;

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
        throw new UnsupportedOperationException("Method not decompiled: X.HCW.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.JI1
    public final C25621Ms Ac9() {
        C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC166987dD.A0o(this.A0L));
        A0M.A0B(AbstractC25225BEi.A15(this.A08));
        A0M.A9s("merchant_id", AbstractC25225BEi.A15(this.A0F));
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
        AbstractC37304Gc5.A0w(this);
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
            this.A06.clear();
        }
        if (hb5.A05 == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "Received null FeedItem list from MediaFeedResponse payload on IG Shopping featured product media feed list Fragment", 817903268);
        }
        List list = hb5.A05;
        if (list != null) {
            this.A06.addAll(list);
        }
        ((C38979HEh) this.A07.getValue()).A01(A00());
        AbstractC37304Gc5.A1U(this.A0E);
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
        return AbstractC166987dD.A0n(this.A0L);
    }

    @Override // X.JI1
    public final boolean isEmpty() {
        return ((C2UT) this.A07.getValue()).isEmpty();
    }

    public HCW() {
        J8Y j8y = new J8Y(this, 22);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J8Y(new J8Y(this, 36), 37));
        this.A09 = AbstractC25225BEi.A0a(new J8Y(A00, 38), j8y, C43208J8f.A00(null, A00, 1), AbstractC25225BEi.A1D(C61142qc.class));
        this.A0Q = C37816GkW.A00(this, 31);
        this.A0E = J8Y.A00(this, 27);
        this.A0D = J8Y.A00(this, 26);
        this.A0N = J8Y.A00(this, 35);
        this.A0G = J8Y.A00(this, 29);
        this.A0H = J8Y.A00(this, 30);
        this.A0O = J8Y.A00(this, 39);
        this.A08 = J8Y.A00(this, 21);
        this.A0F = J8Y.A00(this, 28);
        this.A0C = J8Y.A00(this, 25);
        this.A0K = J8Y.A00(this, 33);
        this.A0M = J8Y.A00(this, 34);
        this.A05 = new C61372qz();
        this.A0J = J8Y.A00(this, 32);
        this.A0A = J8Y.A00(this, 23);
        this.A0P = J8Y.A00(this, 40);
        this.A04 = C57112jm.A00();
        this.A07 = J8Y.A00(this, 20);
        this.A0I = J8Y.A00(this, 31);
        this.A06 = AbstractC166987dD.A1E();
        this.A0L = AbstractC60492pY.A02(this);
    }

    private final ArrayList A00() {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : this.A06) {
            if (obj instanceof C3XG) {
                C3XG c3xg = (C3XG) obj;
                int ordinal = c3xg.A06.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 33) {
                        obj = c3xg.A05;
                        C14360o3.A0C(obj, AbstractC111324zv.A00(37));
                    }
                } else {
                    obj = AbstractC37300Gc1.A0E(c3xg);
                    if (obj != null) {
                    }
                }
            }
            A1E.add(obj);
        }
        return A1E;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(AbstractC25225BEi.A15(this.A0O));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C0Zx c0Zx;
        C38535Gww c38535Gww;
        int A02 = C0f9.A02(-536550778);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0L;
        AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A0Q, C3HW.class);
        AbstractC37304Gc5.A1J(this, this.A0E);
        AbstractC37304Gc5.A1K(this, this.A0D);
        registerLifecycleListener((AnonymousClass396) this.A0A.getValue());
        AbstractCollection abstractCollection = (AbstractCollection) this.A0C.getValue();
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                C38321qM A0F = AbstractC37304Gc5.A0F(AbstractC166987dD.A1B(it), interfaceC09390do);
                if (A0F != null) {
                    List list = this.A06;
                    list.add(A0F);
                    C99114cY A00 = AbstractC99104cX.A00(AbstractC166987dD.A0r(interfaceC09390do));
                    String A2u = A0F.A2u();
                    if (A2u != null) {
                        Object obj = A00.A00.get(A2u);
                        if (obj != null) {
                            list.add(obj);
                        }
                    } else {
                        IllegalStateException A0g = AbstractC166997dE.A0g();
                        C0f9.A09(281052791, A02);
                        throw A0g;
                    }
                }
            }
        }
        if (!this.A06.isEmpty()) {
            ((C38979HEh) this.A07.getValue()).A01(A00());
        } else {
            AbstractC37300Gc1.A0I(this.A0M).A01(true, false);
        }
        InterfaceC09390do interfaceC09390do2 = this.A0K;
        C38321qM A0F2 = AbstractC37304Gc5.A0F(AbstractC25225BEi.A15(interfaceC09390do2), interfaceC09390do);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(this.A0P), "instagram_shopping_media_contextual_feed_entry");
        C0Zx c0Zx2 = new C0Zx();
        AbstractC37300Gc1.A0v(c0Zx2, AbstractC25225BEi.A15(this.A0G));
        AbstractC37300Gc1.A0w(c0Zx2, AbstractC25225BEi.A15(this.A0H));
        AbstractC37302Gc3.A0u(A0f, c0Zx2, AbstractC25225BEi.A15(this.A0N));
        if (A0F2 != null) {
            c0Zx = C128205qp.A00(AbstractC166987dD.A0r(interfaceC09390do), A0F2);
        } else {
            c0Zx = new C0Zx();
            c0Zx.A06("m_pk", AbstractC25225BEi.A15(interfaceC09390do2));
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
        C0f9.A09(2118339073, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View A05;
        View view;
        int A02 = C0f9.A02(945092796);
        C14360o3.A0B(layoutInflater, 0);
        if (AbstractC37304Gc5.A1b(this.A0L)) {
            A05 = layoutInflater.inflate(R.layout.layout_media_feed_swipe_refreshable, viewGroup, false);
            view = A05.findViewById(R.id.refreshable_container);
        } else {
            A05 = AbstractC37304Gc5.A05(layoutInflater, viewGroup, R.layout.layout_media_feed_refreshable);
            view = A05;
        }
        this.A03 = (RefreshableNestedScrollingParent) view;
        C14360o3.A0A(A05);
        C0f9.A09(-825175837, A02);
        return A05;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1139460463);
        super.onDestroy();
        AbstractC31176DnK.A0Q(this.A0L).A02(this.A0Q, C3HW.class);
        AbstractC37304Gc5.A1L(this, this.A0E);
        AbstractC37304Gc5.A1M(this, this.A0D);
        unregisterLifecycleListener((AnonymousClass396) this.A0A.getValue());
        C0f9.A09(1479272504, A02);
    }
}
