package com.instagram.model.filterkit;

import X.AbstractC002300n;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class TextureAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(11);
    public final String A00;
    public final String A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
    }

    public TextureAsset(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readByte() == 1;
    }

    public TextureAsset(String str, String str2) {
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        boolean A0f = AbstractC002300n.A0f(lowerCase, ".pkm", false);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = A0f;
    }
}
