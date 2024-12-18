package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.AEi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23052AEi {
    public static final C1ON A00(C1OL c1ol, UserSession userSession, String str) {
        C14360o3.A0B(str, 2);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("warning/check_offensive_text/");
        A0c.A0R(N38.class, C54915OQm.class);
        A0c.A9s("request_type", AbstractC167007dF.A0h("CAPTION"));
        A0c.A9s("text", str);
        A0c.A9s("media_id", null);
        if (c1ol != null) {
            A0c.A00 = c1ol;
        }
        A0c.A0R = true;
        return A0c.A0N();
    }

    public static final C1ON A01(C1OL c1ol, UserSession userSession, List list) {
        C14360o3.A0B(list, 2);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("warning/check_offensive_multi_text/");
        A0c.A0R(N38.class, C54915OQm.class);
        A0c.A9s("request_type", AbstractC167007dF.A0h("CAPTION"));
        A0c.A9s("text_list", new JSONArray((Collection) list).toString());
        A0c.A9s("media_id", null);
        if (c1ol != null) {
            A0c.A00 = c1ol;
        }
        A0c.A0R = true;
        return A0c.A0N();
    }
}
