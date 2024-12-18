package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eoc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33343Eoc {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33343Eoc[] A01;
    public static final EnumC33343Eoc A02;
    public static final EnumC33343Eoc A03;
    public static final EnumC33343Eoc A04;
    public static final EnumC33343Eoc A05;

    static {
        EnumC33343Eoc enumC33343Eoc = new EnumC33343Eoc("Error", 0);
        A02 = enumC33343Eoc;
        EnumC33343Eoc enumC33343Eoc2 = new EnumC33343Eoc("Loading", 1);
        A04 = enumC33343Eoc2;
        EnumC33343Eoc enumC33343Eoc3 = new EnumC33343Eoc("Success", 2);
        A05 = enumC33343Eoc3;
        EnumC33343Eoc enumC33343Eoc4 = new EnumC33343Eoc("Idle", 3);
        A03 = enumC33343Eoc4;
        EnumC33343Eoc[] enumC33343EocArr = {enumC33343Eoc, enumC33343Eoc2, enumC33343Eoc3, enumC33343Eoc4};
        A01 = enumC33343EocArr;
        A00 = AbstractC12190kN.A00(enumC33343EocArr);
    }

    public static EnumC33343Eoc valueOf(String str) {
        return (EnumC33343Eoc) Enum.valueOf(EnumC33343Eoc.class, str);
    }

    public static EnumC33343Eoc[] values() {
        return (EnumC33343Eoc[]) A01.clone();
    }

    public EnumC33343Eoc(String str, int i) {
    }
}
