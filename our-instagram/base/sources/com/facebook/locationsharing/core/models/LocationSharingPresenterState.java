package com.facebook.locationsharing.core.models;

import X.AbstractC25228BEl;
import X.AbstractC25235BEs;
import X.AbstractC37302Gc3;
import X.AbstractC50523MSb;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C1LC;
import X.C63473SlE;
import X.MSV;
import X.W3K;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public class LocationSharingPresenterState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63473SlE(38);
    public final int A00;
    public final long A01;
    public final Address A02;
    public final LiveLocationSession A03;
    public final Location A04;
    public final Location A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationSharingPresenterState) {
                LocationSharingPresenterState locationSharingPresenterState = (LocationSharingPresenterState) obj;
                if (!C14360o3.A0K(this.A06, locationSharingPresenterState.A06) || !C14360o3.A0K(this.A04, locationSharingPresenterState.A04) || this.A01 != locationSharingPresenterState.A01 || !C14360o3.A0K(this.A03, locationSharingPresenterState.A03) || !C14360o3.A0K(this.A02, locationSharingPresenterState.A02) || this.A0D != locationSharingPresenterState.A0D || !C14360o3.A0K(this.A05, locationSharingPresenterState.A05) || !C14360o3.A0K(this.A07, locationSharingPresenterState.A07) || !C14360o3.A0K(this.A08, locationSharingPresenterState.A08) || this.A00 != locationSharingPresenterState.A00 || !C14360o3.A0K(this.A0B, locationSharingPresenterState.A0B) || !C14360o3.A0K(this.A09, locationSharingPresenterState.A09) || !C14360o3.A0K(this.A0A, locationSharingPresenterState.A0A) || !C14360o3.A0K(this.A0C, locationSharingPresenterState.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((AbstractC63311ShH.A01(((((((((AbstractC25235BEs.A06(this.A06) + 31) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25228BEl.A03(this.A01)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A02), this.A0D) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC25235BEs.A06(this.A07)) * 31) + AbstractC25235BEs.A06(this.A08)) * 31) + this.A00) * 31) + AbstractC25235BEs.A06(this.A0B)) * 31) + AbstractC25235BEs.A06(this.A09)) * 31) + AbstractC25235BEs.A06(this.A0A)) * 31) + AbstractC25235BEs.A06(this.A0C);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationSharingPresenterState{addedSharerIds=");
        sb.append(this.A06);
        sb.append(", currentLocation=");
        sb.append(this.A04);
        sb.append(", currentTimeMillis=");
        sb.append(this.A01);
        sb.append(", liveLocationSession=");
        sb.append(this.A03);
        sb.append(", mapAddress=");
        sb.append(this.A02);
        sb.append(", mapDragging=");
        sb.append(this.A0D);
        sb.append(", mapLocation=");
        sb.append(this.A05);
        sb.append(", pointsOfInterest=");
        sb.append(this.A07);
        sb.append(", removedSharerIds=");
        sb.append(this.A08);
        sb.append(", selectedPointOfInterestIndex=");
        sb.append(this.A00);
        sb.append(", selectedSharerId=");
        sb.append(this.A0B);
        sb.append(", sharers=");
        sb.append(this.A09);
        sb.append(", updatedSharerIds=");
        sb.append(this.A0A);
        sb.append(MSV.A00(137));
        return AbstractC50523MSb.A0W(this.A0C, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C1LC A0d = AbstractC58322PtE.A0d(parcel, this.A06);
        while (A0d.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0d);
        }
        AbstractC58323PtF.A1A(parcel, this.A04, i);
        parcel.writeLong(this.A01);
        AbstractC58323PtF.A1A(parcel, this.A03, i);
        AbstractC58323PtF.A1A(parcel, this.A02, i);
        parcel.writeInt(this.A0D ? 1 : 0);
        AbstractC58323PtF.A1A(parcel, this.A05, i);
        C1LC A0d2 = AbstractC58322PtE.A0d(parcel, this.A07);
        while (A0d2.hasNext()) {
            parcel.writeParcelable((PointOfInterest) A0d2.next(), i);
        }
        C1LC A0d3 = AbstractC58322PtE.A0d(parcel, this.A08);
        while (A0d3.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0d3);
        }
        parcel.writeInt(this.A00);
        AbstractC58322PtE.A1E(parcel, this.A0B, 0, 1);
        C1LC A0d4 = AbstractC58322PtE.A0d(parcel, this.A09);
        while (A0d4.hasNext()) {
            parcel.writeParcelable((LiveLocationSharer) A0d4.next(), i);
        }
        C1LC A0d5 = AbstractC58322PtE.A0d(parcel, this.A0A);
        while (A0d5.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0d5);
        }
        parcel.writeString(this.A0C);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocationSharingPresenterState(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            strArr[i] = parcel.readString();
        }
        this.A06 = ImmutableList.copyOf(strArr);
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (Location) parcel.readParcelable(classLoader);
        }
        this.A01 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (LiveLocationSession) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (Address) parcel.readParcelable(classLoader);
        }
        this.A0D = AbstractC58320PtC.A1T(parcel);
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (Location) parcel.readParcelable(classLoader);
        }
        int readInt2 = parcel.readInt();
        PointOfInterest[] pointOfInterestArr = new PointOfInterest[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            pointOfInterestArr[i2] = parcel.readParcelable(classLoader);
        }
        this.A07 = ImmutableList.copyOf(pointOfInterestArr);
        int readInt3 = parcel.readInt();
        String[] strArr2 = new String[readInt3];
        for (int i3 = 0; i3 < readInt3; i3++) {
            strArr2[i3] = parcel.readString();
        }
        this.A08 = ImmutableList.copyOf(strArr2);
        this.A00 = parcel.readInt();
        this.A0B = parcel.readInt() != 0 ? parcel.readString() : null;
        int readInt4 = parcel.readInt();
        LiveLocationSharer[] liveLocationSharerArr = new LiveLocationSharer[readInt4];
        for (int i4 = 0; i4 < readInt4; i4++) {
            liveLocationSharerArr[i4] = parcel.readParcelable(classLoader);
        }
        this.A09 = ImmutableList.copyOf(liveLocationSharerArr);
        int readInt5 = parcel.readInt();
        String[] strArr3 = new String[readInt5];
        for (int i5 = 0; i5 < readInt5; i5++) {
            strArr3[i5] = parcel.readString();
        }
        this.A0A = ImmutableList.copyOf(strArr3);
        this.A0C = parcel.readString();
    }

    public LocationSharingPresenterState(W3K w3k) {
        ImmutableList immutableList = w3k.A06;
        AbstractC63311ShH.A04(immutableList, "addedSharerIds");
        this.A06 = immutableList;
        this.A04 = w3k.A04;
        this.A01 = w3k.A01;
        this.A03 = w3k.A03;
        this.A02 = w3k.A02;
        this.A0D = w3k.A0D;
        this.A05 = w3k.A05;
        ImmutableList immutableList2 = w3k.A07;
        AbstractC63311ShH.A04(immutableList2, "pointsOfInterest");
        this.A07 = immutableList2;
        ImmutableList immutableList3 = w3k.A08;
        AbstractC63311ShH.A04(immutableList3, "removedSharerIds");
        this.A08 = immutableList3;
        this.A00 = w3k.A00;
        this.A0B = w3k.A0B;
        ImmutableList immutableList4 = w3k.A09;
        AbstractC63311ShH.A04(immutableList4, "sharers");
        this.A09 = immutableList4;
        ImmutableList immutableList5 = w3k.A0A;
        AbstractC63311ShH.A04(immutableList5, "updatedSharerIds");
        this.A0A = immutableList5;
        String str = w3k.A0C;
        AbstractC63311ShH.A04(str, "userId");
        this.A0C = str;
    }
}
