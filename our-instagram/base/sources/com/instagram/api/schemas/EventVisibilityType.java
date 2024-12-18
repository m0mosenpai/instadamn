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
public final class EventVisibilityType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EventVisibilityType[] A03;
    public static final EventVisibilityType A04;
    public static final EventVisibilityType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        EventVisibilityType eventVisibilityType = new EventVisibilityType("UNRECOGNIZED", 0, "EventVisibilityType_unspecified");
        A05 = eventVisibilityType;
        EventVisibilityType eventVisibilityType2 = new EventVisibilityType("PRIVATE", 1, "private");
        A04 = eventVisibilityType2;
        EventVisibilityType[] eventVisibilityTypeArr = {eventVisibilityType, eventVisibilityType2, new EventVisibilityType("PUBLIC", 2, "public")};
        A03 = eventVisibilityTypeArr;
        A02 = AbstractC12190kN.A00(eventVisibilityTypeArr);
        EventVisibilityType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EventVisibilityType eventVisibilityType3 : values) {
            A18.put(eventVisibilityType3.A00, eventVisibilityType3);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(76);
    }

    public static EventVisibilityType valueOf(String str) {
        return (EventVisibilityType) Enum.valueOf(EventVisibilityType.class, str);
    }

    public static EventVisibilityType[] values() {
        return (EventVisibilityType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EventVisibilityType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
