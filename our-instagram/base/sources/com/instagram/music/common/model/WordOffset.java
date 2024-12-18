package com.instagram.music.common.model;

import X.AbstractC166987dD;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class WordOffset extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(86);
    public int A02 = 0;
    public int A00 = 0;
    public int A03 = 0;
    public int A01 = 0;
    public boolean A04 = false;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WordOffset) {
                WordOffset wordOffset = (WordOffset) obj;
                if (this.A02 != wordOffset.A02 || this.A00 != wordOffset.A00 || this.A03 != wordOffset.A03 || this.A01 != wordOffset.A01 || this.A04 != wordOffset.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, ((((((this.A02 * 31) + this.A00) * 31) + this.A03) * 31) + this.A01) * 31);
    }
}
