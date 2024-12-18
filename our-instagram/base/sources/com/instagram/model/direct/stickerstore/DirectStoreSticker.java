package com.instagram.model.direct.stickerstore;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25233BEq;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class DirectStoreSticker extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(71);
    public final TypedImageUrl A00;
    public final TypedImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public DirectStoreSticker(TypedImageUrl typedImageUrl, TypedImageUrl typedImageUrl2, String str, String str2, String str3, String str4, boolean z) {
        AbstractC25233BEq.A0w(1, str, typedImageUrl2, str2);
        this.A04 = str;
        this.A01 = typedImageUrl;
        this.A00 = typedImageUrl2;
        this.A05 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A06 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectStoreSticker) {
                DirectStoreSticker directStoreSticker = (DirectStoreSticker) obj;
                if (!C14360o3.A0K(this.A04, directStoreSticker.A04) || !C14360o3.A0K(this.A01, directStoreSticker.A01) || !C14360o3.A0K(this.A00, directStoreSticker.A00) || !C14360o3.A0K(this.A05, directStoreSticker.A05) || !C14360o3.A0K(this.A02, directStoreSticker.A02) || !C14360o3.A0K(this.A03, directStoreSticker.A03) || this.A06 != directStoreSticker.A06) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        TypedImageUrl typedImageUrl = this.A01;
        if (typedImageUrl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typedImageUrl.writeToParcel(parcel, i);
        }
        this.A00.writeToParcel(parcel, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, (((AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0J(this.A00, (AbstractC166987dD.A0J(this.A04) + AbstractC167017dG.A0M(this.A01)) * 31)) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03)) * 31);
    }
}
