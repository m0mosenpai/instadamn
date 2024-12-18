package com.instagram.barcelona.permalink.ui.state;

import X.AbstractC25228BEl;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import X.MO9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class PermalinkTitle$CountdownTitle extends C0T6 implements Parcelable, MO9 {
    public static final Parcelable.Creator CREATOR = new C70220WId(17);
    public final int A00;
    public final long A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermalinkTitle$CountdownTitle) {
                PermalinkTitle$CountdownTitle permalinkTitle$CountdownTitle = (PermalinkTitle$CountdownTitle) obj;
                if (this.A00 != permalinkTitle$CountdownTitle.A00 || this.A01 != permalinkTitle$CountdownTitle.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }

    @Override // X.MO9
    public final int getIndex() {
        return this.A00;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AbstractC25228BEl.A03(this.A01);
    }

    public PermalinkTitle$CountdownTitle(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
