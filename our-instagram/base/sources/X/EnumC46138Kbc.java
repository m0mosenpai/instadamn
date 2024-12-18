package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46138Kbc {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46138Kbc[] A01;
    public static final EnumC46138Kbc A02;
    public static final EnumC46138Kbc A03;

    static {
        EnumC46138Kbc enumC46138Kbc = new EnumC46138Kbc("AwaitInput", 0);
        A02 = enumC46138Kbc;
        EnumC46138Kbc enumC46138Kbc2 = new EnumC46138Kbc("Loading", 1);
        A03 = enumC46138Kbc2;
        EnumC46138Kbc[] enumC46138KbcArr = {enumC46138Kbc, enumC46138Kbc2};
        A01 = enumC46138KbcArr;
        A00 = AbstractC12190kN.A00(enumC46138KbcArr);
    }

    public static EnumC46138Kbc valueOf(String str) {
        return (EnumC46138Kbc) Enum.valueOf(EnumC46138Kbc.class, str);
    }

    public static EnumC46138Kbc[] values() {
        return (EnumC46138Kbc[]) A01.clone();
    }

    public EnumC46138Kbc(String str, int i) {
    }
}
