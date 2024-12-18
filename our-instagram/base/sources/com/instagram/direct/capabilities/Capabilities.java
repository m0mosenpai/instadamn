package com.instagram.direct.capabilities;

import X.C14360o3;
import X.C206139Av;
import X.EnumC2054697t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.BitSet;

/* loaded from: classes4.dex */
public final class Capabilities implements Parcelable {
    public final BitSet A00;
    public final BitSet A01;
    public static final Parcelable.Creator CREATOR = new C206139Av(72);
    public static final Capabilities A02 = new Capabilities(new BitSet(), new BitSet());

    public final boolean A00(EnumC2054697t enumC2054697t) {
        BitSet bitSet;
        C14360o3.A0B(enumC2054697t, 0);
        int i = enumC2054697t.A00;
        if (i < 0) {
            bitSet = this.A01;
            i = -i;
        } else {
            bitSet = this.A00;
        }
        return bitSet.get(i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
                Capabilities capabilities = (Capabilities) obj;
                if (!C14360o3.A0K(this.A01, capabilities.A01) || !C14360o3.A0K(this.A00, capabilities.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeByteArray(this.A01.toByteArray());
        parcel.writeByteArray(this.A00.toByteArray());
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public Capabilities(BitSet bitSet, BitSet bitSet2) {
        this.A01 = bitSet;
        this.A00 = bitSet2;
    }
}
