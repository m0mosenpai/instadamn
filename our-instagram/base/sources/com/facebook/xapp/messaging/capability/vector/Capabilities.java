package com.facebook.xapp.messaging.capability.vector;

import X.C14360o3;
import X.C206149Aw;
import X.C7I5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.BitSet;

/* loaded from: classes3.dex */
public final class Capabilities implements Parcelable {
    public final BitSet A00;
    public static final C7I5 A01 = new Object();
    public static final Parcelable.Creator CREATOR = new C206149Aw(27);
    public static final Capabilities A02 = new Capabilities(new BitSet());

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        C14360o3.A0B(parcel, 0);
        BitSet bitSet = this.A00;
        byte[] bArr = new byte[(bitSet.length() + 7) / 8];
        while (true) {
            int nextSetBit = bitSet.nextSetBit(i2);
            if (nextSetBit >= 0) {
                int i3 = nextSetBit / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (nextSetBit % 8)));
                i2 = nextSetBit + 1;
            } else {
                parcel.writeByteArray(bArr);
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Capabilities)) {
            return C14360o3.A0K(this.A00, ((Capabilities) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Capabilities(");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public Capabilities(BitSet bitSet) {
        this.A00 = bitSet;
    }
}
