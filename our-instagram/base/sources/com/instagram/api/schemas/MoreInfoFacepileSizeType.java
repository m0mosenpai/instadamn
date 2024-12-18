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
public final class MoreInfoFacepileSizeType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MoreInfoFacepileSizeType[] A03;
    public static final MoreInfoFacepileSizeType A04;
    public static final MoreInfoFacepileSizeType A05;
    public static final MoreInfoFacepileSizeType A06;
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
        MoreInfoFacepileSizeType moreInfoFacepileSizeType = new MoreInfoFacepileSizeType("UNRECOGNIZED", 0, "MoreInfoFacepileSizeType_unspecified");
        A06 = moreInfoFacepileSizeType;
        MoreInfoFacepileSizeType moreInfoFacepileSizeType2 = new MoreInfoFacepileSizeType("LARGE", 1, "large");
        A04 = moreInfoFacepileSizeType2;
        MoreInfoFacepileSizeType moreInfoFacepileSizeType3 = new MoreInfoFacepileSizeType("SMALL", 2, "small");
        A05 = moreInfoFacepileSizeType3;
        MoreInfoFacepileSizeType[] moreInfoFacepileSizeTypeArr = {moreInfoFacepileSizeType, moreInfoFacepileSizeType2, moreInfoFacepileSizeType3};
        A03 = moreInfoFacepileSizeTypeArr;
        A02 = AbstractC12190kN.A00(moreInfoFacepileSizeTypeArr);
        MoreInfoFacepileSizeType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MoreInfoFacepileSizeType moreInfoFacepileSizeType4 : values) {
            linkedHashMap.put(moreInfoFacepileSizeType4.A00, moreInfoFacepileSizeType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(52);
    }

    public static MoreInfoFacepileSizeType valueOf(String str) {
        return (MoreInfoFacepileSizeType) Enum.valueOf(MoreInfoFacepileSizeType.class, str);
    }

    public static MoreInfoFacepileSizeType[] values() {
        return (MoreInfoFacepileSizeType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MoreInfoFacepileSizeType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
