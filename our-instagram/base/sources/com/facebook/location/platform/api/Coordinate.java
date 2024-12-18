package com.facebook.location.platform.api;

import X.AbstractC166987dD;
import X.AbstractC167027dH;
import X.C63472SlD;
import android.os.Parcelable;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class Coordinate extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(Coordinate.class);

    @SafeParcelable.Field(5)
    public final float confidence;

    @SafeParcelable.Field(1)
    public final long timeStamp;

    @SafeParcelable.Field(2)
    public final long utcTimeStamp;

    @SafeParcelable.Field(3)
    public final double x;

    @SafeParcelable.Field(4)
    public final double y;

    public Coordinate(double d, double d2) {
        this(-1L, d, d2);
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Coordinate{timeStamp=");
        A1C.append(this.timeStamp);
        A1C.append(", utcTimeStamp=");
        A1C.append(this.utcTimeStamp);
        A1C.append(", x=");
        A1C.append(this.x);
        A1C.append(", y=");
        A1C.append(this.y);
        A1C.append(", confidence=");
        A1C.append(this.confidence);
        return AbstractC167027dH.A0R(A1C);
    }

    public Coordinate(long j, double d, double d2) {
        this(j, -1L, d, d2, 1.0f);
    }

    public Coordinate(long j, long j2, double d, double d2, float f) {
        this.timeStamp = j;
        this.utcTimeStamp = j2;
        this.x = d;
        this.y = d2;
        this.confidence = f;
    }

    public Coordinate() {
        this.timeStamp = 0L;
        this.utcTimeStamp = 0L;
        this.x = 0.0d;
        this.y = 0.0d;
        this.confidence = 0.0f;
    }
}
