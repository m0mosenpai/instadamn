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
public final class ErrorLevel implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ErrorLevel[] A03;
    public static final ErrorLevel A04;
    public static final ErrorLevel A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ErrorLevel errorLevel = new ErrorLevel("UNRECOGNIZED", 0, "ErrorLevel_unspecified");
        A05 = errorLevel;
        ErrorLevel errorLevel2 = new ErrorLevel("ERROR", 1, "ERROR");
        A04 = errorLevel2;
        ErrorLevel[] errorLevelArr = {errorLevel, errorLevel2, new ErrorLevel("WARNING", 2, "WARNING")};
        A03 = errorLevelArr;
        A02 = AbstractC12190kN.A00(errorLevelArr);
        ErrorLevel[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ErrorLevel errorLevel3 : values) {
            A18.put(errorLevel3.A00, errorLevel3);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(73);
    }

    public static ErrorLevel valueOf(String str) {
        return (ErrorLevel) Enum.valueOf(ErrorLevel.class, str);
    }

    public static ErrorLevel[] values() {
        return (ErrorLevel[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ErrorLevel(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
