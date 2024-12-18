package com.google.android.gms.auth.api.identity;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C3U5;
import X.C63470SlB;
import X.SSI;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(99);
    public final PendingIntent A00;
    public final GoogleSignInAccount A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        if (!SSI.A01(this.A02, authorizationResult.A02) || !SSI.A01(this.A03, authorizationResult.A03) || !SSI.A01(this.A05, authorizationResult.A05) || !SSI.A01(this.A04, authorizationResult.A04) || !SSI.A01(this.A00, authorizationResult.A00)) {
            return false;
        }
        return SSI.A00(this.A01, authorizationResult.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A05, this.A04, this.A00, this.A01});
    }

    public AuthorizationResult(PendingIntent pendingIntent, GoogleSignInAccount googleSignInAccount, String str, String str2, String str3, List list) {
        this.A02 = str;
        this.A03 = str2;
        this.A05 = str3;
        C3U5.A02(list);
        this.A04 = list;
        this.A00 = pendingIntent;
        this.A01 = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1Q = AbstractC58319PtB.A1Q(parcel, this.A02);
        AbstractC128825rw.A0B(parcel, this.A03);
        AbstractC128825rw.A0C(parcel, this.A05, 3, A1Q);
        AbstractC128825rw.A0D(parcel, this.A04, 4);
        AbstractC128825rw.A0A(parcel, this.A01, 5, i, A1Q);
        AbstractC128825rw.A0A(parcel, this.A00, 6, i, A1Q);
        AbstractC128825rw.A06(parcel, A04);
    }
}
