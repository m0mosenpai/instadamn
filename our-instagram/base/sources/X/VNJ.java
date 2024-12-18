package X;

import com.facebook.common.locale.Country;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.shippingaddress.model.ShippingAddress;

/* loaded from: classes11.dex */
public abstract class VNJ {
    public static final String A00(KnownData knownData, String str, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
        }
        ShippingAddress shippingAddress = knownData.A00;
        boolean z3 = true;
        if (shippingAddress != null) {
            String str2 = shippingAddress.A08;
            if (str2 != null) {
                if (!z) {
                    str2 = null;
                }
                if (str2 != null) {
                    if (AbstractC167007dF.A1O(sb.length())) {
                        sb.append("\n");
                    }
                    sb.append(str2);
                    if (!z2 && (shippingAddress.A01 != null || shippingAddress.A07 != null || shippingAddress.A02 != null)) {
                        sb.append(",\n");
                    }
                }
            }
            if (!z2) {
                String str3 = shippingAddress.A01;
                if (str3 != null) {
                    sb.append(str3);
                }
                String str4 = shippingAddress.A07;
                if (str4 != null) {
                    if (str3 != null) {
                        sb.append(", ");
                    }
                    sb.append(str4);
                }
                String str5 = shippingAddress.A02;
                if (str5 != null) {
                    if (str3 != null || str4 != null) {
                        sb.append(", ");
                    }
                    try {
                        str5 = Country.A00(null, str5).A00.getDisplayCountry();
                    } catch (IllegalArgumentException unused) {
                    }
                    sb.append(str5);
                }
            }
        }
        if (sb.length() <= 0) {
            z3 = false;
        }
        if (!z3) {
            knownData = null;
        }
        if (knownData == null) {
            return null;
        }
        return sb.toString();
    }
}
