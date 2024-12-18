package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.73w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1571773w {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC1571773w[] A02;
    public static final EnumC1571773w A03;
    public static final EnumC1571773w A04;
    public static final EnumC1571773w A05;
    public final String A00;

    static {
        EnumC1571773w enumC1571773w = new EnumC1571773w("FOLLOWING", 0, "following");
        A03 = enumC1571773w;
        EnumC1571773w enumC1571773w2 = new EnumC1571773w("NOT_FOLLOWING", 1, "not_following");
        A04 = enumC1571773w2;
        EnumC1571773w enumC1571773w3 = new EnumC1571773w("SELF", 2, "self");
        A05 = enumC1571773w3;
        EnumC1571773w[] enumC1571773wArr = {enumC1571773w, enumC1571773w2, enumC1571773w3};
        A02 = enumC1571773wArr;
        A01 = AbstractC12190kN.A00(enumC1571773wArr);
    }

    public static EnumC1571773w valueOf(String str) {
        return (EnumC1571773w) Enum.valueOf(EnumC1571773w.class, str);
    }

    public static EnumC1571773w[] values() {
        return (EnumC1571773w[]) A02.clone();
    }

    public EnumC1571773w(String str, int i, String str2) {
        this.A00 = str2;
    }
}
