package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27363C5s {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27363C5s[] A01;
    public static final EnumC27363C5s A02;
    public static final EnumC27363C5s A03;

    static {
        EnumC27363C5s enumC27363C5s = new EnumC27363C5s("LEFT", 0);
        A03 = enumC27363C5s;
        EnumC27363C5s enumC27363C5s2 = new EnumC27363C5s("CENTER_OVERRIDE_DONOTUSE", 1);
        A02 = enumC27363C5s2;
        EnumC27363C5s[] enumC27363C5sArr = {enumC27363C5s, enumC27363C5s2};
        A01 = enumC27363C5sArr;
        A00 = AbstractC12190kN.A00(enumC27363C5sArr);
    }

    public static EnumC27363C5s valueOf(String str) {
        return (EnumC27363C5s) Enum.valueOf(EnumC27363C5s.class, str);
    }

    public static EnumC27363C5s[] values() {
        return (EnumC27363C5s[]) A01.clone();
    }

    public EnumC27363C5s(String str, int i) {
    }
}
