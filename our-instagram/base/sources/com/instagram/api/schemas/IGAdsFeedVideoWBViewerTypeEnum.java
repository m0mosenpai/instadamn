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
public final class IGAdsFeedVideoWBViewerTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdsFeedVideoWBViewerTypeEnum[] A03;
    public static final IGAdsFeedVideoWBViewerTypeEnum A04;
    public static final IGAdsFeedVideoWBViewerTypeEnum A05;
    public static final IGAdsFeedVideoWBViewerTypeEnum A06;
    public static final IGAdsFeedVideoWBViewerTypeEnum A07;
    public static final IGAdsFeedVideoWBViewerTypeEnum A08;
    public static final IGAdsFeedVideoWBViewerTypeEnum A09;
    public static final IGAdsFeedVideoWBViewerTypeEnum A0A;
    public static final IGAdsFeedVideoWBViewerTypeEnum A0B;
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
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum = new IGAdsFeedVideoWBViewerTypeEnum("UNRECOGNIZED", 0, "IGAdsFeedVideoWBViewerTypeEnum_unspecified");
        A0B = iGAdsFeedVideoWBViewerTypeEnum;
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum2 = new IGAdsFeedVideoWBViewerTypeEnum("NO_POST_TAP_VIEWER", 1, "NO_POST_TAP_VIEWER");
        A04 = iGAdsFeedVideoWBViewerTypeEnum2;
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum3 = new IGAdsFeedVideoWBViewerTypeEnum("POST_TAP_REELS_VIEWER", 2, "POST_TAP_REELS_VIEWER");
        A05 = iGAdsFeedVideoWBViewerTypeEnum3;
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum4 = new IGAdsFeedVideoWBViewerTypeEnum("POST_TAP_REELS_VIEWER_WITH_CHAINING", 3, "POST_TAP_REELS_VIEWER_WITH_CHAINING");
        A06 = iGAdsFeedVideoWBViewerTypeEnum4;
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum5 = new IGAdsFeedVideoWBViewerTypeEnum("POST_TAP_WATCH_AND_BROWSE_VIEWER", 4, "POST_TAP_WATCH_AND_BROWSE_VIEWER");
        A07 = iGAdsFeedVideoWBViewerTypeEnum5;
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum6 = new IGAdsFeedVideoWBViewerTypeEnum("POST_TAP_WATCH_AND_BROWSE_VIEWER_FOR_LEAD_ADS", 5, "POST_TAP_WATCH_AND_BROWSE_VIEWER_FOR_LEAD_ADS");
        A08 = iGAdsFeedVideoWBViewerTypeEnum6;
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum7 = new IGAdsFeedVideoWBViewerTypeEnum("POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER", 6, "POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER");
        A09 = iGAdsFeedVideoWBViewerTypeEnum7;
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum8 = new IGAdsFeedVideoWBViewerTypeEnum("POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER_WITH_CHAINING", 7, "POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER_WITH_CHAINING");
        A0A = iGAdsFeedVideoWBViewerTypeEnum8;
        IGAdsFeedVideoWBViewerTypeEnum[] iGAdsFeedVideoWBViewerTypeEnumArr = {iGAdsFeedVideoWBViewerTypeEnum, iGAdsFeedVideoWBViewerTypeEnum2, iGAdsFeedVideoWBViewerTypeEnum3, iGAdsFeedVideoWBViewerTypeEnum4, iGAdsFeedVideoWBViewerTypeEnum5, iGAdsFeedVideoWBViewerTypeEnum6, iGAdsFeedVideoWBViewerTypeEnum7, iGAdsFeedVideoWBViewerTypeEnum8, new IGAdsFeedVideoWBViewerTypeEnum("POST_TAP_WATCH_AND_BROWSE_VIEWER_WITH_CHAINING_FOR_LEAD_ADS", 8, "POST_TAP_WATCH_AND_BROWSE_VIEWER_WITH_CHAINING_FOR_LEAD_ADS")};
        A03 = iGAdsFeedVideoWBViewerTypeEnumArr;
        A02 = AbstractC12190kN.A00(iGAdsFeedVideoWBViewerTypeEnumArr);
        IGAdsFeedVideoWBViewerTypeEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum9 : values) {
            linkedHashMap.put(iGAdsFeedVideoWBViewerTypeEnum9.A00, iGAdsFeedVideoWBViewerTypeEnum9);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(8);
    }

    public static IGAdsFeedVideoWBViewerTypeEnum valueOf(String str) {
        return (IGAdsFeedVideoWBViewerTypeEnum) Enum.valueOf(IGAdsFeedVideoWBViewerTypeEnum.class, str);
    }

    public static IGAdsFeedVideoWBViewerTypeEnum[] values() {
        return (IGAdsFeedVideoWBViewerTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdsFeedVideoWBViewerTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
