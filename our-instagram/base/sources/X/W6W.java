package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.Arrays;

/* loaded from: classes11.dex */
public abstract class W6W {
    public static final String A01(ShippingAddress shippingAddress) {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = shippingAddress.A01;
        if (str2 != null && (!AbstractC001900j.A0T(str2))) {
            StringFormatUtil.appendFormatStrLocaleSafe(sb, "%s", AbstractC001800i.A0P(" ", "", "", AbstractC167007dF.A0m(str2, " ", 0), X5N.A00));
        }
        String str3 = shippingAddress.A07;
        if ((str3 != null && !AbstractC001900j.A0T(str3)) || ((str = shippingAddress.A06) != null && !AbstractC001900j.A0T(str))) {
            StringFormatUtil.appendFormatStrLocaleSafe(sb, "%s", ", ");
            if (str3 != null && (!AbstractC001900j.A0T(str3))) {
                StringFormatUtil.appendFormatStrLocaleSafe(sb, "%s", AnonymousClass001.A0C(str3, ' '));
            }
            String str4 = shippingAddress.A06;
            if (str4 != null && (!AbstractC001900j.A0T(str4))) {
                StringFormatUtil.appendFormatStrLocaleSafe(sb, "%s", str4);
            }
        }
        return AbstractC166987dD.A19(sb);
    }

    public static final int A00(ShippingAddress shippingAddress) {
        return Arrays.hashCode(new Object[]{shippingAddress.A05, shippingAddress.A00, shippingAddress.A08, shippingAddress.A09, shippingAddress.A01, shippingAddress.A07, shippingAddress.A02, Boolean.valueOf(shippingAddress.A0B), Boolean.valueOf(shippingAddress.A0A), shippingAddress.A06});
    }

    public static final String A02(ShippingAddress shippingAddress) {
        StringBuilder sb = new StringBuilder();
        String str = shippingAddress.A08;
        if (str != null && (!AbstractC001900j.A0T(str))) {
            StringFormatUtil.appendFormatStrLocaleSafe(sb, "%s", str);
        }
        String str2 = shippingAddress.A09;
        if (str2 != null && (!AbstractC001900j.A0T(str2))) {
            if (sb.length() > 0) {
                StringFormatUtil.appendFormatStrLocaleSafe(sb, "%s", ", ");
            }
            StringFormatUtil.appendFormatStrLocaleSafe(sb, "%s", str2);
        }
        return AbstractC166987dD.A19(sb);
    }
}
