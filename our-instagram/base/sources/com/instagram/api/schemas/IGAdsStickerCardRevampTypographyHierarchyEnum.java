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
public final class IGAdsStickerCardRevampTypographyHierarchyEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdsStickerCardRevampTypographyHierarchyEnum[] A03;
    public static final IGAdsStickerCardRevampTypographyHierarchyEnum A04;
    public static final IGAdsStickerCardRevampTypographyHierarchyEnum A05;
    public static final IGAdsStickerCardRevampTypographyHierarchyEnum A06;
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
        IGAdsStickerCardRevampTypographyHierarchyEnum iGAdsStickerCardRevampTypographyHierarchyEnum = new IGAdsStickerCardRevampTypographyHierarchyEnum("UNRECOGNIZED", 0, "IGAdsStickerCardRevampTypographyHierarchyEnum_unspecified");
        A06 = iGAdsStickerCardRevampTypographyHierarchyEnum;
        IGAdsStickerCardRevampTypographyHierarchyEnum iGAdsStickerCardRevampTypographyHierarchyEnum2 = new IGAdsStickerCardRevampTypographyHierarchyEnum("NO_CHANGE", 1, "NO_CHANGE");
        A04 = iGAdsStickerCardRevampTypographyHierarchyEnum2;
        IGAdsStickerCardRevampTypographyHierarchyEnum iGAdsStickerCardRevampTypographyHierarchyEnum3 = new IGAdsStickerCardRevampTypographyHierarchyEnum("SIGNAL_2_BOTTOM_BOLD", 2, "SIGNAL_2_BOTTOM_BOLD");
        A05 = iGAdsStickerCardRevampTypographyHierarchyEnum3;
        IGAdsStickerCardRevampTypographyHierarchyEnum[] iGAdsStickerCardRevampTypographyHierarchyEnumArr = {iGAdsStickerCardRevampTypographyHierarchyEnum, iGAdsStickerCardRevampTypographyHierarchyEnum2, iGAdsStickerCardRevampTypographyHierarchyEnum3, new IGAdsStickerCardRevampTypographyHierarchyEnum("SIGNAL_2_TOP_LIGHT", 3, "SIGNAL_2_TOP_LIGHT")};
        A03 = iGAdsStickerCardRevampTypographyHierarchyEnumArr;
        A02 = AbstractC12190kN.A00(iGAdsStickerCardRevampTypographyHierarchyEnumArr);
        IGAdsStickerCardRevampTypographyHierarchyEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGAdsStickerCardRevampTypographyHierarchyEnum iGAdsStickerCardRevampTypographyHierarchyEnum4 : values) {
            linkedHashMap.put(iGAdsStickerCardRevampTypographyHierarchyEnum4.A00, iGAdsStickerCardRevampTypographyHierarchyEnum4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(11);
    }

    public static IGAdsStickerCardRevampTypographyHierarchyEnum valueOf(String str) {
        return (IGAdsStickerCardRevampTypographyHierarchyEnum) Enum.valueOf(IGAdsStickerCardRevampTypographyHierarchyEnum.class, str);
    }

    public static IGAdsStickerCardRevampTypographyHierarchyEnum[] values() {
        return (IGAdsStickerCardRevampTypographyHierarchyEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdsStickerCardRevampTypographyHierarchyEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
