package com.instagram.common.typedurl.directlogging;

import X.AbstractC225979yG;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class DirectImageLoggingData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(61);
    public final long A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public DirectImageLoggingData(Integer num, String str, String str2, String str3, long j, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(num, 4);
        this.A07 = z;
        this.A05 = z2;
        this.A00 = j;
        this.A01 = num;
        this.A02 = str;
        this.A04 = str2;
        this.A06 = z3;
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectImageLoggingData) {
                DirectImageLoggingData directImageLoggingData = (DirectImageLoggingData) obj;
                if (this.A07 != directImageLoggingData.A07 || this.A05 != directImageLoggingData.A05 || this.A00 != directImageLoggingData.A00 || this.A01 != directImageLoggingData.A01 || !C14360o3.A0K(this.A02, directImageLoggingData.A02) || !C14360o3.A0K(this.A04, directImageLoggingData.A04) || this.A06 != directImageLoggingData.A06 || !C14360o3.A0K(this.A03, directImageLoggingData.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeString(AbstractC225979yG.A00(this.A01));
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        long j = this.A00;
        int i5 = (i4 + ((int) (j ^ (j >>> 32)))) * 31;
        Integer num = this.A01;
        int hashCode3 = (i5 + AbstractC225979yG.A00(num).hashCode() + num.intValue()) * 31;
        String str = this.A02;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i7 = (hashCode3 + hashCode) * 31;
        String str2 = this.A04;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i8 = (i7 + hashCode2) * 31;
        int i9 = 1237;
        if (this.A06) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        String str3 = this.A03;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        return i10 + i6;
    }
}
