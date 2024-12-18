package com.instagram.discovery.chaining.intf;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC37302Gc3;
import X.C14360o3;
import X.LNL;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes7.dex */
public final class DiscoveryChainingConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(53);
    public final Bundle A00;
    public final DiscoveryChainingItem A01;
    public final ExploreTopicCluster A02;
    public final Integer A03;
    public final Integer A04;
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
    public final HashMap A0F;
    public final Set A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public DiscoveryChainingConfig(Bundle bundle, DiscoveryChainingItem discoveryChainingItem, ExploreTopicCluster exploreTopicCluster, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, HashMap hashMap, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        AbstractC167027dH.A0a(1, discoveryChainingItem, str, str2, str3);
        C14360o3.A0B(str4, 5);
        this.A01 = discoveryChainingItem;
        this.A05 = str;
        this.A07 = str2;
        this.A0C = str3;
        this.A09 = str4;
        this.A0J = z;
        this.A0I = z2;
        this.A0R = z3;
        this.A0P = z4;
        this.A0O = z5;
        this.A0K = z6;
        this.A02 = exploreTopicCluster;
        this.A00 = bundle;
        this.A0A = str5;
        this.A0E = str6;
        this.A04 = num;
        this.A0D = str7;
        this.A0F = hashMap;
        this.A06 = str8;
        this.A0G = set;
        this.A0B = str9;
        this.A0Q = z7;
        this.A0M = z8;
        this.A08 = str10;
        this.A03 = num2;
        this.A0L = z9;
        this.A0H = z10;
        this.A0N = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeBundle(this.A00);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0E);
        AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
        parcel.writeString(this.A0D);
        HashMap hashMap = this.A0F;
        if (hashMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                parcel.writeString((String) AbstractC167027dH.A0O(parcel, A14));
            }
        }
        parcel.writeString(this.A06);
        Iterator A0h = AbstractC37302Gc3.A0h(parcel, this.A0G);
        while (A0h.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0h);
        }
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeString(this.A08);
        AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
    }
}
