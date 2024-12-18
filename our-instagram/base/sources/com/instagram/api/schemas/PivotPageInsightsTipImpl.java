package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class PivotPageInsightsTipImpl extends C0T6 implements Parcelable, PivotPageInsightsTip {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(36);
    public final GuidanceTipIconAsset A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PivotPageInsightsTipImpl) {
                PivotPageInsightsTipImpl pivotPageInsightsTipImpl = (PivotPageInsightsTipImpl) obj;
                if (!C14360o3.A0K(this.A01, pivotPageInsightsTipImpl.A01) || this.A00 != pivotPageInsightsTipImpl.A00 || !C14360o3.A0K(this.A02, pivotPageInsightsTipImpl.A02)) {
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
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.PivotPageInsightsTip
    public final String Agr() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.PivotPageInsightsTip
    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public PivotPageInsightsTipImpl(GuidanceTipIconAsset guidanceTipIconAsset, String str, String str2) {
        this.A01 = str;
        this.A00 = guidanceTipIconAsset;
        this.A02 = str2;
    }
}
