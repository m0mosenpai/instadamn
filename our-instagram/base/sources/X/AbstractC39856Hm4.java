package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hm4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39856Hm4 {
    public static Map A00(JM3 jm3) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jm3.AdD() != null) {
            A1I.put("attribution_call_to_action", jm3.AdD());
        }
        if (jm3.AdI() != null) {
            A1I.put("attribution_owner_id", jm3.AdI());
        }
        User AdJ = jm3.AdJ();
        if (AdJ != null) {
            A1I.put("attribution_owner_user_dict", AdJ.A07());
        }
        if (jm3.AdL() != null) {
            A1I.put("attribution_target_email", jm3.AdL());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
