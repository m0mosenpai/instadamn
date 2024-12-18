package com.facebookpay.form.cell.label;

import X.AbstractC65702TsY;
import X.C67663Uuv;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.R;
import com.facebookpay.form.cell.CellParams;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes11.dex */
public class LabelCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new C70221WIe(76);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final ImmutableList A07;
    public final String A08;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public LabelCellParams(Parcel parcel) {
        super(parcel);
        this.A08 = parcel.readString();
        this.A03 = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        AbstractC65702TsY.A0z(parcel, LinkParams.class, arrayList);
        this.A07 = ImmutableList.copyOf((Collection) arrayList);
        this.A04 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A03);
        parcel.writeList(this.A07);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A01);
    }

    public LabelCellParams(C67663Uuv c67663Uuv) {
        super(c67663Uuv);
        this.A08 = null;
        this.A03 = c67663Uuv.A03;
        this.A07 = c67663Uuv.A06;
        this.A04 = c67663Uuv.A07 ? R.layout.hub_cell_header : R.layout.hub_cell_label;
        this.A05 = c67663Uuv.A04;
        this.A00 = c67663Uuv.A00;
        this.A02 = c67663Uuv.A02;
        this.A06 = c67663Uuv.A05;
        this.A01 = c67663Uuv.A01;
    }
}
