package com.instagram.shopping.intf.productpicker;

import X.AbstractC41359ISm;
import X.C14360o3;
import X.C37324GcR;
import X.EnumC39584Hdu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes7.dex */
public final class ProductPickerArguments implements Parcelable {
    public static final C37324GcR CREATOR = C37324GcR.A00(71);
    public final EnumC39584Hdu A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        parcel.writeString(AbstractC41359ISm.A00(this.A01));
        parcel.writeString(this.A02);
        parcel.writeByte(this.A0D ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A05);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeTypedList(this.A08);
        parcel.writeTypedList(this.A07);
        parcel.writeStringList(this.A09);
        EnumC39584Hdu enumC39584Hdu = this.A00;
        if (enumC39584Hdu != null) {
            str = enumC39584Hdu.A00;
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A06);
    }

    public ProductPickerArguments(EnumC39584Hdu enumC39584Hdu, Integer num, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = num;
        this.A02 = str;
        this.A0D = z;
        this.A05 = str2;
        this.A0A = z2;
        this.A03 = str3;
        this.A04 = str4;
        this.A08 = list;
        this.A07 = list2;
        this.A09 = list3;
        this.A00 = enumC39584Hdu;
        this.A0C = z3;
        this.A0B = z4;
        this.A06 = str5;
    }
}
