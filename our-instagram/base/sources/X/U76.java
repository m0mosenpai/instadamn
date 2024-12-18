package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* loaded from: classes11.dex */
public abstract class U76 {
    public static Integer A00(String str) {
        if (str.equals("ForceDarkMode")) {
            return C05F.A00;
        }
        if (str.equals("ForceLightMode")) {
            return C05F.A01;
        }
        if (str.equals(ServerW3CShippingAddressConstants.DEFAULT)) {
            return C05F.A0C;
        }
        throw new IllegalArgumentException(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ForceLightMode";
            case 2:
                return ServerW3CShippingAddressConstants.DEFAULT;
            default:
                return "ForceDarkMode";
        }
    }
}
