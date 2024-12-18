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
public final class IGAdsStoryInteractiveMediaGestureType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdsStoryInteractiveMediaGestureType[] A03;
    public static final IGAdsStoryInteractiveMediaGestureType A04;
    public static final IGAdsStoryInteractiveMediaGestureType A05;
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
        IGAdsStoryInteractiveMediaGestureType iGAdsStoryInteractiveMediaGestureType = new IGAdsStoryInteractiveMediaGestureType("UNRECOGNIZED", 0, "IGAdsStoryInteractiveMediaGestureType_unspecified");
        A05 = iGAdsStoryInteractiveMediaGestureType;
        IGAdsStoryInteractiveMediaGestureType iGAdsStoryInteractiveMediaGestureType2 = new IGAdsStoryInteractiveMediaGestureType("TAP_AND_HOLD_TO_INTERACT", 1, "TAP_AND_HOLD_TO_INTERACT");
        A04 = iGAdsStoryInteractiveMediaGestureType2;
        IGAdsStoryInteractiveMediaGestureType[] iGAdsStoryInteractiveMediaGestureTypeArr = {iGAdsStoryInteractiveMediaGestureType, iGAdsStoryInteractiveMediaGestureType2, new IGAdsStoryInteractiveMediaGestureType("TAP_TO_INTERACT", 2, "TAP_TO_INTERACT")};
        A03 = iGAdsStoryInteractiveMediaGestureTypeArr;
        A02 = AbstractC12190kN.A00(iGAdsStoryInteractiveMediaGestureTypeArr);
        IGAdsStoryInteractiveMediaGestureType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGAdsStoryInteractiveMediaGestureType iGAdsStoryInteractiveMediaGestureType3 : values) {
            linkedHashMap.put(iGAdsStoryInteractiveMediaGestureType3.A00, iGAdsStoryInteractiveMediaGestureType3);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(12);
    }

    public static IGAdsStoryInteractiveMediaGestureType valueOf(String str) {
        return (IGAdsStoryInteractiveMediaGestureType) Enum.valueOf(IGAdsStoryInteractiveMediaGestureType.class, str);
    }

    public static IGAdsStoryInteractiveMediaGestureType[] values() {
        return (IGAdsStoryInteractiveMediaGestureType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdsStoryInteractiveMediaGestureType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
