package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C00O;
import X.C3U5;
import X.C63474SlF;
import X.C73287XzX;
import X.JQ0;
import X.RjX;
import X.SSI;
import X.SSJ;
import X.T63;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(76);
    public ResultReceiver A00;
    public final AuthenticationExtensions A01;
    public final TokenBinding A02;
    public final Double A03;
    public final Integer A04;
    public final String A05;
    public final List A06;
    public final byte[] A07;
    public final UserVerificationRequirement A08;
    public final Long A09;

    public final boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredentialRequestOptions) {
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
            if (Arrays.equals(this.A07, publicKeyCredentialRequestOptions.A07) && SSI.A01(this.A03, publicKeyCredentialRequestOptions.A03) && SSI.A01(this.A05, publicKeyCredentialRequestOptions.A05)) {
                List list = this.A06;
                List list2 = publicKeyCredentialRequestOptions.A06;
                if (list != null ? !(list2 == null || !list.containsAll(list2) || !list2.containsAll(list)) : list2 == null) {
                    if (SSI.A01(this.A04, publicKeyCredentialRequestOptions.A04) && SSI.A01(this.A02, publicKeyCredentialRequestOptions.A02) && SSI.A01(this.A08, publicKeyCredentialRequestOptions.A08) && SSI.A01(this.A01, publicKeyCredentialRequestOptions.A01)) {
                        return SSI.A00(this.A09, publicKeyCredentialRequestOptions.A09);
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.A07)), this.A03, this.A05, this.A06, this.A04, this.A02, this.A08, this.A01, this.A09});
    }

    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.A01;
        UserVerificationRequirement userVerificationRequirement = this.A08;
        TokenBinding tokenBinding = this.A02;
        List list = this.A06;
        String A00 = SSJ.A00(this.A07);
        String valueOf = String.valueOf(list);
        String valueOf2 = String.valueOf(tokenBinding);
        String valueOf3 = String.valueOf(userVerificationRequirement);
        String valueOf4 = String.valueOf(authenticationExtensions);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PublicKeyCredentialRequestOptions{\n challenge=");
        A1C.append(A00);
        A1C.append(", \n timeoutSeconds=");
        A1C.append(this.A03);
        A1C.append(", \n rpId='");
        A1C.append(this.A05);
        A1C.append("', \n allowList=");
        A1C.append(valueOf);
        A1C.append(", \n requestId=");
        A1C.append(this.A04);
        A1C.append(", \n tokenBinding=");
        A1C.append(valueOf2);
        A1C.append(", \n userVerification=");
        A1C.append(valueOf3);
        A1C.append(", \n authenticationExtensions=");
        A1C.append(valueOf4);
        A1C.append(", \n longRequestId=");
        return JQ0.A0l(this.A09, A1C);
    }

    public PublicKeyCredentialRequestOptions(ResultReceiver resultReceiver, AuthenticationExtensions authenticationExtensions, TokenBinding tokenBinding, Double d, Integer num, Long l, String str, String str2, String str3, List list, byte[] bArr) {
        this.A00 = resultReceiver;
        if (str3 != null) {
            T63.A01.A00.FFc();
            C73287XzX.A0A.FFc();
            throw C00O.createAndThrow();
        }
        C3U5.A02(bArr);
        this.A07 = bArr;
        this.A03 = d;
        C3U5.A02(str);
        this.A05 = str;
        this.A06 = list;
        this.A04 = num;
        this.A02 = tokenBinding;
        this.A09 = l;
        if (str2 != null) {
            try {
                this.A08 = UserVerificationRequirement.A00(str2);
            } catch (RjX e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.A01 = authenticationExtensions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1R = AbstractC58319PtB.A1R(parcel, this.A07);
        Double d = this.A03;
        if (d != null) {
            AbstractC58322PtE.A1C(parcel, d, 524291);
        }
        AbstractC128825rw.A0C(parcel, this.A05, 4, A1R);
        AbstractC128825rw.A0E(parcel, this.A06, 5, A1R);
        Integer num = this.A04;
        if (num != null) {
            parcel.writeInt(262150);
            AbstractC58318PtA.A1H(parcel, num);
        }
        AbstractC128825rw.A0A(parcel, this.A02, 7, i, A1R);
        UserVerificationRequirement userVerificationRequirement = this.A08;
        String str = null;
        if (userVerificationRequirement != null) {
            str = userVerificationRequirement.toString();
        }
        AbstractC128825rw.A0C(parcel, str, 8, A1R);
        AbstractC128825rw.A0A(parcel, this.A01, 9, i, A1R);
        Long l = this.A09;
        if (l != null) {
            parcel.writeInt(524298);
            AbstractC58318PtA.A1G(parcel, l);
        }
        AbstractC128825rw.A0A(parcel, this.A00, 12, i, A1R);
        AbstractC128825rw.A06(parcel, A04);
    }
}
