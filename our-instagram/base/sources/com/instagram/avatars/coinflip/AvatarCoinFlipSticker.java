package com.instagram.avatars.coinflip;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class AvatarCoinFlipSticker extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(43);
    public final float A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final int A04;
    public final int A05;
    public final int A06;

    public AvatarCoinFlipSticker(String str, int i, int i2, int i3, int i4, int i5) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A02 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A01 = i5;
        this.A00 = i / i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarCoinFlipSticker) {
                AvatarCoinFlipSticker avatarCoinFlipSticker = (AvatarCoinFlipSticker) obj;
                if (!C14360o3.A0K(this.A03, avatarCoinFlipSticker.A03) || this.A02 != avatarCoinFlipSticker.A02 || this.A04 != avatarCoinFlipSticker.A04 || this.A05 != avatarCoinFlipSticker.A05 || this.A06 != avatarCoinFlipSticker.A06 || this.A01 != avatarCoinFlipSticker.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((this.A03.hashCode() * 31) + this.A02) * 31) + this.A04) * 31) + this.A05) * 31) + this.A06) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A01);
    }
}
