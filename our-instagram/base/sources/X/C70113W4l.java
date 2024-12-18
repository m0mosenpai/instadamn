package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.W4l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70113W4l {
    public String A0E = "";
    public String A0F = "";
    public String A0D = "";
    public long A04 = 0;
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A07 = 0;
    public long A0A = 0;
    public long A0B = 0;
    public long A08 = 0;
    public long A09 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public Map A0G = new HashMap();
    public long A0C = 0;
    public boolean A0I = false;
    public boolean A0H = false;

    public static C70113W4l A00(JSONObject jSONObject) {
        C70113W4l c70113W4l = new C70113W4l();
        c70113W4l.A0E = jSONObject.getString("cache_name");
        c70113W4l.A0F = jSONObject.getString("session_key");
        c70113W4l.A0D = jSONObject.getString("cache_key");
        c70113W4l.A04 = jSONObject.getLong("item_size_b");
        c70113W4l.A00 = jSONObject.getLong("action_count");
        c70113W4l.A01 = jSONObject.getLong("get_count");
        c70113W4l.A03 = jSONObject.getLong("insert_count");
        c70113W4l.A07 = jSONObject.getLong("remove_count");
        c70113W4l.A02 = jSONObject.getLong("hit_count");
        c70113W4l.A05 = jSONObject.getLong("refetch_count");
        c70113W4l.A06 = jSONObject.getLong("refresh_count");
        c70113W4l.A08 = jSONObject.getLong("remove_count_by_eviction");
        c70113W4l.A09 = jSONObject.getLong("remove_count_by_staleness");
        c70113W4l.A0B = jSONObject.getLong("remove_count_by_user");
        c70113W4l.A0A = jSONObject.getLong("remove_count_by_unknown");
        Map map = c70113W4l.A0G;
        map.clear();
        JSONObject jSONObject2 = jSONObject.getJSONObject("additional_metadata");
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            map.put(next, jSONObject2.getString(next));
        }
        c70113W4l.A0C = jSONObject.getLong("tracking_start_time_ms");
        c70113W4l.A0I = jSONObject.getBoolean("last_known_existence");
        c70113W4l.A0H = jSONObject.getBoolean("had_known_existence");
        return c70113W4l;
    }

    public final HashMap A01() {
        HashMap hashMap = new HashMap();
        hashMap.put("item_size_b", Long.valueOf(this.A04));
        hashMap.put("action_count", Long.valueOf(this.A00));
        hashMap.put("get_count", Long.valueOf(this.A01));
        hashMap.put("insert_count", Long.valueOf(this.A03));
        hashMap.put("remove_count", Long.valueOf(this.A07));
        hashMap.put("hit_count", Long.valueOf(this.A02));
        hashMap.put("refetch_count", Long.valueOf(this.A05));
        hashMap.put("refresh_count", Long.valueOf(this.A06));
        hashMap.put("remove_count_by_eviction", Long.valueOf(this.A08));
        hashMap.put("remove_count_by_staleness", Long.valueOf(this.A09));
        hashMap.put("remove_count_by_user", Long.valueOf(this.A0B));
        hashMap.put("remove_count_by_unknown", Long.valueOf(this.A0A));
        return hashMap;
    }
}
