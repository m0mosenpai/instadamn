package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public final class HCa extends AbstractC59962oe implements InterfaceC60442pS, JII, C51D, InterfaceC60122ou, InterfaceC43443JHh {
    public static final String __redex_internal_original_name = "ShoppingSimilarProductsFragment";
    public RecyclerView A00;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A02 = J8U.A00(this, 3);
    public final InterfaceC09390do A01 = J8U.A00(this, 2);
    public final InterfaceC09390do A09 = J8U.A00(this, 9);
    public final InterfaceC09390do A04 = J8U.A00(this, 5);
    public final InterfaceC09390do A05 = J8U.A00(this, 6);
    public final InterfaceC09390do A07 = J8U.A00(this, 8);
    public final InterfaceC09390do A03 = J8U.A00(this, 4);
    public final InterfaceC09390do A0B = AbstractC09440dt.A01(J8G.A00);
    public final InterfaceC09390do A06 = J8U.A00(this, 7);

    @Override // X.JII
    public final void Db4(C38675GzG c38675GzG, Product product) {
    }

    @Override // X.JII
    public final /* synthetic */ void Db5(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
        throw C00O.createAndThrow();
    }

    @Override // X.JII
    public final void Db6(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
        AbstractC167017dG.A1N(productFeedItem, view);
        ((C41646Ibe) this.A06.getValue()).A02(c38675GzG, productFeedItem, null, null, null, i, i2);
    }

    @Override // X.JII
    public final /* synthetic */ void Db9(Product product, String str, String str2, int i, int i2) {
    }

    @Override // X.JII
    public final boolean DbA(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    @Override // X.JII
    public final /* synthetic */ void DbB(String str, int i) {
    }

    @Override // X.JII
    public final void DbC(Product product, int i, int i2) {
    }

    @Override // X.JII
    public final void DbE(C38675GzG c38675GzG, ProductTile productTile, int i, int i2) {
        C14360o3.A0B(productTile, 0);
        ((C41646Ibe) this.A06.getValue()).A03(c38675GzG, productTile, i, i2, false);
    }

    @Override // X.JII
    public final boolean DbG(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    @Override // X.JII
    public final void DbH(Product product) {
    }

    @Override // X.JII
    public final void DbI(Product product) {
    }

    @Override // X.JII
    public final /* synthetic */ void DbJ(String str) {
    }

    @Override // X.JII
    public final /* synthetic */ void DbK(Product product) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_view_similar";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), ((C38318GtD) this.A0A.getValue()).A00, C43361JEc.A01(this, 8), 13);
    }

    @Override // X.InterfaceC43443JHh
    public final /* bridge */ /* synthetic */ void AAr(Object obj, Object obj2) {
        H7J h7j = (H7J) obj;
        C41024IEt c41024IEt = (C41024IEt) obj2;
        C41646Ibe c41646Ibe = (C41646Ibe) this.A06.getValue();
        String A15 = AbstractC25225BEi.A15(this.A03);
        C41633IbO c41633IbO = c41646Ibe.A0A;
        if (c41633IbO != null) {
            h7j.A00 = c41646Ibe.A0B;
            c41633IbO.A02(c41024IEt, h7j, A15);
        }
    }

    @Override // X.InterfaceC43443JHh
    public final /* bridge */ /* synthetic */ void EDu(View view, Object obj) {
        H7J h7j = (H7J) obj;
        C14360o3.A0B(h7j, 1);
        C41633IbO c41633IbO = ((C41646Ibe) this.A06.getValue()).A0A;
        if (c41633IbO != null) {
            c41633IbO.A01(view, h7j);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && recyclerView.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public HCa() {
        J8U j8u = new J8U(this, 13);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J8U(new J8U(this, 10), 11));
        this.A0A = AbstractC25225BEi.A0a(new J8U(A00, 12), j8u, C43208J8f.A00(null, A00, 12), AbstractC25225BEi.A1D(C38318GtD.class));
        this.A08 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC43443JHh
    public final /* bridge */ /* synthetic */ void AAq(Object obj) {
        throw C00O.createAndThrow();
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2041546340);
        super.onCreate(bundle);
        AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A0A.getValue();
        C43172J6r.A03(abstractC52922bZ, AbstractC141776au.A00(abstractC52922bZ), 17);
        C0f9.A09(1925645830, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(505002004);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(2));
        RecyclerView A0F = AbstractC31176DnK.A0F(inflate);
        this.A00 = A0F;
        if (A0F == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        AbstractC37301Gc2.A0v(A0F, (C57112jm) this.A0B.getValue(), this);
        final Context context = A0F.getContext();
        A0F.setLayoutManager(new LinearLayoutManager(context) { // from class: com.instagram.shopping.fragment.similarproducts.ShoppingSimilarProductsFragment$onCreateView$1$1$1
        });
        C70623Ez c70623Ez = new C70623Ez();
        ((C3F0) c70623Ez).A00 = false;
        A0F.setItemAnimator(c70623Ez);
        AbstractC37304Gc5.A10(A0F, this.A01);
        C0f9.A09(-1316816008, A02);
        return inflate;
    }
}
