package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class UpcomingEventIDType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ UpcomingEventIDType[] A03;
    public static final UpcomingEventIDType A04;
    public static final UpcomingEventIDType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        UpcomingEventIDType upcomingEventIDType = new UpcomingEventIDType("UNRECOGNIZED", 0, "UpcomingEventIDType_unspecified");
        A05 = upcomingEventIDType;
        UpcomingEventIDType upcomingEventIDType2 = new UpcomingEventIDType("DROPS_CAMPAIGN", 1, "drops_campaign");
        A04 = upcomingEventIDType2;
        UpcomingEventIDType[] upcomingEventIDTypeArr = {upcomingEventIDType, upcomingEventIDType2, new UpcomingEventIDType("UPCOMING_EVENT", 2, "upcoming_event")};
        A03 = upcomingEventIDTypeArr;
        A02 = AbstractC12190kN.A00(upcomingEventIDTypeArr);
        UpcomingEventIDType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (UpcomingEventIDType upcomingEventIDType3 : values) {
            A18.put(upcomingEventIDType3.A00, upcomingEventIDType3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(75);
    }

    public static UpcomingEventIDType valueOf(String str) {
        return (UpcomingEventIDType) Enum.valueOf(UpcomingEventIDType.class, str);
    }

    public static UpcomingEventIDType[] values() {
        return (UpcomingEventIDType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public UpcomingEventIDType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
