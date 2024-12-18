package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NjZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53384NjZ implements InterfaceC120325cX {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53384NjZ[] A02;
    public static final EnumC53384NjZ A03;
    public static final EnumC53384NjZ A04;
    public static final EnumC53384NjZ A05;
    public static final EnumC53384NjZ A06;
    public static final EnumC53384NjZ A07;
    public static final EnumC53384NjZ A08;
    public final String A00;

    static {
        EnumC53384NjZ enumC53384NjZ = new EnumC53384NjZ("FLASH", 0, "flash");
        A05 = enumC53384NjZ;
        EnumC53384NjZ enumC53384NjZ2 = new EnumC53384NjZ("LEAK", 1, "leak");
        A06 = enumC53384NjZ2;
        EnumC53384NjZ enumC53384NjZ3 = new EnumC53384NjZ("PHOTOSTRIP", 2, "photostrip");
        A07 = enumC53384NjZ3;
        EnumC53384NjZ enumC53384NjZ4 = new EnumC53384NjZ("FILMROLL", 3, "filmroll");
        A03 = enumC53384NjZ4;
        EnumC53384NjZ enumC53384NjZ5 = new EnumC53384NjZ("FILMROLL_BW", 4, "filmroll_bw");
        A04 = enumC53384NjZ5;
        EnumC53384NjZ enumC53384NjZ6 = new EnumC53384NjZ("VHS", 5, "vhs");
        A08 = enumC53384NjZ6;
        EnumC53384NjZ[] enumC53384NjZArr = {enumC53384NjZ, enumC53384NjZ2, enumC53384NjZ3, enumC53384NjZ4, enumC53384NjZ5, enumC53384NjZ6};
        A02 = enumC53384NjZArr;
        A01 = AbstractC12190kN.A00(enumC53384NjZArr);
    }

    public static EnumC53384NjZ valueOf(String str) {
        return (EnumC53384NjZ) Enum.valueOf(EnumC53384NjZ.class, str);
    }

    public static EnumC53384NjZ[] values() {
        return (EnumC53384NjZ[]) A02.clone();
    }

    @Override // X.InterfaceC120325cX
    public final String getId() {
        return this.A00;
    }

    public EnumC53384NjZ(String str, int i, String str2) {
        this.A00 = str2;
    }
}
