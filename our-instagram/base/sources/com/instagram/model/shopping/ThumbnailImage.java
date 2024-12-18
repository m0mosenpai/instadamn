package com.instagram.model.shopping;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ThumbnailImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(21);
    public ImageUrl A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC167017dG.A1Z(this, obj)) {
            return C14360o3.A0K(this.A00, ((ThumbnailImage) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }
}
