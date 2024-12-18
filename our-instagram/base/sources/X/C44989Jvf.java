package X;

import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.Jvf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44989Jvf extends AbstractC907342m implements MS8 {
    @Override // X.MS8
    public final EnumC44167JfW AYi() {
        return (EnumC44167JfW) A04("action_type", EnumC44167JfW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.MS8
    public final ImmutableList BOQ() {
        return A03("locations", EnumC44168JfX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public C44989Jvf(JSONObject jSONObject) {
        super(jSONObject);
    }
}
