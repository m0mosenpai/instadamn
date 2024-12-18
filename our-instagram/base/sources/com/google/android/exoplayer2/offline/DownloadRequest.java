package com.google.android.exoplayer2.offline;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25225BEi;
import X.AbstractC31177DnL;
import X.AbstractC37304Gc5;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.C63470SlB;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(82);
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final byte[] A05;
    public final byte[] A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (!this.A02.equals(downloadRequest.A02) || !this.A00.equals(downloadRequest.A00) || !Util.A0I(this.A03, downloadRequest.A03) || !this.A04.equals(downloadRequest.A04) || !Arrays.equals(this.A06, downloadRequest.A06) || !Util.A0I(this.A01, downloadRequest.A01) || !Arrays.equals(this.A05, downloadRequest.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0E(this.A05, ((AbstractC58321PtD.A0E(this.A06, (((AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02) * 31) + AbstractC31177DnL.A04(this.A03)) * 31) + this.A04.hashCode()) * 31) * 31) + AbstractC58321PtD.A0D(this.A01)) * 31);
    }

    public final String toString() {
        return AnonymousClass001.A0g(this.A03, ":", this.A02);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00.toString());
        parcel.writeString(this.A03);
        List list = this.A04;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.A06);
        parcel.writeString(this.A01);
        parcel.writeByteArray(this.A05);
    }

    public DownloadRequest(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = Uri.parse(parcel.readString());
        this.A03 = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList A17 = AbstractC25225BEi.A17(readInt);
        for (int i = 0; i < readInt; i++) {
            AbstractC37304Gc5.A0r(parcel, StreamKey.class, A17);
        }
        this.A04 = Collections.unmodifiableList(A17);
        this.A06 = parcel.createByteArray();
        this.A01 = parcel.readString();
        this.A05 = parcel.createByteArray();
    }
}
