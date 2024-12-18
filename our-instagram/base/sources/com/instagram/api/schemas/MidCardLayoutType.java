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
public final class MidCardLayoutType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MidCardLayoutType[] A03;
    public static final MidCardLayoutType A04;
    public static final MidCardLayoutType A05;
    public static final MidCardLayoutType A06;
    public static final MidCardLayoutType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MidCardLayoutType midCardLayoutType = new MidCardLayoutType("UNRECOGNIZED", 0, "MidCardLayoutType_unspecified");
        A07 = midCardLayoutType;
        MidCardLayoutType midCardLayoutType2 = new MidCardLayoutType("GRID", 1, "grid");
        A04 = midCardLayoutType2;
        MidCardLayoutType midCardLayoutType3 = new MidCardLayoutType("MEGA_CARD", 2, "mega_card");
        A05 = midCardLayoutType3;
        MidCardLayoutType midCardLayoutType4 = new MidCardLayoutType("SINGLE_CLIP", 3, "single_clip");
        A06 = midCardLayoutType4;
        MidCardLayoutType[] midCardLayoutTypeArr = {midCardLayoutType, midCardLayoutType2, midCardLayoutType3, midCardLayoutType4, new MidCardLayoutType("THREE_CLIPS", 4, "three_clips")};
        A03 = midCardLayoutTypeArr;
        A02 = AbstractC12190kN.A00(midCardLayoutTypeArr);
        MidCardLayoutType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MidCardLayoutType midCardLayoutType5 : values) {
            A18.put(midCardLayoutType5.A00, midCardLayoutType5);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(96);
    }

    public static MidCardLayoutType valueOf(String str) {
        return (MidCardLayoutType) Enum.valueOf(MidCardLayoutType.class, str);
    }

    public static MidCardLayoutType[] values() {
        return (MidCardLayoutType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MidCardLayoutType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
