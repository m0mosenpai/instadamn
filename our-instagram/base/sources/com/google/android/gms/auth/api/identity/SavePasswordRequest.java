package com.google.android.gms.auth.api.identity;

import X.AbstractC128825rw;
import X.AbstractC37301Gc2;
import X.AbstractC58319PtB;
import X.C3U5;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(10);
    public final int A00;
    public final SignInPassword A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        if (!SSI.A01(this.A01, savePasswordRequest.A01) || !SSI.A01(this.A02, savePasswordRequest.A02) || this.A00 != savePasswordRequest.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A01, this.A02);
    }

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
        C3U5.A02(signInPassword);
        this.A01 = signInPassword;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0A(parcel, this.A01, 1, i, false);
        AbstractC128825rw.A0B(parcel, this.A02);
        AbstractC128825rw.A07(parcel, 3, this.A00);
        AbstractC128825rw.A06(parcel, A04);
    }
}
