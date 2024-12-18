package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C16930sl;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes11.dex */
public final class IncentiveSummaryItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(1);
    public final int A00;
    public final List A01;
    public final VG3 A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A02);
        parcel.writeStringList(this.A01);
        parcel.writeInt(this.A00);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A02;
    }

    public IncentiveSummaryItem(VG3 vg3, List list, int i) {
        AbstractC167017dG.A1P(vg3, list);
        this.A02 = vg3;
        this.A01 = list;
        this.A00 = i;
    }

    public IncentiveSummaryItem() {
        this(VG3.A0J, C16930sl.A00, 0);
    }
}
