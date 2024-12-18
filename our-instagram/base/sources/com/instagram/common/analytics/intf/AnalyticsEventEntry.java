package com.instagram.common.analytics.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;

/* loaded from: classes.dex */
public class AnalyticsEventEntry implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0ip
        /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.common.analytics.intf.AnalyticsEventEntry, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.A02 = parcel.readString();
            obj.A01 = parcel.readValue(Object.class.getClassLoader());
            obj.A00 = (AnalyticsEventDebugInfo) parcel.readParcelable(AnalyticsEventDebugInfo.class.getClassLoader());
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AnalyticsEventEntry[i];
        }
    };
    public AnalyticsEventDebugInfo A00;
    public Object A01;
    public String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeValue(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public AnalyticsEventEntry(String str, Object obj) {
        this.A02 = str;
        this.A01 = obj;
    }
}
