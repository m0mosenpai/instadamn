package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC25228BEl;
import X.AbstractC31173DnH;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C62727SNr;
import X.C63474SlF;
import X.RjT;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes10.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(96);
    public final ErrorCode A00;
    public final String A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        if (!SSI.A01(this.A00, authenticatorErrorResponse.A00) || !SSI.A01(this.A01, authenticatorErrorResponse.A01)) {
            return false;
        }
        return SSI.A00(Integer.valueOf(this.A02), Integer.valueOf(authenticatorErrorResponse.A02));
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(this.A00, this.A01, Integer.valueOf(this.A02));
    }

    public AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (i == errorCode.A00) {
                    this.A00 = errorCode;
                    this.A01 = str;
                    this.A02 = i2;
                    return;
                }
            }
            throw new Exception(String.format(Locale.US, "Error code %d is not supported", AbstractC25228BEl.A1Y(i)));
        } catch (RjT e) {
            throw new IllegalArgumentException(e);
        }
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
        AbstractC58322PtE.A1B(parcel, this.A02, A04);
    }
}
