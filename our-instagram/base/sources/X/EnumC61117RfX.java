package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RfX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61117RfX {
    public static final java.util.Set A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61117RfX[] A02;
    public static final EnumC61117RfX A03;
    public static final EnumC61117RfX A04;

    static {
        EnumC61117RfX enumC61117RfX = new EnumC61117RfX("MEMORY", 0);
        A04 = enumC61117RfX;
        EnumC61117RfX enumC61117RfX2 = new EnumC61117RfX("DISK", 1);
        A03 = enumC61117RfX2;
        EnumC61117RfX[] enumC61117RfXArr = {enumC61117RfX, enumC61117RfX2};
        A02 = enumC61117RfXArr;
        A01 = AbstractC12190kN.A00(enumC61117RfXArr);
        A00 = AbstractC16830sb.A07(enumC61117RfX, enumC61117RfX2);
    }

    public static EnumC61117RfX valueOf(String str) {
        return (EnumC61117RfX) Enum.valueOf(EnumC61117RfX.class, str);
    }

    public static EnumC61117RfX[] values() {
        return (EnumC61117RfX[]) A02.clone();
    }

    public EnumC61117RfX(String str, int i) {
    }
}
