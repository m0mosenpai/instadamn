package com.instagram.barcelona.creation.location.model;

import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.barcelona.location.model.LocationModel;

/* loaded from: classes11.dex */
public final class PostLocationModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(11);
    public final LocationModel A00;
    public final String A01;

    public PostLocationModel(LocationModel locationModel, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = locationModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PostLocationModel) {
                PostLocationModel postLocationModel = (PostLocationModel) obj;
                if (!C14360o3.A0K(this.A01, postLocationModel.A01) || !C14360o3.A0K(this.A00, postLocationModel.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + AbstractC167017dG.A0M(this.A00);
    }
}
