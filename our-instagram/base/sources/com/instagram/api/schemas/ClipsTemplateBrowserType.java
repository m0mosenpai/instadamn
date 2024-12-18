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
public final class ClipsTemplateBrowserType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsTemplateBrowserType[] A03;
    public static final ClipsTemplateBrowserType A04;
    public static final ClipsTemplateBrowserType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsTemplateBrowserType clipsTemplateBrowserType = new ClipsTemplateBrowserType("UNRECOGNIZED", 0, "ClipsTemplateBrowserType_unspecified");
        A05 = clipsTemplateBrowserType;
        ClipsTemplateBrowserType clipsTemplateBrowserType2 = new ClipsTemplateBrowserType("CREATION_EXIT", 1, "creation_exit");
        A04 = clipsTemplateBrowserType2;
        ClipsTemplateBrowserType[] clipsTemplateBrowserTypeArr = {clipsTemplateBrowserType, clipsTemplateBrowserType2, new ClipsTemplateBrowserType("TEMPLATE_IN_FEED_UNIT", 2, "template_in_feed_unit")};
        A03 = clipsTemplateBrowserTypeArr;
        A02 = AbstractC12190kN.A00(clipsTemplateBrowserTypeArr);
        ClipsTemplateBrowserType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ClipsTemplateBrowserType clipsTemplateBrowserType3 : values) {
            A18.put(clipsTemplateBrowserType3.A00, clipsTemplateBrowserType3);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(14);
    }

    public static ClipsTemplateBrowserType valueOf(String str) {
        return (ClipsTemplateBrowserType) Enum.valueOf(ClipsTemplateBrowserType.class, str);
    }

    public static ClipsTemplateBrowserType[] values() {
        return (ClipsTemplateBrowserType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsTemplateBrowserType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
