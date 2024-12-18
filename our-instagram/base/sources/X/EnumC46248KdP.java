package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KdP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46248KdP {
    public static final Map A03;
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC46248KdP[] A05;
    public static final EnumC46248KdP A06;
    public static final EnumC46248KdP A07;
    public static final EnumC46248KdP A08;
    public static final EnumC46248KdP A09;
    public static final EnumC46248KdP A0A;
    public static final EnumC46248KdP A0B;
    public static final EnumC46248KdP A0C;
    public final int A00;
    public final Integer A01;
    public final String A02;

    public final boolean A00(C2EC c2ec) {
        C14360o3.A0B(c2ec, 0);
        if (c2ec.BLF() == 0) {
            return false;
        }
        int ordinal = ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal == 6) {
                            return c2ec.CMC();
                        }
                        return false;
                    }
                    return c2ec.CUM();
                }
                return c2ec.CQx();
            }
            return c2ec.CS3();
        }
        return AbstractC31177DnL.A1b(((C81663kb) c2ec).A01.A1c);
    }

    static {
        EnumC46248KdP enumC46248KdP = new EnumC46248KdP("STORY_REPLIES", null, 0, 0, null);
        A0A = enumC46248KdP;
        EnumC46248KdP enumC46248KdP2 = new EnumC46248KdP("NON_STORY_REPLIES", null, 1, 1, null);
        A09 = enumC46248KdP2;
        EnumC46248KdP enumC46248KdP3 = new EnumC46248KdP("VERIFIED", "verified", 2, 2, 2131960050);
        A0C = enumC46248KdP3;
        EnumC46248KdP enumC46248KdP4 = new EnumC46248KdP("CREATOR", "creator", 3, 3, 2131960047);
        A07 = enumC46248KdP4;
        EnumC46248KdP enumC46248KdP5 = new EnumC46248KdP("BUSINESS", "business", 4, 4, 2131960046);
        A06 = enumC46248KdP5;
        EnumC46248KdP enumC46248KdP6 = new EnumC46248KdP("SUBSCRIBER", "subscriber", 5, 5, 2131960049);
        A0B = enumC46248KdP6;
        EnumC46248KdP enumC46248KdP7 = new EnumC46248KdP("CREATOR_AI", "creator_ai", 6, 7, 2131960048);
        A08 = enumC46248KdP7;
        EnumC46248KdP[] enumC46248KdPArr = {enumC46248KdP, enumC46248KdP2, enumC46248KdP3, enumC46248KdP4, enumC46248KdP5, enumC46248KdP6, enumC46248KdP7};
        A05 = enumC46248KdPArr;
        A04 = AbstractC12190kN.A00(enumC46248KdPArr);
        EnumC46248KdP[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC46248KdP enumC46248KdP8 : values) {
            AbstractC25227BEk.A1O(enumC46248KdP8, A18, enumC46248KdP8.A00);
        }
        A03 = A18;
    }

    public static EnumC46248KdP valueOf(String str) {
        return (EnumC46248KdP) Enum.valueOf(EnumC46248KdP.class, str);
    }

    public static EnumC46248KdP[] values() {
        return (EnumC46248KdP[]) A05.clone();
    }

    public EnumC46248KdP(String str, String str2, int i, int i2, Integer num) {
        this.A00 = i2;
        this.A01 = num;
        this.A02 = str2;
    }
}
