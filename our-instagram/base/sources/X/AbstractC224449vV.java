package X;

/* renamed from: X.9vV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224449vV {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PAYMENT_SAVE_AUTOFILL_IAB_CLOSE";
            case 2:
                return "PAYMENT_SAVE_AUTOFILL_NONE";
            case 3:
                return "CONTACT_SAVE_AUTOFILL_CONTACT_AUTOFILL";
            case 4:
                return "CONTACT_SAVE_AUTOFILL_IAB_CLOSE";
            case 5:
                return "CONTACT_SAVE_AUTOFILL_NONE";
            default:
                return "PAYMENT_SAVE_AUTOFILL_CONTACT_AND_PAYMENT_AUTOFILL";
        }
    }
}
