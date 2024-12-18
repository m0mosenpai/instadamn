package X;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface BDB {
    void enqueueEvent(JSONObject jSONObject);

    boolean isAlive();

    void stop();
}
