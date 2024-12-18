package com.facebook.common.gcmcompat;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.location.platform.api.Location;

/* loaded from: classes10.dex */
public abstract class Task implements Parcelable {
    public final String A00;
    public final String A01;
    public final int A02;
    public final Bundle A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeBundle(this.A03);
    }

    public Task(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A06 = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A04 = AbstractC58320PtC.A1U(parcel);
        this.A02 = parcel.readInt();
        this.A05 = AbstractC58320PtC.A1V(parcel);
        this.A03 = parcel.readBundle(AbstractC58319PtB.A0g(this));
    }

    public void A00(Bundle bundle) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putInt("retry_policy", 0);
        A0b.putInt("initial_backoff_seconds", 30);
        A0b.putInt("maximum_backoff_seconds", ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS);
        bundle.putString("tag", this.A01);
        bundle.putBoolean("update_current", this.A06);
        bundle.putBoolean("persisted", this.A04);
        bundle.putString("service", this.A00);
        bundle.putInt("requiredNetwork", this.A02);
        bundle.putBoolean("requiresCharging", this.A05);
        bundle.putBoolean("requiresIdle", false);
        bundle.putBundle("retryStrategy", A0b);
        bundle.putBundle(Location.EXTRAS, this.A03);
    }
}
