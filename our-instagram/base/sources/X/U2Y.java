package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class U2Y {
    public static final LinkedHashMap A00(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        List list = U02.A00(userSession).A00.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC50522MSa.A09(list));
        for (Object obj : list) {
            String string = context.getString(2131973063, ((C66129U0n) obj).A01);
            C14360o3.A07(string);
            linkedHashMap.put(string, obj);
        }
        return linkedHashMap;
    }
}
