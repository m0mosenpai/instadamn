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
public final class SubmittedSubPostManageType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ SubmittedSubPostManageType[] A03;
    public static final SubmittedSubPostManageType A04;
    public static final SubmittedSubPostManageType A05;
    public static final SubmittedSubPostManageType A06;
    public static final SubmittedSubPostManageType A07;
    public static final SubmittedSubPostManageType A08;
    public static final SubmittedSubPostManageType A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        SubmittedSubPostManageType submittedSubPostManageType = new SubmittedSubPostManageType("UNRECOGNIZED", 0, "SubmittedSubPostManageType_unspecified");
        A09 = submittedSubPostManageType;
        SubmittedSubPostManageType submittedSubPostManageType2 = new SubmittedSubPostManageType("ACCEPT", 1, "accept");
        A04 = submittedSubPostManageType2;
        SubmittedSubPostManageType submittedSubPostManageType3 = new SubmittedSubPostManageType("DELETE", 2, "delete");
        A07 = submittedSubPostManageType3;
        SubmittedSubPostManageType submittedSubPostManageType4 = new SubmittedSubPostManageType("DELETE_ALL_FROM_VIEWER", 3, "delete_all_from_viewer");
        A08 = submittedSubPostManageType4;
        SubmittedSubPostManageType submittedSubPostManageType5 = new SubmittedSubPostManageType("BULK_DELETE_FROM_AUTHOR", 4, "bulk_delete_from_author");
        A06 = submittedSubPostManageType5;
        SubmittedSubPostManageType submittedSubPostManageType6 = new SubmittedSubPostManageType("BULK_ACCEPT", 5, "bulk_accept");
        A05 = submittedSubPostManageType6;
        SubmittedSubPostManageType[] submittedSubPostManageTypeArr = {submittedSubPostManageType, submittedSubPostManageType2, submittedSubPostManageType3, submittedSubPostManageType4, submittedSubPostManageType5, submittedSubPostManageType6};
        A03 = submittedSubPostManageTypeArr;
        A02 = AbstractC12190kN.A00(submittedSubPostManageTypeArr);
        SubmittedSubPostManageType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (SubmittedSubPostManageType submittedSubPostManageType7 : values) {
            A18.put(submittedSubPostManageType7.A00, submittedSubPostManageType7);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(39);
    }

    public static SubmittedSubPostManageType valueOf(String str) {
        return (SubmittedSubPostManageType) Enum.valueOf(SubmittedSubPostManageType.class, str);
    }

    public static SubmittedSubPostManageType[] values() {
        return (SubmittedSubPostManageType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public SubmittedSubPostManageType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
