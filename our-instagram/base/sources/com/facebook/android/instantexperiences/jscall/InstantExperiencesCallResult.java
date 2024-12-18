package com.facebook.android.instantexperiences.jscall;

import X.AbstractC116315Ok;
import X.AbstractC166987dD;
import X.AbstractC31171DnF;
import X.C0K8;
import X.EnumC61176Rgc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCallResult;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class InstantExperiencesCallResult implements Parcelable {
    public String A00;
    public String A01;
    public final EnumC61176Rgc A02;
    public final List A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        if (!(this instanceof PaymentsCheckoutJSBridgeCallResult)) {
            boolean z = this instanceof CanShowPaymentModuleJSBridgeCallResult;
            return 0;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ArrayList A1F;
        List list = this.A03;
        if (list == null) {
            A1F = null;
        } else {
            A1F = AbstractC166987dD.A1F(list);
        }
        parcel.writeSerializable(A1F);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeSerializable(this.A02);
    }

    public InstantExperiencesCallResult(EnumC61176Rgc enumC61176Rgc, String str) {
        this.A03 = AbstractC166987dD.A1E();
        JSONObject A0q = AbstractC31171DnF.A0q();
        try {
            A0q.put("errorCode", Integer.toString(enumC61176Rgc.A00));
            if (!AbstractC116315Ok.A00(str)) {
                A0q.put("errorMessage", str);
            }
        } catch (JSONException e) {
            C0K8.A05(InstantExperiencesCallResult.class, "Failed to create error", e);
        }
        this.A03.add(A0q.toString());
        this.A02 = enumC61176Rgc;
    }

    public InstantExperiencesCallResult(Parcel parcel) {
        this.A03 = (ArrayList) parcel.readSerializable();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = (EnumC61176Rgc) parcel.readSerializable();
    }

    public InstantExperiencesCallResult(List list) {
        this.A03 = list;
        this.A02 = null;
    }
}
