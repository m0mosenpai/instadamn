package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CreationToolEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CreationToolEnum[] A03;
    public static final CreationToolEnum A04;
    public static final CreationToolEnum A05;
    public static final CreationToolEnum A06;
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
        CreationToolEnum creationToolEnum = new CreationToolEnum("UNRECOGNIZED", 0, "CreationToolEnum_unspecified");
        A05 = creationToolEnum;
        CreationToolEnum creationToolEnum2 = new CreationToolEnum("CAPTIONS", 1, "captions");
        A04 = creationToolEnum2;
        CreationToolEnum creationToolEnum3 = new CreationToolEnum("VOICEOVER", 2, "voiceover");
        A06 = creationToolEnum3;
        CreationToolEnum[] creationToolEnumArr = {creationToolEnum, creationToolEnum2, creationToolEnum3};
        A03 = creationToolEnumArr;
        A02 = AbstractC12190kN.A00(creationToolEnumArr);
        CreationToolEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (CreationToolEnum creationToolEnum4 : values) {
            linkedHashMap.put(creationToolEnum4.A00, creationToolEnum4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(82);
    }

    public static CreationToolEnum valueOf(String str) {
        return (CreationToolEnum) Enum.valueOf(CreationToolEnum.class, str);
    }

    public static CreationToolEnum[] values() {
        return (CreationToolEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CreationToolEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
