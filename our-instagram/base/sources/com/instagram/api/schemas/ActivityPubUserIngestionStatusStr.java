package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ActivityPubUserIngestionStatusStr implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ActivityPubUserIngestionStatusStr[] A03;
    public static final ActivityPubUserIngestionStatusStr A04;
    public static final ActivityPubUserIngestionStatusStr A05;
    public static final ActivityPubUserIngestionStatusStr A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ActivityPubUserIngestionStatusStr activityPubUserIngestionStatusStr = new ActivityPubUserIngestionStatusStr("UNRECOGNIZED", 0, "ActivityPubUserIngestionStatusStr_unspecified");
        A06 = activityPubUserIngestionStatusStr;
        ActivityPubUserIngestionStatusStr activityPubUserIngestionStatusStr2 = new ActivityPubUserIngestionStatusStr("COMPLETED", 1, "completed");
        A04 = activityPubUserIngestionStatusStr2;
        ActivityPubUserIngestionStatusStr activityPubUserIngestionStatusStr3 = new ActivityPubUserIngestionStatusStr("IN_PROGRESS", 2, "in_progress");
        A05 = activityPubUserIngestionStatusStr3;
        ActivityPubUserIngestionStatusStr[] activityPubUserIngestionStatusStrArr = {activityPubUserIngestionStatusStr, activityPubUserIngestionStatusStr2, activityPubUserIngestionStatusStr3, new ActivityPubUserIngestionStatusStr("NOT_INGESTED", 3, "not_ingested")};
        A03 = activityPubUserIngestionStatusStrArr;
        A02 = AbstractC12190kN.A00(activityPubUserIngestionStatusStrArr);
        ActivityPubUserIngestionStatusStr[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ActivityPubUserIngestionStatusStr activityPubUserIngestionStatusStr4 : values) {
            A18.put(activityPubUserIngestionStatusStr4.A00, activityPubUserIngestionStatusStr4);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(34);
    }

    public static ActivityPubUserIngestionStatusStr valueOf(String str) {
        return (ActivityPubUserIngestionStatusStr) Enum.valueOf(ActivityPubUserIngestionStatusStr.class, str);
    }

    public static ActivityPubUserIngestionStatusStr[] values() {
        return (ActivityPubUserIngestionStatusStr[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ActivityPubUserIngestionStatusStr(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
