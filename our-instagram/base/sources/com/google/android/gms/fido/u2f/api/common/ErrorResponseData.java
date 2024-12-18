package com.google.android.gms.fido.u2f.api.common;

import X.AbstractC128825rw;
import X.AbstractC31173DnH;
import X.AbstractC37301Gc2;
import X.AbstractC58319PtB;
import X.C62727SNr;
import X.C63471SlC;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes10.dex */
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(10);
    public final ErrorCode A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        if (!SSI.A01(this.A00, errorResponseData.A00)) {
            return false;
        }
        return SSI.A00(this.A01, errorResponseData.A01);
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A00, this.A01);
    }

    public ErrorResponseData(int i, String str) {
        ErrorCode errorCode;
        ErrorCode[] values = ErrorCode.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                errorCode = values[i2];
                if (i == errorCode.A00) {
                    break;
                } else {
                    i2++;
                }
            } else {
                errorCode = ErrorCode.OTHER_ERROR;
                break;
            }
        }
        this.A00 = errorCode;
        this.A01 = str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.SGR, java.lang.Object] */
    public final String toString() {
        C62727SNr c62727SNr = new C62727SNr(AbstractC31173DnH.A0q(this));
        String valueOf = String.valueOf(this.A00.A00);
        ?? obj = new Object();
        c62727SNr.A00.A00 = obj;
        c62727SNr.A00 = obj;
        obj.A01 = valueOf;
        obj.A02 = "errorCode";
        String str = this.A01;
        if (str != null) {
            c62727SNr.A00(str, "errorMessage");
        }
        return c62727SNr.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A07(parcel, 2, this.A00.A00);
        AbstractC128825rw.A0C(parcel, this.A01, 3, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
