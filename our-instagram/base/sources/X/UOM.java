package X;

import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class UOM extends AbstractC907342m implements MS9 {
    @Override // X.MS9
    public final ImmutableList C5O() {
        return A02("target_actions", C44990Jvg.class);
    }

    @Override // X.MS9
    public final String C5Y() {
        return A05("target_user_id");
    }

    public UOM(JSONObject jSONObject) {
        super(jSONObject);
    }
}
