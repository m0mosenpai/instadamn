package X;

import com.facebookpay.logging.LoggingContext;
import java.util.Map;

/* loaded from: classes10.dex */
public final class R8R extends VKJ {
    public final boolean A00;

    public R8R(boolean z) {
        this.A00 = z;
    }

    @Override // X.VKJ
    public final void A04(EnumC72407Xcu enumC72407Xcu, LoggingContext loggingContext, Long l, Map map) {
        String str;
        Wap A0H = AbstractC43592JPx.A0H();
        if (this.A00) {
            str = "add_shipping_address_inline";
        } else {
            str = "add_shipping_address";
        }
        A0H.A0K(loggingContext, l, str, map);
    }

    @Override // X.VKJ
    public final void A05(EnumC72407Xcu enumC72407Xcu, LoggingContext loggingContext, Long l, Map map) {
        String str;
        Wap A0H = AbstractC43592JPx.A0H();
        if (this.A00) {
            str = "add_shipping_address_inline";
        } else {
            str = "add_shipping_address_save";
        }
        Wap.A03(AbstractC31171DnF.A0A(MSY.A0H(A0H.A00, "user_add_shippingaddress_submit"), 390), loggingContext, new C65022Tc8(map, loggingContext, str, 5));
    }

    @Override // X.VKJ
    public final void A06(EnumC72407Xcu enumC72407Xcu, LoggingContext loggingContext, Long l, Map map) {
        String str;
        Wap A0H = AbstractC43592JPx.A0H();
        if (this.A00) {
            str = "add_shipping_address_inline";
        } else {
            str = "add_shipping_address";
        }
        Wap.A03(AbstractC31171DnF.A0A(MSY.A0H(A0H.A00, "client_add_shippingaddress_fail"), 27), loggingContext, new C65022Tc8(map, loggingContext, str, 4));
    }

    @Override // X.VKJ
    public final void A07(EnumC72407Xcu enumC72407Xcu, LoggingContext loggingContext, Long l, Map map) {
        String str;
        Wap A0H = AbstractC43592JPx.A0H();
        if (this.A00) {
            str = "add_shipping_address_inline";
        } else {
            str = "add_shipping_address";
        }
        Wap.A03(AbstractC31171DnF.A0A(MSY.A0H(A0H.A00, "client_add_shippingaddress_success"), 28), loggingContext, new C50365MLr(loggingContext, l, str, map, 4));
    }
}
