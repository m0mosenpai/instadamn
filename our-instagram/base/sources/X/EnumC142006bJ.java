package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6bJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC142006bJ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC142006bJ[] A01;
    public static final EnumC142006bJ A02;
    public static final EnumC142006bJ A03;
    public static final EnumC142006bJ A04;
    public static final EnumC142006bJ A05;
    public static final EnumC142006bJ A06;

    static {
        EnumC142006bJ enumC142006bJ = new EnumC142006bJ(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A05 = enumC142006bJ;
        EnumC142006bJ enumC142006bJ2 = new EnumC142006bJ("SQUARE", 1);
        A06 = enumC142006bJ2;
        EnumC142006bJ enumC142006bJ3 = new EnumC142006bJ("CIRCULAR", 2);
        A03 = enumC142006bJ3;
        EnumC142006bJ enumC142006bJ4 = new EnumC142006bJ("AVATAR", 3);
        A02 = enumC142006bJ4;
        EnumC142006bJ enumC142006bJ5 = new EnumC142006bJ("ICON", 4);
        A04 = enumC142006bJ5;
        EnumC142006bJ[] enumC142006bJArr = {enumC142006bJ, enumC142006bJ2, enumC142006bJ3, enumC142006bJ4, enumC142006bJ5};
        A01 = enumC142006bJArr;
        A00 = AbstractC12190kN.A00(enumC142006bJArr);
    }

    public static EnumC142006bJ valueOf(String str) {
        return (EnumC142006bJ) Enum.valueOf(EnumC142006bJ.class, str);
    }

    public static EnumC142006bJ[] values() {
        return (EnumC142006bJ[]) A01.clone();
    }

    public EnumC142006bJ(String str, int i) {
    }
}
