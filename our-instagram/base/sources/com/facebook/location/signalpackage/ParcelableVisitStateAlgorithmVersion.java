package com.facebook.location.signalpackage;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC58318PtA;
import X.AbstractC61570Rpt;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ParcelableVisitStateAlgorithmVersion extends AbstractC61570Rpt implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(30);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!obj.equals(null)) {
            if (this != obj) {
                if (obj instanceof AbstractC61570Rpt) {
                    AbstractC61570Rpt abstractC61570Rpt = (AbstractC61570Rpt) obj;
                    if (!this.A01.equals(abstractC61570Rpt.A01) || !this.A03.equals(abstractC61570Rpt.A03) || !this.A02.equals(abstractC61570Rpt.A02) || !this.A00.equals(abstractC61570Rpt.A00)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((217 + this.A00.intValue()) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        AbstractC58318PtA.A1H(parcel, this.A00);
    }
}
