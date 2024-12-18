package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C3U5;
import X.C63471SlC;
import X.MSY;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(70);
    public Bundle A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A01.equals(((ActivityTransitionResult) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public ActivityTransitionResult(List list, Bundle bundle) {
        this.A00 = null;
        C3U5.A03(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                C3U5.A07(MSY.A1R((((ActivityTransitionEvent) list.get(i)).A02 > ((ActivityTransitionEvent) list.get(i - 1)).A02 ? 1 : (((ActivityTransitionEvent) list.get(i)).A02 == ((ActivityTransitionEvent) list.get(i - 1)).A02 ? 0 : -1))));
            }
        }
        this.A01 = Collections.unmodifiableList(list);
        this.A00 = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0E(parcel, this.A01, 1, false);
        AbstractC128825rw.A02(this.A00, parcel, 2);
        AbstractC128825rw.A06(parcel, A04);
    }
}
