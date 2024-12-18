package com.google.android.gms.auth.api.signin.internal;

import X.AbstractC128825rw;
import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.C3U5;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(17);
    public final GoogleSignInOptions A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (!this.A01.equals(signInConfiguration.A01)) {
            return false;
        }
        GoogleSignInOptions googleSignInOptions = this.A00;
        GoogleSignInOptions googleSignInOptions2 = signInConfiguration.A00;
        if (googleSignInOptions == null) {
            if (googleSignInOptions2 != null) {
                return false;
            }
        } else if (!googleSignInOptions.equals(googleSignInOptions2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167017dG.A0O(this.A01) + 31) * 31) + AbstractC167017dG.A0M(this.A00);
    }

    public SignInConfiguration(GoogleSignInOptions googleSignInOptions, String str) {
        C3U5.A04(str);
        this.A01 = str;
        this.A00 = googleSignInOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0B(parcel, this.A01);
        AbstractC128825rw.A0A(parcel, this.A00, 5, i, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
