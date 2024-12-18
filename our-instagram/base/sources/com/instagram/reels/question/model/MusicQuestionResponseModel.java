package com.instagram.reels.question.model;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C37324GcR;
import X.I5J;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TrackData;
import com.instagram.music.common.model.MusicConsumptionModel;

/* loaded from: classes7.dex */
public final class MusicQuestionResponseModel extends C0T6 implements Parcelable, MusicQuestionResponseModelIntf {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(31);
    public final TrackData A00;
    public final MusicConsumptionModel A01;

    @Override // com.instagram.reels.question.model.MusicQuestionResponseModelIntf
    public final MusicQuestionResponseModel F6z(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.reels.question.model.MusicQuestionResponseModelIntf
    public final MusicQuestionResponseModel F70(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicQuestionResponseModel) {
                MusicQuestionResponseModel musicQuestionResponseModel = (MusicQuestionResponseModel) obj;
                if (!C14360o3.A0K(this.A00, musicQuestionResponseModel.A00) || !C14360o3.A0K(this.A01, musicQuestionResponseModel.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.reels.question.model.MusicQuestionResponseModelIntf
    public final TrackData BVV() {
        return this.A00;
    }

    @Override // com.instagram.reels.question.model.MusicQuestionResponseModelIntf
    public final MusicConsumptionModel BVa() {
        return this.A01;
    }

    @Override // com.instagram.reels.question.model.MusicQuestionResponseModelIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTMusicResponseDict", I5J.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public MusicQuestionResponseModel(TrackData trackData, MusicConsumptionModel musicConsumptionModel) {
        AbstractC167017dG.A1P(trackData, musicConsumptionModel);
        this.A00 = trackData;
        this.A01 = musicConsumptionModel;
    }

    @Override // com.instagram.reels.question.model.MusicQuestionResponseModelIntf
    public final MusicQuestionResponseModelIntf EC7(C1DY c1dy) {
        return this;
    }
}
