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
public final class IGLiveModeratorEligibilityType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGLiveModeratorEligibilityType[] A03;
    public static final IGLiveModeratorEligibilityType A04;
    public static final IGLiveModeratorEligibilityType A05;
    public static final IGLiveModeratorEligibilityType A06;
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
        IGLiveModeratorEligibilityType iGLiveModeratorEligibilityType = new IGLiveModeratorEligibilityType("UNRECOGNIZED", 0, "IGLiveModeratorEligibilityType_unspecified");
        A06 = iGLiveModeratorEligibilityType;
        IGLiveModeratorEligibilityType iGLiveModeratorEligibilityType2 = new IGLiveModeratorEligibilityType("ELIGIBLE", 1, "eligible");
        A04 = iGLiveModeratorEligibilityType2;
        IGLiveModeratorEligibilityType iGLiveModeratorEligibilityType3 = new IGLiveModeratorEligibilityType("INELIGIBLE", 2, "ineligible");
        A05 = iGLiveModeratorEligibilityType3;
        IGLiveModeratorEligibilityType[] iGLiveModeratorEligibilityTypeArr = {iGLiveModeratorEligibilityType, iGLiveModeratorEligibilityType2, iGLiveModeratorEligibilityType3};
        A03 = iGLiveModeratorEligibilityTypeArr;
        A02 = AbstractC12190kN.A00(iGLiveModeratorEligibilityTypeArr);
        IGLiveModeratorEligibilityType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGLiveModeratorEligibilityType iGLiveModeratorEligibilityType4 : values) {
            linkedHashMap.put(iGLiveModeratorEligibilityType4.A00, iGLiveModeratorEligibilityType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(18);
    }

    public static IGLiveModeratorEligibilityType valueOf(String str) {
        return (IGLiveModeratorEligibilityType) Enum.valueOf(IGLiveModeratorEligibilityType.class, str);
    }

    public static IGLiveModeratorEligibilityType[] values() {
        return (IGLiveModeratorEligibilityType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGLiveModeratorEligibilityType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
