package com.instagram.model.shopping.reels;

import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class InstagramShopLink extends C0T6 implements Parcelable {
    public static final C41856IgA CREATOR = new C41856IgA(54);
    public boolean A00 = false;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof InstagramShopLink) && this.A00 == ((InstagramShopLink) obj).A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }
}
