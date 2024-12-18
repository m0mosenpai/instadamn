package X;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.HzH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40597HzH {
    public static void A00(C25621Ms c25621Ms, C23711Eb c23711Eb, ArrayList arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("nudge_name", "alternative_topic_nudge");
            jSONObject.put(AbstractC43591JPw.A00(187), "explore_similar_posts");
            jSONObject.put("last_seen_times", new JSONArray((Collection) arrayList));
            jSONArray.put(jSONObject);
            c25621Ms.A9s("last_seen_data", jSONArray.toString());
            c23711Eb.A9s("last_seen_data", jSONArray.toString());
        } catch (JSONException e) {
            C0w9.A06("alt_topic_set_last_seen", AbstractC43591JPw.A00(262), e);
        }
    }
}
