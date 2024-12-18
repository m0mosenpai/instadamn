package com.instagram.direct.messagethread.reactions.datamodel;

import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class DirectCountBasedReaction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(76);
    public int A00;
    public String A01;
    public boolean A02;

    public DirectCountBasedReaction(String str, int i, boolean z) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectCountBasedReaction)) {
            return false;
        }
        DirectCountBasedReaction directCountBasedReaction = (DirectCountBasedReaction) obj;
        return C14360o3.A0K(this.A01, directCountBasedReaction.A01) && this.A00 == directCountBasedReaction.A00 && this.A02 == directCountBasedReaction.A02;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00), Boolean.valueOf(this.A02)});
    }
}
