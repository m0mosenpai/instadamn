package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC25229BEm;
import X.AbstractC69840VwQ;
import X.AbstractC69841VwR;
import X.C14360o3;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class PuxPriceTableItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(13);
    public final Integer A00;
    public final Integer A01;
    public final ArrayList A02;
    public final VG3 A03;

    public PuxPriceTableItem(VG3 vg3, Integer num, Integer num2, ArrayList arrayList) {
        C14360o3.A0B(vg3, 1);
        this.A03 = vg3;
        this.A01 = num;
        this.A00 = num2;
        this.A02 = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A03);
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(AbstractC69841VwR.A01(num));
        }
        Integer num2 = this.A00;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(AbstractC69840VwQ.A01(num2));
        }
        ArrayList arrayList = this.A02;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC25229BEm.A15(parcel, it, i);
        }
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A03;
    }
}
