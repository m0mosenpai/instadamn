package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class NonDiscInfo extends C0T6 implements Parcelable, NonDiscInfoIntf {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(12);
    public final boolean A00;
    public final boolean A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NonDiscInfo) {
                NonDiscInfo nonDiscInfo = (NonDiscInfo) obj;
                if (this.A00 != nonDiscInfo.A00 || this.A01 != nonDiscInfo.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC25225BEi.A08(this.A00));
    }

    public NonDiscInfo(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
