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
public final class TextAppTextFragmentType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextAppTextFragmentType[] A03;
    public static final TextAppTextFragmentType A04;
    public static final TextAppTextFragmentType A05;
    public static final TextAppTextFragmentType A06;
    public static final TextAppTextFragmentType A07;
    public static final TextAppTextFragmentType A08;
    public static final TextAppTextFragmentType A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TextAppTextFragmentType textAppTextFragmentType = new TextAppTextFragmentType("UNRECOGNIZED", 0, "TextAppTextFragmentType_unspecified");
        A09 = textAppTextFragmentType;
        TextAppTextFragmentType textAppTextFragmentType2 = new TextAppTextFragmentType("FEDIVERSE_USER_MENTION", 1, "fediverse_user_mention");
        A04 = textAppTextFragmentType2;
        TextAppTextFragmentType textAppTextFragmentType3 = new TextAppTextFragmentType("INLINE_SEARCH_SUGGESTION", 2, "inline_search_suggestion");
        A05 = textAppTextFragmentType3;
        TextAppTextFragmentType textAppTextFragmentType4 = new TextAppTextFragmentType("LINK", 3, "link");
        A06 = textAppTextFragmentType4;
        TextAppTextFragmentType textAppTextFragmentType5 = new TextAppTextFragmentType("MENTION", 4, "mention");
        A07 = textAppTextFragmentType5;
        TextAppTextFragmentType textAppTextFragmentType6 = new TextAppTextFragmentType("PLAINTEXT", 5, "plaintext");
        A08 = textAppTextFragmentType6;
        TextAppTextFragmentType[] textAppTextFragmentTypeArr = {textAppTextFragmentType, textAppTextFragmentType2, textAppTextFragmentType3, textAppTextFragmentType4, textAppTextFragmentType5, textAppTextFragmentType6, new TextAppTextFragmentType("TEXT_APP_TAG", 6, "text_app_tag")};
        A03 = textAppTextFragmentTypeArr;
        A02 = AbstractC12190kN.A00(textAppTextFragmentTypeArr);
        TextAppTextFragmentType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TextAppTextFragmentType textAppTextFragmentType7 : values) {
            A18.put(textAppTextFragmentType7.A00, textAppTextFragmentType7);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(53);
    }

    public static TextAppTextFragmentType valueOf(String str) {
        return (TextAppTextFragmentType) Enum.valueOf(TextAppTextFragmentType.class, str);
    }

    public static TextAppTextFragmentType[] values() {
        return (TextAppTextFragmentType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextAppTextFragmentType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
