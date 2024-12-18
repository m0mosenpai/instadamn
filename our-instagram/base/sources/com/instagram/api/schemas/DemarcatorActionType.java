package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DemarcatorActionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DemarcatorActionType[] A03;
    public static final DemarcatorActionType A04;
    public static final DemarcatorActionType A05;
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
        DemarcatorActionType demarcatorActionType = new DemarcatorActionType("UNRECOGNIZED", 0, "DemarcatorActionType_unspecified");
        A05 = demarcatorActionType;
        DemarcatorActionType demarcatorActionType2 = new DemarcatorActionType("HOME", 1, "home");
        A04 = demarcatorActionType2;
        DemarcatorActionType[] demarcatorActionTypeArr = {demarcatorActionType, demarcatorActionType2, new DemarcatorActionType("MANAGE_FAVORITES_LIST", 2, "manage_favorites")};
        A03 = demarcatorActionTypeArr;
        A02 = AbstractC12190kN.A00(demarcatorActionTypeArr);
        DemarcatorActionType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (DemarcatorActionType demarcatorActionType3 : values) {
            linkedHashMap.put(demarcatorActionType3.A00, demarcatorActionType3);
        }
        A01 = linkedHashMap;
        CREATOR = new C41854Ig8(60);
    }

    public static DemarcatorActionType valueOf(String str) {
        return (DemarcatorActionType) Enum.valueOf(DemarcatorActionType.class, str);
    }

    public static DemarcatorActionType[] values() {
        return (DemarcatorActionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public DemarcatorActionType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
