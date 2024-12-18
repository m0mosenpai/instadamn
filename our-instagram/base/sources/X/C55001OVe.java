package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OVe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55001OVe {
    public static C55001OVe A02;
    public O9X A00;
    public C55655Ong A01;

    public static final void A00(C55001OVe c55001OVe, String str, JSONObject jSONObject) {
        String str2;
        O9X o9x = c55001OVe.A00;
        if (o9x == null) {
            str2 = "flipperPluginBridge";
        } else if (o9x.A00 == null) {
            str2 = "avatarDebuggerFlipperPlugin";
        } else {
            String str3 = o9x.A01;
            JSONObject A0q = AbstractC31171DnF.A0q();
            try {
                A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
                try {
                    A0q.put("data", jSONObject);
                    JSONObject A0q2 = AbstractC31171DnF.A0q();
                    try {
                        A0q2.put("instanceId", str3);
                        try {
                            A0q2.put("timestamp", Long.valueOf(AbstractC31177DnL.A06()));
                            try {
                                A0q2.put("event", A0q);
                                return;
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
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
            } catch (JSONException e5) {
                throw new RuntimeException(e5);
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public final void A01(String str, String str2, String str3, Map map) {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("requestId", str2);
        A0q.put("choices", new JSONObject(map));
        if (str3 != null) {
            A0q.put(TraceFieldType.ErrorCode, str3);
        }
        A00(this, str, A0q);
    }
}
