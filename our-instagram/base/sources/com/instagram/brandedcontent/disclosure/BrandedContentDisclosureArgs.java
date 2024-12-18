package com.instagram.brandedcontent.disclosure;

import X.AbstractC43594JPz;
import X.C16930sl;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import java.util.List;

/* loaded from: classes9.dex */
public final class BrandedContentDisclosureArgs implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(24);
    public BrandedContentProjectMetadataIntf A01;
    public String A02;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public String A03 = "feed";
    public List A04 = C16930sl.A00;
    public BrandedContentGatingInfoIntf A00 = new BrandedContentGatingInfo(null, null, null, null, null);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC43594JPz.A16(parcel);
    }
}
