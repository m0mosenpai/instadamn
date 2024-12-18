package com.instagram.creation.capture.quickcapture.effectinfobottomsheet;

import X.C22P;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: classes8.dex */
public class EffectInfoBottomSheetConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(50);
    public int A00;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public ImmutableList A02 = ImmutableList.of();
    public C22P A01 = C22P.A5N;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A06 ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.A01);
        parcel.writeString(this.A03);
        parcel.writeByte(this.A05 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
    }
}
