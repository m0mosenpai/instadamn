package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;

/* renamed from: X.Iyj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42931Iyj implements JPn {
    public final UserSession A00;
    public final C41165IKe A01;
    public final C41646Ibe A02;
    public final InterfaceC09390do A03;
    public final IMS A04;

    public C42931Iyj(UserSession userSession, IMS ims, C41165IKe c41165IKe, C41646Ibe c41646Ibe) {
        AbstractC167027dH.A0a(1, userSession, c41165IKe, c41646Ibe, ims);
        this.A00 = userSession;
        this.A01 = c41165IKe;
        this.A02 = c41646Ibe;
        this.A04 = ims;
        this.A03 = C43209J8g.A01(this, 27);
    }

    @Override // X.JPn
    public final void A9z(ProductFeedItem productFeedItem, InterfaceC99144cb interfaceC99144cb, IJ0 ij0) {
        C14360o3.A0B(productFeedItem, 1);
        this.A04.A05.A02(productFeedItem, ij0, ((MultiProductComponent) interfaceC99144cb).A00());
    }

    @Override // X.JPn
    public final void APh(InterfaceC99144cb interfaceC99144cb, int i) {
        C18C.A0E(interfaceC99144cb instanceof MultiProductComponent);
        Object obj = null;
        obj.getClass();
        throw C00O.createAndThrow();
    }

    @Override // X.C37G
    public final JPm Bgz() {
        return (C42913IyR) this.A03.getValue();
    }

    @Override // X.JPn
    public final void Db7(C19260xA c19260xA, ProductFeedItem productFeedItem, InterfaceC99144cb interfaceC99144cb, String str, String str2, int i, int i2, int i3) {
        this.A04.A00(productFeedItem, interfaceC99144cb, str, str2, i, i2, i3);
    }

    @Override // X.JPn
    public final void DbD(InterfaceC99144cb interfaceC99144cb, InterfaceC43415JGf interfaceC43415JGf, Product product, int i, int i2) {
        IMS ims = this.A04;
        C1XJ.A00.A0B(ims.A01).A00(ims.A00.getContext(), new C42903IyH(interfaceC99144cb, ims, interfaceC43415JGf, i, i2), product);
    }

    @Override // X.JPn
    public final void DbF(InterfaceC99144cb interfaceC99144cb, InterfaceC43416JGg interfaceC43416JGg, Product product, Integer num, String str, int i, int i2) {
        C41625IbF c41625IbF = new C41625IbF(null, this.A04.A04, product, AbstractC37300Gc1.A0T(product));
        MultiProductComponent multiProductComponent = (MultiProductComponent) interfaceC99144cb;
        c41625IbF.A06 = multiProductComponent.A00();
        c41625IbF.A08 = multiProductComponent.A00();
        c41625IbF.A05 = interfaceC43416JGg;
        c41625IbF.A00();
    }

    @Override // X.JPn
    public final void EDd(View view, ProductFeedItem productFeedItem, String str) {
        this.A04.A05.A00(view, productFeedItem, str);
    }
}
