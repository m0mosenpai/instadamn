package com.google.android.gms.fido.u2f.api.common;

import X.AbstractC128825rw;
import X.AbstractC31173DnH;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.C3U5;
import X.C62727SNr;
import X.C63471SlC;
import X.SK8;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* loaded from: classes10.dex */
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(18);
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        if (!Arrays.equals(this.A01, signResponseData.A01) || !SSI.A01(this.A00, signResponseData.A00) || !Arrays.equals(this.A02, signResponseData.A02) || !Arrays.equals(this.A03, signResponseData.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0C(Integer.valueOf(Arrays.hashCode(this.A01)), this.A00, Integer.valueOf(Arrays.hashCode(this.A02)), Integer.valueOf(Arrays.hashCode(this.A03)));
    }

    public SignResponseData(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C3U5.A02(bArr);
        this.A01 = bArr;
        C3U5.A02(str);
        this.A00 = str;
        C3U5.A02(bArr2);
        this.A02 = bArr2;
        C3U5.A02(bArr3);
        this.A03 = bArr3;
    }

    public final String toString() {
        C62727SNr c62727SNr = new C62727SNr(AbstractC31173DnH.A0q(this));
        SK8 sk8 = SK8.A00;
        byte[] bArr = this.A01;
        c62727SNr.A00(sk8.A00(bArr, bArr.length), "keyHandle");
        c62727SNr.A00(this.A00, "clientDataString");
        byte[] bArr2 = this.A02;
        c62727SNr.A00(sk8.A00(bArr2, bArr2.length), "signatureData");
        byte[] bArr3 = this.A03;
        c62727SNr.A00(sk8.A00(bArr3, bArr3.length), "application");
        return c62727SNr.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1R = AbstractC58319PtB.A1R(parcel, this.A01);
        AbstractC128825rw.A0C(parcel, this.A00, 3, A1R);
        AbstractC128825rw.A0F(parcel, this.A02, 4, A1R);
        AbstractC128825rw.A0F(parcel, this.A03, 5, A1R);
        AbstractC128825rw.A06(parcel, A04);
    }
}
