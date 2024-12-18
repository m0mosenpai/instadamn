package com.facebook.android.instantexperiences.payment;

import X.Py5;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;

/* loaded from: classes10.dex */
public final class CanMakePaymentJSBridgeCallResult extends InstantExperiencesCallResult {
    public static final Parcelable.Creator CREATOR = Py5.A00(99);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CanMakePaymentJSBridgeCallResult() {
        /*
            r4 = this;
            r1 = 1
            org.json.JSONObject r3 = X.AbstractC31171DnF.A0q()
            java.lang.String r0 = "canMakePayment"
            r3.put(r0, r1)     // Catch: org.json.JSONException -> Lb
            goto L13
        Lb:
            r2 = move-exception
            java.lang.String r1 = "CanMakePaymentJSBridgeCallResult"
            java.lang.String r0 = "Exception serializing return params!"
            X.C0K8.A0G(r1, r0, r2)
        L13:
            java.lang.String r0 = r3.toString()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult.<init>():void");
    }
}
