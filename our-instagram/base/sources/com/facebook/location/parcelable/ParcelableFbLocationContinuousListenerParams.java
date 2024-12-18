package com.facebook.location.parcelable;

import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AbstractC62605SIj;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class ParcelableFbLocationContinuousListenerParams extends AbstractC62605SIj implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AbstractC62605SIj)) {
            AbstractC62605SIj abstractC62605SIj = (AbstractC62605SIj) obj;
            if (this.A01 == abstractC62605SIj.A01 && this.A03 == abstractC62605SIj.A03 && Float.compare(abstractC62605SIj.A00, this.A00) == 0 && this.A02 == abstractC62605SIj.A02 && this.A04 == abstractC62605SIj.A04) {
                Long l = this.A05;
                Long l2 = abstractC62605SIj.A05;
                if (l != null) {
                    return l.equals(l2);
                }
                return l2 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str;
        int i;
        int i2 = 0;
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "LOW_POWER";
                break;
            case 2:
                str = "BALANCED_POWER_AND_ACCURACY";
                break;
            case 3:
                str = "HIGH_ACCURACY";
                break;
            default:
                str = "NO_POWER";
                break;
        }
        int A07 = AbstractC167007dF.A07(this.A03, AbstractC167007dF.A07(this.A01, (str.hashCode() + intValue) * 31));
        float f = this.A00;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int A072 = AbstractC167007dF.A07(this.A02, (A07 + i) * 31);
        Long l = this.A05;
        if (l != null) {
            i2 = l.hashCode();
        }
        return A072 + i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58318PtA.A1H(parcel, this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeLong(this.A02);
        Long l = this.A05;
        if (l == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            AbstractC58318PtA.A1G(parcel, l);
        }
    }
}
