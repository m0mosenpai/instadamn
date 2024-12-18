package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class V2C extends AbstractC68956Veu {
    public final UserSession A00;

    public V2C(UserSession userSession) {
        this.A00 = userSession;
        super.A00 = 2131975602;
        HashMap hashMap = new HashMap();
        int length = C05F.A00(1).length;
        for (int i = 0; i < length; i++) {
            hashMap.put(2131975602, "ONE_DAY");
        }
        this.A01 = hashMap;
    }
}
