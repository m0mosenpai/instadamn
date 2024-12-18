package com.instagram.appreciation.analytics.creator;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public final class CreatorLoggingData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(6);
    public final Map A00;
    public final boolean A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorLoggingData) {
                CreatorLoggingData creatorLoggingData = (CreatorLoggingData) obj;
                if (this.A01 != creatorLoggingData.A01 || this.A02 != creatorLoggingData.A02 || !C14360o3.A0K(this.A00, creatorLoggingData.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        Map map = this.A00;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0s = AbstractC167017dG.A0s(parcel, map);
        while (A0s.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A0s);
            parcel.writeLong(AbstractC166987dD.A0N(A1K.getKey()));
            parcel.writeLong(AbstractC166987dD.A0N(A1K.getValue()));
        }
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC25225BEi.A08(this.A01)) + AbstractC167017dG.A0M(this.A00);
    }

    public CreatorLoggingData(boolean z, boolean z2, Map map) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = map;
    }
}
