package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222739sE {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222739sE[] A01;
    public static final EnumC222739sE A02;
    public static final EnumC222739sE A03;
    public static final EnumC222739sE A04;
    public static final EnumC222739sE A05;

    static {
        EnumC222739sE enumC222739sE = new EnumC222739sE("LOADING", 0);
        A04 = enumC222739sE;
        EnumC222739sE enumC222739sE2 = new EnumC222739sE("LOADED", 1);
        A03 = enumC222739sE2;
        EnumC222739sE enumC222739sE3 = new EnumC222739sE("ERROR", 2);
        A02 = enumC222739sE3;
        EnumC222739sE enumC222739sE4 = new EnumC222739sE("UNINITIALIZED", 3);
        A05 = enumC222739sE4;
        EnumC222739sE[] enumC222739sEArr = {enumC222739sE, enumC222739sE2, enumC222739sE3, enumC222739sE4};
        A01 = enumC222739sEArr;
        A00 = AbstractC12190kN.A00(enumC222739sEArr);
    }

    public static EnumC222739sE valueOf(String str) {
        return (EnumC222739sE) Enum.valueOf(EnumC222739sE.class, str);
    }

    public static EnumC222739sE[] values() {
        return (EnumC222739sE[]) A01.clone();
    }

    public EnumC222739sE(String str, int i) {
    }
}
