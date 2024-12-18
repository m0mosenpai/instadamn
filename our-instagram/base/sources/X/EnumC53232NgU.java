package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53232NgU {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53232NgU[] A02;
    public static final EnumC53232NgU A03;
    public static final EnumC53232NgU A04;
    public static final EnumC53232NgU A05;
    public static final EnumC53232NgU A06;
    public static final EnumC53232NgU A07;
    public static final EnumC53232NgU A08;
    public int A00;

    static {
        EnumC53232NgU enumC53232NgU = new EnumC53232NgU(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
        A08 = enumC53232NgU;
        EnumC53232NgU enumC53232NgU2 = new EnumC53232NgU("CHEVRON", 1, 1);
        A04 = enumC53232NgU2;
        EnumC53232NgU enumC53232NgU3 = new EnumC53232NgU("CREATION_ARROW", 2, 2);
        A05 = enumC53232NgU3;
        EnumC53232NgU enumC53232NgU4 = new EnumC53232NgU("DOWN_CHEVRON", 3, 3);
        A07 = enumC53232NgU4;
        EnumC53232NgU enumC53232NgU5 = new EnumC53232NgU("CAMERA_FILLED", 4, 4);
        A03 = enumC53232NgU5;
        EnumC53232NgU enumC53232NgU6 = new EnumC53232NgU("CREATION_ARROW_FILLED", 5, 5);
        A06 = enumC53232NgU6;
        EnumC53232NgU[] enumC53232NgUArr = {enumC53232NgU, enumC53232NgU2, enumC53232NgU3, enumC53232NgU4, enumC53232NgU5, enumC53232NgU6};
        A02 = enumC53232NgUArr;
        A01 = AbstractC12190kN.A00(enumC53232NgUArr);
    }

    public static EnumC53232NgU valueOf(String str) {
        return (EnumC53232NgU) Enum.valueOf(EnumC53232NgU.class, str);
    }

    public static EnumC53232NgU[] values() {
        return (EnumC53232NgU[]) A02.clone();
    }

    public EnumC53232NgU(String str, int i, int i2) {
        this.A00 = i2;
    }
}
