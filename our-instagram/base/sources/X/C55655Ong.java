package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.flipper.core.FlipperPlugin;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ong, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55655Ong implements FlipperPlugin {
    public static C55655Ong A01;
    public HashMap A00 = AbstractC166987dD.A1G();

    public final void A00(String str, String str2, JSONObject jSONObject) {
        JSONObject A0q = AbstractC31171DnF.A0q();
        try {
            A0q.put("instanceId", str);
            try {
                A0q.put("timestamp", Long.valueOf(AbstractC31177DnL.A06()));
                try {
                    A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
                    if (jSONObject != null) {
                        try {
                            A0q.put("payload", jSONObject);
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } catch (JSONException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (JSONException e3) {
                throw new RuntimeException(e3);
            }
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }
}
