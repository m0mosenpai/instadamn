package X;

import com.facebookpay.offsite.models.message.OffsiteShippingType$Companion;
import kotlin.Deprecated;

@Deprecated(message = "To be replaced with FulfillmentType")
/* renamed from: X.VwR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69841VwR {
    public static Integer A00(String str) {
        if (str.equals("SHIPPING")) {
            return C05F.A00;
        }
        if (str.equals(OffsiteShippingType$Companion.DELIVERY)) {
            return C05F.A01;
        }
        if (str.equals("PICKUP")) {
            return C05F.A0C;
        }
        throw new IllegalArgumentException(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return OffsiteShippingType$Companion.DELIVERY;
            case 2:
                return "PICKUP";
            default:
                return "SHIPPING";
        }
    }
}
