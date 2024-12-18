package com.instagram.save.contextualfeed.intf;

import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.save.model.SavedCollection;

/* loaded from: classes7.dex */
public final class SavedContextualFeedNetworkConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(49);
    public final SavedCollection A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public SavedContextualFeedNetworkConfig(SavedCollection savedCollection, String str) {
        this.A00 = savedCollection;
        this.A01 = str;
    }
}
