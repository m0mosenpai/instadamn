package com.google.android.exoplayer2.metadata.emsg;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31177DnL;
import X.C4B3;
import X.C4B6;
import X.C4W7;
import X.C63470SlB;
import X.MSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class EventMessage implements Metadata.Entry {
    public static final C4B6 A06;
    public static final C4B6 A07;
    public static final Parcelable.Creator CREATOR;
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void E4k(C4W7 c4w7) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventMessage eventMessage = (EventMessage) obj;
            if (this.A01 != eventMessage.A01 || this.A02 != eventMessage.A02 || !Util.A0I(this.A03, eventMessage.A03) || !Util.A0I(this.A04, eventMessage.A04) || !Arrays.equals(this.A05, eventMessage.A05)) {
                return false;
            }
        }
        return true;
    }

    static {
        C4B3 c4b3 = new C4B3();
        c4b3.A0U = "application/id3";
        A06 = new C4B6(c4b3);
        C4B3 c4b32 = new C4B3();
        c4b32.A0U = "application/x-scte35";
        A07 = new C4B6(c4b32);
        CREATOR = new C63470SlB(54);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final C4B6 CHw() {
        String str;
        String str2 = this.A03;
        switch (str2.hashCode()) {
            case -1468477611:
                if (!str2.equals("urn:scte:scte35:2014:bin")) {
                    return null;
                }
                return A07;
            case -795945609:
                str = "https://aomedia.org/emsg/ID3";
                break;
            case 1303648457:
                str = "https://developer.apple.com/streaming/emsg-id3";
                break;
            default:
                return null;
        }
        if (!str2.equals(str)) {
            return null;
        }
        return A06;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int i2 = 0;
            int A04 = (527 + AbstractC31177DnL.A04(this.A03)) * 31;
            String str = this.A04;
            if (str != null) {
                i2 = str.hashCode();
            }
            int A072 = AbstractC167007dF.A07(this.A02, AbstractC167007dF.A07(this.A01, (A04 + i2) * 31)) + Arrays.hashCode(this.A05);
            this.A00 = A072;
            return A072;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EMSG: scheme=");
        sb.append(this.A03);
        sb.append(", id=");
        sb.append(this.A02);
        sb.append(MSV.A00(131));
        sb.append(this.A01);
        sb.append(", value=");
        return AbstractC166997dE.A0x(this.A04, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A05);
    }

    public EventMessage(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = parcel.createByteArray();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final byte[] CHv() {
        if (CHw() != null) {
            return this.A05;
        }
        return null;
    }

    public EventMessage(String str, String str2, byte[] bArr, long j, long j2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = bArr;
    }
}
