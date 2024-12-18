package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nh5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53267Nh5 {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC53267Nh5[] A04;
    public static final EnumC53267Nh5 A05;
    public static final EnumC53267Nh5 A06;
    public final int A00;
    public final int A01;
    public final Integer A02;

    public static EnumC53267Nh5 valueOf(String str) {
        return (EnumC53267Nh5) Enum.valueOf(EnumC53267Nh5.class, str);
    }

    public static EnumC53267Nh5[] values() {
        return (EnumC53267Nh5[]) A04.clone();
    }

    static {
        EnumC53267Nh5 enumC53267Nh5 = new EnumC53267Nh5(2131965021, "STANDARD", 0, 2131965023, 2131965022);
        A06 = enumC53267Nh5;
        EnumC53267Nh5 enumC53267Nh52 = new EnumC53267Nh5(null, "CUSTOM", 1, 2131965017, 2131965016);
        A05 = enumC53267Nh52;
        EnumC53267Nh5[] enumC53267Nh5Arr = {enumC53267Nh5, enumC53267Nh52};
        A04 = enumC53267Nh5Arr;
        A03 = AbstractC12190kN.A00(enumC53267Nh5Arr);
    }

    public EnumC53267Nh5(Integer num, String str, int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = num;
    }
}
