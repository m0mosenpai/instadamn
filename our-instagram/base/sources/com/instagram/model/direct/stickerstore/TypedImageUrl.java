package com.instagram.model.direct.stickerstore;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class TypedImageUrl extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(75);
    public final ImageUrl A00;
    public final String A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TypedImageUrl) {
                TypedImageUrl typedImageUrl = (TypedImageUrl) obj;
                if (!C14360o3.A0K(this.A00, typedImageUrl.A00) || !C14360o3.A0K(this.A01, typedImageUrl.A01) || this.A02 != typedImageUrl.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public TypedImageUrl(ImageUrl imageUrl, String str, boolean z) {
        AbstractC167017dG.A1P(imageUrl, str);
        this.A00 = imageUrl;
        this.A01 = str;
        this.A02 = z;
    }
}
