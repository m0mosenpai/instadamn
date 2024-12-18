package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.87r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1825287r {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC1825287r[] A01;
    public static final EnumC1825287r A02;
    public static final EnumC1825287r A03;

    static {
        EnumC1825287r enumC1825287r = new EnumC1825287r("OPEN", 0);
        A03 = enumC1825287r;
        EnumC1825287r enumC1825287r2 = new EnumC1825287r("CLOSED", 1);
        A02 = enumC1825287r2;
        EnumC1825287r[] enumC1825287rArr = {enumC1825287r, enumC1825287r2};
        A01 = enumC1825287rArr;
        A00 = AbstractC12190kN.A00(enumC1825287rArr);
    }

    public static EnumC1825287r valueOf(String str) {
        return (EnumC1825287r) Enum.valueOf(EnumC1825287r.class, str);
    }

    public static EnumC1825287r[] values() {
        return (EnumC1825287r[]) A01.clone();
    }

    public EnumC1825287r(String str, int i) {
    }
}
