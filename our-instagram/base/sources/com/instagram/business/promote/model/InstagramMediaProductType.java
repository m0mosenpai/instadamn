package com.instagram.business.promote.model;

import X.AbstractC12190kN;
import X.C70220WId;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class InstagramMediaProductType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ InstagramMediaProductType[] A01;
    public static final InstagramMediaProductType A02;
    public static final InstagramMediaProductType A03;
    public static final InstagramMediaProductType A04;
    public static final InstagramMediaProductType A05;
    public static final InstagramMediaProductType A06;
    public static final InstagramMediaProductType A07;
    public static final InstagramMediaProductType A08;
    public static final InstagramMediaProductType A09;
    public static final InstagramMediaProductType A0A;
    public static final InstagramMediaProductType A0B;
    public static final InstagramMediaProductType A0C;
    public static final InstagramMediaProductType A0D;
    public static final InstagramMediaProductType A0E;
    public static final InstagramMediaProductType A0F;
    public static final InstagramMediaProductType A0G;
    public static final InstagramMediaProductType A0H;
    public static final InstagramMediaProductType A0I;
    public static final InstagramMediaProductType A0J;
    public static final InstagramMediaProductType A0K;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        InstagramMediaProductType instagramMediaProductType = new InstagramMediaProductType("DEFAULT_DO_NOT_USE", 0);
        A08 = instagramMediaProductType;
        InstagramMediaProductType instagramMediaProductType2 = new InstagramMediaProductType("AD", 1);
        A02 = instagramMediaProductType2;
        InstagramMediaProductType instagramMediaProductType3 = new InstagramMediaProductType("AR_EFFECT_PREVIEW", 2);
        A03 = instagramMediaProductType3;
        InstagramMediaProductType instagramMediaProductType4 = new InstagramMediaProductType("CAROUSEL_CONTAINER", 3);
        A04 = instagramMediaProductType4;
        InstagramMediaProductType instagramMediaProductType5 = new InstagramMediaProductType("CAROUSEL_ITEM", 4);
        A05 = instagramMediaProductType5;
        InstagramMediaProductType instagramMediaProductType6 = new InstagramMediaProductType("CLIPS", 5);
        A06 = instagramMediaProductType6;
        InstagramMediaProductType instagramMediaProductType7 = new InstagramMediaProductType("COWATCH_LOCAL", 6);
        A07 = instagramMediaProductType7;
        InstagramMediaProductType instagramMediaProductType8 = new InstagramMediaProductType("DIRECT_PERMANENT", 7);
        A0B = instagramMediaProductType8;
        InstagramMediaProductType instagramMediaProductType9 = new InstagramMediaProductType("FEED", 8);
        A0C = instagramMediaProductType9;
        InstagramMediaProductType instagramMediaProductType10 = new InstagramMediaProductType("FUNDRAISER_COVER", 9);
        A0D = instagramMediaProductType10;
        InstagramMediaProductType instagramMediaProductType11 = new InstagramMediaProductType("DIRECT", 10);
        A09 = instagramMediaProductType11;
        InstagramMediaProductType instagramMediaProductType12 = new InstagramMediaProductType("DIRECT_AUDIO", 11);
        A0A = instagramMediaProductType12;
        InstagramMediaProductType instagramMediaProductType13 = new InstagramMediaProductType("GUIDE_MEDIA_FACADE", 12);
        A0E = instagramMediaProductType13;
        InstagramMediaProductType instagramMediaProductType14 = new InstagramMediaProductType("IGTV", 13);
        A0F = instagramMediaProductType14;
        InstagramMediaProductType instagramMediaProductType15 = new InstagramMediaProductType("LIVE", 14);
        A0G = instagramMediaProductType15;
        InstagramMediaProductType instagramMediaProductType16 = new InstagramMediaProductType("NAMETAG", 15);
        A0H = instagramMediaProductType16;
        InstagramMediaProductType instagramMediaProductType17 = new InstagramMediaProductType("PROFILE_PIC", 16);
        A0I = instagramMediaProductType17;
        InstagramMediaProductType instagramMediaProductType18 = new InstagramMediaProductType("SELFIE_STICKER", 17);
        A0J = instagramMediaProductType18;
        InstagramMediaProductType instagramMediaProductType19 = new InstagramMediaProductType("STORY", 18);
        A0K = instagramMediaProductType19;
        InstagramMediaProductType[] instagramMediaProductTypeArr = {instagramMediaProductType, instagramMediaProductType2, instagramMediaProductType3, instagramMediaProductType4, instagramMediaProductType5, instagramMediaProductType6, instagramMediaProductType7, instagramMediaProductType8, instagramMediaProductType9, instagramMediaProductType10, instagramMediaProductType11, instagramMediaProductType12, instagramMediaProductType13, instagramMediaProductType14, instagramMediaProductType15, instagramMediaProductType16, instagramMediaProductType17, instagramMediaProductType18, instagramMediaProductType19, new InstagramMediaProductType("VIDEO_REACTION", 19)};
        A01 = instagramMediaProductTypeArr;
        A00 = AbstractC12190kN.A00(instagramMediaProductTypeArr);
        CREATOR = new C70220WId(55);
    }

    public static InstagramMediaProductType valueOf(String str) {
        return (InstagramMediaProductType) Enum.valueOf(InstagramMediaProductType.class, str);
    }

    public static InstagramMediaProductType[] values() {
        return (InstagramMediaProductType[]) A01.clone();
    }

    public InstagramMediaProductType(String str, int i) {
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
