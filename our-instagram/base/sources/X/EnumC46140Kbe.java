package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46140Kbe {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46140Kbe[] A01;
    public static final EnumC46140Kbe A02;
    public static final EnumC46140Kbe A03;

    static {
        EnumC46140Kbe enumC46140Kbe = new EnumC46140Kbe("ON", 0);
        A03 = enumC46140Kbe;
        EnumC46140Kbe enumC46140Kbe2 = new EnumC46140Kbe("OFF", 1);
        A02 = enumC46140Kbe2;
        EnumC46140Kbe[] enumC46140KbeArr = {enumC46140Kbe, enumC46140Kbe2};
        A01 = enumC46140KbeArr;
        A00 = AbstractC12190kN.A00(enumC46140KbeArr);
    }

    public static EnumC46140Kbe valueOf(String str) {
        return (EnumC46140Kbe) Enum.valueOf(EnumC46140Kbe.class, str);
    }

    public static EnumC46140Kbe[] values() {
        return (EnumC46140Kbe[]) A01.clone();
    }

    public EnumC46140Kbe(String str, int i) {
    }
}
