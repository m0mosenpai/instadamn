package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class MoreInfoSUGPositionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MoreInfoSUGPositionType[] A03;
    public static final MoreInfoSUGPositionType A04;
    public static final MoreInfoSUGPositionType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        MoreInfoSUGPositionType moreInfoSUGPositionType = new MoreInfoSUGPositionType("UNRECOGNIZED", 0, "MoreInfoSUGPositionType_unspecified");
        A05 = moreInfoSUGPositionType;
        MoreInfoSUGPositionType moreInfoSUGPositionType2 = new MoreInfoSUGPositionType("ABOVE_CTA", 1, "above_cta");
        A04 = moreInfoSUGPositionType2;
        MoreInfoSUGPositionType[] moreInfoSUGPositionTypeArr = {moreInfoSUGPositionType, moreInfoSUGPositionType2, new MoreInfoSUGPositionType("FOOTER", 2, "footer")};
        A03 = moreInfoSUGPositionTypeArr;
        A02 = AbstractC12190kN.A00(moreInfoSUGPositionTypeArr);
        MoreInfoSUGPositionType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MoreInfoSUGPositionType moreInfoSUGPositionType3 : values) {
            linkedHashMap.put(moreInfoSUGPositionType3.A00, moreInfoSUGPositionType3);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(54);
    }

    public static MoreInfoSUGPositionType valueOf(String str) {
        return (MoreInfoSUGPositionType) Enum.valueOf(MoreInfoSUGPositionType.class, str);
    }

    public static MoreInfoSUGPositionType[] values() {
        return (MoreInfoSUGPositionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MoreInfoSUGPositionType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
