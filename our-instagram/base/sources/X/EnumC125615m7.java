package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5m7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC125615m7 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC125615m7[] A01;
    public static final EnumC125615m7 A02;
    public static final EnumC125615m7 A03;
    public static final EnumC125615m7 A04;
    public static final EnumC125615m7 A05;

    static {
        EnumC125615m7 enumC125615m7 = new EnumC125615m7("DEFAULT", 0);
        A03 = enumC125615m7;
        EnumC125615m7 enumC125615m72 = new EnumC125615m7("DEFER_STREAMING", 1);
        A04 = enumC125615m72;
        EnumC125615m7 enumC125615m73 = new EnumC125615m7("CHUNK_STREAMING", 2);
        A02 = enumC125615m73;
        EnumC125615m7 enumC125615m74 = new EnumC125615m7("GRAPHQL", 3);
        A05 = enumC125615m74;
        EnumC125615m7[] enumC125615m7Arr = {enumC125615m7, enumC125615m72, enumC125615m73, enumC125615m74};
        A01 = enumC125615m7Arr;
        A00 = AbstractC12190kN.A00(enumC125615m7Arr);
    }

    public static EnumC125615m7 valueOf(String str) {
        return (EnumC125615m7) Enum.valueOf(EnumC125615m7.class, str);
    }

    public static EnumC125615m7[] values() {
        return (EnumC125615m7[]) A01.clone();
    }

    public EnumC125615m7(String str, int i) {
    }
}
