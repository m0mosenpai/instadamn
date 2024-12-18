package X;

import org.json.JSONObject;

/* renamed from: X.7pF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174237pF extends AbstractC907342m implements InterfaceC174247pG {
    @Override // X.InterfaceC174247pG
    public final String Ala() {
        return A05("capability_name");
    }

    @Override // X.InterfaceC174247pG
    public final int BU1() {
        return this.A00.optInt("min_version");
    }

    public C174237pF(JSONObject jSONObject) {
        super(jSONObject);
    }
}
