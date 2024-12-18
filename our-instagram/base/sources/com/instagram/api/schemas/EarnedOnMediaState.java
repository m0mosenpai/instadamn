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
/* loaded from: classes5.dex */
public final class EarnedOnMediaState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EarnedOnMediaState[] A03;
    public static final EarnedOnMediaState A04;
    public static final EarnedOnMediaState A05;
    public static final EarnedOnMediaState A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        EarnedOnMediaState earnedOnMediaState = new EarnedOnMediaState("UNRECOGNIZED", 0, "EarnedOnMediaState_unspecified");
        A06 = earnedOnMediaState;
        EarnedOnMediaState earnedOnMediaState2 = new EarnedOnMediaState("ARCHIVED", 1, "ARCHIVED");
        A04 = earnedOnMediaState2;
        EarnedOnMediaState earnedOnMediaState3 = new EarnedOnMediaState("DELETED", 2, "DELETED");
        A05 = earnedOnMediaState3;
        EarnedOnMediaState[] earnedOnMediaStateArr = {earnedOnMediaState, earnedOnMediaState2, earnedOnMediaState3, new EarnedOnMediaState("PUBLIC", 3, "PUBLIC")};
        A03 = earnedOnMediaStateArr;
        A02 = AbstractC12190kN.A00(earnedOnMediaStateArr);
        EarnedOnMediaState[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EarnedOnMediaState earnedOnMediaState4 : values) {
            A18.put(earnedOnMediaState4.A00, earnedOnMediaState4);
        }
        A01 = A18;
        CREATOR = new C41854Ig8(67);
    }

    public static EarnedOnMediaState valueOf(String str) {
        return (EarnedOnMediaState) Enum.valueOf(EarnedOnMediaState.class, str);
    }

    public static EarnedOnMediaState[] values() {
        return (EarnedOnMediaState[]) A03.clone();
    }

    public EarnedOnMediaState(String str, int i, String str2) {
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
