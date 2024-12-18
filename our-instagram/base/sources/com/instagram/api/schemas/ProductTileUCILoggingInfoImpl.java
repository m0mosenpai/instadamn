package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C41152IJr;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ProductTileUCILoggingInfoImpl extends C0T6 implements Parcelable, ProductTileUCILoggingInfo {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(70);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public ProductTileUCILoggingInfoImpl(long j, String str, String str2, String str3, String str4, long j2) {
        C14360o3.A0B(str4, 5);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = j;
        this.A05 = str4;
        this.A01 = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileUCILoggingInfoImpl) {
                ProductTileUCILoggingInfoImpl productTileUCILoggingInfoImpl = (ProductTileUCILoggingInfoImpl) obj;
                if (!C14360o3.A0K(this.A02, productTileUCILoggingInfoImpl.A02) || !C14360o3.A0K(this.A03, productTileUCILoggingInfoImpl.A03) || !C14360o3.A0K(this.A04, productTileUCILoggingInfoImpl.A04) || this.A00 != productTileUCILoggingInfoImpl.A00 || !C14360o3.A0K(this.A05, productTileUCILoggingInfoImpl.A05) || this.A01 != productTileUCILoggingInfoImpl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A01);
    }

    @Override // com.instagram.api.schemas.ProductTileUCILoggingInfo
    public final /* bridge */ /* synthetic */ C41152IJr AKV() {
        return new C41152IJr(this);
    }

    @Override // com.instagram.api.schemas.ProductTileUCILoggingInfo
    public final String Bh0() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.ProductTileUCILoggingInfo
    public final String BkD() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.ProductTileUCILoggingInfo
    public final String BkF() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.ProductTileUCILoggingInfo
    public final long BkI() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProductTileUCILoggingInfo
    public final String CC8() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.ProductTileUCILoggingInfo
    public final long CDt() {
        return this.A01;
    }

    public final int hashCode() {
        int A0K = AbstractC166997dE.A0K(this.A05, AbstractC167007dF.A07(this.A00, ((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04)) * 31));
        long j = this.A01;
        return A0K + ((int) (j ^ (j >>> 32)));
    }
}
