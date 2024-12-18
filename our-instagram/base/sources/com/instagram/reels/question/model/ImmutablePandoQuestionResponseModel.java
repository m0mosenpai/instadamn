package com.instagram.reels.question.model;

import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37302Gc3;
import X.AbstractC37303Gc4;
import X.C17T;
import X.C1DY;
import X.C39305HXw;
import X.I5L;
import X.JDS;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.ImmutablePandoQuestionMediaResponseModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class ImmutablePandoQuestionResponseModel extends C17T implements QuestionResponseModelIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(82);
    public MusicQuestionResponseModelIntf A00;
    public User A01;

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final QuestionMediaResponseModelIntf BRR() {
        return (QuestionMediaResponseModelIntf) A05(-649955780, ImmutablePandoQuestionMediaResponseModel.class);
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final MusicQuestionResponseModelIntf BVk() {
        MusicQuestionResponseModelIntf musicQuestionResponseModelIntf = this.A00;
        if (musicQuestionResponseModelIntf == null) {
            return (MusicQuestionResponseModelIntf) A05(493777179, ImmutablePandoMusicQuestionResponseModel.class);
        }
        return musicQuestionResponseModelIntf;
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final QuestionResponseType Bol() {
        return (QuestionResponseType) A0M(1676784760, JDS.A00);
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final int CBC() {
        return getIntValueByHashCode(3711);
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final User CDj() {
        User user = this.A01;
        if (user != null) {
            return user;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'user' field.");
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I5L.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final boolean BCd() {
        return getBooleanValueByHashCode(39923510);
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final String Bog() {
        return A0i(-340323263);
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final Boolean Bs7() {
        return getOptionalBooleanValueByHashCode(3526267);
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final Boolean Bv1() {
        return getOptionalBooleanValueByHashCode(-1224792764);
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final QuestionResponseModelIntf EC8(C1DY c1dy) {
        MusicQuestionResponseModelIntf BVk = BVk();
        if (BVk != null) {
            BVk.EC7(c1dy);
        } else {
            BVk = null;
        }
        this.A00 = BVk;
        this.A01 = AbstractC37302Gc3.A0P(c1dy, this, 3599307);
        return this;
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final QuestionResponseModel F71(C1DY c1dy) {
        QuestionMediaResponseModel questionMediaResponseModel;
        boolean booleanValueByHashCode = getBooleanValueByHashCode(39923510);
        String A0g = A0g();
        QuestionMediaResponseModelIntf BRR = BRR();
        MusicQuestionResponseModel musicQuestionResponseModel = null;
        if (BRR != null) {
            questionMediaResponseModel = BRR.F74();
        } else {
            questionMediaResponseModel = null;
        }
        MusicQuestionResponseModelIntf BVk = BVk();
        if (BVk != null) {
            musicQuestionResponseModel = BVk.F6z(c1dy);
        }
        return new QuestionResponseModel(musicQuestionResponseModel, Bol(), questionMediaResponseModel, (User) AbstractC37303Gc4.A07(c1dy, this, 3599307), getOptionalBooleanValueByHashCode(3526267), getOptionalBooleanValueByHashCode(-1224792764), A0g, A0i(-340323263), getIntValueByHashCode(3711), booleanValueByHashCode);
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final String getId() {
        return A0g();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
