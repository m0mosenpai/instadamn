package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223049sj {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC223049sj[] A04;
    public static final EnumC223049sj A05;
    public static final EnumC223049sj A06;
    public static final EnumC223049sj A07;
    public static final EnumC223049sj A08;
    public static final EnumC223049sj A09;
    public static final EnumC223049sj A0A;
    public final int A00;
    public final EnumC193268h6 A01;
    public final String A02;

    static {
        EnumC223049sj enumC223049sj = new EnumC223049sj(EnumC193268h6.A07, "XRAY", null, 0, 0);
        A0A = enumC223049sj;
        EnumC223049sj enumC223049sj2 = new EnumC223049sj(EnumC193268h6.A03, "CONCEPTS", null, 1, 1);
        A06 = enumC223049sj2;
        EnumC193268h6 enumC193268h6 = EnumC193268h6.A06;
        EnumC223049sj enumC223049sj3 = new EnumC223049sj(enumC193268h6, "NUDITY", "nudity_score", 2, 3);
        A08 = enumC223049sj3;
        EnumC223049sj enumC223049sj4 = new EnumC223049sj(enumC193268h6, "VIOLENCE", "violence_score", 3, 4);
        A09 = enumC223049sj4;
        EnumC223049sj enumC223049sj5 = new EnumC223049sj(EnumC193268h6.A02, "AESTHETICS", "aesthetic_score", 4, 5);
        A05 = enumC223049sj5;
        EnumC223049sj enumC223049sj6 = new EnumC223049sj(EnumC193268h6.A04, "EMBEDDINGS", null, 5, 6);
        A07 = enumC223049sj6;
        EnumC223049sj[] enumC223049sjArr = {enumC223049sj, enumC223049sj2, enumC223049sj3, enumC223049sj4, enumC223049sj5, enumC223049sj6};
        A04 = enumC223049sjArr;
        A03 = AbstractC12190kN.A00(enumC223049sjArr);
    }

    public static EnumC223049sj valueOf(String str) {
        return (EnumC223049sj) Enum.valueOf(EnumC223049sj.class, str);
    }

    public static EnumC223049sj[] values() {
        return (EnumC223049sj[]) A04.clone();
    }

    public EnumC223049sj(EnumC193268h6 enumC193268h6, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A01 = enumC193268h6;
        this.A02 = str2;
    }
}
