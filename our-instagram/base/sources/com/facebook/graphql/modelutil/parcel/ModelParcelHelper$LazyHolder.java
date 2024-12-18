package com.facebook.graphql.modelutil.parcel;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC37304Gc5;
import X.C18C;
import X.C63368SiU;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ModelParcelHelper$LazyHolder implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(95);
    public final Parcelable A00;
    public final int A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        C18C.A0F(AbstractC167007dF.A1P(i2, 2));
        parcel.writeParcelable(this.A00, 0);
    }

    public ModelParcelHelper$LazyHolder(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        C18C.A0F(AbstractC167007dF.A1P(readInt, 2));
        this.A00 = AbstractC37304Gc5.A04(parcel, C63368SiU.class);
    }

    public ModelParcelHelper$LazyHolder(Object obj) {
        if (obj instanceof Parcelable) {
            this.A00 = (Parcelable) obj;
            this.A01 = 2;
            return;
        }
        throw AbstractC166987dD.A12("Object param must implement a serialization format");
    }
}
