package com.google.android.exoplayer2.metadata.id3;

import X.AbstractC31177DnL;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.C63470SlB;
import X.JQ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes10.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(63);
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CommentFrame commentFrame = (CommentFrame) obj;
            if (!Util.A0I(this.A00, commentFrame.A00) || !Util.A0I(this.A01, commentFrame.A01) || !Util.A0I(this.A02, commentFrame.A02)) {
                return false;
            }
        }
        return true;
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public final int hashCode() {
        return ((JQ0.A01(AbstractC31177DnL.A04(this.A01)) + AbstractC31177DnL.A04(this.A00)) * 31) + AbstractC58321PtD.A0D(this.A02);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return AnonymousClass001.A11(super.A00, ": language=", this.A01, ", description=", this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }
}
