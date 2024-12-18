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
public final class InstapalCharacterType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ InstapalCharacterType[] A03;
    public static final InstapalCharacterType A04;
    public static final InstapalCharacterType A05;
    public static final InstapalCharacterType A06;
    public static final InstapalCharacterType A07;
    public static final InstapalCharacterType A08;
    public static final InstapalCharacterType A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        InstapalCharacterType instapalCharacterType = new InstapalCharacterType("UNRECOGNIZED", 0, "InstapalCharacterType_unspecified");
        A09 = instapalCharacterType;
        InstapalCharacterType instapalCharacterType2 = new InstapalCharacterType("FREDDIE", 1, "FREDDIE");
        A04 = instapalCharacterType2;
        InstapalCharacterType instapalCharacterType3 = new InstapalCharacterType("HUGO", 2, "HUGO");
        A05 = instapalCharacterType3;
        InstapalCharacterType instapalCharacterType4 = new InstapalCharacterType("LUNA", 3, "LUNA");
        A06 = instapalCharacterType4;
        InstapalCharacterType instapalCharacterType5 = new InstapalCharacterType("OTTO", 4, "OTTO");
        A07 = instapalCharacterType5;
        InstapalCharacterType instapalCharacterType6 = new InstapalCharacterType("RUPERT", 5, "RUPERT");
        A08 = instapalCharacterType6;
        InstapalCharacterType[] instapalCharacterTypeArr = {instapalCharacterType, instapalCharacterType2, instapalCharacterType3, instapalCharacterType4, instapalCharacterType5, instapalCharacterType6, new InstapalCharacterType("ZIGGY", 6, "ZIGGY")};
        A03 = instapalCharacterTypeArr;
        A02 = AbstractC12190kN.A00(instapalCharacterTypeArr);
        InstapalCharacterType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (InstapalCharacterType instapalCharacterType7 : values) {
            A18.put(instapalCharacterType7.A00, instapalCharacterType7);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(61);
    }

    public static InstapalCharacterType valueOf(String str) {
        return (InstapalCharacterType) Enum.valueOf(InstapalCharacterType.class, str);
    }

    public static InstapalCharacterType[] values() {
        return (InstapalCharacterType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public InstapalCharacterType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
