package X;

import com.facebookpay.shippingaddress.model.ShippingAddress;

/* loaded from: classes11.dex */
public final class X6A extends C0YY implements InterfaceC16620sF {
    public static final X6A A00 = new X6A();

    public X6A() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        AbstractC167017dG.A1N(shippingAddress, obj2);
        return Boolean.valueOf(C14360o3.A0K(shippingAddress.A04, obj2));
    }
}
