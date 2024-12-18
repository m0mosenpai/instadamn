package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8hE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC193348hE {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC193348hE[] A01;
    public static final EnumC193348hE A02;
    public static final EnumC193348hE A03;
    public static final EnumC193348hE A04;
    public static final EnumC193348hE A05;
    public static final EnumC193348hE A06;

    static {
        EnumC193348hE enumC193348hE = new EnumC193348hE("DEFAULT", 0);
        A04 = enumC193348hE;
        EnumC193348hE enumC193348hE2 = new EnumC193348hE("BLUE", 1);
        A02 = enumC193348hE2;
        EnumC193348hE enumC193348hE3 = new EnumC193348hE("BLUE_BOLD", 2);
        A03 = enumC193348hE3;
        EnumC193348hE enumC193348hE4 = new EnumC193348hE("RED", 3);
        A05 = enumC193348hE4;
        EnumC193348hE enumC193348hE5 = new EnumC193348hE("RED_BOLD", 4);
        A06 = enumC193348hE5;
        EnumC193348hE[] enumC193348hEArr = {enumC193348hE, enumC193348hE2, enumC193348hE3, enumC193348hE4, enumC193348hE5};
        A01 = enumC193348hEArr;
        A00 = AbstractC12190kN.A00(enumC193348hEArr);
    }

    public static EnumC193348hE valueOf(String str) {
        return (EnumC193348hE) Enum.valueOf(EnumC193348hE.class, str);
    }

    public static EnumC193348hE[] values() {
        return (EnumC193348hE[]) A01.clone();
    }

    public EnumC193348hE(String str, int i) {
    }
}
