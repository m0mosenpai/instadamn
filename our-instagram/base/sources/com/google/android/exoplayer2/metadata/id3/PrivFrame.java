package com.google.android.exoplayer2.metadata.id3;

import X.AbstractC31177DnL;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.C63470SlB;
import X.JQ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(67);
    public final String A00;
    public final byte[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PrivFrame privFrame = (PrivFrame) obj;
            if (!Util.A0I(this.A00, privFrame.A00) || !Arrays.equals(this.A01, privFrame.A01)) {
                return false;
            }
        }
        return true;
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.A00 = str;
        this.A01 = bArr;
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0E(this.A01, JQ0.A01(AbstractC31177DnL.A04(this.A00)));
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return AnonymousClass001.A0g(super.A00, ": owner=", this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A01);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.A00 = parcel.readString();
        this.A01 = parcel.createByteArray();
    }
}
