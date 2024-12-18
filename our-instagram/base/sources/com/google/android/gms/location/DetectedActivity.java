package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC25228BEl;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(71);
    public int A00;
    public int A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof DetectedActivity)) {
            return false;
        }
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        if (this.A00 != detectedActivity.A00 || this.A01 != detectedActivity.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(AbstractC25228BEl.A1Z(Integer.valueOf(this.A00), this.A01));
    }

    public final String toString() {
        String str;
        int i = this.A00;
        if (i <= 22 && i >= 0) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 7) {
                                        if (i != 8) {
                                            if (i != 16) {
                                                if (i != 17) {
                                                    str = Integer.toString(i);
                                                } else {
                                                    str = "IN_RAIL_VEHICLE";
                                                }
                                            } else {
                                                str = "IN_ROAD_VEHICLE";
                                            }
                                        } else {
                                            str = "RUNNING";
                                        }
                                    } else {
                                        str = "WALKING";
                                    }
                                } else {
                                    str = "TILTING";
                                }
                            }
                        } else {
                            str = "STILL";
                        }
                    } else {
                        str = "ON_FOOT";
                    }
                } else {
                    str = "ON_BICYCLE";
                }
            } else {
                str = "IN_VEHICLE";
            }
            int i2 = this.A01;
            StringBuilder A0q = AbstractC58318PtA.A0q(AbstractC58319PtB.A05(str) + 48);
            A0q.append("DetectedActivity [type=");
            A0q.append(str);
            A0q.append(", confidence=");
            A0q.append(i2);
            return AbstractC58319PtB.A0w(A0q);
        }
        str = "UNKNOWN";
        int i22 = this.A01;
        StringBuilder A0q2 = AbstractC58318PtA.A0q(AbstractC58319PtB.A05(str) + 48);
        A0q2.append("DetectedActivity [type=");
        A0q2.append(str);
        A0q2.append(", confidence=");
        A0q2.append(i22);
        return AbstractC58319PtB.A0w(A0q2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A07(parcel, 2, this.A01);
        AbstractC128825rw.A06(parcel, A04);
    }
}
