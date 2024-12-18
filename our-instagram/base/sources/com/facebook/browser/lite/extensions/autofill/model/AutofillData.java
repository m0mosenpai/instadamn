package com.facebook.browser.lite.extensions.autofill.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31171DnF;
import X.AbstractC43593JPy;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class AutofillData implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(15);
    public final Map A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private void A00() {
        Map map = this.A00;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (A1K.getValue() == null) {
                A15.remove();
            } else {
                A1K.setValue(AbstractC58318PtA.A0p(A1K).trim());
            }
        }
        Object obj = map.get("given-name");
        Object obj2 = map.get("family-name");
        if (obj == null && obj2 == null) {
            String A1A = AbstractC166987dD.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, map);
            if (A1A != null) {
                int lastIndexOf = A1A.lastIndexOf(32);
                if (lastIndexOf > 0) {
                    map.put("given-name", AbstractC58318PtA.A0j(A1A, lastIndexOf));
                    map.put("family-name", AbstractC58318PtA.A0g(lastIndexOf, A1A));
                    return;
                } else {
                    map.put("given-name", A1A);
                    return;
                }
            }
            return;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (map.containsKey("given-name")) {
            A1E.add(map.get("given-name"));
        }
        if (map.containsKey("family-name")) {
            A1E.add(map.get("family-name"));
        }
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, TextUtils.join(" ", A1E));
    }

    public final boolean A02() {
        Map map = this.A00;
        if ((!TextUtils.isEmpty(AbstractC166987dD.A1A("given-name", map)) || !TextUtils.isEmpty(AbstractC166987dD.A1A("family-name", map))) && !TextUtils.isEmpty(AbstractC166987dD.A1A("address-line1", map)) && !TextUtils.isEmpty(AbstractC166987dD.A1A("address-level1", map)) && !TextUtils.isEmpty(AbstractC166987dD.A1A("address-level2", map)) && !TextUtils.isEmpty(AbstractC166987dD.A1A("postal-code", map))) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Map map = this.A00;
        if (map == null) {
            return "";
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AutofillData{mAutofillValues=");
        A1C.append(map.keySet());
        A1C.append(":");
        return AbstractC58320PtC.A11(map.values(), A1C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }

    public AutofillData(JSONObject jSONObject) {
        this.A00 = AbstractC166987dD.A1G();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A1B = AbstractC166987dD.A1B(keys);
            this.A00.put(A1B, jSONObject.optString(A1B));
        }
        A00();
    }

    public final JSONObject A01() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        Map unmodifiableMap = Collections.unmodifiableMap(this.A00);
        Iterator A12 = AbstractC43593JPy.A12(unmodifiableMap);
        while (A12.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A12);
            try {
                A0q.put(A1B, unmodifiableMap.get(A1B));
            } catch (JSONException unused) {
            }
        }
        return A0q;
    }

    public AutofillData(Parcel parcel) {
        this.A00 = parcel.readHashMap(String.class.getClassLoader());
        A00();
    }

    public AutofillData(Map map) {
        this.A00 = AbstractC58318PtA.A10(map);
        A00();
    }
}
