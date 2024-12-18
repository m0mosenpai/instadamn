package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC142806cg {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC142806cg[] A02;
    public static final EnumC142806cg A03;
    public static final EnumC142806cg A04;
    public static final EnumC142806cg A05;
    public final String A00;

    static {
        EnumC142806cg enumC142806cg = new EnumC142806cg("BROADCASTER", 0, "host");
        A03 = enumC142806cg;
        EnumC142806cg enumC142806cg2 = new EnumC142806cg("VIEWER", 1, "viewer");
        A05 = enumC142806cg2;
        EnumC142806cg enumC142806cg3 = new EnumC142806cg("GUEST", 2, "guest");
        A04 = enumC142806cg3;
        EnumC142806cg[] enumC142806cgArr = {enumC142806cg, enumC142806cg2, enumC142806cg3};
        A02 = enumC142806cgArr;
        A01 = AbstractC12190kN.A00(enumC142806cgArr);
    }

    public static EnumC142806cg valueOf(String str) {
        return (EnumC142806cg) Enum.valueOf(EnumC142806cg.class, str);
    }

    public static EnumC142806cg[] values() {
        return (EnumC142806cg[]) A02.clone();
    }

    public EnumC142806cg(String str, int i, String str2) {
        this.A00 = str2;
    }
}
