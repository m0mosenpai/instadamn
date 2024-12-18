package X;

/* loaded from: classes10.dex */
public enum Rif implements InterfaceC02530Ab {
    CHANGE_PIN("change_pin"),
    FORGET_PASSWORD_LINK("forget_password_link"),
    FORGET_PIN_LINK("forget_pin_link"),
    RESET_PIN("reset_pin"),
    /* JADX INFO: Fake field, exist only in values array */
    RESET_PIN_VERIFY_CVV("reset_pin_verify_cvv"),
    /* JADX INFO: Fake field, exist only in values array */
    RESET_PIN_VERIFY_PAYPAL("reset_pin_verify_paypal"),
    TURN_OFF_ALWAYS_ASK_FOR_PIN("turn_off_always_ask_for_pin"),
    TURN_OFF_USE_BIO_ID("turn_off_use_bio_id"),
    TURN_ON_ALWAYS_ASK_FOR_PIN("turn_on_always_ask_for_pin"),
    TURN_ON_USE_BIO_ID("turn_on_use_bio_id"),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFY_BIOMETRICS("verify_biometrics"),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFY_CVV("verify_cvv"),
    VERIFY_CVV_CANCEL("verify_cvv_cancel"),
    VERIFY_CVV_CONFIRM("verify_cvv_confirm"),
    VERIFY_PAYPAL_CANCEL("verify_paypal_cancel"),
    VERIFY_PAYPAL_CONFIRM("verify_paypal_confirm"),
    VERIFY_PIN_CANCEL("verify_pin_cancel");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    Rif(String str) {
        this.A00 = str;
    }
}
