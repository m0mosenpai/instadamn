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
public final class IGAdTransparencyDisclaimerPlacement implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdTransparencyDisclaimerPlacement[] A03;
    public static final IGAdTransparencyDisclaimerPlacement A04;
    public static final IGAdTransparencyDisclaimerPlacement A05;
    public static final IGAdTransparencyDisclaimerPlacement A06;
    public static final IGAdTransparencyDisclaimerPlacement A07;
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
        IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement = new IGAdTransparencyDisclaimerPlacement("UNRECOGNIZED", 0, "IGAdTransparencyDisclaimerPlacement_unspecified");
        A07 = iGAdTransparencyDisclaimerPlacement;
        IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement2 = new IGAdTransparencyDisclaimerPlacement("ABOVE_IMAGE", 1, "ABOVE_IMAGE");
        A04 = iGAdTransparencyDisclaimerPlacement2;
        IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement3 = new IGAdTransparencyDisclaimerPlacement("BELOW_IMAGE", 2, "BELOW_IMAGE");
        A05 = iGAdTransparencyDisclaimerPlacement3;
        IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement4 = new IGAdTransparencyDisclaimerPlacement("OVERFLOW_MENU", 3, "OVERFLOW_MENU");
        A06 = iGAdTransparencyDisclaimerPlacement4;
        IGAdTransparencyDisclaimerPlacement[] iGAdTransparencyDisclaimerPlacementArr = {iGAdTransparencyDisclaimerPlacement, iGAdTransparencyDisclaimerPlacement2, iGAdTransparencyDisclaimerPlacement3, iGAdTransparencyDisclaimerPlacement4};
        A03 = iGAdTransparencyDisclaimerPlacementArr;
        A02 = AbstractC12190kN.A00(iGAdTransparencyDisclaimerPlacementArr);
        IGAdTransparencyDisclaimerPlacement[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement5 : values) {
            linkedHashMap.put(iGAdTransparencyDisclaimerPlacement5.A00, iGAdTransparencyDisclaimerPlacement5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(3);
    }

    public static IGAdTransparencyDisclaimerPlacement valueOf(String str) {
        return (IGAdTransparencyDisclaimerPlacement) Enum.valueOf(IGAdTransparencyDisclaimerPlacement.class, str);
    }

    public static IGAdTransparencyDisclaimerPlacement[] values() {
        return (IGAdTransparencyDisclaimerPlacement[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdTransparencyDisclaimerPlacement(String str, int i, String str2) {
        this.A00 = str2;
    }
}
