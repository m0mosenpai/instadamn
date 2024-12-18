package com.instagram.pendingmedia.model;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class SimpleUserStoryTarget implements UserStoryTarget {
    public static final C37324GcR CREATOR = C37324GcR.A00(6);
    public String A00 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    @Override // com.instagram.pendingmedia.model.UserStoryTarget
    public final String CBn() {
        return this.A00;
    }

    @Override // com.instagram.pendingmedia.model.UserStoryTarget
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC167017dG.A1Z(this, obj)) {
            return C14360o3.A0K(this.A00, ((SimpleUserStoryTarget) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }
}
