package com.facebook.locationsharing.core.models;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC25235BEs;
import X.AbstractC50523MSb;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class LiveLocationSession implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(35);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public LiveLocationSession(String str, String str2, String str3, String str4, long j, long j2, boolean z) {
        this.A00 = j;
        AbstractC63311ShH.A04(str, "groupishId");
        this.A02 = str;
        this.A03 = str2;
        this.A06 = z;
        AbstractC63311ShH.A04(str3, "sessionId");
        this.A04 = str3;
        this.A01 = j2;
        AbstractC63311ShH.A04(str4, "userAliasId");
        this.A05 = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LiveLocationSession) {
                LiveLocationSession liveLocationSession = (LiveLocationSession) obj;
                if (this.A00 != liveLocationSession.A00 || !C14360o3.A0K(this.A02, liveLocationSession.A02) || !C14360o3.A0K(this.A03, liveLocationSession.A03) || this.A06 != liveLocationSession.A06 || !C14360o3.A0K(this.A04, liveLocationSession.A04) || this.A01 != liveLocationSession.A01 || !C14360o3.A0K(this.A05, liveLocationSession.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (AbstractC58321PtD.A08(this.A01, (((((((((((int) (j ^ (j >>> 32))) + 31) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC58322PtE.A02(this.A06 ? 1 : 0)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) * 31) + AbstractC25235BEs.A06(this.A05);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
        String str = this.A03;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A05);
    }

    public LiveLocationSession(Parcel parcel) {
        String readString;
        AbstractC58321PtD.A1O(this);
        this.A00 = parcel.readLong();
        this.A02 = parcel.readString();
        if (parcel.readInt() == 0) {
            readString = null;
        } else {
            readString = parcel.readString();
        }
        this.A03 = readString;
        this.A06 = AbstractC58320PtC.A1T(parcel);
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A05 = parcel.readString();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LiveLocationSession{expirationTimeMillis=");
        A1C.append(this.A00);
        A1C.append(", groupishId=");
        A1C.append(this.A02);
        A1C.append(AbstractC111324zv.A00(1436));
        A1C.append(this.A03);
        A1C.append(", optimisticSessionId=");
        A1C.append(this.A06);
        A1C.append(", sessionId=");
        A1C.append(this.A04);
        A1C.append(", startTimeMillis=");
        A1C.append(this.A01);
        A1C.append(", userAliasId=");
        return AbstractC50523MSb.A0W(this.A05, A1C);
    }
}
