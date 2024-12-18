package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC39864HmD;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class CreatorDigestSignalInfoImpl extends C0T6 implements Parcelable, CreatorDigestSignalInfo {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(39);
    public final InspirationSignalType A00;
    public final String A01;
    public final String A02;

    @Override // com.instagram.api.schemas.CreatorDigestSignalInfo
    public final CreatorDigestSignalInfoImpl Esj() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorDigestSignalInfoImpl) {
                CreatorDigestSignalInfoImpl creatorDigestSignalInfoImpl = (CreatorDigestSignalInfoImpl) obj;
                if (this.A00 != creatorDigestSignalInfoImpl.A00 || !C14360o3.A0K(this.A01, creatorDigestSignalInfoImpl.A01) || !C14360o3.A0K(this.A02, creatorDigestSignalInfoImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.CreatorDigestSignalInfo
    public final InspirationSignalType BxI() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CreatorDigestSignalInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCreatorDigestSignalInfo", AbstractC39864HmD.A00(this));
    }

    @Override // com.instagram.api.schemas.CreatorDigestSignalInfo
    public final String getSubtitle() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CreatorDigestSignalInfo
    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public CreatorDigestSignalInfoImpl(InspirationSignalType inspirationSignalType, String str, String str2) {
        this.A00 = inspirationSignalType;
        this.A01 = str;
        this.A02 = str2;
    }
}
