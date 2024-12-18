package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC40151HrK;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class PopularReelWithFollowersInsightMetadataImpl extends C0T6 implements Parcelable, PopularReelWithFollowersInsightMetadata {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(37);
    public final int A00;
    public final int A01;
    public final int A02;
    public final List A03;

    @Override // com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata
    public final PopularReelWithFollowersInsightMetadataImpl Ey4() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PopularReelWithFollowersInsightMetadataImpl) {
                PopularReelWithFollowersInsightMetadataImpl popularReelWithFollowersInsightMetadataImpl = (PopularReelWithFollowersInsightMetadataImpl) obj;
                if (this.A00 != popularReelWithFollowersInsightMetadataImpl.A00 || !C14360o3.A0K(this.A03, popularReelWithFollowersInsightMetadataImpl.A03) || this.A01 != popularReelWithFollowersInsightMetadataImpl.A01 || this.A02 != popularReelWithFollowersInsightMetadataImpl.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeStringList(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }

    @Override // com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata
    public final List BR1() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTPopularReelWithFollowersInsightMetadata", AbstractC40151HrK.A00(this));
    }

    @Override // com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata
    public final int getLikeCount() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata
    public final int getPlayCount() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata
    public final int getReshareCount() {
        return this.A02;
    }

    public final int hashCode() {
        return (((((this.A00 * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + this.A01) * 31) + this.A02;
    }

    public PopularReelWithFollowersInsightMetadataImpl(List list, int i, int i2, int i3) {
        this.A00 = i;
        this.A03 = list;
        this.A01 = i2;
        this.A02 = i3;
    }
}
