package com.instagram.location.contextualfeed.intf;

import X.AbstractC37304Gc5;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;

/* loaded from: classes11.dex */
public class LocationContextualFeedConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(30);
    public final EntityContextualFeedConfig A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public LocationContextualFeedConfig(EntityContextualFeedConfig entityContextualFeedConfig, String str, String str2, String str3) {
        entityContextualFeedConfig.getClass();
        this.A00 = entityContextualFeedConfig;
        str3.getClass();
        this.A03 = str3;
        str.getClass();
        this.A01 = str;
        str2.getClass();
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public LocationContextualFeedConfig(Parcel parcel) {
        this.A00 = (EntityContextualFeedConfig) AbstractC37304Gc5.A04(parcel, EntityContextualFeedConfig.class);
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
