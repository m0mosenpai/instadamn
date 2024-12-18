package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class FAC {
    public static final JSONObject A00(String str) {
        JSONObject A0q = AbstractC31171DnF.A0q();
        try {
            A0q.put("surface", AbstractC111324zv.A00(5118));
            A0q.put("comment_id", str);
            return A0q;
        } catch (JSONException e) {
            C0w9.A03("Profile Fragment", AbstractC166997dE.A0y(AbstractC111324zv.A00(3590), e));
            return A0q;
        }
    }
}
