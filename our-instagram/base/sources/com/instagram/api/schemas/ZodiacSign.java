package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class ZodiacSign implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ZodiacSign[] A03;
    public static final ZodiacSign A04;
    public static final ZodiacSign A05;
    public static final ZodiacSign A06;
    public static final ZodiacSign A07;
    public static final ZodiacSign A08;
    public static final ZodiacSign A09;
    public static final ZodiacSign A0A;
    public static final ZodiacSign A0B;
    public static final ZodiacSign A0C;
    public static final ZodiacSign A0D;
    public static final ZodiacSign A0E;
    public static final ZodiacSign A0F;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ZodiacSign zodiacSign = new ZodiacSign("UNRECOGNIZED", 0, "ZodiacSign_unspecified");
        A0F = zodiacSign;
        ZodiacSign zodiacSign2 = new ZodiacSign("AQUARIUS", 1, "aquarius");
        A04 = zodiacSign2;
        ZodiacSign zodiacSign3 = new ZodiacSign("ARIES", 2, "aries");
        A05 = zodiacSign3;
        ZodiacSign zodiacSign4 = new ZodiacSign("CANCER", 3, "cancer");
        A06 = zodiacSign4;
        ZodiacSign zodiacSign5 = new ZodiacSign("CAPRICORN", 4, "capricorn");
        A07 = zodiacSign5;
        ZodiacSign zodiacSign6 = new ZodiacSign("GEMINI", 5, "gemini");
        A08 = zodiacSign6;
        ZodiacSign zodiacSign7 = new ZodiacSign("LEO", 6, "leo");
        A09 = zodiacSign7;
        ZodiacSign zodiacSign8 = new ZodiacSign("LIBRA", 7, "libra");
        A0A = zodiacSign8;
        ZodiacSign zodiacSign9 = new ZodiacSign("PISCES", 8, "pisces");
        A0B = zodiacSign9;
        ZodiacSign zodiacSign10 = new ZodiacSign("SAGITTARIUS", 9, "sagittarius");
        A0C = zodiacSign10;
        ZodiacSign zodiacSign11 = new ZodiacSign("SCORPIO", 10, "scorpio");
        A0D = zodiacSign11;
        ZodiacSign zodiacSign12 = new ZodiacSign("TAURUS", 11, "taurus");
        A0E = zodiacSign12;
        ZodiacSign[] zodiacSignArr = {zodiacSign, zodiacSign2, zodiacSign3, zodiacSign4, zodiacSign5, zodiacSign6, zodiacSign7, zodiacSign8, zodiacSign9, zodiacSign10, zodiacSign11, zodiacSign12, new ZodiacSign("VIRGO", 12, "virgo")};
        A03 = zodiacSignArr;
        A02 = AbstractC12190kN.A00(zodiacSignArr);
        ZodiacSign[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (ZodiacSign zodiacSign13 : values) {
            linkedHashMap.put(zodiacSign13.A00, zodiacSign13);
        }
        A01 = linkedHashMap;
        CREATOR = new C70220WId(3);
    }

    public static ZodiacSign valueOf(String str) {
        return (ZodiacSign) Enum.valueOf(ZodiacSign.class, str);
    }

    public static ZodiacSign[] values() {
        return (ZodiacSign[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ZodiacSign(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
