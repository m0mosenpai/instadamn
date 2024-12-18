package com.facebook.smartcapture.ui.consent;

import X.C14360o3;
import X.C63473SlE;
import X.L5Q;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class ResolvedConsentTextsProvider implements ConsentTextsProvider {
    public static final Parcelable.Creator CREATOR = new C63473SlE(67);
    public final L5Q A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        L5Q l5q = this.A00;
        parcel.writeString(l5q.A07);
        parcel.writeString(l5q.A06);
        parcel.writeString(l5q.A09);
        parcel.writeString(l5q.A08);
        parcel.writeString(l5q.A04);
        parcel.writeString(l5q.A00);
        parcel.writeString(l5q.A01);
        parcel.writeString(l5q.A02);
        parcel.writeString(l5q.A05);
        parcel.writeString(l5q.A03);
        parcel.writeString(l5q.A0G);
        parcel.writeString(l5q.A0A);
        parcel.writeString(l5q.A0D);
        parcel.writeString(l5q.A0B);
        parcel.writeString(l5q.A0C);
        parcel.writeString(l5q.A0F);
        parcel.writeString(l5q.A0E);
    }

    public ResolvedConsentTextsProvider(L5Q l5q) {
        this.A00 = l5q;
    }
}
