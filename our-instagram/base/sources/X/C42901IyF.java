package X;

import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.user.model.Product;

/* renamed from: X.IyF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42901IyF implements InterfaceC43415JGf {
    public final int A00;
    public final Object A01;

    public C42901IyF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC43415JGf
    public final void DdE(Product product) {
        if (this.A00 != 0) {
            C38375GuC.A01((C38375GuC) this.A01, product.A0H);
            return;
        }
        HEZ hez = ((ProductCollectionFragment) this.A01).A05;
        String str = product.A0H;
        C14360o3.A0B(str, 0);
        hez.A0I.A0E(str);
        hez.A00();
    }
}
