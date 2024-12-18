package com.instagram.save.analytics;

import X.AnonymousClass309;
import X.C11520jB;
import X.C14360o3;
import X.C37324GcR;
import X.C38321qM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class SaveToCollectionsParentInsightsHost implements AnonymousClass309, Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(48);
    public final C11520jB A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public SaveToCollectionsParentInsightsHost(C11520jB c11520jB, String str, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = c11520jB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeSerializable(this.A00);
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        C11520jB c11520jB = this.A00;
        if (c11520jB == null) {
            return new C11520jB();
        }
        return c11520jB;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return this.A02;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return this.A03;
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        return E6P();
    }
}
