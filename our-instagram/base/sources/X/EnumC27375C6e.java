package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27375C6e {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27375C6e[] A01;
    public static final EnumC27375C6e A02;
    public static final EnumC27375C6e A03;
    public static final EnumC27375C6e A04;
    public static final EnumC27375C6e A05;

    static {
        EnumC27375C6e enumC27375C6e = new EnumC27375C6e("ERROR", 0);
        A02 = enumC27375C6e;
        EnumC27375C6e enumC27375C6e2 = new EnumC27375C6e("SUCCESS", 1);
        A05 = enumC27375C6e2;
        EnumC27375C6e enumC27375C6e3 = new EnumC27375C6e("LOADING", 2);
        A04 = enumC27375C6e3;
        EnumC27375C6e enumC27375C6e4 = new EnumC27375C6e("INIT", 3);
        A03 = enumC27375C6e4;
        EnumC27375C6e[] enumC27375C6eArr = {enumC27375C6e, enumC27375C6e2, enumC27375C6e3, enumC27375C6e4};
        A01 = enumC27375C6eArr;
        A00 = AbstractC12190kN.A00(enumC27375C6eArr);
    }

    public static EnumC27375C6e valueOf(String str) {
        return (EnumC27375C6e) Enum.valueOf(EnumC27375C6e.class, str);
    }

    public static EnumC27375C6e[] values() {
        return (EnumC27375C6e[]) A01.clone();
    }

    public EnumC27375C6e(String str, int i) {
    }
}
