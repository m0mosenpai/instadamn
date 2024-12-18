package X;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class S1E {
    public static JSONObject A00(Map map) {
        if (!map.isEmpty()) {
            JSONObject A0q = AbstractC31171DnF.A0q();
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                AbstractC50523MSb.A1T(A15, A0q);
            }
            return A0q;
        }
        return null;
    }
}
