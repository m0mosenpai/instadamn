package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5j9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123955j9 {
    public static String A01(UserSession userSession, C38321qM c38321qM) {
        String organicTrackingToken;
        if (c38321qM.CdW()) {
            organicTrackingToken = AbstractC41071vF.A0F(userSession, c38321qM);
        } else {
            organicTrackingToken = c38321qM.A0C.getOrganicTrackingToken();
        }
        return A00(null, organicTrackingToken, c38321qM.CdW());
    }

    public static String A00(InterfaceC30930Dik interfaceC30930Dik, String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tracking_token", str);
            jSONObject.put("is_sponsored", z);
            if (interfaceC30930Dik != null) {
                for (Map.Entry entry : interfaceC30930Dik.B3g().entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            C0w9.A03("AutomatedLogging_LogContext", "Error getting tracking");
            return null;
        }
    }

    public static ArrayList A02(C114845Gu c114845Gu) {
        ArrayList arrayList = new ArrayList();
        for (C71353Hw c71353Hw : c114845Gu.A05) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A01((EnumC71343Hv) c71353Hw.A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            if (c71353Hw.A00 != null) {
                c0Zx.A05("index", Long.valueOf(r0.intValue()));
            }
            String str = c71353Hw.A03;
            if (str != null) {
                c0Zx.A06("thumbnail_id", str);
            }
            String str2 = c71353Hw.A02;
            if (str2 != null) {
                c0Zx.A06("product_id", str2);
            }
            arrayList.add(c0Zx);
        }
        return arrayList;
    }
}
