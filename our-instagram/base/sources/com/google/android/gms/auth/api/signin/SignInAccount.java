package com.google.android.gms.auth.api.signin;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C3U5;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(20);

    @Deprecated
    public final String zba;

    @Deprecated
    public final String zbb;
    public final GoogleSignInAccount zbc;

    public final GoogleSignInAccount zba() {
        return this.zbc;
    }

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.zbc = googleSignInAccount;
        C3U5.A06(str, "8.3 and 8.4 SDKs require non-null email");
        this.zba = str;
        C3U5.A06(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.zbb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0C(parcel, this.zba, 4, false);
        AbstractC128825rw.A0A(parcel, this.zbc, 7, i, false);
        AbstractC128825rw.A0C(parcel, this.zbb, 8, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
