package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C70221WIe;
import X.EnumC68202VFu;
import X.R0Z;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes11.dex */
public final class PuxBannerItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(7);
    public final R0Z A00;
    public final VG3 A01;
    public final EnumC68202VFu A02;
    public final CharSequence A03;
    public final String A04;
    public final boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A01);
        parcel.writeString(this.A04);
        EnumC68202VFu enumC68202VFu = this.A02;
        if (enumC68202VFu == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, enumC68202VFu);
        }
        TextUtils.writeToParcel(this.A03, parcel, i);
        parcel.writeValue(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A01;
    }

    public PuxBannerItem(R0Z r0z, VG3 vg3, EnumC68202VFu enumC68202VFu, CharSequence charSequence, String str, boolean z) {
        AbstractC167017dG.A1P(vg3, str);
        this.A01 = vg3;
        this.A04 = str;
        this.A02 = enumC68202VFu;
        this.A03 = charSequence;
        this.A00 = r0z;
        this.A05 = z;
    }
}
