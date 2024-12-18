package com.instagram.common.gallery;

import X.AbstractC189358aC;
import X.AbstractC81033jX;
import X.C14360o3;
import X.C206139Av;
import X.C8IT;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes4.dex */
public final class RemoteMedia implements Parcelable, C8IT {
    public static final Parcelable.Creator CREATOR = new C206139Av(56);
    public final float A00;
    public final int A01;
    public final MediaUploadMetadata A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final Integer A0A;
    public final Integer A0B;
    public final boolean A0C;

    public RemoteMedia(MediaUploadMetadata mediaUploadMetadata, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, Integer num2, Long l, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        float f;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(imageUrl, 2);
        C14360o3.A0B(imageUrl2, 5);
        C14360o3.A0B(mediaUploadMetadata, 7);
        C14360o3.A0B(str2, 8);
        this.A06 = str;
        this.A04 = imageUrl;
        this.A09 = z;
        this.A01 = i;
        this.A03 = imageUrl2;
        this.A05 = l;
        this.A02 = mediaUploadMetadata;
        this.A07 = str2;
        this.A08 = z2;
        this.A0C = z3;
        this.A0A = num;
        this.A0B = num2;
        if (num2 != null && num != null) {
            f = num2.intValue() / num.intValue();
        } else {
            f = 1.0f;
        }
        this.A00 = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A03, i);
        Long l = this.A05;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        Integer num = this.A0A;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A0B;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    @Override // X.C8IT
    public final String B8m() {
        return AbstractC189358aC.A01(this.A01);
    }

    @Override // X.C8IT
    public final String BK3() {
        return this.A06;
    }

    @Override // X.C8IT
    public final int BpZ() {
        return 0;
    }

    @Override // X.C8IT
    public final boolean CPp() {
        return false;
    }

    @Override // X.C8IT
    public final boolean Cff() {
        return this.A09;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
            return C14360o3.A0K(this.A06, ((RemoteMedia) obj).A06);
        }
        return false;
    }

    @Override // X.C8IT
    public final int getDuration() {
        return this.A01;
    }

    public final int hashCode() {
        return this.A06.hashCode();
    }

    @Override // X.C8IT
    public final boolean isValid() {
        return !AbstractC81033jX.A03(this.A04);
    }
}
