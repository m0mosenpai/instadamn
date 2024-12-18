package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* loaded from: classes11.dex */
public final class UZI extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, "first_name"), new C4OW(c94754Oe, "middle_name"), new C4OW(c94754Oe, "last_name"), new C4OW(c94754Oe, "street1"), new C4OW(c94754Oe, "street2"), new C4OW(c94754Oe, "address_city"), new C4OW(c94754Oe, "address_state"), new C4OW(c94754Oe, ServerW3CShippingAddressConstants.POSTAL_CODE), new C4OW(c94754Oe, "country_code")});
    }

    public UZI(int i) {
        super(i);
    }

    public UZI() {
        super(145709666);
    }
}
