package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27371C6a {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27371C6a[] A01;
    public static final EnumC27371C6a A02;
    public static final EnumC27371C6a A03;
    public static final EnumC27371C6a A04;

    static {
        EnumC27371C6a enumC27371C6a = new EnumC27371C6a("PRE_GEN", 0);
        A04 = enumC27371C6a;
        EnumC27371C6a enumC27371C6a2 = new EnumC27371C6a("POST_GEN", 1);
        A03 = enumC27371C6a2;
        EnumC27371C6a enumC27371C6a3 = new EnumC27371C6a("DONE", 2);
        A02 = enumC27371C6a3;
        EnumC27371C6a[] enumC27371C6aArr = {enumC27371C6a, enumC27371C6a2, enumC27371C6a3};
        A01 = enumC27371C6aArr;
        A00 = AbstractC12190kN.A00(enumC27371C6aArr);
    }

    public static EnumC27371C6a valueOf(String str) {
        return (EnumC27371C6a) Enum.valueOf(EnumC27371C6a.class, str);
    }

    public static EnumC27371C6a[] values() {
        return (EnumC27371C6a[]) A01.clone();
    }

    public EnumC27371C6a(String str, int i) {
    }
}
