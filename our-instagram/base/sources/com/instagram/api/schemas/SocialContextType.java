package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SocialContextType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ SocialContextType[] A03;
    public static final SocialContextType A04;
    public static final SocialContextType A05;
    public static final SocialContextType A06;
    public static final SocialContextType A07;
    public static final SocialContextType A08;
    public static final SocialContextType A09;
    public static final SocialContextType A0A;
    public static final SocialContextType A0B;
    public static final SocialContextType A0C;
    public static final SocialContextType A0D;
    public static final SocialContextType A0E;
    public static final SocialContextType A0F;
    public static final SocialContextType A0G;
    public static final SocialContextType A0H;
    public static final SocialContextType A0I;
    public static final SocialContextType A0J;
    public static final SocialContextType A0K;
    public static final SocialContextType A0L;
    public static final SocialContextType A0M;
    public static final SocialContextType A0N;
    public static final SocialContextType A0O;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        SocialContextType socialContextType = new SocialContextType("UNRECOGNIZED", 0, "SocialContextType_unspecified");
        A0N = socialContextType;
        SocialContextType socialContextType2 = new SocialContextType("BLEND_MEDIA_SUGGESTED_BY", 1, "blend_media_suggested_by");
        A04 = socialContextType2;
        SocialContextType socialContextType3 = new SocialContextType("COMMENT_REACTION", 2, "comment_reaction");
        A06 = socialContextType3;
        SocialContextType socialContextType4 = new SocialContextType("COMMENTED_BY", 3, "commented_by");
        A05 = socialContextType4;
        SocialContextType socialContextType5 = new SocialContextType("EFFECT_USED_BY_FRIENDS", 4, "effect_used_by_friends");
        A07 = socialContextType5;
        SocialContextType socialContextType6 = new SocialContextType("EFFECT_USED_BY_PEOPLE", 5, "effect_used_by_people");
        A08 = socialContextType6;
        SocialContextType socialContextType7 = new SocialContextType("EFFECT_USED_TIMES", 6, "effect_used_times");
        A09 = socialContextType7;
        SocialContextType socialContextType8 = new SocialContextType("FOLLOWED_BY", 7, "followed_by");
        A0A = socialContextType8;
        SocialContextType socialContextType9 = new SocialContextType("FOLLOWER_COUNT", 8, "follower_count");
        A0B = socialContextType9;
        SocialContextType socialContextType10 = new SocialContextType("LIKED_BY", 9, "liked_by");
        A0C = socialContextType10;
        SocialContextType socialContextType11 = new SocialContextType("PROMPT_USED_BY_PEOPLE", 10, "prompt_used_by_people");
        A0D = socialContextType11;
        SocialContextType socialContextType12 = new SocialContextType("REEL_EXTERNAL_SHARE", 11, "reel_external_share");
        A0E = socialContextType12;
        SocialContextType socialContextType13 = new SocialContextType("REMIXED_ORIGINAL_USED_TIMES", 12, "remix_original_used_times");
        A0H = socialContextType13;
        SocialContextType socialContextType14 = new SocialContextType("REMIXED_BY_FRIENDS", 13, "remixed_by_friends");
        A0F = socialContextType14;
        SocialContextType socialContextType15 = new SocialContextType("REMIXED_BY_PEOPLE", 14, "remixed_by_people");
        A0G = socialContextType15;
        SocialContextType socialContextType16 = new SocialContextType("SPOTLIGHT", 15, "spotlight");
        A0I = socialContextType16;
        SocialContextType socialContextType17 = new SocialContextType("TEMPLATE_USED_BY_FRIENDS", 16, "template_used_by_friends");
        A0J = socialContextType17;
        SocialContextType socialContextType18 = new SocialContextType("TEMPLATE_USED_BY_PEOPLE", 17, "template_used_by_people");
        A0K = socialContextType18;
        SocialContextType socialContextType19 = new SocialContextType("TEMPLATE_USED_TIMES", 18, "template_used_times");
        A0L = socialContextType19;
        SocialContextType socialContextType20 = new SocialContextType("TRENDING_LOCATION", 19, "trending_location");
        A0M = socialContextType20;
        SocialContextType socialContextType21 = new SocialContextType("VOTED_ON_BY", 20, "voted_on_by");
        A0O = socialContextType21;
        SocialContextType[] socialContextTypeArr = {socialContextType, socialContextType2, socialContextType3, socialContextType4, socialContextType5, socialContextType6, socialContextType7, socialContextType8, socialContextType9, socialContextType10, socialContextType11, socialContextType12, socialContextType13, socialContextType14, socialContextType15, socialContextType16, socialContextType17, socialContextType18, socialContextType19, socialContextType20, socialContextType21};
        A03 = socialContextTypeArr;
        A02 = AbstractC12190kN.A00(socialContextTypeArr);
        SocialContextType[] values = values();
        int A0L2 = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L2 < 16 ? 16 : A0L2);
        for (SocialContextType socialContextType22 : values) {
            linkedHashMap.put(socialContextType22.A00, socialContextType22);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(8);
    }

    public static SocialContextType valueOf(String str) {
        return (SocialContextType) Enum.valueOf(SocialContextType.class, str);
    }

    public static SocialContextType[] values() {
        return (SocialContextType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public SocialContextType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
