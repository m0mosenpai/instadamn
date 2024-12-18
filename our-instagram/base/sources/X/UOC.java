package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class UOC extends AbstractC907342m implements XJl {
    @Override // X.XJl
    public final XHl BHA() {
        return (XHl) A00(UO9.class, "impression_settings");
    }

    @Override // X.XJl
    public final XHm BKH() {
        return (XHm) A00(UOA.class, "ixt_flow_target");
    }

    @Override // X.XJl
    public final ImmutableList C5b() {
        return A02("targets", UOB.class);
    }

    @Override // X.XJl
    public final String CBn() {
        return A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    @Override // X.XJl
    public final int getPriority() {
        return this.A00.optInt("priority");
    }

    public UOC(JSONObject jSONObject) {
        super(jSONObject);
    }
}
