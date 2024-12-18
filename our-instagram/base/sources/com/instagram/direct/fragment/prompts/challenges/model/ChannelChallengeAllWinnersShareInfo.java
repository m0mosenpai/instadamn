package com.instagram.direct.fragment.prompts.challenges.model;

import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC31181DnP;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.MessagingOffPlatformShareType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class ChannelChallengeAllWinnersShareInfo implements ChannelChallengeShareInfo {
    public static final Parcelable.Creator CREATOR = new LNM(97);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Co8() {
        return null;
    }

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
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A08);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        Iterator A0u2 = AbstractC25231BEo.A0u(parcel, this.A09);
        while (A0u2.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u2, i);
        }
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A0A));
        parcel.writeString(this.A07);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A03);
    }

    public ChannelChallengeAllWinnersShareInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, int i) {
        AbstractC167017dG.A1Q(str, str3);
        C14360o3.A0B(str10, 14);
        this.A05 = str;
        this.A06 = str2;
        this.A01 = str3;
        this.A0C = str4;
        this.A0D = str5;
        this.A08 = list;
        this.A09 = list2;
        this.A00 = i;
        this.A04 = str6;
        this.A02 = str7;
        this.A0A = num;
        this.A07 = str8;
        this.A0B = str9;
        this.A03 = str10;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final Integer Ada() {
        return this.A0A;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Amu() {
        return this.A01;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Amw() {
        return this.A0B;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Amx() {
        return this.A0C;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Amz() {
        return this.A0D;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Ant() {
        return this.A02;
    }

    @Override // com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo
    public final String Ar1() {
        return this.A01;
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
        return MessagingOffPlatformShareType.A07;
    }
}
