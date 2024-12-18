package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xcn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72400Xcn {
    public static final /* synthetic */ EnumC72400Xcn[] A01;
    public static final EnumC72400Xcn A02;
    public final String A00;

    static {
        EnumC72400Xcn A00 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A02 = A00;
        EnumC72400Xcn A002 = A00("CHANGE_PIN_CONFIRM_NEW_PIN", 1);
        EnumC72400Xcn A003 = A00("CHANGE_PIN_CREATE_NEW_PIN", 2);
        EnumC72400Xcn A004 = A00("CHANGE_PIN_NEW_PIN_CREATED", 3);
        EnumC72400Xcn A005 = A00("CONFIRM_PIN", 4);
        EnumC72400Xcn A006 = A00("CONNECT_CVV_VERIFICATION", 5);
        EnumC72400Xcn A007 = A00("CONNECT_PAYPAL_VERIFICATION", 6);
        EnumC72400Xcn A008 = A00("CONNECT_PIN_VERIFICATION", 7);
        EnumC72400Xcn A009 = A00("CONNECT_WITH_PIN_AUTH_FAILURE_CVV_FALLBACK", 8);
        EnumC72400Xcn A0010 = A00("CONNECT_WITH_PIN_AUTH_FAILURE_PAYPAL_FALLBACK", 9);
        EnumC72400Xcn A0011 = A00("CONNECT_WITH_PIN_AUTH_FAILURE_SDC_FALLBACK", 10);
        EnumC72400Xcn A0012 = A00("CREATE_BIO", 11);
        EnumC72400Xcn A0013 = A00("CREATE_PIN", 12);
        EnumC72400Xcn A0014 = A00("DISABLE_BIO_CONFORMATION", 13);
        EnumC72400Xcn A0015 = A00("DISABLE_PIN_CONFIRMATION", 14);
        EnumC72400Xcn A0016 = A00("FORGOT_PIN_RESET_WITH_PASSWORD", 15);
        EnumC72400Xcn A0017 = A00("LEAVE_WITHOUT_ENTERING_CVV_TO_CONNECT_DIALOG", 16);
        EnumC72400Xcn A0018 = A00("LEAVE_WITHOUT_ENTERING_PIN_TO_CONNECT_DIALOG", 17);
        EnumC72400Xcn A0019 = A00("LEAVE_WITHOUT_LOG_IN_PAYPAL_TO_CONNECT_DIALOG", 18);
        EnumC72400Xcn A0020 = A00("LEAVE_WITHOUT_RESETTING_PIN_CONFIRMATION", 19);
        EnumC72400Xcn A0021 = A00("PIN_CREATED", 20);
        EnumC72400Xcn A0022 = A00("PIN_VERIFY_TO_CHECKOUT", 21);
        EnumC72400Xcn A0023 = A00("RESET_CONFIRM_NEW_PIN", 22);
        EnumC72400Xcn A0024 = A00("RESET_CREATE_NEW_PIN", 23);
        EnumC72400Xcn A0025 = A00("RESET_NEW_PIN_CREATED", 24);
        EnumC72400Xcn A0026 = A00("RESET_PIN_WITH_PASSWORD", 25);
        EnumC72400Xcn A0027 = A00("SETUP_PIN_TO_CREATE_BIO_CONFIRMATION", 26);
        EnumC72400Xcn[] enumC72400XcnArr = new EnumC72400Xcn[35];
        System.arraycopy(new EnumC72400Xcn[]{A00("UNABLE_TO_CONNECT_CHECKOUT", 27), A00("UNABLE_TO_CONNECT_HUB", 28), A00("VERIFY_BIO_TO_DISABLE_BIO", 29), A00("VERIFY_BIO_TO_ENABLE_BIO", 30), A00("VERIFY_BIO_TO_PAY", 31), A00("VERIFY_PIN_HUB", 32), A00("VERIFY_PIN_TO_CHANGE_PIN", 33), A00("VERIFY_PIN_TO_PAY", 34)}, AbstractC31175DnJ.A1b(new EnumC72400Xcn[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, enumC72400XcnArr) ? 1 : 0, enumC72400XcnArr, 27, 8);
        A01 = enumC72400XcnArr;
    }

    public static EnumC72400Xcn A00(String str, int i) {
        return new EnumC72400Xcn(str, i, str);
    }

    public static EnumC72400Xcn valueOf(String str) {
        return (EnumC72400Xcn) Enum.valueOf(EnumC72400Xcn.class, str);
    }

    public static EnumC72400Xcn[] values() {
        return (EnumC72400Xcn[]) A01.clone();
    }

    public EnumC72400Xcn(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
