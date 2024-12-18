package com.instagram.model.direct.stickerstore;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class StickerPackResponseItem extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(74);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StickerPackResponseItem) {
                StickerPackResponseItem stickerPackResponseItem = (StickerPackResponseItem) obj;
                if (!C14360o3.A0K(this.A02, stickerPackResponseItem.A02) || !C14360o3.A0K(this.A03, stickerPackResponseItem.A03) || !C14360o3.A0K(this.A00, stickerPackResponseItem.A00) || !C14360o3.A0K(this.A01, stickerPackResponseItem.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public StickerPackResponseItem(String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1P(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A01 = str4;
    }
}
