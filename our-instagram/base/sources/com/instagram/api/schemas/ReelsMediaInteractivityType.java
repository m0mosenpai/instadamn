package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ReelsMediaInteractivityType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ReelsMediaInteractivityType[] A03;
    public static final ReelsMediaInteractivityType A04;
    public static final ReelsMediaInteractivityType A05;
    public static final ReelsMediaInteractivityType A06;
    public static final ReelsMediaInteractivityType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ReelsMediaInteractivityType reelsMediaInteractivityType = new ReelsMediaInteractivityType("UNRECOGNIZED", 0, "ReelsMediaInteractivityType_unspecified");
        A07 = reelsMediaInteractivityType;
        ReelsMediaInteractivityType reelsMediaInteractivityType2 = new ReelsMediaInteractivityType("LONG_PRESS_FOLLOW", 1, "LONG_PRESS_FOLLOW");
        A04 = reelsMediaInteractivityType2;
        ReelsMediaInteractivityType reelsMediaInteractivityType3 = new ReelsMediaInteractivityType("LONG_PRESS_RELEASE", 2, "LONG_PRESS_RELEASE");
        A05 = reelsMediaInteractivityType3;
        ReelsMediaInteractivityType reelsMediaInteractivityType4 = new ReelsMediaInteractivityType("SINGLE_TAP", 3, "SINGLE_TAP");
        A06 = reelsMediaInteractivityType4;
        ReelsMediaInteractivityType[] reelsMediaInteractivityTypeArr = {reelsMediaInteractivityType, reelsMediaInteractivityType2, reelsMediaInteractivityType3, reelsMediaInteractivityType4};
        A03 = reelsMediaInteractivityTypeArr;
        A02 = AbstractC12190kN.A00(reelsMediaInteractivityTypeArr);
        ReelsMediaInteractivityType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ReelsMediaInteractivityType reelsMediaInteractivityType5 : values) {
            A18.put(reelsMediaInteractivityType5.A00, reelsMediaInteractivityType5);
        }
        A01 = A18;
        CREATOR = new C41855Ig9(89);
    }

    public static ReelsMediaInteractivityType valueOf(String str) {
        return (ReelsMediaInteractivityType) Enum.valueOf(ReelsMediaInteractivityType.class, str);
    }

    public static ReelsMediaInteractivityType[] values() {
        return (ReelsMediaInteractivityType[]) A03.clone();
    }

    public ReelsMediaInteractivityType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
