package X;

/* loaded from: classes10.dex */
public abstract class SQk {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PAYMENT_AUTOFILL";
            case 2:
                return "CONTACT_AND_PAYMENT_AUTOFILL";
            default:
                return "CONTACT_AUTOFILL";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "Payment";
            case 2:
                return "Hybrid";
            default:
                return "Contact";
        }
    }
}
