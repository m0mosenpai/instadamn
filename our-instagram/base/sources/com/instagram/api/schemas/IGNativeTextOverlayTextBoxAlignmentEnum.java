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
public final class IGNativeTextOverlayTextBoxAlignmentEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGNativeTextOverlayTextBoxAlignmentEnum[] A03;
    public static final IGNativeTextOverlayTextBoxAlignmentEnum A04;
    public static final IGNativeTextOverlayTextBoxAlignmentEnum A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGNativeTextOverlayTextBoxAlignmentEnum iGNativeTextOverlayTextBoxAlignmentEnum = new IGNativeTextOverlayTextBoxAlignmentEnum("UNRECOGNIZED", 0, "IGNativeTextOverlayTextBoxAlignmentEnum_unspecified");
        A05 = iGNativeTextOverlayTextBoxAlignmentEnum;
        IGNativeTextOverlayTextBoxAlignmentEnum iGNativeTextOverlayTextBoxAlignmentEnum2 = new IGNativeTextOverlayTextBoxAlignmentEnum("ABSOLUTE", 1, "ABSOLUTE");
        A04 = iGNativeTextOverlayTextBoxAlignmentEnum2;
        IGNativeTextOverlayTextBoxAlignmentEnum[] iGNativeTextOverlayTextBoxAlignmentEnumArr = {iGNativeTextOverlayTextBoxAlignmentEnum, iGNativeTextOverlayTextBoxAlignmentEnum2, new IGNativeTextOverlayTextBoxAlignmentEnum("RELATIVE", 2, "RELATIVE")};
        A03 = iGNativeTextOverlayTextBoxAlignmentEnumArr;
        A02 = AbstractC12190kN.A00(iGNativeTextOverlayTextBoxAlignmentEnumArr);
        IGNativeTextOverlayTextBoxAlignmentEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGNativeTextOverlayTextBoxAlignmentEnum iGNativeTextOverlayTextBoxAlignmentEnum3 : values) {
            A18.put(iGNativeTextOverlayTextBoxAlignmentEnum3.A00, iGNativeTextOverlayTextBoxAlignmentEnum3);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(45);
    }

    public static IGNativeTextOverlayTextBoxAlignmentEnum valueOf(String str) {
        return (IGNativeTextOverlayTextBoxAlignmentEnum) Enum.valueOf(IGNativeTextOverlayTextBoxAlignmentEnum.class, str);
    }

    public static IGNativeTextOverlayTextBoxAlignmentEnum[] values() {
        return (IGNativeTextOverlayTextBoxAlignmentEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGNativeTextOverlayTextBoxAlignmentEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
