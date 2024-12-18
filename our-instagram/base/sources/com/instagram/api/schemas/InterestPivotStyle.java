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
/* loaded from: classes2.dex */
public final class InterestPivotStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ InterestPivotStyle[] A03;
    public static final InterestPivotStyle A04;
    public static final InterestPivotStyle A05;
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
        InterestPivotStyle interestPivotStyle = new InterestPivotStyle("UNRECOGNIZED", 0, "InterestPivotStyle_unspecified");
        A05 = interestPivotStyle;
        InterestPivotStyle interestPivotStyle2 = new InterestPivotStyle("UAS", 1, "uas");
        A04 = interestPivotStyle2;
        InterestPivotStyle[] interestPivotStyleArr = {interestPivotStyle, interestPivotStyle2};
        A03 = interestPivotStyleArr;
        A02 = AbstractC12190kN.A00(interestPivotStyleArr);
        InterestPivotStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (InterestPivotStyle interestPivotStyle3 : values) {
            linkedHashMap.put(interestPivotStyle3.A00, interestPivotStyle3);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(34);
    }

    public static InterestPivotStyle valueOf(String str) {
        return (InterestPivotStyle) Enum.valueOf(InterestPivotStyle.class, str);
    }

    public static InterestPivotStyle[] values() {
        return (InterestPivotStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public InterestPivotStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}
