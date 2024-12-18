package com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model;

import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class GallerySuggestionsInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(54);
    public String A02 = "";
    public String A01 = "";
    public int A00 = 0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
