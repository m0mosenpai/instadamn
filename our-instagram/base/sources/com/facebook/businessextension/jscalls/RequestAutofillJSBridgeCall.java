package com.facebook.businessextension.jscalls;

import X.AbstractC166987dD;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC63254SgB;
import X.C63476SlH;
import X.InterfaceC65623TpI;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class RequestAutofillJSBridgeCall extends BusinessExtensionJSBridgeCall {
    public static final InterfaceC65623TpI CREATOR = new C63476SlH(4);

    public final LinkedHashSet A04() {
        RequestAutofillJSBridgeCallData requestAutofillJSBridgeCallData = (RequestAutofillJSBridgeCallData) AbstractC58320PtC.A0r(this.A02, "requestAutofillData");
        if (requestAutofillJSBridgeCallData == null) {
            return null;
        }
        return requestAutofillJSBridgeCallData.A02;
    }

    public static Bundle A03(JSONObject jSONObject) {
        String str;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        Bundle A01 = BusinessExtensionJSBridgeCall.A01(jSONObject);
        try {
            str = jSONObject.getString("selectedAutoCompleteTag");
        } catch (JSONException e) {
            AbstractC63254SgB.A00("RequestAutofillJSBridgeCall", "Failed to get autofill tag", e, e);
            str = null;
        }
        try {
            JSONArray jSONArray = new JSONArray(jSONObject.getString("autofillFields"));
            ArrayList A1E = AbstractC166987dD.A1E();
            for (int i = 0; i < jSONArray.length(); i = AbstractC58322PtE.A0C(A1E, jSONArray, i)) {
            }
            Collections.sort(A1E);
            linkedHashSet = new LinkedHashSet(A1E);
        } catch (JSONException e2) {
            AbstractC63254SgB.A00("RequestAutofillJSBridgeCall", "Failed to parseRequestedFields", e2, e2);
            linkedHashSet = null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray(jSONObject.getString("allFields"));
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (int i2 = 0; i2 < jSONArray2.length(); i2 = AbstractC58322PtE.A0C(A1E2, jSONArray2, i2)) {
            }
            Collections.sort(A1E2);
            linkedHashSet2 = new LinkedHashSet(A1E2);
        } catch (JSONException e3) {
            AbstractC63254SgB.A00("RequestAutofillJSBridgeCall", "Failed to parseAllFields", e3, e3);
            linkedHashSet2 = null;
        }
        A01.putParcelable("requestAutofillData", new RequestAutofillJSBridgeCallData(str, linkedHashSet, linkedHashSet2));
        return A01;
    }
}
