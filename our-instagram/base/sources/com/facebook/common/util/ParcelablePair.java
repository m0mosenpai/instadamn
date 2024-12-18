package com.facebook.common.util;

import X.AbstractC31173DnH;
import X.AnonymousClass001;
import X.C63475SlG;
import X.RQ2;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class ParcelablePair extends Pair implements Iterable, Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(82);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Object[] A00() {
        if (this instanceof Triplet) {
            Triplet triplet = (Triplet) this;
            if (triplet instanceof Quartet) {
                Quartet quartet = (Quartet) triplet;
                return new Object[]{((Pair) quartet).first, ((Pair) quartet).second, ((Triplet) quartet).A00, quartet.A00};
            }
            return new Object[]{((Pair) triplet).first, ((Pair) triplet).second, triplet.A00};
        }
        return new Object[]{((Pair) this).first, ((Pair) this).second};
    }

    @Override // android.util.Pair
    public final boolean equals(Object obj) {
        if (!(obj instanceof ParcelablePair)) {
            return false;
        }
        return Arrays.equals(A00(), ((ParcelablePair) obj).A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(((Pair) this).first);
        parcel.writeValue(((Pair) this).second);
    }

    @Override // android.util.Pair
    public final int hashCode() {
        return Arrays.hashCode(A00());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new RQ2(A00());
    }

    @Override // android.util.Pair
    public final String toString() {
        return AnonymousClass001.A0R(AbstractC31173DnH.A0q(this), Arrays.toString(A00()));
    }
}
