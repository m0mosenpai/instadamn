package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40308HuC;
import X.C17T;
import X.C39307HXy;
import X.JBZ;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryPromptParticipationFrictionInfoDict extends C17T implements StoryPromptParticipationFrictionInfoDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(89);

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final StoryLinkInfoDictIntf Agu() {
        return (StoryLinkInfoDictIntf) A05(-339885788, ImmutablePandoStoryLinkInfoDict.class);
    }

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final StoryPromptParticipationFrictionType B8h() {
        return (StoryPromptParticipationFrictionType) A0N(2061241695, JBZ.A00);
    }

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40308HuC.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final String Ags() {
        return A0i(-1383701292);
    }

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final String Agt() {
        return A0i(-1383701291);
    }

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final StoryPromptParticipationFrictionInfoDictImpl F1K() {
        StoryLinkInfoDict storyLinkInfoDict;
        String A0i = A0i(-1383701292);
        String A0i2 = A0i(-1383701291);
        StoryLinkInfoDictIntf Agu = Agu();
        if (Agu != null) {
            storyLinkInfoDict = Agu.F0p();
        } else {
            storyLinkInfoDict = null;
        }
        return new StoryPromptParticipationFrictionInfoDictImpl(storyLinkInfoDict, B8h(), A0i, A0i2, A0Y());
    }

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final String getTitle() {
        return A0Y();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
