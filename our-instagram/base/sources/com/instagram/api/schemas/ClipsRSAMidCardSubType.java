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
public final class ClipsRSAMidCardSubType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsRSAMidCardSubType[] A03;
    public static final ClipsRSAMidCardSubType A04;
    public static final ClipsRSAMidCardSubType A05;
    public static final ClipsRSAMidCardSubType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsRSAMidCardSubType clipsRSAMidCardSubType = new ClipsRSAMidCardSubType("UNRECOGNIZED", 0, "ClipsRSAMidCardSubType_unspecified");
        A06 = clipsRSAMidCardSubType;
        ClipsRSAMidCardSubType clipsRSAMidCardSubType2 = new ClipsRSAMidCardSubType("RECENTLY_SAVED_AUDIO", 1, "recently_saved_audio");
        A04 = clipsRSAMidCardSubType2;
        ClipsRSAMidCardSubType clipsRSAMidCardSubType3 = new ClipsRSAMidCardSubType("REVISIT_AUDIO", 2, "revisit_audio");
        A05 = clipsRSAMidCardSubType3;
        ClipsRSAMidCardSubType[] clipsRSAMidCardSubTypeArr = {clipsRSAMidCardSubType, clipsRSAMidCardSubType2, clipsRSAMidCardSubType3};
        A03 = clipsRSAMidCardSubTypeArr;
        A02 = AbstractC12190kN.A00(clipsRSAMidCardSubTypeArr);
        ClipsRSAMidCardSubType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ClipsRSAMidCardSubType clipsRSAMidCardSubType4 : values) {
            A18.put(clipsRSAMidCardSubType4.A00, clipsRSAMidCardSubType4);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(11);
    }

    public static ClipsRSAMidCardSubType valueOf(String str) {
        return (ClipsRSAMidCardSubType) Enum.valueOf(ClipsRSAMidCardSubType.class, str);
    }

    public static ClipsRSAMidCardSubType[] values() {
        return (ClipsRSAMidCardSubType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsRSAMidCardSubType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
