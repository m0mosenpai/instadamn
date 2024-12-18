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
/* loaded from: classes7.dex */
public final class ClipsTemplateBrowserCategory implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsTemplateBrowserCategory[] A03;
    public static final ClipsTemplateBrowserCategory A04;
    public static final ClipsTemplateBrowserCategory A05;
    public static final ClipsTemplateBrowserCategory A06;
    public static final ClipsTemplateBrowserCategory A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsTemplateBrowserCategory clipsTemplateBrowserCategory = new ClipsTemplateBrowserCategory("UNRECOGNIZED", 0, "ClipsTemplateBrowserCategory_unspecified");
        A07 = clipsTemplateBrowserCategory;
        ClipsTemplateBrowserCategory clipsTemplateBrowserCategory2 = new ClipsTemplateBrowserCategory("RECOMMENDED_FOR_YOU", 1, "recommended_for_you");
        A04 = clipsTemplateBrowserCategory2;
        ClipsTemplateBrowserCategory clipsTemplateBrowserCategory3 = new ClipsTemplateBrowserCategory("SAVED", 2, "saved");
        A05 = clipsTemplateBrowserCategory3;
        ClipsTemplateBrowserCategory clipsTemplateBrowserCategory4 = new ClipsTemplateBrowserCategory("SAVED_AUDIO", 3, "saved_audio");
        A06 = clipsTemplateBrowserCategory4;
        ClipsTemplateBrowserCategory[] clipsTemplateBrowserCategoryArr = {clipsTemplateBrowserCategory, clipsTemplateBrowserCategory2, clipsTemplateBrowserCategory3, clipsTemplateBrowserCategory4, new ClipsTemplateBrowserCategory("TRENDING", 4, "trending")};
        A03 = clipsTemplateBrowserCategoryArr;
        A02 = AbstractC12190kN.A00(clipsTemplateBrowserCategoryArr);
        ClipsTemplateBrowserCategory[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ClipsTemplateBrowserCategory clipsTemplateBrowserCategory5 : values) {
            A18.put(clipsTemplateBrowserCategory5.A00, clipsTemplateBrowserCategory5);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(13);
    }

    public static ClipsTemplateBrowserCategory valueOf(String str) {
        return (ClipsTemplateBrowserCategory) Enum.valueOf(ClipsTemplateBrowserCategory.class, str);
    }

    public static ClipsTemplateBrowserCategory[] values() {
        return (ClipsTemplateBrowserCategory[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsTemplateBrowserCategory(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
