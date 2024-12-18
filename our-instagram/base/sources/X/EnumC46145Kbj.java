package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46145Kbj {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46145Kbj[] A01;
    public static final EnumC46145Kbj A02;
    public static final EnumC46145Kbj A03;
    public static final EnumC46145Kbj A04;

    static {
        EnumC46145Kbj enumC46145Kbj = new EnumC46145Kbj("PRE_LAUNCH", 0);
        A04 = enumC46145Kbj;
        EnumC46145Kbj enumC46145Kbj2 = new EnumC46145Kbj("LAUNCH", 1);
        A03 = enumC46145Kbj2;
        EnumC46145Kbj enumC46145Kbj3 = new EnumC46145Kbj("AUTO_MIGRATION", 2);
        A02 = enumC46145Kbj3;
        EnumC46145Kbj[] enumC46145KbjArr = {enumC46145Kbj, enumC46145Kbj2, enumC46145Kbj3};
        A01 = enumC46145KbjArr;
        A00 = AbstractC12190kN.A00(enumC46145KbjArr);
    }

    public static EnumC46145Kbj valueOf(String str) {
        return (EnumC46145Kbj) Enum.valueOf(EnumC46145Kbj.class, str);
    }

    public static EnumC46145Kbj[] values() {
        return (EnumC46145Kbj[]) A01.clone();
    }

    public EnumC46145Kbj(String str, int i) {
    }
}
