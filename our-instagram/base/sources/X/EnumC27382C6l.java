package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27382C6l {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27382C6l[] A01;
    public static final EnumC27382C6l A02;
    public static final EnumC27382C6l A03;
    public static final EnumC27382C6l A04;
    public static final EnumC27382C6l A05;

    static {
        EnumC27382C6l enumC27382C6l = new EnumC27382C6l("INITIAL", 0);
        A03 = enumC27382C6l;
        EnumC27382C6l enumC27382C6l2 = new EnumC27382C6l("LOADING", 1);
        A04 = enumC27382C6l2;
        EnumC27382C6l enumC27382C6l3 = new EnumC27382C6l("SUCCESS", 2);
        A05 = enumC27382C6l3;
        EnumC27382C6l enumC27382C6l4 = new EnumC27382C6l("ERROR", 3);
        A02 = enumC27382C6l4;
        EnumC27382C6l[] enumC27382C6lArr = {enumC27382C6l, enumC27382C6l2, enumC27382C6l3, enumC27382C6l4};
        A01 = enumC27382C6lArr;
        A00 = AbstractC12190kN.A00(enumC27382C6lArr);
    }

    public static EnumC27382C6l valueOf(String str) {
        return (EnumC27382C6l) Enum.valueOf(EnumC27382C6l.class, str);
    }

    public static EnumC27382C6l[] values() {
        return (EnumC27382C6l[]) A01.clone();
    }

    public EnumC27382C6l(String str, int i) {
    }
}
