package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27360C5p {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27360C5p[] A01;
    public static final EnumC27360C5p A02;
    public static final EnumC27360C5p A03;

    static {
        EnumC27360C5p enumC27360C5p = new EnumC27360C5p("LEFT", 0);
        A02 = enumC27360C5p;
        EnumC27360C5p enumC27360C5p2 = new EnumC27360C5p("RIGHT", 1);
        A03 = enumC27360C5p2;
        EnumC27360C5p[] enumC27360C5pArr = {enumC27360C5p, enumC27360C5p2};
        A01 = enumC27360C5pArr;
        A00 = AbstractC12190kN.A00(enumC27360C5pArr);
    }

    public static EnumC27360C5p valueOf(String str) {
        return (EnumC27360C5p) Enum.valueOf(EnumC27360C5p.class, str);
    }

    public static EnumC27360C5p[] values() {
        return (EnumC27360C5p[]) A01.clone();
    }

    public EnumC27360C5p(String str, int i) {
    }
}
