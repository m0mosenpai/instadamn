package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.JRD;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class TrackDataImpl extends C0T6 implements TrackData, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(33);
    public final Lyrics A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
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
    public final List A0M;
    public final boolean A0N;
    public final boolean A0O;

    public TrackDataImpl(Lyrics lyrics, ImageUrl imageUrl, ImageUrl imageUrl2, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, boolean z, boolean z2) {
        C14360o3.A0B(imageUrl2, 6);
        C14360o3.A0B(str8, 14);
        this.A0N = z;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A01 = imageUrl;
        this.A02 = imageUrl2;
        this.A0A = str4;
        this.A0B = str5;
        this.A0C = str6;
        this.A06 = num;
        this.A0D = str7;
        this.A03 = bool;
        this.A0M = list;
        this.A0E = str8;
        this.A0F = str9;
        this.A04 = bool2;
        this.A05 = bool3;
        this.A0O = z2;
        this.A00 = lyrics;
        this.A0G = str10;
        this.A0H = str11;
        this.A0I = str12;
        this.A0J = str13;
        this.A0K = str14;
        this.A0L = str15;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final TrackDataImpl F3P() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TrackDataImpl) {
                TrackDataImpl trackDataImpl = (TrackDataImpl) obj;
                if (this.A0N != trackDataImpl.A0N || !C14360o3.A0K(this.A07, trackDataImpl.A07) || !C14360o3.A0K(this.A08, trackDataImpl.A08) || !C14360o3.A0K(this.A09, trackDataImpl.A09) || !C14360o3.A0K(this.A01, trackDataImpl.A01) || !C14360o3.A0K(this.A02, trackDataImpl.A02) || !C14360o3.A0K(this.A0A, trackDataImpl.A0A) || !C14360o3.A0K(this.A0B, trackDataImpl.A0B) || !C14360o3.A0K(this.A0C, trackDataImpl.A0C) || !C14360o3.A0K(this.A06, trackDataImpl.A06) || !C14360o3.A0K(this.A0D, trackDataImpl.A0D) || !C14360o3.A0K(this.A03, trackDataImpl.A03) || !C14360o3.A0K(this.A0M, trackDataImpl.A0M) || !C14360o3.A0K(this.A0E, trackDataImpl.A0E) || !C14360o3.A0K(this.A0F, trackDataImpl.A0F) || !C14360o3.A0K(this.A04, trackDataImpl.A04) || !C14360o3.A0K(this.A05, trackDataImpl.A05) || this.A0O != trackDataImpl.A0O || !C14360o3.A0K(this.A00, trackDataImpl.A00) || !C14360o3.A0K(this.A0G, trackDataImpl.A0G) || !C14360o3.A0K(this.A0H, trackDataImpl.A0H) || !C14360o3.A0K(this.A0I, trackDataImpl.A0I) || !C14360o3.A0K(this.A0J, trackDataImpl.A0J) || !C14360o3.A0K(this.A0K, trackDataImpl.A0K) || !C14360o3.A0K(this.A0L, trackDataImpl.A0L)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        Integer num = this.A06;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A0D);
        Boolean bool = this.A03;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List list = this.A0M;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeInt(((Number) it.next()).intValue());
            }
        }
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        Boolean bool2 = this.A04;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.A05;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0L);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final ImageUrl AsE() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final ImageUrl AsF() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String AvV() {
        return this.A0A;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final Integer Azi() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final Boolean BC4() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final List BE6() {
        return this.A0M;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final /* bridge */ /* synthetic */ LyricsIntf BPT() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String Bkl() {
        return this.A0H;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String BqC() {
        return this.A0I;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String CHM() {
        return this.A0L;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final Boolean CT1() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final Boolean CTb() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTrackData", JRD.A00(this));
    }

    @Override // com.instagram.api.schemas.TrackData
    public final boolean getAllowsSaving() {
        return this.A0N;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getArtistId() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getAudioAssetId() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getAudioClusterId() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getDashManifest() {
        return this.A0B;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getDisplayArtist() {
        return this.A0C;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getFastStartProgressiveDownloadUrl() {
        return this.A0D;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getId() {
        return this.A0E;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getIgUsername() {
        return this.A0F;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getProgressiveDownloadUrl() {
        return this.A0G;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getSubtitle() {
        return this.A0J;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getTitle() {
        return this.A0K;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int i = 1237;
        if (this.A0N) {
            i = 1231;
        }
        int i2 = i * 31;
        String str = this.A07;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        String str2 = this.A08;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        String str3 = this.A09;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        ImageUrl imageUrl = this.A01;
        if (imageUrl == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = imageUrl.hashCode();
        }
        int hashCode21 = (((i6 + hashCode4) * 31) + this.A02.hashCode()) * 31;
        String str4 = this.A0A;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i7 = (hashCode21 + hashCode5) * 31;
        String str5 = this.A0B;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        String str6 = this.A0C;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        Integer num = this.A06;
        if (num == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num.hashCode();
        }
        int i10 = (i9 + hashCode8) * 31;
        String str7 = this.A0D;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i11 = (i10 + hashCode9) * 31;
        Boolean bool = this.A03;
        if (bool == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = bool.hashCode();
        }
        int i12 = (i11 + hashCode10) * 31;
        List list = this.A0M;
        if (list == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list.hashCode();
        }
        int hashCode22 = (((i12 + hashCode11) * 31) + this.A0E.hashCode()) * 31;
        String str8 = this.A0F;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i13 = (hashCode22 + hashCode12) * 31;
        Boolean bool2 = this.A04;
        if (bool2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = bool2.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        Boolean bool3 = this.A05;
        if (bool3 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = bool3.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        int i16 = 1237;
        if (this.A0O) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        Lyrics lyrics = this.A00;
        if (lyrics == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = lyrics.hashCode();
        }
        int i18 = (i17 + hashCode15) * 31;
        String str9 = this.A0G;
        if (str9 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str9.hashCode();
        }
        int i19 = (i18 + hashCode16) * 31;
        String str10 = this.A0H;
        if (str10 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str10.hashCode();
        }
        int i20 = (i19 + hashCode17) * 31;
        String str11 = this.A0I;
        if (str11 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str11.hashCode();
        }
        int i21 = (i20 + hashCode18) * 31;
        String str12 = this.A0J;
        if (str12 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str12.hashCode();
        }
        int i22 = (i21 + hashCode19) * 31;
        String str13 = this.A0K;
        if (str13 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str13.hashCode();
        }
        int i23 = (i22 + hashCode20) * 31;
        String str14 = this.A0L;
        if (str14 != null) {
            i3 = str14.hashCode();
        }
        return i23 + i3;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final boolean isExplicit() {
        return this.A0O;
    }
}
