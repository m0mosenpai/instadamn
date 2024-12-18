package com.facebook.common.gcmcompat;

import X.C63475SlG;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class PeriodicTask extends Task {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(72);
    public long A00;
    public long A01;

    @Override // com.facebook.common.gcmcompat.Task
    public final void A00(Bundle bundle) {
        super.A00(bundle);
        bundle.putLong("period", this.A01);
        bundle.putLong("period_flex", this.A00);
    }

    @Override // com.facebook.common.gcmcompat.Task, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
