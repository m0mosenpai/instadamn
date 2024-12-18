package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.model.business.Address;
import java.io.StringWriter;

/* renamed from: X.F8u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34248F8u {
    public static String A00(Address address) {
        StringWriter stringWriter = new StringWriter();
        C17z A0S = AbstractC167007dF.A0S(stringWriter);
        String str = address.A04;
        if (str != null) {
            A0S.A0S("address_street", str);
        }
        String str2 = address.A00;
        if (str2 != null) {
            A0S.A0S("city_id", str2);
        }
        String str3 = address.A02;
        if (str3 != null) {
            A0S.A0S(ServerW3CShippingAddressConstants.POSTAL_CODE, str3);
        }
        return AbstractC167017dG.A0l(A0S, stringWriter);
    }
}
