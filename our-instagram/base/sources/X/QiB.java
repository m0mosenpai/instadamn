package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* loaded from: classes10.dex */
public final class QiB extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return AbstractC58320PtC.A0U(c94754Oe, AbstractC166987dD.A0i(c94754Oe, ServerW3CShippingAddressConstants.CITY), AbstractC166987dD.A0i(c94754Oe, "country"), AbstractC166987dD.A0i(c94754Oe, "neighborhood"), "full_context_string");
    }

    public QiB(int i) {
        super(i);
    }

    public QiB() {
        super(178936253);
    }
}
