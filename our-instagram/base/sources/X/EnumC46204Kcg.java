package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46204Kcg {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC46204Kcg[] A02;
    public static final EnumC46204Kcg A03;
    public static final EnumC46204Kcg A04;
    public static final EnumC46204Kcg A05;
    public static final EnumC46204Kcg A06;
    public static final EnumC46204Kcg A07;
    public static final EnumC46204Kcg A08;
    public static final EnumC46204Kcg A09;
    public static final EnumC46204Kcg A0A;
    public final int A00;

    static {
        EnumC46204Kcg enumC46204Kcg = new EnumC46204Kcg("SUCCESS", 0, 0);
        A09 = enumC46204Kcg;
        EnumC46204Kcg enumC46204Kcg2 = new EnumC46204Kcg("NO_SESSION_ERROR", 1, -1);
        A06 = enumC46204Kcg2;
        EnumC46204Kcg enumC46204Kcg3 = new EnumC46204Kcg("WRONG_CODE_ERROR", 2, -2);
        A0A = enumC46204Kcg3;
        EnumC46204Kcg enumC46204Kcg4 = new EnumC46204Kcg("MAX_ATTEMPTS_REACHED_ERROR", 3, -3);
        A05 = enumC46204Kcg4;
        EnumC46204Kcg enumC46204Kcg5 = new EnumC46204Kcg("SESSION_EXPIRED_ERROR", 4, -4);
        A07 = enumC46204Kcg5;
        EnumC46204Kcg enumC46204Kcg6 = new EnumC46204Kcg("CPACE_ERROR", 5, -5);
        A03 = enumC46204Kcg6;
        EnumC46204Kcg enumC46204Kcg7 = new EnumC46204Kcg("SESSION_INVALIDATED_ERROR", 6, -6);
        A08 = enumC46204Kcg7;
        EnumC46204Kcg enumC46204Kcg8 = new EnumC46204Kcg("GENERIC_ERROR", 7, -7);
        A04 = enumC46204Kcg8;
        EnumC46204Kcg[] enumC46204KcgArr = {enumC46204Kcg, enumC46204Kcg2, enumC46204Kcg3, enumC46204Kcg4, enumC46204Kcg5, enumC46204Kcg6, enumC46204Kcg7, enumC46204Kcg8};
        A02 = enumC46204KcgArr;
        A01 = AbstractC12190kN.A00(enumC46204KcgArr);
    }

    public static EnumC46204Kcg valueOf(String str) {
        return (EnumC46204Kcg) Enum.valueOf(EnumC46204Kcg.class, str);
    }

    public static EnumC46204Kcg[] values() {
        return (EnumC46204Kcg[]) A02.clone();
    }

    public EnumC46204Kcg(String str, int i, int i2) {
        this.A00 = i2;
    }
}
