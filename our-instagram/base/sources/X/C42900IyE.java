package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.user.model.Product;

/* renamed from: X.IyE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42900IyE implements InterfaceC43414JGe {
    public final /* synthetic */ ProductGroup A00;
    public final /* synthetic */ HCE A01;
    public final /* synthetic */ C41643IbZ A02;

    @Override // X.InterfaceC43414JGe
    public final void Dyg(Product product) {
        C14360o3.A0B(product, 0);
        AbstractC37301Gc2.A0Q(this.A01).A00(this.A00, this.A02, product);
    }

    public C42900IyE(ProductGroup productGroup, HCE hce, C41643IbZ c41643IbZ) {
        this.A01 = hce;
        this.A02 = c41643IbZ;
        this.A00 = productGroup;
    }
}
