package com.instagram.api.schemas;

import X.AbstractC40331Hub;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.IMW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class StoryTemplateDict extends C0T6 implements StoryTemplateDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(20);
    public final StoryTemplateAssetDict A00;
    public final StoryTemplateFillableStickersDict A01;
    public final StoryTemplateMusicStickerDict A02;
    public final StoryTemplateReshareMediaDict A03;
    public final Boolean A04;
    public final Boolean A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final List A09;

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final StoryTemplateDict F22() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateDict) {
                StoryTemplateDict storyTemplateDict = (StoryTemplateDict) obj;
                if (!C14360o3.A0K(this.A01, storyTemplateDict.A01) || !C14360o3.A0K(this.A04, storyTemplateDict.A04) || !C14360o3.A0K(this.A05, storyTemplateDict.A05) || !C14360o3.A0K(this.A02, storyTemplateDict.A02) || !C14360o3.A0K(this.A03, storyTemplateDict.A03) || !C14360o3.A0K(this.A06, storyTemplateDict.A06) || !C14360o3.A0K(this.A07, storyTemplateDict.A07) || !C14360o3.A0K(this.A08, storyTemplateDict.A08) || !C14360o3.A0K(this.A00, storyTemplateDict.A00) || !C14360o3.A0K(this.A09, storyTemplateDict.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        StoryTemplateFillableStickersDict storyTemplateFillableStickersDict = this.A01;
        int hashCode = (storyTemplateFillableStickersDict == null ? 0 : storyTemplateFillableStickersDict.hashCode()) * 31;
        Boolean bool = this.A04;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A05;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        StoryTemplateMusicStickerDict storyTemplateMusicStickerDict = this.A02;
        int hashCode4 = (hashCode3 + (storyTemplateMusicStickerDict == null ? 0 : storyTemplateMusicStickerDict.hashCode())) * 31;
        StoryTemplateReshareMediaDict storyTemplateReshareMediaDict = this.A03;
        int hashCode5 = (hashCode4 + (storyTemplateReshareMediaDict == null ? 0 : storyTemplateReshareMediaDict.hashCode())) * 31;
        List list = this.A06;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A07;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A08;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        StoryTemplateAssetDict storyTemplateAssetDict = this.A00;
        int hashCode9 = (hashCode8 + (storyTemplateAssetDict == null ? 0 : storyTemplateAssetDict.hashCode())) * 31;
        List list4 = this.A09;
        return hashCode9 + (list4 != null ? list4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        Boolean bool = this.A04;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A05;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        List list = this.A06;
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
        List list2 = this.A07;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable((Parcelable) it2.next(), i);
            }
        }
        List list3 = this.A08;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                parcel.writeParcelable((Parcelable) it3.next(), i);
            }
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeStringList(this.A09);
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final /* bridge */ /* synthetic */ IMW AKb() {
        return new IMW(this);
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final StoryTemplateFillableStickersDict B6N() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final /* bridge */ /* synthetic */ StoryTemplateMusicStickerDictIntf BVo() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final StoryTemplateReshareMediaDict BoP() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final List C1C() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final List C1H() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final List C2J() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final /* bridge */ /* synthetic */ StoryTemplateAssetDictIntf C5d() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final List C5k() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final Boolean CTR() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final Boolean CVB() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateDict", AbstractC40331Hub.A00(this));
    }

    public StoryTemplateDict(StoryTemplateAssetDict storyTemplateAssetDict, StoryTemplateFillableStickersDict storyTemplateFillableStickersDict, StoryTemplateMusicStickerDict storyTemplateMusicStickerDict, StoryTemplateReshareMediaDict storyTemplateReshareMediaDict, Boolean bool, Boolean bool2, List list, List list2, List list3, List list4) {
        this.A01 = storyTemplateFillableStickersDict;
        this.A04 = bool;
        this.A05 = bool2;
        this.A02 = storyTemplateMusicStickerDict;
        this.A03 = storyTemplateReshareMediaDict;
        this.A06 = list;
        this.A07 = list2;
        this.A08 = list3;
        this.A00 = storyTemplateAssetDict;
        this.A09 = list4;
    }
}
