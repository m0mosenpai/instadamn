package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC31173DnH;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC64537TIt;
import X.C3U5;
import X.C62727SNr;
import X.C63474SlF;
import X.RMJ;
import X.SK8;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(94);
    public final AbstractC64537TIt A00;
    public final AbstractC64537TIt A01;
    public final AbstractC64537TIt A02;
    public final AbstractC64537TIt A03;
    public final AbstractC64537TIt A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        if (!SSI.A01(this.A00, authenticatorAssertionResponse.A00) || !SSI.A01(this.A01, authenticatorAssertionResponse.A01) || !SSI.A01(this.A02, authenticatorAssertionResponse.A02) || !SSI.A01(this.A03, authenticatorAssertionResponse.A03)) {
            return false;
        }
        return SSI.A00(this.A04, authenticatorAssertionResponse.A04);
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(Integer.valueOf(AbstractC58322PtE.A08(this.A00)), Integer.valueOf(AbstractC58322PtE.A08(this.A01)), Integer.valueOf(AbstractC58322PtE.A08(this.A02)), Integer.valueOf(AbstractC58322PtE.A08(this.A03)), Integer.valueOf(AbstractC58322PtE.A08(this.A04)));
    }

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        RMJ A01;
        RMJ A0f = AbstractC58321PtD.A0f(bArr);
        RMJ A0f2 = AbstractC58321PtD.A0f(bArr2);
        RMJ A0f3 = AbstractC58321PtD.A0f(bArr3);
        RMJ A0f4 = AbstractC58321PtD.A0f(bArr4);
        if (bArr5 == null) {
            A01 = null;
        } else {
            A01 = AbstractC64537TIt.A01(bArr5, bArr5.length);
        }
        C3U5.A02(A0f);
        this.A00 = A0f;
        C3U5.A02(A0f2);
        this.A01 = A0f2;
        C3U5.A02(A0f3);
        this.A02 = A0f3;
        C3U5.A02(A0f4);
        this.A03 = A0f4;
        this.A04 = A01;
    }

    public final String toString() {
        C62727SNr c62727SNr = new C62727SNr(AbstractC31173DnH.A0q(this));
        SK8 sk8 = SK8.A00;
        c62727SNr.A00(AbstractC58322PtE.A0p(sk8, this.A00), "keyHandle");
        c62727SNr.A00(AbstractC58322PtE.A0p(sk8, this.A01), PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA);
        c62727SNr.A00(AbstractC58322PtE.A0p(sk8, this.A02), PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA);
        c62727SNr.A00(AbstractC58322PtE.A0p(sk8, this.A03), PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
        AbstractC64537TIt abstractC64537TIt = this.A04;
        if (abstractC64537TIt != null) {
            c62727SNr.A00(AbstractC58322PtE.A0p(sk8, abstractC64537TIt), PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE);
        }
        return c62727SNr.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1R = AbstractC58319PtB.A1R(parcel, this.A00.A03());
        AbstractC128825rw.A0F(parcel, this.A01.A03(), 3, A1R);
        AbstractC128825rw.A0F(parcel, this.A02.A03(), 4, A1R);
        AbstractC128825rw.A0F(parcel, this.A03.A03(), 5, A1R);
        AbstractC128825rw.A0F(parcel, AbstractC58322PtE.A1Z(this.A04), 6, A1R);
        AbstractC128825rw.A06(parcel, A04);
    }
}
