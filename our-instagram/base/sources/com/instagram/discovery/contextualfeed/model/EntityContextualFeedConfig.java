package com.instagram.discovery.contextualfeed.model;

import X.AbstractC65703TsZ;
import X.C14360o3;
import X.EnumC68206VFy;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.discovery.api.model.SectionPagination;

/* loaded from: classes11.dex */
public final class EntityContextualFeedConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(55);
    public final int A00;
    public final int A01;
    public final SectionPagination A02;
    public final EnumC68206VFy A03;
    public final EnumC68206VFy A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        AbstractC65703TsZ.A1H(parcel, this.A04);
        AbstractC65703TsZ.A1H(parcel, this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A07 ? 1 : 0);
    }

    public EntityContextualFeedConfig(SectionPagination sectionPagination, EnumC68206VFy enumC68206VFy, EnumC68206VFy enumC68206VFy2, String str, String str2, int i, int i2, boolean z) {
        this.A02 = sectionPagination;
        this.A04 = enumC68206VFy;
        this.A03 = enumC68206VFy2;
        this.A06 = str;
        this.A05 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = z;
    }
}
