package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25231BEo;
import X.C14360o3;
import X.C63406Sjd;
import X.C69333Vlf;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class PuxAccordionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(6);
    public final C69333Vlf A00;
    public final C63406Sjd A01;
    public final List A02;
    public final boolean A03;
    public final VG3 A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A04);
        parcel.writeValue(this.A01);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A02);
        while (A0u.hasNext()) {
            parcel.writeValue(A0u.next());
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeValue(this.A00);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A04;
    }

    public PuxAccordionItem(VG3 vg3, C69333Vlf c69333Vlf, C63406Sjd c63406Sjd, List list, boolean z) {
        AbstractC167027dH.A13(vg3, c63406Sjd, list);
        this.A04 = vg3;
        this.A01 = c63406Sjd;
        this.A02 = list;
        this.A03 = z;
        this.A00 = c69333Vlf;
    }
}
