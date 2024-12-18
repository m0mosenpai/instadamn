package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FanClubCategoryType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FanClubCategoryType[] A03;
    public static final FanClubCategoryType A04;
    public static final FanClubCategoryType A05;
    public static final FanClubCategoryType A06;
    public static final FanClubCategoryType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        FanClubCategoryType fanClubCategoryType = new FanClubCategoryType("UNRECOGNIZED", 0, "FanClubCategoryType_unspecified");
        A07 = fanClubCategoryType;
        FanClubCategoryType fanClubCategoryType2 = new FanClubCategoryType("LEAST_INTERACTED_WITH", 1, "least_interacted_with");
        A04 = fanClubCategoryType2;
        FanClubCategoryType fanClubCategoryType3 = new FanClubCategoryType("MOST_INTERACTED_WITH", 2, "most_interacted_with");
        A05 = fanClubCategoryType3;
        FanClubCategoryType fanClubCategoryType4 = new FanClubCategoryType("MOST_RECENT", 3, "most_recent");
        A06 = fanClubCategoryType4;
        FanClubCategoryType[] fanClubCategoryTypeArr = {fanClubCategoryType, fanClubCategoryType2, fanClubCategoryType3, fanClubCategoryType4, new FanClubCategoryType("OLDEST", 4, "oldest")};
        A03 = fanClubCategoryTypeArr;
        A02 = AbstractC12190kN.A00(fanClubCategoryTypeArr);
        FanClubCategoryType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (FanClubCategoryType fanClubCategoryType5 : values) {
            A18.put(fanClubCategoryType5.A00, fanClubCategoryType5);
        }
        A01 = A18;
        CREATOR = new C41854Ig8(79);
    }

    public static FanClubCategoryType valueOf(String str) {
        return (FanClubCategoryType) Enum.valueOf(FanClubCategoryType.class, str);
    }

    public static FanClubCategoryType[] values() {
        return (FanClubCategoryType[]) A03.clone();
    }

    public FanClubCategoryType(String str, int i, String str2) {
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
