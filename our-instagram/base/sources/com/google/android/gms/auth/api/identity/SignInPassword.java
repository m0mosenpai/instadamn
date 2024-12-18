package com.google.android.gms.auth.api.identity;

import X.AbstractC128825rw;
import X.AbstractC37301Gc2;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C3U5;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(13);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        if (!SSI.A01(this.A00, signInPassword.A00)) {
            return false;
        }
        return SSI.A00(this.A01, signInPassword.A01);
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A00, this.A01);
    }

    public SignInPassword(String str, String str2) {
        C3U5.A03(str, "Account identifier cannot be null");
        String trim = str.trim();
        C3U5.A06(trim, "Account identifier cannot be empty");
        this.A00 = trim;
        C3U5.A04(str2);
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC58322PtE.A1D(parcel, this.A00);
        AbstractC128825rw.A0B(parcel, this.A01);
        AbstractC128825rw.A06(parcel, A04);
    }
}
