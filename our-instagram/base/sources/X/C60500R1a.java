package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* renamed from: X.R1a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60500R1a extends C2JS implements XJm {
    @Override // X.XJm
    public final String AZn() {
        return getOptionalStringField(6, "address_city");
    }

    @Override // X.XJm
    public final String AZp() {
        return getOptionalStringField(7, "address_state");
    }

    @Override // X.XJm
    public final String As9() {
        return A0D("country_code");
    }

    @Override // X.XJm
    public final String CIk() {
        return getOptionalStringField(9, ServerW3CShippingAddressConstants.POSTAL_CODE);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return AbstractC166987dD.A0k(new C4OM[]{AbstractC166987dD.A0i(c94754Oe, "first_name"), AbstractC166987dD.A0i(c94754Oe, "middle_name"), AbstractC166987dD.A0i(c94754Oe, "last_name"), AbstractC166987dD.A0i(c94754Oe, "street1"), AbstractC166987dD.A0i(c94754Oe, "street2"), AbstractC166987dD.A0i(c94754Oe, "street3"), AbstractC166987dD.A0i(c94754Oe, "address_city"), AbstractC166987dD.A0i(c94754Oe, "address_state"), AbstractC166987dD.A0i(c94754Oe, "country_code"), AbstractC166987dD.A0i(c94754Oe, ServerW3CShippingAddressConstants.POSTAL_CODE)});
    }

    public C60500R1a(int i) {
        super(i);
    }

    @Override // X.XJm
    public final String C2e() {
        return A0A("street1");
    }

    @Override // X.XJm
    public final String C2f() {
        return A0B("street2");
    }

    public C60500R1a() {
        super(1653097835);
    }
}
