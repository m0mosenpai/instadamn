package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class OND {
    public static final LinkedHashMap A00(String str, String str2, String str3, String str4, String str5) {
        LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC25229BEm.A1b("experience_id", str2, AbstractC166987dD.A1L("flow_name", str)));
        if (str3 != null) {
            A07.put(CacheBehaviorLogger.SOURCE, str3);
        }
        if (str4 != null) {
            A07.put(AbstractC58361Pu1.A01(0, 9, 38), str4);
        }
        if (str5 != null) {
            A07.put("extra_params_json", str5);
        }
        return A07;
    }
}
