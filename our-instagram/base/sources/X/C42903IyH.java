package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.user.model.Product;

/* renamed from: X.IyH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42903IyH implements InterfaceC43415JGf {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC99144cb A02;
    public final /* synthetic */ IMS A03;
    public final /* synthetic */ InterfaceC43415JGf A04;

    public C42903IyH(InterfaceC99144cb interfaceC99144cb, IMS ims, InterfaceC43415JGf interfaceC43415JGf, int i, int i2) {
        this.A03 = ims;
        this.A02 = interfaceC99144cb;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = interfaceC43415JGf;
    }

    @Override // X.InterfaceC43415JGf
    public final void DdE(Product product) {
        String A00 = ((MultiProductComponent) this.A02).A00();
        C18C.A07(A00, "Action from should be specified for an hscroll with a clickable remove button");
        this.A03.A03.A04(product, A00, this.A01, this.A00);
        this.A04.DdE(product);
    }
}
