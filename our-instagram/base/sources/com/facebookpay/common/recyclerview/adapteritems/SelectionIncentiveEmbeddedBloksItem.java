package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
import X.C14360o3;
import X.C70221WIe;
import X.InterfaceC16660sJ;
import X.VG3;
import X.XGq;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class SelectionIncentiveEmbeddedBloksItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(21);
    public final XGq A00;
    public final List A01;
    public final List A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;
    public final boolean A05;
    public final VG3 A06;

    public SelectionIncentiveEmbeddedBloksItem(XGq xGq, VG3 vg3, List list, List list2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z) {
        AbstractC25233BEq.A0x(1, vg3, list2, interfaceC16660sJ);
        C14360o3.A0B(interfaceC16660sJ2, 6);
        this.A06 = vg3;
        this.A00 = xGq;
        this.A02 = list;
        this.A01 = list2;
        this.A03 = interfaceC16660sJ;
        this.A04 = interfaceC16660sJ2;
        this.A05 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A06);
        parcel.writeValue(this.A00);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A02);
        while (A0u.hasNext()) {
            Iterator A0s = AbstractC167017dG.A0s(parcel, (Map) A0u.next());
            while (A0s.hasNext()) {
                parcel.writeValue(AbstractC167027dH.A0O(parcel, A0s));
            }
        }
        parcel.writeStringList(this.A01);
        parcel.writeSerializable((Serializable) this.A03);
        parcel.writeSerializable((Serializable) this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A06;
    }
}
