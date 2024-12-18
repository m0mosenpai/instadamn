package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27383C6m {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27383C6m[] A01;
    public static final EnumC27383C6m A02;
    public static final EnumC27383C6m A03;
    public static final EnumC27383C6m A04;
    public static final EnumC27383C6m A05;

    static {
        EnumC27383C6m enumC27383C6m = new EnumC27383C6m("INITIAL", 0);
        A02 = enumC27383C6m;
        EnumC27383C6m enumC27383C6m2 = new EnumC27383C6m("SUCCESS", 1);
        A05 = enumC27383C6m2;
        EnumC27383C6m enumC27383C6m3 = new EnumC27383C6m("NETWORK_ERROR", 2);
        A03 = enumC27383C6m3;
        EnumC27383C6m enumC27383C6m4 = new EnumC27383C6m("RATE_LIMITED", 3);
        A04 = enumC27383C6m4;
        EnumC27383C6m[] enumC27383C6mArr = {enumC27383C6m, enumC27383C6m2, enumC27383C6m3, enumC27383C6m4};
        A01 = enumC27383C6mArr;
        A00 = AbstractC12190kN.A00(enumC27383C6mArr);
    }

    public static EnumC27383C6m valueOf(String str) {
        return (EnumC27383C6m) Enum.valueOf(EnumC27383C6m.class, str);
    }

    public static EnumC27383C6m[] values() {
        return (EnumC27383C6m[]) A01.clone();
    }

    public EnumC27383C6m(String str, int i) {
    }
}
