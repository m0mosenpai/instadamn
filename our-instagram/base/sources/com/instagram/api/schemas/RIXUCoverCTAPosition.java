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
/* loaded from: classes7.dex */
public final class RIXUCoverCTAPosition implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RIXUCoverCTAPosition[] A03;
    public static final RIXUCoverCTAPosition A04;
    public static final RIXUCoverCTAPosition A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        RIXUCoverCTAPosition rIXUCoverCTAPosition = new RIXUCoverCTAPosition("UNRECOGNIZED", 0, "RIXUCoverCTAPosition_unspecified");
        A05 = rIXUCoverCTAPosition;
        RIXUCoverCTAPosition rIXUCoverCTAPosition2 = new RIXUCoverCTAPosition("END", 1, "end");
        A04 = rIXUCoverCTAPosition2;
        RIXUCoverCTAPosition[] rIXUCoverCTAPositionArr = {rIXUCoverCTAPosition, rIXUCoverCTAPosition2, new RIXUCoverCTAPosition("FRONT", 2, "front")};
        A03 = rIXUCoverCTAPositionArr;
        A02 = AbstractC12190kN.A00(rIXUCoverCTAPositionArr);
        RIXUCoverCTAPosition[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (RIXUCoverCTAPosition rIXUCoverCTAPosition3 : values) {
            A18.put(rIXUCoverCTAPosition3.A00, rIXUCoverCTAPosition3);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(80);
    }

    public static RIXUCoverCTAPosition valueOf(String str) {
        return (RIXUCoverCTAPosition) Enum.valueOf(RIXUCoverCTAPosition.class, str);
    }

    public static RIXUCoverCTAPosition[] values() {
        return (RIXUCoverCTAPosition[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RIXUCoverCTAPosition(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
