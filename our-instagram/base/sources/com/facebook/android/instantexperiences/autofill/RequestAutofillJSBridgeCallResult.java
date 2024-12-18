package com.facebook.android.instantexperiences.autofill;

import X.C14360o3;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;

/* loaded from: classes10.dex */
public final class RequestAutofillJSBridgeCallResult extends InstantExperiencesCallResult {
    public static final Parcelable.Creator CREATOR = Py5.A00(90);

    @Override // com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RequestAutofillJSBridgeCallResult(java.util.List r7) {
        /*
            r6 = this;
            org.json.JSONObject r5 = X.AbstractC31171DnF.A0q()
            java.util.Iterator r4 = r7.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r4.next()
            com.facebook.android.instantexperiences.autofill.model.FbAutofillData r0 = (com.facebook.android.instantexperiences.autofill.model.FbAutofillData) r0
            java.util.Map r0 = r0.AeG()
            java.util.Iterator r3 = X.AbstractC166997dE.A15(r0)
        L1c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8
            java.util.Map$Entry r0 = X.AbstractC166987dD.A1K(r3)
            java.lang.String r1 = X.AbstractC31172DnG.A17(r0)
            java.lang.Object r0 = r0.getValue()
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L32
            goto L1c
        L32:
            r2 = move-exception
            java.lang.String r1 = "RequestAutofillJSBridgeCallResult"
            java.lang.String r0 = "Autocomplete data can't be added to JSONObject "
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0)
            X.C0K8.A0F(r1, r0, r2)
            goto L1c
        L3f:
            java.lang.String r0 = r5.toString()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = X.AbstractC16960so.A1Q(r0)
            r6.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult.<init>(java.util.List):void");
    }
}
