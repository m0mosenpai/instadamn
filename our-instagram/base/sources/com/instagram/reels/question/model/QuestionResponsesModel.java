package com.instagram.reels.question.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25231BEo;
import X.AbstractC25234BEr;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C37324GcR;
import X.I5N;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class QuestionResponsesModel extends C0T6 implements QuestionResponsesModelIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(34);
    public final int A00;
    public final int A01;
    public final QuestionStickerType A02;
    public final User A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;

    public QuestionResponsesModel(QuestionStickerType questionStickerType, User user, Long l, String str, String str2, String str3, String str4, String str5, List list, int i, int i2, boolean z) {
        AbstractC167007dF.A1G(str, 1, str3);
        AbstractC25234BEr.A0l(7, str4, questionStickerType, list, str5);
        this.A05 = str;
        this.A04 = l;
        this.A06 = str2;
        this.A0B = z;
        this.A07 = str3;
        this.A03 = user;
        this.A08 = str4;
        this.A00 = i;
        this.A02 = questionStickerType;
        this.A0A = list;
        this.A09 = str5;
        this.A01 = i2;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final QuestionResponsesModel F72(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final QuestionResponsesModel F73(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QuestionResponsesModel) {
                QuestionResponsesModel questionResponsesModel = (QuestionResponsesModel) obj;
                if (!C14360o3.A0K(this.A05, questionResponsesModel.A05) || !C14360o3.A0K(this.A04, questionResponsesModel.A04) || !C14360o3.A0K(this.A06, questionResponsesModel.A06) || this.A0B != questionResponsesModel.A0B || !C14360o3.A0K(this.A07, questionResponsesModel.A07) || !C14360o3.A0K(this.A03, questionResponsesModel.A03) || !C14360o3.A0K(this.A08, questionResponsesModel.A08) || this.A00 != questionResponsesModel.A00 || this.A02 != questionResponsesModel.A02 || !C14360o3.A0K(this.A0A, questionResponsesModel.A0A) || !C14360o3.A0K(this.A09, questionResponsesModel.A09) || this.A01 != questionResponsesModel.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A05);
        AbstractC167027dH.A0n(parcel, this.A04);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A0A);
        while (A0u.hasNext()) {
            ((QuestionResponseModel) A0u.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A09);
        parcel.writeInt(this.A01);
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final Long BMC() {
        return this.A04;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final String BPp() {
        return this.A06;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final boolean BUt() {
        return this.A0B;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final User BjR() {
        return this.A03;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final String BjV() {
        return this.A08;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final int Bja() {
        return this.A00;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final QuestionStickerType Bjf() {
        return this.A02;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final List Boe() {
        return this.A0A;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final int CCJ() {
        return this.A01;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryQuestionResponderInfoDict", I5N.A00(this));
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final String getBackgroundColor() {
        return this.A05;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final String getQuestion() {
        return this.A07;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final String getTextColor() {
        return this.A09;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A02, (AbstractC166997dE.A0K(this.A08, (AbstractC166997dE.A0K(this.A07, AbstractC167007dF.A0D(this.A0B, (((AbstractC166987dD.A0J(this.A05) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31)) + AbstractC166997dE.A0I(this.A03)) * 31) + this.A00) * 31))) + this.A01;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final QuestionResponsesModelIntf EC9(C1DY c1dy) {
        return this;
    }
}
