package com.instagram.model.hashtag;

import X.AbstractC65955Tx7;
import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes2.dex */
public final class HashtagImpl extends C0T6 implements Hashtag, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(13);
    public final ImageUrl A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    @Override // com.instagram.model.hashtag.Hashtag
    public final HashtagImpl F59() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HashtagImpl) {
                HashtagImpl hashtagImpl = (HashtagImpl) obj;
                if (!C14360o3.A0K(this.A01, hashtagImpl.A01) || !C14360o3.A0K(this.A02, hashtagImpl.A02) || !C14360o3.A0K(this.A08, hashtagImpl.A08) || !C14360o3.A0K(this.A09, hashtagImpl.A09) || !C14360o3.A0K(this.A0B, hashtagImpl.A0B) || !C14360o3.A0K(this.A03, hashtagImpl.A03) || !C14360o3.A0K(this.A0C, hashtagImpl.A0C) || !C14360o3.A0K(this.A04, hashtagImpl.A04) || !C14360o3.A0K(this.A05, hashtagImpl.A05) || !C14360o3.A0K(this.A0A, hashtagImpl.A0A) || !C14360o3.A0K(this.A0D, hashtagImpl.A0D) || !C14360o3.A0K(this.A06, hashtagImpl.A06) || !C14360o3.A0K(this.A00, hashtagImpl.A00) || !C14360o3.A0K(this.A0E, hashtagImpl.A0E) || !C14360o3.A0K(this.A0F, hashtagImpl.A0F) || !C14360o3.A0K(this.A07, hashtagImpl.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A01;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A02;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.A08;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A09;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.A0B;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.A03;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.A0C;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.A04;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A05;
        int hashCode9 = (hashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.A0A;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.A0D;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool6 = this.A06;
        int hashCode12 = (hashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        ImageUrl imageUrl = this.A00;
        int hashCode13 = (hashCode12 + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31;
        String str4 = this.A0E;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0F;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool7 = this.A07;
        return hashCode15 + (bool7 != null ? bool7.hashCode() : 0);
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
        Boolean bool2 = this.A02;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num = this.A08;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A09;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.A0B);
        Boolean bool3 = this.A03;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0C);
        Boolean bool4 = this.A04;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.A05;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Integer num3 = this.A0A;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.A0D);
        Boolean bool6 = this.A06;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        Boolean bool7 = this.A07;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean AbF() {
        return this.A01;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean AbI() {
        return this.A02;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Integer B7N() {
        return this.A08;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Integer B7W() {
        return this.A09;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final String B8G() {
        return this.A0B;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean BDt() {
        return this.A03;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Integer BQb() {
        return this.A0A;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean BXF() {
        return this.A06;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final ImageUrl Bhu() {
        return this.A00;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final String BrA() {
        return this.A0E;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final String BrH() {
        return this.A0F;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean CDb() {
        return this.A07;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean CTY() {
        return this.A04;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean CXj() {
        return this.A05;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaFollowHashtagInfo", AbstractC65955Tx7.A00(this));
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final String getId() {
        return this.A0C;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final String getName() {
        return this.A0D;
    }

    public HashtagImpl(ImageUrl imageUrl, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5) {
        this.A01 = bool;
        this.A02 = bool2;
        this.A08 = num;
        this.A09 = num2;
        this.A0B = str;
        this.A03 = bool3;
        this.A0C = str2;
        this.A04 = bool4;
        this.A05 = bool5;
        this.A0A = num3;
        this.A0D = str3;
        this.A06 = bool6;
        this.A00 = imageUrl;
        this.A0E = str4;
        this.A0F = str5;
        this.A07 = bool7;
    }
}
