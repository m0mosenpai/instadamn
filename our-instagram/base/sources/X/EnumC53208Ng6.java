package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ng6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53208Ng6 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53208Ng6[] A02;
    public static final EnumC53208Ng6 A03;
    public static final EnumC53208Ng6 A04;
    public static final EnumC53208Ng6 A05;
    public final String A00;

    static {
        EnumC53208Ng6 enumC53208Ng6 = new EnumC53208Ng6("NORMAL_MODE", 0, "normal");
        A05 = enumC53208Ng6;
        EnumC53208Ng6 enumC53208Ng62 = new EnumC53208Ng6("LOW_MEMORY_MODE", 1, "low");
        A04 = enumC53208Ng62;
        EnumC53208Ng6 enumC53208Ng63 = new EnumC53208Ng6("FALLBACK_MODE", 2, "critical");
        A03 = enumC53208Ng63;
        EnumC53208Ng6[] enumC53208Ng6Arr = {enumC53208Ng6, enumC53208Ng62, enumC53208Ng63};
        A02 = enumC53208Ng6Arr;
        A01 = AbstractC12190kN.A00(enumC53208Ng6Arr);
    }

    public static EnumC53208Ng6 valueOf(String str) {
        return (EnumC53208Ng6) Enum.valueOf(EnumC53208Ng6.class, str);
    }

    public static EnumC53208Ng6[] values() {
        return (EnumC53208Ng6[]) A02.clone();
    }

    public EnumC53208Ng6(String str, int i, String str2) {
        this.A00 = str2;
    }
}
