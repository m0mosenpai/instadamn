package X;

import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33382EpF {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33382EpF[] A03;
    public static final EnumC33382EpF A04;
    public static final EnumC33382EpF A05;
    public final String A00;

    static {
        EnumC33382EpF enumC33382EpF = new EnumC33382EpF("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A05 = enumC33382EpF;
        EnumC33382EpF enumC33382EpF2 = new EnumC33382EpF("AUTOPLAY", 1, "AUTOPLAY");
        A04 = enumC33382EpF2;
        EnumC33382EpF[] enumC33382EpFArr = {enumC33382EpF, enumC33382EpF2, new EnumC33382EpF("NO_AUTOPLAY", 2, "NO_AUTOPLAY")};
        A03 = enumC33382EpFArr;
        A02 = AbstractC12190kN.A00(enumC33382EpFArr);
        A01 = AbstractC166987dD.A1G();
        for (EnumC33382EpF enumC33382EpF3 : values()) {
            A01.put(enumC33382EpF3.A00, enumC33382EpF3);
        }
    }

    public static EnumC33382EpF valueOf(String str) {
        return (EnumC33382EpF) Enum.valueOf(EnumC33382EpF.class, str);
    }

    public static EnumC33382EpF[] values() {
        return (EnumC33382EpF[]) A03.clone();
    }

    public EnumC33382EpF(String str, int i, String str2) {
        this.A00 = str2;
    }
}
