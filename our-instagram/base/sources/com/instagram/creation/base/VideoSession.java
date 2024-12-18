package com.instagram.creation.base;

import X.AbstractC167007dF;
import X.AbstractC37304Gc5;
import X.C05F;
import X.C14360o3;
import X.C47Z;
import X.C48577LeF;
import X.C5QB;
import X.InterfaceC57929PmZ;
import X.InterfaceC57930Pma;
import X.LNM;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.ClipInfo;

/* loaded from: classes8.dex */
public final class VideoSession implements MediaSession {
    public static final Parcelable.Creator CREATOR = LNM.A00(37);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public Location A0B;
    public CropInfo A0C;
    public FilterGroupModel A0D;
    public FilterGroupModel A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public C5QB A0M;
    public final InterfaceC57930Pma A0N;
    public final InterfaceC57929PmZ A0O;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.PmZ, java.lang.Object] */
    public VideoSession(Parcel parcel) {
        this.A00 = 1.0f;
        this.A0N = new C48577LeF(this);
        this.A0O = new Object();
        this.A04 = -1;
        this.A0G = parcel.readString();
        this.A0C = (CropInfo) AbstractC37304Gc5.A04(parcel, CropInfo.class);
        this.A0D = (FilterGroupModel) AbstractC37304Gc5.A04(parcel, FilterGroupModel.class);
        this.A0I = AbstractC167007dF.A1P(parcel.readByte(), 1);
        this.A0K = AbstractC167007dF.A1P(parcel.readByte(), 1);
        this.A00 = parcel.readFloat();
        String readString = parcel.readString();
        C14360o3.A0A(readString);
        this.A0H = readString;
        this.A0F = parcel.readString();
        this.A0B = (Location) AbstractC37304Gc5.A04(parcel, Location.class);
        this.A08 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A0L = AbstractC167007dF.A1P(parcel.readByte(), 1);
        this.A09 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0J = parcel.readByte() == 1;
        this.A04 = parcel.readInt();
        this.A0A = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeParcelable(this.A0D, i);
        parcel.writeByte(this.A0I ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0K ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0F);
        parcel.writeParcelable(this.A0B, i);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeByte(this.A0L ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A0J ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A04);
        parcel.writeLong(this.A0A);
    }

    public final void A00(C47Z c47z) {
        ClipInfo clipInfo;
        if (c47z != null && (clipInfo = c47z.A1N) != null && !clipInfo.equals(ClipInfo.A0Q.getValue())) {
            this.A08 = c47z.A1i.A01;
            this.A07 = c47z.A05;
            ClipInfo clipInfo2 = c47z.A1N;
            this.A06 = clipInfo2.A07;
            this.A05 = clipInfo2.A05;
            this.A0L = c47z.A5F;
        }
    }

    @Override // com.instagram.creation.base.MediaSession
    public final long AgC() {
        return this.A0A;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final CropInfo AtF() {
        return this.A0C;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final InterfaceC57929PmZ B2v() {
        return this.A0O;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final String B6E() {
        return this.A0H;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final FilterGroupModel B6P() {
        return this.A0D;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final Location BOK() {
        return this.A0B;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final int BRV() {
        return this.A04;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final String BcD() {
        return this.A0G;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final InterfaceC57930Pma BqI() {
        return this.A0N;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final C5QB BtT() {
        return this.A0M;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final Integer Btq() {
        return C05F.A01;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void EQJ(long j) {
        this.A0A = j;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void ESU(CropInfo cropInfo) {
        this.A0C = cropInfo;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void EUS(String str) {
        this.A0H = str;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void EUW(FilterGroupModel filterGroupModel) {
        this.A0D = filterGroupModel;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void EYV(Location location) {
        this.A0B = location;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void EYz(int i) {
        this.A04 = i;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void Eac(String str) {
        this.A0G = str;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void Edh(C5QB c5qb) {
        this.A0M = c5qb;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.PmZ, java.lang.Object] */
    public VideoSession(String str, String str2) {
        this.A00 = 1.0f;
        this.A0N = new C48577LeF(this);
        this.A0O = new Object();
        this.A04 = -1;
        this.A0H = str;
        this.A0F = str2;
    }
}
