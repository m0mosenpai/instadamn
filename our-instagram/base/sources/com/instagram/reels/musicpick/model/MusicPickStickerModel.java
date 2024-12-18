package com.instagram.reels.musicpick.model;

import X.AbstractC109304vw;
import X.AbstractC111324zv;
import X.AbstractC148296lz;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC40302Hu6;
import X.C05F;
import X.C14360o3;
import X.C148276lx;
import X.C16930sl;
import X.C37324GcR;
import X.C5NG;
import X.C5NL;
import X.EnumC150226pU;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.api.schemas.TrackData;
import java.util.List;

/* loaded from: classes4.dex */
public final class MusicPickStickerModel implements Parcelable, C5NL {
    public static final Parcelable.Creator CREATOR = new C37324GcR(29);
    public StoryMusicPickTappableData A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public MusicPickStickerModel(List list) {
        this(new StoryMusicPickTappableData(null, AbstractC109304vw.A00(String.valueOf(0)), new StoryTemplateAssetDict(null, null, null, null, null, null, null, null), null, "", "", "", null, list, 0));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final MusicPickStickerModel A00() {
        StoryMusicPickTappableData storyMusicPickTappableData = this.A00;
        TrackData trackData = storyMusicPickTappableData.A04;
        String str = storyMusicPickTappableData.A05;
        StoryPromptDisablementState storyPromptDisablementState = storyMusicPickTappableData.A02;
        List list = storyMusicPickTappableData.A09;
        String str2 = storyMusicPickTappableData.A06;
        String str3 = storyMusicPickTappableData.A07;
        OriginalSoundData originalSoundData = storyMusicPickTappableData.A01;
        int i = storyMusicPickTappableData.A00;
        return new MusicPickStickerModel(AbstractC40302Hu6.A00(originalSoundData, storyPromptDisablementState, storyMusicPickTappableData.A03, trackData, str, str2, str3, storyMusicPickTappableData.A08, list, i));
    }

    public final void A01(OriginalSoundData originalSoundData) {
        StoryMusicPickTappableData storyMusicPickTappableData = this.A00;
        TrackData trackData = storyMusicPickTappableData.A04;
        String str = storyMusicPickTappableData.A05;
        StoryPromptDisablementState storyPromptDisablementState = storyMusicPickTappableData.A02;
        List list = storyMusicPickTappableData.A09;
        String str2 = storyMusicPickTappableData.A06;
        String str3 = storyMusicPickTappableData.A07;
        int i = storyMusicPickTappableData.A00;
        this.A00 = AbstractC40302Hu6.A00(originalSoundData, storyPromptDisablementState, storyMusicPickTappableData.A03, trackData, str, str2, str3, storyMusicPickTappableData.A08, list, i);
    }

    public final void A02(TrackData trackData) {
        StoryMusicPickTappableData storyMusicPickTappableData = this.A00;
        String str = storyMusicPickTappableData.A05;
        StoryPromptDisablementState storyPromptDisablementState = storyMusicPickTappableData.A02;
        List list = storyMusicPickTappableData.A09;
        String str2 = storyMusicPickTappableData.A06;
        String str3 = storyMusicPickTappableData.A07;
        OriginalSoundData originalSoundData = storyMusicPickTappableData.A01;
        int i = storyMusicPickTappableData.A00;
        this.A00 = AbstractC40302Hu6.A00(originalSoundData, storyPromptDisablementState, storyMusicPickTappableData.A03, trackData, str, str2, str3, storyMusicPickTappableData.A08, list, i);
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A10;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG A0V = AbstractC167007dF.A0V();
        C148276lx c148276lx = C148276lx.A0a;
        AbstractC166987dD.A1V(AbstractC148296lz.A06(EnumC150226pU.A1A, AbstractC111324zv.A00(5059)), A0V);
        return A0V;
    }

    public MusicPickStickerModel(StoryMusicPickTappableData storyMusicPickTappableData) {
        C14360o3.A0B(storyMusicPickTappableData, 1);
        this.A00 = storyMusicPickTappableData;
        this.A01 = AbstractC167007dF.A1X(storyMusicPickTappableData.A02, StoryPromptDisablementState.A04) ? 1 : 0;
        this.A02 = storyMusicPickTappableData.A06;
        String str = storyMusicPickTappableData.A07;
        this.A03 = str == null ? "" : str;
    }

    public MusicPickStickerModel() {
        this(C16930sl.A00);
    }
}
