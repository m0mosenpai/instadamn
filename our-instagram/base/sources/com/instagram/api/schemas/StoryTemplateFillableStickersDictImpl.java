package com.instagram.api.schemas;

import X.AbstractC40333Hud;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class StoryTemplateFillableStickersDictImpl extends C0T6 implements Parcelable, StoryTemplateFillableStickersDict {
    public static final Parcelable.Creator CREATOR = new C206139Av(21);
    public final StoryTemplateFillableMusicStickerDict A00;
    public final List A01;

    @Override // com.instagram.api.schemas.StoryTemplateFillableStickersDict
    public final StoryTemplateFillableStickersDictImpl F25() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateFillableStickersDictImpl) {
                StoryTemplateFillableStickersDictImpl storyTemplateFillableStickersDictImpl = (StoryTemplateFillableStickersDictImpl) obj;
                if (!C14360o3.A0K(this.A01, storyTemplateFillableStickersDictImpl.A01) || !C14360o3.A0K(this.A00, storyTemplateFillableStickersDictImpl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A01;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        StoryTemplateFillableMusicStickerDict storyTemplateFillableMusicStickerDict = this.A00;
        return hashCode + (storyTemplateFillableMusicStickerDict != null ? storyTemplateFillableMusicStickerDict.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableStickersDict
    public final List B6L() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableStickersDict
    public final StoryTemplateFillableMusicStickerDict B6M() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryTemplateFillableStickersDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateFillableStickersDict", AbstractC40333Hud.A00(this));
    }

    public StoryTemplateFillableStickersDictImpl(StoryTemplateFillableMusicStickerDict storyTemplateFillableMusicStickerDict, List list) {
        this.A01 = list;
        this.A00 = storyTemplateFillableMusicStickerDict;
    }
}
