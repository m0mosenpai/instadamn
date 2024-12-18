package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31181DnP;
import X.C14360o3;
import X.C63473SlE;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.bloks.nativeprops.APMBloksNativeProps;
import com.facebookpay.expresscheckout.models.APMConfiguration;

/* loaded from: classes11.dex */
public final class APMButtonsItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C63473SlE(91);
    public final APMBloksNativeProps A00;
    public final APMConfiguration A01;
    public final Integer A02;
    public final VG3 A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A02));
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A03;
    }

    public APMButtonsItem(APMBloksNativeProps aPMBloksNativeProps, VG3 vg3, APMConfiguration aPMConfiguration, Integer num) {
        AbstractC167017dG.A1P(vg3, aPMBloksNativeProps);
        this.A03 = vg3;
        this.A00 = aPMBloksNativeProps;
        this.A02 = num;
        this.A01 = aPMConfiguration;
    }
}
