package com.instagram.api.schemas;

import X.AbstractC31215Dny;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import X.C34689FQa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes.dex */
public final class FanClubInfoDictImpl extends C0T6 implements FanClubInfoDict, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(90);
    public final FanClubFanConsiderationPageFeatureEligibilityResponse A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final FanClubInfoDictImpl EtQ() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FanClubInfoDictImpl) {
                FanClubInfoDictImpl fanClubInfoDictImpl = (FanClubInfoDictImpl) obj;
                if (!C14360o3.A0K(this.A01, fanClubInfoDictImpl.A01) || !C14360o3.A0K(this.A05, fanClubInfoDictImpl.A05) || !C14360o3.A0K(this.A07, fanClubInfoDictImpl.A07) || !C14360o3.A0K(this.A08, fanClubInfoDictImpl.A08) || !C14360o3.A0K(this.A00, fanClubInfoDictImpl.A00) || !C14360o3.A0K(this.A02, fanClubInfoDictImpl.A02) || !C14360o3.A0K(this.A03, fanClubInfoDictImpl.A03) || !C14360o3.A0K(this.A04, fanClubInfoDictImpl.A04) || !C14360o3.A0K(this.A09, fanClubInfoDictImpl.A09) || !C14360o3.A0K(this.A06, fanClubInfoDictImpl.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A01;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.A05;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.A07;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse = this.A00;
        int hashCode5 = (hashCode4 + (fanClubFanConsiderationPageFeatureEligibilityResponse == null ? 0 : fanClubFanConsiderationPageFeatureEligibilityResponse.hashCode())) * 31;
        Boolean bool2 = this.A02;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A03;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A04;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.A06;
        return hashCode9 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Boolean bool = this.A01;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.A05;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A00, i);
        Boolean bool2 = this.A02;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.A03;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.A04;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A09);
        Integer num2 = this.A06;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final /* bridge */ /* synthetic */ C34689FQa AKK() {
        return new C34689FQa(this);
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final Boolean AeJ() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final Integer AqM() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final FanClubFanConsiderationPageFeatureEligibilityResponse B4S() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final Boolean BBZ() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final String BLB() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final Integer C3U() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final Boolean CUI() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final Boolean CUK() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFanClubInfoDict", AbstractC31215Dny.A00(this));
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final String getFanClubId() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final String getFanClubName() {
        return this.A08;
    }

    public FanClubInfoDictImpl(FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, String str, String str2, String str3) {
        this.A01 = bool;
        this.A05 = num;
        this.A07 = str;
        this.A08 = str2;
        this.A00 = fanClubFanConsiderationPageFeatureEligibilityResponse;
        this.A02 = bool2;
        this.A03 = bool3;
        this.A04 = bool4;
        this.A09 = str3;
        this.A06 = num2;
    }
}
