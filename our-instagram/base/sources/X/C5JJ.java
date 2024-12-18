package X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5JJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5JJ {
    public final float A00;
    public final C1125456i A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C5JJ c5jj = (C5JJ) obj;
            if (Float.compare(c5jj.A00, this.A00) != 0 || !this.A01.equals(c5jj.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Float.valueOf(this.A00)});
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mTargetTimeRange", this.A01.A04());
            jSONObject.put("mSpeed", this.A00);
            return jSONObject.toString();
        } catch (JSONException e) {
            if (e.getMessage() == null) {
                return "";
            }
            return e.getMessage();
        }
    }

    public C5JJ(JSONObject jSONObject) {
        this.A01 = C1125456i.A00(jSONObject.getJSONObject("mTargetTimeRange"));
        this.A00 = (float) jSONObject.getDouble("mSpeed");
    }

    public C5JJ(C1125456i c1125456i, float f) {
        this.A01 = c1125456i;
        this.A00 = f;
    }
}
