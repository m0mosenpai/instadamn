package com.google.android.gms.fido.u2f.api.common;

import X.AbstractC128825rw;
import X.AbstractC31173DnH;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C62727SNr;
import X.C63471SlC;
import X.RjZ;
import X.SK8;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* loaded from: classes10.dex */
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(15);
    public final String A00;
    public final byte[] A01;
    public final ProtocolVersion A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        if (!SSI.A01(this.A02, registerResponseData.A02) || !Arrays.equals(this.A01, registerResponseData.A01)) {
            return false;
        }
        return SSI.A00(this.A00, registerResponseData.A00);
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(this.A02, Integer.valueOf(Arrays.hashCode(this.A01)), this.A00);
    }

    public RegisterResponseData(String str, String str2, byte[] bArr) {
        this.A01 = bArr;
        try {
            this.A02 = ProtocolVersion.A00(str);
            this.A00 = str2;
        } catch (RjZ e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final String toString() {
        C62727SNr c62727SNr = new C62727SNr(AbstractC31173DnH.A0q(this));
        c62727SNr.A00(this.A02, "protocolVersion");
        SK8 sk8 = SK8.A00;
        byte[] bArr = this.A01;
        c62727SNr.A00(sk8.A00(bArr, bArr.length), "registerData");
        String str = this.A00;
        if (str != null) {
            c62727SNr.A00(str, "clientDataString");
        }
        return c62727SNr.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1R = AbstractC58319PtB.A1R(parcel, this.A01);
        AbstractC128825rw.A0C(parcel, this.A02.toString(), 3, A1R);
        AbstractC58322PtE.A1F(parcel, this.A00, A04, A1R);
    }
}
