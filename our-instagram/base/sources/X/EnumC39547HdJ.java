package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39547HdJ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39547HdJ[] A01;
    public static final EnumC39547HdJ A02;
    public static final EnumC39547HdJ A03;
    public static final EnumC39547HdJ A04;
    public static final EnumC39547HdJ A05;
    public static final EnumC39547HdJ A06;

    static {
        EnumC39547HdJ enumC39547HdJ = new EnumC39547HdJ(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC39547HdJ;
        EnumC39547HdJ enumC39547HdJ2 = new EnumC39547HdJ("NOT_INTERESTING", 1);
        A04 = enumC39547HdJ2;
        EnumC39547HdJ enumC39547HdJ3 = new EnumC39547HdJ("NOT_RELEVANT", 2);
        A05 = enumC39547HdJ3;
        EnumC39547HdJ enumC39547HdJ4 = new EnumC39547HdJ("SEE_TOO_OFTEN", 3);
        A06 = enumC39547HdJ4;
        EnumC39547HdJ enumC39547HdJ5 = new EnumC39547HdJ("INAPPROPRIATE", 4);
        A02 = enumC39547HdJ5;
        EnumC39547HdJ[] enumC39547HdJArr = {enumC39547HdJ, enumC39547HdJ2, enumC39547HdJ3, enumC39547HdJ4, enumC39547HdJ5};
        A01 = enumC39547HdJArr;
        A00 = AbstractC12190kN.A00(enumC39547HdJArr);
    }

    public static EnumC39547HdJ valueOf(String str) {
        return (EnumC39547HdJ) Enum.valueOf(EnumC39547HdJ.class, str);
    }

    public static EnumC39547HdJ[] values() {
        return (EnumC39547HdJ[]) A01.clone();
    }

    public EnumC39547HdJ(String str, int i) {
    }
}
