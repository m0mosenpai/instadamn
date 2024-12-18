package com.instagram.shopping.fragment.pdp.mediagrid;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25234BEr;
import X.AbstractC37302Gc3;
import X.C0T6;
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
public final class MediaGridArguments extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(64);
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
    public final HashMap A0E;
    public final Set A0F;

    public MediaGridArguments(RankingInfo rankingInfo, Product product, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, HashMap hashMap, Set set) {
        C14360o3.A0B(product, 1);
        AbstractC25234BEr.A1R(str, str2, str3, str4, str5);
        AbstractC25229BEm.A1L(str8, 11, str9);
        this.A01 = product;
        this.A09 = str;
        this.A0C = str2;
        this.A03 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A0E = hashMap;
        this.A06 = str6;
        this.A02 = str7;
        this.A00 = rankingInfo;
        this.A08 = str8;
        this.A05 = str9;
        this.A07 = str10;
        this.A0D = str11;
        this.A0F = set;
        this.A04 = str12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaGridArguments) {
                MediaGridArguments mediaGridArguments = (MediaGridArguments) obj;
                if (!C14360o3.A0K(this.A01, mediaGridArguments.A01) || !C14360o3.A0K(this.A09, mediaGridArguments.A09) || !C14360o3.A0K(this.A0C, mediaGridArguments.A0C) || !C14360o3.A0K(this.A03, mediaGridArguments.A03) || !C14360o3.A0K(this.A0A, mediaGridArguments.A0A) || !C14360o3.A0K(this.A0B, mediaGridArguments.A0B) || !C14360o3.A0K(this.A0E, mediaGridArguments.A0E) || !C14360o3.A0K(this.A06, mediaGridArguments.A06) || !C14360o3.A0K(this.A02, mediaGridArguments.A02) || !C14360o3.A0K(this.A00, mediaGridArguments.A00) || !C14360o3.A0K(this.A08, mediaGridArguments.A08) || !C14360o3.A0K(this.A05, mediaGridArguments.A05) || !C14360o3.A0K(this.A07, mediaGridArguments.A07) || !C14360o3.A0K(this.A0D, mediaGridArguments.A0D) || !C14360o3.A0K(this.A0F, mediaGridArguments.A0F) || !C14360o3.A0K(this.A04, mediaGridArguments.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A03);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        HashMap hashMap = this.A0E;
        parcel.writeInt(hashMap.size());
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (A14.hasNext()) {
            parcel.writeString((String) AbstractC167027dH.A0O(parcel, A14));
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A08);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0D);
        Iterator A0h = AbstractC37302Gc3.A0h(parcel, this.A0F);
        while (A0h.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0h);
        }
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A0F, (((AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A08, (((((AbstractC166997dE.A0J(this.A0E, AbstractC166997dE.A0K(this.A0B, AbstractC166997dE.A0K(this.A0A, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A0C, AbstractC166997dE.A0K(this.A09, AbstractC166987dD.A0G(this.A01))))))) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31)) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC25227BEk.A07(this.A04);
    }
}
