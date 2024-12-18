package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class TextAppAutoArchiveSettingInt implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextAppAutoArchiveSettingInt[] A03;
    public static final TextAppAutoArchiveSettingInt A04;
    public static final TextAppAutoArchiveSettingInt A05;
    public static final TextAppAutoArchiveSettingInt A06;
    public static final TextAppAutoArchiveSettingInt A07;
    public static final TextAppAutoArchiveSettingInt A08;
    public static final TextAppAutoArchiveSettingInt A09;
    public static final TextAppAutoArchiveSettingInt A0A;
    public static final TextAppAutoArchiveSettingInt A0B;
    public static final TextAppAutoArchiveSettingInt A0C;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TextAppAutoArchiveSettingInt textAppAutoArchiveSettingInt = new TextAppAutoArchiveSettingInt("UNRECOGNIZED", 0, "TextAppAutoArchiveSettingInt_unspecified");
        A0C = textAppAutoArchiveSettingInt;
        TextAppAutoArchiveSettingInt textAppAutoArchiveSettingInt2 = new TextAppAutoArchiveSettingInt("DEFAULT_NEVER", 1, "DEFAULT_NEVER");
        A04 = textAppAutoArchiveSettingInt2;
        TextAppAutoArchiveSettingInt textAppAutoArchiveSettingInt3 = new TextAppAutoArchiveSettingInt("ONE_DAY", 2, "ONE_DAY");
        A05 = textAppAutoArchiveSettingInt3;
        TextAppAutoArchiveSettingInt textAppAutoArchiveSettingInt4 = new TextAppAutoArchiveSettingInt("ONE_MINUTE", 3, "ONE_MINUTE");
        A06 = textAppAutoArchiveSettingInt4;
        TextAppAutoArchiveSettingInt textAppAutoArchiveSettingInt5 = new TextAppAutoArchiveSettingInt("ONE_MONTH", 4, "ONE_MONTH");
        A07 = textAppAutoArchiveSettingInt5;
        TextAppAutoArchiveSettingInt textAppAutoArchiveSettingInt6 = new TextAppAutoArchiveSettingInt("ONE_WEEK", 5, "ONE_WEEK");
        A08 = textAppAutoArchiveSettingInt6;
        TextAppAutoArchiveSettingInt textAppAutoArchiveSettingInt7 = new TextAppAutoArchiveSettingInt("ONE_YEAR", 6, "ONE_YEAR");
        A09 = textAppAutoArchiveSettingInt7;
        TextAppAutoArchiveSettingInt textAppAutoArchiveSettingInt8 = new TextAppAutoArchiveSettingInt("SIX_MONTHS", 7, "SIX_MONTHS");
        A0A = textAppAutoArchiveSettingInt8;
        TextAppAutoArchiveSettingInt textAppAutoArchiveSettingInt9 = new TextAppAutoArchiveSettingInt("THREE_DAYS", 8, "THREE_DAYS");
        A0B = textAppAutoArchiveSettingInt9;
        TextAppAutoArchiveSettingInt[] textAppAutoArchiveSettingIntArr = {textAppAutoArchiveSettingInt, textAppAutoArchiveSettingInt2, textAppAutoArchiveSettingInt3, textAppAutoArchiveSettingInt4, textAppAutoArchiveSettingInt5, textAppAutoArchiveSettingInt6, textAppAutoArchiveSettingInt7, textAppAutoArchiveSettingInt8, textAppAutoArchiveSettingInt9, new TextAppAutoArchiveSettingInt("THREE_MINUTES", 9, "THREE_MINUTES")};
        A03 = textAppAutoArchiveSettingIntArr;
        A02 = AbstractC12190kN.A00(textAppAutoArchiveSettingIntArr);
        TextAppAutoArchiveSettingInt[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (TextAppAutoArchiveSettingInt textAppAutoArchiveSettingInt10 : values) {
            linkedHashMap.put(textAppAutoArchiveSettingInt10.A00, textAppAutoArchiveSettingInt10);
        }
        A01 = linkedHashMap;
        CREATOR = new C41857IgB(45);
    }

    public static TextAppAutoArchiveSettingInt valueOf(String str) {
        return (TextAppAutoArchiveSettingInt) Enum.valueOf(TextAppAutoArchiveSettingInt.class, str);
    }

    public static TextAppAutoArchiveSettingInt[] values() {
        return (TextAppAutoArchiveSettingInt[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextAppAutoArchiveSettingInt(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
