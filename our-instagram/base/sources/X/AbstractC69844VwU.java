package X;

import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* renamed from: X.VwU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69844VwU {
    public static Integer A00(String str) {
        if (str.equals("ALPHA_NUMERIC")) {
            return C05F.A00;
        }
        if (str.equals("ALPHA_NUMERIC_UPPERCASE")) {
            return C05F.A01;
        }
        if (str.equals("NUMERICAL")) {
            return C05F.A0C;
        }
        if (str.equals("STRING")) {
            return C05F.A0N;
        }
        if (str.equals("STRING_UPPERCASE")) {
            return C05F.A0Y;
        }
        if (str.equals("PHONE")) {
            return C05F.A0j;
        }
        if (str.equals(PaymentDetailChangeTypes$Companion.EMAIL)) {
            return C05F.A0u;
        }
        throw new IllegalArgumentException(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ALPHA_NUMERIC_UPPERCASE";
            case 2:
                return "NUMERICAL";
            case 3:
                return "STRING";
            case 4:
                return "STRING_UPPERCASE";
            case 5:
                return "PHONE";
            case 6:
                return PaymentDetailChangeTypes$Companion.EMAIL;
            default:
                return "ALPHA_NUMERIC";
        }
    }
}
