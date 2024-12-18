package com.facebook.locationsharing.core.models;

import X.AbstractC25228BEl;
import X.AbstractC31181DnP;
import X.AbstractC37302Gc3;
import X.AbstractC63311ShH;
import X.C05F;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes11.dex */
public class Location implements Parcelable {
    public static volatile Integer A07;
    public static final Parcelable.Creator CREATOR = new C63473SlE(37);
    public final double A00;
    public final double A01;
    public final long A02;
    public final int A03;
    public final int A04;
    public final Integer A05;
    public final Set A06;

    public Location(Set set, double d, double d2, int i, int i2, long j) {
        this.A03 = i;
        this.A04 = i2;
        this.A00 = d;
        this.A01 = d2;
        this.A05 = null;
        this.A02 = j;
        this.A06 = Collections.unmodifiableSet(set);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Location) {
                Location location = (Location) obj;
                if (this.A03 != location.A03 || this.A04 != location.A04 || this.A00 != location.A00 || this.A01 != location.A01 || A00() != location.A00() || this.A02 != location.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00() {
        if (this.A06.contains(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS)) {
            return this.A05;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = C05F.A00;
                }
            }
        }
        return A07;
    }

    public final int hashCode() {
        int intValue;
        int A00 = AbstractC63311ShH.A00(this.A01, AbstractC63311ShH.A00(this.A00, ((this.A03 + 31) * 31) + this.A04));
        if (A00() == null) {
            intValue = -1;
        } else {
            intValue = A00().intValue();
        }
        return (((A00 * 31) + intValue) * 31) + AbstractC25228BEl.A03(this.A02);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A05));
        parcel.writeLong(this.A02);
        Iterator A0h = AbstractC37302Gc3.A0h(parcel, this.A06);
        while (A0h.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0h);
        }
    }

    public Location(Parcel parcel) {
        Integer num;
        getClass().getClassLoader();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        if (parcel.readInt() == 0) {
            num = null;
        } else {
            num = C05F.A00(4)[parcel.readInt()];
        }
        this.A05 = num;
        this.A02 = parcel.readLong();
        HashSet hashSet = new HashSet();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            hashSet.add(parcel.readString());
        }
        this.A06 = Collections.unmodifiableSet(hashSet);
    }
}
