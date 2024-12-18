package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class GoalsToastType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ GoalsToastType[] A03;
    public static final GoalsToastType A04;
    public static final GoalsToastType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        GoalsToastType goalsToastType = new GoalsToastType("UNRECOGNIZED", 0, "GoalsToastType_unspecified");
        A05 = goalsToastType;
        GoalsToastType goalsToastType2 = new GoalsToastType("COMPLETED", 1, "completed");
        A04 = goalsToastType2;
        GoalsToastType[] goalsToastTypeArr = {goalsToastType, goalsToastType2, new GoalsToastType("PROGRESS", 2, ReactProgressBarViewManager.PROP_PROGRESS)};
        A03 = goalsToastTypeArr;
        A02 = AbstractC12190kN.A00(goalsToastTypeArr);
        GoalsToastType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (GoalsToastType goalsToastType3 : values) {
            A18.put(goalsToastType3.A00, goalsToastType3);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(99);
    }

    public static GoalsToastType valueOf(String str) {
        return (GoalsToastType) Enum.valueOf(GoalsToastType.class, str);
    }

    public static GoalsToastType[] values() {
        return (GoalsToastType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public GoalsToastType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
