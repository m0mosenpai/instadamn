package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC65703TsZ;
import X.AbstractC69837VwN;
import X.C14360o3;
import X.C70221WIe;
import X.EnumC61212RhC;
import X.EnumC61219RhJ;
import X.EnumC72407Xcu;
import X.JQ0;
import X.UWg;
import X.VG3;
import X.XJm;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class SelectionPaymentMethodItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(24);
    public UWg A00;
    public EnumC61212RhC A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final XJm A08;
    public final EnumC72407Xcu A09;
    public final EnumC61219RhJ A0A;
    public final Integer A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final VG3 A0L;
    public final boolean A0M;

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public final void Eda(Integer num) {
        C14360o3.A0B(num, 0);
        this.A03 = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A0L);
        parcel.writeString(AbstractC69837VwN.A01(this.A03));
        parcel.writeString(this.A0F);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        AbstractC65703TsZ.A1H(parcel, this.A01);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0E);
        parcel.writeValue(this.A08);
        AbstractC65703TsZ.A1H(parcel, this.A0A);
        parcel.writeString(this.A0C);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        parcel.writeValue(this.A00);
        AbstractC166997dE.A1I(parcel, this.A09);
        parcel.writeString(this.A0D);
        AbstractC167027dH.A0o(parcel, this.A0B, 0, 1);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A0L;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public final Integer Bsx() {
        return this.A03;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public final String getId() {
        return this.A0F;
    }

    public SelectionPaymentMethodItem(UWg uWg, VG3 vg3, XJm xJm, EnumC72407Xcu enumC72407Xcu, EnumC61212RhC enumC61212RhC, EnumC61219RhJ enumC61219RhJ, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        JQ0.A1O(vg3, num, str, str2, str3);
        C14360o3.A0B(enumC72407Xcu, 14);
        C14360o3.A0B(str7, 15);
        this.A0L = vg3;
        this.A03 = num;
        this.A0F = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = enumC61212RhC;
        this.A0I = str4;
        this.A0E = str5;
        this.A08 = xJm;
        this.A0A = enumC61219RhJ;
        this.A0C = str6;
        this.A02 = num2;
        this.A00 = uWg;
        this.A09 = enumC72407Xcu;
        this.A0D = str7;
        this.A0B = num3;
        this.A06 = z;
        this.A0J = z2;
        this.A0M = z3;
        this.A0G = str8;
        this.A0H = str9;
        this.A0K = z4;
        this.A07 = z5;
    }
}
