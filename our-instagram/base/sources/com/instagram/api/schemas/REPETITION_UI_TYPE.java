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
public final class REPETITION_UI_TYPE implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ REPETITION_UI_TYPE[] A03;
    public static final REPETITION_UI_TYPE A04;
    public static final REPETITION_UI_TYPE A05;
    public static final REPETITION_UI_TYPE A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        REPETITION_UI_TYPE repetition_ui_type = new REPETITION_UI_TYPE("UNRECOGNIZED", 0, "REPETITION_UI_TYPE_unspecified");
        A06 = repetition_ui_type;
        REPETITION_UI_TYPE repetition_ui_type2 = new REPETITION_UI_TYPE("LIGHTWEIGHT", 1, "lightweight");
        A04 = repetition_ui_type2;
        REPETITION_UI_TYPE repetition_ui_type3 = new REPETITION_UI_TYPE("MEDIUM", 2, "medium");
        A05 = repetition_ui_type3;
        REPETITION_UI_TYPE[] repetition_ui_typeArr = {repetition_ui_type, repetition_ui_type2, repetition_ui_type3};
        A03 = repetition_ui_typeArr;
        A02 = AbstractC12190kN.A00(repetition_ui_typeArr);
        REPETITION_UI_TYPE[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (REPETITION_UI_TYPE repetition_ui_type4 : values) {
            A18.put(repetition_ui_type4.A00, repetition_ui_type4);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(79);
    }

    public static REPETITION_UI_TYPE valueOf(String str) {
        return (REPETITION_UI_TYPE) Enum.valueOf(REPETITION_UI_TYPE.class, str);
    }

    public static REPETITION_UI_TYPE[] values() {
        return (REPETITION_UI_TYPE[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public REPETITION_UI_TYPE(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
