package com.instagram.mainfeed.intentawaread.api;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class ContextualOrganicInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(39);
    public String A01 = null;
    public String A00 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContextualOrganicInfo) {
                ContextualOrganicInfo contextualOrganicInfo = (ContextualOrganicInfo) obj;
                if (!C14360o3.A0K(this.A01, contextualOrganicInfo.A01) || !C14360o3.A0K(this.A00, contextualOrganicInfo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("ContextualOrganicInfo(seedMediaId=", this.A01, ", mediaAuthorIgid=", this.A00, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC25227BEk.A07(this.A00);
    }
}
