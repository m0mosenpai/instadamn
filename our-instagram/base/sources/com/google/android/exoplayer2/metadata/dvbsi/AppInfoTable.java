package com.google.android.exoplayer2.metadata.dvbsi;

import X.AnonymousClass001;
import X.C4B6;
import X.C4W7;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes10.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(53);
    public final int A00;
    public final String A01;

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void E4k(C4W7 c4w7) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] CHv() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ C4B6 CHw() {
        return null;
    }

    public final String toString() {
        return AnonymousClass001.A08(this.A00, "Ait(controlCode=", ",url=", this.A01, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }

    public AppInfoTable(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
