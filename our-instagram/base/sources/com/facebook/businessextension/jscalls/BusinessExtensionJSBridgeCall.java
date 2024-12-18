package com.facebook.businessextension.jscalls;

import X.AbstractC166987dD;
import X.C14360o3;
import X.SMR;
import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class BusinessExtensionJSBridgeCall extends BrowserLiteJSBridgeCall {
    public static SMR A02(Bundle bundle, String str) {
        String string = bundle.getString("callbackID");
        if (string == null) {
            return null;
        }
        String string2 = bundle.getString("callback_result");
        C14360o3.A0B(str, 1);
        return new SMR(str, string, string2, null, true);
    }

    public static Bundle A00(String str, JSONObject jSONObject) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("callbackID", str);
        A0b.putString("callback_result", jSONObject.toString());
        return A0b;
    }

    public static Bundle A01(JSONObject jSONObject) {
        Bundle A0b = AbstractC166987dD.A0b();
        if (jSONObject.has("callbackID")) {
            A0b.putString("callbackID", jSONObject.getString("callbackID"));
        }
        return A0b;
    }
}
