package com.instagram.pendingmedia.model;

import X.AbstractC167017dG;
import X.AbstractC37301Gc2;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* loaded from: classes7.dex */
public final class GroupProfileUserStoryTarget implements UserStoryTarget {
    public static final C37324GcR CREATOR = C37324GcR.A00(4);
    public String A01 = "GROUP_PROFILE";
    public PendingRecipient A00 = null;

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
            GroupProfileUserStoryTarget groupProfileUserStoryTarget = (GroupProfileUserStoryTarget) obj;
            if (!C14360o3.A0K(this.A01, groupProfileUserStoryTarget.A01) || !C14360o3.A0K(this.A00, groupProfileUserStoryTarget.A00)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        PendingRecipient pendingRecipient = this.A00;
        if (pendingRecipient != null) {
            pendingRecipient.writeToParcel(parcel, i);
        }
    }

    @Override // com.instagram.pendingmedia.model.UserStoryTarget
    public final String CBn() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A01, this.A00);
    }
}
