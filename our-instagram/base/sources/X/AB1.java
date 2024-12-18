package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AB1 {
    public final /* synthetic */ C214619ez A00;

    public AB1(C214619ez c214619ez) {
        this.A00 = c214619ez;
    }

    public final void A00() {
        C214619ez c214619ez = this.A00;
        AAB A01 = c214619ez.A01();
        AKN akn = A01.A03;
        if (akn.A00 != 1) {
            C23432Aa5 c23432Aa5 = akn.A09;
            c23432Aa5.A04(akn.A0C);
            C23432Aa5.A00(c23432Aa5).enable(true);
            InterfaceC176367st interfaceC176367st = (InterfaceC176367st) akn.A0G.C4Q().BZG(InterfaceC176367st.A00);
            if (interfaceC176367st != null) {
                interfaceC176367st.setUseArCoreIfSupported(true);
            }
            akn.A00 = 1;
        }
        C22990ABp c22990ABp = A01.A06;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "onAR3DToggleSwitchStateChanged");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("newValue", "AR");
        jSONObject.put("data", jSONObject2);
        c22990ABp.A00(jSONObject);
        c214619ez.A0B.A01();
        Integer num = C05F.A00;
        C14360o3.A0B(num, 0);
        c214619ez.A0F = num;
    }
}
