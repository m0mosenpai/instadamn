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
public final class ClipsMerchandisingPillType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsMerchandisingPillType[] A03;
    public static final ClipsMerchandisingPillType A04;
    public static final ClipsMerchandisingPillType A05;
    public static final ClipsMerchandisingPillType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsMerchandisingPillType clipsMerchandisingPillType = new ClipsMerchandisingPillType("UNRECOGNIZED", 0, "ClipsMerchandisingPillType_unspecified");
        A06 = clipsMerchandisingPillType;
        ClipsMerchandisingPillType clipsMerchandisingPillType2 = new ClipsMerchandisingPillType("HIGHLIGHTED_USE_AUDIO", 1, "highlighted_use_audio");
        A04 = clipsMerchandisingPillType2;
        ClipsMerchandisingPillType clipsMerchandisingPillType3 = new ClipsMerchandisingPillType("HIGHLIGHTED_USE_EFFECT", 2, "highlighted_use_effect");
        A05 = clipsMerchandisingPillType3;
        ClipsMerchandisingPillType[] clipsMerchandisingPillTypeArr = {clipsMerchandisingPillType, clipsMerchandisingPillType2, clipsMerchandisingPillType3, new ClipsMerchandisingPillType("HIGHLIGHTED_USE_REMIX", 3, "highlighted_use_remix")};
        A03 = clipsMerchandisingPillTypeArr;
        A02 = AbstractC12190kN.A00(clipsMerchandisingPillTypeArr);
        ClipsMerchandisingPillType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ClipsMerchandisingPillType clipsMerchandisingPillType4 : values) {
            A18.put(clipsMerchandisingPillType4.A00, clipsMerchandisingPillType4);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(7);
    }

    public static ClipsMerchandisingPillType valueOf(String str) {
        return (ClipsMerchandisingPillType) Enum.valueOf(ClipsMerchandisingPillType.class, str);
    }

    public static ClipsMerchandisingPillType[] values() {
        return (ClipsMerchandisingPillType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsMerchandisingPillType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
