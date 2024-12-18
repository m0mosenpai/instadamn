package com.instagram.api.schemas;

import X.AbstractC225489xD;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class MediaVCRTappableData extends C0T6 implements Parcelable, MediaVCRTappableDataIntf {
    public static final Parcelable.Creator CREATOR = new C206159Ax(47);
    public final User A00;
    public final Float A01;
    public final Float A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public MediaVCRTappableData(User user, Float f, Float f2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        C14360o3.A0B(user, 4);
        C14360o3.A0B(str2, 5);
        C14360o3.A0B(str3, 6);
        C14360o3.A0B(str5, 8);
        this.A0A = z;
        this.A03 = str;
        this.A01 = f;
        this.A00 = user;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A02 = f2;
        this.A09 = str7;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final MediaVCRTappableData EwX(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final MediaVCRTappableData EwY(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaVCRTappableData) {
                MediaVCRTappableData mediaVCRTappableData = (MediaVCRTappableData) obj;
                if (this.A0A != mediaVCRTappableData.A0A || !C14360o3.A0K(this.A03, mediaVCRTappableData.A03) || !C14360o3.A0K(this.A01, mediaVCRTappableData.A01) || !C14360o3.A0K(this.A00, mediaVCRTappableData.A00) || !C14360o3.A0K(this.A04, mediaVCRTappableData.A04) || !C14360o3.A0K(this.A05, mediaVCRTappableData.A05) || !C14360o3.A0K(this.A06, mediaVCRTappableData.A06) || !C14360o3.A0K(this.A07, mediaVCRTappableData.A07) || !C14360o3.A0K(this.A08, mediaVCRTappableData.A08) || !C14360o3.A0K(this.A02, mediaVCRTappableData.A02) || !C14360o3.A0K(this.A09, mediaVCRTappableData.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeString(this.A03);
        Float f = this.A01;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        Float f2 = this.A02;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        parcel.writeString(this.A09);
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final Float B29() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final User BZm() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String BZs() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final Float Bzq() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaVCRTappableData", AbstractC225489xD.A00(this));
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final boolean getCanViewerLinkBackToOriginalMediaFromVcr() {
        return this.A0A;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String getEndBackgroundColor() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String getOriginalCommentId() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String getOriginalCommentText() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String getOriginalMediaId() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String getStartBackgroundColor() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String getTextColor() {
        return this.A09;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int i2 = i * 31;
        String str = this.A03;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        Float f = this.A01;
        if (f == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f.hashCode();
        }
        int hashCode6 = (((((((i4 + hashCode2) * 31) + this.A00.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode()) * 31;
        String str2 = this.A06;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode7 = (((hashCode6 + hashCode3) * 31) + this.A07.hashCode()) * 31;
        String str3 = this.A08;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (hashCode7 + hashCode4) * 31;
        Float f2 = this.A02;
        if (f2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = f2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str4 = this.A09;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        return i6 + i3;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final MediaVCRTappableDataIntf E9F(C1DY c1dy) {
        return this;
    }
}
