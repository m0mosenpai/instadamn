package X;

import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;

/* loaded from: classes7.dex */
public final class J3W implements Runnable {
    public final /* synthetic */ C42704Iuz A00;

    public J3W(C42704Iuz c42704Iuz) {
        this.A00 = c42704Iuz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42704Iuz c42704Iuz = this.A00;
        MerchantShoppingCartFragment merchantShoppingCartFragment = ((C42824Ix0) c42704Iuz.A01).A00;
        C1563470e A0O = AbstractC37301Gc2.A0O(merchantShoppingCartFragment);
        String str = merchantShoppingCartFragment.A0U;
        C41730Ie1 c41730Ie1 = (C41730Ie1) c42704Iuz.A02;
        C14360o3.A0B(str, 0);
        INR A06 = A0O.A06(str);
        if (A06 != null) {
            A06.A02(c41730Ie1);
            A0O.A0A(str).add(new C41229IMu(EnumC39548HdK.A02, EnumC39537Hd9.A03, c41730Ie1, null));
            A0O.A07.D2c(A06, str);
            AbstractC37301Gc2.A1T(str, A0O.A0C, A06.A00);
            C1563470e.A02(A0O);
        }
    }
}
