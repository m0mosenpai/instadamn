package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I9V {
    public static YQT A00(UserSession userSession, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, List list, boolean z, boolean z2) {
        Object obj;
        if (z2) {
            C12210kP A0P = AbstractC31177DnL.A0P(userSession);
            A0P.A01 = "music_ads_audio_player";
            C18920wW A00 = A0P.A00();
            if (l != null) {
                long longValue = l.longValue();
                if (l2 != null) {
                    obj = new J03(A00, l4, l3, str, str3, str2, list, longValue, l2.longValue(), z);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            obj = new Object();
        }
        return (YQT) obj;
    }
}
