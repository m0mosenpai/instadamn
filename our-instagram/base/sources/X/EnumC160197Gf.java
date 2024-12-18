package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7Gf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC160197Gf {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC160197Gf[] A02;
    public static final EnumC160197Gf A03;
    public static final EnumC160197Gf A04;
    public static final EnumC160197Gf A05;
    public static final EnumC160197Gf A06;
    public static final EnumC160197Gf A07;
    public static final EnumC160197Gf A08;
    public static final EnumC160197Gf A09;
    public static final EnumC160197Gf A0A;
    public final int A00;

    static {
        EnumC160197Gf enumC160197Gf = new EnumC160197Gf("MENTION", 0, 0);
        A07 = enumC160197Gf;
        EnumC160197Gf enumC160197Gf2 = new EnumC160197Gf("SILENT", 1, 1);
        A0A = enumC160197Gf2;
        EnumC160197Gf enumC160197Gf3 = new EnumC160197Gf("SHOUT", 2, 2);
        A09 = enumC160197Gf3;
        EnumC160197Gf enumC160197Gf4 = new EnumC160197Gf("EVERYONE", 3, 3);
        A04 = enumC160197Gf4;
        EnumC160197Gf enumC160197Gf5 = new EnumC160197Gf("POLL", 4, 4);
        A08 = enumC160197Gf5;
        EnumC160197Gf enumC160197Gf6 = new EnumC160197Gf("AI", 5, 5);
        A03 = enumC160197Gf6;
        EnumC160197Gf enumC160197Gf7 = new EnumC160197Gf("IMAGINE", 6, 6);
        A05 = enumC160197Gf7;
        EnumC160197Gf enumC160197Gf8 = new EnumC160197Gf("IMAGINE_ANIMATE", 7, 101);
        A06 = enumC160197Gf8;
        EnumC160197Gf[] enumC160197GfArr = {enumC160197Gf, enumC160197Gf2, enumC160197Gf3, enumC160197Gf4, enumC160197Gf5, enumC160197Gf6, enumC160197Gf7, enumC160197Gf8, new EnumC160197Gf("IMAGINE_ME", 8, 102)};
        A02 = enumC160197GfArr;
        A01 = AbstractC12190kN.A00(enumC160197GfArr);
    }

    public static EnumC160197Gf valueOf(String str) {
        return (EnumC160197Gf) Enum.valueOf(EnumC160197Gf.class, str);
    }

    public static EnumC160197Gf[] values() {
        return (EnumC160197Gf[]) A02.clone();
    }

    public EnumC160197Gf(String str, int i, int i2) {
        this.A00 = i2;
    }
}
