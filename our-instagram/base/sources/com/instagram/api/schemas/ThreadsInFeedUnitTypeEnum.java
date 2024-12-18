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
public final class ThreadsInFeedUnitTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ThreadsInFeedUnitTypeEnum[] A03;
    public static final ThreadsInFeedUnitTypeEnum A04;
    public static final ThreadsInFeedUnitTypeEnum A05;
    public static final ThreadsInFeedUnitTypeEnum A06;
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
        ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum = new ThreadsInFeedUnitTypeEnum("UNRECOGNIZED", 0, "ThreadsInFeedUnitTypeEnum_unspecified");
        A06 = threadsInFeedUnitTypeEnum;
        ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum2 = new ThreadsInFeedUnitTypeEnum("ACQUISITION", 1, "ACQUISITION");
        A04 = threadsInFeedUnitTypeEnum2;
        ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum3 = new ThreadsInFeedUnitTypeEnum("RETENTION", 2, "RETENTION");
        A05 = threadsInFeedUnitTypeEnum3;
        ThreadsInFeedUnitTypeEnum[] threadsInFeedUnitTypeEnumArr = {threadsInFeedUnitTypeEnum, threadsInFeedUnitTypeEnum2, threadsInFeedUnitTypeEnum3, new ThreadsInFeedUnitTypeEnum("WEB", 3, "WEB")};
        A03 = threadsInFeedUnitTypeEnumArr;
        A02 = AbstractC12190kN.A00(threadsInFeedUnitTypeEnumArr);
        ThreadsInFeedUnitTypeEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum4 : values) {
            linkedHashMap.put(threadsInFeedUnitTypeEnum4.A00, threadsInFeedUnitTypeEnum4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(32);
    }

    public static ThreadsInFeedUnitTypeEnum valueOf(String str) {
        return (ThreadsInFeedUnitTypeEnum) Enum.valueOf(ThreadsInFeedUnitTypeEnum.class, str);
    }

    public static ThreadsInFeedUnitTypeEnum[] values() {
        return (ThreadsInFeedUnitTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ThreadsInFeedUnitTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
