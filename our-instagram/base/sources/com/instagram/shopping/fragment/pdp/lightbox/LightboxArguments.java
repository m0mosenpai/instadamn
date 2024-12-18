package com.instagram.shopping.fragment.pdp.lightbox;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25233BEq;
import X.AbstractC25234BEr;
import X.AbstractC37302Gc3;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.user.model.Product;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes7.dex */
public final class LightboxArguments implements Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(63);
    public final RankingInfo A00;
    public final Product A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final HashMap A0G;
    public final Set A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final Parcelable[] A0K;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        Parcelable[] parcelableArr = this.A0K;
        int length = parcelableArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 != length; i2++) {
            parcel.writeParcelable(parcelableArr[i2], i);
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A05);
        HashMap hashMap = this.A0G;
        parcel.writeInt(hashMap.size());
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (A14.hasNext()) {
            parcel.writeString((String) AbstractC167027dH.A0O(parcel, A14));
        }
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A00, i);
        Iterator A0h = AbstractC37302Gc3.A0h(parcel, this.A0H);
        while (A0h.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0h);
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A0I ? 1 : 0);
    }

    public LightboxArguments(RankingInfo rankingInfo, Product product, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, HashMap hashMap, Set set, Parcelable[] parcelableArr, boolean z, boolean z2) {
        AbstractC25234BEr.A1R(parcelableArr, product, str, str2, str3);
        AbstractC25233BEq.A0y(7, str4, str5, str6);
        C14360o3.A0B(str7, 10);
        this.A0J = z;
        this.A0K = parcelableArr;
        this.A01 = product;
        this.A09 = str;
        this.A0E = str2;
        this.A03 = str3;
        this.A06 = str4;
        this.A0B = str5;
        this.A0C = str6;
        this.A05 = str7;
        this.A0G = hashMap;
        this.A07 = str8;
        this.A08 = str9;
        this.A0F = str10;
        this.A02 = str11;
        this.A0A = str12;
        this.A00 = rankingInfo;
        this.A0H = set;
        this.A04 = str13;
        this.A0D = str14;
        this.A0I = z2;
    }
}
