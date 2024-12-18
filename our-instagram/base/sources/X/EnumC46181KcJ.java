package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46181KcJ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46181KcJ[] A01;
    public static final EnumC46181KcJ A02;
    public static final EnumC46181KcJ A03;
    public static final EnumC46181KcJ A04;
    public static final EnumC46181KcJ A05;
    public static final EnumC46181KcJ A06;
    public static final EnumC46181KcJ A07;
    public static final EnumC46181KcJ A08;

    static {
        EnumC46181KcJ enumC46181KcJ = new EnumC46181KcJ(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A04 = enumC46181KcJ;
        EnumC46181KcJ enumC46181KcJ2 = new EnumC46181KcJ("PEOPLE", 1);
        A06 = enumC46181KcJ2;
        EnumC46181KcJ enumC46181KcJ3 = new EnumC46181KcJ("PET", 2);
        A07 = enumC46181KcJ3;
        EnumC46181KcJ enumC46181KcJ4 = new EnumC46181KcJ("FOOD", 3);
        A03 = enumC46181KcJ4;
        EnumC46181KcJ enumC46181KcJ5 = new EnumC46181KcJ("SCENIC", 4);
        A08 = enumC46181KcJ5;
        EnumC46181KcJ enumC46181KcJ6 = new EnumC46181KcJ("EVENT", 5);
        A02 = enumC46181KcJ6;
        EnumC46181KcJ enumC46181KcJ7 = new EnumC46181KcJ("OUTDOORS", 6);
        A05 = enumC46181KcJ7;
        EnumC46181KcJ[] enumC46181KcJArr = {enumC46181KcJ, enumC46181KcJ2, enumC46181KcJ3, enumC46181KcJ4, enumC46181KcJ5, enumC46181KcJ6, enumC46181KcJ7};
        A01 = enumC46181KcJArr;
        A00 = AbstractC12190kN.A00(enumC46181KcJArr);
    }

    public static EnumC46181KcJ valueOf(String str) {
        return (EnumC46181KcJ) Enum.valueOf(EnumC46181KcJ.class, str);
    }

    public static EnumC46181KcJ[] values() {
        return (EnumC46181KcJ[]) A01.clone();
    }

    public EnumC46181KcJ(String str, int i) {
    }
}
