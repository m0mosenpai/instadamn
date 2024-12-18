package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class RhY {
    public static final /* synthetic */ RhY[] A01;
    public static final RhY A02;
    public final String A00;

    static {
        RhY A00 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A02 = A00;
        RhY A002 = A00("CANCEL_OUT_OF_FLOW", 1);
        RhY A003 = A00("CHANGE_PIN_USING_OLD_PIN", 2);
        RhY A004 = A00("CONNECT_FROM_CHECKOUT_CVV_VERIFICATION", 3);
        RhY A005 = A00("CONNECT_FROM_CHECKOUT_PAYPAL_VERIFICATION", 4);
        RhY A006 = A00("CONNECT_FROM_CHECKOUT_PIN_VERIFICATION", 5);
        RhY A007 = A00("CONNECT_FROM_HUB_CVV_VERIFICATION", 6);
        RhY A008 = A00("CONNECT_FROM_HUB_PAYPAL_VERIFICATION", 7);
        RhY A009 = A00("CONNECT_FROM_HUB_PIN_VERIFICATION", 8);
        RhY A0010 = A00("CONNECT_WITH_CVV_AFTER_PIN_FAILURE_FROM_CHECKOUT_DIALOG", 9);
        RhY A0011 = A00("CONNECT_WITH_CVV_AFTER_PIN_FAILURE_FROM_HUB_DIALOG", 10);
        RhY A0012 = A00("CONNECT_WITH_PAYPAL_AFTER_PIN_FAILURE_FROM_CHECKOUT_DIALOG", 11);
        RhY A0013 = A00("CONNECT_WITH_PAYPAL_AFTER_PIN_FAILURE_FROM_HUB_DIALOG", 12);
        RhY A0014 = A00("CREATE_PIN_FROM_HUB", 13);
        RhY A0015 = A00("CREATE_PIN_FROM_PAYMENT", 14);
        RhY A0016 = A00("FORGOT_PIN_RECOVER_WITH_PASSWORD_HUB", 15);
        RhY A0017 = A00("LEAVE_WITHOUT_ENTERING_CVV_TO_CONNECT_DIALOG", 16);
        RhY A0018 = A00("LEAVE_WITHOUT_ENTERING_PIN_TO_CONNECT_DIALOG", 17);
        RhY A0019 = A00("LEAVE_WITHOUT_LOG_IN_PAYPAL_TO_CONNECT_DIALOG", 18);
        RhY A0020 = A00("LOCKED_PIN_RECOVER_WITH_PASSWORD_HUB", 19);
        RhY A0021 = A00("LOCKED_PIN_RECOVER_WITH_PASSWORD_TO_PAY", 20);
        RhY A0022 = A00("RESET_PIN_FROM_LEAVE_WITHOUT_RESETTING_DIALOG", 21);
        RhY A0023 = A00("SETUP_PIN_TO_CREATE_BIO_HUB", 22);
        RhY A0024 = A00("UNABLE_TO_CONNECT_FROM_CHECKOUT", 23);
        RhY A0025 = A00("UNABLE_TO_CONNECT_FROM_HUB", 24);
        RhY A0026 = A00("VERIFY_BIO_TO_DISABLE_BIO_HUB", 25);
        RhY A0027 = A00("VERIFY_BIO_TO_PAY", 26);
        RhY[] rhYArr = new RhY[33];
        System.arraycopy(new RhY[]{A00("VERIFY_PIN_TO_CHECKOUT", 27), A00("VERIFY_PIN_TO_DISABLE_BIO_HUB", 28), A00("VERIFY_PIN_TO_DISABLE_PIN_HUB", 29), A00("VERIFY_PIN_TO_ENABLE_BIO_HUB", 30), A00("VERIFY_PIN_TO_ENABLE_PIN_HUB", 31), A00("VERIFY_PIN_TO_PAY", 32)}, AbstractC31175DnJ.A1b(new RhY[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, rhYArr) ? 1 : 0, rhYArr, 27, 6);
        A01 = rhYArr;
    }

    public static RhY A00(String str, int i) {
        return new RhY(str, i, str);
    }

    public static RhY valueOf(String str) {
        return (RhY) Enum.valueOf(RhY.class, str);
    }

    public static RhY[] values() {
        return (RhY[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RhY(String str, int i, String str2) {
        this.A00 = str2;
    }
}
