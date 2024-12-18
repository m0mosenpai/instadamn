package com.instagram.creation.capture.quickcapture.sundial.remix.model;

import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class ClipsRemixControllerSavedState extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(60);
    public final String A00;
    public final boolean A01;

    public ClipsRemixControllerSavedState(boolean z, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = z;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsRemixControllerSavedState) {
                ClipsRemixControllerSavedState clipsRemixControllerSavedState = (ClipsRemixControllerSavedState) obj;
                if (this.A01 != clipsRemixControllerSavedState.A01 || !C14360o3.A0K(this.A00, clipsRemixControllerSavedState.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return (i * 31) + this.A00.hashCode();
    }
}
