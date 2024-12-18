package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.QrY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C59950QrY extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return AbstractC166987dD.A0k(new C4OM[]{AbstractC166987dD.A0i(c94754Oe, "street1"), AbstractC166987dD.A0i(c94754Oe, "street2"), AbstractC166987dD.A0i(c94754Oe, ServerW3CShippingAddressConstants.CITY), AbstractC166987dD.A0i(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE), AbstractC166987dD.A0i(c94754Oe, ServerW3CShippingAddressConstants.POSTAL_CODE), AbstractC166987dD.A0i(c94754Oe, "country")});
    }

    public C59950QrY(int i) {
        super(i);
    }

    public C59950QrY() {
        super(-1283310522);
    }
}
