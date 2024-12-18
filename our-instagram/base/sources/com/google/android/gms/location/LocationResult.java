package com.google.android.gms.location;

import X.AbstractC25228BEl;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63471SlC;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final List A01 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(59);
    public final List A00;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            List list = ((LocationResult) obj).A00;
            int size = list.size();
            List list2 = this.A00;
            if (size == list2.size()) {
                Iterator it = list.iterator();
                Iterator it2 = list2.iterator();
                while (it.hasNext()) {
                    if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.A00.iterator();
        int i = 17;
        while (it.hasNext()) {
            i = (i * 31) + AbstractC25228BEl.A03(((Location) it.next()).getTime());
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A00);
        StringBuilder A0q = AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 27);
        A0q.append("LocationResult[locations: ");
        A0q.append(valueOf);
        return AbstractC58319PtB.A0w(A0q);
    }

    public LocationResult(List list) {
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1G(parcel, this.A00, 1, AbstractC58319PtB.A04(parcel));
    }
}
