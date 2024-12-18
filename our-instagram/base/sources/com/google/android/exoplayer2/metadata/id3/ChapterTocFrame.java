package com.google.android.exoplayer2.metadata.id3;

import X.AbstractC167007dF;
import X.AbstractC31177DnL;
import X.AbstractC37304Gc5;
import X.C63470SlB;
import X.JQ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(62);
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final String[] A03;
    public final Id3Frame[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.A02 != chapterTocFrame.A02 || this.A01 != chapterTocFrame.A01 || !Util.A0I(this.A00, chapterTocFrame.A00) || !Arrays.equals(this.A03, chapterTocFrame.A03) || !Arrays.equals(this.A04, chapterTocFrame.A04)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.A00 = parcel.readString();
        this.A02 = AbstractC167007dF.A1M(parcel.readByte());
        this.A01 = parcel.readByte() != 0;
        this.A03 = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.A04 = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.A04[i] = AbstractC37304Gc5.A04(parcel, Id3Frame.class);
        }
    }

    public final int hashCode() {
        return ((JQ0.A01(this.A02 ? 1 : 0) + (this.A01 ? 1 : 0)) * 31) + AbstractC31177DnL.A04(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.A03);
        Id3Frame[] id3FrameArr = this.A04;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(String str, Id3Frame[] id3FrameArr, String[] strArr, boolean z, boolean z2) {
        super("CTOC");
        this.A00 = str;
        this.A02 = z;
        this.A01 = z2;
        this.A03 = strArr;
        this.A04 = id3FrameArr;
    }
}
