package com.instagram.clips.model;

import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ClipsSpotlightData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(1);
    public final Map A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ClipsSpotlightData) && C14360o3.A0K(this.A00, ((ClipsSpotlightData) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Map map = this.A00;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            ((ClipsSpotlightModel) entry.getValue()).writeToParcel(parcel, i);
        }
    }

    public ClipsSpotlightData(Map map) {
        this.A00 = map;
    }
}
