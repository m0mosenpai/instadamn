package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46174KcC {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46174KcC[] A01;
    public static final EnumC46174KcC A02;
    public static final EnumC46174KcC A03;
    public static final EnumC46174KcC A04;
    public static final EnumC46174KcC A05;
    public static final EnumC46174KcC A06;
    public static final EnumC46174KcC A07;

    static {
        EnumC46174KcC enumC46174KcC = new EnumC46174KcC("CHANNELS_NULL_STATE_PROMPT1_DARK", 0);
        A02 = enumC46174KcC;
        EnumC46174KcC enumC46174KcC2 = new EnumC46174KcC("CHANNELS_NULL_STATE_PROMPT1_LIGHT", 1);
        A03 = enumC46174KcC2;
        EnumC46174KcC enumC46174KcC3 = new EnumC46174KcC("CHANNELS_NULL_STATE_PROMPT2_DARK", 2);
        A04 = enumC46174KcC3;
        EnumC46174KcC enumC46174KcC4 = new EnumC46174KcC("CHANNELS_NULL_STATE_PROMPT2_LIGHT", 3);
        A05 = enumC46174KcC4;
        EnumC46174KcC enumC46174KcC5 = new EnumC46174KcC("CHANNELS_NULL_STATE_PROMPT3_DARK", 4);
        A06 = enumC46174KcC5;
        EnumC46174KcC enumC46174KcC6 = new EnumC46174KcC("CHANNELS_NULL_STATE_PROMPT3_LIGHT", 5);
        A07 = enumC46174KcC6;
        EnumC46174KcC[] enumC46174KcCArr = {enumC46174KcC, enumC46174KcC2, enumC46174KcC3, enumC46174KcC4, enumC46174KcC5, enumC46174KcC6};
        A01 = enumC46174KcCArr;
        A00 = AbstractC12190kN.A00(enumC46174KcCArr);
    }

    public static EnumC46174KcC valueOf(String str) {
        return (EnumC46174KcC) Enum.valueOf(EnumC46174KcC.class, str);
    }

    public static EnumC46174KcC[] values() {
        return (EnumC46174KcC[]) A01.clone();
    }

    public EnumC46174KcC(String str, int i) {
    }
}
