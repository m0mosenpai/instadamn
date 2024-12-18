package X;

import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.Ks5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47110Ks5 {
    public static C1ON A00(GiphyRequestSurface giphyRequestSurface, UserSession userSession, String str, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((EnumC46201Kcd) it.next()).A00);
        }
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        JQ0.A1F(A0N, jSONArray, str);
        A0N.A9s("request_surface", giphyRequestSurface.toString());
        return AbstractC31172DnG.A0S(A0N, K8R.class, C47877LCx.class);
    }
}
