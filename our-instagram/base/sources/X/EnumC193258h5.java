package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8h5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC193258h5 {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC193258h5[] A04;
    public static final EnumC193258h5 A05;
    public static final EnumC193258h5 A06;
    public static final EnumC193258h5 A07;
    public static final EnumC193258h5 A08;
    public static final EnumC193258h5 A09;
    public static final EnumC193258h5 A0A;
    public final int A00;
    public final EnumC193268h6 A01;
    public final String A02;

    static {
        EnumC193258h5 enumC193258h5 = new EnumC193258h5(EnumC193268h6.A07, "XRAY", null, 0, 0);
        A0A = enumC193258h5;
        EnumC193258h5 enumC193258h52 = new EnumC193258h5(EnumC193268h6.A03, "CONCEPTS", null, 1, 1);
        A06 = enumC193258h52;
        EnumC193258h5 enumC193258h53 = new EnumC193258h5(EnumC193268h6.A02, "AESTHETICS", "aesthetic_score", 2, 2);
        A05 = enumC193258h53;
        EnumC193268h6 enumC193268h6 = EnumC193268h6.A06;
        EnumC193258h5 enumC193258h54 = new EnumC193258h5(enumC193268h6, "NUDITY", "nudity_score", 3, 3);
        A08 = enumC193258h54;
        EnumC193258h5 enumC193258h55 = new EnumC193258h5(enumC193268h6, "VIOLENCE", "violence_score", 4, 4);
        A09 = enumC193258h55;
        EnumC193258h5 enumC193258h56 = new EnumC193258h5(EnumC193268h6.A04, "EMBEDDINGS", null, 5, 5);
        A07 = enumC193258h56;
        EnumC193258h5[] enumC193258h5Arr = {enumC193258h5, enumC193258h52, enumC193258h53, enumC193258h54, enumC193258h55, enumC193258h56};
        A04 = enumC193258h5Arr;
        A03 = AbstractC12190kN.A00(enumC193258h5Arr);
    }

    public static EnumC193258h5 valueOf(String str) {
        return (EnumC193258h5) Enum.valueOf(EnumC193258h5.class, str);
    }

    public static EnumC193258h5[] values() {
        return (EnumC193258h5[]) A04.clone();
    }

    public EnumC193258h5(EnumC193268h6 enumC193268h6, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A01 = enumC193268h6;
        this.A02 = str2;
    }
}
