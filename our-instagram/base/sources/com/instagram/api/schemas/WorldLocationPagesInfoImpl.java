package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31181DnP;
import X.AbstractC37300Gc1;
import X.AbstractC40457Hwm;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class WorldLocationPagesInfoImpl extends C0T6 implements Parcelable, WorldLocationPagesInfo {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(87);
    public final Integer A00;
    public final String A01;
    public final String A02;

    @Override // com.instagram.api.schemas.WorldLocationPagesInfo
    public final WorldLocationPagesInfoImpl F40() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WorldLocationPagesInfoImpl) {
                WorldLocationPagesInfoImpl worldLocationPagesInfoImpl = (WorldLocationPagesInfoImpl) obj;
                if (!C14360o3.A0K(this.A01, worldLocationPagesInfoImpl.A01) || !C14360o3.A0K(this.A00, worldLocationPagesInfoImpl.A00) || !C14360o3.A0K(this.A02, worldLocationPagesInfoImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.WorldLocationPagesInfo
    public final Integer Ber() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.WorldLocationPagesInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTWorldLocationPagesInfo", AbstractC40457Hwm.A00(this));
    }

    @Override // com.instagram.api.schemas.WorldLocationPagesInfo
    public final String getCoverPhoto() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.WorldLocationPagesInfo
    public final String getWorldId() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public WorldLocationPagesInfoImpl(String str, Integer num, String str2) {
        this.A01 = str;
        this.A00 = num;
        this.A02 = str2;
    }
}
