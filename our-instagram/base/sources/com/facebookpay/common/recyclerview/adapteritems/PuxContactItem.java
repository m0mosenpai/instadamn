package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC31181DnP;
import X.C14360o3;
import X.C70221WIe;
import X.InterfaceC71897X9e;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class PuxContactItem implements BaseCheckoutItem, InterfaceC71897X9e {
    public static final Parcelable.Creator CREATOR = new C70221WIe(8);
    public final VG3 A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public PuxContactItem(VG3 vg3, Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        C14360o3.A0B(vg3, 1);
        this.A00 = vg3;
        this.A01 = num;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = z;
        this.A02 = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A00);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A01));
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A02);
    }

    @Override // X.InterfaceC71897X9e
    public final Integer B7v() {
        return this.A01;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A00;
    }

    public PuxContactItem() {
        this(VG3.A0c, null, null, null, null, null, null, false);
    }
}
