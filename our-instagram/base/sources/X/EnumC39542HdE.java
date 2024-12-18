package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39542HdE {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39542HdE[] A01;
    public static final EnumC39542HdE A02;
    public static final EnumC39542HdE A03;
    public static final EnumC39542HdE A04;

    public static EnumC39542HdE valueOf(String str) {
        return (EnumC39542HdE) Enum.valueOf(EnumC39542HdE.class, str);
    }

    public static EnumC39542HdE[] values() {
        return (EnumC39542HdE[]) A01.clone();
    }

    static {
        EnumC39542HdE enumC39542HdE = new EnumC39542HdE("PUBLIC", 0);
        A04 = enumC39542HdE;
        EnumC39542HdE enumC39542HdE2 = new EnumC39542HdE("PROTECTED", 1);
        A03 = enumC39542HdE2;
        EnumC39542HdE enumC39542HdE3 = new EnumC39542HdE("INTERNAL", 2);
        A02 = enumC39542HdE3;
        EnumC39542HdE[] enumC39542HdEArr = {enumC39542HdE, enumC39542HdE2, enumC39542HdE3, new EnumC39542HdE("PRIVATE", 3)};
        A01 = enumC39542HdEArr;
        A00 = AbstractC12190kN.A00(enumC39542HdEArr);
    }

    public EnumC39542HdE(String str, int i) {
    }
}
