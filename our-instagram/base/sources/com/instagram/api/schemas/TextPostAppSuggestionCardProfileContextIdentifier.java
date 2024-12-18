package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TextPostAppSuggestionCardProfileContextIdentifier implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextPostAppSuggestionCardProfileContextIdentifier[] A03;
    public static final TextPostAppSuggestionCardProfileContextIdentifier A04;
    public static final TextPostAppSuggestionCardProfileContextIdentifier A05;
    public static final TextPostAppSuggestionCardProfileContextIdentifier A06;
    public static final TextPostAppSuggestionCardProfileContextIdentifier A07;
    public static final TextPostAppSuggestionCardProfileContextIdentifier A08;
    public static final TextPostAppSuggestionCardProfileContextIdentifier A09;
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
        TextPostAppSuggestionCardProfileContextIdentifier textPostAppSuggestionCardProfileContextIdentifier = new TextPostAppSuggestionCardProfileContextIdentifier("UNRECOGNIZED", 0, "TextPostAppSuggestionCardProfileContextIdentifier_unspecified");
        A09 = textPostAppSuggestionCardProfileContextIdentifier;
        TextPostAppSuggestionCardProfileContextIdentifier textPostAppSuggestionCardProfileContextIdentifier2 = new TextPostAppSuggestionCardProfileContextIdentifier("BIOGRAPHY", 1, "BIOGRAPHY");
        A04 = textPostAppSuggestionCardProfileContextIdentifier2;
        TextPostAppSuggestionCardProfileContextIdentifier textPostAppSuggestionCardProfileContextIdentifier3 = new TextPostAppSuggestionCardProfileContextIdentifier("IIC_A2A_FOLLOWED_USERS", 2, "IIC_A2A_FOLLOWED_USERS");
        A05 = textPostAppSuggestionCardProfileContextIdentifier3;
        TextPostAppSuggestionCardProfileContextIdentifier textPostAppSuggestionCardProfileContextIdentifier4 = new TextPostAppSuggestionCardProfileContextIdentifier("IIC_A2A_LIKED_USERS", 3, "IIC_A2A_LIKED_USERS");
        A06 = textPostAppSuggestionCardProfileContextIdentifier4;
        TextPostAppSuggestionCardProfileContextIdentifier textPostAppSuggestionCardProfileContextIdentifier5 = new TextPostAppSuggestionCardProfileContextIdentifier("NOTABLE_FOLLOW", 4, "NOTABLE_FOLLOW");
        A07 = textPostAppSuggestionCardProfileContextIdentifier5;
        TextPostAppSuggestionCardProfileContextIdentifier textPostAppSuggestionCardProfileContextIdentifier6 = new TextPostAppSuggestionCardProfileContextIdentifier("POSTS_OVERALL", 5, "POSTS_OVERALL");
        A08 = textPostAppSuggestionCardProfileContextIdentifier6;
        TextPostAppSuggestionCardProfileContextIdentifier[] textPostAppSuggestionCardProfileContextIdentifierArr = {textPostAppSuggestionCardProfileContextIdentifier, textPostAppSuggestionCardProfileContextIdentifier2, textPostAppSuggestionCardProfileContextIdentifier3, textPostAppSuggestionCardProfileContextIdentifier4, textPostAppSuggestionCardProfileContextIdentifier5, textPostAppSuggestionCardProfileContextIdentifier6, new TextPostAppSuggestionCardProfileContextIdentifier("POSTS_THIS_WEEK", 6, "POSTS_THIS_WEEK")};
        A03 = textPostAppSuggestionCardProfileContextIdentifierArr;
        A02 = AbstractC12190kN.A00(textPostAppSuggestionCardProfileContextIdentifierArr);
        TextPostAppSuggestionCardProfileContextIdentifier[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (TextPostAppSuggestionCardProfileContextIdentifier textPostAppSuggestionCardProfileContextIdentifier7 : values) {
            linkedHashMap.put(textPostAppSuggestionCardProfileContextIdentifier7.A00, textPostAppSuggestionCardProfileContextIdentifier7);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(31);
    }

    public static TextPostAppSuggestionCardProfileContextIdentifier valueOf(String str) {
        return (TextPostAppSuggestionCardProfileContextIdentifier) Enum.valueOf(TextPostAppSuggestionCardProfileContextIdentifier.class, str);
    }

    public static TextPostAppSuggestionCardProfileContextIdentifier[] values() {
        return (TextPostAppSuggestionCardProfileContextIdentifier[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextPostAppSuggestionCardProfileContextIdentifier(String str, int i, String str2) {
        this.A00 = str2;
    }
}
