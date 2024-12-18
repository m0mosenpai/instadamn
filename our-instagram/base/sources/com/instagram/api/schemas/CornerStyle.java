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
/* loaded from: classes2.dex */
public final class CornerStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CornerStyle[] A03;
    public static final CornerStyle A04;
    public static final CornerStyle A05;
    public static final CornerStyle A06;
    public static final CornerStyle A07;
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
        CornerStyle cornerStyle = new CornerStyle("UNRECOGNIZED", 0, "CornerStyle_unspecified");
        A07 = cornerStyle;
        CornerStyle cornerStyle2 = new CornerStyle("ROUNDED", 1, "rounded");
        A04 = cornerStyle2;
        CornerStyle cornerStyle3 = new CornerStyle("ROUNDED_BORDER", 2, "rounded_border");
        A05 = cornerStyle3;
        CornerStyle cornerStyle4 = new CornerStyle("SQUARED", 3, "squared");
        A06 = cornerStyle4;
        CornerStyle[] cornerStyleArr = {cornerStyle, cornerStyle2, cornerStyle3, cornerStyle4};
        A03 = cornerStyleArr;
        A02 = AbstractC12190kN.A00(cornerStyleArr);
        CornerStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (CornerStyle cornerStyle5 : values) {
            linkedHashMap.put(cornerStyle5.A00, cornerStyle5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(80);
    }

    public static CornerStyle valueOf(String str) {
        return (CornerStyle) Enum.valueOf(CornerStyle.class, str);
    }

    public static CornerStyle[] values() {
        return (CornerStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CornerStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}
