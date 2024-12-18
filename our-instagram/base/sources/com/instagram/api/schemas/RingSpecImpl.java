package com.instagram.api.schemas;

import X.AbstractC40219Hsi;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class RingSpecImpl extends C0T6 implements RingSpec, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(1);
    public final RingSpecPoint A00;
    public final RingSpecPoint A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public RingSpecImpl(RingSpecPoint ringSpecPoint, RingSpecPoint ringSpecPoint2, String str, List list, List list2) {
        C14360o3.A0B(list, 1);
        C14360o3.A0B(ringSpecPoint, 2);
        C14360o3.A0B(list2, 3);
        C14360o3.A0B(str, 4);
        C14360o3.A0B(ringSpecPoint2, 5);
        this.A03 = list;
        this.A00 = ringSpecPoint;
        this.A04 = list2;
        this.A02 = str;
        this.A01 = ringSpecPoint2;
    }

    @Override // com.instagram.api.schemas.RingSpec
    public final RingSpecImpl EzF() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RingSpecImpl) {
                RingSpecImpl ringSpecImpl = (RingSpecImpl) obj;
                if (!C14360o3.A0K(this.A03, ringSpecImpl.A03) || !C14360o3.A0K(this.A00, ringSpecImpl.A00) || !C14360o3.A0K(this.A04, ringSpecImpl.A04) || !C14360o3.A0K(this.A02, ringSpecImpl.A02) || !C14360o3.A0K(this.A01, ringSpecImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.A03.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A03);
        parcel.writeParcelable(this.A00, i);
        List list = this.A04;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeFloat(((Number) it.next()).floatValue());
        }
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.api.schemas.RingSpec
    public final List ApQ() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.RingSpec
    public final RingSpecPoint B1y() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.RingSpec
    public final List BOR() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.RingSpec
    public final RingSpecPoint Bzg() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.RingSpec
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTRingSpec", AbstractC40219Hsi.A00(this));
    }

    @Override // com.instagram.api.schemas.RingSpec
    public final String getName() {
        return this.A02;
    }
}
