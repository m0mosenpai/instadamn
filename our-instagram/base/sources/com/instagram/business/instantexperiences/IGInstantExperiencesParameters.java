package com.instagram.business.instantexperiences;

import X.AbstractC08820cl;
import X.AbstractC116315Ok;
import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AnonymousClass001;
import X.C70220WId;
import X.MSV;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class IGInstantExperiencesParameters implements InstantExperiencesParameters {
    public static final Parcelable.Creator CREATOR = new C70220WId(40);
    public String A00;
    public String A01;
    public String A02;
    public final long A03;
    public final Uri A04;
    public final String A05;
    public final Set A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeLong(this.A03);
    }

    public IGInstantExperiencesParameters(String str, Long l) {
        this.A05 = str;
        this.A03 = l.longValue();
        JSONObject A17 = AbstractC58318PtA.A17(str);
        String A00 = A00("whitelisted_domains", A17);
        this.A06 = AbstractC166987dD.A1H();
        for (String str2 : A00.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)) {
            Uri A03 = AbstractC08820cl.A03(str2);
            if (A03 != null && !AbstractC116315Ok.A00(A03.getHost())) {
                this.A06.add(A03.getHost());
            }
        }
        A00("page_name", A17);
        A17.optString(MSV.A00(174));
        A00("business_id", A17);
        this.A04 = AbstractC08820cl.A03(A00("website_uri", A17));
    }

    public static String A00(String str, JSONObject jSONObject) {
        String string = jSONObject.getString(str);
        if (!string.equals("")) {
            return string;
        }
        throw new JSONException(AnonymousClass001.A0R("Empty strings are not allowed for parameter key: ", str));
    }
}
