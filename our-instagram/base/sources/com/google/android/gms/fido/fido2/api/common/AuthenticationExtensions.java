package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(90);
    public final FidoAppIdExtension A00;
    public final UserVerificationMethodExtension A01;
    public final GoogleThirdPartyPaymentExtension A02;
    public final zzab A03;
    public final zzad A04;
    public final zzag A05;
    public final zzai A06;
    public final zzak A07;
    public final zzaw A08;
    public final zzs A09;
    public final zzu A0A;
    public final zzz A0B;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        if (!SSI.A01(this.A00, authenticationExtensions.A00) || !SSI.A01(this.A09, authenticationExtensions.A09) || !SSI.A01(this.A01, authenticationExtensions.A01) || !SSI.A01(this.A0B, authenticationExtensions.A0B) || !SSI.A01(this.A03, authenticationExtensions.A03) || !SSI.A01(this.A04, authenticationExtensions.A04) || !SSI.A01(this.A0A, authenticationExtensions.A0A) || !SSI.A01(this.A05, authenticationExtensions.A05) || !SSI.A01(this.A02, authenticationExtensions.A02) || !SSI.A01(this.A07, authenticationExtensions.A07) || !SSI.A01(this.A08, authenticationExtensions.A08)) {
            return false;
        }
        return SSI.A00(this.A06, authenticationExtensions.A06);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A09, this.A01, this.A0B, this.A03, this.A04, this.A0A, this.A05, this.A02, this.A07, this.A08, this.A06});
    }

    public final String toString() {
        zzaw zzawVar = this.A08;
        zzak zzakVar = this.A07;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.A02;
        zzag zzagVar = this.A05;
        zzu zzuVar = this.A0A;
        zzad zzadVar = this.A04;
        zzab zzabVar = this.A03;
        zzz zzzVar = this.A0B;
        UserVerificationMethodExtension userVerificationMethodExtension = this.A01;
        zzs zzsVar = this.A09;
        String valueOf = String.valueOf(this.A00);
        String valueOf2 = String.valueOf(zzsVar);
        String valueOf3 = String.valueOf(userVerificationMethodExtension);
        String valueOf4 = String.valueOf(zzzVar);
        String valueOf5 = String.valueOf(zzabVar);
        String valueOf6 = String.valueOf(zzadVar);
        String valueOf7 = String.valueOf(zzuVar);
        String valueOf8 = String.valueOf(zzagVar);
        String valueOf9 = String.valueOf(googleThirdPartyPaymentExtension);
        String valueOf10 = String.valueOf(zzakVar);
        String valueOf11 = String.valueOf(zzawVar);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AuthenticationExtensions{\n fidoAppIdExtension=");
        A1C.append(valueOf);
        A1C.append(", \n cableAuthenticationExtension=");
        A1C.append(valueOf2);
        A1C.append(", \n userVerificationMethodExtension=");
        A1C.append(valueOf3);
        A1C.append(", \n googleMultiAssertionExtension=");
        A1C.append(valueOf4);
        A1C.append(", \n googleSessionIdExtension=");
        A1C.append(valueOf5);
        A1C.append(", \n googleSilentVerificationExtension=");
        A1C.append(valueOf6);
        A1C.append(", \n devicePublicKeyExtension=");
        A1C.append(valueOf7);
        A1C.append(", \n googleTunnelServerIdExtension=");
        A1C.append(valueOf8);
        A1C.append(", \n googleThirdPartyPaymentExtension=");
        A1C.append(valueOf9);
        A1C.append(", \n prfExtension=");
        A1C.append(valueOf10);
        A1C.append(", \n simpleTransactionAuthorizationExtension=");
        return AbstractC50523MSb.A0W(valueOf11, A1C);
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, UserVerificationMethodExtension userVerificationMethodExtension, zzab zzabVar, zzad zzadVar, zzag zzagVar, zzai zzaiVar, zzak zzakVar, zzaw zzawVar, zzs zzsVar, zzu zzuVar, zzz zzzVar) {
        this.A00 = fidoAppIdExtension;
        this.A01 = userVerificationMethodExtension;
        this.A09 = zzsVar;
        this.A0B = zzzVar;
        this.A03 = zzabVar;
        this.A04 = zzadVar;
        this.A0A = zzuVar;
        this.A05 = zzagVar;
        this.A02 = googleThirdPartyPaymentExtension;
        this.A07 = zzakVar;
        this.A08 = zzawVar;
        this.A06 = zzaiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1U = AbstractC58322PtE.A1U(parcel, this.A00, i);
        AbstractC128825rw.A0A(parcel, this.A09, 3, i, A1U);
        AbstractC128825rw.A0A(parcel, this.A01, 4, i, A1U);
        AbstractC128825rw.A0A(parcel, this.A0B, 5, i, A1U);
        AbstractC128825rw.A0A(parcel, this.A03, 6, i, A1U);
        AbstractC128825rw.A0A(parcel, this.A04, 7, i, A1U);
        AbstractC128825rw.A0A(parcel, this.A0A, 8, i, A1U);
        AbstractC128825rw.A0A(parcel, this.A05, 9, i, A1U);
        AbstractC128825rw.A0A(parcel, this.A02, 10, i, A1U);
        AbstractC128825rw.A0A(parcel, this.A07, 11, i, A1U);
        AbstractC128825rw.A0A(parcel, this.A08, 12, i, A1U);
        AbstractC128825rw.A0A(parcel, this.A06, 13, i, A1U);
        AbstractC128825rw.A06(parcel, A04);
    }
}
