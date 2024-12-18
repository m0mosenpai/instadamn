package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nei, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53129Nei {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53129Nei[] A01;
    public static final EnumC53129Nei A02;
    public static final EnumC53129Nei A03;
    public static final EnumC53129Nei A04;

    static {
        EnumC53129Nei enumC53129Nei = new EnumC53129Nei("UNKNOWN", 0);
        A04 = enumC53129Nei;
        EnumC53129Nei enumC53129Nei2 = new EnumC53129Nei("INCOMING_RINGING", 1);
        A02 = enumC53129Nei2;
        EnumC53129Nei enumC53129Nei3 = new EnumC53129Nei("IN_CALL", 2);
        A03 = enumC53129Nei3;
        EnumC53129Nei[] enumC53129NeiArr = {enumC53129Nei, enumC53129Nei2, enumC53129Nei3};
        A01 = enumC53129NeiArr;
        A00 = AbstractC12190kN.A00(enumC53129NeiArr);
    }

    public static EnumC53129Nei valueOf(String str) {
        return (EnumC53129Nei) Enum.valueOf(EnumC53129Nei.class, str);
    }

    public static EnumC53129Nei[] values() {
        return (EnumC53129Nei[]) A01.clone();
    }

    public EnumC53129Nei(String str, int i) {
    }
}
