package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27385C6o {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27385C6o[] A01;
    public static final EnumC27385C6o A02;
    public static final EnumC27385C6o A03;
    public static final EnumC27385C6o A04;
    public static final EnumC27385C6o A05;

    static {
        EnumC27385C6o enumC27385C6o = new EnumC27385C6o("LOWEST_PARTIAL_STATE", 0);
        A04 = enumC27385C6o;
        EnumC27385C6o enumC27385C6o2 = new EnumC27385C6o("HIGHEST_PARTIAL_STATE", 1);
        A03 = enumC27385C6o2;
        EnumC27385C6o enumC27385C6o3 = new EnumC27385C6o("PREVIOUS_PARTIAL_STATE", 2);
        A05 = enumC27385C6o3;
        EnumC27385C6o enumC27385C6o4 = new EnumC27385C6o("CLOSED_STATE", 3);
        A02 = enumC27385C6o4;
        EnumC27385C6o[] enumC27385C6oArr = {enumC27385C6o, enumC27385C6o2, enumC27385C6o3, enumC27385C6o4};
        A01 = enumC27385C6oArr;
        A00 = AbstractC12190kN.A00(enumC27385C6oArr);
    }

    public static EnumC27385C6o valueOf(String str) {
        return (EnumC27385C6o) Enum.valueOf(EnumC27385C6o.class, str);
    }

    public static EnumC27385C6o[] values() {
        return (EnumC27385C6o[]) A01.clone();
    }

    public EnumC27385C6o(String str, int i) {
    }
}
