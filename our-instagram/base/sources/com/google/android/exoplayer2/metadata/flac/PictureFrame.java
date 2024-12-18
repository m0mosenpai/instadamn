package com.google.android.exoplayer2.metadata.flac;

import X.AbstractC166997dE;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.C4B6;
import X.C4W7;
import X.C63470SlB;
import X.JQ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(55);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.A03 != pictureFrame.A03 || !this.A06.equals(pictureFrame.A06) || !this.A05.equals(pictureFrame.A05) || this.A04 != pictureFrame.A04 || this.A02 != pictureFrame.A02 || this.A01 != pictureFrame.A01 || this.A00 != pictureFrame.A00 || !Arrays.equals(this.A07, pictureFrame.A07)) {
                return false;
            }
        }
        return true;
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
        c4w7.A01(this.A07, this.A03);
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0E(this.A07, (((((((AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A06, JQ0.A01(this.A03))) + this.A04) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public final String toString() {
        return AnonymousClass001.A0u("Picture: mimeType=", this.A06, ", description=", this.A05);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A07);
    }

    public PictureFrame(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = parcel.createByteArray();
    }
}
