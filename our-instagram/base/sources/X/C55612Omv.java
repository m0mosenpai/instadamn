package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.fbavatar.cdsavatareditor.richavatarretextureview.impl.AvatarRetextureSparkPreviewController;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Omv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55612Omv implements InterfaceC1815083d {
    public static final String A03;
    public final C90O A00;
    public final C1814883b A01;
    public final C54577O9e A02;

    static {
        Map map = C0YZ.A03;
        A03 = AbstractC13230m9.A01(C55612Omv.class);
    }

    @Override // X.InterfaceC1815083d
    public final void APG(JSONObject jSONObject) {
        OF6 of6;
        try {
            String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            JSONObject A0q = AbstractC31171DnF.A0q();
            if (jSONObject.has("data")) {
                A0q = jSONObject.getJSONObject("data");
            }
            C54577O9e c54577O9e = this.A02;
            C14360o3.A0A(string);
            C14360o3.A0B(string, 0);
            AvatarRetextureSparkPreviewController avatarRetextureSparkPreviewController = c54577O9e.A00;
            InterfaceC103384lE interfaceC103384lE = avatarRetextureSparkPreviewController.A02;
            if (interfaceC103384lE != null) {
                C102884kP c102884kP = c54577O9e.A02;
                AbstractC166987dD.A1Z(new C50112MAl(A0q, interfaceC103384lE, c54577O9e.A01, c102884kP, string, null, 0), AbstractC50523MSb.A0e());
            }
            if (string.equals("ready") && (of6 = avatarRetextureSparkPreviewController.A04.A00) != null) {
                AKN akn = of6.A03;
                if (akn == null) {
                    C14360o3.A0F("richMediaViewer3d");
                    throw C00O.createAndThrow();
                }
                View Bfy = akn.A0E.Bfy();
                C14360o3.A07(Bfy);
                Bfy.setAlpha(1.0f);
            }
        } catch (JSONException e) {
            C0K8.A0F(A03, "didReceiveEngineEvent could not get event type or data", e);
        }
    }

    public C55612Omv(C54577O9e c54577O9e) {
        this.A02 = c54577O9e;
        C1814883b c1814883b = new C1814883b();
        this.A01 = c1814883b;
        this.A00 = new C90O(this, c1814883b);
    }
}
