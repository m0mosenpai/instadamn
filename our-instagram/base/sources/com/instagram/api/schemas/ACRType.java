package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ACRType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ACRType[] A03;
    public static final ACRType A04;
    public static final ACRType A05;
    public static final ACRType A06;
    public static final ACRType A07;
    public static final ACRType A08;
    public static final ACRType A09;
    public static final ACRType A0A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        ACRType aCRType = new ACRType("UNRECOGNIZED", 0, "ACRType_unspecified");
        A0A = aCRType;
        ACRType aCRType2 = new ACRType("ACTIVE_STORY", 1, "active_story");
        A04 = aCRType2;
        ACRType aCRType3 = new ACRType("CAMERA_ROLL", 2, "camera_roll");
        A05 = aCRType3;
        ACRType aCRType4 = new ACRType("FEED_CAROUSEL_HISTORICAL", 3, "feed_carousel_historical");
        A06 = aCRType4;
        ACRType aCRType5 = new ACRType("HIGHLIGHT_REEL", 4, "highlight_reel");
        A07 = aCRType5;
        ACRType aCRType6 = new ACRType("SMART_REEL", 5, "smart_reel");
        A08 = aCRType6;
        ACRType aCRType7 = new ACRType("UNKNOWN", 6, "");
        A09 = aCRType7;
        ACRType[] aCRTypeArr = {aCRType, aCRType2, aCRType3, aCRType4, aCRType5, aCRType6, aCRType7};
        A03 = aCRTypeArr;
        A02 = AbstractC12190kN.A00(aCRTypeArr);
        ACRType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ACRType aCRType8 : values) {
            linkedHashMap.put(aCRType8.A00, aCRType8);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(39);
    }

    public static ACRType valueOf(String str) {
        return (ACRType) Enum.valueOf(ACRType.class, str);
    }

    public static ACRType[] values() {
        return (ACRType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ACRType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
