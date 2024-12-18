package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33334EoT {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33334EoT[] A01;
    public static final EnumC33334EoT A02;
    public static final EnumC33334EoT A03;
    public static final EnumC33334EoT A04;

    static {
        EnumC33334EoT enumC33334EoT = new EnumC33334EoT("SUCCESS", 0);
        A04 = enumC33334EoT;
        EnumC33334EoT enumC33334EoT2 = new EnumC33334EoT("INITIAL_LOAD", 1);
        A02 = enumC33334EoT2;
        EnumC33334EoT enumC33334EoT3 = new EnumC33334EoT("INITIAL_LOAD_FAILED", 2);
        A03 = enumC33334EoT3;
        EnumC33334EoT[] enumC33334EoTArr = {enumC33334EoT, enumC33334EoT2, enumC33334EoT3};
        A01 = enumC33334EoTArr;
        A00 = AbstractC12190kN.A00(enumC33334EoTArr);
    }

    public static EnumC33334EoT valueOf(String str) {
        return (EnumC33334EoT) Enum.valueOf(EnumC33334EoT.class, str);
    }

    public static EnumC33334EoT[] values() {
        return (EnumC33334EoT[]) A01.clone();
    }

    public EnumC33334EoT(String str, int i) {
    }
}
