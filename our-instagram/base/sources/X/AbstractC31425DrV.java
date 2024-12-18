package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.DrV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31425DrV {
    public static final C1ON A00(UserSession userSession, String str, String str2, String str3, Map map) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        String str4 = null;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("news/log/");
        A0c.A0P(null, C40781ul.class, C55702hA.class, false);
        A0c.A9s("action", str);
        A0c.A9s("pk", str2);
        A0c.A0H("tuuid", str3);
        if (map != null) {
            str4 = AbstractC31175DnJ.A0d(map);
        }
        A0c.A0H("controls", str4);
        return A0c.A0N();
    }
}
