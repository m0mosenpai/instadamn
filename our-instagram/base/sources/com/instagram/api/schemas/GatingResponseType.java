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
public final class GatingResponseType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ GatingResponseType[] A03;
    public static final GatingResponseType A04;
    public static final GatingResponseType A05;
    public static final GatingResponseType A06;
    public static final GatingResponseType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        GatingResponseType gatingResponseType = new GatingResponseType("UNRECOGNIZED", 0, "GatingResponseType_unspecified");
        A07 = gatingResponseType;
        GatingResponseType gatingResponseType2 = new GatingResponseType("APPEALABLE", 1, "appealable");
        A04 = gatingResponseType2;
        GatingResponseType gatingResponseType3 = new GatingResponseType("MISINFORMATION", 2, "misinformation");
        A05 = gatingResponseType3;
        GatingResponseType gatingResponseType4 = new GatingResponseType("SENSITIVITY", 3, "sensitive");
        A06 = gatingResponseType4;
        GatingResponseType[] gatingResponseTypeArr = {gatingResponseType, gatingResponseType2, gatingResponseType3, gatingResponseType4, new GatingResponseType("UNAPPEALABLE", 4, "unappealable")};
        A03 = gatingResponseTypeArr;
        A02 = AbstractC12190kN.A00(gatingResponseTypeArr);
        GatingResponseType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (GatingResponseType gatingResponseType5 : values) {
            A18.put(gatingResponseType5.A00, gatingResponseType5);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(90);
    }

    public static GatingResponseType valueOf(String str) {
        return (GatingResponseType) Enum.valueOf(GatingResponseType.class, str);
    }

    public static GatingResponseType[] values() {
        return (GatingResponseType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public GatingResponseType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}