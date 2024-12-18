package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27362C5r {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27362C5r[] A01;
    public static final EnumC27362C5r A02;
    public static final EnumC27362C5r A03;

    static {
        EnumC27362C5r enumC27362C5r = new EnumC27362C5r("DEFAULT", 0);
        A02 = enumC27362C5r;
        EnumC27362C5r enumC27362C5r2 = new EnumC27362C5r("EMPHASIZED", 1);
        A03 = enumC27362C5r2;
        EnumC27362C5r[] enumC27362C5rArr = {enumC27362C5r, enumC27362C5r2};
        A01 = enumC27362C5rArr;
        A00 = AbstractC12190kN.A00(enumC27362C5rArr);
    }

    public static EnumC27362C5r valueOf(String str) {
        return (EnumC27362C5r) Enum.valueOf(EnumC27362C5r.class, str);
    }

    public static EnumC27362C5r[] values() {
        return (EnumC27362C5r[]) A01.clone();
    }

    public EnumC27362C5r(String str, int i) {
    }
}
