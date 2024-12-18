package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;

/* renamed from: X.IyT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42915IyT implements JPm {
    public final /* synthetic */ HCQ A00;

    public static C41646Ibe A00(C42915IyT c42915IyT, Object obj) {
        C14360o3.A0B(obj, 0);
        return (C41646Ibe) c42915IyT.A00.A0L.getValue();
    }

    @Override // X.JII
    public final void Db4(C38675GzG c38675GzG, Product product) {
    }

    @Override // X.JII
    public final /* synthetic */ void Db5(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
    }

    @Override // X.JII
    public final void Db6(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
        AbstractC167017dG.A1N(productFeedItem, view);
        HCQ hcq = this.A00;
        ((C41646Ibe) hcq.A0L.getValue()).A02(c38675GzG, productFeedItem, null, AbstractC25225BEi.A15(hcq.A0C), null, i, i2);
    }

    @Override // X.JII
    public final /* synthetic */ void Db9(Product product, String str, String str2, int i, int i2) {
    }

    @Override // X.JII
    public final /* synthetic */ void DbB(String str, int i) {
    }

    @Override // X.JII
    public final void DbE(C38675GzG c38675GzG, ProductTile productTile, int i, int i2) {
        A00(this, productTile).A03(c38675GzG, productTile, i, i2, true);
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

    @Override // X.JHT
    public final void Dw2(UnavailableProduct unavailableProduct, int i, int i2) {
        C41646Ibe A00 = A00(this, unavailableProduct);
        I7S.A00(A00.A02.requireActivity(), A00.A03, A00.A04, unavailableProduct, A00.A0I, A00.A0E);
    }

    public C42915IyT(HCQ hcq) {
        this.A00 = hcq;
    }

    @Override // X.InterfaceC43418JGi
    public final void D2v(String str, String str2, String str3, int i, int i2) {
        AbstractC167027dH.A12(str, str2, str3);
        ((C41646Ibe) this.A00.A0L.getValue()).A08(str2, str3, i, i2);
    }

    @Override // X.JII
    public final boolean DbA(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return A00(this, productFeedItem).A09(productFeedItem);
    }

    @Override // X.JII
    public final void DbC(Product product, int i, int i2) {
        A00(this, product).A06(product, i, i2);
    }

    @Override // X.JHT
    public final void Dw3(ProductFeedItem productFeedItem) {
        A00(this, productFeedItem).A04(productFeedItem);
    }
}
