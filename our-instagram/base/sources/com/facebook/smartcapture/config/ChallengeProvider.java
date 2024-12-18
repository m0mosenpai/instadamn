package com.facebook.smartcapture.config;

import X.AbstractC166987dD;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.C63473SlE;
import X.EnumC61156RgH;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class ChallengeProvider implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(62);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final List A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeList(this.A03);
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A01);
    }

    public ChallengeProvider(Parcel parcel) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A03 = A1E;
        parcel.readList(A1E, EnumC61156RgH.class.getClassLoader());
        Class cls = Integer.TYPE;
        this.A00 = (Integer) AbstractC58321PtD.A0n(parcel, cls);
        this.A02 = (Integer) AbstractC58321PtD.A0n(parcel, cls);
        this.A01 = (Integer) AbstractC58321PtD.A0n(parcel, cls);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ChallengeProvider{mSteps=");
        A1C.append(TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, this.A03));
        A1C.append(", mPhotoQuality=");
        A1C.append(this.A00);
        A1C.append(", mVideoQuality=");
        A1C.append(this.A02);
        A1C.append(", mVideoBitrate=");
        return AbstractC58320PtC.A11(this.A01, A1C);
    }

    public ChallengeProvider(List list) {
        this.A03 = list;
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
    }
}
