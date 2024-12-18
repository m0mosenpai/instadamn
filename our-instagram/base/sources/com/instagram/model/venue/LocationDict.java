package com.instagram.model.venue;

import X.AbstractC65738TtD;
import X.C0T6;
import X.C14360o3;
import X.C69668Vt9;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class LocationDict extends C0T6 implements LocationDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(43);
    public final Boolean A00;
    public final Boolean A01;
    public final Float A02;
    public final Float A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Long A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;

    @Override // com.instagram.model.venue.LocationDictIntf
    public final LocationDict F6g() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationDict) {
                LocationDict locationDict = (LocationDict) obj;
                if (!C14360o3.A0K(this.A0C, locationDict.A0C) || !C14360o3.A0K(this.A0D, locationDict.A0D) || !C14360o3.A0K(this.A0E, locationDict.A0E) || !C14360o3.A0K(this.A04, locationDict.A04) || !C14360o3.A0K(this.A05, locationDict.A05) || !C14360o3.A0K(this.A06, locationDict.A06) || !C14360o3.A0K(this.A0F, locationDict.A0F) || !C14360o3.A0K(this.A0G, locationDict.A0G) || !C14360o3.A0K(this.A0H, locationDict.A0H) || !C14360o3.A0K(this.A0I, locationDict.A0I) || !C14360o3.A0K(this.A0A, locationDict.A0A) || !C14360o3.A0K(this.A0J, locationDict.A0J) || !C14360o3.A0K(this.A00, locationDict.A00) || !C14360o3.A0K(this.A01, locationDict.A01) || !C14360o3.A0K(this.A02, locationDict.A02) || !C14360o3.A0K(this.A03, locationDict.A03) || !C14360o3.A0K(this.A07, locationDict.A07) || !C14360o3.A0K(this.A0K, locationDict.A0K) || !C14360o3.A0K(this.A0B, locationDict.A0B) || !C14360o3.A0K(this.A0L, locationDict.A0L) || !C14360o3.A0K(this.A0M, locationDict.A0M) || !C14360o3.A0K(this.A08, locationDict.A08) || !C14360o3.A0K(this.A09, locationDict.A09) || !C14360o3.A0K(this.A0N, locationDict.A0N)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A0C;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A0D;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0E;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.A04;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A05;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A06;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.A0F;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0G;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A0H;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A0I;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.A0A;
        int hashCode11 = (hashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        String str8 = this.A0J;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A01;
        int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Float f = this.A02;
        int hashCode15 = (hashCode14 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A03;
        int hashCode16 = (hashCode15 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num4 = this.A07;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str9 = this.A0K;
        int hashCode18 = (hashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l2 = this.A0B;
        int hashCode19 = (hashCode18 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str10 = this.A0L;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.A0M;
        int hashCode21 = (hashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num5 = this.A08;
        int hashCode22 = (hashCode21 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.A09;
        int hashCode23 = (hashCode22 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str12 = this.A0N;
        return hashCode23 + (str12 != null ? str12.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        Integer num = this.A04;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A05;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.A06;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        Long l = this.A0A;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A0J);
        Boolean bool = this.A00;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A01;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Float f = this.A02;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.A03;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Integer num4 = this.A07;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.A0K);
        Long l2 = this.A0B;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0M);
        Integer num5 = this.A08;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.A09;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeString(this.A0N);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final /* bridge */ /* synthetic */ C69668Vt9 AKn() {
        return new C69668Vt9(this);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Integer AsZ() {
        return this.A04;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Integer B23() {
        return this.A05;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Integer B2h() {
        return this.A06;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String B3a() {
        return this.A0F;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String B3b() {
        return this.A0G;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String B40() {
        return this.A0I;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Long B41() {
        return this.A0A;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String B8K() {
        return this.A0J;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Boolean BCz() {
        return this.A00;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Float BM8() {
        return this.A02;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Float BO9() {
        return this.A03;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Integer BU7() {
        return this.A07;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Long BdZ() {
        return this.A0B;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Integer Bzj() {
        return this.A08;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Integer C8R() {
        return this.A09;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String C8j() {
        return this.A0N;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Boolean CTA() {
        return this.A01;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLocationDict", AbstractC65738TtD.A00(this));
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getAddress() {
        return this.A0C;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getCategory() {
        return this.A0D;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getCity() {
        return this.A0E;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getExternalSource() {
        return this.A0H;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getName() {
        return this.A0K;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getProfilePicUrl() {
        return this.A0L;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getShortName() {
        return this.A0M;
    }

    public LocationDict(Boolean bool, Boolean bool2, Float f, Float f2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.A0C = str;
        this.A0D = str2;
        this.A0E = str3;
        this.A04 = num;
        this.A05 = num2;
        this.A06 = num3;
        this.A0F = str4;
        this.A0G = str5;
        this.A0H = str6;
        this.A0I = str7;
        this.A0A = l;
        this.A0J = str8;
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = f;
        this.A03 = f2;
        this.A07 = num4;
        this.A0K = str9;
        this.A0B = l2;
        this.A0L = str10;
        this.A0M = str11;
        this.A08 = num5;
        this.A09 = num6;
        this.A0N = str12;
    }
}
