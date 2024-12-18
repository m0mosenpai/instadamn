package com.facebookpay.form.cell.selector;

import X.AbstractC58322PtE;
import X.C14360o3;
import X.C1LC;
import X.C67661Uut;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.model.FormCountry;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public final class CountrySelectorCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new C70221WIe(81);
    public final int A00;
    public final Country A01;
    public final ImmutableList A02;
    public final String A03;
    public final boolean A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
        C1LC A0d = AbstractC58322PtE.A0d(parcel, this.A02);
        C14360o3.A07(A0d);
        while (A0d.hasNext()) {
            parcel.writeParcelable((FormCountry) A0d.next(), i);
        }
        parcel.writeInt(0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public CountrySelectorCellParams(C67661Uut c67661Uut) {
        super(c67661Uut);
        this.A03 = c67661Uut.A01;
        this.A00 = c67661Uut.A00;
        this.A01 = c67661Uut.A03;
        this.A02 = c67661Uut.A04;
        this.A04 = c67661Uut.A02;
    }
}
