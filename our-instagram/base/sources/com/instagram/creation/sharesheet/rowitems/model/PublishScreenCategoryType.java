package com.instagram.creation.sharesheet.rowitems.model;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class PublishScreenCategoryType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PublishScreenCategoryType[] A01;
    public static final PublishScreenCategoryType A02;
    public static final PublishScreenCategoryType A03;
    public static final PublishScreenCategoryType A04;
    public static final PublishScreenCategoryType A05;
    public static final PublishScreenCategoryType A06;
    public static final PublishScreenCategoryType A07;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PublishScreenCategoryType publishScreenCategoryType = new PublishScreenCategoryType("MAIN", 0);
        A06 = publishScreenCategoryType;
        PublishScreenCategoryType publishScreenCategoryType2 = new PublishScreenCategoryType("AUDIENCE_AND_DISTRIBUTION", 1);
        A03 = publishScreenCategoryType2;
        PublishScreenCategoryType publishScreenCategoryType3 = new PublishScreenCategoryType("ADS_AND_MONETIZATION", 2);
        A02 = publishScreenCategoryType3;
        PublishScreenCategoryType publishScreenCategoryType4 = new PublishScreenCategoryType("MORE", 3);
        A07 = publishScreenCategoryType4;
        PublishScreenCategoryType publishScreenCategoryType5 = new PublishScreenCategoryType("INTERNAL_TEST", 4);
        A05 = publishScreenCategoryType5;
        PublishScreenCategoryType publishScreenCategoryType6 = new PublishScreenCategoryType("CROSSPOST", 5);
        A04 = publishScreenCategoryType6;
        PublishScreenCategoryType[] publishScreenCategoryTypeArr = {publishScreenCategoryType, publishScreenCategoryType2, publishScreenCategoryType3, publishScreenCategoryType4, publishScreenCategoryType5, publishScreenCategoryType6};
        A01 = publishScreenCategoryTypeArr;
        A00 = AbstractC12190kN.A00(publishScreenCategoryTypeArr);
        CREATOR = new LNM(78);
    }

    public static PublishScreenCategoryType valueOf(String str) {
        return (PublishScreenCategoryType) Enum.valueOf(PublishScreenCategoryType.class, str);
    }

    public static PublishScreenCategoryType[] values() {
        return (PublishScreenCategoryType[]) A01.clone();
    }

    public PublishScreenCategoryType(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
