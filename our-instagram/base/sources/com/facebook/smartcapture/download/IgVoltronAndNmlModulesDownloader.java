package com.facebook.smartcapture.download;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC31175DnJ;
import X.AbstractC58319PtB;
import X.C14360o3;
import X.C63473SlE;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class IgVoltronAndNmlModulesDownloader implements Parcelable, CreditCardModulesDownloader {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(63);
    public final Bundle A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeBundle(this.A00);
    }

    public IgVoltronAndNmlModulesDownloader(Parcel parcel) {
        this.A00 = parcel.readBundle(AbstractC58319PtB.A0g(this));
    }

    public IgVoltronAndNmlModulesDownloader(AbstractC12990ll abstractC12990ll) {
        Bundle A0b = AbstractC166987dD.A0b();
        this.A00 = A0b;
        AbstractC31175DnJ.A0r(A0b, abstractC12990ll);
    }
}
