package com.instagram.barcelona.creation.voiceclips.model;

import X.AbstractC166987dD;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class TranscriptionToken extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(14);
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public TranscriptionToken(String str, int i, int i2, boolean z) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TranscriptionToken) {
                TranscriptionToken transcriptionToken = (TranscriptionToken) obj;
                if (!C14360o3.A0K(this.A02, transcriptionToken.A02) || this.A01 != transcriptionToken.A01 || this.A00 != transcriptionToken.A00 || this.A03 != transcriptionToken.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, (((AbstractC166987dD.A0J(this.A02) + this.A01) * 31) + this.A00) * 31);
    }
}
