package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ProfileBannerType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProfileBannerType[] A03;
    public static final ProfileBannerType A04;
    public static final ProfileBannerType A05;
    public static final ProfileBannerType A06;
    public static final ProfileBannerType A07;
    public static final ProfileBannerType A08;
    public static final ProfileBannerType A09;
    public static final ProfileBannerType A0A;
    public static final ProfileBannerType A0B;
    public static final ProfileBannerType A0C;
    public static final ProfileBannerType A0D;
    public static final ProfileBannerType A0E;
    public static final ProfileBannerType A0F;
    public static final ProfileBannerType A0G;
    public static final ProfileBannerType A0H;
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
        ProfileBannerType profileBannerType = new ProfileBannerType("UNRECOGNIZED", 0, "ProfileBannerType_unspecified");
        A0F = profileBannerType;
        ProfileBannerType profileBannerType2 = new ProfileBannerType("ADD_SCHOOL", 1, "ADD_SCHOOL");
        A04 = profileBannerType2;
        ProfileBannerType profileBannerType3 = new ProfileBannerType("AI_AGENTS", 2, "AI_AGENTS");
        A05 = profileBannerType3;
        ProfileBannerType profileBannerType4 = new ProfileBannerType("CHANNEL", 3, "CHANNEL");
        A06 = profileBannerType4;
        ProfileBannerType profileBannerType5 = new ProfileBannerType("FACEBOOK_PAGE", 4, "FACEBOOK_PAGE");
        A07 = profileBannerType5;
        ProfileBannerType profileBannerType6 = new ProfileBannerType("FACEBOOK_PROFILE", 5, "FACEBOOK_PROFILE");
        A08 = profileBannerType6;
        ProfileBannerType profileBannerType7 = new ProfileBannerType("FUNDRAISER", 6, "FUNDRAISER");
        A09 = profileBannerType7;
        ProfileBannerType profileBannerType8 = new ProfileBannerType("INVALID", 7, "INVALID");
        A0A = profileBannerType8;
        ProfileBannerType profileBannerType9 = new ProfileBannerType("MUSIC", 8, "MUSIC");
        A0B = profileBannerType9;
        ProfileBannerType profileBannerType10 = new ProfileBannerType("RELATED_ACCOUNTS", 9, "RELATED_ACCOUNTS");
        A0C = profileBannerType10;
        ProfileBannerType profileBannerType11 = new ProfileBannerType("SCHOOL", 10, "SCHOOL");
        A0D = profileBannerType11;
        ProfileBannerType profileBannerType12 = new ProfileBannerType("THREADS", 11, "THREADS");
        A0E = profileBannerType12;
        ProfileBannerType profileBannerType13 = new ProfileBannerType("UPCOMING_EVENTS", 12, "UPCOMING_EVENTS");
        A0G = profileBannerType13;
        ProfileBannerType profileBannerType14 = new ProfileBannerType("WHATSAPP_PROFILE", 13, "WHATSAPP_PROFILE");
        A0H = profileBannerType14;
        ProfileBannerType[] profileBannerTypeArr = {profileBannerType, profileBannerType2, profileBannerType3, profileBannerType4, profileBannerType5, profileBannerType6, profileBannerType7, profileBannerType8, profileBannerType9, profileBannerType10, profileBannerType11, profileBannerType12, profileBannerType13, profileBannerType14};
        A03 = profileBannerTypeArr;
        A02 = AbstractC12190kN.A00(profileBannerTypeArr);
        ProfileBannerType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ProfileBannerType profileBannerType15 : values) {
            linkedHashMap.put(profileBannerType15.A00, profileBannerType15);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(87);
    }

    public static ProfileBannerType valueOf(String str) {
        return (ProfileBannerType) Enum.valueOf(ProfileBannerType.class, str);
    }

    public static ProfileBannerType[] values() {
        return (ProfileBannerType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProfileBannerType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
