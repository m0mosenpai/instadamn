package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class NonprofitSelectorSurfaceEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ NonprofitSelectorSurfaceEnum[] A03;
    public static final NonprofitSelectorSurfaceEnum A04;
    public static final NonprofitSelectorSurfaceEnum A05;
    public static final NonprofitSelectorSurfaceEnum A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        NonprofitSelectorSurfaceEnum nonprofitSelectorSurfaceEnum = new NonprofitSelectorSurfaceEnum("UNRECOGNIZED", 0, "NonprofitSelectorSurfaceEnum_unspecified");
        A06 = nonprofitSelectorSurfaceEnum;
        NonprofitSelectorSurfaceEnum nonprofitSelectorSurfaceEnum2 = new NonprofitSelectorSurfaceEnum("LIVE", 1, "LIVE");
        A04 = nonprofitSelectorSurfaceEnum2;
        NonprofitSelectorSurfaceEnum nonprofitSelectorSurfaceEnum3 = new NonprofitSelectorSurfaceEnum("STORY", 2, "STORY");
        A05 = nonprofitSelectorSurfaceEnum3;
        NonprofitSelectorSurfaceEnum[] nonprofitSelectorSurfaceEnumArr = {nonprofitSelectorSurfaceEnum, nonprofitSelectorSurfaceEnum2, nonprofitSelectorSurfaceEnum3};
        A03 = nonprofitSelectorSurfaceEnumArr;
        A02 = AbstractC12190kN.A00(nonprofitSelectorSurfaceEnumArr);
        NonprofitSelectorSurfaceEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (NonprofitSelectorSurfaceEnum nonprofitSelectorSurfaceEnum4 : values) {
            A18.put(nonprofitSelectorSurfaceEnum4.A00, nonprofitSelectorSurfaceEnum4);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(13);
    }

    public static NonprofitSelectorSurfaceEnum valueOf(String str) {
        return (NonprofitSelectorSurfaceEnum) Enum.valueOf(NonprofitSelectorSurfaceEnum.class, str);
    }

    public static NonprofitSelectorSurfaceEnum[] values() {
        return (NonprofitSelectorSurfaceEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public NonprofitSelectorSurfaceEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
