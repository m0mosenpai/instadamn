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
public final class RIXULayoutStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RIXULayoutStyle[] A03;
    public static final RIXULayoutStyle A04;
    public static final RIXULayoutStyle A05;
    public static final RIXULayoutStyle A06;
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
        RIXULayoutStyle rIXULayoutStyle = new RIXULayoutStyle("UNRECOGNIZED", 0, "RIXULayoutStyle_unspecified");
        A06 = rIXULayoutStyle;
        RIXULayoutStyle rIXULayoutStyle2 = new RIXULayoutStyle("CONTAINER", 1, "container");
        A04 = rIXULayoutStyle2;
        RIXULayoutStyle rIXULayoutStyle3 = new RIXULayoutStyle("FULL_BLEED", 2, "full_bleed");
        A05 = rIXULayoutStyle3;
        RIXULayoutStyle[] rIXULayoutStyleArr = {rIXULayoutStyle, rIXULayoutStyle2, rIXULayoutStyle3};
        A03 = rIXULayoutStyleArr;
        A02 = AbstractC12190kN.A00(rIXULayoutStyleArr);
        RIXULayoutStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (RIXULayoutStyle rIXULayoutStyle4 : values) {
            linkedHashMap.put(rIXULayoutStyle4.A00, rIXULayoutStyle4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(96);
    }

    public static RIXULayoutStyle valueOf(String str) {
        return (RIXULayoutStyle) Enum.valueOf(RIXULayoutStyle.class, str);
    }

    public static RIXULayoutStyle[] values() {
        return (RIXULayoutStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RIXULayoutStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}
