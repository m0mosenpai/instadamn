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
/* loaded from: classes7.dex */
public final class BoostedComponentMessageType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BoostedComponentMessageType[] A03;
    public static final BoostedComponentMessageType A04;
    public static final BoostedComponentMessageType A05;
    public static final BoostedComponentMessageType A06;
    public static final BoostedComponentMessageType A07;
    public static final BoostedComponentMessageType A08;
    public static final BoostedComponentMessageType A09;
    public static final BoostedComponentMessageType A0A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BoostedComponentMessageType boostedComponentMessageType = new BoostedComponentMessageType("UNRECOGNIZED", 0, "BoostedComponentMessageType_unspecified");
        A0A = boostedComponentMessageType;
        BoostedComponentMessageType boostedComponentMessageType2 = new BoostedComponentMessageType("ACTIVE_FEEDBACK", 1, "ACTIVE_FEEDBACK");
        A04 = boostedComponentMessageType2;
        BoostedComponentMessageType boostedComponentMessageType3 = new BoostedComponentMessageType("BLOCKING_TIP", 2, "BLOCKING_TIP");
        A05 = boostedComponentMessageType3;
        BoostedComponentMessageType boostedComponentMessageType4 = new BoostedComponentMessageType("CONFIRMATION", 3, "CONFIRMATION");
        A06 = boostedComponentMessageType4;
        BoostedComponentMessageType boostedComponentMessageType5 = new BoostedComponentMessageType("ERROR", 4, "ERROR");
        A07 = boostedComponentMessageType5;
        BoostedComponentMessageType boostedComponentMessageType6 = new BoostedComponentMessageType("POLICY_UPDATE", 5, "POLICY_UPDATE");
        A08 = boostedComponentMessageType6;
        BoostedComponentMessageType boostedComponentMessageType7 = new BoostedComponentMessageType("TIP", 6, "TIP");
        A09 = boostedComponentMessageType7;
        BoostedComponentMessageType[] boostedComponentMessageTypeArr = {boostedComponentMessageType, boostedComponentMessageType2, boostedComponentMessageType3, boostedComponentMessageType4, boostedComponentMessageType5, boostedComponentMessageType6, boostedComponentMessageType7, new BoostedComponentMessageType("WARNING", 7, "WARNING")};
        A03 = boostedComponentMessageTypeArr;
        A02 = AbstractC12190kN.A00(boostedComponentMessageTypeArr);
        BoostedComponentMessageType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (BoostedComponentMessageType boostedComponentMessageType8 : values) {
            A18.put(boostedComponentMessageType8.A00, boostedComponentMessageType8);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(75);
    }

    public static BoostedComponentMessageType valueOf(String str) {
        return (BoostedComponentMessageType) Enum.valueOf(BoostedComponentMessageType.class, str);
    }

    public static BoostedComponentMessageType[] values() {
        return (BoostedComponentMessageType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BoostedComponentMessageType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
