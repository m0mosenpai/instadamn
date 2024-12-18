package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46150Kbo {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46150Kbo[] A01;
    public static final EnumC46150Kbo A02;
    public static final EnumC46150Kbo A03;
    public static final EnumC46150Kbo A04;

    static {
        EnumC46150Kbo enumC46150Kbo = new EnumC46150Kbo("Loading", 0);
        A02 = enumC46150Kbo;
        EnumC46150Kbo enumC46150Kbo2 = new EnumC46150Kbo("OneTimeCode", 1);
        A04 = enumC46150Kbo2;
        EnumC46150Kbo enumC46150Kbo3 = new EnumC46150Kbo("NoOtherRestoreMethodsAvailable", 2);
        A03 = enumC46150Kbo3;
        EnumC46150Kbo[] enumC46150KboArr = {enumC46150Kbo, enumC46150Kbo2, enumC46150Kbo3};
        A01 = enumC46150KboArr;
        A00 = AbstractC12190kN.A00(enumC46150KboArr);
    }

    public static EnumC46150Kbo valueOf(String str) {
        return (EnumC46150Kbo) Enum.valueOf(EnumC46150Kbo.class, str);
    }

    public static EnumC46150Kbo[] values() {
        return (EnumC46150Kbo[]) A01.clone();
    }

    public EnumC46150Kbo(String str, int i) {
    }
}
