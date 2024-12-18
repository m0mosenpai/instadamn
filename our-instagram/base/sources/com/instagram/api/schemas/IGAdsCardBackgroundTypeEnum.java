package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class IGAdsCardBackgroundTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdsCardBackgroundTypeEnum[] A03;
    public static final IGAdsCardBackgroundTypeEnum A04;
    public static final IGAdsCardBackgroundTypeEnum A05;
    public static final IGAdsCardBackgroundTypeEnum A06;
    public static final IGAdsCardBackgroundTypeEnum A07;
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
        IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum = new IGAdsCardBackgroundTypeEnum("UNRECOGNIZED", 0, "IGAdsCardBackgroundTypeEnum_unspecified");
        A07 = iGAdsCardBackgroundTypeEnum;
        IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum2 = new IGAdsCardBackgroundTypeEnum("BLURRED_CROPPED_IMAGE", 1, "BLURRED_CROPPED_IMAGE");
        A04 = iGAdsCardBackgroundTypeEnum2;
        IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum3 = new IGAdsCardBackgroundTypeEnum("DIMMED_IMAGE", 2, "DIMMED_IMAGE");
        A05 = iGAdsCardBackgroundTypeEnum3;
        IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum4 = new IGAdsCardBackgroundTypeEnum(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 3, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A06 = iGAdsCardBackgroundTypeEnum4;
        IGAdsCardBackgroundTypeEnum[] iGAdsCardBackgroundTypeEnumArr = {iGAdsCardBackgroundTypeEnum, iGAdsCardBackgroundTypeEnum2, iGAdsCardBackgroundTypeEnum3, iGAdsCardBackgroundTypeEnum4, new IGAdsCardBackgroundTypeEnum("PORTAL_COLOR_GRADIENT", 4, "PORTAL_COLOR_GRADIENT")};
        A03 = iGAdsCardBackgroundTypeEnumArr;
        A02 = AbstractC12190kN.A00(iGAdsCardBackgroundTypeEnumArr);
        IGAdsCardBackgroundTypeEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum5 : values) {
            linkedHashMap.put(iGAdsCardBackgroundTypeEnum5.A00, iGAdsCardBackgroundTypeEnum5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(4);
    }

    public static IGAdsCardBackgroundTypeEnum valueOf(String str) {
        return (IGAdsCardBackgroundTypeEnum) Enum.valueOf(IGAdsCardBackgroundTypeEnum.class, str);
    }

    public static IGAdsCardBackgroundTypeEnum[] values() {
        return (IGAdsCardBackgroundTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdsCardBackgroundTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
