package X;

import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "This class is deprecated, please use BusinessFlowAnalyticsLogger instead", replaceWith = @ReplaceWith(expression = "com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger", imports = {}))
/* loaded from: classes6.dex */
public abstract class F0F {
    public static final HashMap A00(BusinessInfo businessInfo) {
        String str;
        String str2;
        C14360o3.A0B(businessInfo, 0);
        String str3 = businessInfo.A0B;
        if (str3 == null) {
            str3 = "";
        }
        PublicPhoneContact publicPhoneContact = businessInfo.A01;
        String str4 = "";
        if (publicPhoneContact != null) {
            String str5 = publicPhoneContact.A02;
            if (str5 == null || str5.length() == 0 || (str2 = publicPhoneContact.A03) == null) {
                str2 = "";
            }
            str4 = str2;
        }
        Address address = businessInfo.A00;
        if (address == null || (str = address.A03) == null) {
            str = "";
        }
        String valueOf = String.valueOf(businessInfo.A0S);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("email", str3);
        A1G.put("phone", str4);
        A1G.put("address", str);
        A1G.put("page_id", businessInfo.A0J);
        A1G.put("category_id", businessInfo.A09);
        A1G.put("should_show_public_contacts", valueOf);
        A1G.put("is_profile_audio_call_enabled", String.valueOf(businessInfo.A0P));
        return A1G;
    }
}
