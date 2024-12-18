package X;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class C4H extends CA0 {
    public final JSONObject A00;

    public C4H(JSONObject jSONObject) {
        C14360o3.A0B(jSONObject, 1);
        this.A00 = jSONObject;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C4H) && C14360o3.A0K(this.A00, ((C4H) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ProcessPlatformEvent(jsonObject=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
