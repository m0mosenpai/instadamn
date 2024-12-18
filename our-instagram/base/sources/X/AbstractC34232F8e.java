package X;

/* renamed from: X.F8e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34232F8e {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "authenticator_app";
            case 2:
                return "authenticator_app_multiple_totp";
            case 3:
                return "email";
            case 4:
                return "whatsapp";
            case 5:
                return "unknown";
            default:
                return "sms";
        }
    }
}
