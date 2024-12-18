package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3d3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC77173d3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC77173d3[] A01;
    public static final EnumC77173d3 A02;
    public static final EnumC77173d3 A03;

    static {
        EnumC77173d3 enumC77173d3 = new EnumC77173d3("LIKED", 0);
        A02 = enumC77173d3;
        EnumC77173d3 enumC77173d32 = new EnumC77173d3("NOT_LIKED", 1);
        A03 = enumC77173d32;
        EnumC77173d3[] enumC77173d3Arr = {enumC77173d3, enumC77173d32};
        A01 = enumC77173d3Arr;
        A00 = AbstractC12190kN.A00(enumC77173d3Arr);
    }

    public static EnumC77173d3 valueOf(String str) {
        return (EnumC77173d3) Enum.valueOf(EnumC77173d3.class, str);
    }

    public static EnumC77173d3[] values() {
        return (EnumC77173d3[]) A01.clone();
    }

    public EnumC77173d3(String str, int i) {
    }
}
