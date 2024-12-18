package com.instagram.avatars.coinflip;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.EnumC152426tV;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.avatars.common.AvatarInfo;

/* loaded from: classes3.dex */
public final class AvatarCoinFlipConfig extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(42);
    public EnumC152426tV A00;
    public AvatarInfo A01;
    public boolean A02;
    public boolean A03;
    public final AvatarCoinFlipBackgroundOptionResponse A04;
    public final AvatarCoinFlipSticker A05;
    public final AvatarCoinFlipSticker A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public AvatarCoinFlipConfig(AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse, AvatarCoinFlipSticker avatarCoinFlipSticker, AvatarCoinFlipSticker avatarCoinFlipSticker2, EnumC152426tV enumC152426tV, AvatarInfo avatarInfo, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(avatarCoinFlipSticker, 1);
        C14360o3.A0B(avatarCoinFlipSticker2, 2);
        this.A05 = avatarCoinFlipSticker;
        this.A06 = avatarCoinFlipSticker2;
        this.A04 = avatarCoinFlipBackgroundOptionResponse;
        this.A07 = str;
        this.A08 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A00 = enumC152426tV;
        this.A03 = z4;
        this.A01 = avatarInfo;
        this.A02 = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarCoinFlipConfig) {
                AvatarCoinFlipConfig avatarCoinFlipConfig = (AvatarCoinFlipConfig) obj;
                if (!C14360o3.A0K(this.A05, avatarCoinFlipConfig.A05) || !C14360o3.A0K(this.A06, avatarCoinFlipConfig.A06) || !C14360o3.A0K(this.A04, avatarCoinFlipConfig.A04) || !C14360o3.A0K(this.A07, avatarCoinFlipConfig.A07) || this.A08 != avatarCoinFlipConfig.A08 || this.A09 != avatarCoinFlipConfig.A09 || this.A0A != avatarCoinFlipConfig.A0A || this.A00 != avatarCoinFlipConfig.A00 || this.A03 != avatarCoinFlipConfig.A03 || !C14360o3.A0K(this.A01, avatarCoinFlipConfig.A01) || this.A02 != avatarCoinFlipConfig.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A05.writeToParcel(parcel, i);
        this.A06.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        EnumC152426tV enumC152426tV = this.A00;
        if (enumC152426tV == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC152426tV.name());
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((this.A05.hashCode() * 31) + this.A06.hashCode()) * 31;
        AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse = this.A04;
        int i = 0;
        if (avatarCoinFlipBackgroundOptionResponse == null) {
            hashCode = 0;
        } else {
            hashCode = avatarCoinFlipBackgroundOptionResponse.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str = this.A07;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A08) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A09) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A0A) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        EnumC152426tV enumC152426tV = this.A00;
        if (enumC152426tV == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = enumC152426tV.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        int i11 = 1237;
        if (this.A03) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        AvatarInfo avatarInfo = this.A01;
        if (avatarInfo != null) {
            i = avatarInfo.hashCode();
        }
        int i13 = (i12 + i) * 31;
        int i14 = 1237;
        if (this.A02) {
            i14 = 1231;
        }
        return i13 + i14;
    }
}
