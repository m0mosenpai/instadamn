package X;

/* loaded from: classes10.dex */
public enum Rid implements InterfaceC02530Ab {
    DYNAMIC_AUTH("dynamic_authentication"),
    FBPAY_CONFIRM_PIN("fbpay_confirm_pin"),
    FBPAY_CREATE_PIN("fbpay_create_pin"),
    FBPAY_FORGET_PIN("fbpay_forget_pin"),
    FBPAY_RESET_PIN("reset_pin"),
    FBPAY_VERIFY_BIO("fbpay_verify_bio"),
    FBPAY_VERIFY_CVV("fbpay_verify_cvv"),
    FBPAY_VERIFY_PAYPAL("fbpay_verify_paypal"),
    FBPAY_VERIFY_PIN("fbpay_verify_pin"),
    /* JADX INFO: Fake field, exist only in values array */
    LEAVE_WITHOUT_RESET("leave_without_reset"),
    RESET_PIN_CONFIRM("reset_pin_confirm"),
    /* JADX INFO: Fake field, exist only in values array */
    RESET_PIN_CVV("reset_pin_cvv"),
    /* JADX INFO: Fake field, exist only in values array */
    RESET_PIN_PAYPAL("reset_pin_paypal"),
    /* JADX INFO: Fake field, exist only in values array */
    RESET_WITH_ANOTHER_FACTOR("reset_with_another_factor"),
    /* JADX INFO: Fake field, exist only in values array */
    SSO_ACCESS_TOKEN_GENERATION("sso_access_token_generation");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    Rid(String str) {
        this.A00 = str;
    }
}
