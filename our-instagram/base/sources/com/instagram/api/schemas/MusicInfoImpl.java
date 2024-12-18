package com.instagram.api.schemas;

import X.AbstractC37368GdA;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.music.common.model.MusicConsumptionModel;

/* loaded from: classes2.dex */
public final class MusicInfoImpl extends C0T6 implements MusicInfo, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206159Ax(59);
    public final TrackData A00;
    public final MusicConsumptionModel A01;
    public final Long A02;

    public MusicInfoImpl(TrackData trackData, MusicConsumptionModel musicConsumptionModel, Long l) {
        C14360o3.A0B(trackData, 1);
        C14360o3.A0B(musicConsumptionModel, 3);
        this.A00 = trackData;
        this.A02 = l;
        this.A01 = musicConsumptionModel;
    }

    @Override // com.instagram.api.schemas.MusicInfo
    public final MusicInfo E9O(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.MusicInfo
    public final MusicInfoImpl Ewy(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.MusicInfo
    public final MusicInfoImpl Ewz(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicInfoImpl) {
                MusicInfoImpl musicInfoImpl = (MusicInfoImpl) obj;
                if (!C14360o3.A0K(this.A00, musicInfoImpl.A00) || !C14360o3.A0K(this.A02, musicInfoImpl.A02) || !C14360o3.A0K(this.A01, musicInfoImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        Long l = this.A02;
        return ((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        Long l = this.A02;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.api.schemas.MusicInfo
    public final TrackData BVV() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.MusicInfo
    public final Long BVZ() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.MusicInfo
    public final MusicConsumptionModel BVa() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.MusicInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMusicInfo", AbstractC37368GdA.A00(this));
    }
}
