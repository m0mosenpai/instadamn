package X;

/* renamed from: X.QSj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58973QSj extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW A0i = AbstractC166987dD.A0i(c94754Oe, "card_association");
        C4OW A0i2 = AbstractC166987dD.A0i(c94754Oe, "card_association_image_url");
        C4OW A0i3 = AbstractC166987dD.A0i(c94754Oe, "cc_subtitle");
        C4OW A0i4 = AbstractC166987dD.A0i(c94754Oe, "cc_title");
        C4OW A0i5 = AbstractC166987dD.A0i(c94754Oe, "credential_id");
        C95124Py c95124Py = C95124Py.A00;
        return AbstractC166987dD.A0k(new C4OM[]{A0i, A0i2, A0i3, A0i4, A0i5, AbstractC166987dD.A0i(c95124Py, "is_expired"), AbstractC166987dD.A0i(c94754Oe, "expiry_month"), AbstractC166987dD.A0i(c94754Oe, "expiry_year"), AbstractC166987dD.A0i(c95124Py, "is_bound_to_device(device_key_pub_b64:$legacy_dev_pub_key)"), AbstractC166987dD.A0i(c94754Oe, "latest_bound_device(device_keys_pub_b64:[$legacy_dev_pub_key,$shared_dev_pub_key])"), AbstractC166987dD.A0i(c94754Oe, "latest_bound_payment_type(device_keys_pub_b64:[$legacy_dev_pub_key])"), AbstractC166987dD.A0i(c94754Oe, "latest_bound_original_payment_type(device_keys_pub_b64:[$shared_dev_pub_key])"), AbstractC166987dD.A0i(c94754Oe, "last_four_digits"), AbstractC166987dD.A0i(C94754Oe.A01(), "bound_passkey_ids"), AbstractC58318PtA.A0O(C58972QSi.class, "billing_address", -753829666)});
    }

    public C58973QSj(int i) {
        super(i);
    }

    public C58973QSj() {
        super(1468537264);
    }
}
