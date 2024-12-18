package com.instagram.model.direct.camera;

import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes4.dex */
public final class DirectCameraViewModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(4);
    public final int A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final DirectShareTarget A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final String A0B;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectCameraViewModel) {
                DirectCameraViewModel directCameraViewModel = (DirectCameraViewModel) obj;
                if (!C14360o3.A0K(this.A03, directCameraViewModel.A03) || !C14360o3.A0K(this.A06, directCameraViewModel.A06) || !C14360o3.A0K(this.A02, directCameraViewModel.A02) || !C14360o3.A0K(this.A01, directCameraViewModel.A01) || this.A07 != directCameraViewModel.A07 || this.A09 != directCameraViewModel.A09 || this.A08 != directCameraViewModel.A08 || this.A0A != directCameraViewModel.A0A || !C14360o3.A0K(this.A0B, directCameraViewModel.A0B) || this.A00 != directCameraViewModel.A00 || !C14360o3.A0K(this.A05, directCameraViewModel.A05) || !C14360o3.A0K(this.A04, directCameraViewModel.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        Long l = this.A04;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public final String A00() {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                DirectShareTarget directShareTarget = this.A03;
                if (directShareTarget != null) {
                    return directShareTarget.A08();
                }
                return null;
            default:
                throw new IllegalStateException("Illegal camera type");
        }
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        DirectShareTarget directShareTarget = this.A03;
        int i = 0;
        if (directShareTarget == null) {
            hashCode = 0;
        } else {
            hashCode = directShareTarget.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.A06;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ImageUrl imageUrl = this.A02;
        if (imageUrl == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = imageUrl.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        ImageUrl imageUrl2 = this.A01;
        if (imageUrl2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = imageUrl2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        int i6 = 1237;
        if (this.A07) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A09) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A08) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A0A) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        String str2 = this.A0B;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i14 = (((i13 + hashCode5) * 31) + this.A00) * 31;
        String str3 = this.A05;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        Long l = this.A04;
        if (l != null) {
            i = l.hashCode();
        }
        return i15 + i;
    }

    public DirectCameraViewModel(ImageUrl imageUrl, ImageUrl imageUrl2, DirectShareTarget directShareTarget, Long l, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = directShareTarget;
        this.A06 = str;
        this.A02 = imageUrl;
        this.A01 = imageUrl2;
        this.A07 = z;
        this.A09 = z2;
        this.A08 = z3;
        this.A0A = z4;
        this.A0B = str2;
        this.A00 = i;
        this.A05 = str3;
        this.A04 = l;
    }
}
