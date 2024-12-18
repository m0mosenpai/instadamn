package com.instagram.common.typedurl;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class GifUrlLoggingExtras extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(19);
    public final Long A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GifUrlLoggingExtras) {
                GifUrlLoggingExtras gifUrlLoggingExtras = (GifUrlLoggingExtras) obj;
                if (!C14360o3.A0K(this.A00, gifUrlLoggingExtras.A00) || !C14360o3.A0K(this.A01, gifUrlLoggingExtras.A01) || !C14360o3.A0K(this.A02, gifUrlLoggingExtras.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Long l = this.A00;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public GifUrlLoggingExtras(Long l, String str, String str2) {
        this.A00 = l;
        this.A01 = str;
        this.A02 = str2;
    }
}
