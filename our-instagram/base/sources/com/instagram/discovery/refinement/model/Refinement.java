package com.instagram.discovery.refinement.model;

import X.AbstractC167017dG;
import X.C2I7;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes7.dex */
public final class Refinement implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(65);
    public RefinementAttributes A00;
    public String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String A00() {
        RefinementAttributes refinementAttributes = this.A00;
        int ordinal = refinementAttributes.A01.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3 && !TextUtils.isEmpty(refinementAttributes.A02.A03)) {
                        return refinementAttributes.A02.A03;
                    }
                } else {
                    return "on_sale";
                }
            } else {
                return refinementAttributes.A03;
            }
        }
        return refinementAttributes.A04;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Refinement)) {
            return C2I7.A00(this.A00, ((Refinement) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
