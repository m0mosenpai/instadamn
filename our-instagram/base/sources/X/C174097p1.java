package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.7p1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174097p1 extends AbstractC907342m implements InterfaceC174107p2 {
    @Override // X.InterfaceC174107p2
    public final ImmutableList AlZ() {
        return A02("capabilities_min_version_models", C174237pF.class);
    }

    @Override // X.InterfaceC174107p2
    public final String BPa() {
        return A05("manifest_json");
    }

    @Override // X.InterfaceC174107p2
    public final InterfaceC174127p4 Bas() {
        return (InterfaceC174127p4) A00(C174117p3.class, "packaged_file");
    }

    @Override // X.InterfaceC174107p2
    public final boolean CEG() {
        return A06("uses_flm_capability");
    }

    @Override // X.InterfaceC174107p2
    public final String getId() {
        return A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public C174097p1(JSONObject jSONObject) {
        super(jSONObject);
    }
}
