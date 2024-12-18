package com.instagram.model.rtc;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.C7T3;
import X.EnumC46283KeF;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class RtcCallSource extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(1);
    public final EnumC46283KeF A00;
    public final C7T3 A01;
    public final RtcThreadKey A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcCallSource) {
                RtcCallSource rtcCallSource = (RtcCallSource) obj;
                if (this.A01 != rtcCallSource.A01 || !C14360o3.A0K(this.A02, rtcCallSource.A02) || this.A00 != rtcCallSource.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A01);
        this.A02.writeToParcel(parcel, i);
        EnumC46283KeF enumC46283KeF = this.A00;
        if (enumC46283KeF == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, enumC46283KeF);
        }
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0M(this.A00);
    }

    public RtcCallSource(EnumC46283KeF enumC46283KeF, C7T3 c7t3, RtcThreadKey rtcThreadKey) {
        AbstractC167017dG.A1P(c7t3, rtcThreadKey);
        this.A01 = c7t3;
        this.A02 = rtcThreadKey;
        this.A00 = enumC46283KeF;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallSource(source=");
        A1C.append(this.A01);
        A1C.append(", threadKey=");
        A1C.append(this.A02);
        A1C.append(", xmaType=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
