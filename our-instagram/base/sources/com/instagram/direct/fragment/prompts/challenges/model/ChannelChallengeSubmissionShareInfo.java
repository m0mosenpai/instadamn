package com.instagram.direct.fragment.prompts.challenges.model;

import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC31181DnP;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.MessagingOffPlatformShareType;
import com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel;

/* loaded from: classes6.dex */
public final class ChannelChallengeSubmissionShareInfo implements ChannelChallengeShareInfo {
    public static final Parcelable.Creator CREATOR = new LNL(0);
    public final ChannelChallengeStickerWinnerModel A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A08));
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A03);
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Ar1() {
        String str = this.A00.A02;
        if (str == null) {
            return this.A01;
        }
        return str;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Co8() {
        return this.A00.A02;
    }

    public ChannelChallengeSubmissionShareInfo(ChannelChallengeStickerWinnerModel channelChallengeStickerWinnerModel, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AbstractC167017dG.A1Q(str, str3);
        AbstractC25229BEm.A1L(channelChallengeStickerWinnerModel, 6, str10);
        this.A05 = str;
        this.A06 = str2;
        this.A01 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A00 = channelChallengeStickerWinnerModel;
        this.A04 = str6;
        this.A02 = str7;
        this.A08 = num;
        this.A07 = str8;
        this.A09 = str9;
        this.A03 = str10;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final Integer Ada() {
        return this.A08;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Amu() {
        return this.A01;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Amw() {
        return this.A09;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Amx() {
        return this.A0A;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Amz() {
        return this.A0B;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Ant() {
        return this.A02;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String B2U() {
        return this.A03;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String BSw() {
        return this.A04;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String C7I() {
        return this.A05;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String C7q() {
        return this.A06;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String CE7() {
        return this.A07;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final MessagingOffPlatformShareType F7i() {
        return MessagingOffPlatformShareType.A06;
    }
}