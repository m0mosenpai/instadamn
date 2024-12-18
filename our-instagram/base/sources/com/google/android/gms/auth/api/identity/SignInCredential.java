package com.google.android.gms.auth.api.identity;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C3U5;
import X.C63474SlF;
import X.SSI;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(12);
    public final Uri A00;
    public final PublicKeyCredential A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        if (!SSI.A01(this.A02, signInCredential.A02) || !SSI.A01(this.A03, signInCredential.A03) || !SSI.A01(this.A04, signInCredential.A04) || !SSI.A01(this.A05, signInCredential.A05) || !SSI.A01(this.A00, signInCredential.A00) || !SSI.A01(this.A06, signInCredential.A06) || !SSI.A01(this.A07, signInCredential.A07) || !SSI.A01(this.A08, signInCredential.A08)) {
            return false;
        }
        return SSI.A00(this.A01, signInCredential.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A04, this.A05, this.A00, this.A06, this.A07, this.A08, this.A01});
    }

    public SignInCredential(Uri uri, PublicKeyCredential publicKeyCredential, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C3U5.A04(str);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = uri;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = str7;
        this.A01 = publicKeyCredential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1Q = AbstractC58319PtB.A1Q(parcel, this.A02);
        AbstractC128825rw.A0B(parcel, this.A03);
        AbstractC128825rw.A0C(parcel, this.A04, 3, A1Q);
        AbstractC128825rw.A0C(parcel, this.A05, 4, A1Q);
        AbstractC128825rw.A0A(parcel, this.A00, 5, i, A1Q);
        AbstractC128825rw.A0C(parcel, this.A06, 6, A1Q);
        AbstractC128825rw.A0C(parcel, this.A07, 7, A1Q);
        AbstractC128825rw.A0C(parcel, this.A08, 8, A1Q);
        AbstractC128825rw.A0A(parcel, this.A01, 9, i, A1Q);
        AbstractC128825rw.A06(parcel, A04);
    }
}
