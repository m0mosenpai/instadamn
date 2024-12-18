package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53224NgM {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53224NgM[] A03;
    public static final EnumC53224NgM A04;
    public static final EnumC53224NgM A05;
    public static final EnumC53224NgM A06;
    public final int A00;

    static {
        EnumC53224NgM enumC53224NgM = new EnumC53224NgM("IN_REVIEW", 0, 1);
        A04 = enumC53224NgM;
        EnumC53224NgM enumC53224NgM2 = new EnumC53224NgM("MONETIZED", 1, 2);
        A06 = enumC53224NgM2;
        EnumC53224NgM enumC53224NgM3 = new EnumC53224NgM("LITTLE_TO_NO_MONETIZATION", 2, 3);
        A05 = enumC53224NgM3;
        EnumC53224NgM[] enumC53224NgMArr = {enumC53224NgM, enumC53224NgM2, enumC53224NgM3, new EnumC53224NgM("NO_MONETIZATION", 3, 4)};
        A03 = enumC53224NgMArr;
        A02 = AbstractC12190kN.A00(enumC53224NgMArr);
        EnumC53224NgM[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC53224NgM enumC53224NgM4 : values) {
            AbstractC25227BEk.A1O(enumC53224NgM4, A18, enumC53224NgM4.A00);
        }
        A01 = A18;
    }

    public static EnumC53224NgM valueOf(String str) {
        return (EnumC53224NgM) Enum.valueOf(EnumC53224NgM.class, str);
    }

    public static EnumC53224NgM[] values() {
        return (EnumC53224NgM[]) A03.clone();
    }

    public EnumC53224NgM(String str, int i, int i2) {
        this.A00 = i2;
    }
}
