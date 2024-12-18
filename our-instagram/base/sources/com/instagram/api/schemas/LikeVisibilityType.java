package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class LikeVisibilityType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ LikeVisibilityType[] A03;
    public static final LikeVisibilityType A04;
    public static final LikeVisibilityType A05;
    public static final LikeVisibilityType A06;
    public static final LikeVisibilityType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        LikeVisibilityType likeVisibilityType = new LikeVisibilityType("UNRECOGNIZED", 0, "LikeVisibilityType_unspecified");
        A07 = likeVisibilityType;
        LikeVisibilityType likeVisibilityType2 = new LikeVisibilityType("CLOSE_FRIENDS", 1, "CLOSE_FRIENDS");
        A04 = likeVisibilityType2;
        LikeVisibilityType likeVisibilityType3 = new LikeVisibilityType("EVERYONE", 2, "EVERYONE");
        A05 = likeVisibilityType3;
        LikeVisibilityType likeVisibilityType4 = new LikeVisibilityType("FOLLOWERS", 3, "FOLLOWERS");
        A06 = likeVisibilityType4;
        LikeVisibilityType[] likeVisibilityTypeArr = {likeVisibilityType, likeVisibilityType2, likeVisibilityType3, likeVisibilityType4, new LikeVisibilityType("NOBODY", 4, "NOBODY")};
        A03 = likeVisibilityTypeArr;
        A02 = AbstractC12190kN.A00(likeVisibilityTypeArr);
        LikeVisibilityType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (LikeVisibilityType likeVisibilityType5 : values) {
            A18.put(likeVisibilityType5.A00, likeVisibilityType5);
        }
        A01 = A18;
        CREATOR = new C41858IgC(66);
    }

    public static LikeVisibilityType valueOf(String str) {
        return (LikeVisibilityType) Enum.valueOf(LikeVisibilityType.class, str);
    }

    public static LikeVisibilityType[] values() {
        return (LikeVisibilityType[]) A03.clone();
    }

    public LikeVisibilityType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
