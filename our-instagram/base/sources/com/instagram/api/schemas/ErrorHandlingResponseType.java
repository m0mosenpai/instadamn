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
public final class ErrorHandlingResponseType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ErrorHandlingResponseType[] A03;
    public static final ErrorHandlingResponseType A04;
    public static final ErrorHandlingResponseType A05;
    public static final ErrorHandlingResponseType A06;
    public static final ErrorHandlingResponseType A07;
    public static final ErrorHandlingResponseType A08;
    public static final ErrorHandlingResponseType A09;
    public static final ErrorHandlingResponseType A0A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ErrorHandlingResponseType errorHandlingResponseType = new ErrorHandlingResponseType("UNRECOGNIZED", 0, "ErrorHandlingResponseType_unspecified");
        A0A = errorHandlingResponseType;
        ErrorHandlingResponseType errorHandlingResponseType2 = new ErrorHandlingResponseType("DISPLAY_ERROR_MESSAGE", 1, "DISPLAY_ERROR_MESSAGE");
        A04 = errorHandlingResponseType2;
        ErrorHandlingResponseType errorHandlingResponseType3 = new ErrorHandlingResponseType("DISPLAY_ERROR_PAGE", 2, "DISPLAY_ERROR_PAGE");
        A05 = errorHandlingResponseType3;
        ErrorHandlingResponseType errorHandlingResponseType4 = new ErrorHandlingResponseType("DISPLAY_ERROR_PAGE_WITH_ACTION", 3, "DISPLAY_ERROR_PAGE_WITH_ACTION");
        A06 = errorHandlingResponseType4;
        ErrorHandlingResponseType errorHandlingResponseType5 = new ErrorHandlingResponseType("DISPLAY_TEMPORARY_MESSAGE", 4, "DISPLAY_TEMPORARY_MESSAGE");
        A07 = errorHandlingResponseType5;
        ErrorHandlingResponseType errorHandlingResponseType6 = new ErrorHandlingResponseType("DISPLAY_WARNING_ROW", 5, "DISPLAY_WARNING_ROW");
        A08 = errorHandlingResponseType6;
        ErrorHandlingResponseType errorHandlingResponseType7 = new ErrorHandlingResponseType("DO_NOTHING", 6, "DO_NOTHING");
        A09 = errorHandlingResponseType7;
        ErrorHandlingResponseType[] errorHandlingResponseTypeArr = {errorHandlingResponseType, errorHandlingResponseType2, errorHandlingResponseType3, errorHandlingResponseType4, errorHandlingResponseType5, errorHandlingResponseType6, errorHandlingResponseType7, new ErrorHandlingResponseType("NAVIGATE_TO_PROMOTION_PAYMENT", 7, "NAVIGATE_TO_PROMOTION_PAYMENT")};
        A03 = errorHandlingResponseTypeArr;
        A02 = AbstractC12190kN.A00(errorHandlingResponseTypeArr);
        ErrorHandlingResponseType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ErrorHandlingResponseType errorHandlingResponseType8 : values) {
            A18.put(errorHandlingResponseType8.A00, errorHandlingResponseType8);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(71);
    }

    public static ErrorHandlingResponseType valueOf(String str) {
        return (ErrorHandlingResponseType) Enum.valueOf(ErrorHandlingResponseType.class, str);
    }

    public static ErrorHandlingResponseType[] values() {
        return (ErrorHandlingResponseType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ErrorHandlingResponseType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
