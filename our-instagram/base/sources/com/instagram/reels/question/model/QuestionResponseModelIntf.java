package com.instagram.reels.question.model;

import X.C1DY;
import X.C41546IZv;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public interface QuestionResponseModelIntf extends Parcelable {
    public static final C41546IZv A00 = C41546IZv.A00;

    boolean BCd();

    QuestionMediaResponseModelIntf BRR();

    MusicQuestionResponseModelIntf BVk();

    String Bog();

    QuestionResponseType Bol();

    Boolean Bs7();

    Boolean Bv1();

    int CBC();

    User CDj();

    QuestionResponseModelIntf EC8(C1DY c1dy);

    QuestionResponseModel F71(C1DY c1dy);

    TreeUpdaterJNI F7o();

    String getId();
}
