package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class NativeInfoCardTextAlignment implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ NativeInfoCardTextAlignment[] A03;
    public static final NativeInfoCardTextAlignment A04;
    public static final NativeInfoCardTextAlignment A05;
    public static final NativeInfoCardTextAlignment A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        NativeInfoCardTextAlignment nativeInfoCardTextAlignment = new NativeInfoCardTextAlignment("UNRECOGNIZED", 0, "NativeInfoCardTextAlignment_unspecified");
        A04 = nativeInfoCardTextAlignment;
        NativeInfoCardTextAlignment nativeInfoCardTextAlignment2 = new NativeInfoCardTextAlignment("center", 1, "center");
        A05 = nativeInfoCardTextAlignment2;
        NativeInfoCardTextAlignment nativeInfoCardTextAlignment3 = new NativeInfoCardTextAlignment("left", 2, "left");
        A06 = nativeInfoCardTextAlignment3;
        NativeInfoCardTextAlignment[] nativeInfoCardTextAlignmentArr = {nativeInfoCardTextAlignment, nativeInfoCardTextAlignment2, nativeInfoCardTextAlignment3, new NativeInfoCardTextAlignment("right", 3, "right")};
        A03 = nativeInfoCardTextAlignmentArr;
        A02 = AbstractC12190kN.A00(nativeInfoCardTextAlignmentArr);
        NativeInfoCardTextAlignment[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (NativeInfoCardTextAlignment nativeInfoCardTextAlignment4 : values) {
            A18.put(nativeInfoCardTextAlignment4.A00, nativeInfoCardTextAlignment4);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(11);
    }

    public static NativeInfoCardTextAlignment valueOf(String str) {
        return (NativeInfoCardTextAlignment) Enum.valueOf(NativeInfoCardTextAlignment.class, str);
    }

    public static NativeInfoCardTextAlignment[] values() {
        return (NativeInfoCardTextAlignment[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public NativeInfoCardTextAlignment(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
