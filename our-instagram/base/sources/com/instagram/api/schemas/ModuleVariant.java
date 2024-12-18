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
public final class ModuleVariant implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ModuleVariant[] A03;
    public static final ModuleVariant A04;
    public static final ModuleVariant A05;
    public static final ModuleVariant A06;
    public static final ModuleVariant A07;
    public static final ModuleVariant A08;
    public static final ModuleVariant A09;
    public static final ModuleVariant A0A;
    public static final ModuleVariant A0B;
    public static final ModuleVariant A0C;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ModuleVariant moduleVariant = new ModuleVariant("UNRECOGNIZED", 0, "ModuleVariant_unspecified");
        A04 = moduleVariant;
        ModuleVariant moduleVariant2 = new ModuleVariant("VARIANT_A", 1, "VARIANT_A");
        A05 = moduleVariant2;
        ModuleVariant moduleVariant3 = new ModuleVariant("VARIANT_B", 2, "VARIANT_B");
        A06 = moduleVariant3;
        ModuleVariant moduleVariant4 = new ModuleVariant("VARIANT_C", 3, "VARIANT_C");
        A07 = moduleVariant4;
        ModuleVariant moduleVariant5 = new ModuleVariant("VARIANT_D", 4, "VARIANT_D");
        A08 = moduleVariant5;
        ModuleVariant moduleVariant6 = new ModuleVariant("VARIANT_E", 5, "VARIANT_E");
        A09 = moduleVariant6;
        ModuleVariant moduleVariant7 = new ModuleVariant("VARIANT_F", 6, "VARIANT_F");
        A0A = moduleVariant7;
        ModuleVariant moduleVariant8 = new ModuleVariant("VARIANT_H", 7, "VARIANT_H");
        A0B = moduleVariant8;
        ModuleVariant moduleVariant9 = new ModuleVariant("VARIANT_I", 8, "VARIANT_I");
        A0C = moduleVariant9;
        ModuleVariant[] moduleVariantArr = {moduleVariant, moduleVariant2, moduleVariant3, moduleVariant4, moduleVariant5, moduleVariant6, moduleVariant7, moduleVariant8, moduleVariant9, new ModuleVariant("VARIANT_CLIP", 9, "VARIANT_CLIP")};
        A03 = moduleVariantArr;
        A02 = AbstractC12190kN.A00(moduleVariantArr);
        ModuleVariant[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ModuleVariant moduleVariant10 : values) {
            A18.put(moduleVariant10.A00, moduleVariant10);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(2);
    }

    public static ModuleVariant valueOf(String str) {
        return (ModuleVariant) Enum.valueOf(ModuleVariant.class, str);
    }

    public static ModuleVariant[] values() {
        return (ModuleVariant[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ModuleVariant(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
