package com.instagram.direct.prompts;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class DirectEditAddYoursParams extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(34);
    public final String A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectEditAddYoursParams) {
                DirectEditAddYoursParams directEditAddYoursParams = (DirectEditAddYoursParams) obj;
                if (!C14360o3.A0K(this.A00, directEditAddYoursParams.A00) || !C14360o3.A0K(this.A01, directEditAddYoursParams.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public DirectEditAddYoursParams(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
