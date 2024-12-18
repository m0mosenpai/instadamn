package com.instagram.clips.model.metadata;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.EnumC31515Dsz;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class ClipsFanClubMetadata extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(6);
    public final EnumC31515Dsz A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsFanClubMetadata) {
                ClipsFanClubMetadata clipsFanClubMetadata = (ClipsFanClubMetadata) obj;
                if (!C14360o3.A0K(this.A01, clipsFanClubMetadata.A01) || this.A00 != clipsFanClubMetadata.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        AbstractC166997dE.A1I(parcel, this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public ClipsFanClubMetadata(EnumC31515Dsz enumC31515Dsz, String str) {
        AbstractC167017dG.A1P(str, enumC31515Dsz);
        this.A01 = str;
        this.A00 = enumC31515Dsz;
    }
}
