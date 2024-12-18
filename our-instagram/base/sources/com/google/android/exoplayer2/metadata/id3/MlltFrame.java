package com.google.android.exoplayer2.metadata.id3;

import X.C63470SlB;
import X.JQ0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(66);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;
    public final int[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MlltFrame mlltFrame = (MlltFrame) obj;
            if (this.A02 != mlltFrame.A02 || this.A00 != mlltFrame.A00 || this.A01 != mlltFrame.A01 || !Arrays.equals(this.A03, mlltFrame.A03) || !Arrays.equals(this.A04, mlltFrame.A04)) {
                return false;
            }
        }
        return true;
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.createIntArray();
        this.A04 = parcel.createIntArray();
    }

    public final int hashCode() {
        return ((((((JQ0.A01(this.A02) + this.A00) * 31) + this.A01) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeIntArray(this.A03);
        parcel.writeIntArray(this.A04);
    }

    public MlltFrame(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        super("MLLT");
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = iArr;
        this.A04 = iArr2;
    }
}
