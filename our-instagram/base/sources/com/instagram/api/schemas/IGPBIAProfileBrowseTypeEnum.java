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
public final class IGPBIAProfileBrowseTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGPBIAProfileBrowseTypeEnum[] A03;
    public static final IGPBIAProfileBrowseTypeEnum A04;
    public static final IGPBIAProfileBrowseTypeEnum A05;
    public static final IGPBIAProfileBrowseTypeEnum A06;
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
        IGPBIAProfileBrowseTypeEnum iGPBIAProfileBrowseTypeEnum = new IGPBIAProfileBrowseTypeEnum("UNRECOGNIZED", 0, "IGPBIAProfileBrowseTypeEnum_unspecified");
        A06 = iGPBIAProfileBrowseTypeEnum;
        IGPBIAProfileBrowseTypeEnum iGPBIAProfileBrowseTypeEnum2 = new IGPBIAProfileBrowseTypeEnum("DEFAULT", 1, "DEFAULT");
        A04 = iGPBIAProfileBrowseTypeEnum2;
        IGPBIAProfileBrowseTypeEnum iGPBIAProfileBrowseTypeEnum3 = new IGPBIAProfileBrowseTypeEnum("PROFILE_BROWSE_HALF_SHEET", 2, "PROFILE_BROWSE_HALF_SHEET");
        A05 = iGPBIAProfileBrowseTypeEnum3;
        IGPBIAProfileBrowseTypeEnum[] iGPBIAProfileBrowseTypeEnumArr = {iGPBIAProfileBrowseTypeEnum, iGPBIAProfileBrowseTypeEnum2, iGPBIAProfileBrowseTypeEnum3, new IGPBIAProfileBrowseTypeEnum("PROFILE_BROWSE_HALF_SHEET_WITH_DISMISS", 3, "PROFILE_BROWSE_HALF_SHEET_WITH_DISMISS")};
        A03 = iGPBIAProfileBrowseTypeEnumArr;
        A02 = AbstractC12190kN.A00(iGPBIAProfileBrowseTypeEnumArr);
        IGPBIAProfileBrowseTypeEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGPBIAProfileBrowseTypeEnum iGPBIAProfileBrowseTypeEnum4 : values) {
            linkedHashMap.put(iGPBIAProfileBrowseTypeEnum4.A00, iGPBIAProfileBrowseTypeEnum4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(22);
    }

    public static IGPBIAProfileBrowseTypeEnum valueOf(String str) {
        return (IGPBIAProfileBrowseTypeEnum) Enum.valueOf(IGPBIAProfileBrowseTypeEnum.class, str);
    }

    public static IGPBIAProfileBrowseTypeEnum[] values() {
        return (IGPBIAProfileBrowseTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGPBIAProfileBrowseTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
