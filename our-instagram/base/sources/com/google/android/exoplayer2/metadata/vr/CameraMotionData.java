package com.google.android.exoplayer2.metadata.vr;

import X.AbstractC25236BEt;
import X.C4B6;
import X.C4W7;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class CameraMotionData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(81);
    public int A00;
    public final long A01;
    public final float[] A02;

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void E4k(C4W7 c4w7) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] CHv() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ C4B6 CHw() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.A02, ((CameraMotionData) obj).A02);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int A01 = AbstractC25236BEt.A01(this.A01, 527) + Arrays.hashCode(this.A02);
            this.A00 = A01;
            return A01;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.A02);
    }

    public CameraMotionData(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A02 = parcel.createFloatArray();
    }
}
