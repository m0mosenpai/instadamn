package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33391EpO {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33391EpO[] A02;
    public static final EnumC33391EpO A03;
    public static final EnumC33391EpO A04;
    public static final EnumC33391EpO A05;
    public static final EnumC33391EpO A06;
    public final int A00;

    public static EnumC33391EpO valueOf(String str) {
        return (EnumC33391EpO) Enum.valueOf(EnumC33391EpO.class, str);
    }

    public static EnumC33391EpO[] values() {
        return (EnumC33391EpO[]) A02.clone();
    }

    static {
        EnumC33391EpO enumC33391EpO = new EnumC33391EpO(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 2131952445);
        A04 = enumC33391EpO;
        EnumC33391EpO enumC33391EpO2 = new EnumC33391EpO("DAILY", 1, 2131952442);
        A03 = enumC33391EpO2;
        EnumC33391EpO enumC33391EpO3 = new EnumC33391EpO("TWICE_A_WEEK", 2, 2131952455);
        A06 = enumC33391EpO3;
        EnumC33391EpO enumC33391EpO4 = new EnumC33391EpO("THRICE_A_WEEK", 3, 2131952452);
        A05 = enumC33391EpO4;
        EnumC33391EpO[] enumC33391EpOArr = {enumC33391EpO, enumC33391EpO2, enumC33391EpO3, enumC33391EpO4};
        A02 = enumC33391EpOArr;
        A01 = AbstractC12190kN.A00(enumC33391EpOArr);
    }

    public EnumC33391EpO(String str, int i, int i2) {
        this.A00 = i2;
    }
}
