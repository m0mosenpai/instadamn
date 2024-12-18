package com.instagram.nux.cal.model;

import X.AbstractC25231BEo;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class SignupContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(96);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(AbstractC25231BEo.A0I(this.A07));
        List list = this.A07;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((ContentText) it.next(), 0);
            }
        }
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
    }
}
