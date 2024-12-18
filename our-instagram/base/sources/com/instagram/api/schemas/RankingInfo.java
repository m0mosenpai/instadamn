package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class RankingInfo extends C0T6 implements Parcelable, RankingInfoIntf {
    public static final Parcelable.Creator CREATOR = new C41855Ig9(87);
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RankingInfo) {
                RankingInfo rankingInfo = (RankingInfo) obj;
                if (!C14360o3.A0K(this.A00, rankingInfo.A00) || !C14360o3.A0K(this.A01, rankingInfo.A01) || !C14360o3.A0K(this.A02, rankingInfo.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.RankingInfoIntf
    public final String BlB() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.RankingInfoIntf
    public final String BoG() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.RankingInfoIntf
    public final String CHt() {
        return this.A02;
    }

    public RankingInfo(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
