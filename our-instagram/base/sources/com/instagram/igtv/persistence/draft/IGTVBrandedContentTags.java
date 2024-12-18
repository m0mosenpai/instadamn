package com.instagram.igtv.persistence.draft;

import X.AbstractC43594JPz;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import java.util.List;

/* loaded from: classes9.dex */
public final class IGTVBrandedContentTags implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(4);
    public BrandedContentProjectMetadata A00;
    public List A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC43594JPz.A16(parcel);
    }
}
