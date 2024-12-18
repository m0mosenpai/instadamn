package com.instagram.reels.question.model;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import X.I5N;
import X.JDT;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoQuestionResponsesModel extends C17T implements QuestionResponsesModelIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(83);
    public User A00;
    public List A01;

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final User BjR() {
        return this.A00;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final QuestionStickerType Bjf() {
        return (QuestionStickerType) A0M(-1030321165, JDT.A00);
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final List Boe() {
        List list = this.A01;
        if (list == null) {
            return A0o(-633584463, ImmutablePandoQuestionResponseModel.class);
        }
        return list;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I5N.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final Long BMC() {
        return A0L(739279658);
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final String BPp() {
        return A0j(-1081138730);
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final boolean BUt() {
        return getBooleanValueByHashCode(1024940639);
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final String BjV() {
        return A0k(964289556);
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final int Bja() {
        return getIntValueByHashCode(1781202186);
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final int CCJ() {
        return getIntValueByHashCode(14453882);
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final QuestionResponsesModelIntf EC9(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, 1451283460);
        List<QuestionResponseModelIntf> Boe = Boe();
        ArrayList A0q = AbstractC167017dG.A0q(Boe);
        for (QuestionResponseModelIntf questionResponseModelIntf : Boe) {
            questionResponseModelIntf.EC8(c1dy);
            A0q.add(questionResponseModelIntf);
        }
        this.A01 = A0q;
        return this;
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final QuestionResponsesModel F72(C1DY c1dy) {
        User user;
        User A0N;
        String A0h = A0h(2036780306);
        Long A0L = A0L(739279658);
        String A0j = A0j(-1081138730);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1024940639);
        String A0h2 = A0h(-1165870106);
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, 1451283460);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        String A0k = A0k(964289556);
        int intValueByHashCode = getIntValueByHashCode(1781202186);
        QuestionStickerType Bjf = Bjf();
        List Boe = Boe();
        ArrayList A0q = AbstractC167017dG.A0q(Boe);
        Iterator it = Boe.iterator();
        while (it.hasNext()) {
            A0q.add(((QuestionResponseModelIntf) it.next()).F71(c1dy));
        }
        return new QuestionResponsesModel(Bjf, user, A0L, A0h, A0j, A0h2, A0k, A0h(-2115337775), A0q, intValueByHashCode, getIntValueByHashCode(14453882), booleanValueByHashCode);
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final QuestionResponsesModel F73(C1DV c1dv) {
        return F72(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final String getBackgroundColor() {
        return A0h(2036780306);
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final String getQuestion() {
        return A0h(-1165870106);
    }

    @Override // com.instagram.reels.question.model.QuestionResponsesModelIntf
    public final String getTextColor() {
        return A0h(-2115337775);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
