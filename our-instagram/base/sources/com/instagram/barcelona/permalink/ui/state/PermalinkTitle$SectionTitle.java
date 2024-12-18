package com.instagram.barcelona.permalink.ui.state;

import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import X.MO9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class PermalinkTitle$SectionTitle extends C0T6 implements Parcelable, MO9 {
    public static final Parcelable.Creator CREATOR = new C70220WId(19);
    public final int A00;
    public final String A01;

    public PermalinkTitle$SectionTitle(int i, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermalinkTitle$SectionTitle) {
                PermalinkTitle$SectionTitle permalinkTitle$SectionTitle = (PermalinkTitle$SectionTitle) obj;
                if (this.A00 != permalinkTitle$SectionTitle.A00 || !C14360o3.A0K(this.A01, permalinkTitle$SectionTitle.A01)) {
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
        parcel.writeString(this.A01);
    }

    @Override // X.MO9
    public final int getIndex() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, this.A00 * 31);
    }
}
