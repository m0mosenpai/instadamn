package X;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.api.IpcConstants$RequestAction;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class OIP {
    public final Context A00;
    public final UserSession A01;
    public final ImmutableMap A02;

    public OIP(Context context, ImmutableMap immutableMap, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = immutableMap;
    }

    public final String A00() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        try {
            A0q.put("action", IpcConstants$RequestAction.A0F.toString());
            ImmutableMap immutableMap = this.A02;
            if (immutableMap != null) {
                JSONObject A0q2 = AbstractC31171DnF.A0q();
                Iterator it = immutableMap.entrySet().iterator();
                while (it.hasNext()) {
                    AbstractC50523MSb.A1T(it, A0q2);
                }
                A0q.put("header", A0q2);
            }
        } catch (JSONException e) {
            C1ZU.A00(this.A01, C05F.A0u, e.toString());
        }
        return AbstractC166987dD.A19(A0q);
    }
}
