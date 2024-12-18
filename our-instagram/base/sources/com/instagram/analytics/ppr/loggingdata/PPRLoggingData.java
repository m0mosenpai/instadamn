package com.instagram.analytics.ppr.loggingdata;

import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageLoggingData;
import com.instagram.common.typedurl.directlogging.DirectImageLoggingData;

/* loaded from: classes.dex */
public final class PPRLoggingData implements ImageLoggingData {
    public static final Parcelable.Creator CREATOR = new C206149Aw(38);
    public DirectImageLoggingData A00;
    public boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public PPRLoggingData(DirectImageLoggingData directImageLoggingData, Integer num, Integer num2, String str, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(num, 2);
        C14360o3.A0B(num2, 5);
        this.A04 = str;
        this.A03 = num;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = num2;
        this.A07 = z3;
        this.A00 = directImageLoggingData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A03.intValue());
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A02.intValue());
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
    }
}
