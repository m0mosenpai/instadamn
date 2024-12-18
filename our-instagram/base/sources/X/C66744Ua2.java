package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.Ua2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66744Ua2 extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, "address_line_1"), new C4OW(c94754Oe, "address_line_2"), new C4OW(c94754Oe, ServerW3CShippingAddressConstants.CITY), new C4OW(c94754Oe, "postal_code"), new C4OW(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE), new C4OW(c94754Oe, "state_code"), new C4OW(c94754Oe, "country"), new C4OW(c94754Oe, "country_code")});
    }

    public C66744Ua2(int i) {
        super(i);
    }

    public C66744Ua2() {
        super(-1308276365);
    }
}
