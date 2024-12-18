package com.instagram.api.schemas;

import X.AbstractC40307HuB;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class StoryPromptFailureTooltipDict extends C0T6 implements Parcelable, StoryPromptFailureTooltipDictIntf {
    public static final Parcelable.Creator CREATOR = new C206139Av(15);
    public final String A00;
    public final String A01;

    @Override // com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf
    public final StoryPromptFailureTooltipDict F1J() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryPromptFailureTooltipDict) {
                StoryPromptFailureTooltipDict storyPromptFailureTooltipDict = (StoryPromptFailureTooltipDict) obj;
                if (!C14360o3.A0K(this.A00, storyPromptFailureTooltipDict.A00) || !C14360o3.A0K(this.A01, storyPromptFailureTooltipDict.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf
    public final String B2Z() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf
    public final String B2a() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryPromptFailureTooltipDict", AbstractC40307HuB.A00(this));
    }

    public StoryPromptFailureTooltipDict(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
