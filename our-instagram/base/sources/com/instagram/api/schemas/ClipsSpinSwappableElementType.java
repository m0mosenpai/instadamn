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
public final class ClipsSpinSwappableElementType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsSpinSwappableElementType[] A03;
    public static final ClipsSpinSwappableElementType A04;
    public static final ClipsSpinSwappableElementType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsSpinSwappableElementType clipsSpinSwappableElementType = new ClipsSpinSwappableElementType("UNRECOGNIZED", 0, "ClipsSpinSwappableElementType_unspecified");
        A05 = clipsSpinSwappableElementType;
        ClipsSpinSwappableElementType clipsSpinSwappableElementType2 = new ClipsSpinSwappableElementType("TEXT", 1, "TEXT");
        A04 = clipsSpinSwappableElementType2;
        ClipsSpinSwappableElementType[] clipsSpinSwappableElementTypeArr = {clipsSpinSwappableElementType, clipsSpinSwappableElementType2};
        A03 = clipsSpinSwappableElementTypeArr;
        A02 = AbstractC12190kN.A00(clipsSpinSwappableElementTypeArr);
        ClipsSpinSwappableElementType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ClipsSpinSwappableElementType clipsSpinSwappableElementType3 : values) {
            A18.put(clipsSpinSwappableElementType3.A00, clipsSpinSwappableElementType3);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(12);
    }

    public static ClipsSpinSwappableElementType valueOf(String str) {
        return (ClipsSpinSwappableElementType) Enum.valueOf(ClipsSpinSwappableElementType.class, str);
    }

    public static ClipsSpinSwappableElementType[] values() {
        return (ClipsSpinSwappableElementType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsSpinSwappableElementType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}