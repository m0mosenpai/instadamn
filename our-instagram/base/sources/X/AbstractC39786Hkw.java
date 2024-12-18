package X;

import com.instagram.api.schemas.BusinessProfileDict;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hkw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39786Hkw {
    public static Map A00(BusinessProfileDict businessProfileDict) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (businessProfileDict.getId() != null) {
            AbstractC37300Gc1.A12(businessProfileDict.getId(), A1I);
        }
        if (businessProfileDict.Bhu() != null) {
            ImageUrl Bhu = businessProfileDict.Bhu();
            if (Bhu != null) {
                str = Bhu.getUrl();
            } else {
                str = null;
            }
            A1I.put("profile_pic_url", str);
        }
        if (businessProfileDict.getUsername() != null) {
            A1I.put(AbstractC37309GcB.A01(), businessProfileDict.getUsername());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
