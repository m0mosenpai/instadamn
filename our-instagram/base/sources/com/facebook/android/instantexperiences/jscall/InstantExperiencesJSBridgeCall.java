package com.facebook.android.instantexperiences.jscall;

import X.AbstractC08820cl;
import X.AbstractC116315Ok;
import X.AbstractC166987dD;
import X.AbstractC37304Gc5;
import X.C0K8;
import X.EnumC61176Rgc;
import X.MSW;
import X.Rk1;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCall;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCall;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class InstantExperiencesJSBridgeCall implements Parcelable {
    public InstantExperiencesCallResult A00;
    public final Bundle A01;
    public final InstantExperiencesParameters A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String A00() {
        if (this instanceof PaymentsChargeRequestCall) {
            return "paymentsChargeRequst";
        }
        if (this instanceof PaymentsCheckoutJSBridgeCall) {
            return "paymentsCheckout";
        }
        if (this instanceof CanShowPaymentModuleJSBridgeCall) {
            return "canShowPaymentModule";
        }
        if (this instanceof CanMakePaymentJSBridgeCall) {
            return "canMakePayment";
        }
        if (this instanceof SaveAutofillDataJSBridgeCall) {
            return "saveAutofillData";
        }
        return "requestAutoFill";
    }

    public void A01() {
        Uri A03;
        String str = this.A03;
        if (!AbstractC116315Ok.A00(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null && parse.getHost() != null && parse.getScheme() != null) {
                if (parse.getScheme().equalsIgnoreCase("https") && (parse.getPort() == 443 || parse.getPort() == -1)) {
                    if (!TextUtils.isEmpty(str) && (A03 = AbstractC08820cl.A03(str)) != null && A03.getHost() != null && A03.getScheme() != null) {
                        return;
                    } else {
                        throw new Rk1(EnumC61176Rgc.A0S, "This url cannot make this call");
                    }
                }
                throw new Rk1(EnumC61176Rgc.A0S, null);
            }
            throw new Rk1(EnumC61176Rgc.A0S, null);
        }
        throw new Rk1(EnumC61176Rgc.A0S, null);
    }

    public final void A02(InstantExperiencesCallResult instantExperiencesCallResult) {
        this.A00 = instantExperiencesCallResult;
        instantExperiencesCallResult.A00 = this.A04;
        instantExperiencesCallResult.A01 = this.A05;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeBundle(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public InstantExperiencesJSBridgeCall(Parcel parcel) {
        this.A02 = (InstantExperiencesParameters) AbstractC37304Gc5.A04(parcel, InstantExperiencesParameters.class);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readBundle();
        this.A00 = (InstantExperiencesCallResult) AbstractC37304Gc5.A04(parcel, InstantExperiencesCallResult.class);
    }

    public InstantExperiencesJSBridgeCall(InstantExperiencesParameters instantExperiencesParameters, String str, String str2, JSONObject jSONObject) {
        this.A05 = str;
        this.A02 = instantExperiencesParameters;
        this.A03 = str2;
        this.A04 = jSONObject.getString("callbackID");
        Bundle A0b = AbstractC166987dD.A0b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A1B = AbstractC166987dD.A1B(keys);
            try {
                Object obj = jSONObject.get(A1B);
                if (obj != null) {
                    if (obj instanceof String) {
                        A0b.putString(A1B, (String) obj);
                    } else if (obj instanceof Integer) {
                        A0b.putInt(A1B, AbstractC166987dD.A0H(obj));
                    } else if (obj instanceof Double) {
                        A0b.putDouble(A1B, MSW.A00(obj));
                    } else if (obj instanceof Long) {
                        A0b.putLong(A1B, AbstractC166987dD.A0N(obj));
                    } else if (obj instanceof Boolean) {
                        A0b.putBoolean(A1B, AbstractC166987dD.A1a(obj));
                    } else if (obj instanceof JSONObject) {
                        A0b.putString(A1B, obj.toString());
                    } else if (obj instanceof JSONArray) {
                        A0b.putString(A1B, obj.toString());
                    } else if (obj == JSONObject.NULL) {
                        A0b.putString(A1B, null);
                    }
                }
            } catch (JSONException e) {
                C0K8.A0F("InstantExperiencesJSBridgeCall", StringFormatUtil.formatStrLocaleSafe("JSONObject.keys() provided a problematic key : %s", A1B), e);
            }
        }
        this.A01 = A0b;
    }
}
