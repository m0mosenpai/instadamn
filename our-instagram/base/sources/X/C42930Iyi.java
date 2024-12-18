package X;

import android.view.View;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;

/* renamed from: X.Iyi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42930Iyi implements JPn {
    public final JHK A00;
    public final long A01;
    public final UserFlowLogger A02;
    public final IMS A03;

    @Override // X.JPn
    public final void APh(InterfaceC99144cb interfaceC99144cb, int i) {
    }

    @Override // X.JPn
    public final void DbD(InterfaceC99144cb interfaceC99144cb, InterfaceC43415JGf interfaceC43415JGf, Product product, int i, int i2) {
    }

    @Override // X.JPn
    public final void DbF(InterfaceC99144cb interfaceC99144cb, InterfaceC43416JGg interfaceC43416JGg, Product product, Integer num, String str, int i, int i2) {
    }

    @Override // X.JPn
    public final void A9z(ProductFeedItem productFeedItem, InterfaceC99144cb interfaceC99144cb, IJ0 ij0) {
        IMS ims = this.A03;
        ims.A05.A03(interfaceC99144cb, ((MultiProductComponent) interfaceC99144cb).A00(), ij0.A01);
    }

    @Override // X.C37G
    public final JPm Bgz() {
        return new C39137HKq(this);
    }

    @Override // X.JPn
    public final void Db7(C19260xA c19260xA, ProductFeedItem productFeedItem, InterfaceC99144cb interfaceC99144cb, String str, String str2, int i, int i2, int i3) {
        this.A02.flowMarkPoint(this.A01, "visit_pdp");
        this.A03.A00(productFeedItem, interfaceC99144cb, "shopping_bag_product_collection", str2, i, i2, i3);
    }

    @Override // X.JPn
    public final void EDd(View view, ProductFeedItem productFeedItem, String str) {
        this.A03.A05.A00(view, productFeedItem, str);
    }

    public C42930Iyi(UserFlowLogger userFlowLogger, JHK jhk, IMS ims, long j) {
        AbstractC167017dG.A1P(ims, userFlowLogger);
        this.A03 = ims;
        this.A02 = userFlowLogger;
        this.A01 = j;
        this.A00 = jhk;
    }
}
