package com.instagram.api.schemas;

import X.AbstractC53770NqM;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes4.dex */
public final class BrandedContentProjectMetadata extends C0T6 implements BrandedContentProjectMetadataIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(80);
    public final BCPDealOutputTypeEnum A00;
    public final BrandedContentProjectAction A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public BrandedContentProjectMetadata(BCPDealOutputTypeEnum bCPDealOutputTypeEnum, BrandedContentProjectAction brandedContentProjectAction, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(brandedContentProjectAction, 1);
        C14360o3.A0B(str5, 8);
        this.A01 = brandedContentProjectAction;
        this.A02 = bool;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = bCPDealOutputTypeEnum;
        this.A07 = str5;
        this.A08 = str6;
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final BrandedContentProjectMetadata ErO() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrandedContentProjectMetadata) {
                BrandedContentProjectMetadata brandedContentProjectMetadata = (BrandedContentProjectMetadata) obj;
                if (this.A01 != brandedContentProjectMetadata.A01 || !C14360o3.A0K(this.A02, brandedContentProjectMetadata.A02) || !C14360o3.A0K(this.A03, brandedContentProjectMetadata.A03) || !C14360o3.A0K(this.A04, brandedContentProjectMetadata.A04) || !C14360o3.A0K(this.A05, brandedContentProjectMetadata.A05) || !C14360o3.A0K(this.A06, brandedContentProjectMetadata.A06) || this.A00 != brandedContentProjectMetadata.A00 || !C14360o3.A0K(this.A07, brandedContentProjectMetadata.A07) || !C14360o3.A0K(this.A08, brandedContentProjectMetadata.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        Boolean bool = this.A02;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.A03;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A05;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BCPDealOutputTypeEnum bCPDealOutputTypeEnum = this.A00;
        int hashCode7 = (((hashCode6 + (bCPDealOutputTypeEnum == null ? 0 : bCPDealOutputTypeEnum.hashCode())) * 31) + this.A07.hashCode()) * 31;
        String str5 = this.A08;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        Boolean bool = this.A02;
        if (bool == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final BrandedContentProjectAction AYK() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final Boolean AaB() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final String Ahu() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final String Ai2() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final String AkB() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final String AkC() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final BCPDealOutputTypeEnum Avs() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final String BiT() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final String BiU() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTBrandedContentProjectMetadata", AbstractC53770NqM.A00(this));
    }
}
