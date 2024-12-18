package X;

/* loaded from: classes10.dex */
public final class R1F extends C2JS implements C2JT {
    public final R1E A0E() {
        return (R1E) getOptionalTreeField(15, "billing_address", R1E.class, -1356656072);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW A0i = AbstractC166987dD.A0i(c94754Oe, "card_association_image_url");
        C4OW A0i2 = AbstractC166987dD.A0i(c94754Oe, "card_type");
        C4OW A0i3 = AbstractC166987dD.A0i(c94754Oe, "expiry_month");
        C4OW A0i4 = AbstractC166987dD.A0i(c94754Oe, "expiry_year");
        C4OW A0V = AbstractC166997dE.A0V(c94754Oe);
        C4OW A0i5 = AbstractC166987dD.A0i(c94754Oe, "last4");
        C4OW A0i6 = AbstractC166987dD.A0i(c94754Oe, "cc_title");
        C4OW A0i7 = AbstractC166987dD.A0i(c94754Oe, "cc_subtitle");
        C95124Py c95124Py = C95124Py.A00;
        return AbstractC166987dD.A0k(new C4OM[]{A0i, A0i2, A0i3, A0i4, A0V, A0i5, A0i6, A0i7, AbstractC166987dD.A0i(c95124Py, "is_expired"), AbstractC166987dD.A0i(c94754Oe, "card_holder_name"), AbstractC166987dD.A0i(c95124Py, "is_bound_to_device(device_key_pub_b64:$legacy_dev_pub_key)"), AbstractC166987dD.A0i(c94754Oe, "latest_bound_device(device_keys_pub_b64:[$legacy_dev_pub_key,$shared_dev_pub_key])"), AbstractC166987dD.A0i(c94754Oe, "latest_bound_payment_type(device_keys_pub_b64:[$legacy_dev_pub_key])"), AbstractC166987dD.A0i(c94754Oe, "latest_bound_original_payment_type(device_keys_pub_b64:[$shared_dev_pub_key])"), AbstractC166987dD.A0i(C94754Oe.A01(), "bound_passkey_ids"), AbstractC58318PtA.A0O(R1E.class, "billing_address", -1356656072)});
    }

    public R1F(int i) {
        super(i);
    }

    public R1F() {
        super(981393133);
    }
}
