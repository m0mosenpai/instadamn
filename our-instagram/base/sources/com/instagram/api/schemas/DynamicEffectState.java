package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class DynamicEffectState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DynamicEffectState[] A03;
    public static final DynamicEffectState A04;
    public static final DynamicEffectState A05;
    public static final DynamicEffectState A06;
    public static final DynamicEffectState A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        DynamicEffectState dynamicEffectState = new DynamicEffectState("UNRECOGNIZED", 0, "DynamicEffectState_unspecified");
        A07 = dynamicEffectState;
        DynamicEffectState dynamicEffectState2 = new DynamicEffectState("DISABLED", 1, "DISABLED");
        A04 = dynamicEffectState2;
        DynamicEffectState dynamicEffectState3 = new DynamicEffectState("ENABLED", 2, "ENABLED");
        A05 = dynamicEffectState3;
        DynamicEffectState dynamicEffectState4 = new DynamicEffectState("TEST", 3, "TEST");
        A06 = dynamicEffectState4;
        DynamicEffectState[] dynamicEffectStateArr = {dynamicEffectState, dynamicEffectState2, dynamicEffectState3, dynamicEffectState4};
        A03 = dynamicEffectStateArr;
        A02 = AbstractC12190kN.A00(dynamicEffectStateArr);
        DynamicEffectState[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (DynamicEffectState dynamicEffectState5 : values) {
            A18.put(dynamicEffectState5.A00, dynamicEffectState5);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(65);
    }

    public static DynamicEffectState valueOf(String str) {
        return (DynamicEffectState) Enum.valueOf(DynamicEffectState.class, str);
    }

    public static DynamicEffectState[] values() {
        return (DynamicEffectState[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public DynamicEffectState(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
