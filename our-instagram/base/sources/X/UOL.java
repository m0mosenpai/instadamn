package X;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class UOL extends AbstractC907342m implements InterfaceC72043XIw {
    @Override // X.InterfaceC72043XIw
    public final int BH6() {
        return this.A00.optInt("impression_cooldown_secs");
    }

    @Override // X.InterfaceC72043XIw
    public final int BQH() {
        return this.A00.optInt("maximum_global_impressions");
    }

    @Override // X.InterfaceC72043XIw
    public final int BQI() {
        return this.A00.optInt("maximum_impressions_per_user");
    }

    public UOL(JSONObject jSONObject) {
        super(jSONObject);
    }
}
