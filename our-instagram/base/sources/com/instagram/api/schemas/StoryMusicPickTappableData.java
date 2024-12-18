package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC25234BEr;
import X.AbstractC37300Gc1;
import X.AbstractC40301Hu5;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class StoryMusicPickTappableData extends C0T6 implements Parcelable, StoryMusicPickTappableDataIntf {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(20);
    public final int A00;
    public final OriginalSoundData A01;
    public final StoryPromptDisablementState A02;
    public final StoryTemplateAssetDict A03;
    public final TrackData A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final StoryMusicPickTappableData F0z(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final StoryMusicPickTappableData F10(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryMusicPickTappableData) {
                StoryMusicPickTappableData storyMusicPickTappableData = (StoryMusicPickTappableData) obj;
                if (!C14360o3.A0K(this.A04, storyMusicPickTappableData.A04) || !C14360o3.A0K(this.A05, storyMusicPickTappableData.A05) || this.A02 != storyMusicPickTappableData.A02 || !C14360o3.A0K(this.A09, storyMusicPickTappableData.A09) || !C14360o3.A0K(this.A06, storyMusicPickTappableData.A06) || !C14360o3.A0K(this.A07, storyMusicPickTappableData.A07) || !C14360o3.A0K(this.A01, storyMusicPickTappableData.A01) || this.A00 != storyMusicPickTappableData.A00 || !C14360o3.A0K(this.A08, storyMusicPickTappableData.A08) || !C14360o3.A0K(this.A03, storyMusicPickTappableData.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A02, i);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A09);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A03, i);
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final TrackData Adc() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final String AeC() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final StoryPromptDisablementState Ay6() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final List B48() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final /* bridge */ /* synthetic */ OriginalSoundDataIntf BZw() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final int BbW() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final String Bfc() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final /* bridge */ /* synthetic */ StoryTemplateAssetDictIntf C5d() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryMusicPickTappableData", AbstractC40301Hu5.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final String getId() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final String getMediaId() {
        return this.A07;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, (((((AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A05, AbstractC167017dG.A0M(this.A04) * 31))))) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31) + AbstractC25227BEk.A07(this.A08)) * 31);
    }

    public StoryMusicPickTappableData(OriginalSoundData originalSoundData, StoryPromptDisablementState storyPromptDisablementState, StoryTemplateAssetDict storyTemplateAssetDict, TrackData trackData, String str, String str2, String str3, String str4, List list, int i) {
        AbstractC25234BEr.A1R(str, storyPromptDisablementState, list, str2, str3);
        C14360o3.A0B(storyTemplateAssetDict, 10);
        this.A04 = trackData;
        this.A05 = str;
        this.A02 = storyPromptDisablementState;
        this.A09 = list;
        this.A06 = str2;
        this.A07 = str3;
        this.A01 = originalSoundData;
        this.A00 = i;
        this.A08 = str4;
        this.A03 = storyTemplateAssetDict;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final StoryMusicPickTappableDataIntf EAP(C1DY c1dy) {
        return this;
    }
}
