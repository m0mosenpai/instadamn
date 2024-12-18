package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kc7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46169Kc7 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46169Kc7[] A01;
    public static final EnumC46169Kc7 A02;
    public static final EnumC46169Kc7 A03;
    public static final EnumC46169Kc7 A04;
    public static final EnumC46169Kc7 A05;
    public static final EnumC46169Kc7 A06;

    static {
        EnumC46169Kc7 enumC46169Kc7 = new EnumC46169Kc7("HOLIDAY", 0);
        A02 = enumC46169Kc7;
        EnumC46169Kc7 enumC46169Kc72 = new EnumC46169Kc7("WEEKDAY", 1);
        A05 = enumC46169Kc72;
        EnumC46169Kc7 enumC46169Kc73 = new EnumC46169Kc7("WEEKEND", 2);
        A06 = enumC46169Kc73;
        EnumC46169Kc7 enumC46169Kc74 = new EnumC46169Kc7("MONTHLY", 3);
        A03 = enumC46169Kc74;
        EnumC46169Kc7 enumC46169Kc75 = new EnumC46169Kc7(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 4);
        A04 = enumC46169Kc75;
        EnumC46169Kc7[] enumC46169Kc7Arr = {enumC46169Kc7, enumC46169Kc72, enumC46169Kc73, enumC46169Kc74, enumC46169Kc75};
        A01 = enumC46169Kc7Arr;
        A00 = AbstractC12190kN.A00(enumC46169Kc7Arr);
    }

    public static EnumC46169Kc7 valueOf(String str) {
        return (EnumC46169Kc7) Enum.valueOf(EnumC46169Kc7.class, str);
    }

    public static EnumC46169Kc7[] values() {
        return (EnumC46169Kc7[]) A01.clone();
    }

    public EnumC46169Kc7(String str, int i) {
    }
}
