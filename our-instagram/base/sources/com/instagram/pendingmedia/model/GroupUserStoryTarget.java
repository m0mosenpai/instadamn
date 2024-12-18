package com.instagram.pendingmedia.model;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class GroupUserStoryTarget implements UserStoryTarget {
    public static final C37324GcR CREATOR = C37324GcR.A00(5);
    public DirectThreadKey A00;
    public String A02 = "GROUP";
    public List A03 = null;
    public String A01 = null;

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
            GroupUserStoryTarget groupUserStoryTarget = (GroupUserStoryTarget) obj;
            if (!C14360o3.A0K(this.A02, groupUserStoryTarget.A02) || !C14360o3.A0K(Collections.unmodifiableList(this.A03), Collections.unmodifiableList(groupUserStoryTarget.A03)) || !C14360o3.A0K(this.A01, groupUserStoryTarget.A01) || !C14360o3.A0K(this.A00, groupUserStoryTarget.A00)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeTypedList(Collections.unmodifiableList(this.A03));
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.pendingmedia.model.UserStoryTarget
    public final String CBn() {
        return this.A02;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, Collections.unmodifiableList(this.A03), this.A01, this.A00});
    }
}
