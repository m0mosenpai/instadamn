package com.instagram.barcelona.permalink.ui.state;

import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import X.MO9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class PermalinkTitle$Ephemeral24HrTitle extends C0T6 implements Parcelable, MO9 {
    public static final Parcelable.Creator CREATOR = new C70220WId(18);
    public final int A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof PermalinkTitle$Ephemeral24HrTitle) && this.A00 == ((PermalinkTitle$Ephemeral24HrTitle) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    @Override // X.MO9
    public final int getIndex() {
        return this.A00;
    }

    public PermalinkTitle$Ephemeral24HrTitle(int i) {
        this.A00 = i;
    }
}
