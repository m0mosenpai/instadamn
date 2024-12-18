package com.instagram.business.controller.datamodel;

import X.C14360o3;
import X.C70220WId;
import X.EnumC33376Ep9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class BusinessConversionStep implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(33);
    public final EnumC33376Ep9 A00;
    public final ConversionStep A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BusinessConversionStep)) {
            return false;
        }
        BusinessConversionStep businessConversionStep = (BusinessConversionStep) obj;
        return businessConversionStep.A01 == this.A01 && businessConversionStep.A00 == this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public BusinessConversionStep(Parcel parcel) {
        EnumC33376Ep9 enumC33376Ep9;
        this.A01 = (ConversionStep) parcel.readParcelable(ConversionStep.class.getClassLoader());
        if (parcel.readInt() == 1) {
            enumC33376Ep9 = EnumC33376Ep9.A04;
        } else {
            enumC33376Ep9 = EnumC33376Ep9.A03;
        }
        this.A00 = enumC33376Ep9;
    }

    public BusinessConversionStep(EnumC33376Ep9 enumC33376Ep9, ConversionStep conversionStep) {
        this.A01 = conversionStep;
        this.A00 = enumC33376Ep9;
    }
}
