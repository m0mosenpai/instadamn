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
/* loaded from: classes2.dex */
public final class TextPostAppHeaderFollowVariant implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextPostAppHeaderFollowVariant[] A03;
    public static final TextPostAppHeaderFollowVariant A04;
    public static final TextPostAppHeaderFollowVariant A05;
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
        TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant = new TextPostAppHeaderFollowVariant("UNRECOGNIZED", 0, "TextPostAppHeaderFollowVariant_unspecified");
        A05 = textPostAppHeaderFollowVariant;
        TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant2 = new TextPostAppHeaderFollowVariant("PRIMARY", 1, "primary");
        A04 = textPostAppHeaderFollowVariant2;
        TextPostAppHeaderFollowVariant[] textPostAppHeaderFollowVariantArr = {textPostAppHeaderFollowVariant, textPostAppHeaderFollowVariant2, new TextPostAppHeaderFollowVariant("SECONDARY", 2, "secondary")};
        A03 = textPostAppHeaderFollowVariantArr;
        A02 = AbstractC12190kN.A00(textPostAppHeaderFollowVariantArr);
        TextPostAppHeaderFollowVariant[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant3 : values) {
            linkedHashMap.put(textPostAppHeaderFollowVariant3.A00, textPostAppHeaderFollowVariant3);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(30);
    }

    public static TextPostAppHeaderFollowVariant valueOf(String str) {
        return (TextPostAppHeaderFollowVariant) Enum.valueOf(TextPostAppHeaderFollowVariant.class, str);
    }

    public static TextPostAppHeaderFollowVariant[] values() {
        return (TextPostAppHeaderFollowVariant[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextPostAppHeaderFollowVariant(String str, int i, String str2) {
        this.A00 = str2;
    }
}
