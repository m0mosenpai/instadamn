package com.google.android.exoplayer2.metadata.id3;

import X.AbstractC31177DnL;
import X.AbstractC37304Gc5;
import X.C63470SlB;
import X.JQ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(61);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final Id3Frame[] A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.A01 != chapterFrame.A01 || this.A00 != chapterFrame.A00 || this.A03 != chapterFrame.A03 || this.A02 != chapterFrame.A02 || !Util.A0I(this.A04, chapterFrame.A04) || !Arrays.equals(this.A05, chapterFrame.A05)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        int readInt = parcel.readInt();
        this.A05 = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.A05[i] = AbstractC37304Gc5.A04(parcel, Id3Frame.class);
        }
    }

    public final int hashCode() {
        return ((((((JQ0.A01(this.A01) + this.A00) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + AbstractC31177DnL.A04(this.A04);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        Id3Frame[] id3FrameArr = this.A05;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(String str, Id3Frame[] id3FrameArr, int i, int i2, long j, long j2) {
        super("CHAP");
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = j2;
        this.A05 = id3FrameArr;
    }
}
