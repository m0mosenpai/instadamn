package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC40308HuC;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class StoryPromptParticipationFrictionInfoDictImpl extends C0T6 implements Parcelable, StoryPromptParticipationFrictionInfoDict {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(22);
    public final StoryLinkInfoDict A00;
    public final StoryPromptParticipationFrictionType A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final StoryPromptParticipationFrictionInfoDictImpl F1K() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryPromptParticipationFrictionInfoDictImpl) {
                StoryPromptParticipationFrictionInfoDictImpl storyPromptParticipationFrictionInfoDictImpl = (StoryPromptParticipationFrictionInfoDictImpl) obj;
                if (!C14360o3.A0K(this.A02, storyPromptParticipationFrictionInfoDictImpl.A02) || !C14360o3.A0K(this.A03, storyPromptParticipationFrictionInfoDictImpl.A03) || !C14360o3.A0K(this.A00, storyPromptParticipationFrictionInfoDictImpl.A00) || this.A01 != storyPromptParticipationFrictionInfoDictImpl.A01 || !C14360o3.A0K(this.A04, storyPromptParticipationFrictionInfoDictImpl.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A04);
    }

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final String Ags() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final String Agt() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final /* bridge */ /* synthetic */ StoryLinkInfoDictIntf Agu() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final StoryPromptParticipationFrictionType B8h() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryPromptParticipationFrictionInfoDict", AbstractC40308HuC.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict
    public final String getTitle() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public StoryPromptParticipationFrictionInfoDictImpl(StoryLinkInfoDict storyLinkInfoDict, StoryPromptParticipationFrictionType storyPromptParticipationFrictionType, String str, String str2, String str3) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = storyLinkInfoDict;
        this.A01 = storyPromptParticipationFrictionType;
        this.A04 = str3;
    }
}
