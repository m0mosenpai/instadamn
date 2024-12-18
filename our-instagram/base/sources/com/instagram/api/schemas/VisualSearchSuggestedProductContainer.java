package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class VisualSearchSuggestedProductContainer extends C0T6 implements Parcelable, VisualSearchSuggestedProductContainerIntf {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(83);
    public final long A00;
    public final long A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisualSearchSuggestedProductContainer) {
                VisualSearchSuggestedProductContainer visualSearchSuggestedProductContainer = (VisualSearchSuggestedProductContainer) obj;
                if (this.A00 != visualSearchSuggestedProductContainer.A00 || this.A01 != visualSearchSuggestedProductContainer.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }

    public final int hashCode() {
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A01;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public VisualSearchSuggestedProductContainer(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }
}
