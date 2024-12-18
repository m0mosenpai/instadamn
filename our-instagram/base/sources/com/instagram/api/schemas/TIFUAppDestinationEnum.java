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
public final class TIFUAppDestinationEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TIFUAppDestinationEnum[] A03;
    public static final TIFUAppDestinationEnum A04;
    public static final TIFUAppDestinationEnum A05;
    public static final TIFUAppDestinationEnum A06;
    public static final TIFUAppDestinationEnum A07;
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
        TIFUAppDestinationEnum tIFUAppDestinationEnum = new TIFUAppDestinationEnum("UNRECOGNIZED", 0, "TIFUAppDestinationEnum_unspecified");
        A07 = tIFUAppDestinationEnum;
        TIFUAppDestinationEnum tIFUAppDestinationEnum2 = new TIFUAppDestinationEnum("APP_STORE", 1, "APP_STORE");
        A04 = tIFUAppDestinationEnum2;
        TIFUAppDestinationEnum tIFUAppDestinationEnum3 = new TIFUAppDestinationEnum("IG", 2, "IG");
        A05 = tIFUAppDestinationEnum3;
        TIFUAppDestinationEnum tIFUAppDestinationEnum4 = new TIFUAppDestinationEnum("MWEB", 3, "MWEB");
        A06 = tIFUAppDestinationEnum4;
        TIFUAppDestinationEnum[] tIFUAppDestinationEnumArr = {tIFUAppDestinationEnum, tIFUAppDestinationEnum2, tIFUAppDestinationEnum3, tIFUAppDestinationEnum4, new TIFUAppDestinationEnum("THREADS", 4, "THREADS")};
        A03 = tIFUAppDestinationEnumArr;
        A02 = AbstractC12190kN.A00(tIFUAppDestinationEnumArr);
        TIFUAppDestinationEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (TIFUAppDestinationEnum tIFUAppDestinationEnum5 : values) {
            linkedHashMap.put(tIFUAppDestinationEnum5.A00, tIFUAppDestinationEnum5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(28);
    }

    public static TIFUAppDestinationEnum valueOf(String str) {
        return (TIFUAppDestinationEnum) Enum.valueOf(TIFUAppDestinationEnum.class, str);
    }

    public static TIFUAppDestinationEnum[] values() {
        return (TIFUAppDestinationEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TIFUAppDestinationEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
