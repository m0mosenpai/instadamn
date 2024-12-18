package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC166997dE;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AnonymousClass001;
import X.C3U5;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(68);
    public final int A00;
    public final int A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityTransitionEvent) {
                ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
                if (this.A00 != activityTransitionEvent.A00 || this.A01 != activityTransitionEvent.A01 || this.A02 != activityTransitionEvent.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(Integer.valueOf(this.A00), Integer.valueOf(this.A01), Long.valueOf(this.A02));
    }

    public final String toString() {
        return AnonymousClass001.A11(AbstractC58320PtC.A12("ActivityType ", AbstractC58318PtA.A0q(24), this.A00), " ", AbstractC58320PtC.A12("TransitionType ", AbstractC58318PtA.A0q(26), this.A01), " ", AbstractC58320PtC.A13("ElapsedRealTimeNanos ", AbstractC58318PtA.A0q(41), this.A02));
    }

    public ActivityTransitionEvent(int i, int i2, long j) {
        boolean z = i2 >= 0 && i2 <= 1;
        StringBuilder A0q = AbstractC58318PtA.A0q(41);
        A0q.append("Transition type ");
        A0q.append(i2);
        C3U5.A08(z, AbstractC166997dE.A0x(" is not valid.", A0q));
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A07(parcel, 2, this.A01);
        AbstractC128825rw.A08(parcel, 3, this.A02);
        AbstractC128825rw.A06(parcel, A04);
    }
}
