package com.instagram.model.shopping.productfeed;

import X.AbstractC166987dD;
import X.C40781ul;
import X.C41856IgA;
import X.InterfaceC74303Vl;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes7.dex */
public final class ProductFeedResponse extends C40781ul implements Parcelable, InterfaceC74303Vl {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(47);
    public int A00;
    public String A01;
    public String A02;
    public List A03 = AbstractC166987dD.A1E();
    public boolean A04;

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return true;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A03);
        parcel.writeString(this.A02);
    }
}
