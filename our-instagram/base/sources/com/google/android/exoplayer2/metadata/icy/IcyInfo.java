package com.google.android.exoplayer2.metadata.icy;

import X.C4B6;
import X.C4W7;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(58);
    public final String A00;
    public final String A01;
    public final byte[] A02;

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

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void E4k(C4W7 c4w7) {
        String str = this.A00;
        if (str != null) {
            c4w7.A0F = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.A02, ((IcyInfo) obj).A02);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A02);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.A00, this.A01, Integer.valueOf(this.A02.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.A02 = createByteArray;
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public IcyInfo(String str, String str2, byte[] bArr) {
        this.A02 = bArr;
        this.A00 = str;
        this.A01 = str2;
    }
}
