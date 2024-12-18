package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27365C5u {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27365C5u[] A01;
    public static final EnumC27365C5u A02;
    public static final EnumC27365C5u A03;

    static {
        EnumC27365C5u enumC27365C5u = new EnumC27365C5u("TABS", 0);
        A03 = enumC27365C5u;
        EnumC27365C5u enumC27365C5u2 = new EnumC27365C5u("INDICATOR", 1);
        A02 = enumC27365C5u2;
        EnumC27365C5u[] enumC27365C5uArr = {enumC27365C5u, enumC27365C5u2};
        A01 = enumC27365C5uArr;
        A00 = AbstractC12190kN.A00(enumC27365C5uArr);
    }

    public static EnumC27365C5u valueOf(String str) {
        return (EnumC27365C5u) Enum.valueOf(EnumC27365C5u.class, str);
    }

    public static EnumC27365C5u[] values() {
        return (EnumC27365C5u[]) A01.clone();
    }

    public EnumC27365C5u(String str, int i) {
    }
}
