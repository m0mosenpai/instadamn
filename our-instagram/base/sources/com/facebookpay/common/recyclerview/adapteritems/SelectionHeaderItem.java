package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31181DnP;
import X.C14360o3;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class SelectionHeaderItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(20);
    public Integer A00;
    public String A01;
    public String A02;
    public final Integer A03;
    public final VG3 A04;

    public SelectionHeaderItem(VG3 vg3, Integer num, Integer num2, String str, String str2) {
        AbstractC167007dF.A1G(vg3, 1, num2);
        this.A04 = vg3;
        this.A01 = str;
        this.A00 = num;
        this.A02 = str2;
        this.A03 = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A04);
        parcel.writeString(this.A01);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
        parcel.writeString(this.A02);
        switch (this.A03.intValue()) {
            case 0:
                str = "CREDENTIAL_TYPE_HEADER";
                break;
            case 1:
                str = "SECTION_HEADER";
                break;
            case 2:
                str = "ACCORDION_HEADER";
                break;
            case 3:
                str = "ACCORDION_HEADER_NO_RIGHT_ADDON";
                break;
            case 4:
                str = "PICKUP_CONTACT_HEADER";
                break;
            default:
                str = "ORDER_SUMMARY_HEADER_WITH_PICKUP";
                break;
        }
        parcel.writeString(str);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A04;
    }
}
