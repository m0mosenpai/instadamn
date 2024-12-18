package X;

import java.util.HashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RgI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61157RgI {
    public static final HashMap A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC61157RgI[] A03;
    public static final EnumC61157RgI A04;
    public static final EnumC61157RgI A05;
    public static final EnumC61157RgI A06;
    public final byte A00;

    static {
        EnumC61157RgI enumC61157RgI = new EnumC61157RgI("BASE", (byte) 0, 0);
        A05 = enumC61157RgI;
        EnumC61157RgI enumC61157RgI2 = new EnumC61157RgI("PSK", (byte) 1, 1);
        A06 = enumC61157RgI2;
        EnumC61157RgI enumC61157RgI3 = new EnumC61157RgI("AUTH", (byte) 2, 2);
        A04 = enumC61157RgI3;
        EnumC61157RgI[] enumC61157RgIArr = {enumC61157RgI, enumC61157RgI2, enumC61157RgI3, new EnumC61157RgI("AUTH_PSK", (byte) 3, 3)};
        A03 = enumC61157RgIArr;
        C020508b<EnumC61157RgI> A00 = AbstractC12190kN.A00(enumC61157RgIArr);
        A02 = A00;
        A01 = AbstractC166987dD.A1G();
        for (EnumC61157RgI enumC61157RgI4 : A00) {
            A01.put(Byte.valueOf(enumC61157RgI4.A00), enumC61157RgI4);
        }
    }

    public static EnumC61157RgI valueOf(String str) {
        return (EnumC61157RgI) Enum.valueOf(EnumC61157RgI.class, str);
    }

    public static EnumC61157RgI[] values() {
        return (EnumC61157RgI[]) A03.clone();
    }

    public EnumC61157RgI(String str, byte b, int i) {
        this.A00 = b;
    }
}
