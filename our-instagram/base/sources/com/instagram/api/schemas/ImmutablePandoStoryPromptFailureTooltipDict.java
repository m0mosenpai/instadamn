package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40307HuB;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryPromptFailureTooltipDict extends C17T implements StoryPromptFailureTooltipDictIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(88);

    @Override // com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40307HuB.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf
    public final String B2Z() {
        return A0i(-1392639055);
    }

    @Override // com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf
    public final String B2a() {
        return A0i(-205678039);
    }

    @Override // com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf
    public final StoryPromptFailureTooltipDict F1J() {
        return new StoryPromptFailureTooltipDict(A0i(-1392639055), A0i(-205678039));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
