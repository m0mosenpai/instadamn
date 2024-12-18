package com.instagram.shopping.intf.featuredproducts;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class FeaturedProductMediaFeedGridConfiguration implements Parcelable {
    public static final C37324GcR CREATOR = C37324GcR.A00(69);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final boolean A09;

    public FeaturedProductMediaFeedGridConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, boolean z) {
        AbstractC167027dH.A0a(1, str, str2, str3, list);
        this.A06 = str;
        this.A00 = str2;
        this.A04 = str3;
        this.A08 = list;
        this.A07 = list2;
        this.A05 = str4;
        this.A09 = z;
        this.A03 = str5;
        this.A02 = str6;
        this.A01 = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
        List list = this.A08;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((FeaturedProductPermissionStatus) it.next()).A00);
        }
        parcel.writeStringList(A0q);
        parcel.writeStringList(this.A07);
        parcel.writeString(this.A05);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
