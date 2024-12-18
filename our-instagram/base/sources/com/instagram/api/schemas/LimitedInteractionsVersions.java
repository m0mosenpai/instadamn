package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LimitedInteractionsVersions implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ LimitedInteractionsVersions[] A03;
    public static final LimitedInteractionsVersions A04;
    public static final LimitedInteractionsVersions A05;
    public static final LimitedInteractionsVersions A06;
    public static final LimitedInteractionsVersions A07;
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
        LimitedInteractionsVersions limitedInteractionsVersions = new LimitedInteractionsVersions("UNRECOGNIZED", 0, "LimitedInteractionsVersions_unspecified");
        A04 = limitedInteractionsVersions;
        LimitedInteractionsVersions limitedInteractionsVersions2 = new LimitedInteractionsVersions("V1", 1, "V1");
        A05 = limitedInteractionsVersions2;
        LimitedInteractionsVersions limitedInteractionsVersions3 = new LimitedInteractionsVersions("V2_CUSTOMIZABLE", 2, "V2_CUSTOMIZABLE");
        A06 = limitedInteractionsVersions3;
        LimitedInteractionsVersions limitedInteractionsVersions4 = new LimitedInteractionsVersions("V2_NOT_CUSTOMIZABLE", 3, "V2_NOT_CUSTOMIZABLE");
        A07 = limitedInteractionsVersions4;
        LimitedInteractionsVersions[] limitedInteractionsVersionsArr = {limitedInteractionsVersions, limitedInteractionsVersions2, limitedInteractionsVersions3, limitedInteractionsVersions4};
        A03 = limitedInteractionsVersionsArr;
        A02 = AbstractC12190kN.A00(limitedInteractionsVersionsArr);
        LimitedInteractionsVersions[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (LimitedInteractionsVersions limitedInteractionsVersions5 : values) {
            linkedHashMap.put(limitedInteractionsVersions5.A00, limitedInteractionsVersions5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(35);
    }

    public static LimitedInteractionsVersions valueOf(String str) {
        return (LimitedInteractionsVersions) Enum.valueOf(LimitedInteractionsVersions.class, str);
    }

    public static LimitedInteractionsVersions[] values() {
        return (LimitedInteractionsVersions[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public LimitedInteractionsVersions(String str, int i, String str2) {
        this.A00 = str2;
    }
}
