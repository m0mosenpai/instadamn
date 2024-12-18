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
public final class TextPostAppBottomSheetCTAType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextPostAppBottomSheetCTAType[] A03;
    public static final TextPostAppBottomSheetCTAType A04;
    public static final TextPostAppBottomSheetCTAType A05;
    public static final TextPostAppBottomSheetCTAType A06;
    public static final TextPostAppBottomSheetCTAType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType = new TextPostAppBottomSheetCTAType("UNRECOGNIZED", 0, "TextPostAppBottomSheetCTAType_unspecified");
        A07 = textPostAppBottomSheetCTAType;
        TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType2 = new TextPostAppBottomSheetCTAType("APP_AVAILABLE", 1, "app_available");
        A04 = textPostAppBottomSheetCTAType2;
        TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType3 = new TextPostAppBottomSheetCTAType("APP_UNAVAILABLE_AND_PREREGISTER_OFF", 2, "app_unavailable_and_preregister_off");
        A05 = textPostAppBottomSheetCTAType3;
        TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType4 = new TextPostAppBottomSheetCTAType("APP_UNAVAILABLE_AND_PREREGISTER_ON", 3, "app_unavailable_and_preregister_on");
        A06 = textPostAppBottomSheetCTAType4;
        TextPostAppBottomSheetCTAType[] textPostAppBottomSheetCTATypeArr = {textPostAppBottomSheetCTAType, textPostAppBottomSheetCTAType2, textPostAppBottomSheetCTAType3, textPostAppBottomSheetCTAType4};
        A03 = textPostAppBottomSheetCTATypeArr;
        A02 = AbstractC12190kN.A00(textPostAppBottomSheetCTATypeArr);
        TextPostAppBottomSheetCTAType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType5 : values) {
            A18.put(textPostAppBottomSheetCTAType5.A00, textPostAppBottomSheetCTAType5);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(59);
    }

    public static TextPostAppBottomSheetCTAType valueOf(String str) {
        return (TextPostAppBottomSheetCTAType) Enum.valueOf(TextPostAppBottomSheetCTAType.class, str);
    }

    public static TextPostAppBottomSheetCTAType[] values() {
        return (TextPostAppBottomSheetCTAType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextPostAppBottomSheetCTAType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
