package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5Nj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116045Nj {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;

    public final JSONObject A00() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("startWalltime", this.A05);
            jSONObject.put("startUptime", this.A04);
            jSONObject.put("endWalltime", this.A02);
            jSONObject.put("endUptime", this.A01);
            jSONObject.put("startEvent", this.A03);
            jSONObject.put("endEvent", this.A00);
            return jSONObject;
        } catch (JSONException e) {
            C0K8.A0F("TimeInAppIntervalWithEvent", "Unable to create json", e);
            return jSONObject;
        }
    }

    public C116045Nj(long j, long j2, long j3, long j4, long j5, long j6) {
        this.A05 = j;
        this.A04 = j2;
        this.A02 = j3;
        this.A01 = j4;
        this.A03 = j5;
        this.A00 = j6;
    }
}
