package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27349C5e {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27349C5e[] A01;
    public static final EnumC27349C5e A02;

    static {
        EnumC27349C5e enumC27349C5e = new EnumC27349C5e("Fixed", 0);
        A02 = enumC27349C5e;
        EnumC27349C5e[] enumC27349C5eArr = {enumC27349C5e, new EnumC27349C5e("Scrollable", 1)};
        A01 = enumC27349C5eArr;
        A00 = AbstractC12190kN.A00(enumC27349C5eArr);
    }

    public static EnumC27349C5e valueOf(String str) {
        return (EnumC27349C5e) Enum.valueOf(EnumC27349C5e.class, str);
    }

    public static EnumC27349C5e[] values() {
        return (EnumC27349C5e[]) A01.clone();
    }

    public EnumC27349C5e(String str, int i) {
    }
}
