package com.instagram.api.schemas;

import X.C1DV;
import X.C1DY;
import X.C69669VtA;
import X.XwN;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes2.dex */
public interface StoryPromptTappableDataIntf extends Parcelable {
    public static final XwN A00 = XwN.A00;

    C69669VtA AKZ();

    StoryPromptDisablementState Ay6();

    ElectionAddYoursInfoDictIntf B0n();

    List B48();

    GenAIToolInfoDictIntf B9Z();

    Boolean BCK();

    User BZk();

    int BbW();

    StoryPromptParticipationFrictionInfoDict BbZ();

    StoryPromptFailureTooltipDictIntf Bif();

    String Bik();

    StoryPromptType Bio();

    String C0j();

    StoryTemplateDictIntf C2N();

    Boolean CQY();

    Boolean CRP();

    Boolean CRs();

    Boolean CV8();

    Boolean CW3();

    Boolean CZt();

    Boolean CaL();

    Boolean CdT();

    Boolean Cds();

    Boolean Ces();

    Boolean Cfw();

    StoryPromptTappableDataIntf EAY(C1DY c1dy);

    StoryPromptTappableData F1L(C1DY c1dy);

    StoryPromptTappableData F1M(C1DV c1dv);

    TreeUpdaterJNI F7o();

    String getBackgroundColor();

    String getId();

    String getMediaId();

    String getText();
}
