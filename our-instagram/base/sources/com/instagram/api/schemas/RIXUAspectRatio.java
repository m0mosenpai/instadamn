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
/* loaded from: classes3.dex */
public final class RIXUAspectRatio implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RIXUAspectRatio[] A03;
    public static final RIXUAspectRatio A04;
    public static final RIXUAspectRatio A05;
    public static final RIXUAspectRatio A06;
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
        RIXUAspectRatio rIXUAspectRatio = new RIXUAspectRatio("UNRECOGNIZED", 0, "RIXUAspectRatio_unspecified");
        A06 = rIXUAspectRatio;
        RIXUAspectRatio rIXUAspectRatio2 = new RIXUAspectRatio("AR_16_9", 1, "AR_16_9");
        A04 = rIXUAspectRatio2;
        RIXUAspectRatio rIXUAspectRatio3 = new RIXUAspectRatio("AR_4_3", 2, "AR_4_3");
        A05 = rIXUAspectRatio3;
        RIXUAspectRatio[] rIXUAspectRatioArr = {rIXUAspectRatio, rIXUAspectRatio2, rIXUAspectRatio3};
        A03 = rIXUAspectRatioArr;
        A02 = AbstractC12190kN.A00(rIXUAspectRatioArr);
        RIXUAspectRatio[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (RIXUAspectRatio rIXUAspectRatio4 : values) {
            linkedHashMap.put(rIXUAspectRatio4.A00, rIXUAspectRatio4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(91);
    }

    public static RIXUAspectRatio valueOf(String str) {
        return (RIXUAspectRatio) Enum.valueOf(RIXUAspectRatio.class, str);
    }

    public static RIXUAspectRatio[] values() {
        return (RIXUAspectRatio[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RIXUAspectRatio(String str, int i, String str2) {
        this.A00 = str2;
    }
}
