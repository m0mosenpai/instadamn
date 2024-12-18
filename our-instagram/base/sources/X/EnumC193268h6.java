package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8h6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC193268h6 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC193268h6[] A01;
    public static final EnumC193268h6 A02;
    public static final EnumC193268h6 A03;
    public static final EnumC193268h6 A04;
    public static final EnumC193268h6 A05;
    public static final EnumC193268h6 A06;
    public static final EnumC193268h6 A07;

    static {
        EnumC193268h6 enumC193268h6 = new EnumC193268h6("XRAY_SCORES", 0);
        A07 = enumC193268h6;
        EnumC193268h6 enumC193268h62 = new EnumC193268h6("CONCEPT_SCORES", 1);
        A03 = enumC193268h62;
        EnumC193268h6 enumC193268h63 = new EnumC193268h6("AESTHETICS_SCORES", 2);
        A02 = enumC193268h63;
        EnumC193268h6 enumC193268h64 = new EnumC193268h6("OFFENSIVE_SCORES", 3);
        A06 = enumC193268h64;
        EnumC193268h6 enumC193268h65 = new EnumC193268h6("OCCLUSION", 4);
        A05 = enumC193268h65;
        EnumC193268h6 enumC193268h66 = new EnumC193268h6("EMBEDDINGS", 5);
        A04 = enumC193268h66;
        EnumC193268h6[] enumC193268h6Arr = {enumC193268h6, enumC193268h62, enumC193268h63, enumC193268h64, enumC193268h65, enumC193268h66, new EnumC193268h6("VISUAL_EMBEDDINGS", 6)};
        A01 = enumC193268h6Arr;
        A00 = AbstractC12190kN.A00(enumC193268h6Arr);
    }

    public static EnumC193268h6 valueOf(String str) {
        return (EnumC193268h6) Enum.valueOf(EnumC193268h6.class, str);
    }

    public static EnumC193268h6[] values() {
        return (EnumC193268h6[]) A01.clone();
    }

    public EnumC193268h6(String str, int i) {
    }
}
