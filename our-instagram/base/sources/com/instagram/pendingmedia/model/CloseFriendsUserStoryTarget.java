package com.instagram.pendingmedia.model;

import X.AbstractC167017dG;
import X.AbstractC37301Gc2;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes7.dex */
public final class CloseFriendsUserStoryTarget implements UserStoryTarget {
    public static final C37324GcR CREATOR = C37324GcR.A00(3);
    public String A00 = "CLOSE_FRIENDS_WITH_BLACKLIST";
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
            CloseFriendsUserStoryTarget closeFriendsUserStoryTarget = (CloseFriendsUserStoryTarget) obj;
            if (ImmutableList.copyOf((Collection) this.A01) != ImmutableList.copyOf((Collection) closeFriendsUserStoryTarget.A01) || !C14360o3.A0K(this.A00, closeFriendsUserStoryTarget.A00)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeList(ImmutableList.copyOf((Collection) this.A01));
    }

    @Override // com.instagram.pendingmedia.model.UserStoryTarget
    public final String CBn() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A00, ImmutableList.copyOf((Collection) this.A01));
    }
}
