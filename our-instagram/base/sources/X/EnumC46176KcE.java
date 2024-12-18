package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46176KcE {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46176KcE[] A01;
    public static final EnumC46176KcE A02;
    public static final EnumC46176KcE A03;
    public static final EnumC46176KcE A04;
    public static final EnumC46176KcE A05;
    public static final EnumC46176KcE A06;
    public static final EnumC46176KcE A07;

    static {
        EnumC46176KcE enumC46176KcE = new EnumC46176KcE("SUCCESS", 0);
        A06 = enumC46176KcE;
        EnumC46176KcE enumC46176KcE2 = new EnumC46176KcE("SUPPRESSED", 1);
        A07 = enumC46176KcE2;
        EnumC46176KcE enumC46176KcE3 = new EnumC46176KcE("ERROR", 2);
        A03 = enumC46176KcE3;
        EnumC46176KcE enumC46176KcE4 = new EnumC46176KcE("CODEGEN_ERROR", 3);
        A02 = enumC46176KcE4;
        EnumC46176KcE enumC46176KcE5 = new EnumC46176KcE("INVALID_MAILBOX", 4);
        A04 = enumC46176KcE5;
        EnumC46176KcE enumC46176KcE6 = new EnumC46176KcE("PROCESSING", 5);
        A05 = enumC46176KcE6;
        EnumC46176KcE[] enumC46176KcEArr = {enumC46176KcE, enumC46176KcE2, enumC46176KcE3, enumC46176KcE4, enumC46176KcE5, enumC46176KcE6};
        A01 = enumC46176KcEArr;
        A00 = AbstractC12190kN.A00(enumC46176KcEArr);
    }

    public static EnumC46176KcE valueOf(String str) {
        return (EnumC46176KcE) Enum.valueOf(EnumC46176KcE.class, str);
    }

    public static EnumC46176KcE[] values() {
        return (EnumC46176KcE[]) A01.clone();
    }

    public EnumC46176KcE(String str, int i) {
    }
}
