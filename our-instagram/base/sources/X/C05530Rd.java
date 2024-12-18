package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Rd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05530Rd implements C0CD {
    @Override // X.C0CD
    public final /* bridge */ /* synthetic */ void EIU(AbstractC02960Bu abstractC02960Bu, C0CC c0cc) {
        C0VK c0vk = (C0VK) abstractC02960Bu;
        long j = c0vk.A00;
        if (j != 0) {
            c0cc.A7m("coarse_time_ms", j);
        }
        long j2 = c0vk.A02;
        if (j2 != 0) {
            c0cc.A7m("medium_time_ms", j2);
        }
        long j3 = c0vk.A01;
        if (j3 != 0) {
            c0cc.A7m("fine_time_ms", j3);
        }
        long j4 = c0vk.A03;
        if (j4 != 0) {
            c0cc.A7m("wifi_scan_count", j4);
        }
        if (c0vk.A04) {
            C005001p c005001p = c0vk.A05;
            if (!c005001p.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    int size = c005001p.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) c005001p.A05(i);
                        C0C4 c0c4 = (C0C4) c005001p.A06(i);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("coarse_time_ms", c0c4.A00);
                        jSONObject2.put("medium_time_ms", c0c4.A02);
                        jSONObject2.put("fine_time_ms", c0c4.A01);
                        jSONObject.put(str, jSONObject2);
                    }
                    c0cc.A7n("location_tag_time_ms", jSONObject.toString());
                } catch (JSONException e) {
                    android.util.Log.e("LocationMetrics", "Failed to serialize attribution data", e);
                }
            }
        }
    }
}
