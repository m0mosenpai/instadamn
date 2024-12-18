package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class TextEntityType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextEntityType[] A03;
    public static final TextEntityType A04;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TextEntityType textEntityType = new TextEntityType("UNRECOGNIZED", 0, "TextEntityType_unspecified");
        A04 = textEntityType;
        TextEntityType[] textEntityTypeArr = {textEntityType, new TextEntityType("TAG", 1, "tag")};
        A03 = textEntityTypeArr;
        A02 = AbstractC12190kN.A00(textEntityTypeArr);
        TextEntityType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TextEntityType textEntityType2 : values) {
            A18.put(textEntityType2.A00, textEntityType2);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(55);
    }

    public static TextEntityType valueOf(String str) {
        return (TextEntityType) Enum.valueOf(TextEntityType.class, str);
    }

    public static TextEntityType[] values() {
        return (TextEntityType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextEntityType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
