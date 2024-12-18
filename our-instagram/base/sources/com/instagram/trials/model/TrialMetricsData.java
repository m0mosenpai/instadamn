package com.instagram.trials.model;

import X.C0T6;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class TrialMetricsData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(5);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TrialMetricsData) {
                TrialMetricsData trialMetricsData = (TrialMetricsData) obj;
                if (this.A02 != trialMetricsData.A02 || this.A01 != trialMetricsData.A01 || this.A00 != trialMetricsData.A00 || this.A03 != trialMetricsData.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A02 * 31) + this.A01) * 31) + this.A00) * 31) + this.A03;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
    }

    public TrialMetricsData(int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = i4;
    }
}
