package X;

import org.json.JSONObject;

/* renamed from: X.QHr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58907QHr extends AbstractC907342m implements C4Q0 {
    @Override // X.C4Q0
    public final boolean BJc() {
        return A06("is_basic_ads_opted_in");
    }

    @Override // X.C4Q0
    public final boolean BJd() {
        return A06("is_basic_ads_youth");
    }

    @Override // X.C4Q0
    public final EnumC23041Aj C8G() {
        return (EnumC23041Aj) A04("tier", EnumC23041Aj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.C4Q0
    public final boolean CL4() {
        return !this.A00.isNull("is_basic_ads_opted_in");
    }

    @Override // X.C4Q0
    public final boolean CL5() {
        return !this.A00.isNull("is_basic_ads_youth");
    }

    public C58907QHr(JSONObject jSONObject) {
        super(jSONObject);
    }
}
