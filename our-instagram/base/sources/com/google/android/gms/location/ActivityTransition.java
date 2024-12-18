package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC25228BEl;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(67);
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityTransition) {
                ActivityTransition activityTransition = (ActivityTransition) obj;
                if (this.A00 != activityTransition.A00 || this.A01 != activityTransition.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(AbstractC25228BEl.A1Z(Integer.valueOf(this.A00), this.A01));
    }

    public final String toString() {
        int i = this.A00;
        int i2 = this.A01;
        StringBuilder A0q = AbstractC58318PtA.A0q(75);
        A0q.append("ActivityTransition [mActivityType=");
        A0q.append(i);
        A0q.append(", mTransitionType=");
        A0q.append(i2);
        return AbstractC58320PtC.A14(A0q);
    }

    public ActivityTransition(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A07(parcel, 2, this.A01);
        AbstractC128825rw.A06(parcel, A04);
    }
}
