package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC37300Gc1;
import X.AbstractC40201HsQ;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class Range extends C0T6 implements Parcelable, RangeIntf {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(85);
    public final Entity A00;
    public final Integer A01;
    public final Integer A02;

    @Override // com.instagram.api.schemas.RangeIntf
    public final Range Eyy() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Range) {
                Range range = (Range) obj;
                if (!C14360o3.A0K(this.A00, range.A00) || !C14360o3.A0K(this.A01, range.A01) || !C14360o3.A0K(this.A02, range.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
    }

    @Override // com.instagram.api.schemas.RangeIntf
    public final Entity B2H() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.RangeIntf
    public final Integer BN2() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.RangeIntf
    public final Integer BYa() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.RangeIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTRange", AbstractC40201HsQ.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public Range(Entity entity, Integer num, Integer num2) {
        this.A00 = entity;
        this.A01 = num;
        this.A02 = num2;
    }
}
