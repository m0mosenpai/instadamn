package com.google.android.exoplayer2.metadata.scte35;

import X.AbstractC25225BEi;
import X.C63470SlB;
import X.SEL;
import X.SXI;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(78);
    public final List A00;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A00;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            SXI sxi = (SXI) list.get(i2);
            parcel.writeLong(sxi.A04);
            parcel.writeByte(sxi.A0A ? (byte) 1 : (byte) 0);
            parcel.writeByte(sxi.A08 ? (byte) 1 : (byte) 0);
            parcel.writeByte(sxi.A09 ? (byte) 1 : (byte) 0);
            List list2 = sxi.A06;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                SEL sel = (SEL) list2.get(i3);
                parcel.writeInt(sel.A00);
                parcel.writeLong(sel.A01);
            }
            parcel.writeLong(sxi.A05);
            parcel.writeByte(sxi.A07 ? (byte) 1 : (byte) 0);
            parcel.writeLong(sxi.A03);
            parcel.writeInt(sxi.A02);
            parcel.writeInt(sxi.A00);
            parcel.writeInt(sxi.A01);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList A17 = AbstractC25225BEi.A17(readInt);
        for (int i = 0; i < readInt; i++) {
            A17.add(new SXI(parcel));
        }
        this.A00 = Collections.unmodifiableList(A17);
    }

    public SpliceScheduleCommand(List list) {
        this.A00 = Collections.unmodifiableList(list);
    }
}
