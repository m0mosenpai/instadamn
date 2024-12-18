package com.instagram.reels.question.model;

import X.C1DV;
import X.C1DY;
import X.C41547IZw;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public interface QuestionResponsesModelIntf extends Parcelable {
    public static final C41547IZw A00 = C41547IZw.A00;

    Long BMC();

    String BPp();

    boolean BUt();

    User BjR();

    String BjV();

    int Bja();

    QuestionStickerType Bjf();

    List Boe();

    int CCJ();

    QuestionResponsesModelIntf EC9(C1DY c1dy);

    QuestionResponsesModel F72(C1DY c1dy);

    QuestionResponsesModel F73(C1DV c1dv);

    TreeUpdaterJNI F7o();

    String getBackgroundColor();

    String getQuestion();

    String getTextColor();
}
