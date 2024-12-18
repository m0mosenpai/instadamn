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
public final class StatusType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StatusType[] A03;
    public static final StatusType A04;
    public static final StatusType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StatusType statusType = new StatusType("UNRECOGNIZED", 0, "StatusType_unspecified");
        A05 = statusType;
        StatusType statusType2 = new StatusType("AUTO", 1, "auto");
        A04 = statusType2;
        StatusType[] statusTypeArr = {statusType, statusType2, new StatusType("MANUAL", 2, "manual")};
        A03 = statusTypeArr;
        A02 = AbstractC12190kN.A00(statusTypeArr);
        StatusType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (StatusType statusType3 : values) {
            A18.put(statusType3.A00, statusType3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(10);
    }

    public static StatusType valueOf(String str) {
        return (StatusType) Enum.valueOf(StatusType.class, str);
    }

    public static StatusType[] values() {
        return (StatusType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StatusType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
