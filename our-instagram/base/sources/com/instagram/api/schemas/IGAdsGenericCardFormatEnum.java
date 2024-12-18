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
public final class IGAdsGenericCardFormatEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdsGenericCardFormatEnum[] A03;
    public static final IGAdsGenericCardFormatEnum A04;
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
        IGAdsGenericCardFormatEnum iGAdsGenericCardFormatEnum = new IGAdsGenericCardFormatEnum("UNRECOGNIZED", 0, "IGAdsGenericCardFormatEnum_unspecified");
        A04 = iGAdsGenericCardFormatEnum;
        IGAdsGenericCardFormatEnum[] iGAdsGenericCardFormatEnumArr = {iGAdsGenericCardFormatEnum, new IGAdsGenericCardFormatEnum("INTERACTIVE", 1, "INTERACTIVE")};
        A03 = iGAdsGenericCardFormatEnumArr;
        A02 = AbstractC12190kN.A00(iGAdsGenericCardFormatEnumArr);
        IGAdsGenericCardFormatEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGAdsGenericCardFormatEnum iGAdsGenericCardFormatEnum2 : values) {
            linkedHashMap.put(iGAdsGenericCardFormatEnum2.A00, iGAdsGenericCardFormatEnum2);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(9);
    }

    public static IGAdsGenericCardFormatEnum valueOf(String str) {
        return (IGAdsGenericCardFormatEnum) Enum.valueOf(IGAdsGenericCardFormatEnum.class, str);
    }

    public static IGAdsGenericCardFormatEnum[] values() {
        return (IGAdsGenericCardFormatEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdsGenericCardFormatEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
