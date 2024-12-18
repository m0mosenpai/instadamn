package com.instagram.reels.question.model;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import X.I5J;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoTrackData;
import com.instagram.api.schemas.TrackData;
import com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel;
import com.instagram.music.common.model.MusicConsumptionModel;

/* loaded from: classes7.dex */
public final class ImmutablePandoMusicQuestionResponseModel extends C17T implements MusicQuestionResponseModelIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(81);
    public MusicConsumptionModel A00;

    @Override // com.instagram.reels.question.model.MusicQuestionResponseModelIntf
    public final TrackData BVV() {
        return (TrackData) A04(541071095, ImmutablePandoTrackData.class);
    }

    @Override // com.instagram.reels.question.model.MusicQuestionResponseModelIntf
    public final MusicConsumptionModel BVa() {
        MusicConsumptionModel musicConsumptionModel = this.A00;
        if (musicConsumptionModel == null) {
            return (MusicConsumptionModel) A04(228267436, ImmutablePandoMusicConsumptionModel.class);
        }
        return musicConsumptionModel;
    }

    @Override // com.instagram.reels.question.model.MusicQuestionResponseModelIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I5J.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.reels.question.model.MusicQuestionResponseModelIntf
    public final MusicQuestionResponseModelIntf EC7(C1DY c1dy) {
        MusicConsumptionModel BVa = BVa();
        BVa.EBx(c1dy);
        this.A00 = BVa;
        return this;
    }

    @Override // com.instagram.reels.question.model.MusicQuestionResponseModelIntf
    public final MusicQuestionResponseModel F6z(C1DY c1dy) {
        return new MusicQuestionResponseModel(BVV().F3P(), BVa().F6h(c1dy));
    }

    @Override // com.instagram.reels.question.model.MusicQuestionResponseModelIntf
    public final MusicQuestionResponseModel F70(C1DV c1dv) {
        return F6z(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
