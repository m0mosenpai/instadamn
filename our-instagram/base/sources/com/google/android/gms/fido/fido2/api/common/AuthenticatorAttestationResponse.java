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
import java.util.Arrays;

/* loaded from: classes10.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(95);
    public final AbstractC64537TIt A00;
    public final AbstractC64537TIt A01;
    public final AbstractC64537TIt A02;
    public final String[] A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        if (!SSI.A01(this.A00, authenticatorAttestationResponse.A00) || !SSI.A01(this.A01, authenticatorAttestationResponse.A01)) {
            return false;
        }
        return SSI.A00(this.A02, authenticatorAttestationResponse.A02);
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(Integer.valueOf(AbstractC58322PtE.A08(this.A00)), Integer.valueOf(AbstractC58322PtE.A08(this.A01)), Integer.valueOf(AbstractC58322PtE.A08(this.A02)));
    }

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        RMJ A0f = AbstractC58321PtD.A0f(bArr);
        RMJ A0f2 = AbstractC58321PtD.A0f(bArr2);
        RMJ A0f3 = AbstractC58321PtD.A0f(bArr3);
        C3U5.A02(A0f);
        this.A00 = A0f;
        C3U5.A02(A0f2);
        this.A01 = A0f2;
        C3U5.A02(A0f3);
        this.A02 = A0f3;
        C3U5.A02(strArr);
        this.A03 = strArr;
    }

    public final String toString() {
        C62727SNr c62727SNr = new C62727SNr(AbstractC31173DnH.A0q(this));
        SK8 sk8 = SK8.A00;
        c62727SNr.A00(AbstractC58322PtE.A0p(sk8, this.A00), "keyHandle");
        c62727SNr.A00(AbstractC58322PtE.A0p(sk8, this.A01), PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA);
        c62727SNr.A00(AbstractC58322PtE.A0p(sk8, this.A02), PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ);
        c62727SNr.A00(Arrays.toString(this.A03), PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS);
        return c62727SNr.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1R = AbstractC58319PtB.A1R(parcel, this.A00.A03());
        AbstractC128825rw.A0F(parcel, this.A01.A03(), 3, A1R);
        AbstractC128825rw.A0F(parcel, this.A02.A03(), 4, A1R);
        AbstractC128825rw.A0H(parcel, this.A03, 5);
        AbstractC128825rw.A06(parcel, A04);
    }
}
