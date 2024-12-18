package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kc4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46166Kc4 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46166Kc4[] A01;
    public static final EnumC46166Kc4 A02;
    public static final EnumC46166Kc4 A03;
    public static final EnumC46166Kc4 A04;
    public static final EnumC46166Kc4 A05;
    public static final EnumC46166Kc4 A06;

    static {
        EnumC46166Kc4 enumC46166Kc4 = new EnumC46166Kc4("Unknown", 0);
        A06 = enumC46166Kc4;
        EnumC46166Kc4 enumC46166Kc42 = new EnumC46166Kc4("Loading", 1);
        A05 = enumC46166Kc42;
        EnumC46166Kc4 enumC46166Kc43 = new EnumC46166Kc4("Exists", 2);
        A03 = enumC46166Kc43;
        EnumC46166Kc4 enumC46166Kc44 = new EnumC46166Kc4("DoesNotExist", 3);
        A02 = enumC46166Kc44;
        EnumC46166Kc4 enumC46166Kc45 = new EnumC46166Kc4("FetchError", 4);
        A04 = enumC46166Kc45;
        EnumC46166Kc4[] enumC46166Kc4Arr = {enumC46166Kc4, enumC46166Kc42, enumC46166Kc43, enumC46166Kc44, enumC46166Kc45};
        A01 = enumC46166Kc4Arr;
        A00 = AbstractC12190kN.A00(enumC46166Kc4Arr);
    }

    public static EnumC46166Kc4 valueOf(String str) {
        return (EnumC46166Kc4) Enum.valueOf(EnumC46166Kc4.class, str);
    }

    public static EnumC46166Kc4[] values() {
        return (EnumC46166Kc4[]) A01.clone();
    }

    public EnumC46166Kc4(String str, int i) {
    }
}
