package com.google.android.gms.auth.api.identity;

import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.C3U5;
import X.C63474SlF;
import X.SSI;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(11);
    public final PendingIntent A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordResult)) {
            return false;
        }
        return SSI.A01(this.A00, ((SavePasswordResult) obj).A00);
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(this.A00);
    }

    public SavePasswordResult(PendingIntent pendingIntent) {
        C3U5.A02(pendingIntent);
        this.A00 = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58320PtC.A1G(parcel, this.A00, i, AbstractC58319PtB.A04(parcel));
    }
}
