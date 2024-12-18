package com.facebook.android.instantexperiences.autofill.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.AbstractC31177DnL;
import X.AbstractC43593JPy;
import X.AbstractC50523MSb;
import X.AbstractC58318PtA;
import X.AbstractC58323PtF;
import X.AnonymousClass001;
import X.C14360o3;
import X.C15500q5;
import X.MSV;
import X.SQf;
import android.os.Parcel;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class BrowserExtensionsAutofillData implements FbAutofillData {
    public Map A00;

    @Override // com.facebook.android.instantexperiences.autofill.model.FbAutofillData
    public final boolean Cdx(FbAutofillData fbAutofillData) {
        BrowserExtensionsAutofillData browserExtensionsAutofillData;
        C14360o3.A0B(fbAutofillData, 0);
        if (AbstractC167017dG.A1Z(this, fbAutofillData) && (fbAutofillData instanceof BrowserExtensionsAutofillData) && (browserExtensionsAutofillData = (BrowserExtensionsAutofillData) fbAutofillData) != null && this.A00.size() <= browserExtensionsAutofillData.A00.size()) {
            Iterator A15 = AbstractC166997dE.A15(this.A00);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                Object key = A1K.getKey();
                Object value = A1K.getValue();
                Object obj = browserExtensionsAutofillData.A00.get(key);
                if (value == null || (obj != null && value.equals(obj))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && AbstractC167017dG.A1Z(this, obj)) {
            BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) obj;
            if (this.A00.size() == browserExtensionsAutofillData.A00.size()) {
                Iterator A15 = AbstractC166997dE.A15(this.A00);
                while (true) {
                    boolean z = true;
                    if (!A15.hasNext()) {
                        return true;
                    }
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    Object key = A1K.getKey();
                    Object value = A1K.getValue();
                    Object obj2 = browserExtensionsAutofillData.A00.get(key);
                    boolean A1W = AbstractC167007dF.A1W(value);
                    if (obj2 == null) {
                        z = false;
                    }
                    if ((z ^ A1W) || (value != null && obj2 != null && !value.equals(obj2))) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeMap(this.A00);
    }

    public final String A00() {
        String A1A;
        if (this instanceof TelephoneAutofillData) {
            A1A = ((TelephoneAutofillData) this).A00;
        } else {
            if (this instanceof NameAutofillData) {
                CharSequence charSequence = (CharSequence) this.A00.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                if (charSequence != null && charSequence.length() != 0) {
                    Object obj = this.A00.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    C14360o3.A0A(obj);
                    return (String) obj;
                }
                String A0T = AnonymousClass001.A0T(AbstractC58323PtF.A0r("given-name", this.A00), AbstractC58323PtF.A0r("family-name", this.A00), ' ');
                int length = A0T.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    int i2 = length;
                    if (!z) {
                        i2 = i;
                    }
                    boolean A1S = AbstractC31175DnJ.A1S(C14360o3.A00(A0T.charAt(i2), 32));
                    if (!z) {
                        if (!A1S) {
                            z = true;
                        } else {
                            i++;
                        }
                    } else {
                        if (!A1S) {
                            break;
                        }
                        length--;
                    }
                }
                return AbstractC31177DnL.A0g(A0T, length, i);
            }
            if (this instanceof EmailAutofillData) {
                Map map = this.A00;
                A1A = AbstractC166987dD.A1A(AbstractC43593JPy.A12(map).next(), map);
            } else {
                StringBuilder A1C = AbstractC166987dD.A1C();
                if (!SQf.A01(AbstractC166987dD.A1A("street-address", this.A00), A1C)) {
                    SQf.A00("address-line1", A1C, this.A00);
                    SQf.A00("address-line2", A1C, this.A00);
                    SQf.A00("address-line3", A1C, this.A00);
                }
                SQf.A00("address-level4", A1C, this.A00);
                SQf.A00("address-level3", A1C, this.A00);
                SQf.A00("address-level2", A1C, this.A00);
                SQf.A00("address-level1", A1C, this.A00);
                SQf.A00("postal-code", A1C, this.A00);
                if (!SQf.A01(AbstractC166987dD.A1A("country", this.A00), A1C)) {
                    SQf.A00("country-name", A1C, this.A00);
                }
                return AbstractC166987dD.A19(A1C);
            }
        }
        if (A1A == null) {
            return "";
        }
        return A1A;
    }

    @Override // com.facebook.android.instantexperiences.autofill.model.FbAutofillData
    public final Map AeG() {
        if (this instanceof TelephoneAutofillData) {
            return AbstractC58318PtA.A10(this.A00);
        }
        if (this instanceof NameAutofillData) {
            HashMap A10 = AbstractC58318PtA.A10(this.A00);
            for (Object obj : new LinkedList(A10.keySet())) {
                String A0h = AbstractC31171DnF.A0h(obj, A10);
                if (A0h == null || A0h.length() == 0) {
                    A10.remove(obj);
                }
            }
            return A10;
        }
        return AbstractC58318PtA.A10(this.A00);
    }

    public BrowserExtensionsAutofillData(JSONObject jSONObject) {
        this();
        JSONObject optJSONObject = jSONObject.optJSONObject("autocomplete_data");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String A1B = AbstractC166987dD.A1B(keys);
                this.A00.put(A1B, optJSONObject.optString(A1B));
            }
        }
    }

    public final HashMap A01(Set set) {
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator A15 = AbstractC166997dE.A15(this.A00);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object key = A1K.getKey();
            Object value = A1K.getValue();
            if (set.contains(key)) {
                A1G.put(key, value);
            }
        }
        return A1G;
    }

    public JSONObject A02() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        Iterator A15 = AbstractC166997dE.A15(AeG());
        while (A15.hasNext()) {
            AbstractC50523MSb.A1T(A15, A0q);
        }
        JSONObject A0q2 = AbstractC31171DnF.A0q();
        A0q2.put("autocomplete_data", A0q);
        return A0q2;
    }

    public BrowserExtensionsAutofillData(Parcel parcel) {
        HashMap readHashMap = parcel.readHashMap(String.class.getClassLoader());
        C14360o3.A0C(readHashMap, MSV.A00(1456));
        this.A00 = C15500q5.A04(readHashMap);
    }

    public BrowserExtensionsAutofillData() {
        this.A00 = AbstractC166987dD.A1G();
    }
}
