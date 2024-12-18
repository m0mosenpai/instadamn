package com.instagram.api.schemas;

import X.AbstractC40034HpL;
import X.C0T6;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes.dex */
public final class IntentAwareAdsInfo extends C0T6 implements IntentAwareAdsInfoIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206159Ax(33);
    public final IntentAwareAdsFormatInfo A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final IntentAwareAdsInfo Evj() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IntentAwareAdsInfo) {
                IntentAwareAdsInfo intentAwareAdsInfo = (IntentAwareAdsInfo) obj;
                if (!C14360o3.A0K(this.A00, intentAwareAdsInfo.A00) || !C14360o3.A0K(this.A04, intentAwareAdsInfo.A04) || !C14360o3.A0K(this.A01, intentAwareAdsInfo.A01) || !C14360o3.A0K(this.A05, intentAwareAdsInfo.A05) || !C14360o3.A0K(this.A02, intentAwareAdsInfo.A02) || !C14360o3.A0K(this.A06, intentAwareAdsInfo.A06) || !C14360o3.A0K(this.A07, intentAwareAdsInfo.A07) || !C14360o3.A0K(this.A03, intentAwareAdsInfo.A03) || !C14360o3.A0K(this.A08, intentAwareAdsInfo.A08) || !C14360o3.A0K(this.A09, intentAwareAdsInfo.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IntentAwareAdsFormatInfo intentAwareAdsFormatInfo = this.A00;
        int hashCode = (intentAwareAdsFormatInfo == null ? 0 : intentAwareAdsFormatInfo.hashCode()) * 31;
        String str = this.A04;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.A05;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.A02;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.A06;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A07;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.A03;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.A08;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A09;
        return hashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        Boolean bool = this.A01;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A05);
        Integer num = this.A02;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        Integer num2 = this.A03;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final IntentAwareAdsFormatInfo B7z() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final String BIG() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final String BVC() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final Integer BVJ() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final String BVL() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final String Brx() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final Integer Bry() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final String Brz() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final String CB4() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final Boolean CcZ() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIntentAwareAdsInfo", AbstractC40034HpL.A00(this));
    }

    public IntentAwareAdsInfo(IntentAwareAdsFormatInfo intentAwareAdsFormatInfo, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = intentAwareAdsFormatInfo;
        this.A04 = str;
        this.A01 = bool;
        this.A05 = str2;
        this.A02 = num;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = num2;
        this.A08 = str5;
        this.A09 = str6;
    }
}
