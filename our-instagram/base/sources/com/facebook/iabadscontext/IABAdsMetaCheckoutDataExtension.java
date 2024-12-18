package com.facebook.iabadscontext;

import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class IABAdsMetaCheckoutDataExtension extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(5);
    public final MetaCheckoutExperienceType A00;

    public IABAdsMetaCheckoutDataExtension(MetaCheckoutExperienceType metaCheckoutExperienceType) {
        C14360o3.A0B(metaCheckoutExperienceType, 1);
        this.A00 = metaCheckoutExperienceType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof IABAdsMetaCheckoutDataExtension) && this.A00 == ((IABAdsMetaCheckoutDataExtension) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }
}
