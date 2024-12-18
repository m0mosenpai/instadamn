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
public final class RIXUCoverChainingType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RIXUCoverChainingType[] A03;
    public static final RIXUCoverChainingType A04;
    public static final RIXUCoverChainingType A05;
    public static final RIXUCoverChainingType A06;
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
        RIXUCoverChainingType rIXUCoverChainingType = new RIXUCoverChainingType("UNRECOGNIZED", 0, "RIXUCoverChainingType_unspecified");
        A06 = rIXUCoverChainingType;
        RIXUCoverChainingType rIXUCoverChainingType2 = new RIXUCoverChainingType("CONTEXTUAL_CHAINING", 1, "contextual_chaining");
        A04 = rIXUCoverChainingType2;
        RIXUCoverChainingType rIXUCoverChainingType3 = new RIXUCoverChainingType("UNIFIED_CHAINING", 2, "unified_chaining");
        A05 = rIXUCoverChainingType3;
        RIXUCoverChainingType[] rIXUCoverChainingTypeArr = {rIXUCoverChainingType, rIXUCoverChainingType2, rIXUCoverChainingType3};
        A03 = rIXUCoverChainingTypeArr;
        A02 = AbstractC12190kN.A00(rIXUCoverChainingTypeArr);
        RIXUCoverChainingType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (RIXUCoverChainingType rIXUCoverChainingType4 : values) {
            linkedHashMap.put(rIXUCoverChainingType4.A00, rIXUCoverChainingType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(93);
    }

    public static RIXUCoverChainingType valueOf(String str) {
        return (RIXUCoverChainingType) Enum.valueOf(RIXUCoverChainingType.class, str);
    }

    public static RIXUCoverChainingType[] values() {
        return (RIXUCoverChainingType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RIXUCoverChainingType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
