package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nel, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53132Nel {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53132Nel[] A01;
    public static final EnumC53132Nel A02;
    public static final EnumC53132Nel A03;
    public static final EnumC53132Nel A04;

    static {
        EnumC53132Nel enumC53132Nel = new EnumC53132Nel("LEFT", 0);
        A03 = enumC53132Nel;
        EnumC53132Nel enumC53132Nel2 = new EnumC53132Nel("RIGHT", 1);
        A04 = enumC53132Nel2;
        EnumC53132Nel enumC53132Nel3 = new EnumC53132Nel("CENTER", 2);
        A02 = enumC53132Nel3;
        EnumC53132Nel[] enumC53132NelArr = {enumC53132Nel, enumC53132Nel2, enumC53132Nel3};
        A01 = enumC53132NelArr;
        A00 = AbstractC12190kN.A00(enumC53132NelArr);
    }

    public static EnumC53132Nel valueOf(String str) {
        return (EnumC53132Nel) Enum.valueOf(EnumC53132Nel.class, str);
    }

    public static EnumC53132Nel[] values() {
        return (EnumC53132Nel[]) A01.clone();
    }

    public EnumC53132Nel(String str, int i) {
    }
}
