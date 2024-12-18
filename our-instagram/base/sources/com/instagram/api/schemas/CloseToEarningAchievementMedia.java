package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class CloseToEarningAchievementMedia extends C0T6 implements Parcelable, CloseToEarningAchievementMediaIntf {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(20);
    public final int A00;
    public final String A01;
    public final String A02;

    public CloseToEarningAchievementMedia(String str, String str2, int i) {
        C14360o3.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CloseToEarningAchievementMedia) {
                CloseToEarningAchievementMedia closeToEarningAchievementMedia = (CloseToEarningAchievementMedia) obj;
                if (!C14360o3.A0K(this.A01, closeToEarningAchievementMedia.A01) || !C14360o3.A0K(this.A02, closeToEarningAchievementMedia.A02) || this.A00 != closeToEarningAchievementMedia.A00) {
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
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }

    @Override // com.instagram.api.schemas.CloseToEarningAchievementMediaIntf
    public final String BQi() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CloseToEarningAchievementMediaIntf
    public final int BiJ() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CloseToEarningAchievementMediaIntf
    public final String getMediaId() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC167017dG.A0O(this.A01) * 31) + this.A00;
    }
}
