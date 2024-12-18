package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC40222Hsl;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class SMBSupportStickerDict extends C0T6 implements SMBSupportStickerDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(92);
    public final BusinessProfileDict A00;
    public final SMBPartnerType A01;
    public final Float A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final SMBSupportStickerDict EzH() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SMBSupportStickerDict) {
                SMBSupportStickerDict sMBSupportStickerDict = (SMBSupportStickerDict) obj;
                if (!C14360o3.A0K(this.A00, sMBSupportStickerDict.A00) || !C14360o3.A0K(this.A03, sMBSupportStickerDict.A03) || !C14360o3.A0K(this.A04, sMBSupportStickerDict.A04) || !C14360o3.A0K(this.A05, sMBSupportStickerDict.A05) || !C14360o3.A0K(this.A06, sMBSupportStickerDict.A06) || !C14360o3.A0K(this.A07, sMBSupportStickerDict.A07) || !C14360o3.A0K(this.A08, sMBSupportStickerDict.A08) || !C14360o3.A0K(this.A02, sMBSupportStickerDict.A02) || !C14360o3.A0K(this.A09, sMBSupportStickerDict.A09) || !C14360o3.A0K(this.A0A, sMBSupportStickerDict.A0A) || this.A01 != sMBSupportStickerDict.A01 || !C14360o3.A0K(this.A0B, sMBSupportStickerDict.A0B) || !C14360o3.A0K(this.A0C, sMBSupportStickerDict.A0C) || !C14360o3.A0K(this.A0D, sMBSupportStickerDict.A0D) || !C14360o3.A0K(this.A0E, sMBSupportStickerDict.A0E)) {
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
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        Float f = this.A02;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final BusinessProfileDict Air() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String Aj7() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String Aj8() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String Att() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String AyB() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final Float BZz() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String Bba() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final SMBPartnerType Btk() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String C3f() {
        return this.A0C;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String C8x() {
        return this.A0E;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSMBSupportStickerDict", AbstractC40222Hsl.A00(this));
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String getCtaTitle() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String getEndBackgroundColor() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String getPk() {
        return this.A0A;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String getStartBackgroundColor() {
        return this.A0B;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String getTitle() {
        return this.A0D;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC25227BEk.A07(this.A0E);
    }

    public SMBSupportStickerDict(BusinessProfileDict businessProfileDict, SMBPartnerType sMBPartnerType, Float f, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.A00 = businessProfileDict;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A02 = f;
        this.A09 = str7;
        this.A0A = str8;
        this.A01 = sMBPartnerType;
        this.A0B = str9;
        this.A0C = str10;
        this.A0D = str11;
        this.A0E = str12;
    }
}
