package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4Es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC92974Es {
    public static final EnumC92974Es A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC92974Es[] A03;
    public static final EnumC92974Es A04;
    public static final EnumC92974Es A05;
    public static final EnumC92974Es A06;
    public static final EnumC92974Es A07;
    public static final EnumC92974Es A08;
    public static final EnumC92974Es A09;
    public static final EnumC92974Es A0A;
    public final String A00;

    static {
        EnumC92974Es enumC92974Es = new EnumC92974Es("UNSET", 0, "UNSET");
        A0A = enumC92974Es;
        EnumC92974Es enumC92974Es2 = new EnumC92974Es("PRIVATE", 1, "ONLY_OWNER");
        A09 = enumC92974Es2;
        EnumC92974Es enumC92974Es3 = new EnumC92974Es("MUTUAL_FOLLOWS", 2, "MUTUAL_FOLLOWS");
        A08 = enumC92974Es3;
        EnumC92974Es enumC92974Es4 = new EnumC92974Es("CLOSE_FRIENDS", 3, "BESTIES");
        A06 = enumC92974Es4;
        EnumC92974Es enumC92974Es5 = new EnumC92974Es("ALLOWLIST", 4, "ALLOWLIST");
        A04 = enumC92974Es5;
        EnumC92974Es enumC92974Es6 = new EnumC92974Es("BLOCKLIST", 5, "BLOCKLIST");
        A05 = enumC92974Es6;
        EnumC92974Es enumC92974Es7 = new EnumC92974Es("INTERNAL", 6, "INTERNAL");
        A07 = enumC92974Es7;
        EnumC92974Es[] enumC92974EsArr = {enumC92974Es, enumC92974Es2, enumC92974Es3, enumC92974Es4, enumC92974Es5, enumC92974Es6, enumC92974Es7};
        A03 = enumC92974EsArr;
        A02 = AbstractC12190kN.A00(enumC92974EsArr);
        A01 = enumC92974Es3;
    }

    public static EnumC92974Es valueOf(String str) {
        return (EnumC92974Es) Enum.valueOf(EnumC92974Es.class, str);
    }

    public static EnumC92974Es[] values() {
        return (EnumC92974Es[]) A03.clone();
    }

    public EnumC92974Es(String str, int i, String str2) {
        this.A00 = str2;
    }
}
