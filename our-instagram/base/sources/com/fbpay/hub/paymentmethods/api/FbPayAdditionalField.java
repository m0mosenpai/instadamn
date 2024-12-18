package com.fbpay.hub.paymentmethods.api;

import X.AbstractC25235BEs;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C1LC;
import X.C63470SlB;
import X.EnumC61115RfV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public class FbPayAdditionalField implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(32);
    public final ImmutableList A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayAdditionalField) {
                FbPayAdditionalField fbPayAdditionalField = (FbPayAdditionalField) obj;
                if (!C14360o3.A0K(this.A01, fbPayAdditionalField.A01) || !C14360o3.A0K(this.A00, fbPayAdditionalField.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC63311ShH.A02(this.A01) * 31) + AbstractC25235BEs.A06(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        C1LC A0d = AbstractC58322PtE.A0d(parcel, this.A00);
        while (A0d.hasNext()) {
            parcel.writeInt(((EnumC61115RfV) A0d.next()).ordinal());
        }
    }

    public FbPayAdditionalField(Parcel parcel) {
        AbstractC58321PtD.A1O(this);
        this.A01 = parcel.readString();
        int readInt = parcel.readInt();
        EnumC61115RfV[] enumC61115RfVArr = new EnumC61115RfV[readInt];
        for (int i = 0; i < readInt; i++) {
            enumC61115RfVArr[i] = EnumC61115RfV.values()[parcel.readInt()];
        }
        this.A00 = ImmutableList.copyOf(enumC61115RfVArr);
    }
}
