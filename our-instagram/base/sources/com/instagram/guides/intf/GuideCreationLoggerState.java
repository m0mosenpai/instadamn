package com.instagram.guides.intf;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.EnumC33459Equ;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class GuideCreationLoggerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(92);
    public int A00;
    public int A01;
    public long A02;
    public GuideCreationType A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final EnumC33459Equ A09;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        AbstractC166997dE.A1I(parcel, this.A09);
        this.A03.writeToParcel(parcel, i);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public GuideCreationLoggerState(EnumC33459Equ enumC33459Equ, GuideCreationType guideCreationType, String str, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167017dG.A1R(enumC33459Equ, guideCreationType);
        this.A04 = str;
        this.A09 = enumC33459Equ;
        this.A03 = guideCreationType;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = z;
        this.A08 = z2;
        this.A05 = z3;
        this.A06 = z4;
        if (enumC33459Equ == EnumC33459Equ.A02) {
            this.A05 = true;
            this.A06 = true;
        }
    }
}
