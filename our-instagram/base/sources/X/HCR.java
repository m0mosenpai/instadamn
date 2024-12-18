package X;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;

/* loaded from: classes7.dex */
public final class HCR extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60682pr, InterfaceC60122ou, JPp {
    public static final String __redex_internal_original_name = "FeaturedProductSingleMediaViewerFragment";
    public C38321qM A00;
    public InterfaceC70513Em A01;
    public RecyclerView A02;
    public RefreshableNestedScrollingParent A03;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0A = J8X.A00(this, 37);
    public final InterfaceC09390do A0E = J8X.A00(this, 41);
    public final InterfaceC09390do A0D = J8X.A00(this, 40);
    public final InterfaceC09390do A0I = J8X.A00(this, 44);
    public final InterfaceC09390do A0C = J8X.A00(this, 39);
    public final InterfaceC09390do A0B = J8X.A00(this, 38);
    public final InterfaceC09390do A0F = J8X.A00(this, 42);
    public final C61372qz A05 = new C61372qz();
    public final InterfaceC09390do A0G = J8X.A00(this, 43);
    public final InterfaceC09390do A09 = J8X.A00(this, 36);
    public final InterfaceC09390do A08 = J8X.A00(this, 35);
    public final C57112jm A04 = C57112jm.A00();
    public final InterfaceC09390do A0K = J8X.A00(this, 49);
    public final InterfaceC09390do A0J = J8X.A00(this, 45);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            int ordinal = c38321qM.BRp().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 4) {
                        interfaceC56362iU.setTitle("");
                        return;
                    }
                    i = 2131969835;
                } else {
                    i = 2131976620;
                }
            } else {
                i = 2131969575;
            }
            interfaceC56362iU.Efu(i);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_single_media_viewer";
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
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A03;
        String str = "refreshableContainer";
        if (refreshableNestedScrollingParent != null) {
            AbstractC37304Gc5.A1R(refreshableNestedScrollingParent);
            InterfaceC09390do interfaceC09390do = this.A0H;
            this.A01 = AbstractC1571573u.A01(view, AbstractC166987dD.A0r(interfaceC09390do), new J1N(this, 1));
            RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.A03;
            if (refreshableNestedScrollingParent2 != null) {
                RecyclerView recyclerView = (RecyclerView) refreshableNestedScrollingParent2.findViewById(R.id.list);
                this.A02 = recyclerView;
                str = "recyclerView";
                if (recyclerView != null) {
                    recyclerView.A14(this.A05);
                    AbstractC37304Gc5.A10(recyclerView, this.A06);
                    recyclerView.setItemAnimator(null);
                    AbstractC31174DnI.A16(requireContext(), recyclerView, 1, false);
                    recyclerView.A14((C1I4) this.A09.getValue());
                    if (getScrollingViewProxy() instanceof C3FR) {
                        boolean A1b = AbstractC37304Gc5.A1b(interfaceC09390do);
                        String A00 = AbstractC111324zv.A00(70);
                        C3FQ scrollingViewProxy = getScrollingViewProxy();
                        C14360o3.A0C(scrollingViewProxy, A00);
                        C3FR c3fr = (C3FR) scrollingViewProxy;
                        if (A1b) {
                            InterfaceC70513Em interfaceC70513Em = this.A01;
                            if (interfaceC70513Em != null) {
                                C42082Ikp.A00(c3fr, (C71094Wnq) interfaceC70513Em, this, 2);
                                InterfaceC70513Em interfaceC70513Em2 = this.A01;
                                if (interfaceC70513Em2 != null) {
                                    interfaceC70513Em2.ARj();
                                }
                            }
                            C14360o3.A0F("pullToRefresh");
                            throw C00O.createAndThrow();
                        }
                        c3fr.Ehc(new J3U(this));
                    }
                    C57112jm c57112jm = this.A04;
                    C71163Hc A002 = C71163Hc.A00(this);
                    RecyclerView recyclerView2 = this.A02;
                    if (recyclerView2 != null) {
                        c57112jm.A08(recyclerView2, A002, new InterfaceC57142jp[0]);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC43443JHh
    public final /* bridge */ /* synthetic */ void AAq(Object obj) {
        C09530e4 c09530e4 = (C09530e4) obj;
        C14360o3.A0B(c09530e4, 0);
        ((C41615Ib5) this.A0K.getValue()).A01(c09530e4);
    }

    @Override // X.InterfaceC43443JHh
    public final /* bridge */ /* synthetic */ void AAr(Object obj, Object obj2) {
        ((C41615Ib5) this.A0K.getValue()).A01((C09530e4) obj);
    }

    @Override // X.JGN
    public final void Dhl(C38818H7j c38818H7j) {
        ProductDetailsProductItemDict productDetailsProductItemDict = c38818H7j.A01;
        if (productDetailsProductItemDict != null) {
            C1XJ c1xj = C1XJ.A00;
            FragmentActivity requireActivity = requireActivity();
            Product A01 = AbstractC38048Gob.A01(productDetailsProductItemDict);
            C42130Ile.A01(c1xj.A0L(requireActivity, AbstractC166987dD.A0r(this.A0H), this, A01, AbstractC111324zv.A00(932), AbstractC25225BEi.A15(this.A0I)));
        }
    }

    @Override // X.InterfaceC43443JHh
    public final /* bridge */ /* synthetic */ void EDu(View view, Object obj) {
        C09530e4 c09530e4 = (C09530e4) obj;
        C14360o3.A0B(c09530e4, 1);
        C41615Ib5 c41615Ib5 = (C41615Ib5) this.A0K.getValue();
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
        return AbstractC166987dD.A0n(this.A0H);
    }

    public HCR() {
        J8X j8x = new J8X(this, 34);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J8X(new J8X(this, 46), 47));
        this.A07 = AbstractC25225BEi.A0a(new J8X(A00, 48), j8x, new C57252Pba(48, null, A00), AbstractC25225BEi.A1D(C61142qc.class));
        this.A06 = J8X.A00(this, 33);
        this.A0H = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-257444026);
        super.onCreate(bundle);
        AbstractC37304Gc5.A1J(this, this.A0E);
        AbstractC37304Gc5.A1K(this, this.A0D);
        registerLifecycleListener((AnonymousClass396) this.A09.getValue());
        ((IM9) this.A0J.getValue()).A00(AbstractC25225BEi.A15(this.A0C));
        ((C42881Ixv) this.A08.getValue()).FAs();
        C0f9.A09(-1162806952, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View A05;
        View view;
        int A02 = C0f9.A02(-1238795172);
        C14360o3.A0B(layoutInflater, 0);
        if (AbstractC37304Gc5.A1b(this.A0H)) {
            A05 = layoutInflater.inflate(com.facebook.R.layout.layout_media_feed_swipe_refreshable, viewGroup, false);
            view = A05.findViewById(com.facebook.R.id.refreshable_container);
        } else {
            A05 = AbstractC37304Gc5.A05(layoutInflater, viewGroup, com.facebook.R.layout.layout_media_feed_refreshable);
            view = A05;
        }
        this.A03 = (RefreshableNestedScrollingParent) view;
        C14360o3.A0A(A05);
        C0f9.A09(949238481, A02);
        return A05;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(758312692);
        super.onDestroy();
        AbstractC37304Gc5.A1L(this, this.A0E);
        AbstractC37304Gc5.A1M(this, this.A0D);
        unregisterLifecycleListener((AnonymousClass396) this.A09.getValue());
        C0f9.A09(-475680993, A02);
    }
}
