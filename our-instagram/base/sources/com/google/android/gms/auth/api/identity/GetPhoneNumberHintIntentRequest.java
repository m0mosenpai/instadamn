package com.google.android.gms.auth.api.identity;

import X.AbstractC128825rw;
import X.AbstractC25228BEl;
import X.AbstractC58319PtB;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(2);
    public final int A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetPhoneNumberHintIntentRequest)) {
            return false;
        }
        return SSI.A01(Integer.valueOf(this.A00), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(AbstractC25228BEl.A1Y(this.A00));
    }

    public GetPhoneNumberHintIntentRequest(int i) {
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A06(parcel, A04);
    }
}
