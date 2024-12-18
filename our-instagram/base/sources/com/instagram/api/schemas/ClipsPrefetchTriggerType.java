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
public final class ClipsPrefetchTriggerType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsPrefetchTriggerType[] A03;
    public static final ClipsPrefetchTriggerType A04;
    public static final ClipsPrefetchTriggerType A05;
    public static final ClipsPrefetchTriggerType A06;
    public static final ClipsPrefetchTriggerType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsPrefetchTriggerType clipsPrefetchTriggerType = new ClipsPrefetchTriggerType("UNRECOGNIZED", 0, "ClipsPrefetchTriggerType_unspecified");
        A06 = clipsPrefetchTriggerType;
        ClipsPrefetchTriggerType clipsPrefetchTriggerType2 = new ClipsPrefetchTriggerType("BACKGROUND_COLD", 1, "background_cold");
        A04 = clipsPrefetchTriggerType2;
        ClipsPrefetchTriggerType clipsPrefetchTriggerType3 = new ClipsPrefetchTriggerType("COLD_START", 2, "cold_start");
        A05 = clipsPrefetchTriggerType3;
        ClipsPrefetchTriggerType clipsPrefetchTriggerType4 = new ClipsPrefetchTriggerType("WARM_START", 3, "warm_start");
        A07 = clipsPrefetchTriggerType4;
        ClipsPrefetchTriggerType[] clipsPrefetchTriggerTypeArr = {clipsPrefetchTriggerType, clipsPrefetchTriggerType2, clipsPrefetchTriggerType3, clipsPrefetchTriggerType4};
        A03 = clipsPrefetchTriggerTypeArr;
        A02 = AbstractC12190kN.A00(clipsPrefetchTriggerTypeArr);
        ClipsPrefetchTriggerType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ClipsPrefetchTriggerType clipsPrefetchTriggerType5 : values) {
            A18.put(clipsPrefetchTriggerType5.A00, clipsPrefetchTriggerType5);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(10);
    }

    public static ClipsPrefetchTriggerType valueOf(String str) {
        return (ClipsPrefetchTriggerType) Enum.valueOf(ClipsPrefetchTriggerType.class, str);
    }

    public static ClipsPrefetchTriggerType[] values() {
        return (ClipsPrefetchTriggerType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsPrefetchTriggerType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
