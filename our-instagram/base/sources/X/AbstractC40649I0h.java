package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.I0h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40649I0h {
    public static final C1ON A00(UserSession userSession, List list) {
        AbstractC167017dG.A1N(userSession, list);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONObject().put("m_pk", ((C1NI) it.next()).getId()));
        }
        String A19 = AbstractC166987dD.A19(jSONArray);
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        A0q.A06();
        A0q.A03();
        A0q.A0B("api/v1/accounts/get_controls_filtered_media/");
        A0q.A0R(H8a.class, IOE.class);
        C1ON A0T = AbstractC31172DnG.A0T(A0q, "media_infos", A19);
        C14360o3.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetControlsFilteredMediaResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetControlsFilteredMediaResponse>>");
        return A0T;
    }
}
