package com.google.android.gms.auth.api.identity;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C3U5;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(3);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        if (!SSI.A01(this.A01, getSignInIntentRequest.A01) || !SSI.A01(this.A04, getSignInIntentRequest.A04) || !SSI.A01(this.A02, getSignInIntentRequest.A02) || !SSI.A01(Boolean.valueOf(this.A05), Boolean.valueOf(getSignInIntentRequest.A05)) || this.A00 != getSignInIntentRequest.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(this.A01, this.A02, this.A04, Boolean.valueOf(this.A05), Integer.valueOf(this.A00));
    }

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, int i, boolean z) {
        C3U5.A02(str);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = z;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1Q = AbstractC58319PtB.A1Q(parcel, this.A01);
        AbstractC128825rw.A0B(parcel, this.A02);
        AbstractC128825rw.A0C(parcel, this.A03, 3, A1Q);
        AbstractC128825rw.A0C(parcel, this.A04, 4, A1Q);
        AbstractC128825rw.A09(parcel, 5, this.A05);
        AbstractC128825rw.A07(parcel, 6, this.A00);
        AbstractC128825rw.A06(parcel, A04);
    }
}
