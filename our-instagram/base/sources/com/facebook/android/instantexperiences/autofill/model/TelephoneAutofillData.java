package com.facebook.android.instantexperiences.autofill.model;

import X.AbstractC166987dD;
import X.C14360o3;
import X.C58406Puk;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class TelephoneAutofillData extends BrowserExtensionsAutofillData {
    public static final Set A01 = new C58406Puk(3);
    public static final Parcelable.Creator CREATOR = Py5.A00(94);
    public final String A00;

    @Override // com.facebook.android.instantexperiences.autofill.model.FbAutofillData
    public final /* bridge */ /* synthetic */ FbAutofillData AIA(Set set) {
        C14360o3.A0B(set, 0);
        return new TelephoneAutofillData(A01(set), this.A00);
    }

    @Override // com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }

    public TelephoneAutofillData(Map map, String str) {
        super.A00 = map;
        this.A00 = str;
    }

    @Override // com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData
    public final JSONObject A02() {
        JSONObject A02 = super.A02();
        A02.put("display_number", this.A00);
        return A02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelephoneAutofillData(JSONObject jSONObject) {
        super(jSONObject);
        String A1A;
        C14360o3.A0B(jSONObject, 1);
        try {
            A1A = jSONObject.getString("display_number");
        } catch (JSONException unused) {
            A1A = AbstractC166987dD.A1A("tel", super.A00);
        }
        this.A00 = A1A;
    }

    public TelephoneAutofillData(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }
}
