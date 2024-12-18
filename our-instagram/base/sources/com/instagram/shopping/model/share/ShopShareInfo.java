package com.instagram.shopping.model.share;

import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ShopShareInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(87);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final boolean A08;

    public ShopShareInfo(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, List list, List list2, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A08 = z;
        this.A00 = imageUrl;
        this.A01 = str4;
        this.A05 = str5;
        this.A06 = list;
        this.A07 = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
        parcel.writeStringList(this.A06);
        List list = this.A07;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }
}
