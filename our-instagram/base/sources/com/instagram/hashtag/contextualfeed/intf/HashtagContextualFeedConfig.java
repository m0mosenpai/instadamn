package com.instagram.hashtag.contextualfeed.intf;

import X.AbstractC37304Gc5;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.model.hashtag.Hashtag;

/* loaded from: classes11.dex */
public class HashtagContextualFeedConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(0);
    public final EntityContextualFeedConfig A00;
    public final Hashtag A01;
    public final String A02;
    public final String A03;

    public HashtagContextualFeedConfig(EntityContextualFeedConfig entityContextualFeedConfig, Hashtag hashtag, String str, String str2) {
        entityContextualFeedConfig.getClass();
        this.A00 = entityContextualFeedConfig;
        hashtag.getClass();
        this.A01 = hashtag;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public HashtagContextualFeedConfig(Parcel parcel) {
        this.A00 = (EntityContextualFeedConfig) AbstractC37304Gc5.A04(parcel, EntityContextualFeedConfig.class);
        this.A01 = (Hashtag) AbstractC37304Gc5.A04(parcel, Hashtag.class);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }
}
