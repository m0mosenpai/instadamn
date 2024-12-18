package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC37304Gc5;
import X.C14360o3;
import X.C70221WIe;
import X.R0Z;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class PuxTermsConditionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(16);
    public final R0Z A00;
    public final R0Z A01;
    public final R0Z A02;
    public final R0Z A03;
    public final VG3 A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final boolean A09;

    public PuxTermsConditionItem(R0Z r0z, R0Z r0z2, R0Z r0z3, R0Z r0z4, VG3 vg3, String str, String str2, List list, List list2, boolean z) {
        C14360o3.A0B(vg3, 1);
        this.A04 = vg3;
        this.A05 = str;
        this.A01 = r0z;
        this.A06 = str2;
        this.A07 = list;
        this.A02 = r0z2;
        this.A03 = r0z3;
        this.A08 = list2;
        this.A00 = r0z4;
        this.A09 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A04);
        parcel.writeString(this.A05);
        parcel.writeValue(this.A01);
        parcel.writeString(this.A06);
        parcel.writeStringList(this.A07);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A03);
        List list = this.A08;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                parcel.writeValue(A0l.next());
            }
        }
        parcel.writeValue(this.A00);
        parcel.writeInt(this.A09 ? 1 : 0);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A04;
    }

    public PuxTermsConditionItem() {
        this(null, null, null, null, VG3.A0m, null, null, null, null, false);
    }
}
