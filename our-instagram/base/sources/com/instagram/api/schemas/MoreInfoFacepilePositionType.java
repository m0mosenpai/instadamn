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
public final class MoreInfoFacepilePositionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MoreInfoFacepilePositionType[] A03;
    public static final MoreInfoFacepilePositionType A04;
    public static final MoreInfoFacepilePositionType A05;
    public static final MoreInfoFacepilePositionType A06;
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
        MoreInfoFacepilePositionType moreInfoFacepilePositionType = new MoreInfoFacepilePositionType("UNRECOGNIZED", 0, "MoreInfoFacepilePositionType_unspecified");
        A06 = moreInfoFacepilePositionType;
        MoreInfoFacepilePositionType moreInfoFacepilePositionType2 = new MoreInfoFacepilePositionType("BEFORE_TEXT", 1, "before_text");
        A04 = moreInfoFacepilePositionType2;
        MoreInfoFacepilePositionType moreInfoFacepilePositionType3 = new MoreInfoFacepilePositionType("BELOW_TEXT", 2, "below_text");
        A05 = moreInfoFacepilePositionType3;
        MoreInfoFacepilePositionType[] moreInfoFacepilePositionTypeArr = {moreInfoFacepilePositionType, moreInfoFacepilePositionType2, moreInfoFacepilePositionType3};
        A03 = moreInfoFacepilePositionTypeArr;
        A02 = AbstractC12190kN.A00(moreInfoFacepilePositionTypeArr);
        MoreInfoFacepilePositionType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MoreInfoFacepilePositionType moreInfoFacepilePositionType4 : values) {
            linkedHashMap.put(moreInfoFacepilePositionType4.A00, moreInfoFacepilePositionType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(51);
    }

    public static MoreInfoFacepilePositionType valueOf(String str) {
        return (MoreInfoFacepilePositionType) Enum.valueOf(MoreInfoFacepilePositionType.class, str);
    }

    public static MoreInfoFacepilePositionType[] values() {
        return (MoreInfoFacepilePositionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MoreInfoFacepilePositionType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
