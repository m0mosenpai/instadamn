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
public final class ClipsTrimmingStrategy implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsTrimmingStrategy[] A03;
    public static final ClipsTrimmingStrategy A04;
    public static final ClipsTrimmingStrategy A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsTrimmingStrategy clipsTrimmingStrategy = new ClipsTrimmingStrategy("UNRECOGNIZED", 0, "ClipsTrimmingStrategy_unspecified");
        A05 = clipsTrimmingStrategy;
        ClipsTrimmingStrategy clipsTrimmingStrategy2 = new ClipsTrimmingStrategy("TEMPLATE", 1, "template");
        A04 = clipsTrimmingStrategy2;
        ClipsTrimmingStrategy[] clipsTrimmingStrategyArr = {clipsTrimmingStrategy, clipsTrimmingStrategy2, new ClipsTrimmingStrategy("SOUND_SYNC", 2, "sound_sync")};
        A03 = clipsTrimmingStrategyArr;
        A02 = AbstractC12190kN.A00(clipsTrimmingStrategyArr);
        ClipsTrimmingStrategy[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ClipsTrimmingStrategy clipsTrimmingStrategy3 : values) {
            A18.put(clipsTrimmingStrategy3.A00, clipsTrimmingStrategy3);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(19);
    }

    public static ClipsTrimmingStrategy valueOf(String str) {
        return (ClipsTrimmingStrategy) Enum.valueOf(ClipsTrimmingStrategy.class, str);
    }

    public static ClipsTrimmingStrategy[] values() {
        return (ClipsTrimmingStrategy[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsTrimmingStrategy(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
