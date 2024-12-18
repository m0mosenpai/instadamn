package com.instagram.pendingmedia.model;

import X.AbstractC167017dG;
import X.AbstractC37301Gc2;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes7.dex */
public final class AllUserStoryTarget implements UserStoryTarget {
    public static final C37324GcR CREATOR = C37324GcR.A00(1);
    public String A00 = "ALL_WITH_BLACKLIST";
    public List A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.instagram.pendingmedia.model.UserStoryTarget
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            AllUserStoryTarget allUserStoryTarget = (AllUserStoryTarget) obj;
            if (this.A01 != allUserStoryTarget.A01 || !C14360o3.A0K(this.A00, allUserStoryTarget.A00)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeList(this.A01);
    }

    @Override // com.instagram.pendingmedia.model.UserStoryTarget
    public final String CBn() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A00, this.A01);
    }
}
