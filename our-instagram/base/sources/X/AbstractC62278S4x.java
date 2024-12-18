package X;

import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.S4x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62278S4x {
    public static final int A00(ImmutableList immutableList) {
        C14360o3.A0B(immutableList, 0);
        C1LC A0I = AbstractC43592JPx.A0I(immutableList);
        while (A0I.hasNext()) {
            JSONObject jSONObject = ((AbstractC907342m) A0I.next()).A00;
            if (jSONObject.optInt("qrt_experiment_id") == 8) {
                return jSONObject.optInt("qrt_version_id");
            }
        }
        return -1;
    }
}
