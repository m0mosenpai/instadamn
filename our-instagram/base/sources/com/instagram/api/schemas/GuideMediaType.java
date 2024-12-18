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
/* loaded from: classes7.dex */
public final class GuideMediaType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ GuideMediaType[] A03;
    public static final GuideMediaType A04;
    public static final GuideMediaType A05;
    public static final GuideMediaType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        GuideMediaType guideMediaType = new GuideMediaType("UNRECOGNIZED", 0, "GuideMediaType_unspecified");
        A06 = guideMediaType;
        GuideMediaType guideMediaType2 = new GuideMediaType("IG_MEDIA", 1, "IG_MEDIA");
        A04 = guideMediaType2;
        GuideMediaType guideMediaType3 = new GuideMediaType("PRODUCT_IMAGE", 2, "PRODUCT_IMAGE");
        A05 = guideMediaType3;
        GuideMediaType[] guideMediaTypeArr = {guideMediaType, guideMediaType2, guideMediaType3};
        A03 = guideMediaTypeArr;
        A02 = AbstractC12190kN.A00(guideMediaTypeArr);
        GuideMediaType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (GuideMediaType guideMediaType4 : values) {
            A18.put(guideMediaType4.A00, guideMediaType4);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(7);
    }

    public static GuideMediaType valueOf(String str) {
        return (GuideMediaType) Enum.valueOf(GuideMediaType.class, str);
    }

    public static GuideMediaType[] values() {
        return (GuideMediaType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public GuideMediaType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
