package X;

import com.instagram.api.schemas.PrivacyDisclosureInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class HrT {
    public static Map A00(PrivacyDisclosureInfo privacyDisclosureInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (privacyDisclosureInfo.B4W() != null) {
            A1I.put("fbAdvertiserDisclosure", privacyDisclosureInfo.B4W());
        }
        if (privacyDisclosureInfo.Bgf() != null) {
            A1I.put("privacyString", privacyDisclosureInfo.Bgf());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
