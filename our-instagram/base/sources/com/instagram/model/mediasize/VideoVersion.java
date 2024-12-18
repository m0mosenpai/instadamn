package com.instagram.model.mediasize;

import X.AbstractC37350Gcs;
import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.api.schemas.DirectMediaFallbackUrlIntf;

/* loaded from: classes.dex */
public final class VideoVersion extends C0T6 implements VideoVersionIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(21);
    public final DirectMediaFallbackUrl A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;
    public final String A06;

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final VideoVersion F5E() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoVersion) {
                VideoVersion videoVersion = (VideoVersion) obj;
                if (!C14360o3.A0K(this.A00, videoVersion.A00) || !C14360o3.A0K(this.A01, videoVersion.A01) || !C14360o3.A0K(this.A05, videoVersion.A05) || !C14360o3.A0K(this.A02, videoVersion.A02) || !C14360o3.A0K(this.A06, videoVersion.A06) || !C14360o3.A0K(this.A04, videoVersion.A04) || !C14360o3.A0K(this.A03, videoVersion.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        DirectMediaFallbackUrl directMediaFallbackUrl = this.A00;
        int hashCode = (directMediaFallbackUrl == null ? 0 : directMediaFallbackUrl.hashCode()) * 31;
        Integer num = this.A01;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.A05;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.A02;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.A06;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.A04;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.A03;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A05);
        Integer num2 = this.A02;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.A06);
        Long l = this.A04;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num3 = this.A03;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final /* bridge */ /* synthetic */ DirectMediaFallbackUrlIntf B4E() {
        return this.A00;
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final Integer BDS() {
        return this.A01;
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final Integer CBl() {
        return this.A02;
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final Long CDQ() {
        return this.A04;
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final Integer CHg() {
        return this.A03;
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTVideoVersion", AbstractC37350Gcs.A00(this));
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final String getId() {
        return this.A05;
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final String getUrl() {
        return this.A06;
    }

    public VideoVersion(DirectMediaFallbackUrl directMediaFallbackUrl, Integer num, Integer num2, Integer num3, Long l, String str, String str2) {
        this.A00 = directMediaFallbackUrl;
        this.A01 = num;
        this.A05 = str;
        this.A02 = num2;
        this.A06 = str2;
        this.A04 = l;
        this.A03 = num3;
    }
}
