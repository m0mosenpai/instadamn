package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NoteFontStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ NoteFontStyle[] A03;
    public static final NoteFontStyle A04;
    public static final NoteFontStyle A05;
    public static final NoteFontStyle A06;
    public static final NoteFontStyle A07;
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
        NoteFontStyle noteFontStyle = new NoteFontStyle("UNRECOGNIZED", 0, "NoteFontStyle_unspecified");
        A07 = noteFontStyle;
        NoteFontStyle noteFontStyle2 = new NoteFontStyle("MEME", 1, "meme");
        A04 = noteFontStyle2;
        NoteFontStyle noteFontStyle3 = new NoteFontStyle("STANDARD", 2, "standard");
        A05 = noteFontStyle3;
        NoteFontStyle noteFontStyle4 = new NoteFontStyle("STRONG", 3, "strong");
        A06 = noteFontStyle4;
        NoteFontStyle[] noteFontStyleArr = {noteFontStyle, noteFontStyle2, noteFontStyle3, noteFontStyle4, new NoteFontStyle("TYPEWRITER", 4, "typewriter")};
        A03 = noteFontStyleArr;
        A02 = AbstractC12190kN.A00(noteFontStyleArr);
        NoteFontStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (NoteFontStyle noteFontStyle5 : values) {
            linkedHashMap.put(noteFontStyle5.A00, noteFontStyle5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(65);
    }

    public static NoteFontStyle valueOf(String str) {
        return (NoteFontStyle) Enum.valueOf(NoteFontStyle.class, str);
    }

    public static NoteFontStyle[] values() {
        return (NoteFontStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public NoteFontStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}
