package com.instagram.creation.base;

import X.AbstractC166997dE;
import X.AbstractC37304Gc5;
import X.C05F;
import X.C14360o3;
import X.C56216OxP;
import X.C56217OxQ;
import X.C5QB;
import X.InterfaceC57929PmZ;
import X.InterfaceC57930Pma;
import X.LNM;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes9.dex */
public final class PhotoSession implements MediaSession {
    public static final Parcelable.Creator CREATOR = new LNM(36);
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public Location A04;
    public CropInfo A05;
    public C5QB A06;
    public FilterGroupModel A07;
    public FilterGroupModel A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public final InterfaceC57929PmZ A0D;
    public final InterfaceC57930Pma A0E;

    public PhotoSession(Parcel parcel) {
        this.A0E = new C56217OxQ(this);
        this.A0D = new C56216OxP(this);
        this.A02 = -1;
        this.A0A = parcel.readString();
        this.A01 = parcel.readInt();
        this.A05 = (CropInfo) AbstractC37304Gc5.A04(parcel, CropInfo.class);
        this.A07 = (FilterGroupModel) AbstractC37304Gc5.A04(parcel, FilterGroupModel.class);
        this.A08 = (FilterGroupModel) AbstractC37304Gc5.A04(parcel, FilterGroupModel.class);
        String readString = parcel.readString();
        if (readString != null) {
            this.A0B = readString;
            this.A09 = parcel.readString();
            this.A0C = parcel.readByte() == 1;
            this.A00 = parcel.readFloat();
            this.A04 = (Location) AbstractC37304Gc5.A04(parcel, Location.class);
            this.A02 = parcel.readInt();
            this.A03 = parcel.readLong();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A08, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.A00);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A02);
        parcel.writeLong(this.A03);
    }

    @Override // com.instagram.creation.base.MediaSession
    public final long AgC() {
        return this.A03;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final CropInfo AtF() {
        return this.A05;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final InterfaceC57929PmZ B2v() {
        return this.A0D;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final String B6E() {
        return this.A0B;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final FilterGroupModel B6P() {
        return this.A07;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final Location BOK() {
        return this.A04;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final int BRV() {
        return this.A02;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final String BcD() {
        return this.A0A;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final InterfaceC57930Pma BqI() {
        return this.A0E;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final C5QB BtT() {
        return this.A06;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final Integer Btq() {
        return C05F.A00;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void EQJ(long j) {
        this.A03 = j;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void ESU(CropInfo cropInfo) {
        this.A05 = cropInfo;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void EUS(String str) {
        this.A0B = str;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void EUW(FilterGroupModel filterGroupModel) {
        this.A07 = filterGroupModel;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void EYV(Location location) {
        this.A04 = location;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void EYz(int i) {
        this.A02 = i;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void Eac(String str) {
        this.A0A = str;
    }

    @Override // com.instagram.creation.base.MediaSession
    public final void Edh(C5QB c5qb) {
        this.A06 = c5qb;
    }

    public PhotoSession(String str, String str2) {
        this.A0E = new C56217OxQ(this);
        this.A0D = new C56216OxP(this);
        this.A02 = -1;
        this.A0B = str;
        this.A09 = str2;
    }
}
