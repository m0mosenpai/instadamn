package com.google.android.exoplayer2.metadata.scte35;

import X.C63470SlB;
import X.C97974ac;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(79);
    public final long A00;
    public final long A01;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public static long A00(C97974ac c97974ac, long j) {
        long A02 = c97974ac.A02();
        if ((128 & A02) != 0) {
            return 8589934591L & ((((A02 & 1) << 32) | c97974ac.A07()) + j);
        }
        return -9223372036854775807L;
    }
}
