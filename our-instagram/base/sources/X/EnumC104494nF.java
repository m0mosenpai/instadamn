package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4nF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC104494nF {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC104494nF[] A01;
    public static final EnumC104494nF A02;
    public static final EnumC104494nF A03;
    public static final EnumC104494nF A04;

    static {
        EnumC104494nF enumC104494nF = new EnumC104494nF("TEST", 0);
        A04 = enumC104494nF;
        EnumC104494nF enumC104494nF2 = new EnumC104494nF("EXPLORE_TAIL_LOAD_DECISION_MAKER", 1);
        A02 = enumC104494nF2;
        EnumC104494nF enumC104494nF3 = new EnumC104494nF("MAINFEED_TAIL_LOAD_DECISION_MAKER", 2);
        A03 = enumC104494nF3;
        EnumC104494nF[] enumC104494nFArr = {enumC104494nF, enumC104494nF2, enumC104494nF3};
        A01 = enumC104494nFArr;
        A00 = AbstractC12190kN.A00(enumC104494nFArr);
    }

    public static EnumC104494nF valueOf(String str) {
        return (EnumC104494nF) Enum.valueOf(EnumC104494nF.class, str);
    }

    public static EnumC104494nF[] values() {
        return (EnumC104494nF[]) A01.clone();
    }

    public EnumC104494nF(String str, int i) {
    }
}
