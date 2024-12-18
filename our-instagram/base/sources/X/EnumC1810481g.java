package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.81g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1810481g {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC1810481g[] A01;
    public static final EnumC1810481g A02;
    public static final EnumC1810481g A03;

    static {
        EnumC1810481g enumC1810481g = new EnumC1810481g("CURATION", 0);
        A02 = enumC1810481g;
        EnumC1810481g enumC1810481g2 = new EnumC1810481g("EDITING", 1);
        A03 = enumC1810481g2;
        EnumC1810481g[] enumC1810481gArr = {enumC1810481g, enumC1810481g2};
        A01 = enumC1810481gArr;
        A00 = AbstractC12190kN.A00(enumC1810481gArr);
    }

    public static EnumC1810481g valueOf(String str) {
        return (EnumC1810481g) Enum.valueOf(EnumC1810481g.class, str);
    }

    public static EnumC1810481g[] values() {
        return (EnumC1810481g[]) A01.clone();
    }

    public EnumC1810481g(String str, int i) {
    }
}
