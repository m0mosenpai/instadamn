package com.instagram.clips.model;

import X.AbstractC166987dD;
import X.AbstractC25228BEl;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class ClipsSpotlightModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(2);
    public final long A00;
    public final User A01;

    public ClipsSpotlightModel(User user, long j) {
        C14360o3.A0B(user, 1);
        this.A01 = user;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsSpotlightModel) {
                ClipsSpotlightModel clipsSpotlightModel = (ClipsSpotlightModel) obj;
                if (!C14360o3.A0K(this.A01, clipsSpotlightModel.A01) || this.A00 != clipsSpotlightModel.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeLong(this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + AbstractC25228BEl.A03(this.A00);
    }
}
