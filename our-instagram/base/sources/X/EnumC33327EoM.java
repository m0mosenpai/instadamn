package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33327EoM {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33327EoM[] A01;
    public static final EnumC33327EoM A02;
    public static final EnumC33327EoM A03;

    static {
        EnumC33327EoM enumC33327EoM = new EnumC33327EoM("SEARCH", 0);
        A03 = enumC33327EoM;
        EnumC33327EoM enumC33327EoM2 = new EnumC33327EoM("NO_RESULTS", 1);
        A02 = enumC33327EoM2;
        EnumC33327EoM[] enumC33327EoMArr = {enumC33327EoM, enumC33327EoM2};
        A01 = enumC33327EoMArr;
        A00 = AbstractC12190kN.A00(enumC33327EoMArr);
    }

    public static EnumC33327EoM valueOf(String str) {
        return (EnumC33327EoM) Enum.valueOf(EnumC33327EoM.class, str);
    }

    public static EnumC33327EoM[] values() {
        return (EnumC33327EoM[]) A01.clone();
    }

    public EnumC33327EoM(String str, int i) {
    }
}
