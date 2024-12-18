package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39552HdO {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39552HdO[] A01;
    public static final EnumC39552HdO A02;
    public static final EnumC39552HdO A03;
    public static final EnumC39552HdO A04;
    public static final EnumC39552HdO A05;
    public static final EnumC39552HdO A06;
    public static final EnumC39552HdO A07;
    public static final EnumC39552HdO A08;

    static {
        EnumC39552HdO enumC39552HdO = new EnumC39552HdO("VISIBLE", 0);
        A08 = enumC39552HdO;
        EnumC39552HdO enumC39552HdO2 = new EnumC39552HdO("INVISIBLE", 1);
        A04 = enumC39552HdO2;
        EnumC39552HdO enumC39552HdO3 = new EnumC39552HdO("MANAGED", 2);
        A05 = enumC39552HdO3;
        EnumC39552HdO enumC39552HdO4 = new EnumC39552HdO("VIPER", 3);
        A07 = enumC39552HdO4;
        EnumC39552HdO enumC39552HdO5 = new EnumC39552HdO("COMMON", 4);
        A02 = enumC39552HdO5;
        EnumC39552HdO enumC39552HdO6 = new EnumC39552HdO("MESSENGER_THREAD_VIEW_MESSAGES_VPVD", 5);
        A06 = enumC39552HdO6;
        EnumC39552HdO enumC39552HdO7 = new EnumC39552HdO("IG_EXTRA_DATA", 6);
        A03 = enumC39552HdO7;
        EnumC39552HdO[] enumC39552HdOArr = {enumC39552HdO, enumC39552HdO2, enumC39552HdO3, enumC39552HdO4, enumC39552HdO5, enumC39552HdO6, enumC39552HdO7, new EnumC39552HdO("MWA_EXTRA_DATA", 7)};
        A01 = enumC39552HdOArr;
        A00 = AbstractC12190kN.A00(enumC39552HdOArr);
    }

    public static EnumC39552HdO valueOf(String str) {
        return (EnumC39552HdO) Enum.valueOf(EnumC39552HdO.class, str);
    }

    public static EnumC39552HdO[] values() {
        return (EnumC39552HdO[]) A01.clone();
    }

    public EnumC39552HdO(String str, int i) {
    }
}
