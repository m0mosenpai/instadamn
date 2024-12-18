package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ScreenTimeScreenType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ScreenTimeScreenType[] A03;
    public static final ScreenTimeScreenType A04;
    public static final ScreenTimeScreenType A05;
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
        ScreenTimeScreenType screenTimeScreenType = new ScreenTimeScreenType("UNRECOGNIZED", 0, "ScreenTimeScreenType_unspecified");
        A05 = screenTimeScreenType;
        ScreenTimeScreenType screenTimeScreenType2 = new ScreenTimeScreenType("GUARDIAN_DAILY_LIMIT_BLOCKING_SCREEN", 1, "guardian_daily_limit_blocking_screen");
        A04 = screenTimeScreenType2;
        ScreenTimeScreenType[] screenTimeScreenTypeArr = {screenTimeScreenType, screenTimeScreenType2};
        A03 = screenTimeScreenTypeArr;
        A02 = AbstractC12190kN.A00(screenTimeScreenTypeArr);
        ScreenTimeScreenType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ScreenTimeScreenType screenTimeScreenType3 : values) {
            linkedHashMap.put(screenTimeScreenType3.A00, screenTimeScreenType3);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(4);
    }

    public static ScreenTimeScreenType valueOf(String str) {
        return (ScreenTimeScreenType) Enum.valueOf(ScreenTimeScreenType.class, str);
    }

    public static ScreenTimeScreenType[] values() {
        return (ScreenTimeScreenType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ScreenTimeScreenType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
