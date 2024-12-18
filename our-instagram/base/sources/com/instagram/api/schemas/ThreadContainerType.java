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
public final class ThreadContainerType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ThreadContainerType[] A03;
    public static final ThreadContainerType A04;
    public static final ThreadContainerType A05;
    public static final ThreadContainerType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ThreadContainerType threadContainerType = new ThreadContainerType("UNRECOGNIZED", 0, "ThreadContainerType_unspecified");
        A06 = threadContainerType;
        ThreadContainerType threadContainerType2 = new ThreadContainerType("HEADER", 1, "header");
        A04 = threadContainerType2;
        ThreadContainerType threadContainerType3 = new ThreadContainerType("THREAD", 2, "thread");
        A05 = threadContainerType3;
        ThreadContainerType[] threadContainerTypeArr = {threadContainerType, threadContainerType2, threadContainerType3};
        A03 = threadContainerTypeArr;
        A02 = AbstractC12190kN.A00(threadContainerTypeArr);
        ThreadContainerType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ThreadContainerType threadContainerType4 : values) {
            A18.put(threadContainerType4.A00, threadContainerType4);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(64);
    }

    public static ThreadContainerType valueOf(String str) {
        return (ThreadContainerType) Enum.valueOf(ThreadContainerType.class, str);
    }

    public static ThreadContainerType[] values() {
        return (ThreadContainerType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ThreadContainerType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
