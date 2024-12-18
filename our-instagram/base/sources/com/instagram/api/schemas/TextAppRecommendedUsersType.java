package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class TextAppRecommendedUsersType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextAppRecommendedUsersType[] A03;
    public static final TextAppRecommendedUsersType A04;
    public static final TextAppRecommendedUsersType A05;
    public static final TextAppRecommendedUsersType A06;
    public static final TextAppRecommendedUsersType A07;
    public static final TextAppRecommendedUsersType A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TextAppRecommendedUsersType textAppRecommendedUsersType = new TextAppRecommendedUsersType("UNRECOGNIZED", 0, "TextAppRecommendedUsersType_unspecified");
        A08 = textAppRecommendedUsersType;
        TextAppRecommendedUsersType textAppRecommendedUsersType2 = new TextAppRecommendedUsersType("GREAT_ACCOUNTS", 1, "great_accounts");
        A04 = textAppRecommendedUsersType2;
        TextAppRecommendedUsersType textAppRecommendedUsersType3 = new TextAppRecommendedUsersType("PROFILE_CHAINING_RECOMMENDED_USERS", 2, "profile_chaining_recommended_users");
        A05 = textAppRecommendedUsersType3;
        TextAppRecommendedUsersType textAppRecommendedUsersType4 = new TextAppRecommendedUsersType("RECOMMENDED_USERS", 3, "recommended_users");
        A06 = textAppRecommendedUsersType4;
        TextAppRecommendedUsersType textAppRecommendedUsersType5 = new TextAppRecommendedUsersType("UNRECIPROCATED_RECOMMENDED_USERS", 4, "unreciprocated_recommended_users");
        A07 = textAppRecommendedUsersType5;
        TextAppRecommendedUsersType[] textAppRecommendedUsersTypeArr = {textAppRecommendedUsersType, textAppRecommendedUsersType2, textAppRecommendedUsersType3, textAppRecommendedUsersType4, textAppRecommendedUsersType5, new TextAppRecommendedUsersType("VERTICAL_ACTIVATION", 5, "vertical_activation")};
        A03 = textAppRecommendedUsersTypeArr;
        A02 = AbstractC12190kN.A00(textAppRecommendedUsersTypeArr);
        TextAppRecommendedUsersType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TextAppRecommendedUsersType textAppRecommendedUsersType6 : values) {
            A18.put(textAppRecommendedUsersType6.A00, textAppRecommendedUsersType6);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(50);
    }

    public static TextAppRecommendedUsersType valueOf(String str) {
        return (TextAppRecommendedUsersType) Enum.valueOf(TextAppRecommendedUsersType.class, str);
    }

    public static TextAppRecommendedUsersType[] values() {
        return (TextAppRecommendedUsersType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextAppRecommendedUsersType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
