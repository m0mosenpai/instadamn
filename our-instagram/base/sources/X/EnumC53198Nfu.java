package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53198Nfu {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53198Nfu[] A02;
    public static final EnumC53198Nfu A03;
    public static final EnumC53198Nfu A04;
    public final int A00;

    static {
        EnumC53198Nfu enumC53198Nfu = new EnumC53198Nfu("AUDIO", 0, 0);
        A03 = enumC53198Nfu;
        EnumC53198Nfu enumC53198Nfu2 = new EnumC53198Nfu("VIDEO", 1, 1);
        A04 = enumC53198Nfu2;
        EnumC53198Nfu[] enumC53198NfuArr = {enumC53198Nfu, enumC53198Nfu2};
        A02 = enumC53198NfuArr;
        A01 = AbstractC12190kN.A00(enumC53198NfuArr);
    }

    public static EnumC53198Nfu valueOf(String str) {
        return (EnumC53198Nfu) Enum.valueOf(EnumC53198Nfu.class, str);
    }

    public static EnumC53198Nfu[] values() {
        return (EnumC53198Nfu[]) A02.clone();
    }

    public EnumC53198Nfu(String str, int i, int i2) {
        this.A00 = i2;
    }
}
