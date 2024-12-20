package com.facebook.video.heroplayer.ipc;

import X.AbstractC53312cF;
import X.AnonymousClass001;
import X.C206149Aw;
import X.EnumC53322cG;
import X.EnumC92424Bx;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class HttpTransferRequestedEvent extends AbstractC53312cF implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(25);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final long A0M;
    public final long A0N;
    public final long A0O;
    public final long A0P;
    public final long A0Q;
    public final long A0R;
    public final long A0S;
    public final EnumC92424Bx A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final String A0i;
    public final String A0j;
    public final String A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public HttpTransferRequestedEvent(Parcel parcel) {
        super(EnumC53322cG.A0H);
        this.A0R = parcel.readLong();
        String readString = parcel.readString();
        this.A0j = readString == null ? "" : readString;
        this.A0L = parcel.readLong();
        this.A0h = parcel.readString();
        this.A0X = parcel.readString();
        this.A0u = parcel.readByte() == 1;
        String readString2 = parcel.readString();
        this.A0f = readString2 == null ? "" : readString2;
        this.A0C = parcel.readInt();
        EnumC92424Bx enumC92424Bx = (EnumC92424Bx) parcel.readValue(EnumC92424Bx.class.getClassLoader());
        this.A0T = enumC92424Bx == null ? EnumC92424Bx.NOT_APPLY : enumC92424Bx;
        this.A0p = parcel.readByte() == 1;
        this.A0q = parcel.readByte() == 1;
        String readString3 = parcel.readString();
        this.A0c = readString3 == null ? "" : readString3;
        this.A0d = parcel.readString();
        this.A0Q = parcel.readLong();
        this.A0M = parcel.readLong();
        this.A0B = parcel.readInt();
        this.A0N = parcel.readLong();
        this.A0A = parcel.readInt();
        String readString4 = parcel.readString();
        this.A0W = readString4 == null ? "" : readString4;
        String readString5 = parcel.readString();
        this.A0g = readString5 == null ? "" : readString5;
        this.A07 = parcel.readInt();
        this.A0D = parcel.readLong();
        this.A0r = parcel.readByte() == 1;
        this.A00 = parcel.readInt();
        this.A0O = parcel.readLong();
        this.A0P = parcel.readLong();
        this.A0w = parcel.readByte() == 1;
        this.A0x = parcel.readByte() == 1;
        this.A0y = parcel.readByte() == 1;
        String readString6 = parcel.readString();
        this.A0i = readString6 == null ? "" : readString6;
        this.A0S = parcel.readLong();
        this.A0H = parcel.readLong();
        this.A0I = parcel.readLong();
        this.A0J = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A0G = parcel.readLong();
        this.A0n = parcel.readByte() == 1;
        this.A0o = parcel.readByte() == 1;
        this.A0v = parcel.readByte() == 1;
        this.A0l = parcel.readByte() == 1;
        this.A0s = parcel.readByte() == 1;
        this.A0m = parcel.readByte() == 1;
        this.A0t = parcel.readByte() == 1;
        this.A03 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0K = parcel.readLong();
        this.A0U = parcel.readString();
        this.A0E = parcel.readLong();
        String readString7 = parcel.readString();
        this.A0V = readString7 == null ? "" : readString7;
        this.A05 = parcel.readInt();
        this.A0F = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A0Z = parcel.readString();
        this.A0a = parcel.readString();
        this.A0Y = parcel.readString();
        this.A0b = parcel.readString();
        this.A0e = parcel.readString();
        this.A08 = parcel.readInt();
        this.A0k = parcel.readString();
        this.A04 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass001.A0Q("timeMs=", this.A0R));
        sb.append(AnonymousClass001.A0R(", videoId=", this.A0j));
        sb.append(AnonymousClass001.A0Q(", playerId=", this.A0L));
        sb.append(AnonymousClass001.A0R(", url=", this.A0h));
        sb.append(AnonymousClass001.A0R(", exception=", this.A0X));
        sb.append(AnonymousClass001.A1D(", isPrefetch=", this.A0u));
        sb.append(AnonymousClass001.A0R(", prefetchSource=", this.A0f));
        sb.append(AnonymousClass001.A0O(", seqNum=", this.A0C));
        sb.append(AnonymousClass001.A0R(", cacheType=", this.A0T.A01));
        sb.append(AnonymousClass001.A1D(", isFirstPlay=", this.A0p));
        sb.append(AnonymousClass001.A0R(", playOrigin=", this.A0c));
        sb.append(AnonymousClass001.A0Q(", startingByteOffset=", this.A0Q));
        sb.append(AnonymousClass001.A0Q(", requestedLength=", this.A0M));
        sb.append(AnonymousClass001.A0O(", streamType=", this.A0B));
        sb.append(AnonymousClass001.A0Q(", segmentStart=", this.A0N));
        sb.append(AnonymousClass001.A0O(", segmentDuration=", this.A0A));
        sb.append(AnonymousClass001.A0R(", dataSourceFactory=", this.A0W));
        sb.append(AnonymousClass001.A0R(", qualityLabel=", this.A0g));
        sb.append(AnonymousClass001.A0O(", networkPriority=", this.A07));
        sb.append(AnonymousClass001.A0O(", bufferedDurationMs=", this.A00));
        sb.append(AnonymousClass001.A0Q(", startVideoBandwidth=", this.A0O));
        sb.append(AnonymousClass001.A0Q(", startVideoTTFB=", this.A0P));
        sb.append(AnonymousClass001.A0R(", videoBandwidthEstimateStr=", this.A0i));
        sb.append(AnonymousClass001.A0Q(", upstreamTTFB=", this.A0S));
        sb.append(AnonymousClass001.A0Q(", manifestFirstSegmentStartTs=", this.A0H));
        sb.append(AnonymousClass001.A0Q(", manifestLastSegmentEndTs=", this.A0I));
        sb.append(AnonymousClass001.A0Q(", manifestNumSegments=", this.A0J));
        sb.append(AnonymousClass001.A0O(", bufferedDurationMsAtDataSpecCreation=", this.A01));
        sb.append(AnonymousClass001.A0Q(", dataSpecCreationTimeMs=", this.A0G));
        sb.append(AnonymousClass001.A0R(", playSubOrigin=", this.A0d));
        sb.append(AnonymousClass001.A1D(", isFBMS=", this.A0n));
        sb.append(AnonymousClass001.A1D(", isFbPredictiveDASH=", this.A0o));
        sb.append(AnonymousClass001.A1D(", isSkipAheadChunk=", this.A0v));
        sb.append(AnonymousClass001.A1D(", inRewoundState=", this.A0l));
        sb.append(AnonymousClass001.A1D(", isManifestDynamic=", this.A0s));
        sb.append(AnonymousClass001.A1D(", isChunkedTransfer=", this.A0m));
        sb.append(AnonymousClass001.A1D(", isPredictedURL=", this.A0t));
        sb.append(AnonymousClass001.A0O(", expectedPredictedNumber=", this.A03));
        sb.append(AnonymousClass001.A0O(", predictedNumberMapping=", this.A09));
        sb.append(AnonymousClass001.A0Q(", numSegmentsToEndOfManifest= ", this.A0K));
        sb.append(AnonymousClass001.A0R(", codec= ", this.A0U));
        sb.append(AnonymousClass001.A0Q(", cdnResponseTime= ", this.A0E));
        sb.append(AnonymousClass001.A0R(", contentType= ", this.A0V));
        sb.append(AnonymousClass001.A0O(", latestSegmentId= ", this.A05));
        sb.append(AnonymousClass001.A0Q(", confidenceBasedBitrateEstimate=", this.A0F));
        sb.append(AnonymousClass001.A0O(", confidencePctForBitrateEstimate=", this.A02));
        sb.append(AnonymousClass001.A0O(", minimumLoadPositionMs=", this.A06));
        sb.append(AnonymousClass001.A0R(", oneReqWave=", this.A0Z));
        sb.append(AnonymousClass001.A0R(", oneResWave=", this.A0a));
        sb.append(AnonymousClass001.A0R(", oneObserved=", this.A0Y));
        sb.append(AnonymousClass001.A0R(", oneVariant=", this.A0b));
        sb.append(AnonymousClass001.A0R(", playerType=", this.A0e));
        sb.append(AnonymousClass001.A0O(", positionInUnit=", this.A08));
        sb.append(AnonymousClass001.A0R(", vpSessionId=", this.A0k));
        sb.append(AnonymousClass001.A0O(", firstChunkSize=", this.A04));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A0R);
        parcel.writeString(this.A0j);
        parcel.writeLong(this.A0L);
        parcel.writeString(this.A0h);
        parcel.writeString(this.A0X);
        parcel.writeByte(this.A0u ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0f);
        parcel.writeInt(this.A0C);
        parcel.writeValue(this.A0T);
        parcel.writeByte(this.A0p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0q ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0c);
        parcel.writeString(this.A0d);
        parcel.writeLong(this.A0Q);
        parcel.writeLong(this.A0M);
        parcel.writeInt(this.A0B);
        parcel.writeLong(this.A0N);
        parcel.writeInt(this.A0A);
        parcel.writeString(this.A0W);
        parcel.writeString(this.A0g);
        parcel.writeInt(this.A07);
        parcel.writeLong(this.A0D);
        parcel.writeByte(this.A0r ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A0O);
        parcel.writeLong(this.A0P);
        parcel.writeByte(this.A0w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0y ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0i);
        parcel.writeLong(this.A0S);
        parcel.writeLong(this.A0H);
        parcel.writeLong(this.A0I);
        parcel.writeLong(this.A0J);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A0G);
        parcel.writeByte(this.A0n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0t ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A09);
        parcel.writeLong(this.A0K);
        parcel.writeString(this.A0U);
        parcel.writeLong(this.A0E);
        parcel.writeString(this.A0V);
        parcel.writeInt(this.A05);
        parcel.writeLong(this.A0F);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A06);
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0a);
        parcel.writeString(this.A0Y);
        parcel.writeString(this.A0b);
        parcel.writeString(this.A0e);
        parcel.writeInt(this.A08);
        parcel.writeString(this.A0k);
        parcel.writeInt(this.A04);
    }

    public HttpTransferRequestedEvent(EnumC92424Bx enumC92424Bx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(EnumC53322cG.A0H);
        this.A0R = j;
        this.A0j = str;
        this.A0L = j2;
        this.A0h = str2;
        this.A0X = str3;
        this.A0u = z;
        this.A0f = str4;
        this.A0C = i;
        this.A0T = enumC92424Bx;
        this.A0p = z2;
        this.A0q = z3;
        this.A0c = str5;
        this.A0d = str9;
        this.A0Q = j3;
        this.A0M = j4;
        this.A0B = i2;
        this.A0N = j5;
        this.A0A = i3;
        this.A0W = str6;
        this.A0g = str7;
        this.A07 = i4;
        this.A0D = j6;
        this.A0r = z4;
        this.A00 = i5;
        this.A0O = j7;
        this.A0P = j8;
        this.A0w = z5;
        this.A0x = z6;
        this.A0y = z7;
        this.A0i = str8;
        this.A0S = j9;
        this.A0H = j10;
        this.A0I = j11;
        this.A0J = j12;
        this.A01 = i6;
        this.A0G = j13;
        this.A0n = z8;
        this.A0o = z9;
        this.A0v = z10;
        this.A0l = z11;
        this.A0s = z12;
        this.A0m = z13;
        this.A0t = z14;
        this.A03 = i8;
        this.A09 = i7;
        this.A0K = j14;
        this.A0U = str10;
        this.A0E = j15;
        this.A0V = str11;
        this.A05 = i9;
        this.A0F = j16;
        this.A02 = i10;
        this.A06 = i11;
        this.A0Z = str12;
        this.A0a = str13;
        this.A0Y = str14;
        this.A0b = str15;
        this.A0e = str16;
        this.A08 = -1;
        this.A0k = str17;
        this.A04 = i12;
    }
}
