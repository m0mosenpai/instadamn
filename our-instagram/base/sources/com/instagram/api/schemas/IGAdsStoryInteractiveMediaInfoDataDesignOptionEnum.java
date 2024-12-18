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
public final class IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum[] A03;
    public static final IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum A04;
    public static final IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum A05;
    public static final IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum A06;
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
        IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum = new IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum("UNRECOGNIZED", 0, "IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum_unspecified");
        A06 = iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum;
        IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum2 = new IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum("IMAGE_WITHOUT_ICON", 1, "IMAGE_WITHOUT_ICON");
        A04 = iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum2;
        IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum3 = new IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum("IMAGE_WITH_ICON", 2, "IMAGE_WITH_ICON");
        A05 = iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum3;
        IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum[] iGAdsStoryInteractiveMediaInfoDataDesignOptionEnumArr = {iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum, iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum2, iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum3};
        A03 = iGAdsStoryInteractiveMediaInfoDataDesignOptionEnumArr;
        A02 = AbstractC12190kN.A00(iGAdsStoryInteractiveMediaInfoDataDesignOptionEnumArr);
        IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum4 : values) {
            linkedHashMap.put(iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum4.A00, iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(13);
    }

    public static IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum valueOf(String str) {
        return (IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum) Enum.valueOf(IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum.class, str);
    }

    public static IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum[] values() {
        return (IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
