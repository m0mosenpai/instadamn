package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27377C6g {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27377C6g[] A01;
    public static final EnumC27377C6g A02;
    public static final EnumC27377C6g A03;
    public static final EnumC27377C6g A04;
    public static final EnumC27377C6g A05;

    static {
        EnumC27377C6g enumC27377C6g = new EnumC27377C6g("MUTE", 0);
        A03 = enumC27377C6g;
        EnumC27377C6g enumC27377C6g2 = new EnumC27377C6g("REPORT", 1);
        A04 = enumC27377C6g2;
        EnumC27377C6g enumC27377C6g3 = new EnumC27377C6g("VIEW_PROFILE", 2);
        A05 = enumC27377C6g3;
        EnumC27377C6g enumC27377C6g4 = new EnumC27377C6g("DISMISSED_WITHOUT_SELECTION", 3);
        A02 = enumC27377C6g4;
        EnumC27377C6g[] enumC27377C6gArr = {enumC27377C6g, enumC27377C6g2, enumC27377C6g3, enumC27377C6g4};
        A01 = enumC27377C6gArr;
        A00 = AbstractC12190kN.A00(enumC27377C6gArr);
    }

    public static EnumC27377C6g valueOf(String str) {
        return (EnumC27377C6g) Enum.valueOf(EnumC27377C6g.class, str);
    }

    public static EnumC27377C6g[] values() {
        return (EnumC27377C6g[]) A01.clone();
    }

    public EnumC27377C6g(String str, int i) {
    }
}
