package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31181DnP;
import X.AbstractC37300Gc1;
import X.AbstractC40335Huf;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class StoryTemplateReshareMediaDictImpl extends C0T6 implements Parcelable, StoryTemplateReshareMediaDict {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(31);
    public final Integer A00;
    public final String A01;
    public final String A02;

    @Override // com.instagram.api.schemas.StoryTemplateReshareMediaDict
    public final StoryTemplateReshareMediaDictImpl F2A() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateReshareMediaDictImpl) {
                StoryTemplateReshareMediaDictImpl storyTemplateReshareMediaDictImpl = (StoryTemplateReshareMediaDictImpl) obj;
                if (!C14360o3.A0K(this.A00, storyTemplateReshareMediaDictImpl.A00) || !C14360o3.A0K(this.A01, storyTemplateReshareMediaDictImpl.A01) || !C14360o3.A0K(this.A02, storyTemplateReshareMediaDictImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.StoryTemplateReshareMediaDict
    public final Integer Am9() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryTemplateReshareMediaDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryTemplateReshareMediaDict", AbstractC40335Huf.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryTemplateReshareMediaDict
    public final String getMediaId() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryTemplateReshareMediaDict
    public final String getUserId() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public StoryTemplateReshareMediaDictImpl(String str, Integer num, String str2) {
        this.A00 = num;
        this.A01 = str;
        this.A02 = str2;
    }
}
