package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MediaTrialGraduationStrategy implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaTrialGraduationStrategy[] A03;
    public static final MediaTrialGraduationStrategy A04;
    public static final MediaTrialGraduationStrategy A05;
    public static final MediaTrialGraduationStrategy A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MediaTrialGraduationStrategy mediaTrialGraduationStrategy = new MediaTrialGraduationStrategy("UNRECOGNIZED", 0, "MediaTrialGraduationStrategy_unspecified");
        A06 = mediaTrialGraduationStrategy;
        MediaTrialGraduationStrategy mediaTrialGraduationStrategy2 = new MediaTrialGraduationStrategy("MANUAL", 1, "manual");
        A04 = mediaTrialGraduationStrategy2;
        MediaTrialGraduationStrategy mediaTrialGraduationStrategy3 = new MediaTrialGraduationStrategy("SS_PERFORMANCE", 2, "ss_performance");
        A05 = mediaTrialGraduationStrategy3;
        MediaTrialGraduationStrategy[] mediaTrialGraduationStrategyArr = {mediaTrialGraduationStrategy, mediaTrialGraduationStrategy2, mediaTrialGraduationStrategy3, new MediaTrialGraduationStrategy("TIME_LIMIT", 3, "time_limit")};
        A03 = mediaTrialGraduationStrategyArr;
        A02 = AbstractC12190kN.A00(mediaTrialGraduationStrategyArr);
        MediaTrialGraduationStrategy[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MediaTrialGraduationStrategy mediaTrialGraduationStrategy4 : values) {
            A18.put(mediaTrialGraduationStrategy4.A00, mediaTrialGraduationStrategy4);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(89);
    }

    public static MediaTrialGraduationStrategy valueOf(String str) {
        return (MediaTrialGraduationStrategy) Enum.valueOf(MediaTrialGraduationStrategy.class, str);
    }

    public static MediaTrialGraduationStrategy[] values() {
        return (MediaTrialGraduationStrategy[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaTrialGraduationStrategy(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
