package com.google.android.exoplayer2.metadata.id3;

import X.AbstractC50523MSb;
import X.AbstractC58321PtD;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(60);
    public final byte[] A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (!super.A00.equals(((Id3Frame) binaryFrame).A00) || !Arrays.equals(this.A00, binaryFrame.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0E(this.A00, AbstractC50523MSb.A02(super.A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeByteArray(this.A00);
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.A00 = bArr;
    }

    public BinaryFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.createByteArray();
    }
}
