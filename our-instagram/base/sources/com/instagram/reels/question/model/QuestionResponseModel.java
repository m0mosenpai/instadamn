package com.instagram.reels.question.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C37324GcR;
import X.I5L;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class QuestionResponseModel extends C0T6 implements QuestionResponseModelIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(32);
    public final int A00;
    public final MusicQuestionResponseModel A01;
    public final QuestionResponseType A02;
    public final QuestionMediaResponseModel A03;
    public final User A04;
    public final Boolean A05;
    public final Boolean A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public QuestionResponseModel(MusicQuestionResponseModel musicQuestionResponseModel, QuestionResponseType questionResponseType, QuestionMediaResponseModel questionMediaResponseModel, User user, Boolean bool, Boolean bool2, String str, String str2, int i, boolean z) {
        AbstractC25229BEm.A1I(str, 2, questionResponseType);
        C14360o3.A0B(user, 10);
        this.A09 = z;
        this.A07 = str;
        this.A03 = questionMediaResponseModel;
        this.A01 = musicQuestionResponseModel;
        this.A08 = str2;
        this.A02 = questionResponseType;
        this.A05 = bool;
        this.A06 = bool2;
        this.A00 = i;
        this.A04 = user;
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final QuestionResponseModel F71(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QuestionResponseModel) {
                QuestionResponseModel questionResponseModel = (QuestionResponseModel) obj;
                if (this.A09 != questionResponseModel.A09 || !C14360o3.A0K(this.A07, questionResponseModel.A07) || !C14360o3.A0K(this.A03, questionResponseModel.A03) || !C14360o3.A0K(this.A01, questionResponseModel.A01) || !C14360o3.A0K(this.A08, questionResponseModel.A08) || this.A02 != questionResponseModel.A02 || !C14360o3.A0K(this.A05, questionResponseModel.A05) || !C14360o3.A0K(this.A06, questionResponseModel.A06) || this.A00 != questionResponseModel.A00 || !C14360o3.A0K(this.A04, questionResponseModel.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A03, i);
        MusicQuestionResponseModel musicQuestionResponseModel = this.A01;
        if (musicQuestionResponseModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicQuestionResponseModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A02, i);
        AbstractC31179DnN.A0p(parcel, this.A05);
        AbstractC31179DnN.A0p(parcel, this.A06);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A04, i);
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final boolean BCd() {
        return this.A09;
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final /* bridge */ /* synthetic */ QuestionMediaResponseModelIntf BRR() {
        return this.A03;
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final /* bridge */ /* synthetic */ MusicQuestionResponseModelIntf BVk() {
        return this.A01;
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final String Bog() {
        return this.A08;
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final QuestionResponseType Bol() {
        return this.A02;
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final Boolean Bs7() {
        return this.A05;
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final Boolean Bv1() {
        return this.A06;
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final int CBC() {
        return this.A00;
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final User CDj() {
        return this.A04;
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryQuestionResponderDict", I5L.A00(this));
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final String getId() {
        return this.A07;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A04, (((((AbstractC166997dE.A0J(this.A02, (((((AbstractC166997dE.A0K(this.A07, AbstractC25225BEi.A08(this.A09)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A06)) * 31) + this.A00) * 31);
    }

    @Override // com.instagram.reels.question.model.QuestionResponseModelIntf
    public final QuestionResponseModelIntf EC8(C1DY c1dy) {
        return this;
    }
}
