package com.instagram.creation.photo.edit.filter;

import X.AbstractC43594JPz;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.filterkit.filter.FilterGroup;

/* loaded from: classes9.dex */
public final class UnifiedFilterParamCallbackImpl implements FilterGroup.UnifiedFilterParamCallback {
    public static final Parcelable.Creator CREATOR = new LNM(75);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC43594JPz.A16(parcel);
    }
}
