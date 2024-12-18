package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC37368GdA;
import X.C14360o3;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C206129Au;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel;
import com.instagram.music.common.model.MusicConsumptionModel;

/* loaded from: classes3.dex */
public final class ImmutablePandoMusicInfo extends C17T implements MusicInfo {
    public static final AbstractC136426Fv CREATOR = new C206129Au(0);
    public MusicConsumptionModel A00;

    @Override // com.instagram.api.schemas.MusicInfo
    public final MusicInfoImpl Ewz(C1DV c1dv) {
        return Ewy(new C1DY(c1dv, 6, false));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.MusicInfo
    public final TrackData BVV() {
        return (TrackData) A04(541071095, ImmutablePandoTrackData.class);
    }

    @Override // com.instagram.api.schemas.MusicInfo
    public final MusicConsumptionModel BVa() {
        MusicConsumptionModel musicConsumptionModel = this.A00;
        if (musicConsumptionModel == null) {
            return (MusicConsumptionModel) A04(228267436, ImmutablePandoMusicConsumptionModel.class);
        }
        return musicConsumptionModel;
    }

    @Override // com.instagram.api.schemas.MusicInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC37368GdA.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.MusicInfo
    public final Long BVZ() {
        return A0L(1139251232);
    }

    @Override // com.instagram.api.schemas.MusicInfo
    public final MusicInfo E9O(C1DY c1dy) {
        MusicConsumptionModel BVa = BVa();
        BVa.EBx(c1dy);
        this.A00 = BVa;
        return this;
    }

    @Override // com.instagram.api.schemas.MusicInfo
    public final MusicInfoImpl Ewy(C1DY c1dy) {
        return new MusicInfoImpl(BVV().F3P(), BVa().F6h(c1dy), A0L(1139251232));
    }
}
