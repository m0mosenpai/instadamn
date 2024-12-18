package com.google.android.gms.fido.u2f.api.common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import X.RjZ;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* loaded from: classes10.dex */
public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(11);
    public final int A00;
    public final ProtocolVersion A01;
    public final List A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KeyHandle) {
                KeyHandle keyHandle = (KeyHandle) obj;
                if (Arrays.equals(this.A03, keyHandle.A03) && this.A01.equals(keyHandle.A01)) {
                    List list = this.A02;
                    List list2 = keyHandle.A02;
                    if (list != null ? list2 == null || !list.containsAll(list2) || !list2.containsAll(list) : list2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(Integer.valueOf(Arrays.hashCode(this.A03)), this.A01, this.A02);
    }

    public final String toString() {
        String obj;
        String encodeToString;
        List list = this.A02;
        if (list == null) {
            obj = "null";
        } else {
            obj = list.toString();
        }
        byte[] bArr = this.A03;
        if (bArr == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bArr, 0);
        }
        return String.format("{keyHandle: %s, version: %s, transports: %s}", encodeToString, this.A01, obj);
    }

    public KeyHandle(String str, List list, byte[] bArr, int i) {
        this.A00 = i;
        this.A03 = bArr;
        try {
            this.A01 = ProtocolVersion.A00(str);
            this.A02 = list;
        } catch (RjZ e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        boolean A1R = AbstractC58319PtB.A1R(parcel, this.A03);
        AbstractC128825rw.A0C(parcel, this.A01.toString(), 3, A1R);
        AbstractC128825rw.A0E(parcel, this.A02, 4, A1R);
        AbstractC128825rw.A06(parcel, A04);
    }
}
