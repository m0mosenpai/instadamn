package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9s0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222599s0 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222599s0[] A01;
    public static final EnumC222599s0 A02;
    public static final EnumC222599s0 A03;

    static {
        EnumC222599s0 enumC222599s0 = new EnumC222599s0("AKAMAI", 0);
        A02 = enumC222599s0;
        EnumC222599s0 enumC222599s02 = new EnumC222599s0("IGCDN", 1);
        A03 = enumC222599s02;
        EnumC222599s0[] enumC222599s0Arr = {enumC222599s0, enumC222599s02};
        A01 = enumC222599s0Arr;
        A00 = AbstractC12190kN.A00(enumC222599s0Arr);
    }

    public static EnumC222599s0 valueOf(String str) {
        return (EnumC222599s0) Enum.valueOf(EnumC222599s0.class, str);
    }

    public static EnumC222599s0[] values() {
        return (EnumC222599s0[]) A01.clone();
    }

    public EnumC222599s0(String str, int i) {
    }
}
