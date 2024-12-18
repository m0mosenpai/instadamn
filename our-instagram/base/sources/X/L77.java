package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes8.dex */
public final class L77 {
    public final C0JO A00;
    public final Map A01;
    public final UserSession A02;

    public final void A00() {
        Map map = this.A01;
        if (map.containsKey("open_camera")) {
            Object obj = map.get("open_camera");
            if (obj != null) {
                ((Number) obj).longValue();
                this.A00.now();
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        map.remove("open_camera");
    }

    public L77(C0JO c0jo, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = c0jo;
        Map synchronizedMap = Collections.synchronizedMap(AbstractC166987dD.A1G());
        C14360o3.A07(synchronizedMap);
        this.A01 = synchronizedMap;
    }
}
