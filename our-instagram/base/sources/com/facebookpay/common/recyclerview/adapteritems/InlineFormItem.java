package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.C14360o3;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.fragment.model.FormParams;

/* loaded from: classes11.dex */
public final class InlineFormItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(3);
    public final FormParams A00;
    public final String A01;
    public final VG3 A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A02;
    }

    public InlineFormItem(VG3 vg3, FormParams formParams, String str) {
        AbstractC167027dH.A13(vg3, formParams, str);
        this.A02 = vg3;
        this.A00 = formParams;
        this.A01 = str;
    }
}
